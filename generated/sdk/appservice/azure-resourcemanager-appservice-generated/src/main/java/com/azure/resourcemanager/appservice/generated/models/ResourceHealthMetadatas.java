// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceHealthMetadatas. */
public interface ResourceHealthMetadatas {
    /**
     * Description for List all ResourceHealthMetadata for all sites in the subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> list();

    /**
     * Description for List all ResourceHealthMetadata for all sites in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> list(Context context);

    /**
     * Description for List all ResourceHealthMetadata for all sites in the resource group in the subscription.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listByResourceGroup(String resourceGroupName);

    /**
     * Description for List all ResourceHealthMetadata for all sites in the resource group in the subscription.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site as a collection.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listBySite(String resourceGroupName, String name);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site as a collection.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listBySite(String resourceGroupName, String name, Context context);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used for getting ResourceHealthCheck settings.
     */
    ResourceHealthMetadata getBySite(String resourceGroupName, String name);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used for getting ResourceHealthCheck settings along with {@link Response}.
     */
    Response<ResourceHealthMetadata> getBySiteWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site as a collection.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listBySiteSlot(String resourceGroupName, String name, String slot);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site as a collection.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    PagedIterable<ResourceHealthMetadata> listBySiteSlot(
        String resourceGroupName, String name, String slot, Context context);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used for getting ResourceHealthCheck settings.
     */
    ResourceHealthMetadata getBySiteSlot(String resourceGroupName, String name, String slot);

    /**
     * Description for Gets the category of ResourceHealthMetadata to use for the given site.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of web app.
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used for getting ResourceHealthCheck settings along with {@link Response}.
     */
    Response<ResourceHealthMetadata> getBySiteSlotWithResponse(
        String resourceGroupName, String name, String slot, Context context);
}
