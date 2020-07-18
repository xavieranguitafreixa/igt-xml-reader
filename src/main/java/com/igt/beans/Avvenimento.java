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
 *         &lt;element ref="{}scommessa" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cod_programma" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="current_period_start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="dateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="des_avvenimento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="des_manif" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="des_sport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="num_avvenimento" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="score_team_1" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="score_team_2" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="score_type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="sigla_manif" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="sigla_sport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="squadra1" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="squadra2" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="status_code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="status_desc" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scommessa"
})
@XmlRootElement(name = "avvenimento")
public class Avvenimento {

    @XmlElement(required = true)
    protected List<Scommessa> scommessa;
    @XmlAttribute(name = "cod_programma", required = true)
    protected BigInteger codProgramma;
    @XmlAttribute(name = "current_period_start")
    @XmlSchemaType(name = "anySimpleType")
    protected String currentPeriodStart;
    @XmlAttribute(name = "dateTime", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dateTime;
    @XmlAttribute(name = "des_avvenimento", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String desAvvenimento;
    @XmlAttribute(name = "des_manif", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String desManif;
    @XmlAttribute(name = "des_sport", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String desSport;
    @XmlAttribute(name = "num_avvenimento", required = true)
    protected BigInteger numAvvenimento;
    @XmlAttribute(name = "score_team_1")
    protected BigInteger scoreTeam1;
    @XmlAttribute(name = "score_team_2")
    protected BigInteger scoreTeam2;
    @XmlAttribute(name = "score_type")
    @XmlSchemaType(name = "anySimpleType")
    protected String scoreType;
    @XmlAttribute(name = "sigla_manif", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String siglaManif;
    @XmlAttribute(name = "sigla_sport", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String siglaSport;
    @XmlAttribute(name = "squadra1")
    @XmlSchemaType(name = "anySimpleType")
    protected String squadra1;
    @XmlAttribute(name = "squadra2")
    @XmlSchemaType(name = "anySimpleType")
    protected String squadra2;
    @XmlAttribute(name = "status_code")
    protected BigInteger statusCode;
    @XmlAttribute(name = "status_desc")
    @XmlSchemaType(name = "anySimpleType")
    protected String statusDesc;

    /**
     * Gets the value of the scommessa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scommessa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScommessa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scommessa }
     * 
     * 
     */
    public List<Scommessa> getScommessa() {
        if (scommessa == null) {
            scommessa = new ArrayList<Scommessa>();
        }
        return this.scommessa;
    }

    /**
     * Obtiene el valor de la propiedad codProgramma.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodProgramma() {
        return codProgramma;
    }

    /**
     * Define el valor de la propiedad codProgramma.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodProgramma(BigInteger value) {
        this.codProgramma = value;
    }

    /**
     * Obtiene el valor de la propiedad currentPeriodStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPeriodStart() {
        return currentPeriodStart;
    }

    /**
     * Define el valor de la propiedad currentPeriodStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPeriodStart(String value) {
        this.currentPeriodStart = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad desAvvenimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesAvvenimento() {
        return desAvvenimento;
    }

    /**
     * Define el valor de la propiedad desAvvenimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesAvvenimento(String value) {
        this.desAvvenimento = value;
    }

    /**
     * Obtiene el valor de la propiedad desManif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesManif() {
        return desManif;
    }

    /**
     * Define el valor de la propiedad desManif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesManif(String value) {
        this.desManif = value;
    }

    /**
     * Obtiene el valor de la propiedad desSport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesSport() {
        return desSport;
    }

    /**
     * Define el valor de la propiedad desSport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesSport(String value) {
        this.desSport = value;
    }

    /**
     * Obtiene el valor de la propiedad numAvvenimento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumAvvenimento() {
        return numAvvenimento;
    }

    /**
     * Define el valor de la propiedad numAvvenimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumAvvenimento(BigInteger value) {
        this.numAvvenimento = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreTeam1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreTeam1() {
        return scoreTeam1;
    }

    /**
     * Define el valor de la propiedad scoreTeam1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreTeam1(BigInteger value) {
        this.scoreTeam1 = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreTeam2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreTeam2() {
        return scoreTeam2;
    }

    /**
     * Define el valor de la propiedad scoreTeam2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreTeam2(BigInteger value) {
        this.scoreTeam2 = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * Define el valor de la propiedad scoreType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreType(String value) {
        this.scoreType = value;
    }

    /**
     * Obtiene el valor de la propiedad siglaManif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaManif() {
        return siglaManif;
    }

    /**
     * Define el valor de la propiedad siglaManif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaManif(String value) {
        this.siglaManif = value;
    }

    /**
     * Obtiene el valor de la propiedad siglaSport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaSport() {
        return siglaSport;
    }

    /**
     * Define el valor de la propiedad siglaSport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaSport(String value) {
        this.siglaSport = value;
    }

    /**
     * Obtiene el valor de la propiedad squadra1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquadra1() {
        return squadra1;
    }

    /**
     * Define el valor de la propiedad squadra1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquadra1(String value) {
        this.squadra1 = value;
    }

    /**
     * Obtiene el valor de la propiedad squadra2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquadra2() {
        return squadra2;
    }

    /**
     * Define el valor de la propiedad squadra2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquadra2(String value) {
        this.squadra2 = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusCode(BigInteger value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

}
