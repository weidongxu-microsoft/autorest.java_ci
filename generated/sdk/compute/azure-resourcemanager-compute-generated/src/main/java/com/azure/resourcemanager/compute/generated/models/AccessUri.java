// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;

/**
 * An immutable client-side representation of AccessUri.
 */
public interface AccessUri {
    /**
     * Gets the accessSas property: A SAS uri for accessing a disk.
     * 
     * @return the accessSas value.
     */
    String accessSas();

    /**
     * Gets the securityDataAccessSas property: A SAS uri for accessing a VM guest state.
     * 
     * @return the securityDataAccessSas value.
     */
    String securityDataAccessSas();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner object.
     * 
     * @return the inner object.
     */
    AccessUriInner innerModel();
}
