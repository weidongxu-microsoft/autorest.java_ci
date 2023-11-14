// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysql.generated.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * REST API operation definition.
 */
@Fluent
public final class OperationInner {
    /*
     * The name of the operation being performed on this particular object.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The localized display information for this particular operation or action.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Additional descriptions for the operation.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> properties;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: The name of the operation being performed on this particular object.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the operation being performed on this particular object.
     * 
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The localized display information for this particular operation or action.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The localized display information for this particular operation or action.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The intended executor of the operation.
     * 
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Additional descriptions for the operation.
     * 
     * @return the properties value.
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional descriptions for the operation.
     * 
     * @param properties the properties value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
