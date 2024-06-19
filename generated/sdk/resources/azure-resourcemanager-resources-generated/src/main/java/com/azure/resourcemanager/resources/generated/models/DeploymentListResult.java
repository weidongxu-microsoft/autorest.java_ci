// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExtendedInner;
import java.io.IOException;
import java.util.List;

/**
 * List of deployments.
 */
@Fluent
public final class DeploymentListResult implements JsonSerializable<DeploymentListResult> {
    /*
     * An array of deployments.
     */
    private List<DeploymentExtendedInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of DeploymentListResult class.
     */
    public DeploymentListResult() {
    }

    /**
     * Get the value property: An array of deployments.
     * 
     * @return the value value.
     */
    public List<DeploymentExtendedInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of deployments.
     * 
     * @param value the value value to set.
     * @return the DeploymentListResult object itself.
     */
    public DeploymentListResult withValue(List<DeploymentExtendedInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentListResult.
     */
    public static DeploymentListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentListResult deserializedDeploymentListResult = new DeploymentListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DeploymentExtendedInner> value
                        = reader.readArray(reader1 -> DeploymentExtendedInner.fromJson(reader1));
                    deserializedDeploymentListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDeploymentListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentListResult;
        });
    }
}
