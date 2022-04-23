// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.relay.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.relay.generated.fluent.models.PrivateLinkResourcesListResultInner;
import com.azure.resourcemanager.relay.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.relay.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.relay.generated.models.PrivateLinkResourcesListResult;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.relay.generated.RelayManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient, com.azure.resourcemanager.relay.generated.RelayManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateLinkResource get(String resourceGroupName, String namespaceName, String privateLinkResourceName) {
        PrivateLinkResourceInner inner =
            this.serviceClient().get(resourceGroupName, namespaceName, privateLinkResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String namespaceName, String privateLinkResourceName, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, privateLinkResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResourcesListResult list(String resourceGroupName, String namespaceName) {
        PrivateLinkResourcesListResultInner inner = this.serviceClient().list(resourceGroupName, namespaceName);
        if (inner != null) {
            return new PrivateLinkResourcesListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourcesListResult> listWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<PrivateLinkResourcesListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourcesListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.relay.generated.RelayManager manager() {
        return this.serviceManager;
    }
}
