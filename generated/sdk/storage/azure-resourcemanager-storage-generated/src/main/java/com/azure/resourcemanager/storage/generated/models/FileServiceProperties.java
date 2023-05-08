// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.FileServicePropertiesInner;

/** An immutable client-side representation of FileServiceProperties. */
public interface FileServiceProperties {
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
     * Gets the sku property: Sku name and tier.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the File service.
     *
     * @return the cors value.
     */
    CorsRules cors();

    /**
     * Gets the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     *
     * @return the shareDeleteRetentionPolicy value.
     */
    DeleteRetentionPolicy shareDeleteRetentionPolicy();

    /**
     * Gets the protocolSettings property: Protocol settings for file service.
     *
     * @return the protocolSettings value.
     */
    ProtocolSettings protocolSettings();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.FileServicePropertiesInner object.
     *
     * @return the inner object.
     */
    FileServicePropertiesInner innerModel();

    /** The entirety of the FileServiceProperties definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The FileServiceProperties definition stages. */
    interface DefinitionStages {
        /** The first stage of the FileServiceProperties definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the FileServiceProperties definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             *     names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the FileServiceProperties definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithCors,
                DefinitionStages.WithShareDeleteRetentionPolicy,
                DefinitionStages.WithProtocolSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FileServiceProperties create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FileServiceProperties create(Context context);
        }

        /** The stage of the FileServiceProperties definition allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Specifies CORS rules for the File service. You can include up to five
             * CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS
             * rules will be deleted, and CORS will be disabled for the File service..
             *
             * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in
             *     the request. If no CorsRule elements are included in the request body, all CORS rules will be
             *     deleted, and CORS will be disabled for the File service.
             * @return the next definition stage.
             */
            WithCreate withCors(CorsRules cors);
        }

        /** The stage of the FileServiceProperties definition allowing to specify shareDeleteRetentionPolicy. */
        interface WithShareDeleteRetentionPolicy {
            /**
             * Specifies the shareDeleteRetentionPolicy property: The file service properties for share soft delete..
             *
             * @param shareDeleteRetentionPolicy The file service properties for share soft delete.
             * @return the next definition stage.
             */
            WithCreate withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy);
        }

        /** The stage of the FileServiceProperties definition allowing to specify protocolSettings. */
        interface WithProtocolSettings {
            /**
             * Specifies the protocolSettings property: Protocol settings for file service.
             *
             * @param protocolSettings Protocol settings for file service.
             * @return the next definition stage.
             */
            WithCreate withProtocolSettings(ProtocolSettings protocolSettings);
        }
    }

    /**
     * Begins update for the FileServiceProperties resource.
     *
     * @return the stage of resource update.
     */
    FileServiceProperties.Update update();

    /** The template for FileServiceProperties update. */
    interface Update
        extends UpdateStages.WithCors, UpdateStages.WithShareDeleteRetentionPolicy, UpdateStages.WithProtocolSettings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FileServiceProperties apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FileServiceProperties apply(Context context);
    }

    /** The FileServiceProperties update stages. */
    interface UpdateStages {
        /** The stage of the FileServiceProperties update allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Specifies CORS rules for the File service. You can include up to five
             * CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS
             * rules will be deleted, and CORS will be disabled for the File service..
             *
             * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in
             *     the request. If no CorsRule elements are included in the request body, all CORS rules will be
             *     deleted, and CORS will be disabled for the File service.
             * @return the next definition stage.
             */
            Update withCors(CorsRules cors);
        }

        /** The stage of the FileServiceProperties update allowing to specify shareDeleteRetentionPolicy. */
        interface WithShareDeleteRetentionPolicy {
            /**
             * Specifies the shareDeleteRetentionPolicy property: The file service properties for share soft delete..
             *
             * @param shareDeleteRetentionPolicy The file service properties for share soft delete.
             * @return the next definition stage.
             */
            Update withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy);
        }

        /** The stage of the FileServiceProperties update allowing to specify protocolSettings. */
        interface WithProtocolSettings {
            /**
             * Specifies the protocolSettings property: Protocol settings for file service.
             *
             * @param protocolSettings Protocol settings for file service.
             * @return the next definition stage.
             */
            Update withProtocolSettings(ProtocolSettings protocolSettings);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FileServiceProperties refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FileServiceProperties refresh(Context context);
}
