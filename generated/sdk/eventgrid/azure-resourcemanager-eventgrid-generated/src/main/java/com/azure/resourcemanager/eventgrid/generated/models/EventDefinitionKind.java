// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventDefinitionKind. */
public final class EventDefinitionKind extends ExpandableStringEnum<EventDefinitionKind> {
    /** Static value Inline for EventDefinitionKind. */
    public static final EventDefinitionKind INLINE = fromString("Inline");

    /**
     * Creates or finds a EventDefinitionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventDefinitionKind.
     */
    @JsonCreator
    public static EventDefinitionKind fromString(String name) {
        return fromString(name, EventDefinitionKind.class);
    }

    /** @return known EventDefinitionKind values. */
    public static Collection<EventDefinitionKind> values() {
        return values(EventDefinitionKind.class);
    }
}
