// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.CaCertificateInner;

/** An instance of this class provides access to all the operations defined in CaCertificatesClient. */
public interface CaCertificatesClient {
    /**
     * Get a CA certificate.
     *
     * <p>Get properties of a CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a CA certificate along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CaCertificateInner> getWithResponse(
        String resourceGroupName, String namespaceName, String caCertificateName, Context context);

    /**
     * Get a CA certificate.
     *
     * <p>Get properties of a CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a CA certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CaCertificateInner get(String resourceGroupName, String namespaceName, String caCertificateName);

    /**
     * Create or update a CA certificate.
     *
     * <p>Create or update a CA certificate with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName The CA certificate name.
     * @param caCertificateInfo CA certificate information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the CA Certificate resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CaCertificateInner>, CaCertificateInner> beginCreateOrUpdate(
        String resourceGroupName, String namespaceName, String caCertificateName, CaCertificateInner caCertificateInfo);

    /**
     * Create or update a CA certificate.
     *
     * <p>Create or update a CA certificate with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName The CA certificate name.
     * @param caCertificateInfo CA certificate information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the CA Certificate resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CaCertificateInner>, CaCertificateInner> beginCreateOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String caCertificateName,
        CaCertificateInner caCertificateInfo,
        Context context);

    /**
     * Create or update a CA certificate.
     *
     * <p>Create or update a CA certificate with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName The CA certificate name.
     * @param caCertificateInfo CA certificate information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CA Certificate resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CaCertificateInner createOrUpdate(
        String resourceGroupName, String namespaceName, String caCertificateName, CaCertificateInner caCertificateInfo);

    /**
     * Create or update a CA certificate.
     *
     * <p>Create or update a CA certificate with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName The CA certificate name.
     * @param caCertificateInfo CA certificate information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CA Certificate resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CaCertificateInner createOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String caCertificateName,
        CaCertificateInner caCertificateInfo,
        Context context);

    /**
     * Delete a CA certificate.
     *
     * <p>Delete an existing CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String namespaceName, String caCertificateName);

    /**
     * Delete a CA certificate.
     *
     * <p>Delete an existing CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String namespaceName, String caCertificateName, Context context);

    /**
     * Delete a CA certificate.
     *
     * <p>Delete an existing CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String caCertificateName);

    /**
     * Delete a CA certificate.
     *
     * <p>Delete an existing CA certificate.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param caCertificateName Name of the CA certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String caCertificateName, Context context);

    /**
     * List all CA certificates under a namespace.
     *
     * <p>Get all the CA certificates under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the CA certificates under a namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CaCertificateInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * List all CA certificates under a namespace.
     *
     * <p>Get all the CA certificates under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the CA certificates under a namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CaCertificateInner> listByNamespace(
        String resourceGroupName, String namespaceName, String filter, Integer top, Context context);
}
