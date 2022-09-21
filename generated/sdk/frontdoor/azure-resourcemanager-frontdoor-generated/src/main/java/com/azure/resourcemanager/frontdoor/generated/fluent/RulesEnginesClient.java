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
import com.azure.resourcemanager.frontdoor.generated.fluent.models.RulesEngineInner;

/** An instance of this class provides access to all the operations defined in RulesEnginesClient. */
public interface RulesEnginesClient {
    /**
     * Lists all of the Rules Engine Configurations within a Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Rules Engine Configurations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RulesEngineInner> listByFrontDoor(String resourceGroupName, String frontDoorName);

    /**
     * Lists all of the Rules Engine Configurations within a Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Rules Engine Configurations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RulesEngineInner> listByFrontDoor(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RulesEngineInner> getWithResponse(
        String resourceGroupName, String frontDoorName, String rulesEngineName, Context context);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RulesEngineInner get(String resourceGroupName, String frontDoorName, String rulesEngineName);

    /**
     * Creates a new Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param rulesEngineParameters Rules Engine Configuration properties needed to create a new Rules Engine
     *     Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a rules engine configuration containing a list of rules that will
     *     run to modify the runtime behavior of the request and response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RulesEngineInner>, RulesEngineInner> beginCreateOrUpdate(
        String resourceGroupName, String frontDoorName, String rulesEngineName, RulesEngineInner rulesEngineParameters);

    /**
     * Creates a new Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param rulesEngineParameters Rules Engine Configuration properties needed to create a new Rules Engine
     *     Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a rules engine configuration containing a list of rules that will
     *     run to modify the runtime behavior of the request and response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RulesEngineInner>, RulesEngineInner> beginCreateOrUpdate(
        String resourceGroupName,
        String frontDoorName,
        String rulesEngineName,
        RulesEngineInner rulesEngineParameters,
        Context context);

    /**
     * Creates a new Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param rulesEngineParameters Rules Engine Configuration properties needed to create a new Rules Engine
     *     Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a rules engine configuration containing a list of rules that will run to modify the runtime behavior of
     *     the request and response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RulesEngineInner createOrUpdate(
        String resourceGroupName, String frontDoorName, String rulesEngineName, RulesEngineInner rulesEngineParameters);

    /**
     * Creates a new Rules Engine Configuration with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param rulesEngineParameters Rules Engine Configuration properties needed to create a new Rules Engine
     *     Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a rules engine configuration containing a list of rules that will run to modify the runtime behavior of
     *     the request and response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RulesEngineInner createOrUpdate(
        String resourceGroupName,
        String frontDoorName,
        String rulesEngineName,
        RulesEngineInner rulesEngineParameters,
        Context context);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String frontDoorName, String rulesEngineName);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String frontDoorName, String rulesEngineName, Context context);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String frontDoorName, String rulesEngineName);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String frontDoorName, String rulesEngineName, Context context);
}
