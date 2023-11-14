// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of a private link resource.
 */
@Immutable
public final class PrivateLinkResourceProperties {
    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * The private link resource required member names.
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * The private link resource required zone names.
     */
    @JsonProperty(value = "requiredZoneNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredZoneNames;

    /**
     * Creates an instance of PrivateLinkResourceProperties class.
     */
    public PrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: The private link resource group id.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: The private link resource required zone names.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
