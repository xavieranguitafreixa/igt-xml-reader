//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.13 a las 07:26:45 PM GMT 
//


package com.igt.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="des_evento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="num_evento" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="quota" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "evento")
public class Evento {

    @XmlAttribute(name = "des_evento", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String desEvento;
    @XmlAttribute(name = "num_evento", required = true)
    protected BigInteger numEvento;
    @XmlAttribute(name = "quota", required = true)
    protected BigInteger quota;

    /**
     * Obtiene el valor de la propiedad desEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesEvento() {
        return desEvento;
    }

    /**
     * Define el valor de la propiedad desEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesEvento(String value) {
        this.desEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad numEvento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumEvento() {
        return numEvento;
    }

    /**
     * Define el valor de la propiedad numEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumEvento(BigInteger value) {
        this.numEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad quota.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuota() {
        return quota;
    }

    /**
     * Define el valor de la propiedad quota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuota(BigInteger value) {
        this.quota = value;
    }

}
