// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcegraph.generated.models.ResultKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties that contain a graph query.
 */
@Fluent
public final class GraphQueryProperties {
    /*
     * Date and time in UTC of the last modification that was made to this graph query definition.
     */
    @JsonProperty(value = "timeModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeModified;

    /*
     * The description of a graph query.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * KQL query that will be graph.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * Enum indicating a type of graph query.
     */
    @JsonProperty(value = "resultKind", access = JsonProperty.Access.WRITE_ONLY)
    private ResultKind resultKind;

    /**
     * Creates an instance of GraphQueryProperties class.
     */
    public GraphQueryProperties() {
    }

    /**
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this graph query
     * definition.
     * 
     * @return the timeModified value.
     */
    public OffsetDateTime timeModified() {
        return this.timeModified;
    }

    /**
     * Get the description property: The description of a graph query.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of a graph query.
     * 
     * @param description the description value to set.
     * @return the GraphQueryProperties object itself.
     */
    public GraphQueryProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the query property: KQL query that will be graph.
     * 
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: KQL query that will be graph.
     * 
     * @param query the query value to set.
     * @return the GraphQueryProperties object itself.
     */
    public GraphQueryProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the resultKind property: Enum indicating a type of graph query.
     * 
     * @return the resultKind value.
     */
    public ResultKind resultKind() {
        return this.resultKind;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (query() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property query in model GraphQueryProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GraphQueryProperties.class);
}
