// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import java.io.IOException;
import java.util.List;

/**
 * The RunCommandResult model.
 */
@Fluent
public final class RunCommandResultInner implements JsonSerializable<RunCommandResultInner> {
    /*
     * Run command operation response.
     */
    private List<InstanceViewStatus> value;

    /**
     * Creates an instance of RunCommandResultInner class.
     */
    public RunCommandResultInner() {
    }

    /**
     * Get the value property: Run command operation response.
     * 
     * @return the value value.
     */
    public List<InstanceViewStatus> value() {
        return this.value;
    }

    /**
     * Set the value property: Run command operation response.
     * 
     * @param value the value value to set.
     * @return the RunCommandResultInner object itself.
     */
    public RunCommandResultInner withValue(List<InstanceViewStatus> value) {
        this.value = value;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunCommandResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunCommandResultInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunCommandResultInner.
     */
    public static RunCommandResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunCommandResultInner deserializedRunCommandResultInner = new RunCommandResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<InstanceViewStatus> value = reader.readArray(reader1 -> InstanceViewStatus.fromJson(reader1));
                    deserializedRunCommandResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunCommandResultInner;
        });
    }
}
