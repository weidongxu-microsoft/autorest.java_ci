// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ShipmentType. */
public final class ShipmentType extends ExpandableStringEnum<ShipmentType> {
    /** Static value NotApplicable for ShipmentType. */
    public static final ShipmentType NOT_APPLICABLE = fromString("NotApplicable");

    /** Static value ShippedToCustomer for ShipmentType. */
    public static final ShipmentType SHIPPED_TO_CUSTOMER = fromString("ShippedToCustomer");

    /** Static value SelfPickup for ShipmentType. */
    public static final ShipmentType SELF_PICKUP = fromString("SelfPickup");

    /**
     * Creates or finds a ShipmentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ShipmentType.
     */
    @JsonCreator
    public static ShipmentType fromString(String name) {
        return fromString(name, ShipmentType.class);
    }

    /**
     * Gets known ShipmentType values.
     *
     * @return known ShipmentType values.
     */
    public static Collection<ShipmentType> values() {
        return values(ShipmentType.class);
    }
}
