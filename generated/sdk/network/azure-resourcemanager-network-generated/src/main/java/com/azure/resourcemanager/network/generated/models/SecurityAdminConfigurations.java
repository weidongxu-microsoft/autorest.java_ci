// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SecurityAdminConfigurations.
 */
public interface SecurityAdminConfigurations {
    /**
     * Lists all the network manager security admin configurations in a network manager, in a paginated format.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of network manager security admin configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityAdminConfiguration> list(String resourceGroupName, String networkManagerName);

    /**
     * Lists all the network manager security admin configurations in a network manager, in a paginated format.
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
     * @return a list of network manager security admin configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityAdminConfiguration> list(String resourceGroupName, String networkManagerName, Integer top,
        String skipToken, Context context);

    /**
     * Retrieves a network manager security admin configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the security admin configuration along with {@link Response}.
     */
    Response<SecurityAdminConfiguration> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, Context context);

    /**
     * Retrieves a network manager security admin configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the security admin configuration.
     */
    SecurityAdminConfiguration get(String resourceGroupName, String networkManagerName, String configurationName);

    /**
     * Deletes a network manager security admin configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, String configurationName);

    /**
     * Deletes a network manager security admin configuration.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, String configurationName, Boolean force,
        Context context);

    /**
     * Retrieves a network manager security admin configuration.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the security admin configuration along with {@link Response}.
     */
    SecurityAdminConfiguration getById(String id);

    /**
     * Retrieves a network manager security admin configuration.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the security admin configuration along with {@link Response}.
     */
    Response<SecurityAdminConfiguration> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a network manager security admin configuration.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a network manager security admin configuration.
     * 
     * @param id the resource ID.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new SecurityAdminConfiguration resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SecurityAdminConfiguration definition.
     */
    SecurityAdminConfiguration.DefinitionStages.Blank define(String name);
}
