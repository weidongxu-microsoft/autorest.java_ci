// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NatRules. */
public interface NatRules {
    /**
     * Retrieves the details of a nat ruleGet.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGatewayNatRule Resource along with {@link Response}.
     */
    Response<VpnGatewayNatRule> getWithResponse(
        String resourceGroupName, String gatewayName, String natRuleName, Context context);

    /**
     * Retrieves the details of a nat ruleGet.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGatewayNatRule Resource.
     */
    VpnGatewayNatRule get(String resourceGroupName, String gatewayName, String natRuleName);

    /**
     * Deletes a nat rule.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String gatewayName, String natRuleName);

    /**
     * Deletes a nat rule.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String gatewayName, String natRuleName, Context context);

    /**
     * Retrieves all nat rules for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual wan vpn gateway as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<VpnGatewayNatRule> listByVpnGateway(String resourceGroupName, String gatewayName);

    /**
     * Retrieves all nat rules for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all nat rules to a virtual wan vpn gateway as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<VpnGatewayNatRule> listByVpnGateway(String resourceGroupName, String gatewayName, Context context);

    /**
     * Retrieves the details of a nat ruleGet.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGatewayNatRule Resource along with {@link Response}.
     */
    VpnGatewayNatRule getById(String id);

    /**
     * Retrieves the details of a nat ruleGet.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGatewayNatRule Resource along with {@link Response}.
     */
    Response<VpnGatewayNatRule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a nat rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a nat rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VpnGatewayNatRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new VpnGatewayNatRule definition.
     */
    VpnGatewayNatRule.DefinitionStages.Blank define(String name);
}
