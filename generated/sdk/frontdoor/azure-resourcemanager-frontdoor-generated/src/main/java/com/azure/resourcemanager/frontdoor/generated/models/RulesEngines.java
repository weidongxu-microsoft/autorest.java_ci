// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RulesEngines.
 */
public interface RulesEngines {
    /**
     * Lists all of the Rules Engine Configurations within a Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Rules Engine Configurations as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RulesEngine> listByFrontDoor(String resourceGroupName, String frontDoorName);

    /**
     * Lists all of the Rules Engine Configurations within a Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Rules Engine Configurations as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RulesEngine> listByFrontDoor(String resourceGroupName, String frontDoorName, Context context);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door along with
     * {@link Response}.
     */
    Response<RulesEngine> getWithResponse(String resourceGroupName, String frontDoorName, String rulesEngineName,
        Context context);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door.
     */
    RulesEngine get(String resourceGroupName, String frontDoorName, String rulesEngineName);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String frontDoorName, String rulesEngineName);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String frontDoorName, String rulesEngineName, Context context);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door along with
     * {@link Response}.
     */
    RulesEngine getById(String id);

    /**
     * Gets a Rules Engine Configuration with the specified name within the specified Front Door.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Rules Engine Configuration with the specified name within the specified Front Door along with
     * {@link Response}.
     */
    Response<RulesEngine> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing Rules Engine Configuration with the specified parameters.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RulesEngine resource.
     * 
     * @param name resource name.
     * @return the first stage of the new RulesEngine definition.
     */
    RulesEngine.DefinitionStages.Blank define(String name);
}
