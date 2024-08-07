// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Deployment on error behavior with additional details.
 */
@Fluent
public final class OnErrorDeploymentExtended implements JsonSerializable<OnErrorDeploymentExtended> {
    /*
     * The state of the provisioning for the on error deployment.
     */
    private String provisioningState;

    /*
     * The deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment.
     */
    private OnErrorDeploymentType type;

    /*
     * The deployment to be used on error case.
     */
    private String deploymentName;

    /**
     * Creates an instance of OnErrorDeploymentExtended class.
     */
    public OnErrorDeploymentExtended() {
    }

    /**
     * Get the provisioningState property: The state of the provisioning for the on error deployment.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the type property: The deployment on error behavior type. Possible values are LastSuccessful and
     * SpecificDeployment.
     * 
     * @return the type value.
     */
    public OnErrorDeploymentType type() {
        return this.type;
    }

    /**
     * Set the type property: The deployment on error behavior type. Possible values are LastSuccessful and
     * SpecificDeployment.
     * 
     * @param type the type value to set.
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended withType(OnErrorDeploymentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the deploymentName property: The deployment to be used on error case.
     * 
     * @return the deploymentName value.
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The deployment to be used on error case.
     * 
     * @param deploymentName the deploymentName value to set.
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("deploymentName", this.deploymentName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnErrorDeploymentExtended from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnErrorDeploymentExtended if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OnErrorDeploymentExtended.
     */
    public static OnErrorDeploymentExtended fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OnErrorDeploymentExtended deserializedOnErrorDeploymentExtended = new OnErrorDeploymentExtended();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedOnErrorDeploymentExtended.provisioningState = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOnErrorDeploymentExtended.type = OnErrorDeploymentType.fromString(reader.getString());
                } else if ("deploymentName".equals(fieldName)) {
                    deserializedOnErrorDeploymentExtended.deploymentName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOnErrorDeploymentExtended;
        });
    }
}
