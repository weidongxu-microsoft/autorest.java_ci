// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SharedGalleryImageVersions.
 */
public interface SharedGalleryImageVersions {
    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SharedGalleryImageVersion> list(String location, String galleryUniqueName, String galleryImageName);

    /**
     * List shared gallery image versions by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be listed.
     * @param sharedTo The query parameter to decide what shared galleries to fetch when doing listing operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Shared Gallery Image versions operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SharedGalleryImageVersion> list(String location, String galleryUniqueName, String galleryImageName,
        SharedToValues sharedTo, Context context);

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id along with {@link Response}.
     */
    Response<SharedGalleryImageVersion> getWithResponse(String location, String galleryUniqueName,
        String galleryImageName, String galleryImageVersionName, Context context);

    /**
     * Get a shared gallery image version by subscription id or tenant id.
     * 
     * @param location Resource location.
     * @param galleryUniqueName The unique name of the Shared Gallery.
     * @param galleryImageName The name of the Shared Gallery Image Definition from which the Image Versions are to be listed.
     * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a shared gallery image version by subscription id or tenant id.
     */
    SharedGalleryImageVersion get(String location, String galleryUniqueName, String galleryImageName,
        String galleryImageVersionName);
}
