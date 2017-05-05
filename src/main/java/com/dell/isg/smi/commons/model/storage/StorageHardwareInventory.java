/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StorageHardwareInventory complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageHardwareInventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controllers" type="{http://esg.dell.com/icee/infrastructure/model/storage}Controllers"/>
 *         &lt;element name="enclosures" type="{http://esg.dell.com/icee/infrastructure/model/storage}Enclosure" maxOccurs="unbounded"/>
 *         &lt;element name="volumes" type="{http://esg.dell.com/icee/infrastructure/model/storage}Volume" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageHardwareInventory", propOrder = { "controllers", "enclosures", "volumes" })
public class StorageHardwareInventory {

    @XmlElement(required = true)
    protected Controllers controllers;
    @XmlElement(required = true)
    protected List<Enclosure> enclosures;
    @XmlElement(required = true)
    protected List<Volume> volumes;


    /**
     * Gets the value of the controllers property.
     * 
     * @return possible object is {@link Controllers }
     * 
     */
    public Controllers getControllers() {
        return controllers;
    }


    /**
     * Sets the value of the controllers property.
     * 
     * @param value allowed object is {@link Controllers }
     * 
     */
    public void setControllers(Controllers value) {
        this.controllers = value;
    }


    /**
     * Gets the value of the enclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEnclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Enclosure }
     * 
     * 
     */
    public List<Enclosure> getEnclosures() {
        if (enclosures == null) {
            enclosures = new ArrayList<Enclosure>();
        }
        return this.enclosures;
    }


    /**
     * Gets the value of the volumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Volume }
     * 
     * 
     */
    public List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new ArrayList<Volume>();
        }
        return this.volumes;
    }

}