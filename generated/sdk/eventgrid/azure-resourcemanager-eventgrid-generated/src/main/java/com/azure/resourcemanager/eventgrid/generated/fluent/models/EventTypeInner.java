// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Event Type for a subject under a topic.
 */
@Fluent
public final class EventTypeInner extends ProxyResource {
    /*
     * Properties of the event type.
     */
    private EventTypeProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of EventTypeInner class.
     */
    public EventTypeInner() {
    }

    /**
     * Get the innerProperties property: Properties of the event type.
     * 
     * @return the innerProperties value.
     */
    private EventTypeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the displayName property: Display name of the event type.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name of the event type.
     * 
     * @param displayName the displayName value to set.
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventTypeProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: Description of the event type.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the event type.
     * 
     * @param description the description value to set.
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventTypeProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the schemaUrl property: Url of the schema for this event type.
     * 
     * @return the schemaUrl value.
     */
    public String schemaUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaUrl();
    }

    /**
     * Set the schemaUrl property: Url of the schema for this event type.
     * 
     * @param schemaUrl the schemaUrl value to set.
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withSchemaUrl(String schemaUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventTypeProperties();
        }
        this.innerProperties().withSchemaUrl(schemaUrl);
        return this;
    }

    /**
     * Get the isInDefaultSet property: IsInDefaultSet flag of the event type.
     * 
     * @return the isInDefaultSet value.
     */
    public Boolean isInDefaultSet() {
        return this.innerProperties() == null ? null : this.innerProperties().isInDefaultSet();
    }

    /**
     * Set the isInDefaultSet property: IsInDefaultSet flag of the event type.
     * 
     * @param isInDefaultSet the isInDefaultSet value to set.
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withIsInDefaultSet(Boolean isInDefaultSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventTypeProperties();
        }
        this.innerProperties().withIsInDefaultSet(isInDefaultSet);
        return this;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventTypeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventTypeInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EventTypeInner.
     */
    public static EventTypeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventTypeInner deserializedEventTypeInner = new EventTypeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEventTypeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedEventTypeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedEventTypeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedEventTypeInner.innerProperties = EventTypeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventTypeInner;
        });
    }
}
