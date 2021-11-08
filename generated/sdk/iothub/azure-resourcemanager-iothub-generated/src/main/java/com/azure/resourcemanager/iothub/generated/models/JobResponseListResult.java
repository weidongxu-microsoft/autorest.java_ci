// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.fluent.models.JobResponseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON-serialized array of JobResponse objects with a next link. */
@Fluent
public final class JobResponseListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobResponseListResult.class);

    /*
     * The array of JobResponse objects.
     */
    @JsonProperty(value = "value")
    private List<JobResponseInner> value;

    /*
     * The next link.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The array of JobResponse objects.
     *
     * @return the value value.
     */
    public List<JobResponseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of JobResponse objects.
     *
     * @param value the value value to set.
     * @return the JobResponseListResult object itself.
     */
    public JobResponseListResult withValue(List<JobResponseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
