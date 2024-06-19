// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Class for content key in Streaming Locator.
 */
@Fluent
public final class StreamingLocatorContentKey implements JsonSerializable<StreamingLocatorContentKey> {
    /*
     * ID of Content Key
     */
    private UUID id;

    /*
     * Encryption type of Content Key
     */
    private StreamingLocatorContentKeyType type;

    /*
     * Label of Content Key as specified in the Streaming Policy
     */
    private String labelReferenceInStreamingPolicy;

    /*
     * Value of Content Key
     */
    private String value;

    /*
     * ContentKeyPolicy used by Content Key
     */
    private String policyName;

    /*
     * Tracks which use this Content Key
     */
    private List<TrackSelection> tracks;

    /**
     * Creates an instance of StreamingLocatorContentKey class.
     */
    public StreamingLocatorContentKey() {
    }

    /**
     * Get the id property: ID of Content Key.
     * 
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id property: ID of Content Key.
     * 
     * @param id the id value to set.
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Encryption type of Content Key.
     * 
     * @return the type value.
     */
    public StreamingLocatorContentKeyType type() {
        return this.type;
    }

    /**
     * Get the labelReferenceInStreamingPolicy property: Label of Content Key as specified in the Streaming Policy.
     * 
     * @return the labelReferenceInStreamingPolicy value.
     */
    public String labelReferenceInStreamingPolicy() {
        return this.labelReferenceInStreamingPolicy;
    }

    /**
     * Set the labelReferenceInStreamingPolicy property: Label of Content Key as specified in the Streaming Policy.
     * 
     * @param labelReferenceInStreamingPolicy the labelReferenceInStreamingPolicy value to set.
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withLabelReferenceInStreamingPolicy(String labelReferenceInStreamingPolicy) {
        this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
        return this;
    }

    /**
     * Get the value property: Value of Content Key.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of Content Key.
     * 
     * @param value the value value to set.
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the policyName property: ContentKeyPolicy used by Content Key.
     * 
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Get the tracks property: Tracks which use this Content Key.
     * 
     * @return the tracks value.
     */
    public List<TrackSelection> tracks() {
        return this.tracks;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model StreamingLocatorContentKey"));
        }
        if (tracks() != null) {
            tracks().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StreamingLocatorContentKey.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", Objects.toString(this.id, null));
        jsonWriter.writeStringField("labelReferenceInStreamingPolicy", this.labelReferenceInStreamingPolicy);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StreamingLocatorContentKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StreamingLocatorContentKey if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StreamingLocatorContentKey.
     */
    public static StreamingLocatorContentKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StreamingLocatorContentKey deserializedStreamingLocatorContentKey = new StreamingLocatorContentKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStreamingLocatorContentKey.id
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("type".equals(fieldName)) {
                    deserializedStreamingLocatorContentKey.type
                        = StreamingLocatorContentKeyType.fromString(reader.getString());
                } else if ("labelReferenceInStreamingPolicy".equals(fieldName)) {
                    deserializedStreamingLocatorContentKey.labelReferenceInStreamingPolicy = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedStreamingLocatorContentKey.value = reader.getString();
                } else if ("policyName".equals(fieldName)) {
                    deserializedStreamingLocatorContentKey.policyName = reader.getString();
                } else if ("tracks".equals(fieldName)) {
                    List<TrackSelection> tracks = reader.readArray(reader1 -> TrackSelection.fromJson(reader1));
                    deserializedStreamingLocatorContentKey.tracks = tracks;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStreamingLocatorContentKey;
        });
    }
}
