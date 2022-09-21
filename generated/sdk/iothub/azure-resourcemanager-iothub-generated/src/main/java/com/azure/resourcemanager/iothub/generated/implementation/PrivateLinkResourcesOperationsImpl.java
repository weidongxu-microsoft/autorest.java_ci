// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.fluent.PrivateLinkResourcesOperationsClient;
import com.azure.resourcemanager.iothub.generated.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.generated.fluent.models.PrivateLinkResourcesInner;
import com.azure.resourcemanager.iothub.generated.models.GroupIdInformation;
import com.azure.resourcemanager.iothub.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.iothub.generated.models.PrivateLinkResourcesOperations;

public final class PrivateLinkResourcesOperationsImpl implements PrivateLinkResourcesOperations {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesOperationsImpl.class);

    private final PrivateLinkResourcesOperationsClient innerClient;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    public PrivateLinkResourcesOperationsImpl(
        PrivateLinkResourcesOperationsClient innerClient,
        com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PrivateLinkResources> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<PrivateLinkResourcesInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourcesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResources list(String resourceGroupName, String resourceName) {
        PrivateLinkResourcesInner inner = this.serviceClient().list(resourceGroupName, resourceName);
        if (inner != null) {
            return new PrivateLinkResourcesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GroupIdInformation> getWithResponse(
        String resourceGroupName, String resourceName, String groupId, Context context) {
        Response<GroupIdInformationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, groupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupIdInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupIdInformation get(String resourceGroupName, String resourceName, String groupId) {
        GroupIdInformationInner inner = this.serviceClient().get(resourceGroupName, resourceName, groupId);
        if (inner != null) {
            return new GroupIdInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
