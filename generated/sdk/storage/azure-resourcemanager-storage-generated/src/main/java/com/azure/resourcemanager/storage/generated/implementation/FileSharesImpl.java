// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.FileSharesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.FileShareInner;
import com.azure.resourcemanager.storage.generated.fluent.models.FileShareItemInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LeaseShareResponseInner;
import com.azure.resourcemanager.storage.generated.models.DeletedShare;
import com.azure.resourcemanager.storage.generated.models.FileShare;
import com.azure.resourcemanager.storage.generated.models.FileShareItem;
import com.azure.resourcemanager.storage.generated.models.FileShares;
import com.azure.resourcemanager.storage.generated.models.FileSharesLeaseResponse;
import com.azure.resourcemanager.storage.generated.models.LeaseShareRequest;
import com.azure.resourcemanager.storage.generated.models.LeaseShareResponse;

public final class FileSharesImpl implements FileShares {
    private static final ClientLogger LOGGER = new ClientLogger(FileSharesImpl.class);

    private final FileSharesClient innerClient;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public FileSharesImpl(FileSharesClient innerClient,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FileShareItem> list(String resourceGroupName, String accountName) {
        PagedIterable<FileShareItemInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FileShareItemImpl(inner1, this.manager()));
    }

    public PagedIterable<FileShareItem> list(String resourceGroupName, String accountName, String maxpagesize,
        String filter, String expand, Context context) {
        PagedIterable<FileShareItemInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, maxpagesize, filter, expand, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FileShareItemImpl(inner1, this.manager()));
    }

    public Response<FileShare> getWithResponse(String resourceGroupName, String accountName, String shareName,
        String expand, String xMsSnapshot, Context context) {
        Response<FileShareInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, accountName, shareName, expand, xMsSnapshot, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FileShareImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileShare get(String resourceGroupName, String accountName, String shareName) {
        FileShareInner inner = this.serviceClient().get(resourceGroupName, accountName, shareName);
        if (inner != null) {
            return new FileShareImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String shareName,
        String xMsSnapshot, String include, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, accountName, shareName, xMsSnapshot, include, context);
    }

    public void delete(String resourceGroupName, String accountName, String shareName) {
        this.serviceClient().delete(resourceGroupName, accountName, shareName);
    }

    public Response<Void> restoreWithResponse(String resourceGroupName, String accountName, String shareName,
        DeletedShare deletedShare, Context context) {
        return this.serviceClient()
            .restoreWithResponse(resourceGroupName, accountName, shareName, deletedShare, context);
    }

    public void restore(String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare) {
        this.serviceClient().restore(resourceGroupName, accountName, shareName, deletedShare);
    }

    public Response<LeaseShareResponse> leaseWithResponse(String resourceGroupName, String accountName,
        String shareName, String xMsSnapshot, LeaseShareRequest parameters, Context context) {
        FileSharesLeaseResponse inner = this.serviceClient()
            .leaseWithResponse(resourceGroupName, accountName, shareName, xMsSnapshot, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LeaseShareResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LeaseShareResponse lease(String resourceGroupName, String accountName, String shareName) {
        LeaseShareResponseInner inner = this.serviceClient().lease(resourceGroupName, accountName, shareName);
        if (inner != null) {
            return new LeaseShareResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FileShare getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String shareName = ResourceManagerUtils.getValueFromIdByName(id, "shares");
        if (shareName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String localExpand = null;
        String localXMsSnapshot = null;
        return this
            .getWithResponse(resourceGroupName, accountName, shareName, localExpand, localXMsSnapshot, Context.NONE)
            .getValue();
    }

    public Response<FileShare> getByIdWithResponse(String id, String expand, String xMsSnapshot, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String shareName = ResourceManagerUtils.getValueFromIdByName(id, "shares");
        if (shareName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, shareName, expand, xMsSnapshot, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String shareName = ResourceManagerUtils.getValueFromIdByName(id, "shares");
        if (shareName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String localXMsSnapshot = null;
        String localInclude = null;
        this.deleteWithResponse(resourceGroupName, accountName, shareName, localXMsSnapshot, localInclude,
            Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, String xMsSnapshot, String include, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String shareName = ResourceManagerUtils.getValueFromIdByName(id, "shares");
        if (shareName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, shareName, xMsSnapshot, include, context);
    }

    private FileSharesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    public FileShareImpl define(String name) {
        return new FileShareImpl(name, this.manager());
    }
}
