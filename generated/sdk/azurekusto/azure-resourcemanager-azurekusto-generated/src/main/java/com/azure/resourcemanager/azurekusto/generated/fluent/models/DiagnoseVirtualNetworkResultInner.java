// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The DiagnoseVirtualNetworkResult model.
 */
@Fluent
public final class DiagnoseVirtualNetworkResultInner implements JsonSerializable<DiagnoseVirtualNetworkResultInner> {
    /*
     * The list of network connectivity diagnostic finding
     */
    private List<String> findings;

    /**
     * Creates an instance of DiagnoseVirtualNetworkResultInner class.
     */
    public DiagnoseVirtualNetworkResultInner() {
    }

    /**
     * Get the findings property: The list of network connectivity diagnostic finding.
     * 
     * @return the findings value.
     */
    public List<String> findings() {
        return this.findings;
    }

    /**
     * Set the findings property: The list of network connectivity diagnostic finding.
     * 
     * @param findings the findings value to set.
     * @return the DiagnoseVirtualNetworkResultInner object itself.
     */
    public DiagnoseVirtualNetworkResultInner withFindings(List<String> findings) {
        this.findings = findings;
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
        jsonWriter.writeArrayField("findings", this.findings, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnoseVirtualNetworkResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnoseVirtualNetworkResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnoseVirtualNetworkResultInner.
     */
    public static DiagnoseVirtualNetworkResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnoseVirtualNetworkResultInner deserializedDiagnoseVirtualNetworkResultInner
                = new DiagnoseVirtualNetworkResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("findings".equals(fieldName)) {
                    List<String> findings = reader.readArray(reader1 -> reader1.getString());
                    deserializedDiagnoseVirtualNetworkResultInner.findings = findings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnoseVirtualNetworkResultInner;
        });
    }
}
