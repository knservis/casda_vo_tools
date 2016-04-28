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


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for STC Coordinate List
 * 
 * <p>Java class for STCCoordinateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STCCoordinateList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}stcMetadataType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AstroCoordSystem"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AstroCoords" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STCCoordinateList", propOrder = {
    "astroCoordSystem",
    "astroCoords"
})
public class STCCoordinateList
    extends StcMetadataType
{

    @XmlElement(name = "AstroCoordSystem", required = true, nillable = true)
    protected AstroCoordSystemType astroCoordSystem;
    @XmlElement(name = "AstroCoords", required = true, nillable = true)
    protected List<AstroCoordsType> astroCoords;

    /**
     * Gets the value of the astroCoordSystem property.
     * 
     * @return
     *     possible object is
     *     {@link AstroCoordSystemType }
     *     
     */
    public AstroCoordSystemType getAstroCoordSystem() {
        return astroCoordSystem;
    }

    /**
     * Sets the value of the astroCoordSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroCoordSystemType }
     *     
     */
    public void setAstroCoordSystem(AstroCoordSystemType value) {
        this.astroCoordSystem = value;
    }

    /**
     * Gets the value of the astroCoords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the astroCoords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAstroCoords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AstroCoordsType }
     * 
     * 
     */
    public List<AstroCoordsType> getAstroCoords() {
        if (astroCoords == null) {
            astroCoords = new ArrayList<AstroCoordsType>();
        }
        return this.astroCoords;
    }

}
