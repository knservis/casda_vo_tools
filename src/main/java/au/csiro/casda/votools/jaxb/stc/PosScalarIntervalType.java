//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.12 at 12:39:04 PM EST 
//


package au.csiro.casda.votools.jaxb.stc;

/*
 * #%L
 * CSIRO ASKAP Science Data Archive
 * %%
 * Copyright (C) 2015 Commonwealth Scientific and Industrial Research Organisation (CSIRO) ABN 41 687 119 230.
 * %%
 * Licensed under the CSIRO Open Source License Agreement (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License in the LICENSE file.
 * #L%
 */


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Scalar coordinate interval type
 * 
 * <p>Java class for posScalarIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="posScalarIntervalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}spatialIntervalType">
 *       &lt;sequence>
 *         &lt;element name="LoLimit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type" minOccurs="0"/>
 *         &lt;element name="HiLimit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posScalarIntervalType", propOrder = {
    "loLimit",
    "hiLimit"
})
public class PosScalarIntervalType
    extends SpatialIntervalType
{

    @XmlElementRef(name = "LoLimit", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double1Type> loLimit;
    @XmlElementRef(name = "HiLimit", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double1Type> hiLimit;

    /**
     * Gets the value of the loLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public JAXBElement<Double1Type> getLoLimit() {
        return loLimit;
    }

    /**
     * Sets the value of the loLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public void setLoLimit(JAXBElement<Double1Type> value) {
        this.loLimit = value;
    }

    /**
     * Gets the value of the hiLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public JAXBElement<Double1Type> getHiLimit() {
        return hiLimit;
    }

    /**
     * Sets the value of the hiLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public void setHiLimit(JAXBElement<Double1Type> value) {
        this.hiLimit = value;
    }

}
