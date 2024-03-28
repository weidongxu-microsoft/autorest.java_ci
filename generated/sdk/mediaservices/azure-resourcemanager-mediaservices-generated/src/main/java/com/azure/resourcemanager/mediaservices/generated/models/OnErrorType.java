// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A Transform can define more than one outputs. This property defines what the service should do when one output fails
 * - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect
 * failures of outputs that are specified with 'ContinueJob'. The default is 'StopProcessingJob'.
 */
public final class OnErrorType extends ExpandableStringEnum<OnErrorType> {
    /**
     * Static value StopProcessingJob for OnErrorType.
     */
    public static final OnErrorType STOP_PROCESSING_JOB = fromString("StopProcessingJob");

    /**
     * Static value ContinueJob for OnErrorType.
     */
    public static final OnErrorType CONTINUE_JOB = fromString("ContinueJob");

    /**
     * Creates a new instance of OnErrorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OnErrorType() {
    }

    /**
     * Creates or finds a OnErrorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OnErrorType.
     */
    @JsonCreator
    public static OnErrorType fromString(String name) {
        return fromString(name, OnErrorType.class);
    }

    /**
     * Gets known OnErrorType values.
     * 
     * @return known OnErrorType values.
     */
    public static Collection<OnErrorType> values() {
        return values(OnErrorType.class);
    }
}
