// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.generated.fluent.VaultsClient;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultInner;
import com.azure.resourcemanager.recoveryservices.generated.models.Vault;
import com.azure.resourcemanager.recoveryservices.generated.models.Vaults;

public final class VaultsImpl implements Vaults {
    private static final ClientLogger LOGGER = new ClientLogger(VaultsImpl.class);

    private final VaultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager;

    public VaultsImpl(VaultsClient innerClient,
        com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Vault> list() {
        PagedIterable<VaultInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> list(Context context) {
        PagedIterable<VaultInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VaultInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public PagedIterable<Vault> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VaultInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VaultImpl(inner1, this.manager()));
    }

    public Response<Vault> getByResourceGroupWithResponse(String resourceGroupName, String vaultName, Context context) {
        Response<VaultInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vaultName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VaultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Vault getByResourceGroup(String resourceGroupName, String vaultName) {
        VaultInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vaultName);
        if (inner != null) {
            return new VaultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String vaultName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, vaultName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String vaultName) {
        this.serviceClient().delete(resourceGroupName, vaultName);
    }

    public Vault getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vaultName, Context.NONE).getValue();
    }

    public Response<Vault> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vaultName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, vaultName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, vaultName, context);
    }

    private VaultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager manager() {
        return this.serviceManager;
    }

    public VaultImpl define(String name) {
        return new VaultImpl(name, this.manager());
    }
}
