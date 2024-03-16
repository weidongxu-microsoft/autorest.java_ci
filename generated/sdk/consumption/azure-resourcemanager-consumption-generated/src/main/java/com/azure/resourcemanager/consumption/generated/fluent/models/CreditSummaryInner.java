// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.CreditBalanceSummary;
import com.azure.resourcemanager.consumption.generated.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A credit summary resource.
 */
@Fluent
public final class CreditSummaryInner extends ProxyResource {
    /*
     * The properties of the credit summary.
     */
    @JsonProperty(value = "properties")
    private CreditSummaryProperties innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of CreditSummaryInner class.
     */
    public CreditSummaryInner() {
    }

    /**
     * Get the innerProperties property: The properties of the credit summary.
     * 
     * @return the innerProperties value.
     */
    private CreditSummaryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     * @param etag the etag value to set.
     * @return the CreditSummaryInner object itself.
     */
    public CreditSummaryInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the balanceSummary property: Summary of balances associated with this credit summary.
     * 
     * @return the balanceSummary value.
     */
    public CreditBalanceSummary balanceSummary() {
        return this.innerProperties() == null ? null : this.innerProperties().balanceSummary();
    }

    /**
     * Get the pendingCreditAdjustments property: Pending credit adjustments.
     * 
     * @return the pendingCreditAdjustments value.
     */
    public Amount pendingCreditAdjustments() {
        return this.innerProperties() == null ? null : this.innerProperties().pendingCreditAdjustments();
    }

    /**
     * Get the expiredCredit property: Expired credit.
     * 
     * @return the expiredCredit value.
     */
    public Amount expiredCredit() {
        return this.innerProperties() == null ? null : this.innerProperties().expiredCredit();
    }

    /**
     * Get the pendingEligibleCharges property: Pending eligible charges.
     * 
     * @return the pendingEligibleCharges value.
     */
    public Amount pendingEligibleCharges() {
        return this.innerProperties() == null ? null : this.innerProperties().pendingEligibleCharges();
    }

    /**
     * Get the creditCurrency property: The credit currency.
     * 
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().creditCurrency();
    }

    /**
     * Get the billingCurrency property: The billing currency.
     * 
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingCurrency();
    }

    /**
     * Get the reseller property: Credit's reseller.
     * 
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.innerProperties() == null ? null : this.innerProperties().reseller();
    }

    /**
     * Get the isEstimatedBalance property: If true, the listed details are based on an estimation and it will be subjected to change.
     * 
     * @return the isEstimatedBalance value.
     */
    public Boolean isEstimatedBalance() {
        return this.innerProperties() == null ? null : this.innerProperties().isEstimatedBalance();
    }

    /**
     * Get the etag property: The eTag for the resource.
     * 
     * @return the etag value.
     */
    public String etagPropertiesEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
