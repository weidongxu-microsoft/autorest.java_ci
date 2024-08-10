// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A Sequence contains an ordered list of Clips where each clip is a JobInput. The Sequence will be treated as a single
 * input.
 */
@Fluent
public final class JobInputSequence extends JobInput {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.JobInputSequence";

    /*
     * JobInputs that make up the timeline.
     */
    private List<JobInputClip> inputs;

    /**
     * Creates an instance of JobInputSequence class.
     */
    public JobInputSequence() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the inputs property: JobInputs that make up the timeline.
     * 
     * @return the inputs value.
     */
    public List<JobInputClip> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: JobInputs that make up the timeline.
     * 
     * @param inputs the inputs value to set.
     * @return the JobInputSequence object itself.
     */
    public JobInputSequence withInputs(List<JobInputClip> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobInputSequence from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobInputSequence if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobInputSequence.
     */
    public static JobInputSequence fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobInputSequence deserializedJobInputSequence = new JobInputSequence();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedJobInputSequence.odataType = reader.getString();
                } else if ("inputs".equals(fieldName)) {
                    List<JobInputClip> inputs = reader.readArray(reader1 -> JobInputClip.fromJson(reader1));
                    deserializedJobInputSequence.inputs = inputs;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobInputSequence;
        });
    }
}
