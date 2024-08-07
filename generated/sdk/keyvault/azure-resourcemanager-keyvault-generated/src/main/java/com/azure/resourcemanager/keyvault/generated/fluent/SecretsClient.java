// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.SecretInner;
import com.azure.resourcemanager.keyvault.generated.models.SecretCreateOrUpdateParameters;
import com.azure.resourcemanager.keyvault.generated.models.SecretPatchParameters;

/**
 * An instance of this class provides access to all the operations defined in SecretsClient.
 */
public interface SecretsClient {
    /**
     * Create or update a secret in a key vault in the specified subscription. NOTE: This API is intended for internal
     * use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName Name of the vault.
     * @param secretName Name of the secret. The value you provide may be copied globally for the purpose of running the
     * service. The value provided should not include personally identifiable or sensitive information.
     * @param parameters Parameters to create or update the secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> createOrUpdateWithResponse(String resourceGroupName, String vaultName, String secretName,
        SecretCreateOrUpdateParameters parameters, Context context);

    /**
     * Create or update a secret in a key vault in the specified subscription. NOTE: This API is intended for internal
     * use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName Name of the vault.
     * @param secretName Name of the secret. The value you provide may be copied globally for the purpose of running the
     * service. The value provided should not include personally identifiable or sensitive information.
     * @param parameters Parameters to create or update the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner createOrUpdate(String resourceGroupName, String vaultName, String secretName,
        SecretCreateOrUpdateParameters parameters);

    /**
     * Update a secret in the specified subscription. NOTE: This API is intended for internal use in ARM deployments.
     * Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName Name of the vault.
     * @param secretName Name of the secret.
     * @param parameters Parameters to patch the secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> updateWithResponse(String resourceGroupName, String vaultName, String secretName,
        SecretPatchParameters parameters, Context context);

    /**
     * Update a secret in the specified subscription. NOTE: This API is intended for internal use in ARM deployments.
     * Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName Name of the vault.
     * @param secretName Name of the secret.
     * @param parameters Parameters to patch the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner update(String resourceGroupName, String vaultName, String secretName, SecretPatchParameters parameters);

    /**
     * Gets the specified secret. NOTE: This API is intended for internal use in ARM deployments. Users should use the
     * data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param secretName The name of the secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified secret along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> getWithResponse(String resourceGroupName, String vaultName, String secretName,
        Context context);

    /**
     * Gets the specified secret. NOTE: This API is intended for internal use in ARM deployments. Users should use the
     * data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param secretName The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner get(String resourceGroupName, String vaultName, String secretName);

    /**
     * The List operation gets information about the secrets in a vault. NOTE: This API is intended for internal use in
     * ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of secrets as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> list(String resourceGroupName, String vaultName);

    /**
     * The List operation gets information about the secrets in a vault. NOTE: This API is intended for internal use in
     * ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param top Maximum number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of secrets as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> list(String resourceGroupName, String vaultName, Integer top, Context context);
}
