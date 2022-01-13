// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SharedGalleries. */
public interface SharedGalleries {
    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    PagedIterable<SharedGallery> list(String location);

    /**
     * List shared galleries by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Galleries operation response.
     */
    PagedIterable<SharedGallery> list(String location, SharedToValues sharedTo, Context context);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id.
     */
    SharedGallery get(String location, String galleryUniqueName);

    /**
     * Get a shared gallery by subscription id or tenant id.
     *
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery by subscription id or tenant id along with {@link Response}.
     */
    Response<SharedGallery> getWithResponse(String location, String galleryUniqueName, Context context);
}
