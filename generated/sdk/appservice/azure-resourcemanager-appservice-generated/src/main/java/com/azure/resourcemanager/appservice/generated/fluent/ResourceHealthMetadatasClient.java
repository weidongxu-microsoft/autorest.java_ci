// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceHealthMetadataInner;

/** An instance of this class provides access to all the operations defined in ResourceHealthMetadatasClient. */
public interface ResourceHealthMetadatasClient {
    /**
     * Description for List all ResourceHealthMetadata for all sites in the subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of resource health metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> list();

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> list(Context context);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listByResourceGroup(String resourceGroupName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listByResourceGroup(String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listBySite(String resourceGroupName, String name);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listBySite(String resourceGroupName, String name, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceHealthMetadataInner getBySite(String resourceGroupName, String name);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceHealthMetadataInner> getBySiteWithResponse(String resourceGroupName, String name, Context context);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listBySiteSlot(String resourceGroupName, String name, String slot);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceHealthMetadataInner> listBySiteSlot(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceHealthMetadataInner getBySiteSlot(String resourceGroupName, String name, String slot);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceHealthMetadataInner> getBySiteSlotWithResponse(
        String resourceGroupName, String name, String slot, Context context);
}
