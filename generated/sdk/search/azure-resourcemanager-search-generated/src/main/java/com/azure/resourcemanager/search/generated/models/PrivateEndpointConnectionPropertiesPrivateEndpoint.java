// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private endpoint resource from Microsoft.Network provider. */
@Fluent
public final class PrivateEndpointConnectionPropertiesPrivateEndpoint {
    /*
     * The resource id of the private endpoint resource from Microsoft.Network
     * provider.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The resource id of the private endpoint resource from Microsoft.Network provider.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource id of the private endpoint resource from Microsoft.Network provider.
     *
     * @param id the id value to set.
     * @return the PrivateEndpointConnectionPropertiesPrivateEndpoint object itself.
     */
    public PrivateEndpointConnectionPropertiesPrivateEndpoint withId(String id) {
        this.id = id;
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
