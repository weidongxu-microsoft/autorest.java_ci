// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A CNAME record.
 */
@Fluent
public final class CnameRecord implements JsonSerializable<CnameRecord> {
    /*
     * The canonical name for this CNAME record.
     */
    private String cname;

    /**
     * Creates an instance of CnameRecord class.
     */
    public CnameRecord() {
    }

    /**
     * Get the cname property: The canonical name for this CNAME record.
     * 
     * @return the cname value.
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Set the cname property: The canonical name for this CNAME record.
     * 
     * @param cname the cname value to set.
     * @return the CnameRecord object itself.
     */
    public CnameRecord withCname(String cname) {
        this.cname = cname;
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
        jsonWriter.writeStringField("cname", this.cname);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CnameRecord from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CnameRecord if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CnameRecord.
     */
    public static CnameRecord fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CnameRecord deserializedCnameRecord = new CnameRecord();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cname".equals(fieldName)) {
                    deserializedCnameRecord.cname = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCnameRecord;
        });
    }
}
