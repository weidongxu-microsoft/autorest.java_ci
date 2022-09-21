// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkflowTriggers. */
public interface WorkflowTriggers {
    /**
     * Gets a list of workflow triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow triggers as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WorkflowTrigger> list(String resourceGroupName, String name, String workflowName);

    /**
     * Gets a list of workflow triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow triggers as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WorkflowTrigger> list(
        String resourceGroupName, String name, String workflowName, Integer top, String filter, Context context);

    /**
     * Gets a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger along with {@link Response}.
     */
    Response<WorkflowTrigger> getWithResponse(
        String resourceGroupName, String name, String workflowName, String triggerName, Context context);

    /**
     * Gets a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger.
     */
    WorkflowTrigger get(String resourceGroupName, String name, String workflowName, String triggerName);

    /**
     * Get the callback URL for a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback URL for a workflow trigger along with {@link Response}.
     */
    Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(
        String resourceGroupName, String name, String workflowName, String triggerName, Context context);

    /**
     * Get the callback URL for a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback URL for a workflow trigger.
     */
    WorkflowTriggerCallbackUrl listCallbackUrl(
        String resourceGroupName, String name, String workflowName, String triggerName);

    /**
     * Runs a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void run(String resourceGroupName, String name, String workflowName, String triggerName);

    /**
     * Runs a workflow trigger.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void run(String resourceGroupName, String name, String workflowName, String triggerName, Context context);

    /**
     * Get the trigger schema as JSON.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the trigger schema as JSON along with {@link Response}.
     */
    Response<JsonSchema> getSchemaJsonWithResponse(
        String resourceGroupName, String name, String workflowName, String triggerName, Context context);

    /**
     * Get the trigger schema as JSON.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the trigger schema as JSON.
     */
    JsonSchema getSchemaJson(String resourceGroupName, String name, String workflowName, String triggerName);
}
