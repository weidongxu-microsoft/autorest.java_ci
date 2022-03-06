// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private link scope resource reference. */
@Fluent
public final class PrivateLinkScopedResource {
    /*
     * The full resource Id of the private link scope resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The private link scope unique Identifier.
     */
    @JsonProperty(value = "scopeId")
    private String scopeId;

    /**
     * Get the resourceId property: The full resource Id of the private link scope resource.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The full resource Id of the private link scope resource.
     *
     * @param resourceId the resourceId value to set.
     * @return the PrivateLinkScopedResource object itself.
     */
    public PrivateLinkScopedResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the scopeId property: The private link scope unique Identifier.
     *
     * @return the scopeId value.
     */
    public String scopeId() {
        return this.scopeId;
    }

    /**
     * Set the scopeId property: The private link scope unique Identifier.
     *
     * @param scopeId the scopeId value to set.
     * @return the PrivateLinkScopedResource object itself.
     */
    public PrivateLinkScopedResource withScopeId(String scopeId) {
        this.scopeId = scopeId;
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
