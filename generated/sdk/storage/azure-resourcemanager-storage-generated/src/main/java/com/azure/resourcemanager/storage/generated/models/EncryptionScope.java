// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.EncryptionScopeInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of EncryptionScope.
 */
public interface EncryptionScope {
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
     * Gets the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     * 
     * @return the source value.
     */
    EncryptionScopeSource source();

    /**
     * Gets the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled,
     * Disabled.
     * 
     * @return the state value.
     */
    EncryptionScopeState state();

    /**
     * Gets the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     * 
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     * 
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     * @return the keyVaultProperties value.
     */
    EncryptionScopeKeyVaultProperties keyVaultProperties();

    /**
     * Gets the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     * 
     * @return the requireInfrastructureEncryption value.
     */
    Boolean requireInfrastructureEncryption();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.EncryptionScopeInner object.
     * 
     * @return the inner object.
     */
    EncryptionScopeInner innerModel();

    /**
     * The entirety of the EncryptionScope definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The EncryptionScope definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the EncryptionScope definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the EncryptionScope definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             * 
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             * insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             * names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the EncryptionScope definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithSource, DefinitionStages.WithState,
            DefinitionStages.WithKeyVaultProperties, DefinitionStages.WithRequireInfrastructureEncryption {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            EncryptionScope create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EncryptionScope create(Context context);
        }

        /**
         * The stage of the EncryptionScope definition allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: The provider for the encryption scope. Possible values (case-insensitive):
             * Microsoft.Storage, Microsoft.KeyVault..
             * 
             * @param source The provider for the encryption scope. Possible values (case-insensitive):
             * Microsoft.Storage, Microsoft.KeyVault.
             * @return the next definition stage.
             */
            WithCreate withSource(EncryptionScopeSource source);
        }

        /**
         * The stage of the EncryptionScope definition allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: The state of the encryption scope. Possible values (case-insensitive):
             * Enabled, Disabled..
             * 
             * @param state The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
             * @return the next definition stage.
             */
            WithCreate withState(EncryptionScopeState state);
        }

        /**
         * The stage of the EncryptionScope definition allowing to specify keyVaultProperties.
         */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: The key vault properties for the encryption scope. This is a
             * required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'..
             * 
             * @param keyVaultProperties The key vault properties for the encryption scope. This is a required field if
             * encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties);
        }

        /**
         * The stage of the EncryptionScope definition allowing to specify requireInfrastructureEncryption.
         */
        interface WithRequireInfrastructureEncryption {
            /**
             * Specifies the requireInfrastructureEncryption property: A boolean indicating whether or not the service
             * applies a secondary layer of encryption with platform managed keys for data at rest..
             * 
             * @param requireInfrastructureEncryption A boolean indicating whether or not the service applies a
             * secondary layer of encryption with platform managed keys for data at rest.
             * @return the next definition stage.
             */
            WithCreate withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption);
        }
    }

    /**
     * Begins update for the EncryptionScope resource.
     * 
     * @return the stage of resource update.
     */
    EncryptionScope.Update update();

    /**
     * The template for EncryptionScope update.
     */
    interface Update extends UpdateStages.WithSource, UpdateStages.WithState, UpdateStages.WithKeyVaultProperties,
        UpdateStages.WithRequireInfrastructureEncryption {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        EncryptionScope apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EncryptionScope apply(Context context);
    }

    /**
     * The EncryptionScope update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the EncryptionScope update allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: The provider for the encryption scope. Possible values (case-insensitive):
             * Microsoft.Storage, Microsoft.KeyVault..
             * 
             * @param source The provider for the encryption scope. Possible values (case-insensitive):
             * Microsoft.Storage, Microsoft.KeyVault.
             * @return the next definition stage.
             */
            Update withSource(EncryptionScopeSource source);
        }

        /**
         * The stage of the EncryptionScope update allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: The state of the encryption scope. Possible values (case-insensitive):
             * Enabled, Disabled..
             * 
             * @param state The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
             * @return the next definition stage.
             */
            Update withState(EncryptionScopeState state);
        }

        /**
         * The stage of the EncryptionScope update allowing to specify keyVaultProperties.
         */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: The key vault properties for the encryption scope. This is a
             * required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'..
             * 
             * @param keyVaultProperties The key vault properties for the encryption scope. This is a required field if
             * encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
             * @return the next definition stage.
             */
            Update withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties);
        }

        /**
         * The stage of the EncryptionScope update allowing to specify requireInfrastructureEncryption.
         */
        interface WithRequireInfrastructureEncryption {
            /**
             * Specifies the requireInfrastructureEncryption property: A boolean indicating whether or not the service
             * applies a secondary layer of encryption with platform managed keys for data at rest..
             * 
             * @param requireInfrastructureEncryption A boolean indicating whether or not the service applies a
             * secondary layer of encryption with platform managed keys for data at rest.
             * @return the next definition stage.
             */
            Update withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    EncryptionScope refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EncryptionScope refresh(Context context);
}
