// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes the body of a purge request for an App Insights Workspace.
 */
@Fluent
public final class WorkspacePurgeBody implements JsonSerializable<WorkspacePurgeBody> {
    /*
     * Table from which to purge data.
     */
    private String table;

    /*
     * The set of columns and filters (queries) to run over them to purge the resulting data.
     */
    private List<WorkspacePurgeBodyFilters> filters;

    /**
     * Creates an instance of WorkspacePurgeBody class.
     */
    public WorkspacePurgeBody() {
    }

    /**
     * Get the table property: Table from which to purge data.
     * 
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: Table from which to purge data.
     * 
     * @param table the table value to set.
     * @return the WorkspacePurgeBody object itself.
     */
    public WorkspacePurgeBody withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the filters property: The set of columns and filters (queries) to run over them to purge the resulting data.
     * 
     * @return the filters value.
     */
    public List<WorkspacePurgeBodyFilters> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: The set of columns and filters (queries) to run over them to purge the resulting data.
     * 
     * @param filters the filters value to set.
     * @return the WorkspacePurgeBody object itself.
     */
    public WorkspacePurgeBody withFilters(List<WorkspacePurgeBodyFilters> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (table() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property table in model WorkspacePurgeBody"));
        }
        if (filters() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property filters in model WorkspacePurgeBody"));
        } else {
            filters().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspacePurgeBody.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("table", this.table);
        jsonWriter.writeArrayField("filters", this.filters, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspacePurgeBody from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspacePurgeBody if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkspacePurgeBody.
     */
    public static WorkspacePurgeBody fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspacePurgeBody deserializedWorkspacePurgeBody = new WorkspacePurgeBody();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("table".equals(fieldName)) {
                    deserializedWorkspacePurgeBody.table = reader.getString();
                } else if ("filters".equals(fieldName)) {
                    List<WorkspacePurgeBodyFilters> filters
                        = reader.readArray(reader1 -> WorkspacePurgeBodyFilters.fromJson(reader1));
                    deserializedWorkspacePurgeBody.filters = filters;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspacePurgeBody;
        });
    }
}
