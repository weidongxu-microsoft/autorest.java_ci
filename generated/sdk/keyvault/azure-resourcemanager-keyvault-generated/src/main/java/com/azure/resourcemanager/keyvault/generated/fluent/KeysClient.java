// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.KeyInner;
import com.azure.resourcemanager.keyvault.generated.models.KeyCreateParameters;

/**
 * An instance of this class provides access to all the operations defined in KeysClient.
 */
public interface KeysClient {
    /**
     * Creates the first version of a new key if it does not exist. If it already exists, then the existing key is returned without any write operations being performed. This API does not create subsequent versions, and does not update existing keys.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the key vault which contains the key to be created.
     * @param keyName The name of the key to be created. The value you provide may be copied globally for the purpose of running the service. The value provided should not include personally identifiable or sensitive information.
     * @param parameters The parameters used to create the specified key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the key resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KeyInner> createIfNotExistWithResponse(String resourceGroupName, String vaultName, String keyName,
        KeyCreateParameters parameters, Context context);

    /**
     * Creates the first version of a new key if it does not exist. If it already exists, then the existing key is returned without any write operations being performed. This API does not create subsequent versions, and does not update existing keys.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the key vault which contains the key to be created.
     * @param keyName The name of the key to be created. The value you provide may be copied globally for the purpose of running the service. The value provided should not include personally identifiable or sensitive information.
     * @param parameters The parameters used to create the specified key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the key resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KeyInner createIfNotExist(String resourceGroupName, String vaultName, String keyName,
        KeyCreateParameters parameters);

    /**
     * Gets the current version of the specified key from the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key to be retrieved.
     * @param keyName The name of the key to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current version of the specified key from the specified key vault along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KeyInner> getWithResponse(String resourceGroupName, String vaultName, String keyName, Context context);

    /**
     * Gets the current version of the specified key from the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key to be retrieved.
     * @param keyName The name of the key to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current version of the specified key from the specified key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KeyInner get(String resourceGroupName, String vaultName, String keyName);

    /**
     * Lists the keys in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the keys to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the page of keys as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KeyInner> list(String resourceGroupName, String vaultName);

    /**
     * Lists the keys in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the keys to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the page of keys as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KeyInner> list(String resourceGroupName, String vaultName, Context context);

    /**
     * Gets the specified version of the specified key in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key version to be retrieved.
     * @param keyName The name of the key version to be retrieved.
     * @param keyVersion The version of the key to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified version of the specified key in the specified key vault along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KeyInner> getVersionWithResponse(String resourceGroupName, String vaultName, String keyName,
        String keyVersion, Context context);

    /**
     * Gets the specified version of the specified key in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key version to be retrieved.
     * @param keyName The name of the key version to be retrieved.
     * @param keyVersion The version of the key to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified version of the specified key in the specified key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KeyInner getVersion(String resourceGroupName, String vaultName, String keyName, String keyVersion);

    /**
     * Lists the versions of the specified key in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key versions to be retrieved.
     * @param keyName The name of the key versions to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the page of keys as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KeyInner> listVersions(String resourceGroupName, String vaultName, String keyName);

    /**
     * Lists the versions of the specified key in the specified key vault.
     * 
     * @param resourceGroupName The name of the resource group which contains the specified key vault.
     * @param vaultName The name of the vault which contains the key versions to be retrieved.
     * @param keyName The name of the key versions to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the page of keys as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KeyInner> listVersions(String resourceGroupName, String vaultName, String keyName, Context context);
}
