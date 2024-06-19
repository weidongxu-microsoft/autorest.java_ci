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
import java.util.List;

/**
 * Class representing data source used by the detectors.
 */
@Fluent
public final class DataSource implements JsonSerializable<DataSource> {
    /*
     * Instructions if any for the data source
     */
    private List<String> instructions;

    /*
     * Datasource Uri Links
     */
    private List<NameValuePair> dataSourceUri;

    /**
     * Creates an instance of DataSource class.
     */
    public DataSource() {
    }

    /**
     * Get the instructions property: Instructions if any for the data source.
     * 
     * @return the instructions value.
     */
    public List<String> instructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: Instructions if any for the data source.
     * 
     * @param instructions the instructions value to set.
     * @return the DataSource object itself.
     */
    public DataSource withInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the dataSourceUri property: Datasource Uri Links.
     * 
     * @return the dataSourceUri value.
     */
    public List<NameValuePair> dataSourceUri() {
        return this.dataSourceUri;
    }

    /**
     * Set the dataSourceUri property: Datasource Uri Links.
     * 
     * @param dataSourceUri the dataSourceUri value to set.
     * @return the DataSource object itself.
     */
    public DataSource withDataSourceUri(List<NameValuePair> dataSourceUri) {
        this.dataSourceUri = dataSourceUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataSourceUri() != null) {
            dataSourceUri().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("instructions", this.instructions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("dataSourceUri", this.dataSourceUri, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataSource if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the DataSource.
     */
    public static DataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataSource deserializedDataSource = new DataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instructions".equals(fieldName)) {
                    List<String> instructions = reader.readArray(reader1 -> reader1.getString());
                    deserializedDataSource.instructions = instructions;
                } else if ("dataSourceUri".equals(fieldName)) {
                    List<NameValuePair> dataSourceUri = reader.readArray(reader1 -> NameValuePair.fromJson(reader1));
                    deserializedDataSource.dataSourceUri = dataSourceUri;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataSource;
        });
    }
}
