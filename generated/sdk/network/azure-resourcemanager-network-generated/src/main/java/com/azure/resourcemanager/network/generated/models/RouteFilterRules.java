// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterRuleInner;

/**
 * Resource collection API of RouteFilterRules.
 */
public interface RouteFilterRules {
    /**
     * Deletes the specified rule from a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String routeFilterName, String ruleName, Context context);

    /**
     * Gets the specified rule from a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter along with {@link Response}.
     */
    Response<RouteFilterRule> getWithResponse(String resourceGroupName, String routeFilterName, String ruleName,
        Context context);

    /**
     * Gets the specified rule from a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    RouteFilterRule get(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Creates or updates a route in the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    RouteFilterRule createOrUpdate(String resourceGroupName, String routeFilterName, String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    RouteFilterRule createOrUpdate(String resourceGroupName, String routeFilterName, String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters, Context context);

    /**
     * Gets all RouteFilterRules in a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RouteFilterRule> listByRouteFilter(String resourceGroupName, String routeFilterName);

    /**
     * Gets all RouteFilterRules in a route filter.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RouteFilterRule> listByRouteFilter(String resourceGroupName, String routeFilterName, Context context);
}
