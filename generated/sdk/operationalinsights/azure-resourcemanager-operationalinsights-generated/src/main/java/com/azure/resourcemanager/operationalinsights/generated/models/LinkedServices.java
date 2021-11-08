// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LinkedServices. */
public interface LinkedServices {
    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    LinkedService delete(String resourceGroupName, String workspaceName, String linkedServiceName);

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    LinkedService delete(String resourceGroupName, String workspaceName, String linkedServiceName, Context context);

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    LinkedService get(String resourceGroupName, String workspaceName, String linkedServiceName);

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    Response<LinkedService> getWithResponse(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context);

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the linked services instances in a workspace.
     */
    PagedIterable<LinkedService> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the linked services instances in a workspace.
     */
    PagedIterable<LinkedService> listByWorkspace(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets a linked service instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    LinkedService getById(String id);

    /**
     * Gets a linked service instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    Response<LinkedService> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a linked service instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    LinkedService deleteById(String id);

    /**
     * Deletes a linked service instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    LinkedService deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LinkedService resource.
     *
     * @param name resource name.
     * @return the first stage of the new LinkedService definition.
     */
    LinkedService.DefinitionStages.Blank define(String name);
}
