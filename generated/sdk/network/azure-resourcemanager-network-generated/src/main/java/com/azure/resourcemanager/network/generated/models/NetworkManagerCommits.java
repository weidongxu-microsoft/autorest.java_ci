// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerCommitInner;

/**
 * Resource collection API of NetworkManagerCommits.
 */
public interface NetworkManagerCommits {
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
    NetworkManagerCommit post(String resourceGroupName, String networkManagerName,
        NetworkManagerCommitInner parameters);

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
    NetworkManagerCommit post(String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters,
        Context context);
}
