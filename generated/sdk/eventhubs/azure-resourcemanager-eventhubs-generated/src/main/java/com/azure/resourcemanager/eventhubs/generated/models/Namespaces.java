// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;

/**
 * Resource collection API of Namespaces.
 */
public interface Namespaces {
    /**
     * Lists all the available Namespaces within a subscription, irrespective of the resource groups.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EHNamespace> list();

    /**
     * Lists all the available Namespaces within a subscription, irrespective of the resource groups.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EHNamespace> list(Context context);

    /**
     * Lists the available Namespaces within a resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available Namespaces within a resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, Context context);

    /**
     * Gets the description of the specified namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace along with {@link Response}.
     */
    Response<EHNamespace> getByResourceGroupWithResponse(String resourceGroupName, String namespaceName,
        Context context);

    /**
     * Gets the description of the specified namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace.
     */
    EHNamespace getByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Create or update NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param parameters The Namespace IpFilterRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource along with {@link Response}.
     */
    Response<NetworkRuleSet> createOrUpdateNetworkRuleSetWithResponse(String resourceGroupName, String namespaceName,
        NetworkRuleSetInner parameters, Context context);

    /**
     * Create or update NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param parameters The Namespace IpFilterRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of topic resource.
     */
    NetworkRuleSet createOrUpdateNetworkRuleSet(String resourceGroupName, String namespaceName,
        NetworkRuleSetInner parameters);

    /**
     * Gets NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace along with {@link Response}.
     */
    Response<NetworkRuleSet> getNetworkRuleSetWithResponse(String resourceGroupName, String namespaceName,
        Context context);

    /**
     * Gets NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace.
     */
    NetworkRuleSet getNetworkRuleSet(String resourceGroupName, String namespaceName);

    /**
     * Gets NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace along with {@link Response}.
     */
    Response<NetworkRuleSetListResult> listNetworkRuleSetWithResponse(String resourceGroupName, String namespaceName,
        Context context);

    /**
     * Gets NetworkRuleSet for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkRuleSet for a Namespace.
     */
    NetworkRuleSetListResult listNetworkRuleSet(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of authorization rules for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of authorization rules for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of authorization rules for a Namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName,
        Context context);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name along with {@link Response}.
     */
    Response<AuthorizationRule> getAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name.
     */
    AuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName,
        String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace along with {@link Response}.
     */
    Response<AccessKeys> listKeysWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, Context context);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary connection strings for the Namespace.
     */
    AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Regenerates the primary or secondary connection strings for the specified Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String along with {@link Response}.
     */
    Response<AccessKeys> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String authorizationRuleName, RegenerateAccessKeyParameters parameters, Context context);

    /**
     * Regenerates the primary or secondary connection strings for the specified Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/EventHub Connection String.
     */
    AccessKeys regenerateKeys(String resourceGroupName, String namespaceName, String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Check the give Namespace name availability.
     * 
     * @param parameters Parameters to check availability of the given Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation along with {@link Response}.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(CheckNameAvailabilityParameter parameters,
        Context context);

    /**
     * Check the give Namespace name availability.
     * 
     * @param parameters Parameters to check availability of the given Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Result of the CheckNameAvailability operation.
     */
    CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailabilityParameter parameters);

    /**
     * Gets the description of the specified namespace.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace along with {@link Response}.
     */
    EHNamespace getById(String id);

    /**
     * Gets the description of the specified namespace.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of the specified namespace along with {@link Response}.
     */
    Response<EHNamespace> getByIdWithResponse(String id, Context context);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name along with {@link Response}.
     */
    AuthorizationRule getAuthorizationRuleById(String id);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AuthorizationRule for a Namespace by rule name along with {@link Response}.
     */
    Response<AuthorizationRule> getAuthorizationRuleByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRuleById(String id);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteAuthorizationRuleByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EHNamespace resource.
     * 
     * @param name resource name.
     * @return the first stage of the new EHNamespace definition.
     */
    EHNamespace.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new AuthorizationRule resource.
     * 
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    AuthorizationRule.DefinitionStages.Blank defineAuthorizationRule(String name);
}
