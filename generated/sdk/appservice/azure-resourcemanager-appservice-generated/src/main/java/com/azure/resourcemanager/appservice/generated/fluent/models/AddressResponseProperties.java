// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.VirtualIpMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AddressResponse resource specific properties. */
@Fluent
public final class AddressResponseProperties {
    /*
     * Main public virtual IP.
     */
    @JsonProperty(value = "serviceIpAddress")
    private String serviceIpAddress;

    /*
     * Virtual Network internal IP address of the App Service Environment if it
     * is in internal load-balancing mode.
     */
    @JsonProperty(value = "internalIpAddress")
    private String internalIpAddress;

    /*
     * IP addresses appearing on outbound connections.
     */
    @JsonProperty(value = "outboundIpAddresses")
    private List<String> outboundIpAddresses;

    /*
     * Additional virtual IPs.
     */
    @JsonProperty(value = "vipMappings")
    private List<VirtualIpMapping> vipMappings;

    /**
     * Get the serviceIpAddress property: Main public virtual IP.
     *
     * @return the serviceIpAddress value.
     */
    public String serviceIpAddress() {
        return this.serviceIpAddress;
    }

    /**
     * Set the serviceIpAddress property: Main public virtual IP.
     *
     * @param serviceIpAddress the serviceIpAddress value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withServiceIpAddress(String serviceIpAddress) {
        this.serviceIpAddress = serviceIpAddress;
        return this;
    }

    /**
     * Get the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @return the internalIpAddress value.
     */
    public String internalIpAddress() {
        return this.internalIpAddress;
    }

    /**
     * Set the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @param internalIpAddress the internalIpAddress value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withInternalIpAddress(String internalIpAddress) {
        this.internalIpAddress = internalIpAddress;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withOutboundIpAddresses(List<String> outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
        return this;
    }

    /**
     * Get the vipMappings property: Additional virtual IPs.
     *
     * @return the vipMappings value.
     */
    public List<VirtualIpMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings property: Additional virtual IPs.
     *
     * @param vipMappings the vipMappings value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withVipMappings(List<VirtualIpMapping> vipMappings) {
        this.vipMappings = vipMappings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vipMappings() != null) {
            vipMappings().forEach(e -> e.validate());
        }
    }
}
