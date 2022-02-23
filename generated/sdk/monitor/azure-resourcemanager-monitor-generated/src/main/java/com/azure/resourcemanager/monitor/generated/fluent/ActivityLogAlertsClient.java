// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActivityLogAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertPatchBody;

/** An instance of this class provides access to all the operations defined in ActivityLogAlertsClient. */
public interface ActivityLogAlertsClient {
    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner createOrUpdate(
        String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert);

    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String activityLogAlertName,
        ActivityLogAlertResourceInner activityLogAlert,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner getByResourceGroup(String resourceGroupName, String activityLogAlertName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> getByResourceGroupWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String activityLogAlertName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String activityLogAlertName, Context context);

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner update(
        String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBody activityLogAlertPatch);

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an activity log alert resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> updateWithResponse(
        String resourceGroupName,
        String activityLogAlertName,
        ActivityLogAlertPatchBody activityLogAlertPatch,
        Context context);

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> list();

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> list(Context context);

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all activity log alerts in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName, Context context);
}
