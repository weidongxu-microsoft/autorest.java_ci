// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The event type information for Channels. */
@Fluent
public final class EventTypeInfo {
    /*
     * The kind of event type used.
     */
    @JsonProperty(value = "kind")
    private EventDefinitionKind kind;

    /*
     * A collection of inline event types for the resource. The inline event
     * type keys are of type string which represents the name of the event.
     * An example of a valid inline event name is "Contoso.OrderCreated".
     * The inline event type values are of type InlineEventProperties and will
     * contain additional information for every inline event type.
     */
    @JsonProperty(value = "inlineEventTypes")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, InlineEventProperties> inlineEventTypes;

    /**
     * Get the kind property: The kind of event type used.
     *
     * @return the kind value.
     */
    public EventDefinitionKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of event type used.
     *
     * @param kind the kind value to set.
     * @return the EventTypeInfo object itself.
     */
    public EventTypeInfo withKind(EventDefinitionKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the inlineEventTypes property: A collection of inline event types for the resource. The inline event type
     * keys are of type string which represents the name of the event. An example of a valid inline event name is
     * "Contoso.OrderCreated". The inline event type values are of type InlineEventProperties and will contain
     * additional information for every inline event type.
     *
     * @return the inlineEventTypes value.
     */
    public Map<String, InlineEventProperties> inlineEventTypes() {
        return this.inlineEventTypes;
    }

    /**
     * Set the inlineEventTypes property: A collection of inline event types for the resource. The inline event type
     * keys are of type string which represents the name of the event. An example of a valid inline event name is
     * "Contoso.OrderCreated". The inline event type values are of type InlineEventProperties and will contain
     * additional information for every inline event type.
     *
     * @param inlineEventTypes the inlineEventTypes value to set.
     * @return the EventTypeInfo object itself.
     */
    public EventTypeInfo withInlineEventTypes(Map<String, InlineEventProperties> inlineEventTypes) {
        this.inlineEventTypes = inlineEventTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inlineEventTypes() != null) {
            inlineEventTypes()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
