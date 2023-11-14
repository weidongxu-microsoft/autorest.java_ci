// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Instructions for rendering the data.
 */
@Fluent
public final class Rendering {
    /*
     * Rendering Type
     */
    @JsonProperty(value = "type")
    private RenderingType type;

    /*
     * Title of data
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Description of the data that will help it be interpreted
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of Rendering class.
     */
    public Rendering() {
    }

    /**
     * Get the type property: Rendering Type.
     * 
     * @return the type value.
     */
    public RenderingType type() {
        return this.type;
    }

    /**
     * Set the type property: Rendering Type.
     * 
     * @param type the type value to set.
     * @return the Rendering object itself.
     */
    public Rendering withType(RenderingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the title property: Title of data.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title of data.
     * 
     * @param title the title value to set.
     * @return the Rendering object itself.
     */
    public Rendering withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Description of the data that will help it be interpreted.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the data that will help it be interpreted.
     * 
     * @param description the description value to set.
     * @return the Rendering object itself.
     */
    public Rendering withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
