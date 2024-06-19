// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ExperimentUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Defines modifiable attributes of an Experiment.
 */
@Fluent
public final class ExperimentUpdateModel implements JsonSerializable<ExperimentUpdateModel> {
    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * The properties of a Profile
     */
    private ExperimentUpdateProperties innerProperties;

    /**
     * Creates an instance of ExperimentUpdateModel class.
     */
    public ExperimentUpdateModel() {
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
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of a Profile.
     * 
     * @return the innerProperties value.
     */
    private ExperimentUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: The description of the intent or details of the Experiment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the intent or details of the Experiment.
     * 
     * @param description the description value to set.
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     * 
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     * 
     * @param enabledState the enabledState value to set.
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withEnabledState(State enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExperimentUpdateProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
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
     * Reads an instance of ExperimentUpdateModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentUpdateModel if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExperimentUpdateModel.
     */
    public static ExperimentUpdateModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExperimentUpdateModel deserializedExperimentUpdateModel = new ExperimentUpdateModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedExperimentUpdateModel.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedExperimentUpdateModel.innerProperties = ExperimentUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExperimentUpdateModel;
        });
    }
}
