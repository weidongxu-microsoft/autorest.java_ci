// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Properties of the System Topic update.
 */
@Fluent
public final class SystemTopicUpdateParameters {
    /*
     * Tags of the system topic.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Resource identity information.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /**
     * Creates an instance of SystemTopicUpdateParameters class.
     */
    public SystemTopicUpdateParameters() {
    }

    /**
     * Get the tags property: Tags of the system topic.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the system topic.
     * 
     * @param tags the tags value to set.
     * @return the SystemTopicUpdateParameters object itself.
     */
    public SystemTopicUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Resource identity information.
     * 
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Resource identity information.
     * 
     * @param identity the identity value to set.
     * @return the SystemTopicUpdateParameters object itself.
     */
    public SystemTopicUpdateParameters withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
