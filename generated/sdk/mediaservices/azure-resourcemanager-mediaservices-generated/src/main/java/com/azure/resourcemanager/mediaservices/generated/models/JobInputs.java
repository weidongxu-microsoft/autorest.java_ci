// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes a list of inputs to a Job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = JobInputs.class, visible = true)
@JsonTypeName("#Microsoft.Media.JobInputs")
@Fluent
public final class JobInputs extends JobInput {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Media.JobInputs";

    /*
     * List of inputs to a Job.
     */
    @JsonProperty(value = "inputs")
    private List<JobInput> inputs;

    /**
     * Creates an instance of JobInputs class.
     */
    public JobInputs() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the inputs property: List of inputs to a Job.
     * 
     * @return the inputs value.
     */
    public List<JobInput> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: List of inputs to a Job.
     * 
     * @param inputs the inputs value to set.
     * @return the JobInputs object itself.
     */
    public JobInputs withInputs(List<JobInput> inputs) {
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
