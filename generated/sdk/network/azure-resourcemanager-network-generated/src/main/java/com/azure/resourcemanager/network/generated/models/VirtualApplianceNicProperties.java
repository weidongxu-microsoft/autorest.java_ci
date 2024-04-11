// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Virtual Appliance NIC properties.
 */
@Immutable
public final class VirtualApplianceNicProperties {
    /*
     * NIC type - PublicNic, PrivateNic, or AdditionalNic.
     */
    @JsonProperty(value = "nicType", access = JsonProperty.Access.WRITE_ONLY)
    private NicTypeInResponse nicType;

    /*
     * NIC name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Public IP address.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /*
     * Private IP address.
     */
    @JsonProperty(value = "privateIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * Instance on which nic is attached.
     */
    @JsonProperty(value = "instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /**
     * Creates an instance of VirtualApplianceNicProperties class.
     */
    public VirtualApplianceNicProperties() {
    }

    /**
     * Get the nicType property: NIC type - PublicNic, PrivateNic, or AdditionalNic.
     * 
     * @return the nicType value.
     */
    public NicTypeInResponse nicType() {
        return this.nicType;
    }

    /**
     * Get the name property: NIC name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the publicIpAddress property: Public IP address.
     * 
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the privateIpAddress property: Private IP address.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the instanceName property: Instance on which nic is attached.
     * 
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
