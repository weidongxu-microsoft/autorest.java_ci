// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigurationSnapshotInfoInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of SiteConfigurationSnapshotInfo.
 */
public interface SiteConfigurationSnapshotInfo {
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
    OffsetDateTime time();

    /**
     * Gets the snapshotId property: The id of the snapshot.
     * 
     * @return the snapshotId value.
     */
    Integer snapshotId();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigurationSnapshotInfoInner
     * object.
     * 
     * @return the inner object.
     */
    SiteConfigurationSnapshotInfoInner innerModel();
}
