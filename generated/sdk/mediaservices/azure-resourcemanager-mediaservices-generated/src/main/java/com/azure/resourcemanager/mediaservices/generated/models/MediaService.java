// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceInner;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * An immutable client-side representation of MediaService.
 */
public interface MediaService {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the identity property: The Managed Identity for the Media Services account.
     * 
     * @return the identity value.
     */
    MediaServiceIdentity identity();

    /**
     * Gets the mediaServiceId property: The Media Services account ID.
     * 
     * @return the mediaServiceId value.
     */
    UUID mediaServiceId();

    /**
     * Gets the storageAccounts property: The storage accounts for this resource.
     * 
     * @return the storageAccounts value.
     */
    List<StorageAccount> storageAccounts();

    /**
     * Gets the storageAuthentication property: The storageAuthentication property.
     * 
     * @return the storageAuthentication value.
     */
    StorageAuthentication storageAuthentication();

    /**
     * Gets the encryption property: The account encryption properties.
     * 
     * @return the encryption value.
     */
    AccountEncryption encryption();

    /**
     * Gets the keyDelivery property: The Key Delivery properties for Media Services account.
     * 
     * @return the keyDelivery value.
     */
    KeyDelivery keyDelivery();

    /**
     * Gets the publicNetworkAccess property: Whether or not public network access is allowed for resources under the Media Services account.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the provisioningState property: Provisioning state of the Media Services account.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the privateEndpointConnections property: The Private Endpoint Connections created for the Media Service account.
     * 
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the minimumTlsVersion property: The minimum TLS version allowed for this account's requests. This is an optional property. If unspecified, a secure default value will be used.
     * 
     * @return the minimumTlsVersion value.
     */
    MinimumTlsVersion minimumTlsVersion();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceInner object.
     * 
     * @return the inner object.
     */
    MediaServiceInner innerModel();

    /**
     * The entirety of the MediaService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The MediaService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MediaService definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the MediaService definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the MediaService definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the MediaService definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithStorageAccounts, DefinitionStages.WithStorageAuthentication,
            DefinitionStages.WithEncryption, DefinitionStages.WithKeyDelivery, DefinitionStages.WithPublicNetworkAccess,
            DefinitionStages.WithMinimumTlsVersion {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MediaService create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MediaService create(Context context);
        }

        /**
         * The stage of the MediaService definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MediaService definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The Managed Identity for the Media Services account..
             * 
             * @param identity The Managed Identity for the Media Services account.
             * @return the next definition stage.
             */
            WithCreate withIdentity(MediaServiceIdentity identity);
        }

        /**
         * The stage of the MediaService definition allowing to specify storageAccounts.
         */
        interface WithStorageAccounts {
            /**
             * Specifies the storageAccounts property: The storage accounts for this resource..
             * 
             * @param storageAccounts The storage accounts for this resource.
             * @return the next definition stage.
             */
            WithCreate withStorageAccounts(List<StorageAccount> storageAccounts);
        }

        /**
         * The stage of the MediaService definition allowing to specify storageAuthentication.
         */
        interface WithStorageAuthentication {
            /**
             * Specifies the storageAuthentication property: The storageAuthentication property..
             * 
             * @param storageAuthentication The storageAuthentication property.
             * @return the next definition stage.
             */
            WithCreate withStorageAuthentication(StorageAuthentication storageAuthentication);
        }

        /**
         * The stage of the MediaService definition allowing to specify encryption.
         */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The account encryption properties..
             * 
             * @param encryption The account encryption properties.
             * @return the next definition stage.
             */
            WithCreate withEncryption(AccountEncryption encryption);
        }

        /**
         * The stage of the MediaService definition allowing to specify keyDelivery.
         */
        interface WithKeyDelivery {
            /**
             * Specifies the keyDelivery property: The Key Delivery properties for Media Services account..
             * 
             * @param keyDelivery The Key Delivery properties for Media Services account.
             * @return the next definition stage.
             */
            WithCreate withKeyDelivery(KeyDelivery keyDelivery);
        }

        /**
         * The stage of the MediaService definition allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for resources under the Media Services account..
             * 
             * @param publicNetworkAccess Whether or not public network access is allowed for resources under the Media Services account.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the MediaService definition allowing to specify minimumTlsVersion.
         */
        interface WithMinimumTlsVersion {
            /**
             * Specifies the minimumTlsVersion property: The minimum TLS version allowed for this account's requests. This is an optional property. If unspecified, a secure default value will be used..
             * 
             * @param minimumTlsVersion The minimum TLS version allowed for this account's requests. This is an optional property. If unspecified, a secure default value will be used.
             * @return the next definition stage.
             */
            WithCreate withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }
    }

    /**
     * Begins update for the MediaService resource.
     * 
     * @return the stage of resource update.
     */
    MediaService.Update update();

    /**
     * The template for MediaService update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithStorageAccounts,
        UpdateStages.WithStorageAuthentication, UpdateStages.WithEncryption, UpdateStages.WithKeyDelivery,
        UpdateStages.WithPublicNetworkAccess, UpdateStages.WithMinimumTlsVersion {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MediaService apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MediaService apply(Context context);
    }

    /**
     * The MediaService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MediaService update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MediaService update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The Managed Identity for the Media Services account..
             * 
             * @param identity The Managed Identity for the Media Services account.
             * @return the next definition stage.
             */
            Update withIdentity(MediaServiceIdentity identity);
        }

        /**
         * The stage of the MediaService update allowing to specify storageAccounts.
         */
        interface WithStorageAccounts {
            /**
             * Specifies the storageAccounts property: The storage accounts for this resource..
             * 
             * @param storageAccounts The storage accounts for this resource.
             * @return the next definition stage.
             */
            Update withStorageAccounts(List<StorageAccount> storageAccounts);
        }

        /**
         * The stage of the MediaService update allowing to specify storageAuthentication.
         */
        interface WithStorageAuthentication {
            /**
             * Specifies the storageAuthentication property: The storageAuthentication property..
             * 
             * @param storageAuthentication The storageAuthentication property.
             * @return the next definition stage.
             */
            Update withStorageAuthentication(StorageAuthentication storageAuthentication);
        }

        /**
         * The stage of the MediaService update allowing to specify encryption.
         */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The account encryption properties..
             * 
             * @param encryption The account encryption properties.
             * @return the next definition stage.
             */
            Update withEncryption(AccountEncryption encryption);
        }

        /**
         * The stage of the MediaService update allowing to specify keyDelivery.
         */
        interface WithKeyDelivery {
            /**
             * Specifies the keyDelivery property: The Key Delivery properties for Media Services account..
             * 
             * @param keyDelivery The Key Delivery properties for Media Services account.
             * @return the next definition stage.
             */
            Update withKeyDelivery(KeyDelivery keyDelivery);
        }

        /**
         * The stage of the MediaService update allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for resources under the Media Services account..
             * 
             * @param publicNetworkAccess Whether or not public network access is allowed for resources under the Media Services account.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the MediaService update allowing to specify minimumTlsVersion.
         */
        interface WithMinimumTlsVersion {
            /**
             * Specifies the minimumTlsVersion property: The minimum TLS version allowed for this account's requests. This is an optional property. If unspecified, a secure default value will be used..
             * 
             * @param minimumTlsVersion The minimum TLS version allowed for this account's requests. This is an optional property. If unspecified, a secure default value will be used.
             * @return the next definition stage.
             */
            Update withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MediaService refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MediaService refresh(Context context);

    /**
     * Synchronizes Storage Account Keys
     * 
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     * 
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> syncStorageKeysWithResponse(SyncStorageKeysInput parameters, Context context);

    /**
     * Synchronizes Storage Account Keys
     * 
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     * 
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncStorageKeys(SyncStorageKeysInput parameters);

    /**
     * List the media edge policies associated with the Media Services account.
     * 
     * List all the media edge policies associated with the Media Services account.
     * 
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<EdgePolicies> listEdgePoliciesWithResponse(ListEdgePoliciesInput parameters, Context context);

    /**
     * List the media edge policies associated with the Media Services account.
     * 
     * List all the media edge policies associated with the Media Services account.
     * 
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    EdgePolicies listEdgePolicies(ListEdgePoliciesInput parameters);
}
