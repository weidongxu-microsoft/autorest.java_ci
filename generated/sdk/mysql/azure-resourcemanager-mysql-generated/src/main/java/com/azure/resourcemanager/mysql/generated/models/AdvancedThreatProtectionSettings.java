// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AdvancedThreatProtectionSettings.
 */
public interface AdvancedThreatProtectionSettings {
    /**
     * Get a server's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection state along with {@link Response}.
     */
    Response<AdvancedThreatProtection> getWithResponse(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, Context context);

    /**
     * Get a server's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection state.
     */
    AdvancedThreatProtection get(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName);

    /**
     * Updates a server's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The server's Advanced Threat Protection body to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection.
     */
    AdvancedThreatProtection update(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionForUpdate parameters);

    /**
     * Updates a server's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The server's Advanced Threat Protection body to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection.
     */
    AdvancedThreatProtection update(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionForUpdate parameters,
        Context context);

    /**
     * Gets a list of server's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server's Advanced Threat Protection states as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AdvancedThreatProtection> list(String resourceGroupName, String serverName);

    /**
     * Gets a list of server's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server's Advanced Threat Protection states as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AdvancedThreatProtection> list(String resourceGroupName, String serverName, Context context);
}
