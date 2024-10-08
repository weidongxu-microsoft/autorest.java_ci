// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SharedGalleryImages.
 */
public interface SharedGalleryImages {
    /**
     * List shared gallery images by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SharedGalleryImage> list(String location, String galleryUniqueName);

    /**
     * List shared gallery images by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SharedGalleryImage> list(String location, String galleryUniqueName, SharedToValues sharedTo,
        Context context);

    /**
     * Get a shared gallery image by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id along with {@link Response}.
     */
    Response<SharedGalleryImage> getWithResponse(String location, String galleryUniqueName, String galleryImageName,
        Context context);

    /**
     * Get a shared gallery image by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be
     * listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image by subscription id or tenant id.
     */
    SharedGalleryImage get(String location, String galleryUniqueName, String galleryImageName);
}
