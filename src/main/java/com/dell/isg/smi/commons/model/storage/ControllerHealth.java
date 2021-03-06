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


// TODO: Auto-generated Javadoc
/**
 * The Class ControllerHealth.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllerHealth", propOrder = { "coolingFans", "powerSupplies", "temperatures", "sasDetails" })
public class ControllerHealth extends HealthNode {

    @XmlElement(required = true)
    protected List<HealthNode> coolingFans;
    @XmlElement(required = true)
    protected List<HealthNode> powerSupplies;
    @XmlElement(required = true)
    protected List<HealthNode> temperatures;
    @XmlElement(required = true)
    protected List<HealthNode> sasDetails;


    /**
     * Gets the value of the coolingFans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coolingFans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCoolingFans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HealthNode }
     *
     * @return the cooling fans
     */
    public List<HealthNode> getCoolingFans() {
        if (coolingFans == null) {
            coolingFans = new ArrayList<HealthNode>();
        }
        return this.coolingFans;
    }


    /**
     * Gets the value of the powerSupplies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerSupplies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPowerSupplies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HealthNode }
     *
     * @return the power supplies
     */
    public List<HealthNode> getPowerSupplies() {
        if (powerSupplies == null) {
            powerSupplies = new ArrayList<HealthNode>();
        }
        return this.powerSupplies;
    }


    /**
     * Gets the value of the temperatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTemperatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HealthNode }
     *
     * @return the temperatures
     */
    public List<HealthNode> getTemperatures() {
        if (temperatures == null) {
            temperatures = new ArrayList<HealthNode>();
        }
        return this.temperatures;
    }


    /**
     * Gets the value of the sasDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sasDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSasDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HealthNode }
     *
     * @return the sas details
     */
    public List<HealthNode> getSasDetails() {
        if (sasDetails == null) {
            sasDetails = new ArrayList<HealthNode>();
        }
        return this.sasDetails;
    }

}
