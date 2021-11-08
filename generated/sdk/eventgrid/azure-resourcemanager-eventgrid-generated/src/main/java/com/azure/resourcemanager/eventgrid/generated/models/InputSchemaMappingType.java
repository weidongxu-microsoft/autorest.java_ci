// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InputSchemaMappingType. */
public final class InputSchemaMappingType extends ExpandableStringEnum<InputSchemaMappingType> {
    /** Static value Json for InputSchemaMappingType. */
    public static final InputSchemaMappingType JSON = fromString("Json");

    /**
     * Creates or finds a InputSchemaMappingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InputSchemaMappingType.
     */
    @JsonCreator
    public static InputSchemaMappingType fromString(String name) {
        return fromString(name, InputSchemaMappingType.class);
    }

    /** @return known InputSchemaMappingType values. */
    public static Collection<InputSchemaMappingType> values() {
        return values(InputSchemaMappingType.class);
    }
}
