// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationGroupProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Specifies information about the capacity reservation group. Only tags can be updated. */
@Fluent
public final class CapacityReservationGroupUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationGroupUpdate.class);

    /*
     * capacity reservation group Properties.
     */
    @JsonProperty(value = "properties")
    private CapacityReservationGroupProperties innerProperties;

    /**
     * Get the innerProperties property: capacity reservation group Properties.
     *
     * @return the innerProperties value.
     */
    private CapacityReservationGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the capacityReservations property: A list of all capacity reservation resource ids that belong to capacity
     * reservation group.
     *
     * @return the capacityReservations value.
     */
    public List<SubResourceReadOnly> capacityReservations() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityReservations();
    }

    /**
     * Get the virtualMachinesAssociated property: A list of references to all virtual machines associated to the
     * capacity reservation group.
     *
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociated();
    }

    /**
     * Get the instanceView property: The capacity reservation group instance view which has the list of instance views
     * for all the capacity reservations that belong to the capacity reservation group.
     *
     * @return the instanceView value.
     */
    public CapacityReservationGroupInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
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
