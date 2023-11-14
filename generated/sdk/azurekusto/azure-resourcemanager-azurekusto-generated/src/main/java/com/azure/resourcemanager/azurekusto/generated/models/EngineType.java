// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The engine type.
 */
public final class EngineType extends ExpandableStringEnum<EngineType> {
    /**
     * Static value V2 for EngineType.
     */
    public static final EngineType V2 = fromString("V2");

    /**
     * Static value V3 for EngineType.
     */
    public static final EngineType V3 = fromString("V3");

    /**
     * Creates a new instance of EngineType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EngineType() {
    }

    /**
     * Creates or finds a EngineType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EngineType.
     */
    @JsonCreator
    public static EngineType fromString(String name) {
        return fromString(name, EngineType.class);
    }

    /**
     * Gets known EngineType values.
     * 
     * @return known EngineType values.
     */
    public static Collection<EngineType> values() {
        return values(EngineType.class);
    }
}
