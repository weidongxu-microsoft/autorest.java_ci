// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Container App versioned application definition. Defines the desired state of an immutable revision. Any changes to
 * this section Will result in a new revision being created.
 */
@Fluent
public final class Template {
    /*
     * User friendly suffix that is appended to the revision name
     */
    @JsonProperty(value = "revisionSuffix")
    private String revisionSuffix;

    /*
     * List of container definitions for the Container App.
     */
    @JsonProperty(value = "containers")
    private List<Container> containers;

    /*
     * Scaling properties for the Container App.
     */
    @JsonProperty(value = "scale")
    private Scale scale;

    /*
     * Dapr configuration for the Container App.
     */
    @JsonProperty(value = "dapr")
    private Dapr dapr;

    /** Creates an instance of Template class. */
    public Template() {
    }

    /**
     * Get the revisionSuffix property: User friendly suffix that is appended to the revision name.
     *
     * @return the revisionSuffix value.
     */
    public String revisionSuffix() {
        return this.revisionSuffix;
    }

    /**
     * Set the revisionSuffix property: User friendly suffix that is appended to the revision name.
     *
     * @param revisionSuffix the revisionSuffix value to set.
     * @return the Template object itself.
     */
    public Template withRevisionSuffix(String revisionSuffix) {
        this.revisionSuffix = revisionSuffix;
        return this;
    }

    /**
     * Get the containers property: List of container definitions for the Container App.
     *
     * @return the containers value.
     */
    public List<Container> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: List of container definitions for the Container App.
     *
     * @param containers the containers value to set.
     * @return the Template object itself.
     */
    public Template withContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the scale property: Scaling properties for the Container App.
     *
     * @return the scale value.
     */
    public Scale scale() {
        return this.scale;
    }

    /**
     * Set the scale property: Scaling properties for the Container App.
     *
     * @param scale the scale value to set.
     * @return the Template object itself.
     */
    public Template withScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Get the dapr property: Dapr configuration for the Container App.
     *
     * @return the dapr value.
     */
    public Dapr dapr() {
        return this.dapr;
    }

    /**
     * Set the dapr property: Dapr configuration for the Container App.
     *
     * @param dapr the dapr value to set.
     * @return the Template object itself.
     */
    public Template withDapr(Dapr dapr) {
        this.dapr = dapr;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containers() != null) {
            containers().forEach(e -> e.validate());
        }
        if (scale() != null) {
            scale().validate();
        }
        if (dapr() != null) {
            dapr().validate();
        }
    }
}
