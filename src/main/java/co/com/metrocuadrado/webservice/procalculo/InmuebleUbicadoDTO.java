/**
 * InmuebleUbicadoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.metrocuadrado.webservice.procalculo;

public class InmuebleUbicadoDTO  implements java.io.Serializable {
    private java.lang.String barrio;

    private java.lang.String codigo;

    private java.lang.String direccionEstandar;

    private java.lang.String direccionOriginal;

    private java.lang.Integer estrato;

    private java.util.Calendar fecha;

    private java.lang.Integer idCiudad;

    private java.math.BigDecimal idInmuebleUbicado;

    private java.lang.Integer idSector;

    private java.lang.Integer idZona;

    private java.lang.String municipio;

    private java.lang.String municipioOriginal;

    private java.lang.Double score;

    private java.lang.String sector;

    private java.lang.String tipoDeUbicacion;

    private java.lang.Double x;

    private java.lang.Double y;

    private java.lang.String zona;
    
    private java.lang.String mensajeRespuesta;

    public InmuebleUbicadoDTO() {
    }

    public InmuebleUbicadoDTO(
           java.lang.String barrio,
           java.lang.String codigo,
           java.lang.String direccionEstandar,
           java.lang.String direccionOriginal,
           java.lang.Integer estrato,
           java.util.Calendar fecha,
           java.lang.Integer idCiudad,
           java.math.BigDecimal idInmuebleUbicado,
           java.lang.Integer idSector,
           java.lang.Integer idZona,
           java.lang.String municipio,
           java.lang.String municipioOriginal,
           java.lang.Double score,
           java.lang.String sector,
           java.lang.String tipoDeUbicacion,
           java.lang.Double x,
           java.lang.Double y,
           java.lang.String zona) {
           this.barrio = barrio;
           this.codigo = codigo;
           this.direccionEstandar = direccionEstandar;
           this.direccionOriginal = direccionOriginal;
           this.estrato = estrato;
           this.fecha = fecha;
           this.idCiudad = idCiudad;
           this.idInmuebleUbicado = idInmuebleUbicado;
           this.idSector = idSector;
           this.idZona = idZona;
           this.municipio = municipio;
           this.municipioOriginal = municipioOriginal;
           this.score = score;
           this.sector = sector;
           this.tipoDeUbicacion = tipoDeUbicacion;
           this.x = x;
           this.y = y;
           this.zona = zona;
           this.mensajeRespuesta = mensajeRespuesta;
    }

    

    public java.lang.String getMensajeRespuesta() {
		return mensajeRespuesta;
	}

	public void setMensajeRespuesta(java.lang.String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}

	/**
     * Gets the barrio value for this InmuebleUbicadoDTO.
     * 
     * @return barrio
     */
    public java.lang.String getBarrio() {
        return barrio;
    }


    /**
     * Sets the barrio value for this InmuebleUbicadoDTO.
     * 
     * @param barrio
     */
    public void setBarrio(java.lang.String barrio) {
        this.barrio = barrio;
    }


    /**
     * Gets the codigo value for this InmuebleUbicadoDTO.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this InmuebleUbicadoDTO.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the direccionEstandar value for this InmuebleUbicadoDTO.
     * 
     * @return direccionEstandar
     */
    public java.lang.String getDireccionEstandar() {
        return direccionEstandar;
    }


    /**
     * Sets the direccionEstandar value for this InmuebleUbicadoDTO.
     * 
     * @param direccionEstandar
     */
    public void setDireccionEstandar(java.lang.String direccionEstandar) {
        this.direccionEstandar = direccionEstandar;
    }


    /**
     * Gets the direccionOriginal value for this InmuebleUbicadoDTO.
     * 
     * @return direccionOriginal
     */
    public java.lang.String getDireccionOriginal() {
        return direccionOriginal;
    }


    /**
     * Sets the direccionOriginal value for this InmuebleUbicadoDTO.
     * 
     * @param direccionOriginal
     */
    public void setDireccionOriginal(java.lang.String direccionOriginal) {
        this.direccionOriginal = direccionOriginal;
    }


    /**
     * Gets the estrato value for this InmuebleUbicadoDTO.
     * 
     * @return estrato
     */
    public java.lang.Integer getEstrato() {
        return estrato;
    }


    /**
     * Sets the estrato value for this InmuebleUbicadoDTO.
     * 
     * @param estrato
     */
    public void setEstrato(java.lang.Integer estrato) {
        this.estrato = estrato;
    }


    /**
     * Gets the fecha value for this InmuebleUbicadoDTO.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this InmuebleUbicadoDTO.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the idCiudad value for this InmuebleUbicadoDTO.
     * 
     * @return idCiudad
     */
    public java.lang.Integer getIdCiudad() {
        return idCiudad;
    }


    /**
     * Sets the idCiudad value for this InmuebleUbicadoDTO.
     * 
     * @param idCiudad
     */
    public void setIdCiudad(java.lang.Integer idCiudad) {
        this.idCiudad = idCiudad;
    }


    /**
     * Gets the idInmuebleUbicado value for this InmuebleUbicadoDTO.
     * 
     * @return idInmuebleUbicado
     */
    public java.math.BigDecimal getIdInmuebleUbicado() {
        return idInmuebleUbicado;
    }


    /**
     * Sets the idInmuebleUbicado value for this InmuebleUbicadoDTO.
     * 
     * @param idInmuebleUbicado
     */
    public void setIdInmuebleUbicado(java.math.BigDecimal idInmuebleUbicado) {
        this.idInmuebleUbicado = idInmuebleUbicado;
    }


    /**
     * Gets the idSector value for this InmuebleUbicadoDTO.
     * 
     * @return idSector
     */
    public java.lang.Integer getIdSector() {
        return idSector;
    }


    /**
     * Sets the idSector value for this InmuebleUbicadoDTO.
     * 
     * @param idSector
     */
    public void setIdSector(java.lang.Integer idSector) {
        this.idSector = idSector;
    }


    /**
     * Gets the idZona value for this InmuebleUbicadoDTO.
     * 
     * @return idZona
     */
    public java.lang.Integer getIdZona() {
        return idZona;
    }


    /**
     * Sets the idZona value for this InmuebleUbicadoDTO.
     * 
     * @param idZona
     */
    public void setIdZona(java.lang.Integer idZona) {
        this.idZona = idZona;
    }


    /**
     * Gets the municipio value for this InmuebleUbicadoDTO.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this InmuebleUbicadoDTO.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }


    /**
     * Gets the municipioOriginal value for this InmuebleUbicadoDTO.
     * 
     * @return municipioOriginal
     */
    public java.lang.String getMunicipioOriginal() {
        return municipioOriginal;
    }


    /**
     * Sets the municipioOriginal value for this InmuebleUbicadoDTO.
     * 
     * @param municipioOriginal
     */
    public void setMunicipioOriginal(java.lang.String municipioOriginal) {
        this.municipioOriginal = municipioOriginal;
    }


    /**
     * Gets the score value for this InmuebleUbicadoDTO.
     * 
     * @return score
     */
    public java.lang.Double getScore() {
        return score;
    }


    /**
     * Sets the score value for this InmuebleUbicadoDTO.
     * 
     * @param score
     */
    public void setScore(java.lang.Double score) {
        this.score = score;
    }


    /**
     * Gets the sector value for this InmuebleUbicadoDTO.
     * 
     * @return sector
     */
    public java.lang.String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this InmuebleUbicadoDTO.
     * 
     * @param sector
     */
    public void setSector(java.lang.String sector) {
        this.sector = sector;
    }


    /**
     * Gets the tipoDeUbicacion value for this InmuebleUbicadoDTO.
     * 
     * @return tipoDeUbicacion
     */
    public java.lang.String getTipoDeUbicacion() {
        return tipoDeUbicacion;
    }


    /**
     * Sets the tipoDeUbicacion value for this InmuebleUbicadoDTO.
     * 
     * @param tipoDeUbicacion
     */
    public void setTipoDeUbicacion(java.lang.String tipoDeUbicacion) {
        this.tipoDeUbicacion = tipoDeUbicacion;
    }


    /**
     * Gets the x value for this InmuebleUbicadoDTO.
     * 
     * @return x
     */
    public java.lang.Double getX() {
        return x;
    }


    /**
     * Sets the x value for this InmuebleUbicadoDTO.
     * 
     * @param x
     */
    public void setX(java.lang.Double x) {
        this.x = x;
    }


    /**
     * Gets the y value for this InmuebleUbicadoDTO.
     * 
     * @return y
     */
    public java.lang.Double getY() {
        return y;
    }


    /**
     * Sets the y value for this InmuebleUbicadoDTO.
     * 
     * @param y
     */
    public void setY(java.lang.Double y) {
        this.y = y;
    }


    /**
     * Gets the zona value for this InmuebleUbicadoDTO.
     * 
     * @return zona
     */
    public java.lang.String getZona() {
        return zona;
    }


    /**
     * Sets the zona value for this InmuebleUbicadoDTO.
     * 
     * @param zona
     */
    public void setZona(java.lang.String zona) {
        this.zona = zona;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InmuebleUbicadoDTO)) return false;
        InmuebleUbicadoDTO other = (InmuebleUbicadoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.barrio==null && other.getBarrio()==null) || 
             (this.barrio!=null &&
              this.barrio.equals(other.getBarrio()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.direccionEstandar==null && other.getDireccionEstandar()==null) || 
             (this.direccionEstandar!=null &&
              this.direccionEstandar.equals(other.getDireccionEstandar()))) &&
            ((this.direccionOriginal==null && other.getDireccionOriginal()==null) || 
             (this.direccionOriginal!=null &&
              this.direccionOriginal.equals(other.getDireccionOriginal()))) &&
            ((this.estrato==null && other.getEstrato()==null) || 
             (this.estrato!=null &&
              this.estrato.equals(other.getEstrato()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.idCiudad==null && other.getIdCiudad()==null) || 
             (this.idCiudad!=null &&
              this.idCiudad.equals(other.getIdCiudad()))) &&
            ((this.idInmuebleUbicado==null && other.getIdInmuebleUbicado()==null) || 
             (this.idInmuebleUbicado!=null &&
              this.idInmuebleUbicado.equals(other.getIdInmuebleUbicado()))) &&
            ((this.idSector==null && other.getIdSector()==null) || 
             (this.idSector!=null &&
              this.idSector.equals(other.getIdSector()))) &&
            ((this.idZona==null && other.getIdZona()==null) || 
             (this.idZona!=null &&
              this.idZona.equals(other.getIdZona()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio()))) &&
            ((this.municipioOriginal==null && other.getMunicipioOriginal()==null) || 
             (this.municipioOriginal!=null &&
              this.municipioOriginal.equals(other.getMunicipioOriginal()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            ((this.tipoDeUbicacion==null && other.getTipoDeUbicacion()==null) || 
             (this.tipoDeUbicacion!=null &&
              this.tipoDeUbicacion.equals(other.getTipoDeUbicacion()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this.y==null && other.getY()==null) || 
             (this.y!=null &&
              this.y.equals(other.getY()))) &&
            ((this.zona==null && other.getZona()==null) || 
             (this.zona!=null &&
              this.zona.equals(other.getZona())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBarrio() != null) {
            _hashCode += getBarrio().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDireccionEstandar() != null) {
            _hashCode += getDireccionEstandar().hashCode();
        }
        if (getDireccionOriginal() != null) {
            _hashCode += getDireccionOriginal().hashCode();
        }
        if (getEstrato() != null) {
            _hashCode += getEstrato().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getIdCiudad() != null) {
            _hashCode += getIdCiudad().hashCode();
        }
        if (getIdInmuebleUbicado() != null) {
            _hashCode += getIdInmuebleUbicado().hashCode();
        }
        if (getIdSector() != null) {
            _hashCode += getIdSector().hashCode();
        }
        if (getIdZona() != null) {
            _hashCode += getIdZona().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        if (getMunicipioOriginal() != null) {
            _hashCode += getMunicipioOriginal().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getTipoDeUbicacion() != null) {
            _hashCode += getTipoDeUbicacion().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        if (getY() != null) {
            _hashCode += getY().hashCode();
        }
        if (getZona() != null) {
            _hashCode += getZona().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InmuebleUbicadoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.m2.mapas.com.co", "inmuebleUbicadoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barrio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barrio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionEstandar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccionEstandar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccionOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCiudad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCiudad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInmuebleUbicado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idInmuebleUbicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idZona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idZona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipioOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipioOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDeUbicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDeUbicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("", "y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
