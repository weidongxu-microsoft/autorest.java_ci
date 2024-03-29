// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageVersion;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageVersions;

public final class CommunityGalleryImageVersionsImpl implements CommunityGalleryImageVersions {
    private static final ClientLogger LOGGER = new ClientLogger(CommunityGalleryImageVersionsImpl.class);

    private final CommunityGalleryImageVersionsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CommunityGalleryImageVersionsImpl(CommunityGalleryImageVersionsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CommunityGalleryImageVersion> getWithResponse(String location, String publicGalleryName,
        String galleryImageName, String galleryImageVersionName, Context context) {
        Response<CommunityGalleryImageVersionInner> inner = this.serviceClient()
            .getWithResponse(location, publicGalleryName, galleryImageName, galleryImageVersionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CommunityGalleryImageVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CommunityGalleryImageVersion get(String location, String publicGalleryName, String galleryImageName,
        String galleryImageVersionName) {
        CommunityGalleryImageVersionInner inner
            = this.serviceClient().get(location, publicGalleryName, galleryImageName, galleryImageVersionName);
        if (inner != null) {
            return new CommunityGalleryImageVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<CommunityGalleryImageVersion> list(String location, String publicGalleryName,
        String galleryImageName) {
        PagedIterable<CommunityGalleryImageVersionInner> inner
            = this.serviceClient().list(location, publicGalleryName, galleryImageName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CommunityGalleryImageVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<CommunityGalleryImageVersion> list(String location, String publicGalleryName,
        String galleryImageName, Context context) {
        PagedIterable<CommunityGalleryImageVersionInner> inner
            = this.serviceClient().list(location, publicGalleryName, galleryImageName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CommunityGalleryImageVersionImpl(inner1, this.manager()));
    }

    private CommunityGalleryImageVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
