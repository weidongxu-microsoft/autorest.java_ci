// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventChannelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List Event Channels operation. */
@Fluent
public final class EventChannelsListResult {
    /*
     * A collection of Event Channels
     */
    @JsonProperty(value = "value")
    private List<EventChannelInner> value;

    /*
     * A link for the next page of event channels
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of Event Channels.
     *
     * @return the value value.
     */
    public List<EventChannelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Event Channels.
     *
     * @param value the value value to set.
     * @return the EventChannelsListResult object itself.
     */
    public EventChannelsListResult withValue(List<EventChannelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of event channels.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of event channels.
     *
     * @param nextLink the nextLink value to set.
     * @return the EventChannelsListResult object itself.
     */
    public EventChannelsListResult withNextLink(String nextLink) {
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
