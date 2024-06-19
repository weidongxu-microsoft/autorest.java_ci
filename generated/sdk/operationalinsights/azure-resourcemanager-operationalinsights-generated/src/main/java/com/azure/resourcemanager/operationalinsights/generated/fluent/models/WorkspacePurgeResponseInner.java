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
import java.io.IOException;

/**
 * Response containing operationId for a specific purge action.
 */
@Fluent
public final class WorkspacePurgeResponseInner implements JsonSerializable<WorkspacePurgeResponseInner> {
    /*
     * Id to use when querying for status for a particular purge operation.
     */
    private String operationId;

    /**
     * Creates an instance of WorkspacePurgeResponseInner class.
     */
    public WorkspacePurgeResponseInner() {
    }

    /**
     * Get the operationId property: Id to use when querying for status for a particular purge operation.
     * 
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: Id to use when querying for status for a particular purge operation.
     * 
     * @param operationId the operationId value to set.
     * @return the WorkspacePurgeResponseInner object itself.
     */
    public WorkspacePurgeResponseInner withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operationId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operationId in model WorkspacePurgeResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspacePurgeResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", this.operationId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspacePurgeResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspacePurgeResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkspacePurgeResponseInner.
     */
    public static WorkspacePurgeResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspacePurgeResponseInner deserializedWorkspacePurgeResponseInner = new WorkspacePurgeResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedWorkspacePurgeResponseInner.operationId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspacePurgeResponseInner;
        });
    }
}
