// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.fluent.SandboxCustomImagesClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.SandboxCustomImageInner;
import com.azure.resourcemanager.azurekusto.generated.models.CheckNameResult;
import com.azure.resourcemanager.azurekusto.generated.models.SandboxCustomImage;
import com.azure.resourcemanager.azurekusto.generated.models.SandboxCustomImages;
import com.azure.resourcemanager.azurekusto.generated.models.SandboxCustomImagesCheckNameRequest;

public final class SandboxCustomImagesImpl implements SandboxCustomImages {
    private static final ClientLogger LOGGER = new ClientLogger(SandboxCustomImagesImpl.class);

    private final SandboxCustomImagesClient innerClient;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    public SandboxCustomImagesImpl(SandboxCustomImagesClient innerClient,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SandboxCustomImage> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<SandboxCustomImageInner> inner
            = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new SandboxCustomImageImpl(inner1, this.manager()));
    }

    public PagedIterable<SandboxCustomImage> listByCluster(String resourceGroupName, String clusterName,
        Context context) {
        PagedIterable<SandboxCustomImageInner> inner
            = this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new SandboxCustomImageImpl(inner1, this.manager()));
    }

    public Response<SandboxCustomImage> getWithResponse(String resourceGroupName, String clusterName,
        String sandboxCustomImageName, Context context) {
        Response<SandboxCustomImageInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, sandboxCustomImageName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SandboxCustomImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SandboxCustomImage get(String resourceGroupName, String clusterName, String sandboxCustomImageName) {
        SandboxCustomImageInner inner
            = this.serviceClient().get(resourceGroupName, clusterName, sandboxCustomImageName);
        if (inner != null) {
            return new SandboxCustomImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String sandboxCustomImageName) {
        this.serviceClient().delete(resourceGroupName, clusterName, sandboxCustomImageName);
    }

    public void delete(String resourceGroupName, String clusterName, String sandboxCustomImageName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, sandboxCustomImageName, context);
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(String resourceGroupName, String clusterName,
        SandboxCustomImagesCheckNameRequest resourceName, Context context) {
        Response<CheckNameResultInner> inner = this.serviceClient().checkNameAvailabilityWithResponse(resourceGroupName,
            clusterName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameResult checkNameAvailability(String resourceGroupName, String clusterName,
        SandboxCustomImagesCheckNameRequest resourceName) {
        CheckNameResultInner inner
            = this.serviceClient().checkNameAvailability(resourceGroupName, clusterName, resourceName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SandboxCustomImage getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String sandboxCustomImageName = Utils.getValueFromIdByName(id, "sandboxCustomImages");
        if (sandboxCustomImageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sandboxCustomImages'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, sandboxCustomImageName, Context.NONE).getValue();
    }

    public Response<SandboxCustomImage> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String sandboxCustomImageName = Utils.getValueFromIdByName(id, "sandboxCustomImages");
        if (sandboxCustomImageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sandboxCustomImages'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, sandboxCustomImageName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String sandboxCustomImageName = Utils.getValueFromIdByName(id, "sandboxCustomImages");
        if (sandboxCustomImageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sandboxCustomImages'.", id)));
        }
        this.delete(resourceGroupName, clusterName, sandboxCustomImageName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String sandboxCustomImageName = Utils.getValueFromIdByName(id, "sandboxCustomImages");
        if (sandboxCustomImageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sandboxCustomImages'.", id)));
        }
        this.delete(resourceGroupName, clusterName, sandboxCustomImageName, context);
    }

    private SandboxCustomImagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }

    public SandboxCustomImageImpl define(String name) {
        return new SandboxCustomImageImpl(name, this.manager());
    }
}
