// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.CaCertificateInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List CA Certificate operation. */
@Fluent
public final class CaCertificatesListResult {
    /*
     * A collection of CA Certificate.
     */
    @JsonProperty(value = "value")
    private List<CaCertificateInner> value;

    /*
     * A link for the next page of CA Certificate.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of CaCertificatesListResult class. */
    public CaCertificatesListResult() {
    }

    /**
     * Get the value property: A collection of CA Certificate.
     *
     * @return the value value.
     */
    public List<CaCertificateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of CA Certificate.
     *
     * @param value the value value to set.
     * @return the CaCertificatesListResult object itself.
     */
    public CaCertificatesListResult withValue(List<CaCertificateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of CA Certificate.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of CA Certificate.
     *
     * @param nextLink the nextLink value to set.
     * @return the CaCertificatesListResult object itself.
     */
    public CaCertificatesListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
