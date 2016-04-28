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
 *  3-D coordinate interval type
 * 
 * <p>Java class for vel3VecIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vel3VecIntervalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}velocityIntervalType">
 *       &lt;sequence>
 *         &lt;element name="LoLimit3Vec" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double3Type" minOccurs="0"/>
 *         &lt;element name="HiLimit3Vec" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double3Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vel3VecIntervalType", propOrder = {
    "loLimit3Vec",
    "hiLimit3Vec"
})
public class Vel3VecIntervalType
    extends VelocityIntervalType
{

    @XmlElementRef(name = "LoLimit3Vec", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double3Type> loLimit3Vec;
    @XmlElementRef(name = "HiLimit3Vec", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double3Type> hiLimit3Vec;

    /**
     * Gets the value of the loLimit3Vec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double3Type }{@code >}
     *     
     */
    public JAXBElement<Double3Type> getLoLimit3Vec() {
        return loLimit3Vec;
    }

    /**
     * Sets the value of the loLimit3Vec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double3Type }{@code >}
     *     
     */
    public void setLoLimit3Vec(JAXBElement<Double3Type> value) {
        this.loLimit3Vec = value;
    }

    /**
     * Gets the value of the hiLimit3Vec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double3Type }{@code >}
     *     
     */
    public JAXBElement<Double3Type> getHiLimit3Vec() {
        return hiLimit3Vec;
    }

    /**
     * Sets the value of the hiLimit3Vec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double3Type }{@code >}
     *     
     */
    public void setHiLimit3Vec(JAXBElement<Double3Type> value) {
        this.hiLimit3Vec = value;
    }

}
