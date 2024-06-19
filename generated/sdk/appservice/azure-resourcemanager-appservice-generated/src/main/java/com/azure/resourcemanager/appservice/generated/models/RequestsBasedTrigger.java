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
 * Trigger based on total requests.
 */
@Fluent
public final class RequestsBasedTrigger implements JsonSerializable<RequestsBasedTrigger> {
    /*
     * Request Count.
     */
    private Integer count;

    /*
     * Time interval.
     */
    private String timeInterval;

    /**
     * Creates an instance of RequestsBasedTrigger class.
     */
    public RequestsBasedTrigger() {
    }

    /**
     * Get the count property: Request Count.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     * 
     * @param count the count value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     * 
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     * 
     * @param timeInterval the timeInterval value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
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
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeStringField("timeInterval", this.timeInterval);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RequestsBasedTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RequestsBasedTrigger if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RequestsBasedTrigger.
     */
    public static RequestsBasedTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RequestsBasedTrigger deserializedRequestsBasedTrigger = new RequestsBasedTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedRequestsBasedTrigger.count = reader.getNullable(JsonReader::getInt);
                } else if ("timeInterval".equals(fieldName)) {
                    deserializedRequestsBasedTrigger.timeInterval = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRequestsBasedTrigger;
        });
    }
}
