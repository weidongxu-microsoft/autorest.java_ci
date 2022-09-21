// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WebTests. */
public interface WebTests {
    /**
     * Get all Application Insights web tests defined within a specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined within a specified resource group as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<WebTest> listByResourceGroup(String resourceGroupName);

    /**
     * Get all Application Insights web tests defined within a specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined within a specified resource group as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<WebTest> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a specific Application Insights web test definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights webtest resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition along with {@link Response}.
     */
    Response<WebTest> getByResourceGroupWithResponse(String resourceGroupName, String webTestName, Context context);

    /**
     * Get a specific Application Insights web test definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights webtest resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition.
     */
    WebTest getByResourceGroup(String resourceGroupName, String webTestName);

    /**
     * Deletes an Application Insights web test.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights webtest resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String webTestName, Context context);

    /**
     * Deletes an Application Insights web test.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights webtest resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String webTestName);

    /**
     * Get all Application Insights web test alerts definitions within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web test alerts definitions within a subscription as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<WebTest> list();

    /**
     * Get all Application Insights web test alerts definitions within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web test alerts definitions within a subscription as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<WebTest> list(Context context);

    /**
     * Get all Application Insights web tests defined for the specified component.
     *
     * @param componentName The name of the Application Insights component resource.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified component as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName);

    /**
     * Get all Application Insights web tests defined for the specified component.
     *
     * @param componentName The name of the Application Insights component resource.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified component as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<WebTest> listByComponent(String componentName, String resourceGroupName, Context context);

    /**
     * Get a specific Application Insights web test definition.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition along with {@link Response}.
     */
    WebTest getById(String id);

    /**
     * Get a specific Application Insights web test definition.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition along with {@link Response}.
     */
    Response<WebTest> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Application Insights web test.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Application Insights web test.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new WebTest resource.
     *
     * @param name resource name.
     * @return the first stage of the new WebTest definition.
     */
    WebTest.DefinitionStages.Blank define(String name);
}
