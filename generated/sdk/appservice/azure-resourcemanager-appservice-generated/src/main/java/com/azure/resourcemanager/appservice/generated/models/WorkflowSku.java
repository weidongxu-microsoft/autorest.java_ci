// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The sku type.
 */
@Fluent
public final class WorkflowSku implements JsonSerializable<WorkflowSku> {
    /*
     * The name.
     */
    private WorkflowSkuName name;

    /*
     * The reference to plan.
     */
    private ResourceReference plan;

    /**
     * Creates an instance of WorkflowSku class.
     */
    public WorkflowSku() {
    }

    /**
     * Get the name property: The name.
     * 
     * @return the name value.
     */
    public WorkflowSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     * 
     * @param name the name value to set.
     * @return the WorkflowSku object itself.
     */
    public WorkflowSku withName(WorkflowSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the plan property: The reference to plan.
     * 
     * @return the plan value.
     */
    public ResourceReference plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The reference to plan.
     * 
     * @param plan the plan value to set.
     * @return the WorkflowSku object itself.
     */
    public WorkflowSku withPlan(ResourceReference plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model WorkflowSku"));
        }
        if (plan() != null) {
            plan().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkflowSku.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeJsonField("plan", this.plan);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkflowSku.
     */
    public static WorkflowSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowSku deserializedWorkflowSku = new WorkflowSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedWorkflowSku.name = WorkflowSkuName.fromString(reader.getString());
                } else if ("plan".equals(fieldName)) {
                    deserializedWorkflowSku.plan = ResourceReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowSku;
        });
    }
}
