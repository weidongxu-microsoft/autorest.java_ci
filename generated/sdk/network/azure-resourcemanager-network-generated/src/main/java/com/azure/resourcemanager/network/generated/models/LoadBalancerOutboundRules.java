// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of LoadBalancerOutboundRules.
 */
public interface LoadBalancerOutboundRules {
    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OutboundRule> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the outbound rules in a load balancer.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OutboundRule> list(String resourceGroupName, String loadBalancerName, Context context);

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response}.
     */
    Response<OutboundRule> getWithResponse(String resourceGroupName, String loadBalancerName, String outboundRuleName,
        Context context);

    /**
     * Gets the specified load balancer outbound rule.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    OutboundRule get(String resourceGroupName, String loadBalancerName, String outboundRuleName);
}
