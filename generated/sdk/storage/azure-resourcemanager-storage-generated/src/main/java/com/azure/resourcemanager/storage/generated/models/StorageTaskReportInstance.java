// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.StorageTaskReportInstanceInner;

/**
 * An immutable client-side representation of StorageTaskReportInstance.
 */
public interface StorageTaskReportInstance {
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
     * Gets the properties property: Storage task execution report for a run instance.
     * 
     * @return the properties value.
     */
    StorageTaskReportProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.StorageTaskReportInstanceInner object.
     * 
     * @return the inner object.
     */
    StorageTaskReportInstanceInner innerModel();
}
