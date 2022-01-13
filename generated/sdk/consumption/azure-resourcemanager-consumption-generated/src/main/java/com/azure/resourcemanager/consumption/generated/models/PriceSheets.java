// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PriceSheets. */
public interface PriceSheets {
    /**
     * Gets the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a subscription.
     */
    PriceSheetResult get();

    /**
     * Gets the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a subscription along with {@link Response}.
     */
    Response<PriceSheetResult> getWithResponse(String expand, String skiptoken, Integer top, Context context);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    PriceSheetResult getByBillingPeriod(String billingPeriodName);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period along with {@link Response}.
     */
    Response<PriceSheetResult> getByBillingPeriodWithResponse(
        String billingPeriodName, String expand, String skiptoken, Integer top, Context context);
}
