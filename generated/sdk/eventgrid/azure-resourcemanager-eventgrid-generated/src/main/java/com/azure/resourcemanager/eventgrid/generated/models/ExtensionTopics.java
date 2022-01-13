// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExtensionTopics. */
public interface ExtensionTopics {
    /**
     * Get the properties of an extension topic.
     *
     * @param scope The identifier of the resource to which extension topic is queried. The scope can be a subscription,
     *     or a resource group, or a top level resource belonging to a resource provider namespace. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for Azure resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an extension topic.
     */
    ExtensionTopic get(String scope);

    /**
     * Get the properties of an extension topic.
     *
     * @param scope The identifier of the resource to which extension topic is queried. The scope can be a subscription,
     *     or a resource group, or a top level resource belonging to a resource provider namespace. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for Azure resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an extension topic along with {@link Response}.
     */
    Response<ExtensionTopic> getWithResponse(String scope, Context context);
}
