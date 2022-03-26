// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerAuthorization;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerConfigurationProvisioningState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Partner configuration information. */
@Fluent
public final class PartnerConfigurationInner extends ProxyResource {
    /*
     * Properties of the partner configuration.
     */
    @JsonProperty(value = "properties")
    private PartnerConfigurationProperties innerProperties;

    /*
     * The system metadata relating to partner configuration resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Tags of the resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: Properties of the partner configuration.
     *
     * @return the innerProperties value.
     */
    private PartnerConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to partner configuration resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: Location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the resource.
     *
     * @param location the location value to set.
     * @return the PartnerConfigurationInner object itself.
     */
    public PartnerConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Tags of the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the resource.
     *
     * @param tags the tags value to set.
     * @return the PartnerConfigurationInner object itself.
     */
    public PartnerConfigurationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the partnerAuthorization property: The details of authorized partners.
     *
     * @return the partnerAuthorization value.
     */
    public PartnerAuthorization partnerAuthorization() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerAuthorization();
    }

    /**
     * Set the partnerAuthorization property: The details of authorized partners.
     *
     * @param partnerAuthorization the partnerAuthorization value to set.
     * @return the PartnerConfigurationInner object itself.
     */
    public PartnerConfigurationInner withPartnerAuthorization(PartnerAuthorization partnerAuthorization) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerConfigurationProperties();
        }
        this.innerProperties().withPartnerAuthorization(partnerAuthorization);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner configuration.
     *
     * @return the provisioningState value.
     */
    public PartnerConfigurationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the partner configuration.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PartnerConfigurationInner object itself.
     */
    public PartnerConfigurationInner withProvisioningState(PartnerConfigurationProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerConfigurationProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
