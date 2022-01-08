// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.resourcemanager.consumption.generated.fluent.models.CreditSummaryInner;
import java.util.Map;

/** An immutable client-side representation of CreditSummary. */
public interface CreditSummary {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the balanceSummary property: Summary of balances associated with this credit summary.
     *
     * @return the balanceSummary value.
     */
    CreditBalanceSummary balanceSummary();

    /**
     * Gets the pendingCreditAdjustments property: Pending credit adjustments.
     *
     * @return the pendingCreditAdjustments value.
     */
    Amount pendingCreditAdjustments();

    /**
     * Gets the expiredCredit property: Expired credit.
     *
     * @return the expiredCredit value.
     */
    Amount expiredCredit();

    /**
     * Gets the pendingEligibleCharges property: Pending eligible charges.
     *
     * @return the pendingEligibleCharges value.
     */
    Amount pendingEligibleCharges();

    /**
     * Gets the creditCurrency property: The credit currency.
     *
     * @return the creditCurrency value.
     */
    String creditCurrency();

    /**
     * Gets the billingCurrency property: The billing currency.
     *
     * @return the billingCurrency value.
     */
    String billingCurrency();

    /**
     * Gets the reseller property: Credit's reseller.
     *
     * @return the reseller value.
     */
    Reseller reseller();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.generated.fluent.models.CreditSummaryInner object.
     *
     * @return the inner object.
     */
    CreditSummaryInner innerModel();
}
