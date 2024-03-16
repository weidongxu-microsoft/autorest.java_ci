// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyExemptionInner;

/**
 * An instance of this class provides access to all the operations defined in PolicyExemptionsClient.
 */
public interface PolicyExemptionsClient {
    /**
     * Deletes a policy exemption.
     * 
     * This operation deletes a policy exemption, given its name and the scope it was created in. The scope of a policy exemption is the part of its ID preceding '/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}'.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String policyExemptionName, Context context);

    /**
     * Deletes a policy exemption.
     * 
     * This operation deletes a policy exemption, given its name and the scope it was created in. The scope of a policy exemption is the part of its ID preceding '/providers/Microsoft.Authorization/policyExemptions/{policyExemptionName}'.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String policyExemptionName);

    /**
     * Creates or updates a policy exemption.
     * 
     *  This operation creates or updates a policy exemption with the given scope and name. Policy exemptions apply to all resources contained within their scope. For example, when you create a policy exemption at resource group scope for a policy assignment at the same or above level, the exemption exempts to all applicable resources in the resource group.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @param parameters Parameters for the policy exemption.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy exemption along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyExemptionInner> createOrUpdateWithResponse(String scope, String policyExemptionName,
        PolicyExemptionInner parameters, Context context);

    /**
     * Creates or updates a policy exemption.
     * 
     *  This operation creates or updates a policy exemption with the given scope and name. Policy exemptions apply to all resources contained within their scope. For example, when you create a policy exemption at resource group scope for a policy assignment at the same or above level, the exemption exempts to all applicable resources in the resource group.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @param parameters Parameters for the policy exemption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy exemption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyExemptionInner createOrUpdate(String scope, String policyExemptionName, PolicyExemptionInner parameters);

    /**
     * Retrieves a policy exemption.
     * 
     * This operation retrieves a single policy exemption, given its name and the scope it was created at.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy exemption along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyExemptionInner> getWithResponse(String scope, String policyExemptionName, Context context);

    /**
     * Retrieves a policy exemption.
     * 
     * This operation retrieves a single policy exemption, given its name and the scope it was created at.
     * 
     * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
     * @param policyExemptionName The name of the policy exemption to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy exemption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyExemptionInner get(String scope, String policyExemptionName);

    /**
     * Retrieves all policy exemptions that apply to a subscription.
     * 
     * This operation retrieves the list of all policy exemptions associated with the given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the subscription, including those that apply directly or from management groups that contain the given subscription, as well as any applied to objects contained within the subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> list();

    /**
     * Retrieves all policy exemptions that apply to a subscription.
     * 
     * This operation retrieves the list of all policy exemptions associated with the given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the subscription, including those that apply directly or from management groups that contain the given subscription, as well as any applied to objects contained within the subscription.
     * 
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, no filtering is performed. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the scope, including those that apply directly or apply from containing scopes. If $filter=atScope() is provided, the returned list only includes all policy exemptions that apply to the scope, which is everything in the unfiltered list except those applied to sub scopes contained within the given scope. If $filter=atExactScope() is provided, the returned list only includes all policy exemptions that at the given scope. If $filter=excludeExpired() is provided, the returned list only includes all policy exemptions that either haven't expired or didn't set expiration date. If $filter=policyAssignmentId eq '{value}' is provided. the returned list only includes all policy exemptions that are associated with the give policyAssignmentId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> list(String filter, Context context);

    /**
     * Retrieves all policy exemptions that apply to a resource group.
     * 
     * This operation retrieves the list of all policy exemptions associated with the given resource group in the given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the resource group, including those that apply directly or apply from containing scopes, as well as any applied to resources contained within the resource group.
     * 
     * @param resourceGroupName The name of the resource group containing the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieves all policy exemptions that apply to a resource group.
     * 
     * This operation retrieves the list of all policy exemptions associated with the given resource group in the given subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the resource group, including those that apply directly or apply from containing scopes, as well as any applied to resources contained within the resource group.
     * 
     * @param resourceGroupName The name of the resource group containing the resource.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, no filtering is performed. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the scope, including those that apply directly or apply from containing scopes. If $filter=atScope() is provided, the returned list only includes all policy exemptions that apply to the scope, which is everything in the unfiltered list except those applied to sub scopes contained within the given scope. If $filter=atExactScope() is provided, the returned list only includes all policy exemptions that at the given scope. If $filter=excludeExpired() is provided, the returned list only includes all policy exemptions that either haven't expired or didn't set expiration date. If $filter=policyAssignmentId eq '{value}' is provided. the returned list only includes all policy exemptions that are associated with the give policyAssignmentId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Retrieves all policy exemptions that apply to a resource.
     * 
     * This operation retrieves the list of all policy exemptions associated with the specified resource in the given resource group and subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the resource, including those that apply directly or from all containing scopes, as well as any applied to resources contained within the resource. Three parameters plus the resource name are used to identify a specific resource. If the resource is not part of a parent resource (the more common case), the parent resource path should not be provided (or provided as ''). For example a web app could be specified as ({resourceProviderNamespace} == 'Microsoft.Web', {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} == 'MyWebApp'). If the resource is part of a parent resource, then all parameters should be provided. For example a virtual machine DNS name could be specified as ({resourceProviderNamespace} == 'Microsoft.Compute', {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType} == 'domainNames', {resourceName} == 'MyComputerName'). A convenient alternative to providing the namespace and type name separately is to provide both in the {resourceType} parameter, format: ({resourceProviderNamespace} == '', {parentResourcePath} == '', {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
     * 
     * @param resourceGroupName The name of the resource group containing the resource.
     * @param resourceProviderNamespace The namespace of the resource provider. For example, the namespace of a virtual machine is Microsoft.Compute (from Microsoft.Compute/virtualMachines).
     * @param parentResourcePath The parent resource path. Use empty string if there is none.
     * @param resourceType The resource type name. For example the type name of a web app is 'sites' (from Microsoft.Web/sites).
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listForResource(String resourceGroupName, String resourceProviderNamespace,
        String parentResourcePath, String resourceType, String resourceName);

    /**
     * Retrieves all policy exemptions that apply to a resource.
     * 
     * This operation retrieves the list of all policy exemptions associated with the specified resource in the given resource group and subscription that match the optional given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the resource, including those that apply directly or from all containing scopes, as well as any applied to resources contained within the resource. Three parameters plus the resource name are used to identify a specific resource. If the resource is not part of a parent resource (the more common case), the parent resource path should not be provided (or provided as ''). For example a web app could be specified as ({resourceProviderNamespace} == 'Microsoft.Web', {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} == 'MyWebApp'). If the resource is part of a parent resource, then all parameters should be provided. For example a virtual machine DNS name could be specified as ({resourceProviderNamespace} == 'Microsoft.Compute', {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType} == 'domainNames', {resourceName} == 'MyComputerName'). A convenient alternative to providing the namespace and type name separately is to provide both in the {resourceType} parameter, format: ({resourceProviderNamespace} == '', {parentResourcePath} == '', {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
     * 
     * @param resourceGroupName The name of the resource group containing the resource.
     * @param resourceProviderNamespace The namespace of the resource provider. For example, the namespace of a virtual machine is Microsoft.Compute (from Microsoft.Compute/virtualMachines).
     * @param parentResourcePath The parent resource path. Use empty string if there is none.
     * @param resourceType The resource type name. For example the type name of a web app is 'sites' (from Microsoft.Web/sites).
     * @param resourceName The name of the resource.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, no filtering is performed. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the scope, including those that apply directly or apply from containing scopes. If $filter=atScope() is provided, the returned list only includes all policy exemptions that apply to the scope, which is everything in the unfiltered list except those applied to sub scopes contained within the given scope. If $filter=atExactScope() is provided, the returned list only includes all policy exemptions that at the given scope. If $filter=excludeExpired() is provided, the returned list only includes all policy exemptions that either haven't expired or didn't set expiration date. If $filter=policyAssignmentId eq '{value}' is provided. the returned list only includes all policy exemptions that are associated with the give policyAssignmentId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listForResource(String resourceGroupName, String resourceProviderNamespace,
        String parentResourcePath, String resourceType, String resourceName, String filter, Context context);

    /**
     * Retrieves all policy exemptions that apply to a management group.
     * 
     * This operation retrieves the list of all policy exemptions applicable to the management group that match the given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter=atScope() is provided, the returned list includes all policy exemptions that are assigned to the management group or the management group's ancestors.
     * 
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listForManagementGroup(String managementGroupId);

    /**
     * Retrieves all policy exemptions that apply to a management group.
     * 
     * This operation retrieves the list of all policy exemptions applicable to the management group that match the given $filter. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter=atScope() is provided, the returned list includes all policy exemptions that are assigned to the management group or the management group's ancestors.
     * 
     * @param managementGroupId The ID of the management group.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atScope()', 'atExactScope()', 'excludeExpired()' or 'policyAssignmentId eq '{value}''. If $filter is not provided, no filtering is performed. If $filter is not provided, the unfiltered list includes all policy exemptions associated with the scope, including those that apply directly or apply from containing scopes. If $filter=atScope() is provided, the returned list only includes all policy exemptions that apply to the scope, which is everything in the unfiltered list except those applied to sub scopes contained within the given scope. If $filter=atExactScope() is provided, the returned list only includes all policy exemptions that at the given scope. If $filter=excludeExpired() is provided, the returned list only includes all policy exemptions that either haven't expired or didn't set expiration date. If $filter=policyAssignmentId eq '{value}' is provided. the returned list only includes all policy exemptions that are associated with the give policyAssignmentId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy exemptions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyExemptionInner> listForManagementGroup(String managementGroupId, String filter,
        Context context);
}
