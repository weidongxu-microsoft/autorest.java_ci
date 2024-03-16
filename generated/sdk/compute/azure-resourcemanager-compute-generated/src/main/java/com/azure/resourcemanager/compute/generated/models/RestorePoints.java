// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RestorePoints.
 */
public interface RestorePoints {
    /**
     * The operation to delete the restore point.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String restorePointCollectionName, String restorePointName, Context context);

    /**
     * The operation to get the restore point.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves information about the run-time state of a restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details along with {@link Response}.
     */
    Response<RestorePoint> getWithResponse(String resourceGroupName, String restorePointCollectionName,
        String restorePointName, RestorePointExpandOptions expand, Context context);

    /**
     * The operation to get the restore point.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    RestorePoint get(String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to get the restore point.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details along with {@link Response}.
     */
    RestorePoint getById(String id);

    /**
     * The operation to get the restore point.
     * 
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves information about the run-time state of a restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details along with {@link Response}.
     */
    Response<RestorePoint> getByIdWithResponse(String id, RestorePointExpandOptions expand, Context context);

    /**
     * The operation to delete the restore point.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete the restore point.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RestorePoint resource.
     * 
     * @param name resource name.
     * @return the first stage of the new RestorePoint definition.
     */
    RestorePoint.DefinitionStages.Blank define(String name);
}
