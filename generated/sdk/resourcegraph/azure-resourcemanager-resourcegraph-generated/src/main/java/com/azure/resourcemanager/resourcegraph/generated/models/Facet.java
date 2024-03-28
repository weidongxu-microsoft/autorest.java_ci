// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A facet containing additional statistics on the response of a query. Can be either FacetResult or FacetError.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "resultType", defaultImpl = Facet.class, visible = true)
@JsonTypeName("Facet")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FacetResult", value = FacetResult.class),
    @JsonSubTypes.Type(name = "FacetError", value = FacetError.class) })
@Fluent
public class Facet {
    /*
     * Result type
     */
    @JsonTypeId
    @JsonProperty(value = "resultType", required = true)
    private String resultType;

    /*
     * Facet expression, same as in the corresponding facet request.
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /**
     * Creates an instance of Facet class.
     */
    public Facet() {
        this.resultType = "Facet";
    }

    /**
     * Get the resultType property: Result type.
     * 
     * @return the resultType value.
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Get the expression property: Facet expression, same as in the corresponding facet request.
     * 
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: Facet expression, same as in the corresponding facet request.
     * 
     * @param expression the expression value to set.
     * @return the Facet object itself.
     */
    public Facet withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expression() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property expression in model Facet"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Facet.class);
}
