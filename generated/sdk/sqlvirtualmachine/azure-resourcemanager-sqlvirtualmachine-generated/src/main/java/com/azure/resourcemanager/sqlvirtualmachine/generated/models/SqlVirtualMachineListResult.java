// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models.SqlVirtualMachineInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of SQL virtual machines.
 */
@Immutable
public final class SqlVirtualMachineListResult implements JsonSerializable<SqlVirtualMachineListResult> {
    /*
     * Array of results.
     */
    private List<SqlVirtualMachineInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SqlVirtualMachineListResult class.
     */
    public SqlVirtualMachineListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<SqlVirtualMachineInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlVirtualMachineListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlVirtualMachineListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlVirtualMachineListResult.
     */
    public static SqlVirtualMachineListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlVirtualMachineListResult deserializedSqlVirtualMachineListResult = new SqlVirtualMachineListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SqlVirtualMachineInner> value
                        = reader.readArray(reader1 -> SqlVirtualMachineInner.fromJson(reader1));
                    deserializedSqlVirtualMachineListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSqlVirtualMachineListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlVirtualMachineListResult;
        });
    }
}
