// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Identifies the type of the event.
 */
public final class EventType extends ExpandableStringEnum<EventType> {
    /**
     * Static value SettledCharges for EventType.
     */
    public static final EventType SETTLED_CHARGES = fromString("SettledCharges");

    /**
     * Static value PendingCharges for EventType.
     */
    public static final EventType PENDING_CHARGES = fromString("PendingCharges");

    /**
     * Static value PendingAdjustments for EventType.
     */
    public static final EventType PENDING_ADJUSTMENTS = fromString("PendingAdjustments");

    /**
     * Static value PendingNewCredit for EventType.
     */
    public static final EventType PENDING_NEW_CREDIT = fromString("PendingNewCredit");

    /**
     * Static value PendingExpiredCredit for EventType.
     */
    public static final EventType PENDING_EXPIRED_CREDIT = fromString("PendingExpiredCredit");

    /**
     * Static value UnKnown for EventType.
     */
    public static final EventType UN_KNOWN = fromString("UnKnown");

    /**
     * Static value NewCredit for EventType.
     */
    public static final EventType NEW_CREDIT = fromString("NewCredit");

    /**
     * Static value CreditExpired for EventType.
     */
    public static final EventType CREDIT_EXPIRED = fromString("CreditExpired");

    /**
     * Creates a new instance of EventType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EventType() {
    }

    /**
     * Creates or finds a EventType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EventType.
     */
    @JsonCreator
    public static EventType fromString(String name) {
        return fromString(name, EventType.class);
    }

    /**
     * Gets known EventType values.
     * 
     * @return known EventType values.
     */
    public static Collection<EventType> values() {
        return values(EventType.class);
    }
}
