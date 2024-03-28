// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dns.generated.models.DnsResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of dns resource reference request. Returns a list of dns resource references for each of the azure
 * resource in the request.
 */
@Fluent
public final class DnsResourceReferenceResultProperties {
    /*
     * The result of dns resource reference request. A list of dns resource references for each of the azure resource in the request
     */
    @JsonProperty(value = "dnsResourceReferences")
    private List<DnsResourceReference> dnsResourceReferences;

    /**
     * Creates an instance of DnsResourceReferenceResultProperties class.
     */
    public DnsResourceReferenceResultProperties() {
    }

    /**
     * Get the dnsResourceReferences property: The result of dns resource reference request. A list of dns resource
     * references for each of the azure resource in the request.
     * 
     * @return the dnsResourceReferences value.
     */
    public List<DnsResourceReference> dnsResourceReferences() {
        return this.dnsResourceReferences;
    }

    /**
     * Set the dnsResourceReferences property: The result of dns resource reference request. A list of dns resource
     * references for each of the azure resource in the request.
     * 
     * @param dnsResourceReferences the dnsResourceReferences value to set.
     * @return the DnsResourceReferenceResultProperties object itself.
     */
    public DnsResourceReferenceResultProperties
        withDnsResourceReferences(List<DnsResourceReference> dnsResourceReferences) {
        this.dnsResourceReferences = dnsResourceReferences;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsResourceReferences() != null) {
            dnsResourceReferences().forEach(e -> e.validate());
        }
    }
}
