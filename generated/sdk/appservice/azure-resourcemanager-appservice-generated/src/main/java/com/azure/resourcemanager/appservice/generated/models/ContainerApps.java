// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ContainerApps. */
public interface ContainerApps {
    /**
     * Get the Container Apps in a given subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ContainerApp> list();

    /**
     * Get the Container Apps in a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ContainerApp> list(Context context);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ContainerApp> listByResourceGroup(String resourceGroupName);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ContainerApp> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    ContainerApp getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App along with {@link Response}.
     */
    Response<ContainerApp> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, Context context);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    SecretsCollection listSecrets(String name);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource along with {@link Response}.
     */
    Response<SecretsCollection> listSecretsWithResponse(String name, Context context);

    /**
     * Get the properties of a Container App.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App along with {@link Response}.
     */
    ContainerApp getById(String id);

    /**
     * Get the properties of a Container App.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App along with {@link Response}.
     */
    Response<ContainerApp> getByIdWithResponse(String id, Context context);

    /**
     * Description for Delete a Container App.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Description for Delete a Container App.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ContainerApp resource.
     *
     * @param name resource name.
     * @return the first stage of the new ContainerApp definition.
     */
    ContainerApp.DefinitionStages.Blank define(String name);
}