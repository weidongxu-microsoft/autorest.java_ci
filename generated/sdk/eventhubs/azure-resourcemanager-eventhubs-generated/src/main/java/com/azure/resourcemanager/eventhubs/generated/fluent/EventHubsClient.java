// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner;
import com.azure.resourcemanager.eventhubs.generated.models.RegenerateAccessKeyParameters;

/** An instance of this class provides access to all the operations defined in EventHubsClient. */
public interface EventHubsClient {
    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for an Event Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for an Event Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);

    /**
     * Creates or updates an AuthorizationRule for the specified Event Hub. Creation/update of the AuthorizationRule
     * will take a few seconds to take effect.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access AuthorizationRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters);

    /**
     * Creates or updates an AuthorizationRule for the specified Event Hub. Creation/update of the AuthorizationRule
     * will take a few seconds to take effect.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The shared access AuthorizationRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context);

    /**
     * Gets an AuthorizationRule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for an Event Hub by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for an Event Hub by rule name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Deletes an Event Hub AuthorizationRule.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Deletes an Event Hub AuthorizationRule.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ACS and SAS connection strings for the Event Hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(
        String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ACS and SAS connection strings for the Event Hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the AuthorizationRule Keys (PrimaryKey/SecondaryKey).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the AuthorizationRule Keys (PrimaryKey/SecondaryKey).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Gets all the Event Hubs in a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventhubInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets all the Event Hubs in a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventhubInner> listByNamespace(
        String resourceGroupName, String namespaceName, Integer skip, Integer top, Context context);

    /**
     * Creates or updates a new Event Hub as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Event Hub operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventhubInner createOrUpdate(
        String resourceGroupName, String namespaceName, String eventHubName, EventhubInner parameters);

    /**
     * Creates or updates a new Event Hub as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Event Hub operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventhubInner> createOrUpdateWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, EventhubInner parameters, Context context);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventhubInner get(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Event Hubs description for the specified Event Hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventhubInner> getWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, Context context);
}
