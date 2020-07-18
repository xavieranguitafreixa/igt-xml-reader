//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.13 a las 07:26:45 PM GMT 
//


package com.igt.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}avvenimento" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="creazione" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "avvenimento"
})
@XmlRootElement(name = "livexml")
public class Livexml {

    @XmlElement(required = true)
    protected List<Avvenimento> avvenimento;
    @XmlAttribute(name = "creazione", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String creazione;

    /**
     * Gets the value of the avvenimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avvenimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvvenimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Avvenimento }
     * 
     * 
     */
    public List<Avvenimento> getAvvenimento() {
        if (avvenimento == null) {
            avvenimento = new ArrayList<Avvenimento>();
        }
        return this.avvenimento;
    }

    /**
     * Obtiene el valor de la propiedad creazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreazione() {
        return creazione;
    }

    /**
     * Define el valor de la propiedad creazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreazione(String value) {
        this.creazione = value;
    }

}
