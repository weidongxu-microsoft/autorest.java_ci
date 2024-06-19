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

/**
 * Represents an output file produced.
 */
@Fluent
public final class OutputFile implements JsonSerializable<OutputFile> {
    /*
     * The list of labels that describe how the encoder should multiplex video and audio into an output file. For
     * example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1,
     * then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1
     * and the audio track represented by a1.
     */
    private List<String> labels;

    /**
     * Creates an instance of OutputFile class.
     */
    public OutputFile() {
    }

    /**
     * Get the labels property: The list of labels that describe how the encoder should multiplex video and audio into
     * an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio
     * layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video
     * track represented by v1 and the audio track represented by a1.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: The list of labels that describe how the encoder should multiplex video and audio into
     * an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio
     * layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video
     * track represented by v1 and the audio track represented by a1.
     * 
     * @param labels the labels value to set.
     * @return the OutputFile object itself.
     */
    public OutputFile withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (labels() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property labels in model OutputFile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OutputFile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("labels", this.labels, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputFile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputFile if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutputFile.
     */
    public static OutputFile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutputFile deserializedOutputFile = new OutputFile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("labels".equals(fieldName)) {
                    List<String> labels = reader.readArray(reader1 -> reader1.getString());
                    deserializedOutputFile.labels = labels;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutputFile;
        });
    }
}
