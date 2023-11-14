// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains custom Dns resolution configuration from customer.
 */
@Fluent
public final class CustomDnsConfigPropertiesFormat {
    /*
     * Fqdn that resolves to private endpoint ip address.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * A list of private ip addresses of the private endpoint.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * Creates an instance of CustomDnsConfigPropertiesFormat class.
     */
    public CustomDnsConfigPropertiesFormat() {
    }

    /**
     * Get the fqdn property: Fqdn that resolves to private endpoint ip address.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fqdn that resolves to private endpoint ip address.
     * 
     * @param fqdn the fqdn value to set.
     * @return the CustomDnsConfigPropertiesFormat object itself.
     */
    public CustomDnsConfigPropertiesFormat withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the ipAddresses property: A list of private ip addresses of the private endpoint.
     * 
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: A list of private ip addresses of the private endpoint.
     * 
     * @param ipAddresses the ipAddresses value to set.
     * @return the CustomDnsConfigPropertiesFormat object itself.
     */
    public CustomDnsConfigPropertiesFormat withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
