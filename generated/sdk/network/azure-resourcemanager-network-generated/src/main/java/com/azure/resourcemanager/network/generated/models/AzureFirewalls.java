// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AzureFirewalls. */
public interface AzureFirewalls {
    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall along with {@link Response}.
     */
    Response<AzureFirewall> getByResourceGroupWithResponse(
        String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall.
     */
    AzureFirewall getByResourceGroup(String resourceGroupName, String azureFirewallName);

    /**
     * Lists all Azure Firewalls in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListAzureFirewalls API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureFirewall> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Azure Firewalls in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListAzureFirewalls API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureFirewall> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Azure Firewalls in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewalls in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureFirewall> list();

    /**
     * Gets all the Azure Firewalls in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewalls in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureFirewall> list(Context context);

    /**
     * Retrieves a list of all IP prefixes that azure firewall has learned to not SNAT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the azure firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SNAT IP Prefixes learnt by firewall to not SNAT.
     */
    IpPrefixesList listLearnedPrefixes(String resourceGroupName, String azureFirewallName);

    /**
     * Retrieves a list of all IP prefixes that azure firewall has learned to not SNAT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the azure firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SNAT IP Prefixes learnt by firewall to not SNAT.
     */
    IpPrefixesList listLearnedPrefixes(String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Runs a packet capture on AzureFirewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to run packet capture on azure firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void packetCapture(String resourceGroupName, String azureFirewallName, FirewallPacketCaptureParameters parameters);

    /**
     * Runs a packet capture on AzureFirewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to run packet capture on azure firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void packetCapture(
        String resourceGroupName,
        String azureFirewallName,
        FirewallPacketCaptureParameters parameters,
        Context context);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall along with {@link Response}.
     */
    AzureFirewall getById(String id);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall along with {@link Response}.
     */
    Response<AzureFirewall> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AzureFirewall resource.
     *
     * @param name resource name.
     * @return the first stage of the new AzureFirewall definition.
     */
    AzureFirewall.DefinitionStages.Blank define(String name);
}
