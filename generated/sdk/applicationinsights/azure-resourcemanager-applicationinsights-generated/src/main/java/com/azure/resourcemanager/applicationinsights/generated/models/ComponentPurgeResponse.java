// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ComponentPurgeResponseInner;

/**
 * An immutable client-side representation of ComponentPurgeResponse.
 */
public interface ComponentPurgeResponse {
    /**
     * Gets the operationId property: Id to use when querying for status for a particular purge operation.
     * 
     * @return the operationId value.
     */
    String operationId();

    /**
     * Gets the inner com.azure.resourcemanager.applicationinsights.generated.fluent.models.ComponentPurgeResponseInner
     * object.
     * 
     * @return the inner object.
     */
    ComponentPurgeResponseInner innerModel();
}
