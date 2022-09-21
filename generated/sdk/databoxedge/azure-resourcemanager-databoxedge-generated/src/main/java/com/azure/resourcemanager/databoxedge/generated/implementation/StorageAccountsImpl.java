// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.StorageAccountsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountInner;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccount;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccounts;

public final class StorageAccountsImpl implements StorageAccounts {
    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountsImpl.class);

    private final StorageAccountsClient innerClient;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public StorageAccountsImpl(
        StorageAccountsClient innerClient,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageAccount> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<StorageAccountInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new StorageAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageAccount> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context) {
        PagedIterable<StorageAccountInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new StorageAccountImpl(inner1, this.manager()));
    }

    public Response<StorageAccount> getWithResponse(
        String deviceName, String storageAccountName, String resourceGroupName, Context context) {
        Response<StorageAccountInner> inner =
            this.serviceClient().getWithResponse(deviceName, storageAccountName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageAccount get(String deviceName, String storageAccountName, String resourceGroupName) {
        StorageAccountInner inner = this.serviceClient().get(deviceName, storageAccountName, resourceGroupName);
        if (inner != null) {
            return new StorageAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String storageAccountName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, storageAccountName, resourceGroupName);
    }

    public void delete(String deviceName, String storageAccountName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, storageAccountName, resourceGroupName, context);
    }

    public StorageAccount getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, storageAccountName, resourceGroupName, Context.NONE).getValue();
    }

    public Response<StorageAccount> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, storageAccountName, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, storageAccountName, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, storageAccountName, resourceGroupName, context);
    }

    private StorageAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public StorageAccountImpl define(String name) {
        return new StorageAccountImpl(name, this.manager());
    }
}
