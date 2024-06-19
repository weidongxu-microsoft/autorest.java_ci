// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Execution context of the storage task assignment.
 */
@Fluent
public final class StorageTaskAssignmentExecutionContext
    implements JsonSerializable<StorageTaskAssignmentExecutionContext> {
    /*
     * Execution target of the storage task assignment
     */
    private ExecutionTarget target;

    /*
     * Execution trigger of the storage task assignment
     */
    private ExecutionTrigger trigger;

    /**
     * Creates an instance of StorageTaskAssignmentExecutionContext class.
     */
    public StorageTaskAssignmentExecutionContext() {
    }

    /**
     * Get the target property: Execution target of the storage task assignment.
     * 
     * @return the target value.
     */
    public ExecutionTarget target() {
        return this.target;
    }

    /**
     * Set the target property: Execution target of the storage task assignment.
     * 
     * @param target the target value to set.
     * @return the StorageTaskAssignmentExecutionContext object itself.
     */
    public StorageTaskAssignmentExecutionContext withTarget(ExecutionTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get the trigger property: Execution trigger of the storage task assignment.
     * 
     * @return the trigger value.
     */
    public ExecutionTrigger trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Execution trigger of the storage task assignment.
     * 
     * @param trigger the trigger value to set.
     * @return the StorageTaskAssignmentExecutionContext object itself.
     */
    public StorageTaskAssignmentExecutionContext withTrigger(ExecutionTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
        if (trigger() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property trigger in model StorageTaskAssignmentExecutionContext"));
        } else {
            trigger().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageTaskAssignmentExecutionContext.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("trigger", this.trigger);
        jsonWriter.writeJsonField("target", this.target);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageTaskAssignmentExecutionContext from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskAssignmentExecutionContext if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageTaskAssignmentExecutionContext.
     */
    public static StorageTaskAssignmentExecutionContext fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskAssignmentExecutionContext deserializedStorageTaskAssignmentExecutionContext
                = new StorageTaskAssignmentExecutionContext();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trigger".equals(fieldName)) {
                    deserializedStorageTaskAssignmentExecutionContext.trigger = ExecutionTrigger.fromJson(reader);
                } else if ("target".equals(fieldName)) {
                    deserializedStorageTaskAssignmentExecutionContext.target = ExecutionTarget.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskAssignmentExecutionContext;
        });
    }
}
