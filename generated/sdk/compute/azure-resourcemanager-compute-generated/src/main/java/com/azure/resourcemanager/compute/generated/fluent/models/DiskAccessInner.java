// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * disk access resource.
 */
@Fluent
public final class DiskAccessInner extends Resource {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private DiskAccessProperties innerProperties;

    /*
     * The extended location where the disk access will be created. Extended location cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * Creates an instance of DiskAccessInner class.
     */
    public DiskAccessInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private DiskAccessProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: The extended location where the disk access will be created. Extended location cannot be changed.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location where the disk access will be created. Extended location cannot be changed.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the DiskAccessInner object itself.
     */
    public DiskAccessInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskAccessInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskAccessInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: A readonly collection of private endpoint connections created on the disk. Currently only one endpoint connection is supported.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the provisioningState property: The disk access resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the timeCreated property: The time when the disk access was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
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
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
