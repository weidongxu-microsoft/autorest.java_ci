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
 * Set of data with rendering instructions.
 */
@Fluent
public final class DiagnosticData implements JsonSerializable<DiagnosticData> {
    /*
     * Data in table form
     */
    private DataTableResponseObject table;

    /*
     * Properties that describe how the table should be rendered
     */
    private Rendering renderingProperties;

    /**
     * Creates an instance of DiagnosticData class.
     */
    public DiagnosticData() {
    }

    /**
     * Get the table property: Data in table form.
     * 
     * @return the table value.
     */
    public DataTableResponseObject table() {
        return this.table;
    }

    /**
     * Set the table property: Data in table form.
     * 
     * @param table the table value to set.
     * @return the DiagnosticData object itself.
     */
    public DiagnosticData withTable(DataTableResponseObject table) {
        this.table = table;
        return this;
    }

    /**
     * Get the renderingProperties property: Properties that describe how the table should be rendered.
     * 
     * @return the renderingProperties value.
     */
    public Rendering renderingProperties() {
        return this.renderingProperties;
    }

    /**
     * Set the renderingProperties property: Properties that describe how the table should be rendered.
     * 
     * @param renderingProperties the renderingProperties value to set.
     * @return the DiagnosticData object itself.
     */
    public DiagnosticData withRenderingProperties(Rendering renderingProperties) {
        this.renderingProperties = renderingProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (table() != null) {
            table().validate();
        }
        if (renderingProperties() != null) {
            renderingProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("table", this.table);
        jsonWriter.writeJsonField("renderingProperties", this.renderingProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticData.
     */
    public static DiagnosticData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticData deserializedDiagnosticData = new DiagnosticData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("table".equals(fieldName)) {
                    deserializedDiagnosticData.table = DataTableResponseObject.fromJson(reader);
                } else if ("renderingProperties".equals(fieldName)) {
                    deserializedDiagnosticData.renderingProperties = Rendering.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticData;
        });
    }
}
