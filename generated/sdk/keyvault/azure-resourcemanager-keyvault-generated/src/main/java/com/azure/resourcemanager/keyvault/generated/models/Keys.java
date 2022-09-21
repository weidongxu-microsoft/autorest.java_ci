// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Keys. */
public interface Keys {
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
    Response<Key> getWithResponse(String resourceGroupName, String vaultName, String keyName, Context context);

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
    Key get(String resourceGroupName, String vaultName, String keyName);

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
    PagedIterable<Key> list(String resourceGroupName, String vaultName);

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
    PagedIterable<Key> list(String resourceGroupName, String vaultName, Context context);

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
    Response<Key> getVersionWithResponse(
        String resourceGroupName, String vaultName, String keyName, String keyVersion, Context context);

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
    Key getVersion(String resourceGroupName, String vaultName, String keyName, String keyVersion);

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
    PagedIterable<Key> listVersions(String resourceGroupName, String vaultName, String keyName);

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
    PagedIterable<Key> listVersions(String resourceGroupName, String vaultName, String keyName, Context context);

    /**
     * Gets the current version of the specified key from the specified key vault.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current version of the specified key from the specified key vault along with {@link Response}.
     */
    Key getById(String id);

    /**
     * Gets the current version of the specified key from the specified key vault.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current version of the specified key from the specified key vault along with {@link Response}.
     */
    Response<Key> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Key resource.
     *
     * @param name resource name.
     * @return the first stage of the new Key definition.
     */
    Key.DefinitionStages.Blank define(String name);
}
