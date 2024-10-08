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
import com.azure.resourcemanager.network.generated.fluent.models.ConnectivityConfigurationInner;

/**
 * An instance of this class provides access to all the operations defined in ConnectivityConfigurationsClient.
 */
public interface ConnectivityConfigurationsClient {
    /**
     * Gets a Network Connectivity Configuration, specified by the resource group, network manager name, and
     * connectivity Configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Network Connectivity Configuration, specified by the resource group, network manager name, and
     * connectivity Configuration name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectivityConfigurationInner> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, Context context);

    /**
     * Gets a Network Connectivity Configuration, specified by the resource group, network manager name, and
     * connectivity Configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Network Connectivity Configuration, specified by the resource group, network manager name, and
     * connectivity Configuration name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectivityConfigurationInner get(String resourceGroupName, String networkManagerName, String configurationName);

    /**
     * Creates/Updates a new network manager connectivity configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @param connectivityConfiguration Parameters supplied to create/update a network manager connectivity
     * configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network manager connectivity configuration resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectivityConfigurationInner> createOrUpdateWithResponse(String resourceGroupName,
        String networkManagerName, String configurationName, ConnectivityConfigurationInner connectivityConfiguration,
        Context context);

    /**
     * Creates/Updates a new network manager connectivity configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @param connectivityConfiguration Parameters supplied to create/update a network manager connectivity
     * configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network manager connectivity configuration resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectivityConfigurationInner createOrUpdate(String resourceGroupName, String networkManagerName,
        String configurationName, ConnectivityConfigurationInner connectivityConfiguration);

    /**
     * Deletes a network manager connectivity configuration, specified by the resource group, network manager name, and
     * connectivity configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName,
        String configurationName);

    /**
     * Deletes a network manager connectivity configuration, specified by the resource group, network manager name, and
     * connectivity configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName,
        String configurationName, Boolean force, Context context);

    /**
     * Deletes a network manager connectivity configuration, specified by the resource group, network manager name, and
     * connectivity configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String configurationName);

    /**
     * Deletes a network manager connectivity configuration, specified by the resource group, network manager name, and
     * connectivity configuration name.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager connectivity configuration.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String configurationName, Boolean force,
        Context context);

    /**
     * Lists all the network manager connectivity configuration in a specified network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list network manager connectivity configurations as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectivityConfigurationInner> list(String resourceGroupName, String networkManagerName);

    /**
     * Lists all the network manager connectivity configuration in a specified network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list network manager connectivity configurations as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectivityConfigurationInner> list(String resourceGroupName, String networkManagerName, Integer top,
        String skipToken, Context context);
}
