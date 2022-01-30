// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of KubeEnvironments. */
public interface KubeEnvironments {
    /**
     * Description for Get all Kubernetes Environments for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KubeEnvironment> list();

    /**
     * Description for Get all Kubernetes Environments for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KubeEnvironment> list(Context context);

    /**
     * Description for Get all the Kubernetes Environments in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KubeEnvironment> listByResourceGroup(String resourceGroupName);

    /**
     * Description for Get all the Kubernetes Environments in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KubeEnvironment> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    KubeEnvironment getByResourceGroup(String resourceGroupName, String name);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response}.
     */
    Response<KubeEnvironment> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response}.
     */
    KubeEnvironment getById(String id);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response}.
     */
    Response<KubeEnvironment> getByIdWithResponse(String id, Context context);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Description for Delete a Kubernetes Environment.
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
     * Begins definition for a new KubeEnvironment resource.
     *
     * @param name resource name.
     * @return the first stage of the new KubeEnvironment definition.
     */
    KubeEnvironment.DefinitionStages.Blank define(String name);
}
