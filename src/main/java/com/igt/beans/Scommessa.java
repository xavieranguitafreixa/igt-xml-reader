//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.01.13 a las 07:26:45 PM GMT 
//


package com.igt.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}evento" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="attivo_handicap" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="cod_stato_accett" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="cod_tipo_sco" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="des_tipo_sco" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="handicap" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="massimo_avv" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="minimo_avv" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evento"
})
@XmlRootElement(name = "scommessa")
public class Scommessa {

    @XmlElement(required = true)
    protected List<Evento> evento;
    @XmlAttribute(name = "attivo_handicap", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String attivoHandicap;
    @XmlAttribute(name = "cod_stato_accett", required = true)
    protected BigInteger codStatoAccett;
    @XmlAttribute(name = "cod_tipo_sco", required = true)
    protected BigInteger codTipoSco;
    @XmlAttribute(name = "des_tipo_sco", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String desTipoSco;
    @XmlAttribute(name = "handicap", required = true)
    protected BigInteger handicap;
    @XmlAttribute(name = "massimo_avv", required = true)
    protected BigInteger massimoAvv;
    @XmlAttribute(name = "minimo_avv", required = true)
    protected BigInteger minimoAvv;

    /**
     * Gets the value of the evento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evento }
     * 
     * 
     */
    public List<Evento> getEvento() {
        if (evento == null) {
            evento = new ArrayList<Evento>();
        }
        return this.evento;
    }

    /**
     * Obtiene el valor de la propiedad attivoHandicap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttivoHandicap() {
        return attivoHandicap;
    }

    /**
     * Define el valor de la propiedad attivoHandicap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttivoHandicap(String value) {
        this.attivoHandicap = value;
    }

    /**
     * Obtiene el valor de la propiedad codStatoAccett.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodStatoAccett() {
        return codStatoAccett;
    }

    /**
     * Define el valor de la propiedad codStatoAccett.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodStatoAccett(BigInteger value) {
        this.codStatoAccett = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoSco.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodTipoSco() {
        return codTipoSco;
    }

    /**
     * Define el valor de la propiedad codTipoSco.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodTipoSco(BigInteger value) {
        this.codTipoSco = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipoSco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoSco() {
        return desTipoSco;
    }

    /**
     * Define el valor de la propiedad desTipoSco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoSco(String value) {
        this.desTipoSco = value;
    }

    /**
     * Obtiene el valor de la propiedad handicap.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHandicap() {
        return handicap;
    }

    /**
     * Define el valor de la propiedad handicap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHandicap(BigInteger value) {
        this.handicap = value;
    }

    /**
     * Obtiene el valor de la propiedad massimoAvv.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMassimoAvv() {
        return massimoAvv;
    }

    /**
     * Define el valor de la propiedad massimoAvv.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMassimoAvv(BigInteger value) {
        this.massimoAvv = value;
    }

    /**
     * Obtiene el valor de la propiedad minimoAvv.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimoAvv() {
        return minimoAvv;
    }

    /**
     * Define el valor de la propiedad minimoAvv.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimoAvv(BigInteger value) {
        this.minimoAvv = value;
    }

}
