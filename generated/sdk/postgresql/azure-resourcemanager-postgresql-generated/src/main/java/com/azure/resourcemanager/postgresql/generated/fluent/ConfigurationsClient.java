// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.generated.fluent.models.ConfigurationInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ConfigurationsClient. */
public interface ConfigurationsClient {
    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Configuration along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationInner>, ConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters);

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Configuration along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationInner>, ConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String configurationName,
        ConfigurationInner parameters,
        Context context);

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationInner createOrUpdate(
        String resourceGroupName, String serverName, String configurationName, ConfigurationInner parameters);

    /**
     * Updates a configuration of a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param parameters The required parameters for updating a server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String configurationName,
        ConfigurationInner parameters,
        Context context);

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration of server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationInner get(String resourceGroupName, String serverName, String configurationName);

    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration of server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationInner> getWithResponse(
        String resourceGroupName, String serverName, String configurationName, Context context);

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationInner> listByServer(String resourceGroupName, String serverName);

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationInner> listByServer(String resourceGroupName, String serverName, Context context);
}
