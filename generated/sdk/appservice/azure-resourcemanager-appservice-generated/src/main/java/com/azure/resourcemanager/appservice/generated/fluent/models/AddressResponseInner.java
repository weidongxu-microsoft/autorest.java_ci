// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.VirtualIpMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes main public IP address and any extra virtual IPs. */
@Fluent
public final class AddressResponseInner extends ProxyOnlyResource {
    /*
     * AddressResponse resource specific properties
     */
    @JsonProperty(value = "properties")
    private AddressResponseProperties innerProperties;

    /** Creates an instance of AddressResponseInner class. */
    public AddressResponseInner() {
    }

    /**
     * Get the innerProperties property: AddressResponse resource specific properties.
     *
     * @return the innerProperties value.
     */
    private AddressResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AddressResponseInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the serviceIpAddress property: Main public virtual IP.
     *
     * @return the serviceIpAddress value.
     */
    public String serviceIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceIpAddress();
    }

    /**
     * Set the serviceIpAddress property: Main public virtual IP.
     *
     * @param serviceIpAddress the serviceIpAddress value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withServiceIpAddress(String serviceIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AddressResponseProperties();
        }
        this.innerProperties().withServiceIpAddress(serviceIpAddress);
        return this;
    }

    /**
     * Get the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @return the internalIpAddress value.
     */
    public String internalIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().internalIpAddress();
    }

    /**
     * Set the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @param internalIpAddress the internalIpAddress value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withInternalIpAddress(String internalIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AddressResponseProperties();
        }
        this.innerProperties().withInternalIpAddress(internalIpAddress);
        return this;
    }

    /**
     * Get the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundIpAddresses();
    }

    /**
     * Set the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withOutboundIpAddresses(List<String> outboundIpAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AddressResponseProperties();
        }
        this.innerProperties().withOutboundIpAddresses(outboundIpAddresses);
        return this;
    }

    /**
     * Get the vipMappings property: Additional virtual IPs.
     *
     * @return the vipMappings value.
     */
    public List<VirtualIpMapping> vipMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().vipMappings();
    }

    /**
     * Set the vipMappings property: Additional virtual IPs.
     *
     * @param vipMappings the vipMappings value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withVipMappings(List<VirtualIpMapping> vipMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AddressResponseProperties();
        }
        this.innerProperties().withVipMappings(vipMappings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
