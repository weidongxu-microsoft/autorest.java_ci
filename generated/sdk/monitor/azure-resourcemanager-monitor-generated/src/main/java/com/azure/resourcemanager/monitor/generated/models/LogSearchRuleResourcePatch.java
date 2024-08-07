// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRulePatch;
import java.io.IOException;
import java.util.Map;

/**
 * The log search rule resource for patch operations.
 */
@Fluent
public final class LogSearchRuleResourcePatch implements JsonSerializable<LogSearchRuleResourcePatch> {
    /*
     * Resource tags
     */
    private Map<String, String> tags;

    /*
     * The log search rule properties of the resource.
     */
    private LogSearchRulePatch innerProperties;

    /**
     * Creates an instance of LogSearchRuleResourcePatch class.
     */
    public LogSearchRuleResourcePatch() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the LogSearchRuleResourcePatch object itself.
     */
    public LogSearchRuleResourcePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The log search rule properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private LogSearchRulePatch innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     * 
     * @return the enabled value.
     */
    public Enabled enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     * 
     * @param enabled the enabled value to set.
     * @return the LogSearchRuleResourcePatch object itself.
     */
    public LogSearchRuleResourcePatch withEnabled(Enabled enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogSearchRulePatch();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogSearchRuleResourcePatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogSearchRuleResourcePatch if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogSearchRuleResourcePatch.
     */
    public static LogSearchRuleResourcePatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogSearchRuleResourcePatch deserializedLogSearchRuleResourcePatch = new LogSearchRuleResourcePatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedLogSearchRuleResourcePatch.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedLogSearchRuleResourcePatch.innerProperties = LogSearchRulePatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogSearchRuleResourcePatch;
        });
    }
}
