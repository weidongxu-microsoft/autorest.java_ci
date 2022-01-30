// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.generated.fluent.models.EventSummaryInner;

/** An instance of this class provides access to all the operations defined in EventsOperationsClient. */
public interface EventsOperationsClient {
    /**
     * Lists the events that decrements Azure credits or Microsoft Azure consumption commitment for a billing account or
     * a billing profile for a given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param startDate Start date.
     * @param endDate End date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> listByBillingProfile(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Lists the events that decrements Azure credits or Microsoft Azure consumption commitment for a billing account or
     * a billing profile for a given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param startDate Start date.
     * @param endDate End date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> listByBillingProfile(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);

    /**
     * Lists the events that decrements Azure credits or Microsoft Azure consumption commitment for a billing account or
     * a billing profile for a given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> listByBillingAccount(String billingAccountId);

    /**
     * Lists the events that decrements Azure credits or Microsoft Azure consumption commitment for a billing account or
     * a billing profile for a given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter May be used to filter the events by lotId, lotSource etc. The filter supports 'eq', 'lt', 'gt',
     *     'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair
     *     string where key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> listByBillingAccount(String billingAccountId, String filter, Context context);
}
