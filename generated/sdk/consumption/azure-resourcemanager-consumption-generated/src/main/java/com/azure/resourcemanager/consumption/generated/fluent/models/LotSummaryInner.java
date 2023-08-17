// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.generated.models.LotSource;
import com.azure.resourcemanager.consumption.generated.models.OrgType;
import com.azure.resourcemanager.consumption.generated.models.Reseller;
import com.azure.resourcemanager.consumption.generated.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A lot summary resource. */
@Fluent
public final class LotSummaryInner extends ProxyResource {
    /*
     * The lot properties.
     */
    @JsonProperty(value = "properties")
    private LotProperties innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the
     * user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /** Creates an instance of LotSummaryInner class. */
    public LotSummaryInner() {
    }

    /**
     * Get the innerProperties property: The lot properties.
     *
     * @return the innerProperties value.
     */
    private LotProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the LotSummaryInner object itself.
     */
    public LotSummaryInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the originalAmount property: The original amount of a lot.
     *
     * @return the originalAmount value.
     */
    public Amount originalAmount() {
        return this.innerProperties() == null ? null : this.innerProperties().originalAmount();
    }

    /**
     * Get the closedBalance property: The balance as of the last invoice.
     *
     * @return the closedBalance value.
     */
    public Amount closedBalance() {
        return this.innerProperties() == null ? null : this.innerProperties().closedBalance();
    }

    /**
     * Get the source property: The source of the lot.
     *
     * @return the source value.
     */
    public LotSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Get the startDate property: The date when the lot became effective.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.innerProperties() == null ? null : this.innerProperties().startDate();
    }

    /**
     * Get the expirationDate property: The expiration date of a lot.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Get the poNumber property: The po number of the invoice on which the lot was added. This property is not
     * available for ConsumptionCommitment lots.
     *
     * @return the poNumber value.
     */
    public String poNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().poNumber();
    }

    /**
     * Get the purchasedDate property: The date when the lot was added.
     *
     * @return the purchasedDate value.
     */
    public OffsetDateTime purchasedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasedDate();
    }

    /**
     * Get the status property: The status of the lot.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the creditCurrency property: The currency of the lot.
     *
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().creditCurrency();
    }

    /**
     * Get the billingCurrency property: The billing currency of the lot.
     *
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingCurrency();
    }

    /**
     * Get the originalAmountInBillingCurrency property: The original amount of a lot in billing currency.
     *
     * @return the originalAmountInBillingCurrency value.
     */
    public AmountWithExchangeRate originalAmountInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().originalAmountInBillingCurrency();
    }

    /**
     * Get the closedBalanceInBillingCurrency property: The balance as of the last invoice in billing currency.
     *
     * @return the closedBalanceInBillingCurrency value.
     */
    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().closedBalanceInBillingCurrency();
    }

    /**
     * Get the reseller property: The reseller of the lot.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.innerProperties() == null ? null : this.innerProperties().reseller();
    }

    /**
     * Get the isEstimatedBalance property: If true, the listed details are based on an estimation and it will be
     * subjected to change.
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
     * Get the orgType property: The organization type of the lot.
     *
     * @return the orgType value.
     */
    public OrgType orgType() {
        return this.innerProperties() == null ? null : this.innerProperties().orgType();
    }

    /**
     * Get the usedAmount property: Amount consumed from the commitment.
     *
     * @return the usedAmount value.
     */
    public Amount usedAmount() {
        return this.innerProperties() == null ? null : this.innerProperties().usedAmount();
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
