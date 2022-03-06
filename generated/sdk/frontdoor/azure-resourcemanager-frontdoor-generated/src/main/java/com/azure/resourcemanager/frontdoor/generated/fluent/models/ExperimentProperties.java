// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.Endpoint;
import com.azure.resourcemanager.frontdoor.generated.models.NetworkExperimentResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the properties of an experiment. */
@Fluent
public final class ExperimentProperties {
    /*
     * The description of the details or intents of the Experiment
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The endpoint A of an experiment
     */
    @JsonProperty(value = "endpointA")
    private Endpoint endpointA;

    /*
     * The endpoint B of an experiment
     */
    @JsonProperty(value = "endpointB")
    private Endpoint endpointB;

    /*
     * The state of the Experiment
     */
    @JsonProperty(value = "enabledState")
    private State enabledState;

    /*
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkExperimentResourceState resourceState;

    /*
     * The description of Experiment status from the server side
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The uri to the Script used in the Experiment
     */
    @JsonProperty(value = "scriptFileUri", access = JsonProperty.Access.WRITE_ONLY)
    private String scriptFileUri;

    /**
     * Get the description property: The description of the details or intents of the Experiment.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the details or intents of the Experiment.
     *
     * @param description the description value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the endpointA property: The endpoint A of an experiment.
     *
     * @return the endpointA value.
     */
    public Endpoint endpointA() {
        return this.endpointA;
    }

    /**
     * Set the endpointA property: The endpoint A of an experiment.
     *
     * @param endpointA the endpointA value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withEndpointA(Endpoint endpointA) {
        this.endpointA = endpointA;
        return this;
    }

    /**
     * Get the endpointB property: The endpoint B of an experiment.
     *
     * @return the endpointB value.
     */
    public Endpoint endpointB() {
        return this.endpointB;
    }

    /**
     * Set the endpointB property: The endpoint B of an experiment.
     *
     * @param endpointB the endpointB value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withEndpointB(Endpoint endpointB) {
        this.endpointB = endpointB;
        return this;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     *
     * @param enabledState the enabledState value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withEnabledState(State enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    public NetworkExperimentResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the status property: The description of Experiment status from the server side.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the scriptFileUri property: The uri to the Script used in the Experiment.
     *
     * @return the scriptFileUri value.
     */
    public String scriptFileUri() {
        return this.scriptFileUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointA() != null) {
            endpointA().validate();
        }
        if (endpointB() != null) {
            endpointB().validate();
        }
    }
}
