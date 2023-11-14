// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageResourceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VmImagesInEdgeZoneListResultInner;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in VirtualMachineImagesClient.
 */
public interface VirtualMachineImagesClient {
    /**
     * Gets a virtual machine image.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineImageInner> getWithResponse(String location, String publisherName, String offer, String skus,
        String version, Context context);

    /**
     * Gets a virtual machine image.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineImageInner get(String location, String publisherName, String offer, String skus, String version);

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param expand The expand expression to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, publisher, offer, and SKU along
     * with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listWithResponse(String location, String publisherName,
        String offer, String skus, String expand, Integer top, String orderby, Context context);

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> list(String location, String publisherName, String offer, String skus);

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location and publisher along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listOffersWithResponse(String location, String publisherName,
        Context context);

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listOffers(String location, String publisherName);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     * 
     * @param location The name of a supported Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listPublishersWithResponse(String location, Context context);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     * 
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listPublishers(String location);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, publisher, and offer along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listSkusWithResponse(String location, String publisherName,
        String offer, Context context);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listSkus(String location, String publisherName, String offer);

    /**
     * Gets a list of all virtual machine image versions for the specified edge zone.
     * 
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified edge zone along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VmImagesInEdgeZoneListResultInner> listByEdgeZoneWithResponse(String location, String edgeZone,
        Context context);

    /**
     * Gets a list of all virtual machine image versions for the specified edge zone.
     * 
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VmImagesInEdgeZoneListResultInner listByEdgeZone(String location, String edgeZone);
}
