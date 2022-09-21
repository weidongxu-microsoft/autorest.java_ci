// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.generated.fluent.models.WcfRelayInner;
import com.azure.resourcemanager.relay.generated.models.RegenerateAccessKeyParameters;

/** An instance of this class provides access to all the operations defined in WcfRelaysClient. */
public interface WcfRelaysClient {
    /**
     * Authorization rules for a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String relayName);

    /**
     * Authorization rules for a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String relayName, Context context);

    /**
     * Creates or updates an authorization rule for a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
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
        String relayName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context);

    /**
     * Creates or updates an authorization rule for a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters The authorization rule parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in a List or Get AuthorizationRule operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters);

    /**
     * Deletes a WCF relay authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
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
        String relayName,
        String authorizationRuleName,
        Context context);

    /**
     * Deletes a WCF relay authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Get authorizationRule for a WCF relay by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorizationRule for a WCF relay by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AuthorizationRuleInner> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        Context context);

    /**
     * Get authorizationRule for a WCF relay by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorizationRule for a WCF relay by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AuthorizationRuleInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        Context context);

    /**
     * Primary and secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName);

    /**
     * Regenerates the primary or secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Regenerates the primary or secondary connection strings to the WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Lists the WCF relays within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list WCF relay operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WcfRelayInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Lists the WCF relays within the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list WCF relay operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WcfRelayInner> listByNamespace(String resourceGroupName, String namespaceName, Context context);

    /**
     * Creates or updates a WCF relay. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param parameters Parameters supplied to create a WCF relay.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the WCF relay resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WcfRelayInner> createOrUpdateWithResponse(
        String resourceGroupName, String namespaceName, String relayName, WcfRelayInner parameters, Context context);

    /**
     * Creates or updates a WCF relay. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param parameters Parameters supplied to create a WCF relay.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the WCF relay resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WcfRelayInner createOrUpdate(
        String resourceGroupName, String namespaceName, String relayName, WcfRelayInner parameters);

    /**
     * Deletes a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String relayName, Context context);

    /**
     * Deletes a WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String relayName);

    /**
     * Returns the description for the specified WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the WCF relay resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WcfRelayInner> getWithResponse(
        String resourceGroupName, String namespaceName, String relayName, Context context);

    /**
     * Returns the description for the specified WCF relay.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param relayName The relay name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the WCF relay resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WcfRelayInner get(String resourceGroupName, String namespaceName, String relayName);
}
