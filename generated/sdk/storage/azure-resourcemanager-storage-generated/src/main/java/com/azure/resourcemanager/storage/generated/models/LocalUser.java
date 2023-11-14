// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.LocalUserInner;
import java.util.List;

/**
 * An immutable client-side representation of LocalUser.
 */
public interface LocalUser {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the permissionScopes property: The permission scopes of the local user.
     * 
     * @return the permissionScopes value.
     */
    List<PermissionScope> permissionScopes();

    /**
     * Gets the homeDirectory property: Optional, local user home directory.
     * 
     * @return the homeDirectory value.
     */
    String homeDirectory();

    /**
     * Gets the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     * 
     * @return the sshAuthorizedKeys value.
     */
    List<SshPublicKey> sshAuthorizedKeys();

    /**
     * Gets the sid property: A unique Security Identifier that is generated by the server.
     * 
     * @return the sid value.
     */
    String sid();

    /**
     * Gets the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     * 
     * @return the hasSharedKey value.
     */
    Boolean hasSharedKey();

    /**
     * Gets the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     * @return the hasSshKey value.
     */
    Boolean hasSshKey();

    /**
     * Gets the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     * 
     * @return the hasSshPassword value.
     */
    Boolean hasSshPassword();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.LocalUserInner object.
     * 
     * @return the inner object.
     */
    LocalUserInner innerModel();

    /**
     * The entirety of the LocalUser definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The LocalUser definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the LocalUser definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the LocalUser definition allowing to specify parent resource.
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
         * The stage of the LocalUser definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPermissionScopes, DefinitionStages.WithHomeDirectory,
            DefinitionStages.WithSshAuthorizedKeys, DefinitionStages.WithHasSharedKey, DefinitionStages.WithHasSshKey,
            DefinitionStages.WithHasSshPassword {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            LocalUser create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LocalUser create(Context context);
        }

        /**
         * The stage of the LocalUser definition allowing to specify permissionScopes.
         */
        interface WithPermissionScopes {
            /**
             * Specifies the permissionScopes property: The permission scopes of the local user..
             * 
             * @param permissionScopes The permission scopes of the local user.
             * @return the next definition stage.
             */
            WithCreate withPermissionScopes(List<PermissionScope> permissionScopes);
        }

        /**
         * The stage of the LocalUser definition allowing to specify homeDirectory.
         */
        interface WithHomeDirectory {
            /**
             * Specifies the homeDirectory property: Optional, local user home directory..
             * 
             * @param homeDirectory Optional, local user home directory.
             * @return the next definition stage.
             */
            WithCreate withHomeDirectory(String homeDirectory);
        }

        /**
         * The stage of the LocalUser definition allowing to specify sshAuthorizedKeys.
         */
        interface WithSshAuthorizedKeys {
            /**
             * Specifies the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP..
             * 
             * @param sshAuthorizedKeys Optional, local user ssh authorized keys for SFTP.
             * @return the next definition stage.
             */
            WithCreate withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys);
        }

        /**
         * The stage of the LocalUser definition allowing to specify hasSharedKey.
         */
        interface WithHasSharedKey {
            /**
             * Specifies the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove
             * existing shared key..
             * 
             * @param hasSharedKey Indicates whether shared key exists. Set it to false to remove existing shared key.
             * @return the next definition stage.
             */
            WithCreate withHasSharedKey(Boolean hasSharedKey);
        }

        /**
         * The stage of the LocalUser definition allowing to specify hasSshKey.
         */
        interface WithHasSshKey {
            /**
             * Specifies the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing
             * SSH key..
             * 
             * @param hasSshKey Indicates whether ssh key exists. Set it to false to remove existing SSH key.
             * @return the next definition stage.
             */
            WithCreate withHasSshKey(Boolean hasSshKey);
        }

        /**
         * The stage of the LocalUser definition allowing to specify hasSshPassword.
         */
        interface WithHasSshPassword {
            /**
             * Specifies the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove
             * existing SSH password..
             * 
             * @param hasSshPassword Indicates whether ssh password exists. Set it to false to remove existing SSH
             * password.
             * @return the next definition stage.
             */
            WithCreate withHasSshPassword(Boolean hasSshPassword);
        }
    }

    /**
     * Begins update for the LocalUser resource.
     * 
     * @return the stage of resource update.
     */
    LocalUser.Update update();

    /**
     * The template for LocalUser update.
     */
    interface Update
        extends UpdateStages.WithPermissionScopes, UpdateStages.WithHomeDirectory, UpdateStages.WithSshAuthorizedKeys,
        UpdateStages.WithHasSharedKey, UpdateStages.WithHasSshKey, UpdateStages.WithHasSshPassword {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        LocalUser apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LocalUser apply(Context context);
    }

    /**
     * The LocalUser update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the LocalUser update allowing to specify permissionScopes.
         */
        interface WithPermissionScopes {
            /**
             * Specifies the permissionScopes property: The permission scopes of the local user..
             * 
             * @param permissionScopes The permission scopes of the local user.
             * @return the next definition stage.
             */
            Update withPermissionScopes(List<PermissionScope> permissionScopes);
        }

        /**
         * The stage of the LocalUser update allowing to specify homeDirectory.
         */
        interface WithHomeDirectory {
            /**
             * Specifies the homeDirectory property: Optional, local user home directory..
             * 
             * @param homeDirectory Optional, local user home directory.
             * @return the next definition stage.
             */
            Update withHomeDirectory(String homeDirectory);
        }

        /**
         * The stage of the LocalUser update allowing to specify sshAuthorizedKeys.
         */
        interface WithSshAuthorizedKeys {
            /**
             * Specifies the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP..
             * 
             * @param sshAuthorizedKeys Optional, local user ssh authorized keys for SFTP.
             * @return the next definition stage.
             */
            Update withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys);
        }

        /**
         * The stage of the LocalUser update allowing to specify hasSharedKey.
         */
        interface WithHasSharedKey {
            /**
             * Specifies the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove
             * existing shared key..
             * 
             * @param hasSharedKey Indicates whether shared key exists. Set it to false to remove existing shared key.
             * @return the next definition stage.
             */
            Update withHasSharedKey(Boolean hasSharedKey);
        }

        /**
         * The stage of the LocalUser update allowing to specify hasSshKey.
         */
        interface WithHasSshKey {
            /**
             * Specifies the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing
             * SSH key..
             * 
             * @param hasSshKey Indicates whether ssh key exists. Set it to false to remove existing SSH key.
             * @return the next definition stage.
             */
            Update withHasSshKey(Boolean hasSshKey);
        }

        /**
         * The stage of the LocalUser update allowing to specify hasSshPassword.
         */
        interface WithHasSshPassword {
            /**
             * Specifies the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove
             * existing SSH password..
             * 
             * @param hasSshPassword Indicates whether ssh password exists. Set it to false to remove existing SSH
             * password.
             * @return the next definition stage.
             */
            Update withHasSshPassword(Boolean hasSshPassword);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    LocalUser refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LocalUser refresh(Context context);

    /**
     * List SSH authorized keys and shared key of the local user.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys along with {@link Response}.
     */
    Response<LocalUserKeys> listKeysWithResponse(Context context);

    /**
     * List SSH authorized keys and shared key of the local user.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys.
     */
    LocalUserKeys listKeys();

    /**
     * Regenerate the local user SSH password.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User along with {@link Response}.
     */
    Response<LocalUserRegeneratePasswordResult> regeneratePasswordWithResponse(Context context);

    /**
     * Regenerate the local user SSH password.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User.
     */
    LocalUserRegeneratePasswordResult regeneratePassword();
}
