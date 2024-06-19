// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The file type of flow log.
 */
public final class FlowLogFormatType extends ExpandableStringEnum<FlowLogFormatType> {
    /**
     * Static value JSON for FlowLogFormatType.
     */
    public static final FlowLogFormatType JSON = fromString("JSON");

    /**
     * Creates a new instance of FlowLogFormatType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FlowLogFormatType() {
    }

    /**
     * Creates or finds a FlowLogFormatType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FlowLogFormatType.
     */
    public static FlowLogFormatType fromString(String name) {
        return fromString(name, FlowLogFormatType.class);
    }

    /**
     * Gets known FlowLogFormatType values.
     * 
     * @return known FlowLogFormatType values.
     */
    public static Collection<FlowLogFormatType> values() {
        return values(FlowLogFormatType.class);
    }
}
