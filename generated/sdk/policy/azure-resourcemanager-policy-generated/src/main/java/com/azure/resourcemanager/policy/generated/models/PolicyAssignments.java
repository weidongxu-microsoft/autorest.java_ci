// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyAssignmentInner;

/** Resource collection API of PolicyAssignments. */
public interface PolicyAssignments {
    /**
     * Deletes a policy assignment.
     *
     * <p>This operation deletes a policy assignment, given its name and the scope it was created in. The scope of a
     * policy assignment is the part of its ID preceding
     * '/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     *
     * @param scope The scope of the policy assignment. Valid scopes are: management group (format:
     *     '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     '/subscriptions/{subscriptionId}'), resource group (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyAssignmentName The name of the policy assignment to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment along with {@link Response}.
     */
    Response<PolicyAssignment> deleteByResourceGroupWithResponse(
        String scope, String policyAssignmentName, Context context);

    /**
     * Deletes a policy assignment.
     *
     * <p>This operation deletes a policy assignment, given its name and the scope it was created in. The scope of a
     * policy assignment is the part of its ID preceding
     * '/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     *
     * @param scope The scope of the policy assignment. Valid scopes are: management group (format:
     *     '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     '/subscriptions/{subscriptionId}'), resource group (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyAssignmentName The name of the policy assignment to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment.
     */
    PolicyAssignment deleteByResourceGroup(String scope, String policyAssignmentName);

    /**
     * Retrieves a policy assignment.
     *
     * <p>This operation retrieves a single policy assignment, given its name and the scope it was created at.
     *
     * @param scope The scope of the policy assignment. Valid scopes are: management group (format:
     *     '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     '/subscriptions/{subscriptionId}'), resource group (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyAssignmentName The name of the policy assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment along with {@link Response}.
     */
    Response<PolicyAssignment> getWithResponse(String scope, String policyAssignmentName, Context context);

    /**
     * Retrieves a policy assignment.
     *
     * <p>This operation retrieves a single policy assignment, given its name and the scope it was created at.
     *
     * @param scope The scope of the policy assignment. Valid scopes are: management group (format:
     *     '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     *     '/subscriptions/{subscriptionId}'), resource group (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyAssignmentName The name of the policy assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment.
     */
    PolicyAssignment get(String scope, String policyAssignmentName);

    /**
     * Retrieves all policy assignments that apply to a resource group.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the given resource group in the
     * given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()',
     * 'atExactScope()' or 'policyDefinitionId eq '{value}''. If $filter is not provided, the unfiltered list includes
     * all policy assignments associated with the resource group, including those that apply directly or apply from
     * containing scopes, as well as any applied to resources contained within the resource group. If $filter=atScope()
     * is provided, the returned list includes all policy assignments that apply to the resource group, which is
     * everything in the unfiltered list except those applied to resources contained within the resource group. If
     * $filter=atExactScope() is provided, the returned list only includes all policy assignments that at the resource
     * group. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments
     * of the policy definition whose id is {value} that apply to the resource group.
     *
     * @param resourceGroupName The name of the resource group that contains policy assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieves all policy assignments that apply to a resource group.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the given resource group in the
     * given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()',
     * 'atExactScope()' or 'policyDefinitionId eq '{value}''. If $filter is not provided, the unfiltered list includes
     * all policy assignments associated with the resource group, including those that apply directly or apply from
     * containing scopes, as well as any applied to resources contained within the resource group. If $filter=atScope()
     * is provided, the returned list includes all policy assignments that apply to the resource group, which is
     * everything in the unfiltered list except those applied to resources contained within the resource group. If
     * $filter=atExactScope() is provided, the returned list only includes all policy assignments that at the resource
     * group. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments
     * of the policy definition whose id is {value} that apply to the resource group.
     *
     * @param resourceGroupName The name of the resource group that contains policy assignments.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()'
     *     or 'policyDefinitionId eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atScope() is provided, the returned list only includes all policy assignments that apply to the
     *     scope, which is everything in the unfiltered list except those applied to sub scopes contained within the
     *     given scope. If $filter=atExactScope() is provided, the returned list only includes all policy assignments
     *     that at the given scope. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes
     *     all policy assignments of the policy definition whose id is {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * Retrieves all policy assignments that apply to a resource.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the specified resource in the
     * given resource group and subscription that match the optional given $filter. Valid values for $filter are:
     * 'atScope()', 'atExactScope()' or 'policyDefinitionId eq '{value}''. If $filter is not provided, the unfiltered
     * list includes all policy assignments associated with the resource, including those that apply directly or from
     * all containing scopes, as well as any applied to resources contained within the resource. If $filter=atScope() is
     * provided, the returned list includes all policy assignments that apply to the resource, which is everything in
     * the unfiltered list except those applied to resources contained within the resource. If $filter=atExactScope() is
     * provided, the returned list only includes all policy assignments that at the resource level. If
     * $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments of the
     * policy definition whose id is {value} that apply to the resource. Three parameters plus the resource name are
     * used to identify a specific resource. If the resource is not part of a parent resource (the more common case),
     * the parent resource path should not be provided (or provided as ''). For example a web app could be specified as
     * ({resourceProviderNamespace} == 'Microsoft.Web', {parentResourcePath} == '', {resourceType} == 'sites',
     * {resourceName} == 'MyWebApp'). If the resource is part of a parent resource, then all parameters should be
     * provided. For example a virtual machine DNS name could be specified as ({resourceProviderNamespace} ==
     * 'Microsoft.Compute', {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType} == 'domainNames',
     * {resourceName} == 'MyComputerName'). A convenient alternative to providing the namespace and type name separately
     * is to provide both in the {resourceType} parameter, format: ({resourceProviderNamespace} == '',
     * {parentResourcePath} == '', {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
     *
     * @param resourceGroupName The name of the resource group containing the resource.
     * @param resourceProviderNamespace The namespace of the resource provider. For example, the namespace of a virtual
     *     machine is Microsoft.Compute (from Microsoft.Compute/virtualMachines).
     * @param parentResourcePath The parent resource path. Use empty string if there is none.
     * @param resourceType The resource type name. For example the type name of a web app is 'sites' (from
     *     Microsoft.Web/sites).
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName);

    /**
     * Retrieves all policy assignments that apply to a resource.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the specified resource in the
     * given resource group and subscription that match the optional given $filter. Valid values for $filter are:
     * 'atScope()', 'atExactScope()' or 'policyDefinitionId eq '{value}''. If $filter is not provided, the unfiltered
     * list includes all policy assignments associated with the resource, including those that apply directly or from
     * all containing scopes, as well as any applied to resources contained within the resource. If $filter=atScope() is
     * provided, the returned list includes all policy assignments that apply to the resource, which is everything in
     * the unfiltered list except those applied to resources contained within the resource. If $filter=atExactScope() is
     * provided, the returned list only includes all policy assignments that at the resource level. If
     * $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments of the
     * policy definition whose id is {value} that apply to the resource. Three parameters plus the resource name are
     * used to identify a specific resource. If the resource is not part of a parent resource (the more common case),
     * the parent resource path should not be provided (or provided as ''). For example a web app could be specified as
     * ({resourceProviderNamespace} == 'Microsoft.Web', {parentResourcePath} == '', {resourceType} == 'sites',
     * {resourceName} == 'MyWebApp'). If the resource is part of a parent resource, then all parameters should be
     * provided. For example a virtual machine DNS name could be specified as ({resourceProviderNamespace} ==
     * 'Microsoft.Compute', {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType} == 'domainNames',
     * {resourceName} == 'MyComputerName'). A convenient alternative to providing the namespace and type name separately
     * is to provide both in the {resourceType} parameter, format: ({resourceProviderNamespace} == '',
     * {parentResourcePath} == '', {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
     *
     * @param resourceGroupName The name of the resource group containing the resource.
     * @param resourceProviderNamespace The namespace of the resource provider. For example, the namespace of a virtual
     *     machine is Microsoft.Compute (from Microsoft.Compute/virtualMachines).
     * @param parentResourcePath The parent resource path. Use empty string if there is none.
     * @param resourceType The resource type name. For example the type name of a web app is 'sites' (from
     *     Microsoft.Web/sites).
     * @param resourceName The name of the resource.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()'
     *     or 'policyDefinitionId eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atScope() is provided, the returned list only includes all policy assignments that apply to the
     *     scope, which is everything in the unfiltered list except those applied to sub scopes contained within the
     *     given scope. If $filter=atExactScope() is provided, the returned list only includes all policy assignments
     *     that at the given scope. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes
     *     all policy assignments of the policy definition whose id is {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Integer top,
        Context context);

    /**
     * Retrieves all policy assignments that apply to a management group.
     *
     * <p>This operation retrieves the list of all policy assignments applicable to the management group that match the
     * given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()' or 'policyDefinitionId eq '{value}''.
     * If $filter=atScope() is provided, the returned list includes all policy assignments that are assigned to the
     * management group or the management group's ancestors. If $filter=atExactScope() is provided, the returned list
     * only includes all policy assignments that at the management group. If $filter=policyDefinitionId eq '{value}' is
     * provided, the returned list includes all policy assignments of the policy definition whose id is {value} that
     * apply to the management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listForManagementGroup(String managementGroupId);

    /**
     * Retrieves all policy assignments that apply to a management group.
     *
     * <p>This operation retrieves the list of all policy assignments applicable to the management group that match the
     * given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()' or 'policyDefinitionId eq '{value}''.
     * If $filter=atScope() is provided, the returned list includes all policy assignments that are assigned to the
     * management group or the management group's ancestors. If $filter=atExactScope() is provided, the returned list
     * only includes all policy assignments that at the management group. If $filter=policyDefinitionId eq '{value}' is
     * provided, the returned list includes all policy assignments of the policy definition whose id is {value} that
     * apply to the management group.
     *
     * @param managementGroupId The ID of the management group.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()'
     *     or 'policyDefinitionId eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atScope() is provided, the returned list only includes all policy assignments that apply to the
     *     scope, which is everything in the unfiltered list except those applied to sub scopes contained within the
     *     given scope. If $filter=atExactScope() is provided, the returned list only includes all policy assignments
     *     that at the given scope. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes
     *     all policy assignments of the policy definition whose id is {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> listForManagementGroup(
        String managementGroupId, String filter, Integer top, Context context);

    /**
     * Retrieves all policy assignments that apply to a subscription.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the given subscription that match
     * the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()' or 'policyDefinitionId eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy assignments associated with the
     * subscription, including those that apply directly or from management groups that contain the given subscription,
     * as well as any applied to objects contained within the subscription. If $filter=atScope() is provided, the
     * returned list includes all policy assignments that apply to the subscription, which is everything in the
     * unfiltered list except those applied to objects contained within the subscription. If $filter=atExactScope() is
     * provided, the returned list only includes all policy assignments that at the subscription. If
     * $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments of the
     * policy definition whose id is {value}.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> list();

    /**
     * Retrieves all policy assignments that apply to a subscription.
     *
     * <p>This operation retrieves the list of all policy assignments associated with the given subscription that match
     * the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()' or 'policyDefinitionId eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy assignments associated with the
     * subscription, including those that apply directly or from management groups that contain the given subscription,
     * as well as any applied to objects contained within the subscription. If $filter=atScope() is provided, the
     * returned list includes all policy assignments that apply to the subscription, which is everything in the
     * unfiltered list except those applied to objects contained within the subscription. If $filter=atExactScope() is
     * provided, the returned list only includes all policy assignments that at the subscription. If
     * $filter=policyDefinitionId eq '{value}' is provided, the returned list includes all policy assignments of the
     * policy definition whose id is {value}.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()'
     *     or 'policyDefinitionId eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atScope() is provided, the returned list only includes all policy assignments that apply to the
     *     scope, which is everything in the unfiltered list except those applied to sub scopes contained within the
     *     given scope. If $filter=atExactScope() is provided, the returned list only includes all policy assignments
     *     that at the given scope. If $filter=policyDefinitionId eq '{value}' is provided, the returned list includes
     *     all policy assignments of the policy definition whose id is {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy assignments as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PolicyAssignment> list(String filter, Integer top, Context context);

    /**
     * Deletes a policy assignment.
     *
     * <p>This operation deletes the policy with the given ID. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid formats for {scope}
     * are: '/providers/Microsoft.Management/managementGroups/{managementGroup}' (management group),
     * '/subscriptions/{subscriptionId}' (subscription),
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' (resource group), or
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * (resource).
     *
     * @param policyAssignmentId The ID of the policy assignment to delete. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment along with {@link Response}.
     */
    Response<PolicyAssignment> deleteByIdWithResponse(String policyAssignmentId, Context context);

    /**
     * Deletes a policy assignment.
     *
     * <p>This operation deletes the policy with the given ID. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid formats for {scope}
     * are: '/providers/Microsoft.Management/managementGroups/{managementGroup}' (management group),
     * '/subscriptions/{subscriptionId}' (subscription),
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' (resource group), or
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * (resource).
     *
     * @param policyAssignmentId The ID of the policy assignment to delete. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment.
     */
    PolicyAssignment deleteById(String policyAssignmentId);

    /**
     * Creates or updates a policy assignment.
     *
     * <p>This operation creates or updates the policy assignment with the given ID. Policy assignments made on a scope
     * apply to all resources contained in that scope. For example, when you assign a policy to a resource group that
     * policy applies to all resources in the group. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid scopes are:
     * management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription
     * (format: '/subscriptions/{subscriptionId}'), resource group (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     *
     * @param policyAssignmentId The ID of the policy assignment to create. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @param parameters Parameters for policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment along with {@link Response}.
     */
    Response<PolicyAssignment> createByIdWithResponse(
        String policyAssignmentId, PolicyAssignmentInner parameters, Context context);

    /**
     * Creates or updates a policy assignment.
     *
     * <p>This operation creates or updates the policy assignment with the given ID. Policy assignments made on a scope
     * apply to all resources contained in that scope. For example, when you assign a policy to a resource group that
     * policy applies to all resources in the group. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid scopes are:
     * management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription
     * (format: '/subscriptions/{subscriptionId}'), resource group (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     *
     * @param policyAssignmentId The ID of the policy assignment to create. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @param parameters Parameters for policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment.
     */
    PolicyAssignment createById(String policyAssignmentId, PolicyAssignmentInner parameters);

    /**
     * Retrieves the policy assignment with the given ID.
     *
     * <p>The operation retrieves the policy assignment with the given ID. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid scopes are:
     * management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription
     * (format: '/subscriptions/{subscriptionId}'), resource group (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     *
     * @param policyAssignmentId The ID of the policy assignment to get. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment along with {@link Response}.
     */
    Response<PolicyAssignment> getByIdWithResponse(String policyAssignmentId, Context context);

    /**
     * Retrieves the policy assignment with the given ID.
     *
     * <p>The operation retrieves the policy assignment with the given ID. Policy assignment IDs have this format:
     * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'. Valid scopes are:
     * management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription
     * (format: '/subscriptions/{subscriptionId}'), resource group (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     *
     * @param policyAssignmentId The ID of the policy assignment to get. Use the format
     *     '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy assignment.
     */
    PolicyAssignment getById(String policyAssignmentId);

    /**
     * Begins definition for a new PolicyAssignment resource.
     *
     * @param name resource name.
     * @return the first stage of the new PolicyAssignment definition.
     */
    PolicyAssignment.DefinitionStages.Blank define(String name);
}
