// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerAuthorization;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerConfigurationProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the partner configuration.
 */
@Fluent
public final class PartnerConfigurationProperties {
    /*
     * The details of authorized partners.
     */
    @JsonProperty(value = "partnerAuthorization")
    private PartnerAuthorization partnerAuthorization;

    /*
     * Provisioning state of the partner configuration.
     */
    @JsonProperty(value = "provisioningState")
    private PartnerConfigurationProvisioningState provisioningState;

    /**
     * Creates an instance of PartnerConfigurationProperties class.
     */
    public PartnerConfigurationProperties() {
    }

    /**
     * Get the partnerAuthorization property: The details of authorized partners.
     * 
     * @return the partnerAuthorization value.
     */
    public PartnerAuthorization partnerAuthorization() {
        return this.partnerAuthorization;
    }

    /**
     * Set the partnerAuthorization property: The details of authorized partners.
     * 
     * @param partnerAuthorization the partnerAuthorization value to set.
     * @return the PartnerConfigurationProperties object itself.
     */
    public PartnerConfigurationProperties withPartnerAuthorization(PartnerAuthorization partnerAuthorization) {
        this.partnerAuthorization = partnerAuthorization;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner configuration.
     * 
     * @return the provisioningState value.
     */
    public PartnerConfigurationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the partner configuration.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PartnerConfigurationProperties object itself.
     */
    public PartnerConfigurationProperties
        withProvisioningState(PartnerConfigurationProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (partnerAuthorization() != null) {
            partnerAuthorization().validate();
        }
    }
}
