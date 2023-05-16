// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Delivery mode of the event subscription. */
public final class DeliveryMode extends ExpandableStringEnum<DeliveryMode> {
    /** Static value Queue for DeliveryMode. */
    public static final DeliveryMode QUEUE = fromString("Queue");

    /**
     * Creates a new instance of DeliveryMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeliveryMode() {
    }

    /**
     * Creates or finds a DeliveryMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeliveryMode.
     */
    @JsonCreator
    public static DeliveryMode fromString(String name) {
        return fromString(name, DeliveryMode.class);
    }

    /**
     * Gets known DeliveryMode values.
     *
     * @return known DeliveryMode values.
     */
    public static Collection<DeliveryMode> values() {
        return values(DeliveryMode.class);
    }
}
