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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for observational STC metadata
 * 
 * <p>Java class for obsDataLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obsDataLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}stcMetadataType">
 *       &lt;sequence>
 *         &lt;element name="ObservatoryLocation" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}observatoryLocationType"/>
 *         &lt;element name="ObservationLocation" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astroSTCDescriptionType"/>
 *         &lt;element name="PixelSpace" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}pixelSpaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obsDataLocationType", propOrder = {
    "observatoryLocation",
    "observationLocation",
    "pixelSpace"
})
public class ObsDataLocationType
    extends StcMetadataType
{

    @XmlElement(name = "ObservatoryLocation", required = true, nillable = true)
    protected ObservatoryLocationType observatoryLocation;
    @XmlElement(name = "ObservationLocation", required = true, nillable = true)
    protected AstroSTCDescriptionType observationLocation;
    @XmlElementRef(name = "PixelSpace", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PixelSpaceType> pixelSpace;

    /**
     * Gets the value of the observatoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ObservatoryLocationType }
     *     
     */
    public ObservatoryLocationType getObservatoryLocation() {
        return observatoryLocation;
    }

    /**
     * Sets the value of the observatoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservatoryLocationType }
     *     
     */
    public void setObservatoryLocation(ObservatoryLocationType value) {
        this.observatoryLocation = value;
    }

    /**
     * Gets the value of the observationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AstroSTCDescriptionType }
     *     
     */
    public AstroSTCDescriptionType getObservationLocation() {
        return observationLocation;
    }

    /**
     * Sets the value of the observationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroSTCDescriptionType }
     *     
     */
    public void setObservationLocation(AstroSTCDescriptionType value) {
        this.observationLocation = value;
    }

    /**
     * Gets the value of the pixelSpace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PixelSpaceType }{@code >}
     *     
     */
    public JAXBElement<PixelSpaceType> getPixelSpace() {
        return pixelSpace;
    }

    /**
     * Sets the value of the pixelSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PixelSpaceType }{@code >}
     *     
     */
    public void setPixelSpace(JAXBElement<PixelSpaceType> value) {
        this.pixelSpace = value;
    }

}
