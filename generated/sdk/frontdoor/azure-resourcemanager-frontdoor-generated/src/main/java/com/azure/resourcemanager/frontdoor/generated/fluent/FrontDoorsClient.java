// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontDoorInner;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ValidateCustomDomainOutputInner;
import com.azure.resourcemanager.frontdoor.generated.models.ValidateCustomDomainInput;

/** An instance of this class provides access to all the operations defined in FrontDoorsClient. */
public interface FrontDoorsClient {
    /**
     * Lists all of the Front Doors within an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontDoorInner> list();

    /**
     * Lists all of the Front Doors within an Azure subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontDoorInner> list(Context context);

    /**
     * Lists all of the Front Doors within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontDoorInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the Front Doors within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Front Doors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontDoorInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Front Door with the specified Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Front Door with the specified Front Door name under the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FrontDoorInner getByResourceGroup(String resourceGroupName, String frontDoorName);

    /**
     * Gets a Front Door with the specified Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Front Door with the specified Front Door name under the specified subscription and resource group along
     *     with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FrontDoorInner> getByResourceGroupWithResponse(
        String resourceGroupName, String frontDoorName, Context context);

    /**
     * Creates a new Front Door with a Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontDoorParameters Front Door properties needed to create a new Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of front Door represents a collection of backend endpoints to route
     *     traffic to along with rules that specify how traffic is sent there.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FrontDoorInner>, FrontDoorInner> beginCreateOrUpdate(
        String resourceGroupName, String frontDoorName, FrontDoorInner frontDoorParameters);

    /**
     * Creates a new Front Door with a Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontDoorParameters Front Door properties needed to create a new Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of front Door represents a collection of backend endpoints to route
     *     traffic to along with rules that specify how traffic is sent there.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FrontDoorInner>, FrontDoorInner> beginCreateOrUpdate(
        String resourceGroupName, String frontDoorName, FrontDoorInner frontDoorParameters, Context context);

    /**
     * Creates a new Front Door with a Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontDoorParameters Front Door properties needed to create a new Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return front Door represents a collection of backend endpoints to route traffic to along with rules that specify
     *     how traffic is sent there.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FrontDoorInner createOrUpdate(String resourceGroupName, String frontDoorName, FrontDoorInner frontDoorParameters);

    /**
     * Creates a new Front Door with a Front Door name under the specified subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontDoorParameters Front Door properties needed to create a new Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return front Door represents a collection of backend endpoints to route traffic to along with rules that specify
     *     how traffic is sent there.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FrontDoorInner createOrUpdate(
        String resourceGroupName, String frontDoorName, FrontDoorInner frontDoorParameters, Context context);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String frontDoorName);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String frontDoorName);

    /**
     * Deletes an existing Front Door with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct Front Door endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param customDomainProperties Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateCustomDomainOutputInner validateCustomDomain(
        String resourceGroupName, String frontDoorName, ValidateCustomDomainInput customDomainProperties);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct Front Door endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param customDomainProperties Custom domain to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateCustomDomainOutputInner> validateCustomDomainWithResponse(
        String resourceGroupName,
        String frontDoorName,
        ValidateCustomDomainInput customDomainProperties,
        Context context);
}
