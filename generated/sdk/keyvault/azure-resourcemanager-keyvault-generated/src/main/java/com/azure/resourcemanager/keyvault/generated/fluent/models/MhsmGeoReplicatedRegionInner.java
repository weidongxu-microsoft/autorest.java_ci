// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.generated.models.GeoReplicationRegionProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A region that this managed HSM Pool has been extended to.
 */
@Fluent
public final class MhsmGeoReplicatedRegionInner {
    /*
     * Name of the geo replicated region.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Provisioning state of the geo replicated region.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationRegionProvisioningState provisioningState;

    /*
     * A boolean value that indicates whether the region is the primary region or a secondary region.
     */
    @JsonProperty(value = "isPrimary")
    private Boolean isPrimary;

    /**
     * Creates an instance of MhsmGeoReplicatedRegionInner class.
     */
    public MhsmGeoReplicatedRegionInner() {
    }

    /**
     * Get the name property: Name of the geo replicated region.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the geo replicated region.
     * 
     * @param name the name value to set.
     * @return the MhsmGeoReplicatedRegionInner object itself.
     */
    public MhsmGeoReplicatedRegionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the geo replicated region.
     * 
     * @return the provisioningState value.
     */
    public GeoReplicationRegionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the isPrimary property: A boolean value that indicates whether the region is the primary region or a secondary region.
     * 
     * @return the isPrimary value.
     */
    public Boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set the isPrimary property: A boolean value that indicates whether the region is the primary region or a secondary region.
     * 
     * @param isPrimary the isPrimary value to set.
     * @return the MhsmGeoReplicatedRegionInner object itself.
     */
    public MhsmGeoReplicatedRegionInner withIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
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
