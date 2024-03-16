// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;

/**
 * An instance of this class provides access to all the operations defined in CertificateRegistrationProvidersClient.
 */
public interface CertificateRegistrationProvidersClient {
    /**
     * Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider
     * 
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations();

    /**
     * Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider
     * 
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource provider.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations(Context context);
}
