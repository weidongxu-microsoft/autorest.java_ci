// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Contains all settings for the cluster.
 */
@Fluent
public final class ClusterQuotaConfigurationPropertiesInner
    implements JsonSerializable<ClusterQuotaConfigurationPropertiesInner> {
    /*
     * All possible Cluster settings - a collection of key/value paired settings which apply to quotas and
     * configurations imposed on the cluster.
     */
    private Map<String, String> settings;

    /**
     * Creates an instance of ClusterQuotaConfigurationPropertiesInner class.
     */
    public ClusterQuotaConfigurationPropertiesInner() {
    }

    /**
     * Get the settings property: All possible Cluster settings - a collection of key/value paired settings which apply
     * to quotas and configurations imposed on the cluster.
     * 
     * @return the settings value.
     */
    public Map<String, String> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: All possible Cluster settings - a collection of key/value paired settings which apply
     * to quotas and configurations imposed on the cluster.
     * 
     * @param settings the settings value to set.
     * @return the ClusterQuotaConfigurationPropertiesInner object itself.
     */
    public ClusterQuotaConfigurationPropertiesInner withSettings(Map<String, String> settings) {
        this.settings = settings;
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
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterQuotaConfigurationPropertiesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterQuotaConfigurationPropertiesInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterQuotaConfigurationPropertiesInner.
     */
    public static ClusterQuotaConfigurationPropertiesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterQuotaConfigurationPropertiesInner deserializedClusterQuotaConfigurationPropertiesInner
                = new ClusterQuotaConfigurationPropertiesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("settings".equals(fieldName)) {
                    Map<String, String> settings = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterQuotaConfigurationPropertiesInner.settings = settings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterQuotaConfigurationPropertiesInner;
        });
    }
}
