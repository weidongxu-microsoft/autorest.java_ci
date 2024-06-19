// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Traffic weight assigned to a revision.
 */
@Fluent
public final class TrafficWeight implements JsonSerializable<TrafficWeight> {
    /*
     * Name of a revision
     */
    private String revisionName;

    /*
     * Traffic weight assigned to a revision
     */
    private Integer weight;

    /*
     * Indicates that the traffic weight belongs to a latest stable revision
     */
    private Boolean latestRevision;

    /**
     * Creates an instance of TrafficWeight class.
     */
    public TrafficWeight() {
    }

    /**
     * Get the revisionName property: Name of a revision.
     * 
     * @return the revisionName value.
     */
    public String revisionName() {
        return this.revisionName;
    }

    /**
     * Set the revisionName property: Name of a revision.
     * 
     * @param revisionName the revisionName value to set.
     * @return the TrafficWeight object itself.
     */
    public TrafficWeight withRevisionName(String revisionName) {
        this.revisionName = revisionName;
        return this;
    }

    /**
     * Get the weight property: Traffic weight assigned to a revision.
     * 
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Traffic weight assigned to a revision.
     * 
     * @param weight the weight value to set.
     * @return the TrafficWeight object itself.
     */
    public TrafficWeight withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the latestRevision property: Indicates that the traffic weight belongs to a latest stable revision.
     * 
     * @return the latestRevision value.
     */
    public Boolean latestRevision() {
        return this.latestRevision;
    }

    /**
     * Set the latestRevision property: Indicates that the traffic weight belongs to a latest stable revision.
     * 
     * @param latestRevision the latestRevision value to set.
     * @return the TrafficWeight object itself.
     */
    public TrafficWeight withLatestRevision(Boolean latestRevision) {
        this.latestRevision = latestRevision;
        return this;
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
        jsonWriter.writeStringField("revisionName", this.revisionName);
        jsonWriter.writeNumberField("weight", this.weight);
        jsonWriter.writeBooleanField("latestRevision", this.latestRevision);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficWeight from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficWeight if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficWeight.
     */
    public static TrafficWeight fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficWeight deserializedTrafficWeight = new TrafficWeight();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("revisionName".equals(fieldName)) {
                    deserializedTrafficWeight.revisionName = reader.getString();
                } else if ("weight".equals(fieldName)) {
                    deserializedTrafficWeight.weight = reader.getNullable(JsonReader::getInt);
                } else if ("latestRevision".equals(fieldName)) {
                    deserializedTrafficWeight.latestRevision = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficWeight;
        });
    }
}
