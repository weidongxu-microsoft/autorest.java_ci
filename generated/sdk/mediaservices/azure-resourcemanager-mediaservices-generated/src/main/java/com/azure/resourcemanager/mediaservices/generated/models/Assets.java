// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Assets. */
public interface Assets {
    /**
     * List Assets
     *
     * <p>List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Asset> list(String resourceGroupName, String accountName);

    /**
     * List Assets
     *
     * <p>List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param orderby Specifies the key by which the result collection should be ordered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Asset items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Asset> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account.
     */
    Asset get(String resourceGroupName, String accountName, String assetName);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account along with {@link Response}.
     */
    Response<Asset> getWithResponse(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String assetName);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * List the Asset URLs
     *
     * <p>Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content.
     * The signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs.
     */
    AssetContainerSas listContainerSas(
        String resourceGroupName, String accountName, String assetName, ListContainerSasInput parameters);

    /**
     * List the Asset URLs
     *
     * <p>Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content.
     * The signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset Storage container SAS URLs along with {@link Response}.
     */
    Response<AssetContainerSas> listContainerSasWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        ListContainerSasInput parameters,
        Context context);

    /**
     * Gets the Asset storage key
     *
     * <p>Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     */
    StorageEncryptedAssetDecryptionData getEncryptionKey(
        String resourceGroupName, String accountName, String assetName);

    /**
     * Gets the Asset storage key
     *
     * <p>Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API
     *     along with {@link Response}.
     */
    Response<StorageEncryptedAssetDecryptionData> getEncryptionKeyWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * List Streaming Locators
     *
     * <p>Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset.
     */
    ListStreamingLocatorsResponse listStreamingLocators(String resourceGroupName, String accountName, String assetName);

    /**
     * List Streaming Locators
     *
     * <p>Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Streaming Locators associated with this Asset along with {@link Response}.
     */
    Response<ListStreamingLocatorsResponse> listStreamingLocatorsWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account along with {@link Response}.
     */
    Asset getById(String id);

    /**
     * Get an Asset
     *
     * <p>Get the details of an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset in the Media Services account along with {@link Response}.
     */
    Response<Asset> getByIdWithResponse(String id, Context context);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an Asset.
     *
     * <p>Deletes an Asset in the Media Services account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Asset resource.
     *
     * @param name resource name.
     * @return the first stage of the new Asset definition.
     */
    Asset.DefinitionStages.Blank define(String name);
}
