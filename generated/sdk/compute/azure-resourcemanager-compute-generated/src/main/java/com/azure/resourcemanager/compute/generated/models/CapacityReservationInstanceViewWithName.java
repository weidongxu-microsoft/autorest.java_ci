// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The instance view of a capacity reservation that includes the name of the capacity reservation. It is used for the
 * response to the instance view of a capacity reservation group.
 */
@Fluent
public final class CapacityReservationInstanceViewWithName extends CapacityReservationInstanceView {
    /*
     * The name of the capacity reservation.
     */
    private String name;

    /**
     * Creates an instance of CapacityReservationInstanceViewWithName class.
     */
    public CapacityReservationInstanceViewWithName() {
    }

    /**
     * Get the name property: The name of the capacity reservation.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationInstanceViewWithName withUtilizationInfo(CapacityReservationUtilization utilizationInfo) {
        super.withUtilizationInfo(utilizationInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationInstanceViewWithName withStatuses(List<InstanceViewStatus> statuses) {
        super.withStatuses(statuses);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("utilizationInfo", utilizationInfo());
        jsonWriter.writeArrayField("statuses", statuses(), (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapacityReservationInstanceViewWithName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapacityReservationInstanceViewWithName if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapacityReservationInstanceViewWithName.
     */
    public static CapacityReservationInstanceViewWithName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapacityReservationInstanceViewWithName deserializedCapacityReservationInstanceViewWithName
                = new CapacityReservationInstanceViewWithName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("utilizationInfo".equals(fieldName)) {
                    deserializedCapacityReservationInstanceViewWithName
                        .withUtilizationInfo(CapacityReservationUtilization.fromJson(reader));
                } else if ("statuses".equals(fieldName)) {
                    List<InstanceViewStatus> statuses
                        = reader.readArray(reader1 -> InstanceViewStatus.fromJson(reader1));
                    deserializedCapacityReservationInstanceViewWithName.withStatuses(statuses);
                } else if ("name".equals(fieldName)) {
                    deserializedCapacityReservationInstanceViewWithName.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapacityReservationInstanceViewWithName;
        });
    }
}
