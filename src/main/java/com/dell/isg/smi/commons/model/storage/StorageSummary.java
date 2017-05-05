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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StorageSummary complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storageHardwareStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deviceType" type="{http://esg.dell.com/icee/infrastructure/model/storage}DeviceType"/>
 *         &lt;element name="deviceState" type="{http://esg.dell.com/icee/infrastructure/model/storage}DeviceState"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallHealth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageSummary", propOrder = { "id", "name", "status", "statusMessage", "storageHardwareStatus", "deviceId", "manufacturer", "model", "registrationStatus", "deviceType", "deviceState", "ipAddress", "firmwareVersion", "location", "serviceTag", "overallHealth" })
@XmlSeeAlso({ StorageDetail.class })
public class StorageSummary {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String statusMessage;
    @XmlElement(required = true)
    protected String storageHardwareStatus;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    protected String model;
    protected boolean registrationStatus;
    @XmlElement(required = true)
    protected DeviceType deviceType;
    @XmlElement(required = true)
    protected DeviceState deviceState;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String firmwareVersion;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String serviceTag;
    @XmlElement(required = true)
    protected String overallHealth;


    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }


    /**
     * Gets the value of the statusMessage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }


    /**
     * Gets the value of the storageHardwareStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStorageHardwareStatus() {
        return storageHardwareStatus;
    }


    /**
     * Sets the value of the storageHardwareStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStorageHardwareStatus(String value) {
        this.storageHardwareStatus = value;
    }


    /**
     * Gets the value of the deviceId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the value of the deviceId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }


    /**
     * Gets the value of the manufacturer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }


    /**
     * Gets the value of the model property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the value of the model property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setModel(String value) {
        this.model = value;
    }


    /**
     * Gets the value of the registrationStatus property.
     * 
     */
    public boolean isRegistrationStatus() {
        return registrationStatus;
    }


    /**
     * Sets the value of the registrationStatus property.
     * 
     */
    public void setRegistrationStatus(boolean value) {
        this.registrationStatus = value;
    }


    /**
     * Gets the value of the deviceType property.
     * 
     * @return possible object is {@link DeviceType }
     * 
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the value of the deviceType property.
     * 
     * @param value allowed object is {@link DeviceType }
     * 
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }


    /**
     * Gets the value of the deviceState property.
     * 
     * @return possible object is {@link DeviceState }
     * 
     */
    public DeviceState getDeviceState() {
        return deviceState;
    }


    /**
     * Sets the value of the deviceState property.
     * 
     * @param value allowed object is {@link DeviceState }
     * 
     */
    public void setDeviceState(DeviceState value) {
        this.deviceState = value;
    }


    /**
     * Gets the value of the ipAddress property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }


    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }


    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the value of the location property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * Gets the value of the serviceTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }


    /**
     * Gets the value of the overallHealth property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOverallHealth() {
        return overallHealth;
    }


    /**
     * Sets the value of the overallHealth property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOverallHealth(String value) {
        this.overallHealth = value;
    }

}