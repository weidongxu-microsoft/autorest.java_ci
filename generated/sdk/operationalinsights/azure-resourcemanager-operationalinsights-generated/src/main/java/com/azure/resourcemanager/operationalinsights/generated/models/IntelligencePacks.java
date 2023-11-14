// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/**
 * Resource collection API of IntelligencePacks.
 */
public interface IntelligencePacks {
    /**
     * Disables an intelligence pack for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> disableWithResponse(String resourceGroupName, String workspaceName, String intelligencePackName,
        Context context);

    /**
     * Disables an intelligence pack for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disable(String resourceGroupName, String workspaceName, String intelligencePackName);

    /**
     * Enables an intelligence pack for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableWithResponse(String resourceGroupName, String workspaceName, String intelligencePackName,
        Context context);

    /**
     * Enables an intelligence pack for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the intelligence pack to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enable(String resourceGroupName, String workspaceName, String intelligencePackName);

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack along with {@link Response}.
     */
    Response<List<IntelligencePack>> listWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Lists all the intelligence packs possible and whether they are enabled or disabled for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    List<IntelligencePack> list(String resourceGroupName, String workspaceName);
}
