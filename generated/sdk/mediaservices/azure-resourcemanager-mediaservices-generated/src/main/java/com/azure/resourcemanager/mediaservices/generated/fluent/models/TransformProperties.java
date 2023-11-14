// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.TransformOutput;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A Transform.
 */
@Fluent
public final class TransformProperties {
    /*
     * The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * An optional verbose description of the Transform.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * An array of one or more TransformOutputs that the Transform should generate.
     */
    @JsonProperty(value = "outputs", required = true)
    private List<TransformOutput> outputs;

    /**
     * Creates an instance of TransformProperties class.
     */
    public TransformProperties() {
    }

    /**
     * Get the created property: The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ'
     * format.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the description property: An optional verbose description of the Transform.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional verbose description of the Transform.
     * 
     * @param description the description value to set.
     * @return the TransformProperties object itself.
     */
    public TransformProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the lastModified property: The UTC date and time when the Transform was last updated, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the outputs property: An array of one or more TransformOutputs that the Transform should generate.
     * 
     * @return the outputs value.
     */
    public List<TransformOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: An array of one or more TransformOutputs that the Transform should generate.
     * 
     * @param outputs the outputs value to set.
     * @return the TransformProperties object itself.
     */
    public TransformProperties withOutputs(List<TransformOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outputs() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property outputs in model TransformProperties"));
        } else {
            outputs().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransformProperties.class);
}
