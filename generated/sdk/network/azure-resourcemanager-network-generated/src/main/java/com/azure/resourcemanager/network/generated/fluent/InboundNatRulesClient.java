// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;

/** An instance of this class provides access to all the operations defined in InboundNatRulesClient. */
public interface InboundNatRulesClient {
    /**
     * Gets all the inbound NAT rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound NAT rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InboundNatRuleInner> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the inbound NAT rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound NAT rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InboundNatRuleInner> list(String resourceGroupName, String loadBalancerName, Context context);

    /**
     * Deletes the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Deletes the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, Context context);

    /**
     * Deletes the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Deletes the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName, Context context);

    /**
     * Gets the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound NAT rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InboundNatRuleInner get(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Gets the specified load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound NAT rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InboundNatRuleInner> getWithResponse(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand, Context context);

    /**
     * Creates or updates a load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound NAT rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InboundNatRuleInner>, InboundNatRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters);

    /**
     * Creates or updates a load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound NAT rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InboundNatRuleInner>, InboundNatRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters,
        Context context);

    /**
     * Creates or updates a load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound NAT rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InboundNatRuleInner createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters);

    /**
     * Creates or updates a load balancer inbound NAT rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound NAT rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound NAT rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InboundNatRuleInner createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters,
        Context context);
}
