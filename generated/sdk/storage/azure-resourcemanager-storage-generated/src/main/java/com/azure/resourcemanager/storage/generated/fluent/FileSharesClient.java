// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.FileShareInner;
import com.azure.resourcemanager.storage.generated.fluent.models.FileShareItemInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LeaseShareResponseInner;
import com.azure.resourcemanager.storage.generated.models.DeletedShare;
import com.azure.resourcemanager.storage.generated.models.FileSharesLeaseResponse;
import com.azure.resourcemanager.storage.generated.models.LeaseShareRequest;

/** An instance of this class provides access to all the operations defined in FileSharesClient. */
public interface FileSharesClient {
    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileShareItemInner> list(String resourceGroupName, String accountName);

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties. Valid values are: deleted,
     *     snapshots. Should be passed as a string with delimiter ','.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FileShareItemInner> list(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        String expand,
        Context context);

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileShareInner create(String resourceGroupName, String accountName, String shareName, FileShareInner fileShare);

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share to create.
     * @param expand Optional, used to expand the properties within share's properties. Valid values are: snapshots.
     *     Should be passed as a string with delimiter ','.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileShareInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String shareName,
        FileShareInner fileShare,
        String expand,
        Context context);

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties to update for the file share.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileShareInner update(String resourceGroupName, String accountName, String shareName, FileShareInner fileShare);

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties to update for the file share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileShareInner> updateWithResponse(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare, Context context);

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileShareInner get(String resourceGroupName, String accountName, String shareName);

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties. Valid values are: stats. Should
     *     be passed as a string with delimiter ','.
     * @param xMsSnapshot Optional, used to retrieve properties of a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FileShareInner> getWithResponse(
        String resourceGroupName,
        String accountName,
        String shareName,
        String expand,
        String xMsSnapshot,
        Context context);

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String shareName);

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param xMsSnapshot Optional, used to delete a snapshot.
     * @param include Optional. Valid values are: snapshots, leased-snapshots, none. The default value is snapshots. For
     *     'snapshots', the file share is deleted including all of its file share snapshots. If the file share contains
     *     leased-snapshots, the deletion fails. For 'leased-snapshots', the file share is deleted included all of its
     *     file share snapshots (leased/unleased). For 'none', the file share is deleted if it has no share snapshots.
     *     If the file share contains any snapshots (leased or unleased), the deletion fails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String accountName,
        String shareName,
        String xMsSnapshot,
        String include,
        Context context);

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restore(String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare);

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> restoreWithResponse(
        String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare, Context context);

    /**
     * The Lease Share operation establishes and manages a lock on a share for delete operations. The lock duration can
     * be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Share response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LeaseShareResponseInner lease(String resourceGroupName, String accountName, String shareName);

    /**
     * The Lease Share operation establishes and manages a lock on a share for delete operations. The lock duration can
     * be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param xMsSnapshot Optional. Specify the snapshot time to lease a snapshot.
     * @param parameters Lease Share request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Share response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FileSharesLeaseResponse leaseWithResponse(
        String resourceGroupName,
        String accountName,
        String shareName,
        String xMsSnapshot,
        LeaseShareRequest parameters,
        Context context);
}
