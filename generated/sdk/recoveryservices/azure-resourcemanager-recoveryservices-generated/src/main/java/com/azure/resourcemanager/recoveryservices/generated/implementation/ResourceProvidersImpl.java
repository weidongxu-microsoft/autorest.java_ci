// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultInner;
import com.azure.resourcemanager.recoveryservices.generated.models.OperationResource;
import com.azure.resourcemanager.recoveryservices.generated.models.ResourceProviders;
import com.azure.resourcemanager.recoveryservices.generated.models.Vault;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationResource> getOperationStatusWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        Response<OperationResourceInner> inner =
            this.serviceClient().getOperationStatusWithResponse(resourceGroupName, vaultName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationResource getOperationStatus(String resourceGroupName, String vaultName, String operationId) {
        OperationResourceInner inner =
            this.serviceClient().getOperationStatus(resourceGroupName, vaultName, operationId);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Vault> getOperationResultWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        Response<VaultInner> inner =
            this.serviceClient().getOperationResultWithResponse(resourceGroupName, vaultName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VaultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Vault getOperationResult(String resourceGroupName, String vaultName, String operationId) {
        VaultInner inner = this.serviceClient().getOperationResult(resourceGroupName, vaultName, operationId);
        if (inner != null) {
            return new VaultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
