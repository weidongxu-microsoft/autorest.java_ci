// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerCommitInner;

/** An instance of this class provides access to all the operations defined in NetworkManagerCommitsClient. */
public interface NetworkManagerCommitsClient {
    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPost(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters);

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPost(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context);

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkManagerCommitInner post(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters);

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkManagerCommitInner post(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context);
}