// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.fluent.models.AdminKeyResultInner;
import com.azure.resourcemanager.search.generated.models.AdminKeyKind;
import java.util.UUID;

/**
 * An instance of this class provides access to all the operations defined in AdminKeysClient.
 */
public interface AdminKeysClient {
    /**
     * Gets the primary and secondary admin API keys for the specified Azure AI Search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure AI Search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure AI Search service along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdminKeyResultInner> getWithResponse(String resourceGroupName, String searchServiceName,
        UUID clientRequestId, Context context);

    /**
     * Gets the primary and secondary admin API keys for the specified Azure AI Search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure AI Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the primary and secondary admin API keys for the specified Azure AI Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdminKeyResultInner get(String resourceGroupName, String searchServiceName);

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure AI Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure AI Search service along
     * with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdminKeyResultInner> regenerateWithResponse(String resourceGroupName, String searchServiceName,
        AdminKeyKind keyKind, UUID clientRequestId, Context context);

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure AI Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the primary and secondary admin API keys for a given Azure AI Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdminKeyResultInner regenerate(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind);
}
