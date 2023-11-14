// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SnapshotInner;

/**
 * An immutable client-side representation of Snapshot.
 */
public interface Snapshot {
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
     * Gets the time property: The time the snapshot was taken.
     * 
     * @return the time value.
     */
    String time();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SnapshotInner object.
     * 
     * @return the inner object.
     */
    SnapshotInner innerModel();
}
