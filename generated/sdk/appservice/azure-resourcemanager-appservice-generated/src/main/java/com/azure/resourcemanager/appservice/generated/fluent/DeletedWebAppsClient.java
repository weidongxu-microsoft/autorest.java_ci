// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeletedSiteInner;

/** An instance of this class provides access to all the operations defined in DeletedWebAppsClient. */
public interface DeletedWebAppsClient {
    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedSiteInner> list();

    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedSiteInner> list(Context context);

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedSiteInner> listByLocation(String location);

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedSiteInner> listByLocation(String location, Context context);

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedSiteInner getDeletedWebAppByLocation(String location, String deletedSiteId);

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedSiteInner> getDeletedWebAppByLocationWithResponse(
        String location, String deletedSiteId, Context context);
}
