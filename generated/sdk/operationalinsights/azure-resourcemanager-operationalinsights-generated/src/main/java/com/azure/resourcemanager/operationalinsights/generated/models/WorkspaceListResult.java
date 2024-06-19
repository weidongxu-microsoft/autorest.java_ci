// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.WorkspaceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list workspaces operation response.
 */
@Fluent
public final class WorkspaceListResult implements JsonSerializable<WorkspaceListResult> {
    /*
     * A list of workspaces.
     */
    private List<WorkspaceInner> value;

    /**
     * Creates an instance of WorkspaceListResult class.
     */
    public WorkspaceListResult() {
    }

    /**
     * Get the value property: A list of workspaces.
     * 
     * @return the value value.
     */
    public List<WorkspaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of workspaces.
     * 
     * @param value the value value to set.
     * @return the WorkspaceListResult object itself.
     */
    public WorkspaceListResult withValue(List<WorkspaceInner> value) {
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
     * Reads an instance of WorkspaceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkspaceListResult.
     */
    public static WorkspaceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceListResult deserializedWorkspaceListResult = new WorkspaceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<WorkspaceInner> value = reader.readArray(reader1 -> WorkspaceInner.fromJson(reader1));
                    deserializedWorkspaceListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceListResult;
        });
    }
}
