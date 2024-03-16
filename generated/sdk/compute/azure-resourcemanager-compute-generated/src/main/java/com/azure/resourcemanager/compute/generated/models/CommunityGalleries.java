// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CommunityGalleries.
 */
public interface CommunityGalleries {
    /**
     * Get a community gallery by gallery public name.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name along with {@link Response}.
     */
    Response<CommunityGallery> getWithResponse(String location, String publicGalleryName, Context context);

    /**
     * Get a community gallery by gallery public name.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery by gallery public name.
     */
    CommunityGallery get(String location, String publicGalleryName);
}
