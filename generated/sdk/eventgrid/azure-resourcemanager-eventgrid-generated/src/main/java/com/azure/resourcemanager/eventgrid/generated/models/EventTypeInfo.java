// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The event type information for Channels.
 */
@Fluent
public final class EventTypeInfo implements JsonSerializable<EventTypeInfo> {
    /*
     * The kind of event type used.
     */
    private EventDefinitionKind kind;

    /*
     * A collection of inline event types for the resource. The inline event type keys are of type string which
     * represents the name of the event.
     * An example of a valid inline event name is "Contoso.OrderCreated".
     * The inline event type values are of type InlineEventProperties and will contain additional information for every
     * inline event type.
     */
    private Map<String, InlineEventProperties> inlineEventTypes;

    /**
     * Creates an instance of EventTypeInfo class.
     */
    public EventTypeInfo() {
    }

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
     * keys are of type string which represents the name of the event.
     * An example of a valid inline event name is "Contoso.OrderCreated".
     * The inline event type values are of type InlineEventProperties and will contain additional information for every
     * inline event type.
     * 
     * @return the inlineEventTypes value.
     */
    public Map<String, InlineEventProperties> inlineEventTypes() {
        return this.inlineEventTypes;
    }

    /**
     * Set the inlineEventTypes property: A collection of inline event types for the resource. The inline event type
     * keys are of type string which represents the name of the event.
     * An example of a valid inline event name is "Contoso.OrderCreated".
     * The inline event type values are of type InlineEventProperties and will contain additional information for every
     * inline event type.
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
            inlineEventTypes().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeMapField("inlineEventTypes", this.inlineEventTypes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventTypeInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventTypeInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventTypeInfo.
     */
    public static EventTypeInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventTypeInfo deserializedEventTypeInfo = new EventTypeInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedEventTypeInfo.kind = EventDefinitionKind.fromString(reader.getString());
                } else if ("inlineEventTypes".equals(fieldName)) {
                    Map<String, InlineEventProperties> inlineEventTypes
                        = reader.readMap(reader1 -> InlineEventProperties.fromJson(reader1));
                    deserializedEventTypeInfo.inlineEventTypes = inlineEventTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventTypeInfo;
        });
    }
}
