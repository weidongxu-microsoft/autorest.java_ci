// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of FirewallPolicyRuleCollectionGroups.
 */
public interface FirewallPolicyRuleCollectionGroups {
    /**
     * Deletes the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName);

    /**
     * Deletes the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName, Context context);

    /**
     * Gets the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified FirewallPolicyRuleCollectionGroup along with {@link Response}.
     */
    Response<FirewallPolicyRuleCollectionGroup> getWithResponse(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName, Context context);

    /**
     * Gets the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified FirewallPolicyRuleCollectionGroup.
     */
    FirewallPolicyRuleCollectionGroup get(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName);

    /**
     * Lists all FirewallPolicyRuleCollectionGroups in a FirewallPolicy resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListFirewallPolicyRuleCollectionGroups API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallPolicyRuleCollectionGroup> list(String resourceGroupName, String firewallPolicyName);

    /**
     * Lists all FirewallPolicyRuleCollectionGroups in a FirewallPolicy resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListFirewallPolicyRuleCollectionGroups API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallPolicyRuleCollectionGroup> list(String resourceGroupName, String firewallPolicyName,
        Context context);

    /**
     * Gets the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified FirewallPolicyRuleCollectionGroup along with {@link Response}.
     */
    FirewallPolicyRuleCollectionGroup getById(String id);

    /**
     * Gets the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified FirewallPolicyRuleCollectionGroup along with {@link Response}.
     */
    Response<FirewallPolicyRuleCollectionGroup> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified FirewallPolicyRuleCollectionGroup.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FirewallPolicyRuleCollectionGroup resource.
     * 
     * @param name resource name.
     * @return the first stage of the new FirewallPolicyRuleCollectionGroup definition.
     */
    FirewallPolicyRuleCollectionGroup.DefinitionStages.Blank define(String name);
}
