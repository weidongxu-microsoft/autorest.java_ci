// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.MeterDetailsV2;
import com.azure.resourcemanager.consumption.generated.models.PriceSheetPropertiesV2;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An pricesheet resource. */
@Immutable
public final class PriceSheetResultV2Inner extends ProxyResource {
    /*
     * price sheet result. It contains the pricesheet associated with billing period
     */
    @JsonProperty(value = "properties")
    private PriceSheetModelV2 innerProperties;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of PriceSheetResultV2Inner class. */
    public PriceSheetResultV2Inner() {
    }

    /**
     * Get the innerProperties property: price sheet result. It contains the pricesheet associated with billing period.
     *
     * @return the innerProperties value.
     */
    private PriceSheetModelV2 innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the pricesheets property: Price sheet.
     *
     * @return the pricesheets value.
     */
    public List<PriceSheetPropertiesV2> pricesheets() {
        return this.innerProperties() == null ? null : this.innerProperties().pricesheets();
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().nextLink();
    }

    /**
     * Get the download property: Pricesheet download details.
     *
     * @return the download value.
     */
    public MeterDetailsV2 download() {
        return this.innerProperties() == null ? null : this.innerProperties().download();
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