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
 * The time interval needs to contain a start time or a stop time or both; it needs to refer to a coordinate system; boundaries may or may not be inclusive
 * 
 * <p>Java class for timeIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeIntervalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordIntervalType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astronTimeType" minOccurs="0"/>
 *         &lt;element name="StopTime" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astronTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeIntervalType", propOrder = {
    "startTime",
    "stopTime"
})
public class TimeIntervalType
    extends CoordIntervalType
{

    @XmlElementRef(name = "StartTime", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AstronTimeType> startTime;
    @XmlElementRef(name = "StopTime", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AstronTimeType> stopTime;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AstronTimeType }{@code >}
     *     
     */
    public JAXBElement<AstronTimeType> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AstronTimeType }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<AstronTimeType> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the stopTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AstronTimeType }{@code >}
     *     
     */
    public JAXBElement<AstronTimeType> getStopTime() {
        return stopTime;
    }

    /**
     * Sets the value of the stopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AstronTimeType }{@code >}
     *     
     */
    public void setStopTime(JAXBElement<AstronTimeType> value) {
        this.stopTime = value;
    }

}
