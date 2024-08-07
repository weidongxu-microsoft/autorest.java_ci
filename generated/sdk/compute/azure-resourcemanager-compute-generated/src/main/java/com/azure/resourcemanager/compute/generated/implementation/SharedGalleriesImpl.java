// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.SharedGalleriesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryInner;
import com.azure.resourcemanager.compute.generated.models.SharedGalleries;
import com.azure.resourcemanager.compute.generated.models.SharedGallery;
import com.azure.resourcemanager.compute.generated.models.SharedToValues;

public final class SharedGalleriesImpl implements SharedGalleries {
    private static final ClientLogger LOGGER = new ClientLogger(SharedGalleriesImpl.class);

    private final SharedGalleriesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public SharedGalleriesImpl(SharedGalleriesClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SharedGallery> list(String location) {
        PagedIterable<SharedGalleryInner> inner = this.serviceClient().list(location);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SharedGalleryImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedGallery> list(String location, SharedToValues sharedTo, Context context) {
        PagedIterable<SharedGalleryInner> inner = this.serviceClient().list(location, sharedTo, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SharedGalleryImpl(inner1, this.manager()));
    }

    public Response<SharedGallery> getWithResponse(String location, String galleryUniqueName, Context context) {
        Response<SharedGalleryInner> inner = this.serviceClient().getWithResponse(location, galleryUniqueName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SharedGalleryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SharedGallery get(String location, String galleryUniqueName) {
        SharedGalleryInner inner = this.serviceClient().get(location, galleryUniqueName);
        if (inner != null) {
            return new SharedGalleryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SharedGalleriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
