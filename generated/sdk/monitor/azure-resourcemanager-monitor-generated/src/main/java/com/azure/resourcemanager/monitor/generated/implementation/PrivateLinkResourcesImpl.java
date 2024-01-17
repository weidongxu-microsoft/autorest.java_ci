// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByPrivateLinkScope(String resourceGroupName, String scopeName) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByPrivateLinkScope(resourceGroupName, scopeName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByPrivateLinkScope(String resourceGroupName, String scopeName,
        Context context) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByPrivateLinkScope(resourceGroupName, scopeName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public Response<PrivateLinkResource> getWithResponse(String resourceGroupName, String scopeName, String groupName,
        Context context) {
        Response<PrivateLinkResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, scopeName, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource get(String resourceGroupName, String scopeName, String groupName) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, scopeName, groupName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
