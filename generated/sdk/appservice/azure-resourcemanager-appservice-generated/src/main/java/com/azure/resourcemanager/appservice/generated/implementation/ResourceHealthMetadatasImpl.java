// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.ResourceHealthMetadatasClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceHealthMetadataInner;
import com.azure.resourcemanager.appservice.generated.models.ResourceHealthMetadata;
import com.azure.resourcemanager.appservice.generated.models.ResourceHealthMetadatas;

public final class ResourceHealthMetadatasImpl implements ResourceHealthMetadatas {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceHealthMetadatasImpl.class);

    private final ResourceHealthMetadatasClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public ResourceHealthMetadatasImpl(
        ResourceHealthMetadatasClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceHealthMetadata> list() {
        PagedIterable<ResourceHealthMetadataInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> list(Context context) {
        PagedIterable<ResourceHealthMetadataInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ResourceHealthMetadataInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ResourceHealthMetadataInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> listBySite(String resourceGroupName, String name) {
        PagedIterable<ResourceHealthMetadataInner> inner = this.serviceClient().listBySite(resourceGroupName, name);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> listBySite(String resourceGroupName, String name, Context context) {
        PagedIterable<ResourceHealthMetadataInner> inner =
            this.serviceClient().listBySite(resourceGroupName, name, context);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public ResourceHealthMetadata getBySite(String resourceGroupName, String name) {
        ResourceHealthMetadataInner inner = this.serviceClient().getBySite(resourceGroupName, name);
        if (inner != null) {
            return new ResourceHealthMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceHealthMetadata> getBySiteWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<ResourceHealthMetadataInner> inner =
            this.serviceClient().getBySiteWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceHealthMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceHealthMetadata> listBySiteSlot(String resourceGroupName, String name, String slot) {
        PagedIterable<ResourceHealthMetadataInner> inner =
            this.serviceClient().listBySiteSlot(resourceGroupName, name, slot);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceHealthMetadata> listBySiteSlot(
        String resourceGroupName, String name, String slot, Context context) {
        PagedIterable<ResourceHealthMetadataInner> inner =
            this.serviceClient().listBySiteSlot(resourceGroupName, name, slot, context);
        return Utils.mapPage(inner, inner1 -> new ResourceHealthMetadataImpl(inner1, this.manager()));
    }

    public ResourceHealthMetadata getBySiteSlot(String resourceGroupName, String name, String slot) {
        ResourceHealthMetadataInner inner = this.serviceClient().getBySiteSlot(resourceGroupName, name, slot);
        if (inner != null) {
            return new ResourceHealthMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceHealthMetadata> getBySiteSlotWithResponse(
        String resourceGroupName, String name, String slot, Context context) {
        Response<ResourceHealthMetadataInner> inner =
            this.serviceClient().getBySiteSlotWithResponse(resourceGroupName, name, slot, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceHealthMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceHealthMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
