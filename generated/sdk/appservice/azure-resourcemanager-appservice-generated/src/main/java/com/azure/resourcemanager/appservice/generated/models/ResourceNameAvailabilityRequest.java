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
 * Resource name availability request content.
 */
@Fluent
public final class ResourceNameAvailabilityRequest implements JsonSerializable<ResourceNameAvailabilityRequest> {
    /*
     * Resource name to verify.
     */
    private String name;

    /*
     * Resource type used for verification.
     */
    private CheckNameResourceTypes type;

    /*
     * Is fully qualified domain name.
     */
    private Boolean isFqdn;

    /*
     * Azure Resource Manager ID of the customer's selected Container Apps Environment on which to host the Function
     * app. This must be of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.App/managedEnvironments/{
     * managedEnvironmentName}
     */
    private String environmentId;

    /**
     * Creates an instance of ResourceNameAvailabilityRequest class.
     */
    public ResourceNameAvailabilityRequest() {
    }

    /**
     * Get the name property: Resource name to verify.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     * 
     * @param name the name value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     * 
     * @return the type value.
     */
    public CheckNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     * 
     * @param type the type value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withType(CheckNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isFqdn property: Is fully qualified domain name.
     * 
     * @return the isFqdn value.
     */
    public Boolean isFqdn() {
        return this.isFqdn;
    }

    /**
     * Set the isFqdn property: Is fully qualified domain name.
     * 
     * @param isFqdn the isFqdn value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withIsFqdn(Boolean isFqdn) {
        this.isFqdn = isFqdn;
        return this;
    }

    /**
     * Get the environmentId property: Azure Resource Manager ID of the customer's selected Container Apps Environment
     * on which to host the Function app. This must be of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.App/managedEnvironments/{managedEnvironmentName}.
     * 
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: Azure Resource Manager ID of the customer's selected Container Apps Environment
     * on which to host the Function app. This must be of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.App/managedEnvironments/{managedEnvironmentName}.
     * 
     * @param environmentId the environmentId value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
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
                .log(new IllegalArgumentException(
                    "Missing required property name in model ResourceNameAvailabilityRequest"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property type in model ResourceNameAvailabilityRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceNameAvailabilityRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeBooleanField("isFqdn", this.isFqdn);
        jsonWriter.writeStringField("environmentId", this.environmentId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceNameAvailabilityRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceNameAvailabilityRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceNameAvailabilityRequest.
     */
    public static ResourceNameAvailabilityRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceNameAvailabilityRequest deserializedResourceNameAvailabilityRequest
                = new ResourceNameAvailabilityRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedResourceNameAvailabilityRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedResourceNameAvailabilityRequest.type
                        = CheckNameResourceTypes.fromString(reader.getString());
                } else if ("isFqdn".equals(fieldName)) {
                    deserializedResourceNameAvailabilityRequest.isFqdn = reader.getNullable(JsonReader::getBoolean);
                } else if ("environmentId".equals(fieldName)) {
                    deserializedResourceNameAvailabilityRequest.environmentId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceNameAvailabilityRequest;
        });
    }
}
