// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** Indicates that a monetary commitment is required for this offer. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Name")
@JsonTypeName("Monetary Commitment")
@Fluent
public final class MonetaryCommitment extends OfferTermInfoAutoGenerated {
    /*
     * The list of key/value pairs for the tiered meter rates, in the format
     * 'key':'value' where key = price, and value = the corresponding discount
     * percentage. This field is used only by offer terms of type 'Monetary
     * Commitment'.
     */
    @JsonProperty(value = "TieredDiscount")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, BigDecimal> tieredDiscount;

    /*
     * An array of meter ids that are excluded from the given offer terms.
     */
    @JsonProperty(value = "ExcludedMeterIds")
    private List<UUID> excludedMeterIds;

    /**
     * Get the tieredDiscount property: The list of key/value pairs for the tiered meter rates, in the format
     * 'key':'value' where key = price, and value = the corresponding discount percentage. This field is used only by
     * offer terms of type 'Monetary Commitment'.
     *
     * @return the tieredDiscount value.
     */
    public Map<String, BigDecimal> tieredDiscount() {
        return this.tieredDiscount;
    }

    /**
     * Set the tieredDiscount property: The list of key/value pairs for the tiered meter rates, in the format
     * 'key':'value' where key = price, and value = the corresponding discount percentage. This field is used only by
     * offer terms of type 'Monetary Commitment'.
     *
     * @param tieredDiscount the tieredDiscount value to set.
     * @return the MonetaryCommitment object itself.
     */
    public MonetaryCommitment withTieredDiscount(Map<String, BigDecimal> tieredDiscount) {
        this.tieredDiscount = tieredDiscount;
        return this;
    }

    /**
     * Get the excludedMeterIds property: An array of meter ids that are excluded from the given offer terms.
     *
     * @return the excludedMeterIds value.
     */
    public List<UUID> excludedMeterIds() {
        return this.excludedMeterIds;
    }

    /**
     * Set the excludedMeterIds property: An array of meter ids that are excluded from the given offer terms.
     *
     * @param excludedMeterIds the excludedMeterIds value to set.
     * @return the MonetaryCommitment object itself.
     */
    public MonetaryCommitment withExcludedMeterIds(List<UUID> excludedMeterIds) {
        this.excludedMeterIds = excludedMeterIds;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MonetaryCommitment withEffectiveDate(OffsetDateTime effectiveDate) {
        super.withEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
