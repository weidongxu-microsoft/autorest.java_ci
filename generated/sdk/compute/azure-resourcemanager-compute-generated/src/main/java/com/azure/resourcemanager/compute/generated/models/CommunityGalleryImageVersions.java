// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CommunityGalleryImageVersions. */
public interface CommunityGalleryImageVersions {
    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version.
     */
    CommunityGalleryImageVersion get(
        String location, String publicGalleryName, String galleryImageName, String galleryImageVersionName);

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version along with {@link Response}.
     */
    Response<CommunityGalleryImageVersion> getWithResponse(
        String location,
        String publicGalleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context);
}
