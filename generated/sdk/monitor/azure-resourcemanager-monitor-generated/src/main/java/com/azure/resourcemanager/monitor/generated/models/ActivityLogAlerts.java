// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ActivityLogAlerts. */
public interface ActivityLogAlerts {
    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert.
     */
    ActivityLogAlertResource getByResourceGroup(String resourceGroupName, String activityLogAlertName);

    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert along with {@link Response}.
     */
    Response<ActivityLogAlertResource> getByResourceGroupWithResponse(
        String resourceGroupName, String activityLogAlertName, Context context);

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String activityLogAlertName);

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String activityLogAlertName, Context context);

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActivityLogAlertResource> list();

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActivityLogAlertResource> list(Context context);

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActivityLogAlertResource> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ActivityLogAlertResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get an activity log alert.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert along with {@link Response}.
     */
    ActivityLogAlertResource getById(String id);

    /**
     * Get an activity log alert.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert along with {@link Response}.
     */
    Response<ActivityLogAlertResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete an activity log alert.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an activity log alert.
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
     * Begins definition for a new ActivityLogAlertResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ActivityLogAlertResource definition.
     */
    ActivityLogAlertResource.DefinitionStages.Blank define(String name);
}
