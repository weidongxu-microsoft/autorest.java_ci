// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * General metadata for the parameter.
 */
@Fluent
public final class ParameterDefinitionsValueMetadata implements JsonSerializable<ParameterDefinitionsValueMetadata> {
    /*
     * The display name for the parameter.
     */
    private String displayName;

    /*
     * The description of the parameter.
     */
    private String description;

    /*
     * Used when assigning the policy definition through the portal. Provides a context aware list of values for the
     * user to choose from.
     */
    private String strongType;

    /*
     * Set to true to have Azure portal create role assignments on the resource ID or resource scope value of this
     * parameter during policy assignment. This property is useful in case you wish to assign permissions outside the
     * assignment scope.
     */
    private Boolean assignPermissions;

    /*
     * General metadata for the parameter.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of ParameterDefinitionsValueMetadata class.
     */
    public ParameterDefinitionsValueMetadata() {
    }

    /**
     * Get the displayName property: The display name for the parameter.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the parameter.
     * 
     * @param displayName the displayName value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the parameter.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the parameter.
     * 
     * @param description the description value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the strongType property: Used when assigning the policy definition through the portal. Provides a context
     * aware list of values for the user to choose from.
     * 
     * @return the strongType value.
     */
    public String strongType() {
        return this.strongType;
    }

    /**
     * Set the strongType property: Used when assigning the policy definition through the portal. Provides a context
     * aware list of values for the user to choose from.
     * 
     * @param strongType the strongType value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withStrongType(String strongType) {
        this.strongType = strongType;
        return this;
    }

    /**
     * Get the assignPermissions property: Set to true to have Azure portal create role assignments on the resource ID
     * or resource scope value of this parameter during policy assignment. This property is useful in case you wish to
     * assign permissions outside the assignment scope.
     * 
     * @return the assignPermissions value.
     */
    public Boolean assignPermissions() {
        return this.assignPermissions;
    }

    /**
     * Set the assignPermissions property: Set to true to have Azure portal create role assignments on the resource ID
     * or resource scope value of this parameter during policy assignment. This property is useful in case you wish to
     * assign permissions outside the assignment scope.
     * 
     * @param assignPermissions the assignPermissions value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withAssignPermissions(Boolean assignPermissions) {
        this.assignPermissions = assignPermissions;
        return this;
    }

    /**
     * Get the additionalProperties property: General metadata for the parameter.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: General metadata for the parameter.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ParameterDefinitionsValueMetadata object itself.
     */
    public ParameterDefinitionsValueMetadata withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("strongType", this.strongType);
        jsonWriter.writeBooleanField("assignPermissions", this.assignPermissions);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParameterDefinitionsValueMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParameterDefinitionsValueMetadata if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParameterDefinitionsValueMetadata.
     */
    public static ParameterDefinitionsValueMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParameterDefinitionsValueMetadata deserializedParameterDefinitionsValueMetadata
                = new ParameterDefinitionsValueMetadata();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedParameterDefinitionsValueMetadata.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedParameterDefinitionsValueMetadata.description = reader.getString();
                } else if ("strongType".equals(fieldName)) {
                    deserializedParameterDefinitionsValueMetadata.strongType = reader.getString();
                } else if ("assignPermissions".equals(fieldName)) {
                    deserializedParameterDefinitionsValueMetadata.assignPermissions
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedParameterDefinitionsValueMetadata.additionalProperties = additionalProperties;

            return deserializedParameterDefinitionsValueMetadata;
        });
    }
}
