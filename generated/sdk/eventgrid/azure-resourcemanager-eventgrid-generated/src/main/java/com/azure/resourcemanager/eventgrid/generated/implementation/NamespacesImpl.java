// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.fluent.NamespacesClient;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.generated.models.Namespace;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.generated.models.Namespaces;

public final class NamespacesImpl implements Namespaces {
    private static final ClientLogger LOGGER = new ClientLogger(NamespacesImpl.class);

    private final NamespacesClient innerClient;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public NamespacesImpl(NamespacesClient innerClient,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Namespace> getByResourceGroupWithResponse(String resourceGroupName, String namespaceName,
        Context context) {
        Response<NamespaceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NamespaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Namespace getByResourceGroup(String resourceGroupName, String namespaceName) {
        NamespaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NamespaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String namespaceName) {
        this.serviceClient().delete(resourceGroupName, namespaceName);
    }

    public void delete(String resourceGroupName, String namespaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, context);
    }

    public PagedIterable<Namespace> list() {
        PagedIterable<NamespaceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Namespace> list(String filter, Integer top, Context context) {
        PagedIterable<NamespaceInner> inner = this.serviceClient().list(filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Namespace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Namespace> listByResourceGroup(String resourceGroupName, String filter, Integer top,
        Context context) {
        PagedIterable<NamespaceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NamespaceImpl(inner1, this.manager()));
    }

    public Response<NamespaceSharedAccessKeys> listSharedAccessKeysWithResponse(String resourceGroupName,
        String namespaceName, Context context) {
        Response<NamespaceSharedAccessKeysInner> inner
            = this.serviceClient().listSharedAccessKeysWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NamespaceSharedAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NamespaceSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String namespaceName) {
        NamespaceSharedAccessKeysInner inner
            = this.serviceClient().listSharedAccessKeys(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NamespaceSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NamespaceSharedAccessKeys regenerateKey(String resourceGroupName, String namespaceName,
        NamespaceRegenerateKeyRequest regenerateKeyRequest) {
        NamespaceSharedAccessKeysInner inner
            = this.serviceClient().regenerateKey(resourceGroupName, namespaceName, regenerateKeyRequest);
        if (inner != null) {
            return new NamespaceSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NamespaceSharedAccessKeys regenerateKey(String resourceGroupName, String namespaceName,
        NamespaceRegenerateKeyRequest regenerateKeyRequest, Context context) {
        NamespaceSharedAccessKeysInner inner
            = this.serviceClient().regenerateKey(resourceGroupName, namespaceName, regenerateKeyRequest, context);
        if (inner != null) {
            return new NamespaceSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Namespace getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE).getValue();
    }

    public Response<Namespace> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, context);
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    public NamespaceImpl define(String name) {
        return new NamespaceImpl(name, this.manager());
    }
}
