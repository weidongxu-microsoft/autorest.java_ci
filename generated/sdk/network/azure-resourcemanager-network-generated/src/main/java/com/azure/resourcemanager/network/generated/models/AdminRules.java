// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;

/** Resource collection API of AdminRules. */
public interface AdminRules {
    /**
     * List all network manager security configuration admin rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security configuration admin rule list result as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BaseAdminRule> list(
        String resourceGroupName, String networkManagerName, String configurationName, String ruleCollectionName);

    /**
     * List all network manager security configuration admin rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security configuration admin rule list result as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BaseAdminRule> list(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        Integer top,
        String skipToken,
        Context context);

    /**
     * Gets a network manager security configuration admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network manager security configuration admin rule along with {@link Response}.
     */
    Response<BaseAdminRule> getWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName,
        Context context);

    /**
     * Gets a network manager security configuration admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a network manager security configuration admin rule.
     */
    BaseAdminRule get(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName);

    /**
     * Creates or updates an admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param adminRule The admin rule to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network base admin rule along with {@link Response}.
     */
    Response<BaseAdminRule> createOrUpdateWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName,
        BaseAdminRuleInner adminRule,
        Context context);

    /**
     * Creates or updates an admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param adminRule The admin rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network base admin rule.
     */
    BaseAdminRule createOrUpdate(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName,
        BaseAdminRuleInner adminRule);

    /**
     * Deletes an admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     *     deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName,
        Boolean force);

    /**
     * Deletes an admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName);

    /**
     * Deletes an admin rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     *     deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String networkManagerName,
        String configurationName,
        String ruleCollectionName,
        String ruleName,
        Boolean force,
        Context context);
}
