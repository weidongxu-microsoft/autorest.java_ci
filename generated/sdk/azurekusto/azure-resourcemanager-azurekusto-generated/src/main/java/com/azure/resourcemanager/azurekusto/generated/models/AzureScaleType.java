// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Scale type. */
public final class AzureScaleType extends ExpandableStringEnum<AzureScaleType> {
    /** Static value automatic for AzureScaleType. */
    public static final AzureScaleType AUTOMATIC = fromString("automatic");

    /** Static value manual for AzureScaleType. */
    public static final AzureScaleType MANUAL = fromString("manual");

    /** Static value none for AzureScaleType. */
    public static final AzureScaleType NONE = fromString("none");

    /**
     * Creates a new instance of AzureScaleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureScaleType() {
    }

    /**
     * Creates or finds a AzureScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureScaleType.
     */
    @JsonCreator
    public static AzureScaleType fromString(String name) {
        return fromString(name, AzureScaleType.class);
    }

    /**
     * Gets known AzureScaleType values.
     *
     * @return known AzureScaleType values.
     */
    public static Collection<AzureScaleType> values() {
        return values(AzureScaleType.class);
    }
}
