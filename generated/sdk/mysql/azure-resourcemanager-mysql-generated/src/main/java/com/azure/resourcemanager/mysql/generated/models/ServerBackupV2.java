// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupV2Inner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of ServerBackupV2.
 */
public interface ServerBackupV2 {
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
     * Gets the backupNameV2 property: Backup name.
     * 
     * @return the backupNameV2 value.
     */
    String backupNameV2();

    /**
     * Gets the backupType property: The backupType property.
     * 
     * @return the backupType value.
     */
    BackupType backupType();

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
     * Gets the provisioningState property: The provisioning state of backup resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupV2Inner object.
     * 
     * @return the inner object.
     */
    ServerBackupV2Inner innerModel();

    /**
     * The entirety of the ServerBackupV2 definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ServerBackupV2 definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ServerBackupV2 definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ServerBackupV2 definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingFlexibleServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the ServerBackupV2 definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithBackupNameV2, DefinitionStages.WithBackupType,
            DefinitionStages.WithCompletedTime, DefinitionStages.WithSource {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ServerBackupV2 create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerBackupV2 create(Context context);
        }

        /**
         * The stage of the ServerBackupV2 definition allowing to specify backupNameV2.
         */
        interface WithBackupNameV2 {
            /**
             * Specifies the backupNameV2 property: Backup name.
             * 
             * @param backupNameV2 Backup name.
             * @return the next definition stage.
             */
            WithCreate withBackupNameV2(String backupNameV2);
        }

        /**
         * The stage of the ServerBackupV2 definition allowing to specify backupType.
         */
        interface WithBackupType {
            /**
             * Specifies the backupType property: The backupType property..
             * 
             * @param backupType The backupType property.
             * @return the next definition stage.
             */
            WithCreate withBackupType(BackupType backupType);
        }

        /**
         * The stage of the ServerBackupV2 definition allowing to specify completedTime.
         */
        interface WithCompletedTime {
            /**
             * Specifies the completedTime property: Backup completed time (ISO8601 format)..
             * 
             * @param completedTime Backup completed time (ISO8601 format).
             * @return the next definition stage.
             */
            WithCreate withCompletedTime(OffsetDateTime completedTime);
        }

        /**
         * The stage of the ServerBackupV2 definition allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: Backup source.
             * 
             * @param source Backup source.
             * @return the next definition stage.
             */
            WithCreate withSource(String source);
        }
    }
}