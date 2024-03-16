// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.StorageMigrationResponseInner;

/**
 * An immutable client-side representation of StorageMigrationResponse.
 */
public interface StorageMigrationResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the operationId property: When server starts the migration process, it will return an operation ID identifying that particular migration operation.
     * 
     * @return the operationId value.
     */
    String operationId();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.StorageMigrationResponseInner object.
     * 
     * @return the inner object.
     */
    StorageMigrationResponseInner innerModel();
}
