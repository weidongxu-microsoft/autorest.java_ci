// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.relay.generated.fluent.models.PrivateLinkResourcesListResultInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * Gets a description for the specified Private Endpoint Connection name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateLinkResourceName The PrivateLinkResource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified Private Endpoint Connection name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String namespaceName, String privateLinkResourceName);

    /**
     * Gets a description for the specified Private Endpoint Connection name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateLinkResourceName The PrivateLinkResource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified Private Endpoint Connection name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String namespaceName, String privateLinkResourceName, Context context);

    /**
     * Gets lists of resources that supports Privatelinks.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists of resources that supports Privatelinks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourcesListResultInner list(String resourceGroupName, String namespaceName);

    /**
     * Gets lists of resources that supports Privatelinks.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists of resources that supports Privatelinks along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourcesListResultInner> listWithResponse(
        String resourceGroupName, String namespaceName, Context context);
}