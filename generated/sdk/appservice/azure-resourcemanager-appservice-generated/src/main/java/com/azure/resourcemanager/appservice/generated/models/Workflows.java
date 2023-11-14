// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Workflows.
 */
public interface Workflows {
    /**
     * Regenerates the callback URL access key for request triggers.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> regenerateAccessKeyWithResponse(String resourceGroupName, String name, String workflowName,
        RegenerateActionParameter keyType, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAccessKey(String resourceGroupName, String name, String workflowName,
        RegenerateActionParameter keyType);

    /**
     * Validates the workflow definition.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> validateWithResponse(String resourceGroupName, String name, String workflowName, Workflow validate,
        Context context);

    /**
     * Validates the workflow definition.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validate(String resourceGroupName, String name, String workflowName, Workflow validate);
}
