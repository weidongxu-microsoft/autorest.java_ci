// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.DdosProtectionPlanInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DdosProtectionPlansClient. */
public interface DdosProtectionPlansClient {
    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ddosProtectionPlanName);

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String ddosProtectionPlanName, Context context);

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ddosProtectionPlanName);

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ddosProtectionPlanName, Context context);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosProtectionPlanInner getByResourceGroup(String resourceGroupName, String ddosProtectionPlanName);

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DdosProtectionPlanInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ddosProtectionPlanName, Context context);

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DdosProtectionPlanInner>, DdosProtectionPlanInner> beginCreateOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlanInner parameters);

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DdosProtectionPlanInner>, DdosProtectionPlanInner> beginCreateOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlanInner parameters, Context context);

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosProtectionPlanInner createOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlanInner parameters);

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosProtectionPlanInner createOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlanInner parameters, Context context);

    /**
     * Update a DDoS protection plan tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the update DDoS protection plan resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosProtectionPlanInner updateTags(String resourceGroupName, String ddosProtectionPlanName, TagsObject parameters);

    /**
     * Update a DDoS protection plan tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters Parameters supplied to the update DDoS protection plan resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DdosProtectionPlanInner> updateTagsWithResponse(
        String resourceGroupName, String ddosProtectionPlanName, TagsObject parameters, Context context);

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DdosProtectionPlanInner> list();

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DdosProtectionPlanInner> list(Context context);

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DdosProtectionPlanInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DdosProtectionPlanInner> listByResourceGroup(String resourceGroupName, Context context);
}
