// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.models.ResourceInstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The instance view of the role instance.
 */
@Immutable
public final class RoleInstanceViewInner {
    /*
     * The Update Domain.
     */
    @JsonProperty(value = "platformUpdateDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer platformUpdateDomain;

    /*
     * The Fault Domain.
     */
    @JsonProperty(value = "platformFaultDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer platformFaultDomain;

    /*
     * Specifies a unique identifier generated internally for the cloud service associated with this role instance. <br /><br /> NOTE: If you are using Azure Diagnostics extension, this property can be used as 'DeploymentId' for querying details.
     */
    @JsonProperty(value = "privateId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateId;

    /*
     * The statuses property.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceInstanceViewStatus> statuses;

    /**
     * Creates an instance of RoleInstanceViewInner class.
     */
    public RoleInstanceViewInner() {
    }

    /**
     * Get the platformUpdateDomain property: The Update Domain.
     * 
     * @return the platformUpdateDomain value.
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Get the platformFaultDomain property: The Fault Domain.
     * 
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Get the privateId property: Specifies a unique identifier generated internally for the cloud service associated with this role instance. &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this property can be used as 'DeploymentId' for querying details.
     * 
     * @return the privateId value.
     */
    public String privateId() {
        return this.privateId;
    }

    /**
     * Get the statuses property: The statuses property.
     * 
     * @return the statuses value.
     */
    public List<ResourceInstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
