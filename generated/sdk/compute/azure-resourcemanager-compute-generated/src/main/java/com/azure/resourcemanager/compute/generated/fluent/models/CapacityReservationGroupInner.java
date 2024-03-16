// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationGroupInstanceView;
import com.azure.resourcemanager.compute.generated.models.ResourceSharingProfile;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the capacity reservation group that the capacity reservations should be assigned to. Currently, a capacity reservation can only be added to a capacity reservation group at creation time. An existing capacity reservation cannot be added or moved to another capacity reservation group.
 */
@Fluent
public final class CapacityReservationGroupInner extends Resource {
    /*
     * capacity reservation group Properties.
     */
    @JsonProperty(value = "properties")
    private CapacityReservationGroupProperties innerProperties;

    /*
     * Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Creates an instance of CapacityReservationGroupInner class.
     */
    public CapacityReservationGroupInner() {
    }

    /**
     * Get the innerProperties property: capacity reservation group Properties.
     * 
     * @return the innerProperties value.
     */
    private CapacityReservationGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     * @param zones the zones value to set.
     * @return the CapacityReservationGroupInner object itself.
     */
    public CapacityReservationGroupInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the capacityReservations property: A list of all capacity reservation resource ids that belong to capacity reservation group.
     * 
     * @return the capacityReservations value.
     */
    public List<SubResourceReadOnly> capacityReservations() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityReservations();
    }

    /**
     * Get the virtualMachinesAssociated property: A list of references to all virtual machines associated to the capacity reservation group.
     * 
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociated();
    }

    /**
     * Get the instanceView property: The capacity reservation group instance view which has the list of instance views for all the capacity reservations that belong to the capacity reservation group.
     * 
     * @return the instanceView value.
     */
    public CapacityReservationGroupInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the sharingProfile property: Specifies the settings to enable sharing across subscriptions for the capacity reservation group resource. Pls. keep in mind the capacity reservation group resource generally can be shared across subscriptions belonging to a single azure AAD tenant or cross AAD tenant if there is a trust relationship established between the AAD tenants. **Note:** Minimum api-version: 2023-09-01. Please refer to https://aka.ms/computereservationsharing for more details.
     * 
     * @return the sharingProfile value.
     */
    public ResourceSharingProfile sharingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().sharingProfile();
    }

    /**
     * Set the sharingProfile property: Specifies the settings to enable sharing across subscriptions for the capacity reservation group resource. Pls. keep in mind the capacity reservation group resource generally can be shared across subscriptions belonging to a single azure AAD tenant or cross AAD tenant if there is a trust relationship established between the AAD tenants. **Note:** Minimum api-version: 2023-09-01. Please refer to https://aka.ms/computereservationsharing for more details.
     * 
     * @param sharingProfile the sharingProfile value to set.
     * @return the CapacityReservationGroupInner object itself.
     */
    public CapacityReservationGroupInner withSharingProfile(ResourceSharingProfile sharingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CapacityReservationGroupProperties();
        }
        this.innerProperties().withSharingProfile(sharingProfile);
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
