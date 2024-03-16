// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountCredentialInner;

/**
 * An immutable client-side representation of StorageAccountCredential.
 */
public interface StorageAccountCredential {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of StorageAccountCredential.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the alias property: Alias for the storage account.
     * 
     * @return the alias value.
     */
    String alias();

    /**
     * Gets the username property: Username for the storage account.
     * 
     * @return the username value.
     */
    String username();

    /**
     * Gets the accountKey property: Encrypted storage key.
     * 
     * @return the accountKey value.
     */
    AsymmetricEncryptedSecret accountKey();

    /**
     * Gets the connectionString property: Connection string for the storage account. Use this string if username and account key are not specified.
     * 
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * Gets the sslStatus property: Signifies whether SSL needs to be enabled or not.
     * 
     * @return the sslStatus value.
     */
    SslStatus sslStatus();

    /**
     * Gets the blobDomainName property: Blob end point for private clouds.
     * 
     * @return the blobDomainName value.
     */
    String blobDomainName();

    /**
     * Gets the accountType property: Type of storage accessed on the storage account.
     * 
     * @return the accountType value.
     */
    AccountType accountType();

    /**
     * Gets the storageAccountId property: Id of the storage account.
     * 
     * @return the storageAccountId value.
     */
    String storageAccountId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountCredentialInner object.
     * 
     * @return the inner object.
     */
    StorageAccountCredentialInner innerModel();

    /**
     * The entirety of the StorageAccountCredential definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithAlias,
        DefinitionStages.WithSslStatus, DefinitionStages.WithAccountType, DefinitionStages.WithCreate {
    }

    /**
     * The StorageAccountCredential definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the StorageAccountCredential definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies deviceName, resourceGroupName.
             * 
             * @param deviceName The device name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithAlias withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify alias.
         */
        interface WithAlias {
            /**
             * Specifies the alias property: Alias for the storage account..
             * 
             * @param alias Alias for the storage account.
             * @return the next definition stage.
             */
            WithSslStatus withAlias(String alias);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify sslStatus.
         */
        interface WithSslStatus {
            /**
             * Specifies the sslStatus property: Signifies whether SSL needs to be enabled or not..
             * 
             * @param sslStatus Signifies whether SSL needs to be enabled or not.
             * @return the next definition stage.
             */
            WithAccountType withSslStatus(SslStatus sslStatus);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify accountType.
         */
        interface WithAccountType {
            /**
             * Specifies the accountType property: Type of storage accessed on the storage account..
             * 
             * @param accountType Type of storage accessed on the storage account.
             * @return the next definition stage.
             */
            WithCreate withAccountType(AccountType accountType);
        }

        /**
         * The stage of the StorageAccountCredential definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithUsername, DefinitionStages.WithAccountKey,
            DefinitionStages.WithConnectionString, DefinitionStages.WithBlobDomainName,
            DefinitionStages.WithStorageAccountId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            StorageAccountCredential create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageAccountCredential create(Context context);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify username.
         */
        interface WithUsername {
            /**
             * Specifies the username property: Username for the storage account..
             * 
             * @param username Username for the storage account.
             * @return the next definition stage.
             */
            WithCreate withUsername(String username);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify accountKey.
         */
        interface WithAccountKey {
            /**
             * Specifies the accountKey property: Encrypted storage key..
             * 
             * @param accountKey Encrypted storage key.
             * @return the next definition stage.
             */
            WithCreate withAccountKey(AsymmetricEncryptedSecret accountKey);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify connectionString.
         */
        interface WithConnectionString {
            /**
             * Specifies the connectionString property: Connection string for the storage account. Use this string if username and account key are not specified..
             * 
             * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified.
             * @return the next definition stage.
             */
            WithCreate withConnectionString(String connectionString);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify blobDomainName.
         */
        interface WithBlobDomainName {
            /**
             * Specifies the blobDomainName property: Blob end point for private clouds..
             * 
             * @param blobDomainName Blob end point for private clouds.
             * @return the next definition stage.
             */
            WithCreate withBlobDomainName(String blobDomainName);
        }

        /**
         * The stage of the StorageAccountCredential definition allowing to specify storageAccountId.
         */
        interface WithStorageAccountId {
            /**
             * Specifies the storageAccountId property: Id of the storage account..
             * 
             * @param storageAccountId Id of the storage account.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountId(String storageAccountId);
        }
    }

    /**
     * Begins update for the StorageAccountCredential resource.
     * 
     * @return the stage of resource update.
     */
    StorageAccountCredential.Update update();

    /**
     * The template for StorageAccountCredential update.
     */
    interface Update extends UpdateStages.WithAlias, UpdateStages.WithUsername, UpdateStages.WithAccountKey,
        UpdateStages.WithConnectionString, UpdateStages.WithSslStatus, UpdateStages.WithBlobDomainName,
        UpdateStages.WithAccountType, UpdateStages.WithStorageAccountId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        StorageAccountCredential apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageAccountCredential apply(Context context);
    }

    /**
     * The StorageAccountCredential update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the StorageAccountCredential update allowing to specify alias.
         */
        interface WithAlias {
            /**
             * Specifies the alias property: Alias for the storage account..
             * 
             * @param alias Alias for the storage account.
             * @return the next definition stage.
             */
            Update withAlias(String alias);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify username.
         */
        interface WithUsername {
            /**
             * Specifies the username property: Username for the storage account..
             * 
             * @param username Username for the storage account.
             * @return the next definition stage.
             */
            Update withUsername(String username);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify accountKey.
         */
        interface WithAccountKey {
            /**
             * Specifies the accountKey property: Encrypted storage key..
             * 
             * @param accountKey Encrypted storage key.
             * @return the next definition stage.
             */
            Update withAccountKey(AsymmetricEncryptedSecret accountKey);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify connectionString.
         */
        interface WithConnectionString {
            /**
             * Specifies the connectionString property: Connection string for the storage account. Use this string if username and account key are not specified..
             * 
             * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified.
             * @return the next definition stage.
             */
            Update withConnectionString(String connectionString);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify sslStatus.
         */
        interface WithSslStatus {
            /**
             * Specifies the sslStatus property: Signifies whether SSL needs to be enabled or not..
             * 
             * @param sslStatus Signifies whether SSL needs to be enabled or not.
             * @return the next definition stage.
             */
            Update withSslStatus(SslStatus sslStatus);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify blobDomainName.
         */
        interface WithBlobDomainName {
            /**
             * Specifies the blobDomainName property: Blob end point for private clouds..
             * 
             * @param blobDomainName Blob end point for private clouds.
             * @return the next definition stage.
             */
            Update withBlobDomainName(String blobDomainName);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify accountType.
         */
        interface WithAccountType {
            /**
             * Specifies the accountType property: Type of storage accessed on the storage account..
             * 
             * @param accountType Type of storage accessed on the storage account.
             * @return the next definition stage.
             */
            Update withAccountType(AccountType accountType);
        }

        /**
         * The stage of the StorageAccountCredential update allowing to specify storageAccountId.
         */
        interface WithStorageAccountId {
            /**
             * Specifies the storageAccountId property: Id of the storage account..
             * 
             * @param storageAccountId Id of the storage account.
             * @return the next definition stage.
             */
            Update withStorageAccountId(String storageAccountId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    StorageAccountCredential refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageAccountCredential refresh(Context context);
}
