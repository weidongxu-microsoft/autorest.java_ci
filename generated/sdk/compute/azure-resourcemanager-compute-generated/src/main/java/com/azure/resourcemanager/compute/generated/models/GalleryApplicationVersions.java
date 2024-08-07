// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of GalleryApplicationVersions.
 */
public interface GalleryApplicationVersions {
    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     * resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update along with
     * {@link Response}.
     */
    Response<GalleryApplicationVersion> getWithResponse(String resourceGroupName, String galleryName,
        String galleryApplicationName, String galleryApplicationVersionName, ReplicationStatusTypes expand,
        Context context);

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     * resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    GalleryApplicationVersion get(String resourceGroupName, String galleryName, String galleryApplicationName,
        String galleryApplicationVersionName);

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     * resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String galleryName, String galleryApplicationName,
        String galleryApplicationVersionName);

    /**
     * Delete a gallery Application Version.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     * resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String galleryName, String galleryApplicationName,
        String galleryApplicationVersionName, Context context);

    /**
     * List gallery Application Versions in a gallery Application Definition.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the Shared Application Gallery Application Definition from which the
     * Application Versions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Application version operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GalleryApplicationVersion> listByGalleryApplication(String resourceGroupName, String galleryName,
        String galleryApplicationName);

    /**
     * List gallery Application Versions in a gallery Application Definition.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the Shared Application Gallery Application Definition from which the
     * Application Versions are to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Application version operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GalleryApplicationVersion> listByGalleryApplication(String resourceGroupName, String galleryName,
        String galleryApplicationName, Context context);

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update along with
     * {@link Response}.
     */
    GalleryApplicationVersion getById(String id);

    /**
     * Retrieves information about a gallery Application Version.
     * 
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update along with
     * {@link Response}.
     */
    Response<GalleryApplicationVersion> getByIdWithResponse(String id, ReplicationStatusTypes expand, Context context);

    /**
     * Delete a gallery Application Version.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a gallery Application Version.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GalleryApplicationVersion resource.
     * 
     * @param name resource name.
     * @return the first stage of the new GalleryApplicationVersion definition.
     */
    GalleryApplicationVersion.DefinitionStages.Blank define(String name);
}
