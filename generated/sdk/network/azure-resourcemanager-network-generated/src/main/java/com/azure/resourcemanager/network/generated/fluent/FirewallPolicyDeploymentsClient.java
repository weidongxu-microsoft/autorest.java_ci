// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;

/**
 * An instance of this class provides access to all the operations defined in FirewallPolicyDeploymentsClient.
 */
public interface FirewallPolicyDeploymentsClient {
    /**
     * Deploys the firewall policy draft and child rule collection group drafts.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeploy(String resourceGroupName, String firewallPolicyName);

    /**
     * Deploys the firewall policy draft and child rule collection group drafts.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeploy(String resourceGroupName, String firewallPolicyName,
        Context context);

    /**
     * Deploys the firewall policy draft and child rule collection group drafts.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deploy(String resourceGroupName, String firewallPolicyName);

    /**
     * Deploys the firewall policy draft and child rule collection group drafts.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deploy(String resourceGroupName, String firewallPolicyName, Context context);
}
