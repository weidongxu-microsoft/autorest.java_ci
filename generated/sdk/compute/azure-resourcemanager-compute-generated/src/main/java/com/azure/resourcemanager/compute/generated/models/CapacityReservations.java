// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CapacityReservations.
 */
public interface CapacityReservations {
    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String capacityReservationGroupName, String capacityReservationName);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String capacityReservationGroupName, String capacityReservationName,
        Context context);

    /**
     * The operation that retrieves information about the capacity reservation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime
     * properties of the capacity reservation that is managed by the platform and can change outside of control plane
     * operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation along with {@link Response}.
     */
    Response<CapacityReservation> getWithResponse(String resourceGroupName, String capacityReservationGroupName,
        String capacityReservationName, CapacityReservationInstanceViewTypes expand, Context context);

    /**
     * The operation that retrieves information about the capacity reservation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    CapacityReservation get(String resourceGroupName, String capacityReservationGroupName,
        String capacityReservationName);

    /**
     * Lists all of the capacity reservations in the specified capacity reservation group. Use the nextLink property in
     * the response to get the next page of capacity reservations.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list capacity reservation operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CapacityReservation> listByCapacityReservationGroup(String resourceGroupName,
        String capacityReservationGroupName);

    /**
     * Lists all of the capacity reservations in the specified capacity reservation group. Use the nextLink property in
     * the response to get the next page of capacity reservations.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list capacity reservation operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CapacityReservation> listByCapacityReservationGroup(String resourceGroupName,
        String capacityReservationGroupName, Context context);

    /**
     * The operation that retrieves information about the capacity reservation.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation along with {@link Response}.
     */
    CapacityReservation getById(String id);

    /**
     * The operation that retrieves information about the capacity reservation.
     * 
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime
     * properties of the capacity reservation that is managed by the platform and can change outside of control plane
     * operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation along with {@link Response}.
     */
    Response<CapacityReservation> getByIdWithResponse(String id, CapacityReservationInstanceViewTypes expand,
        Context context);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
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
     * Begins definition for a new CapacityReservation resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CapacityReservation definition.
     */
    CapacityReservation.DefinitionStages.Blank define(String name);
}
