// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Queues. */
public interface Queues {
    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    StorageQueue get(String resourceGroupName, String accountName, String queueName);

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists along with {@link
     *     Response}.
     */
    Response<StorageQueue> getWithResponse(
        String resourceGroupName, String accountName, String queueName, Context context);

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String queueName);

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String queueName, Context context);

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ListQueue> list(String resourceGroupName, String accountName);

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ListQueue> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, Context context);

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists along with {@link
     *     Response}.
     */
    StorageQueue getById(String id);

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists along with {@link
     *     Response}.
     */
    Response<StorageQueue> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
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
     * Begins definition for a new StorageQueue resource.
     *
     * @param name resource name.
     * @return the first stage of the new StorageQueue definition.
     */
    StorageQueue.DefinitionStages.Blank define(String name);
}
