// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A Sequence contains an ordered list of Clips where each clip is a JobInput. The Sequence will be treated as a single
 * input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.JobInputSequence")
@Fluent
public final class JobInputSequence extends JobInput {
    /*
     * JobInputs that make up the timeline.
     */
    @JsonProperty(value = "inputs")
    private List<JobInputClip> inputs;

    /**
     * Creates an instance of JobInputSequence class.
     */
    public JobInputSequence() {
    }

    /**
     * Get the inputs property: JobInputs that make up the timeline.
     * 
     * @return the inputs value.
     */
    public List<JobInputClip> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: JobInputs that make up the timeline.
     * 
     * @param inputs the inputs value to set.
     * @return the JobInputSequence object itself.
     */
    public JobInputSequence withInputs(List<JobInputClip> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
    }
}
