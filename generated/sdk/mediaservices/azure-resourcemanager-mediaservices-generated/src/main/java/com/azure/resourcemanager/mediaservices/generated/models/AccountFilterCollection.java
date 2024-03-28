// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AccountFilterInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A collection of AccountFilter items.
 */
@Fluent
public final class AccountFilterCollection {
    /*
     * A collection of AccountFilter items.
     */
    @JsonProperty(value = "value")
    private List<AccountFilterInner> value;

    /*
     * A link to the next page of the collection (when the collection contains too many results to return in one response).
     */
    @JsonProperty(value = "@odata.nextLink")
    private String odataNextLink;

    /**
     * Creates an instance of AccountFilterCollection class.
     */
    public AccountFilterCollection() {
    }

    /**
     * Get the value property: A collection of AccountFilter items.
     * 
     * @return the value value.
     */
    public List<AccountFilterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of AccountFilter items.
     * 
     * @param value the value value to set.
     * @return the AccountFilterCollection object itself.
     */
    public AccountFilterCollection withValue(List<AccountFilterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the AccountFilterCollection object itself.
     */
    public AccountFilterCollection withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
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
