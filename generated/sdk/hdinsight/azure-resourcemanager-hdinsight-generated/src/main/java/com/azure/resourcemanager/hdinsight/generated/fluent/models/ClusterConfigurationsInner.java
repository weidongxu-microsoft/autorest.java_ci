// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The configuration object for the specified cluster.
 */
@Fluent
public final class ClusterConfigurationsInner {
    /*
     * The configuration object for the specified configuration for the specified cluster.
     */
    @JsonProperty(value = "configurations")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Map<String, String>> configurations;

    /**
     * Creates an instance of ClusterConfigurationsInner class.
     */
    public ClusterConfigurationsInner() {
    }

    /**
     * Get the configurations property: The configuration object for the specified configuration for the specified cluster.
     * 
     * @return the configurations value.
     */
    public Map<String, Map<String, String>> configurations() {
        return this.configurations;
    }

    /**
     * Set the configurations property: The configuration object for the specified configuration for the specified cluster.
     * 
     * @param configurations the configurations value to set.
     * @return the ClusterConfigurationsInner object itself.
     */
    public ClusterConfigurationsInner withConfigurations(Map<String, Map<String, String>> configurations) {
        this.configurations = configurations;
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
