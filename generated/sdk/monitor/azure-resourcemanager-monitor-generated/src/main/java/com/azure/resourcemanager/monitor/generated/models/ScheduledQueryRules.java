// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ScheduledQueryRules. */
public interface ScheduledQueryRules {
    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule.
     */
    LogSearchRuleResource getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule along with {@link Response}.
     */
    Response<LogSearchRuleResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * List the Log Search rules within a subscription group.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LogSearchRuleResource> list();

    /**
     * List the Log Search rules within a subscription group.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LogSearchRuleResource> list(String filter, Context context);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LogSearchRuleResource> listByResourceGroup(String resourceGroupName);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LogSearchRuleResource> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Gets an Log Search rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule along with {@link Response}.
     */
    LogSearchRuleResource getById(String id);

    /**
     * Gets an Log Search rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule along with {@link Response}.
     */
    Response<LogSearchRuleResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Log Search rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Log Search rule.
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
     * Begins definition for a new LogSearchRuleResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new LogSearchRuleResource definition.
     */
    LogSearchRuleResource.DefinitionStages.Blank define(String name);
}
