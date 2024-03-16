// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RoleDefinitions.
 */
public interface RoleDefinitions {
    /**
     * Deletes a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition along with {@link Response}.
     */
    Response<RoleDefinition> deleteByResourceGroupWithResponse(String scope, String roleDefinitionId, Context context);

    /**
     * Deletes a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    RoleDefinition deleteByResourceGroup(String scope, String roleDefinitionId);

    /**
     * Get role definition by name (GUID).
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID) along with {@link Response}.
     */
    Response<RoleDefinition> getWithResponse(String scope, String roleDefinitionId, Context context);

    /**
     * Get role definition by name (GUID).
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID).
     */
    RoleDefinition get(String scope, String roleDefinitionId);

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RoleDefinition> list(String scope);

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as well.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RoleDefinition> list(String scope, String filter, Context context);

    /**
     * Gets a role definition by ID.
     * 
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID along with {@link Response}.
     */
    Response<RoleDefinition> getByIdWithResponse(String roleId, Context context);

    /**
     * Gets a role definition by ID.
     * 
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID.
     */
    RoleDefinition getById(String roleId);

    /**
     * Deletes a role definition.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition along with {@link Response}.
     */
    RoleDefinition deleteById(String id);

    /**
     * Deletes a role definition.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition along with {@link Response}.
     */
    Response<RoleDefinition> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RoleDefinition resource.
     * 
     * @param name resource name.
     * @return the first stage of the new RoleDefinition definition.
     */
    RoleDefinition.DefinitionStages.Blank define(String name);
}
