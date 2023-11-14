// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.Context;

/**
 * Resource collection API of GenerateReservationDetailsReports.
 */
public interface GenerateReservationDetailsReports {
    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     * 
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    OperationStatus byBillingAccountId(String billingAccountId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     * 
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    OperationStatus byBillingAccountId(String billingAccountId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    OperationStatus byBillingProfileId(String billingAccountId, String billingProfileId, String startDate,
        String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    OperationStatus byBillingProfileId(String billingAccountId, String billingProfileId, String startDate,
        String endDate, Context context);
}
