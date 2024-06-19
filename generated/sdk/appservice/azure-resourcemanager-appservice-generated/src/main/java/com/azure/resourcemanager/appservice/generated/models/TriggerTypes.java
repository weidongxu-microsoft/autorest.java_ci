// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The trigger type of the function.
 */
public final class TriggerTypes extends ExpandableStringEnum<TriggerTypes> {
    /**
     * Static value HttpTrigger for TriggerTypes.
     */
    public static final TriggerTypes HTTP_TRIGGER = fromString("HttpTrigger");

    /**
     * Static value Unknown for TriggerTypes.
     */
    public static final TriggerTypes UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of TriggerTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TriggerTypes() {
    }

    /**
     * Creates or finds a TriggerTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TriggerTypes.
     */
    public static TriggerTypes fromString(String name) {
        return fromString(name, TriggerTypes.class);
    }

    /**
     * Gets known TriggerTypes values.
     * 
     * @return known TriggerTypes values.
     */
    public static Collection<TriggerTypes> values() {
        return values(TriggerTypes.class);
    }
}
