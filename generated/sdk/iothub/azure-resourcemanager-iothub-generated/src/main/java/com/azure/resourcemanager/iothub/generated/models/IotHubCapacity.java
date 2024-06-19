// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IoT Hub capacity information.
 */
@Immutable
public final class IotHubCapacity implements JsonSerializable<IotHubCapacity> {
    /*
     * The minimum number of units.
     */
    private Long minimum;

    /*
     * The maximum number of units.
     */
    private Long maximum;

    /*
     * The default number of units.
     */
    private Long defaultProperty;

    /*
     * The type of the scaling enabled.
     */
    private IotHubScaleType scaleType;

    /**
     * Creates an instance of IotHubCapacity class.
     */
    public IotHubCapacity() {
    }

    /**
     * Get the minimum property: The minimum number of units.
     * 
     * @return the minimum value.
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The maximum number of units.
     * 
     * @return the maximum value.
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultProperty property: The default number of units.
     * 
     * @return the defaultProperty value.
     */
    public Long defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the scaleType property: The type of the scaling enabled.
     * 
     * @return the scaleType value.
     */
    public IotHubScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotHubCapacity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubCapacity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IotHubCapacity.
     */
    public static IotHubCapacity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotHubCapacity deserializedIotHubCapacity = new IotHubCapacity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minimum".equals(fieldName)) {
                    deserializedIotHubCapacity.minimum = reader.getNullable(JsonReader::getLong);
                } else if ("maximum".equals(fieldName)) {
                    deserializedIotHubCapacity.maximum = reader.getNullable(JsonReader::getLong);
                } else if ("default".equals(fieldName)) {
                    deserializedIotHubCapacity.defaultProperty = reader.getNullable(JsonReader::getLong);
                } else if ("scaleType".equals(fieldName)) {
                    deserializedIotHubCapacity.scaleType = IotHubScaleType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotHubCapacity;
        });
    }
}
