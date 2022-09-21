// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TopLevelDomains. */
public interface TopLevelDomains {
    /**
     * Get all top-level domains supported for registration.
     *
     * <p>Description for Get all top-level domains supported for registration.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelDomain> list();

    /**
     * Get all top-level domains supported for registration.
     *
     * <p>Description for Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelDomain> list(Context context);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object along with {@link Response}.
     */
    Response<TopLevelDomain> getWithResponse(String name, Context context);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    TopLevelDomain get(String name);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * <p>Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TldLegalAgreement> listAgreements(String name, TopLevelDomainAgreementOption agreementOption);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * <p>Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TldLegalAgreement> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context);
}
