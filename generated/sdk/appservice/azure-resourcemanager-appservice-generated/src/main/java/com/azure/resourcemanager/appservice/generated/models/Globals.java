// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/**
 * Resource collection API of Globals.
 */
public interface Globals {
    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app along with {@link Response}.
     */
    Response<DeletedSite> getDeletedWebAppWithResponse(String deletedSiteId, Context context);

    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    DeletedSite getDeletedWebApp(String deletedSiteId);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot along with {@link Response}.
     */
    Response<List<Snapshot>> getDeletedWebAppSnapshotsWithResponse(String deletedSiteId, Context context);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot.
     */
    List<Snapshot> getDeletedWebAppSnapshots(String deletedSiteId);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> getSubscriptionOperationWithAsyncResponseWithResponse(String location, String operationId,
        Context context);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getSubscriptionOperationWithAsyncResponse(String location, String operationId);
}
