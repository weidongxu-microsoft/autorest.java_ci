// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about the number of virtual machine instances in each upgrade state.
 */
@Immutable
public final class RollingUpgradeProgressInfo implements JsonSerializable<RollingUpgradeProgressInfo> {
    /*
     * The number of instances that have been successfully upgraded.
     */
    private Integer successfulInstanceCount;

    /*
     * The number of instances that have failed to be upgraded successfully.
     */
    private Integer failedInstanceCount;

    /*
     * The number of instances that are currently being upgraded.
     */
    private Integer inProgressInstanceCount;

    /*
     * The number of instances that have not yet begun to be upgraded.
     */
    private Integer pendingInstanceCount;

    /**
     * Creates an instance of RollingUpgradeProgressInfo class.
     */
    public RollingUpgradeProgressInfo() {
    }

    /**
     * Get the successfulInstanceCount property: The number of instances that have been successfully upgraded.
     * 
     * @return the successfulInstanceCount value.
     */
    public Integer successfulInstanceCount() {
        return this.successfulInstanceCount;
    }

    /**
     * Get the failedInstanceCount property: The number of instances that have failed to be upgraded successfully.
     * 
     * @return the failedInstanceCount value.
     */
    public Integer failedInstanceCount() {
        return this.failedInstanceCount;
    }

    /**
     * Get the inProgressInstanceCount property: The number of instances that are currently being upgraded.
     * 
     * @return the inProgressInstanceCount value.
     */
    public Integer inProgressInstanceCount() {
        return this.inProgressInstanceCount;
    }

    /**
     * Get the pendingInstanceCount property: The number of instances that have not yet begun to be upgraded.
     * 
     * @return the pendingInstanceCount value.
     */
    public Integer pendingInstanceCount() {
        return this.pendingInstanceCount;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RollingUpgradeProgressInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RollingUpgradeProgressInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RollingUpgradeProgressInfo.
     */
    public static RollingUpgradeProgressInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RollingUpgradeProgressInfo deserializedRollingUpgradeProgressInfo = new RollingUpgradeProgressInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("successfulInstanceCount".equals(fieldName)) {
                    deserializedRollingUpgradeProgressInfo.successfulInstanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("failedInstanceCount".equals(fieldName)) {
                    deserializedRollingUpgradeProgressInfo.failedInstanceCount = reader.getNullable(JsonReader::getInt);
                } else if ("inProgressInstanceCount".equals(fieldName)) {
                    deserializedRollingUpgradeProgressInfo.inProgressInstanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("pendingInstanceCount".equals(fieldName)) {
                    deserializedRollingUpgradeProgressInfo.pendingInstanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRollingUpgradeProgressInfo;
        });
    }
}
