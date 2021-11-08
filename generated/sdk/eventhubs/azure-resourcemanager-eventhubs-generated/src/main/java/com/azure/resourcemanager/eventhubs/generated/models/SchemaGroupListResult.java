// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.SchemaGroupInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of the List SchemaGroup operation. */
@Fluent
public final class SchemaGroupListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SchemaGroupListResult.class);

    /*
     * Result of the List SchemaGroups operation.
     */
    @JsonProperty(value = "value")
    private List<SchemaGroupInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of Schema Groups.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List SchemaGroups operation.
     *
     * @return the value value.
     */
    public List<SchemaGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List SchemaGroups operation.
     *
     * @param value the value value to set.
     * @return the SchemaGroupListResult object itself.
     */
    public SchemaGroupListResult withValue(List<SchemaGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of Schema
     * Groups.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of Schema
     * Groups.
     *
     * @param nextLink the nextLink value to set.
     * @return the SchemaGroupListResult object itself.
     */
    public SchemaGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
