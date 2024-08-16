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
 * Describes a list of inputs to a Job.
 */
@Fluent
public final class JobInputs extends JobInput {
    /*
     * List of inputs to a Job.
     */
    private List<JobInput> inputs;

    /**
     * Creates an instance of JobInputs class.
     */
    public JobInputs() {
        this.odataType = "#Microsoft.Media.JobInputs";
    }

    /**
     * Get the inputs property: List of inputs to a Job.
     * 
     * @return the inputs value.
     */
    public List<JobInput> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: List of inputs to a Job.
     * 
     * @param inputs the inputs value to set.
     * @return the JobInputs object itself.
     */
    public JobInputs withInputs(List<JobInput> inputs) {
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
        toJsonShared(jsonWriter);
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobInputs from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobInputs if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the JobInputs.
     */
    public static JobInputs fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobInputs deserializedJobInputs = new JobInputs();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedJobInputs.odataType = reader.getString();
                } else if ("inputs".equals(fieldName)) {
                    List<JobInput> inputs = reader.readArray(reader1 -> JobInput.fromJson(reader1));
                    deserializedJobInputs.inputs = inputs;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobInputs;
        });
    }
}
