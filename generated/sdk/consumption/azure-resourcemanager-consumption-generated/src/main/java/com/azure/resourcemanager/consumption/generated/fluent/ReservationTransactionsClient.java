// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.generated.fluent.models.ModernReservationTransactionInner;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationTransactionInner;
import java.math.BigDecimal;

/**
 * An instance of this class provides access to all the operations defined in ReservationTransactionsClient.
 */
public interface ReservationTransactionsClient {
    /**
     * List of transactions for reserved instances on billing account scope. Note: The refund transactions are posted
     * along with its purchase transaction (i.e. in the purchase billing month). For example, The refund is requested in
     * May 2021. This refund transaction will have event date as May 2021 but the billing month as April 2020 when the
     * reservation purchase was made. Note: ARM has a payload size limit of 12MB, so currently callers get 400 when the
     * response size exceeds the ARM limit. In such cases, API call should be made with smaller date ranges.
     * 
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationTransactionInner> list(String billingAccountId);

    /**
     * List of transactions for reserved instances on billing account scope. Note: The refund transactions are posted
     * along with its purchase transaction (i.e. in the purchase billing month). For example, The refund is requested in
     * May 2021. This refund transaction will have event date as May 2021 but the billing month as April 2020 when the
     * reservation purchase was made. Note: ARM has a payload size limit of 12MB, so currently callers get 400 when the
     * response size exceeds the ARM limit. In such cases, API call should be made with smaller date ranges.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     * date. The filter supports 'le' and 'ge'. Note: API returns data for the entire start date's and end date's
     * billing month. For example, filter properties/eventDate+ge+2020-01-01+AND+properties/eventDate+le+2020-12-29 will
     * include data for the entire December 2020 month (i.e. will contain records for dates December 30 and 31).
     * @param useMarkupIfPartner Applies mark up to the transactions if the caller is a partner.
     * @param previewMarkupPercentage Preview markup percentage to be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationTransactionInner> list(String billingAccountId, String filter, Boolean useMarkupIfPartner,
        BigDecimal previewMarkupPercentage, Context context);

    /**
     * List of transactions for reserved instances on billing profile scope. The refund transactions are posted along
     * with its purchase transaction (i.e. in the purchase billing month). For example, The refund is requested in May
     * 2021. This refund transaction will have event date as May 2021 but the billing month as April 2020 when the
     * reservation purchase was made. Note: ARM has a payload size limit of 12MB, so currently callers get 400 when the
     * response size exceeds the ARM limit. In such cases, API call should be made with smaller date ranges.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModernReservationTransactionInner> listByBillingProfile(String billingAccountId,
        String billingProfileId);

    /**
     * List of transactions for reserved instances on billing profile scope. The refund transactions are posted along
     * with its purchase transaction (i.e. in the purchase billing month). For example, The refund is requested in May
     * 2021. This refund transaction will have event date as May 2021 but the billing month as April 2020 when the
     * reservation purchase was made. Note: ARM has a payload size limit of 12MB, so currently callers get 400 when the
     * response size exceeds the ARM limit. In such cases, API call should be made with smaller date ranges.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     * date. The filter supports 'le' and 'ge'. Note: API returns data for the entire start date's and end date's
     * billing month. For example, filter properties/eventDate+ge+2020-01-01+AND+properties/eventDate+le+2020-12-29 will
     * include data for entire December 2020 month (i.e. will contain records for dates December 30 and 31).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ModernReservationTransactionInner> listByBillingProfile(String billingAccountId,
        String billingProfileId, String filter, Context context);
}
