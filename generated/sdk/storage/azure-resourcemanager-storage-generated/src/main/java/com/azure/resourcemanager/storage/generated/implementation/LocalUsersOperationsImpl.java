// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.LocalUsersOperationsClient;
import com.azure.resourcemanager.storage.generated.fluent.models.LocalUserInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LocalUserKeysInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LocalUserRegeneratePasswordResultInner;
import com.azure.resourcemanager.storage.generated.models.LocalUser;
import com.azure.resourcemanager.storage.generated.models.LocalUserKeys;
import com.azure.resourcemanager.storage.generated.models.LocalUserRegeneratePasswordResult;
import com.azure.resourcemanager.storage.generated.models.LocalUsersOperations;

public final class LocalUsersOperationsImpl implements LocalUsersOperations {
    private static final ClientLogger LOGGER = new ClientLogger(LocalUsersOperationsImpl.class);

    private final LocalUsersOperationsClient innerClient;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public LocalUsersOperationsImpl(LocalUsersOperationsClient innerClient,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LocalUser> list(String resourceGroupName, String accountName) {
        PagedIterable<LocalUserInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalUserImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalUser> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<LocalUserInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalUserImpl(inner1, this.manager()));
    }

    public Response<LocalUser> getWithResponse(String resourceGroupName, String accountName, String username,
        Context context) {
        Response<LocalUserInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, username, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LocalUserImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LocalUser get(String resourceGroupName, String accountName, String username) {
        LocalUserInner inner = this.serviceClient().get(resourceGroupName, accountName, username);
        if (inner != null) {
            return new LocalUserImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String username,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, username, context);
    }

    public void delete(String resourceGroupName, String accountName, String username) {
        this.serviceClient().delete(resourceGroupName, accountName, username);
    }

    public Response<LocalUserKeys> listKeysWithResponse(String resourceGroupName, String accountName, String username,
        Context context) {
        Response<LocalUserKeysInner> inner
            = this.serviceClient().listKeysWithResponse(resourceGroupName, accountName, username, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LocalUserKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LocalUserKeys listKeys(String resourceGroupName, String accountName, String username) {
        LocalUserKeysInner inner = this.serviceClient().listKeys(resourceGroupName, accountName, username);
        if (inner != null) {
            return new LocalUserKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LocalUserRegeneratePasswordResult> regeneratePasswordWithResponse(String resourceGroupName,
        String accountName, String username, Context context) {
        Response<LocalUserRegeneratePasswordResultInner> inner
            = this.serviceClient().regeneratePasswordWithResponse(resourceGroupName, accountName, username, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LocalUserRegeneratePasswordResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LocalUserRegeneratePasswordResult regeneratePassword(String resourceGroupName, String accountName,
        String username) {
        LocalUserRegeneratePasswordResultInner inner
            = this.serviceClient().regeneratePassword(resourceGroupName, accountName, username);
        if (inner != null) {
            return new LocalUserRegeneratePasswordResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LocalUser getById(String id) {
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
        String username = ResourceManagerUtils.getValueFromIdByName(id, "localUsers");
        if (username == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localUsers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, username, Context.NONE).getValue();
    }

    public Response<LocalUser> getByIdWithResponse(String id, Context context) {
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
        String username = ResourceManagerUtils.getValueFromIdByName(id, "localUsers");
        if (username == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localUsers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, username, context);
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
        String username = ResourceManagerUtils.getValueFromIdByName(id, "localUsers");
        if (username == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localUsers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, username, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
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
        String username = ResourceManagerUtils.getValueFromIdByName(id, "localUsers");
        if (username == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localUsers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, username, context);
    }

    private LocalUsersOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    public LocalUserImpl define(String name) {
        return new LocalUserImpl(name, this.manager());
    }
}
