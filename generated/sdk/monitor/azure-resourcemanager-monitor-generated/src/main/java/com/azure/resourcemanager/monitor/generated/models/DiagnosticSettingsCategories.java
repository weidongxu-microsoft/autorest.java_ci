// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DiagnosticSettingsCategories.
 */
public interface DiagnosticSettingsCategories {
    /**
     * Gets the diagnostic settings category for the specified resource.
     * 
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource along with {@link Response}.
     */
    Response<DiagnosticSettingsCategoryResource> getWithResponse(String resourceUri, String name, Context context);

    /**
     * Gets the diagnostic settings category for the specified resource.
     * 
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    DiagnosticSettingsCategoryResource get(String resourceUri, String name);

    /**
     * Lists the diagnostic settings categories for the specified resource.
     * 
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources along with {@link Response}.
     */
    Response<DiagnosticSettingsCategoryResourceCollection> listWithResponse(String resourceUri, Context context);

    /**
     * Lists the diagnostic settings categories for the specified resource.
     * 
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    DiagnosticSettingsCategoryResourceCollection list(String resourceUri);
}
