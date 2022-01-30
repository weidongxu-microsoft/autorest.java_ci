// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ActionGroups. */
public interface ActionGroups {
    /**
     * Get an action group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group.
     */
    ActionGroupResource getByResourceGroup(String resourceGroupName, String actionGroupName);

    /**
     * Get an action group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    Response<ActionGroupResource> getByResourceGroupWithResponse(
        String resourceGroupName, String actionGroupName, Context context);

    /**
     * Delete an action group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String actionGroupName);

    /**
     * Delete an action group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String actionGroupName, Context context);

    /**
     * Get a list of all action groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> list();

    /**
     * Get a list of all action groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> list(Context context);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all action groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all action groups in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Enable a receiver in an action group. This changes the receiver's status from Disabled to Enabled. This operation
     * is only supported for Email or SMS receivers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @param enableRequest The receiver to re-enable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableReceiver(String resourceGroupName, String actionGroupName, EnableRequest enableRequest);

    /**
     * Enable a receiver in an action group. This changes the receiver's status from Disabled to Enabled. This operation
     * is only supported for Email or SMS receivers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param actionGroupName The name of the action group.
     * @param enableRequest The receiver to re-enable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableReceiverWithResponse(
        String resourceGroupName, String actionGroupName, EnableRequest enableRequest, Context context);

    /**
     * Get an action group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    ActionGroupResource getById(String id);

    /**
     * Get an action group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an action group along with {@link Response}.
     */
    Response<ActionGroupResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete an action group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an action group.
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
     * Begins definition for a new ActionGroupResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ActionGroupResource definition.
     */
    ActionGroupResource.DefinitionStages.Blank define(String name);
}
