// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.models.TriggerTypes;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StaticSiteFunctionOverviewARMResource resource specific properties.
 */
@Immutable
public final class StaticSiteFunctionOverviewArmResourceProperties {
    /*
     * The name for the function
     */
    @JsonProperty(value = "functionName", access = JsonProperty.Access.WRITE_ONLY)
    private String functionName;

    /*
     * The trigger type of the function
     */
    @JsonProperty(value = "triggerType", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerTypes triggerType;

    /**
     * Creates an instance of StaticSiteFunctionOverviewArmResourceProperties class.
     */
    public StaticSiteFunctionOverviewArmResourceProperties() {
    }

    /**
     * Get the functionName property: The name for the function.
     * 
     * @return the functionName value.
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Get the triggerType property: The trigger type of the function.
     * 
     * @return the triggerType value.
     */
    public TriggerTypes triggerType() {
        return this.triggerType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
