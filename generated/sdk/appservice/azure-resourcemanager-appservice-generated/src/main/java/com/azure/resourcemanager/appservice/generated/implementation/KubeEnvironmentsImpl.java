// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.KubeEnvironmentsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.KubeEnvironmentInner;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironment;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironments;

public final class KubeEnvironmentsImpl implements KubeEnvironments {
    private static final ClientLogger LOGGER = new ClientLogger(KubeEnvironmentsImpl.class);

    private final KubeEnvironmentsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public KubeEnvironmentsImpl(KubeEnvironmentsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<KubeEnvironment> list() {
        PagedIterable<KubeEnvironmentInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubeEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<KubeEnvironment> list(Context context) {
        PagedIterable<KubeEnvironmentInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubeEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<KubeEnvironment> listByResourceGroup(String resourceGroupName) {
        PagedIterable<KubeEnvironmentInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubeEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<KubeEnvironment> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<KubeEnvironmentInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubeEnvironmentImpl(inner1, this.manager()));
    }

    public Response<KubeEnvironment> getByResourceGroupWithResponse(String resourceGroupName, String name,
        Context context) {
        Response<KubeEnvironmentInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new KubeEnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public KubeEnvironment getByResourceGroup(String resourceGroupName, String name) {
        KubeEnvironmentInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new KubeEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public void delete(String resourceGroupName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, name, context);
    }

    public KubeEnvironment getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "kubeEnvironments");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'kubeEnvironments'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<KubeEnvironment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "kubeEnvironments");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'kubeEnvironments'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "kubeEnvironments");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'kubeEnvironments'.", id)));
        }
        this.delete(resourceGroupName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "kubeEnvironments");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'kubeEnvironments'.", id)));
        }
        this.delete(resourceGroupName, name, context);
    }

    private KubeEnvironmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    public KubeEnvironmentImpl define(String name) {
        return new KubeEnvironmentImpl(name, this.manager());
    }
}
