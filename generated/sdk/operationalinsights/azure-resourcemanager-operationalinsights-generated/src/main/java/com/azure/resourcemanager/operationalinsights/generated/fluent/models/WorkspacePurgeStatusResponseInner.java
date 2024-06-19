// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.operationalinsights.generated.models.PurgeState;
import java.io.IOException;

/**
 * Response containing status for a specific purge operation.
 */
@Fluent
public final class WorkspacePurgeStatusResponseInner implements JsonSerializable<WorkspacePurgeStatusResponseInner> {
    /*
     * Status of the operation represented by the requested Id.
     */
    private PurgeState status;

    /**
     * Creates an instance of WorkspacePurgeStatusResponseInner class.
     */
    public WorkspacePurgeStatusResponseInner() {
    }

    /**
     * Get the status property: Status of the operation represented by the requested Id.
     * 
     * @return the status value.
     */
    public PurgeState status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the operation represented by the requested Id.
     * 
     * @param status the status value to set.
     * @return the WorkspacePurgeStatusResponseInner object itself.
     */
    public WorkspacePurgeStatusResponseInner withStatus(PurgeState status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property status in model WorkspacePurgeStatusResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspacePurgeStatusResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspacePurgeStatusResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspacePurgeStatusResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkspacePurgeStatusResponseInner.
     */
    public static WorkspacePurgeStatusResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspacePurgeStatusResponseInner deserializedWorkspacePurgeStatusResponseInner
                = new WorkspacePurgeStatusResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedWorkspacePurgeStatusResponseInner.status = PurgeState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspacePurgeStatusResponseInner;
        });
    }
}
