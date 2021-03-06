package co.com.metrocuadrado.webservice.base;

import java.rmi.RemoteException;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import co.com.metrocuadrado.webservice.client.WscargaMasivaImagenes;
import co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesLocator;
import co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesSoap;
import co.com.metrocuadrado.webservice.model.Publicacion;
import co.com.metrocuadrado.webservice.util.HashGenerator;

import common.Logger;

/**
 * 
 * @author Jaime Alfredo Bonilla Perez jaimebp@gmail.com
 */

public abstract class ImageUploader {

	private static final Logger LOGGER = Logger.getLogger(ImageUploader.class);
	
	/**
	 * 
	 */
	private Publicacion current;
	private static final String SEMILLA = "eltiempo.com";
	private static final String CONTENEDOR = "inmuebles";
	private static final String OPERACION = "C";
	private static final Integer PORTAL = 1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ceet.m2.cargadorxml.base.ImageUploader#getCarga()
	 */

	protected Publicacion getCarga() {
		if (current == null) {
			current = new Publicacion();
			current.setContenedor(CONTENEDOR);
			current.setOperacion(OPERACION);
			current.setIdPortal(PORTAL);
			current.setFecha(new Date());
			current.setTransformar(Boolean.TRUE);
			current.setXmlDatos("<Registros xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
					+ "  <Registro>\n"
					+ "    <IdPublicacion>\n"
					+ "      100005\n"
					+ "    </IdPublicacion>\n"
					+ "    <IdSecuencia>\n"
					+ "      1\n"
					+ "    </IdSecuencia>\n"
					+ "    <URL>http://1.bp.blogspot.com/_EZ16vWYvHHg/TVBOPt9Q5GI/AAAAAAAAW9Y/Ki4EVDI5W4M/s1600/www.BancodeImagenesGratuitas.com%2B-mauritius-island-%2BIsla%2BMauricio.jpg</URL>\n"
					+ "  </Registro>\n"
					+ "  <Registro>\n"
					+ "    <IdPublicacion>\n"
					+ "      1000876\n"
					+ "    </IdPublicacion>\n"
					+ "    <IdSecuencia>\n"
					+ "      1\n"
					+ "    </IdSecuencia>\n"
					+ "    <URL>http://4.bp.blogspot.com/_EZ16vWYvHHg/S-Bkb02W4_I/AAAAAAAAMIs/IZTcdgBJ5Js/s1600/www.BancodeImagenesGratuitas.com-Fantasticas-6.jpg</URL>\n"
					+ "  </Registro>\n" + "  \n" + "</Registros>");

		}
		return current;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ceet.m2.cargadorxml.base.ImageUploader#uploadData()
	 */

	protected void uploadData(){

		getCarga().setFecha(new Date());
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm");
		String strFecha = sdf.format(getCarga().getFecha());
		String strToken = getCarga().getIdPortal() + strFecha + SEMILLA;
		getCarga().setToken(HashGenerator.getStringMessageDigest(strToken,HashGenerator.SHA512));
		String answer;
		long start = System.currentTimeMillis();
		WscargaMasivaImagenes service = new WscargaMasivaImagenesLocator();
		WscargaMasivaImagenesSoap soap;
		try {
			soap = service.getWscargaMasivaImagenesSoap();
			System.setProperty("sun.net.client.defaultConnectTimeout", "1000000000");
			System.setProperty("sun.net.client.defaultReadTimeout", "1000000000");
			answer = soap.redimensionarImagenesOnline(getCarga().getIdPortal()
					.toString(), strFecha, getCarga().getToken(), getCarga()
					.getOperacion(), getCarga().getXmlDatos(), getCarga()
					.getContenedor());
			long end = System.currentTimeMillis();
			getCarga().setResponse("Fecha " + strFecha + " Total ejecucion: " + (end - start)/ 1000 + " segundos, Respuesta: ");
			getCarga().setResponse(getCarga().getResponse() + answer);
		} catch (ServiceException e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
