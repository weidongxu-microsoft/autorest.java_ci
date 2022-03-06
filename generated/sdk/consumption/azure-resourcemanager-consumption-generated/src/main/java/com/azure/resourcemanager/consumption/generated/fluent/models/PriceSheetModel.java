// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.consumption.generated.models.MeterDetails;
import com.azure.resourcemanager.consumption.generated.models.PriceSheetProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** price sheet result. It contains the pricesheet associated with billing period. */
@Immutable
public final class PriceSheetModel {
    /*
     * Price sheet
     */
    @JsonProperty(value = "pricesheets", access = JsonProperty.Access.WRITE_ONLY)
    private List<PriceSheetProperties> pricesheets;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Pricesheet download details.
     */
    @JsonProperty(value = "download", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails download;

    /**
     * Get the pricesheets property: Price sheet.
     *
     * @return the pricesheets value.
     */
    public List<PriceSheetProperties> pricesheets() {
        return this.pricesheets;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the download property: Pricesheet download details.
     *
     * @return the download value.
     */
    public MeterDetails download() {
        return this.download;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricesheets() != null) {
            pricesheets().forEach(e -> e.validate());
        }
        if (download() != null) {
            download().validate();
        }
    }
}
