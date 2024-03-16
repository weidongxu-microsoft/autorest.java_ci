// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ContainerInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of Container.
 */
public interface Container {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of Container.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the containerStatus property: Current status of the container.
     * 
     * @return the containerStatus value.
     */
    ContainerStatus containerStatus();

    /**
     * Gets the dataFormat property: DataFormat for Container.
     * 
     * @return the dataFormat value.
     */
    AzureContainerDataFormat dataFormat();

    /**
     * Gets the refreshDetails property: Details of the refresh job on this container.
     * 
     * @return the refreshDetails value.
     */
    RefreshDetails refreshDetails();

    /**
     * Gets the createdDateTime property: The UTC time when container got created.
     * 
     * @return the createdDateTime value.
     */
    OffsetDateTime createdDateTime();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.ContainerInner object.
     * 
     * @return the inner object.
     */
    ContainerInner innerModel();

    /**
     * The entirety of the Container definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithDataFormat, DefinitionStages.WithCreate {
    }

    /**
     * The Container definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Container definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Container definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies deviceName, storageAccountName, resourceGroupName.
             * 
             * @param deviceName The device name.
             * @param storageAccountName The Storage Account Name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithDataFormat withExistingStorageAccount(String deviceName, String storageAccountName,
                String resourceGroupName);
        }

        /**
         * The stage of the Container definition allowing to specify dataFormat.
         */
        interface WithDataFormat {
            /**
             * Specifies the dataFormat property: DataFormat for Container.
             * 
             * @param dataFormat DataFormat for Container.
             * @return the next definition stage.
             */
            WithCreate withDataFormat(AzureContainerDataFormat dataFormat);
        }

        /**
         * The stage of the Container definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Container create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Container create(Context context);
        }
    }

    /**
     * Begins update for the Container resource.
     * 
     * @return the stage of resource update.
     */
    Container.Update update();

    /**
     * The template for Container update.
     */
    interface Update extends UpdateStages.WithDataFormat {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Container apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Container apply(Context context);
    }

    /**
     * The Container update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Container update allowing to specify dataFormat.
         */
        interface WithDataFormat {
            /**
             * Specifies the dataFormat property: DataFormat for Container.
             * 
             * @param dataFormat DataFormat for Container.
             * @return the next definition stage.
             */
            Update withDataFormat(AzureContainerDataFormat dataFormat);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Container refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Container refresh(Context context);
}
