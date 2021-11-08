// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.fluent.MediaservicesClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.EdgePoliciesInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceInner;
import com.azure.resourcemanager.mediaservices.generated.models.EdgePolicies;
import com.azure.resourcemanager.mediaservices.generated.models.ListEdgePoliciesInput;
import com.azure.resourcemanager.mediaservices.generated.models.MediaService;
import com.azure.resourcemanager.mediaservices.generated.models.Mediaservices;
import com.azure.resourcemanager.mediaservices.generated.models.SyncStorageKeysInput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MediaservicesImpl implements Mediaservices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MediaservicesImpl.class);

    private final MediaservicesClient innerClient;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    public MediaservicesImpl(
        MediaservicesClient innerClient,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MediaService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MediaServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new MediaServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<MediaService> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<MediaServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new MediaServiceImpl(inner1, this.manager()));
    }

    public MediaService getByResourceGroup(String resourceGroupName, String accountName) {
        MediaServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new MediaServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MediaService> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<MediaServiceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MediaServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, context);
    }

    public void syncStorageKeys(String resourceGroupName, String accountName, SyncStorageKeysInput parameters) {
        this.serviceClient().syncStorageKeys(resourceGroupName, accountName, parameters);
    }

    public Response<Void> syncStorageKeysWithResponse(
        String resourceGroupName, String accountName, SyncStorageKeysInput parameters, Context context) {
        return this.serviceClient().syncStorageKeysWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public EdgePolicies listEdgePolicies(
        String resourceGroupName, String accountName, ListEdgePoliciesInput parameters) {
        EdgePoliciesInner inner = this.serviceClient().listEdgePolicies(resourceGroupName, accountName, parameters);
        if (inner != null) {
            return new EdgePoliciesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EdgePolicies> listEdgePoliciesWithResponse(
        String resourceGroupName, String accountName, ListEdgePoliciesInput parameters, Context context) {
        Response<EdgePoliciesInner> inner =
            this.serviceClient().listEdgePoliciesWithResponse(resourceGroupName, accountName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EdgePoliciesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<MediaService> list() {
        PagedIterable<MediaServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new MediaServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<MediaService> list(Context context) {
        PagedIterable<MediaServiceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new MediaServiceImpl(inner1, this.manager()));
    }

    public MediaService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<MediaService> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, context);
    }

    private MediaservicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public MediaServiceImpl define(String name) {
        return new MediaServiceImpl(name, this.manager());
    }
}
