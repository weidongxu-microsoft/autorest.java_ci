// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerDeploymentStatusListResultInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerDeploymentStatusParameter;

/**
 * An instance of this class provides access to all the operations defined in NetworkManagerDeploymentStatusOperationsClient.
 */
public interface NetworkManagerDeploymentStatusOperationsClient {
    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkManagerDeploymentStatusListResultInner> listWithResponse(String resourceGroupName,
        String networkManagerName, NetworkManagerDeploymentStatusParameter parameters, Integer top, Context context);

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkManagerDeploymentStatusListResultInner list(String resourceGroupName, String networkManagerName,
        NetworkManagerDeploymentStatusParameter parameters);
}
