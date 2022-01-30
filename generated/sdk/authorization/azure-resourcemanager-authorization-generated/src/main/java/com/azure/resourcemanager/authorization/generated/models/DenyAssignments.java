// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DenyAssignments. */
public interface DenyAssignments {
    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName);

    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Context context);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listByResourceGroup(String resourceGroupName);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Gets all deny assignments for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> list();

    /**
     * Gets all deny assignments for the subscription.
     *
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> list(String filter, Context context);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment.
     */
    DenyAssignment get(String scope, String denyAssignmentId);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment along with {@link Response}.
     */
    Response<DenyAssignment> getWithResponse(String scope, String denyAssignmentId, Context context);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID.
     */
    DenyAssignment getById(String denyAssignmentId);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID along with {@link Response}.
     */
    Response<DenyAssignment> getByIdWithResponse(String denyAssignmentId, Context context);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listForScope(String scope);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DenyAssignment> listForScope(String scope, String filter, Context context);
}
