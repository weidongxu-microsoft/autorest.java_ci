// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupExportResultInner;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupInner;
import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupPatchable;

/** An instance of this class provides access to all the operations defined in ResourceGroupsClient. */
public interface ResourceGroupsClient {
    /**
     * Checks whether a resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    boolean checkExistence(String resourceGroupName);

    /**
     * Checks whether a resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Boolean> checkExistenceWithResponse(String resourceGroupName, Context context);

    /**
     * Creates or updates a resource group.
     *
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric,
     *     underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed
     *     characters.
     * @param parameters Parameters supplied to the create or update a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceGroupInner createOrUpdate(String resourceGroupName, ResourceGroupInner parameters);

    /**
     * Creates or updates a resource group.
     *
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric,
     *     underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed
     *     characters.
     * @param parameters Parameters supplied to the create or update a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceGroupInner> createOrUpdateWithResponse(
        String resourceGroupName, ResourceGroupInner parameters, Context context);

    /**
     * Deletes a resource group.
     *
     * <p>When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all
     * of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param forceDeletionTypes The resource types you want to force delete. Currently, only the following is
     *     supported: forceDeletionTypes=Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String forceDeletionTypes);

    /**
     * Deletes a resource group.
     *
     * <p>When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all
     * of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param forceDeletionTypes The resource types you want to force delete. Currently, only the following is
     *     supported: forceDeletionTypes=Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String forceDeletionTypes, Context context);

    /**
     * Deletes a resource group.
     *
     * <p>When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all
     * of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param forceDeletionTypes The resource types you want to force delete. Currently, only the following is
     *     supported: forceDeletionTypes=Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String forceDeletionTypes);

    /**
     * Deletes a resource group.
     *
     * <p>When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all
     * of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName);

    /**
     * Deletes a resource group.
     *
     * <p>When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all
     * of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param forceDeletionTypes The resource types you want to force delete. Currently, only the following is
     *     supported: forceDeletionTypes=Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String forceDeletionTypes, Context context);

    /**
     * Gets a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceGroupInner get(String resourceGroupName);

    /**
     * Gets a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceGroupInner> getWithResponse(String resourceGroupName, Context context);

    /**
     * Updates a resource group.
     *
     * <p>Resource groups can be updated through a simple PATCH operation to a group address. The format of the request
     * is the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     *
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Parameters supplied to update a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceGroupInner update(String resourceGroupName, ResourceGroupPatchable parameters);

    /**
     * Updates a resource group.
     *
     * <p>Resource groups can be updated through a simple PATCH operation to a group address. The format of the request
     * is the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     *
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Parameters supplied to update a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceGroupInner> updateWithResponse(
        String resourceGroupName, ResourceGroupPatchable parameters, Context context);

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters for exporting the template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of resource group export result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ResourceGroupExportResultInner>, ResourceGroupExportResultInner> beginExportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters);

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters for exporting the template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of resource group export result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ResourceGroupExportResultInner>, ResourceGroupExportResultInner> beginExportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters, Context context);

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters for exporting the template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceGroupExportResultInner exportTemplate(String resourceGroupName, ExportTemplateRequest parameters);

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters for exporting the template.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceGroupExportResultInner exportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters, Context context);

    /**
     * Gets all the resource groups for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resource groups for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceGroupInner> list();

    /**
     * Gets all the resource groups for a subscription.
     *
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values.
     *     For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resource groups for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceGroupInner> list(String filter, Integer top, Context context);
}
