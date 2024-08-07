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

/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 */
@Fluent
public final class AutoHealActions implements JsonSerializable<AutoHealActions> {
    /*
     * Predefined action to be taken.
     */
    private AutoHealActionType actionType;

    /*
     * Custom action to be taken.
     */
    private AutoHealCustomAction customAction;

    /*
     * Minimum time the process must execute
     * before taking the action
     */
    private String minProcessExecutionTime;

    /**
     * Creates an instance of AutoHealActions class.
     */
    public AutoHealActions() {
    }

    /**
     * Get the actionType property: Predefined action to be taken.
     * 
     * @return the actionType value.
     */
    public AutoHealActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Predefined action to be taken.
     * 
     * @param actionType the actionType value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withActionType(AutoHealActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the customAction property: Custom action to be taken.
     * 
     * @return the customAction value.
     */
    public AutoHealCustomAction customAction() {
        return this.customAction;
    }

    /**
     * Set the customAction property: Custom action to be taken.
     * 
     * @param customAction the customAction value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withCustomAction(AutoHealCustomAction customAction) {
        this.customAction = customAction;
        return this;
    }

    /**
     * Get the minProcessExecutionTime property: Minimum time the process must execute
     * before taking the action.
     * 
     * @return the minProcessExecutionTime value.
     */
    public String minProcessExecutionTime() {
        return this.minProcessExecutionTime;
    }

    /**
     * Set the minProcessExecutionTime property: Minimum time the process must execute
     * before taking the action.
     * 
     * @param minProcessExecutionTime the minProcessExecutionTime value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withMinProcessExecutionTime(String minProcessExecutionTime) {
        this.minProcessExecutionTime = minProcessExecutionTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customAction() != null) {
            customAction().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("actionType", this.actionType == null ? null : this.actionType.toString());
        jsonWriter.writeJsonField("customAction", this.customAction);
        jsonWriter.writeStringField("minProcessExecutionTime", this.minProcessExecutionTime);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoHealActions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoHealActions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutoHealActions.
     */
    public static AutoHealActions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoHealActions deserializedAutoHealActions = new AutoHealActions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionType".equals(fieldName)) {
                    deserializedAutoHealActions.actionType = AutoHealActionType.fromString(reader.getString());
                } else if ("customAction".equals(fieldName)) {
                    deserializedAutoHealActions.customAction = AutoHealCustomAction.fromJson(reader);
                } else if ("minProcessExecutionTime".equals(fieldName)) {
                    deserializedAutoHealActions.minProcessExecutionTime = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoHealActions;
        });
    }
}
