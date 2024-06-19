// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Functions host level keys.
 */
@Fluent
public final class HostKeysInner implements JsonSerializable<HostKeysInner> {
    /*
     * Secret key.
     */
    private String masterKey;

    /*
     * Host level function keys.
     */
    private Map<String, String> functionKeys;

    /*
     * System keys.
     */
    private Map<String, String> systemKeys;

    /**
     * Creates an instance of HostKeysInner class.
     */
    public HostKeysInner() {
    }

    /**
     * Get the masterKey property: Secret key.
     * 
     * @return the masterKey value.
     */
    public String masterKey() {
        return this.masterKey;
    }

    /**
     * Set the masterKey property: Secret key.
     * 
     * @param masterKey the masterKey value to set.
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withMasterKey(String masterKey) {
        this.masterKey = masterKey;
        return this;
    }

    /**
     * Get the functionKeys property: Host level function keys.
     * 
     * @return the functionKeys value.
     */
    public Map<String, String> functionKeys() {
        return this.functionKeys;
    }

    /**
     * Set the functionKeys property: Host level function keys.
     * 
     * @param functionKeys the functionKeys value to set.
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withFunctionKeys(Map<String, String> functionKeys) {
        this.functionKeys = functionKeys;
        return this;
    }

    /**
     * Get the systemKeys property: System keys.
     * 
     * @return the systemKeys value.
     */
    public Map<String, String> systemKeys() {
        return this.systemKeys;
    }

    /**
     * Set the systemKeys property: System keys.
     * 
     * @param systemKeys the systemKeys value to set.
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withSystemKeys(Map<String, String> systemKeys) {
        this.systemKeys = systemKeys;
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
        jsonWriter.writeStringField("masterKey", this.masterKey);
        jsonWriter.writeMapField("functionKeys", this.functionKeys, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("systemKeys", this.systemKeys, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HostKeysInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HostKeysInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HostKeysInner.
     */
    public static HostKeysInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HostKeysInner deserializedHostKeysInner = new HostKeysInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("masterKey".equals(fieldName)) {
                    deserializedHostKeysInner.masterKey = reader.getString();
                } else if ("functionKeys".equals(fieldName)) {
                    Map<String, String> functionKeys = reader.readMap(reader1 -> reader1.getString());
                    deserializedHostKeysInner.functionKeys = functionKeys;
                } else if ("systemKeys".equals(fieldName)) {
                    Map<String, String> systemKeys = reader.readMap(reader1 -> reader1.getString());
                    deserializedHostKeysInner.systemKeys = systemKeys;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHostKeysInner;
        });
    }
}
