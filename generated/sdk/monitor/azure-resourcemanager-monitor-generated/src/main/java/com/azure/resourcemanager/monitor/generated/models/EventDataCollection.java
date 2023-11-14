// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents collection of events.
 */
@Fluent
public final class EventDataCollection {
    /*
     * this list that includes the Azure audit logs.
     */
    @JsonProperty(value = "value", required = true)
    private List<EventDataInner> value;

    /*
     * Provides the link to retrieve the next set of events.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of EventDataCollection class.
     */
    public EventDataCollection() {
    }

    /**
     * Get the value property: this list that includes the Azure audit logs.
     * 
     * @return the value value.
     */
    public List<EventDataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: this list that includes the Azure audit logs.
     * 
     * @param value the value value to set.
     * @return the EventDataCollection object itself.
     */
    public EventDataCollection withValue(List<EventDataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Provides the link to retrieve the next set of events.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Provides the link to retrieve the next set of events.
     * 
     * @param nextLink the nextLink value to set.
     * @return the EventDataCollection object itself.
     */
    public EventDataCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model EventDataCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventDataCollection.class);
}
