// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of ServerBackup.
 */
public interface ServerBackup {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the backupType property: Backup type.
     * 
     * @return the backupType value.
     */
    String backupType();

    /**
     * Gets the completedTime property: Backup completed time (ISO8601 format).
     * 
     * @return the completedTime value.
     */
    OffsetDateTime completedTime();

    /**
     * Gets the source property: Backup source.
     * 
     * @return the source value.
     */
    String source();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupInner object.
     * 
     * @return the inner object.
     */
    ServerBackupInner innerModel();
}
