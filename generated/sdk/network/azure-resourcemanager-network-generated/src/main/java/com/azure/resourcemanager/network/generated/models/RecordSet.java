// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A collective group of information about the record set information.
 */
@Fluent
public final class RecordSet {
    /*
     * Resource record type.
     */
    @JsonProperty(value = "recordType")
    private String recordType;

    /*
     * Recordset name.
     */
    @JsonProperty(value = "recordSetName")
    private String recordSetName;

    /*
     * Fqdn that resolves to private endpoint ip address.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * The provisioning state of the recordset.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Recordset time to live.
     */
    @JsonProperty(value = "ttl")
    private Integer ttl;

    /*
     * The private ip address of the private endpoint.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * Creates an instance of RecordSet class.
     */
    public RecordSet() {
    }

    /**
     * Get the recordType property: Resource record type.
     * 
     * @return the recordType value.
     */
    public String recordType() {
        return this.recordType;
    }

    /**
     * Set the recordType property: Resource record type.
     * 
     * @param recordType the recordType value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get the recordSetName property: Recordset name.
     * 
     * @return the recordSetName value.
     */
    public String recordSetName() {
        return this.recordSetName;
    }

    /**
     * Set the recordSetName property: Recordset name.
     * 
     * @param recordSetName the recordSetName value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet withRecordSetName(String recordSetName) {
        this.recordSetName = recordSetName;
        return this;
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
     * @return the RecordSet object itself.
     */
    public RecordSet withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the recordset.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ttl property: Recordset time to live.
     * 
     * @return the ttl value.
     */
    public Integer ttl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: Recordset time to live.
     * 
     * @param ttl the ttl value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the ipAddresses property: The private ip address of the private endpoint.
     * 
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: The private ip address of the private endpoint.
     * 
     * @param ipAddresses the ipAddresses value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet withIpAddresses(List<String> ipAddresses) {
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
