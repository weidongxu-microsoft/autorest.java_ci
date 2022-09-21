// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The autoscale configuration update parameter. */
@Fluent
public final class AutoscaleConfigurationUpdateParameter {
    /*
     * The autoscale configuration.
     */
    @JsonProperty(value = "autoscale")
    private Autoscale autoscale;

    /** Creates an instance of AutoscaleConfigurationUpdateParameter class. */
    public AutoscaleConfigurationUpdateParameter() {
    }

    /**
     * Get the autoscale property: The autoscale configuration.
     *
     * @return the autoscale value.
     */
    public Autoscale autoscale() {
        return this.autoscale;
    }

    /**
     * Set the autoscale property: The autoscale configuration.
     *
     * @param autoscale the autoscale value to set.
     * @return the AutoscaleConfigurationUpdateParameter object itself.
     */
    public AutoscaleConfigurationUpdateParameter withAutoscale(Autoscale autoscale) {
        this.autoscale = autoscale;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoscale() != null) {
            autoscale().validate();
        }
    }
}
