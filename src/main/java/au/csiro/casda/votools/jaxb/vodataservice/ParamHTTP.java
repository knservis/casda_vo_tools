//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.12 at 12:45:57 PM EST 
//


package au.csiro.casda.votools.jaxb.vodataservice;

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.csiro.casda.votools.jaxb.voresource.Interface;


/**
 * 
 *            Note that the URL for help with this service can be put into
 *            the Service/ReferenceURL element.
 *         
 * 
 * <p>Java class for ParamHTTP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamHTTP">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/VOResource/v1.0}Interface">
 *       &lt;sequence>
 *         &lt;element name="queryType" type="{http://www.ivoa.net/xml/VODataService/v1.1}HTTPQueryType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="resultType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="param" type="{http://www.ivoa.net/xml/VODataService/v1.1}InputParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testQuery" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamHTTP", propOrder = {
    "queryType",
    "resultType",
    "param",
    "testQuery"
})
public class ParamHTTP
    extends Interface
{

    protected List<HTTPQueryType> queryType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resultType;
    protected List<InputParam> param;
    protected List<String> testQuery;

    /**
     * Gets the value of the queryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTTPQueryType }
     * 
     * 
     */
    public List<HTTPQueryType> getQueryType() {
        if (queryType == null) {
            queryType = new ArrayList<HTTPQueryType>();
        }
        return this.queryType;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputParam }
     * 
     * 
     */
    public List<InputParam> getParam() {
        if (param == null) {
            param = new ArrayList<InputParam>();
        }
        return this.param;
    }

    /**
     * Gets the value of the testQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestQuery() {
        if (testQuery == null) {
            testQuery = new ArrayList<String>();
        }
        return this.testQuery;
    }

}
