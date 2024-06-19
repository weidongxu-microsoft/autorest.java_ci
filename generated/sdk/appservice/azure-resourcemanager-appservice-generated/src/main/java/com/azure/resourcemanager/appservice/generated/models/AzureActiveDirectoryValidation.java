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
import java.util.List;

/**
 * The configuration settings of the Azure Active Directory token validation flow.
 */
@Fluent
public final class AzureActiveDirectoryValidation implements JsonSerializable<AzureActiveDirectoryValidation> {
    /*
     * The configuration settings of the checks that should be made while validating the JWT Claims.
     */
    private JwtClaimChecks jwtClaimChecks;

    /*
     * The list of audiences that can make successful authentication/authorization requests.
     */
    private List<String> allowedAudiences;

    /*
     * The configuration settings of the default authorization policy.
     */
    private DefaultAuthorizationPolicy defaultAuthorizationPolicy;

    /**
     * Creates an instance of AzureActiveDirectoryValidation class.
     */
    public AzureActiveDirectoryValidation() {
    }

    /**
     * Get the jwtClaimChecks property: The configuration settings of the checks that should be made while validating
     * the JWT Claims.
     * 
     * @return the jwtClaimChecks value.
     */
    public JwtClaimChecks jwtClaimChecks() {
        return this.jwtClaimChecks;
    }

    /**
     * Set the jwtClaimChecks property: The configuration settings of the checks that should be made while validating
     * the JWT Claims.
     * 
     * @param jwtClaimChecks the jwtClaimChecks value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withJwtClaimChecks(JwtClaimChecks jwtClaimChecks) {
        this.jwtClaimChecks = jwtClaimChecks;
        return this;
    }

    /**
     * Get the allowedAudiences property: The list of audiences that can make successful authentication/authorization
     * requests.
     * 
     * @return the allowedAudiences value.
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences property: The list of audiences that can make successful authentication/authorization
     * requests.
     * 
     * @param allowedAudiences the allowedAudiences value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
        return this;
    }

    /**
     * Get the defaultAuthorizationPolicy property: The configuration settings of the default authorization policy.
     * 
     * @return the defaultAuthorizationPolicy value.
     */
    public DefaultAuthorizationPolicy defaultAuthorizationPolicy() {
        return this.defaultAuthorizationPolicy;
    }

    /**
     * Set the defaultAuthorizationPolicy property: The configuration settings of the default authorization policy.
     * 
     * @param defaultAuthorizationPolicy the defaultAuthorizationPolicy value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation
        withDefaultAuthorizationPolicy(DefaultAuthorizationPolicy defaultAuthorizationPolicy) {
        this.defaultAuthorizationPolicy = defaultAuthorizationPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jwtClaimChecks() != null) {
            jwtClaimChecks().validate();
        }
        if (defaultAuthorizationPolicy() != null) {
            defaultAuthorizationPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("jwtClaimChecks", this.jwtClaimChecks);
        jsonWriter.writeArrayField("allowedAudiences", this.allowedAudiences,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("defaultAuthorizationPolicy", this.defaultAuthorizationPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureActiveDirectoryValidation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureActiveDirectoryValidation if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureActiveDirectoryValidation.
     */
    public static AzureActiveDirectoryValidation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureActiveDirectoryValidation deserializedAzureActiveDirectoryValidation
                = new AzureActiveDirectoryValidation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jwtClaimChecks".equals(fieldName)) {
                    deserializedAzureActiveDirectoryValidation.jwtClaimChecks = JwtClaimChecks.fromJson(reader);
                } else if ("allowedAudiences".equals(fieldName)) {
                    List<String> allowedAudiences = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureActiveDirectoryValidation.allowedAudiences = allowedAudiences;
                } else if ("defaultAuthorizationPolicy".equals(fieldName)) {
                    deserializedAzureActiveDirectoryValidation.defaultAuthorizationPolicy
                        = DefaultAuthorizationPolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureActiveDirectoryValidation;
        });
    }
}
