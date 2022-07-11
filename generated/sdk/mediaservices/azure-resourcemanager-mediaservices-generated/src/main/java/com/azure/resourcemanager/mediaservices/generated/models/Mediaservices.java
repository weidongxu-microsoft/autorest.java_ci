// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Mediaservices. */
public interface Mediaservices {
    /**
     * List Media Services accounts
     *
     * <p>List Media Services accounts in the resource group.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MediaService> listByResourceGroup(String resourceGroupName);

    /**
     * List Media Services accounts
     *
     * <p>List Media Services accounts in the resource group.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MediaService> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a Media Services account
     *
     * <p>Get the details of a Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account.
     */
    MediaService getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get a Media Services account
     *
     * <p>Get the details of a Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account along with {@link Response}.
     */
    Response<MediaService> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Delete a Media Services account.
     *
     * <p>Deletes a Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Delete a Media Services account.
     *
     * <p>Deletes a Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Synchronizes Storage Account Keys
     *
     * <p>Synchronizes storage account keys for a storage account associated with the Media Service account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncStorageKeys(String resourceGroupName, String accountName, SyncStorageKeysInput parameters);

    /**
     * Synchronizes Storage Account Keys
     *
     * <p>Synchronizes storage account keys for a storage account associated with the Media Service account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> syncStorageKeysWithResponse(
        String resourceGroupName, String accountName, SyncStorageKeysInput parameters, Context context);

    /**
     * List the media edge policies associated with the Media Services account.
     *
     * <p>List all the media edge policies associated with the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    EdgePolicies listEdgePolicies(String resourceGroupName, String accountName, ListEdgePoliciesInput parameters);

    /**
     * List the media edge policies associated with the Media Services account.
     *
     * <p>List all the media edge policies associated with the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<EdgePolicies> listEdgePoliciesWithResponse(
        String resourceGroupName, String accountName, ListEdgePoliciesInput parameters, Context context);

    /**
     * List Media Services accounts
     *
     * <p>List Media Services accounts in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MediaService> list();

    /**
     * List Media Services accounts
     *
     * <p>List Media Services accounts in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MediaService> list(Context context);

    /**
     * Get a Media Services account
     *
     * <p>Get the details of a Media Services account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account along with {@link Response}.
     */
    MediaService getById(String id);

    /**
     * Get a Media Services account
     *
     * <p>Get the details of a Media Services account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account along with {@link Response}.
     */
    Response<MediaService> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Media Services account.
     *
     * <p>Deletes a Media Services account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Media Services account.
     *
     * <p>Deletes a Media Services account.
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
     * Begins definition for a new MediaService resource.
     *
     * @param name resource name.
     * @return the first stage of the new MediaService definition.
     */
    MediaService.DefinitionStages.Blank define(String name);
}
