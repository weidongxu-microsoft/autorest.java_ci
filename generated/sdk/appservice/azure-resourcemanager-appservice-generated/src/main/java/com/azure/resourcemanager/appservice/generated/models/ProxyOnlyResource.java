// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure proxy only resource. This resource is not tracked by Azure Resource Manager.
 */
@Fluent
public class ProxyOnlyResource extends ProxyResource {
    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of ProxyOnlyResource class.
     */
    public ProxyOnlyResource() {
    }

    /**
     * Get the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     * 
     * @param kind the kind value to set.
     * @return the ProxyOnlyResource object itself.
     */
    public ProxyOnlyResource withKind(String kind) {
        this.kind = kind;
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
