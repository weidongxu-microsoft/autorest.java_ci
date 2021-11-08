// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.fluent.AssetFiltersClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AssetFilterInner;
import com.azure.resourcemanager.mediaservices.generated.models.AssetFilter;
import com.azure.resourcemanager.mediaservices.generated.models.AssetFilters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AssetFiltersImpl implements AssetFilters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssetFiltersImpl.class);

    private final AssetFiltersClient innerClient;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    public AssetFiltersImpl(
        AssetFiltersClient innerClient,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AssetFilter> list(String resourceGroupName, String accountName, String assetName) {
        PagedIterable<AssetFilterInner> inner = this.serviceClient().list(resourceGroupName, accountName, assetName);
        return Utils.mapPage(inner, inner1 -> new AssetFilterImpl(inner1, this.manager()));
    }

    public PagedIterable<AssetFilter> list(
        String resourceGroupName, String accountName, String assetName, Context context) {
        PagedIterable<AssetFilterInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, assetName, context);
        return Utils.mapPage(inner, inner1 -> new AssetFilterImpl(inner1, this.manager()));
    }

    public AssetFilter get(String resourceGroupName, String accountName, String assetName, String filterName) {
        AssetFilterInner inner = this.serviceClient().get(resourceGroupName, accountName, assetName, filterName);
        if (inner != null) {
            return new AssetFilterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AssetFilter> getWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context) {
        Response<AssetFilterInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, assetName, filterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssetFilterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String assetName, String filterName) {
        this.serviceClient().delete(resourceGroupName, accountName, assetName, filterName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, assetName, filterName, context);
    }

    public AssetFilter getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        String filterName = Utils.getValueFromIdByName(id, "assetFilters");
        if (filterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assetFilters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, assetName, filterName, Context.NONE).getValue();
    }

    public Response<AssetFilter> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        String filterName = Utils.getValueFromIdByName(id, "assetFilters");
        if (filterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assetFilters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, assetName, filterName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        String filterName = Utils.getValueFromIdByName(id, "assetFilters");
        if (filterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assetFilters'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, assetName, filterName, Context.NONE);
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
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        String filterName = Utils.getValueFromIdByName(id, "assetFilters");
        if (filterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assetFilters'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, assetName, filterName, context);
    }

    private AssetFiltersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public AssetFilterImpl define(String name) {
        return new AssetFilterImpl(name, this.manager());
    }
}
