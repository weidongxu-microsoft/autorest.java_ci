// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages and
 * on resource's non-compliant compliance results.
 */
@Fluent
public final class NonComplianceMessage implements JsonSerializable<NonComplianceMessage> {
    /*
     * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages
     * and on resource's non-compliant compliance results.
     */
    private String message;

    /*
     * The policy definition reference ID within a policy set definition the message is intended for. This is only
     * applicable if the policy assignment assigns a policy set definition. If this is not provided the message applies
     * to all policies assigned by this policy assignment.
     */
    private String policyDefinitionReferenceId;

    /**
     * Creates an instance of NonComplianceMessage class.
     */
    public NonComplianceMessage() {
    }

    /**
     * Get the message property: A message that describes why a resource is non-compliant with the policy. This is shown
     * in 'deny' error messages and on resource's non-compliant compliance results.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message that describes why a resource is non-compliant with the policy. This is shown
     * in 'deny' error messages and on resource's non-compliant compliance results.
     * 
     * @param message the message value to set.
     * @return the NonComplianceMessage object itself.
     */
    public NonComplianceMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The policy definition reference ID within a policy set definition
     * the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If
     * this is not provided the message applies to all policies assigned by this policy assignment.
     * 
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: The policy definition reference ID within a policy set definition
     * the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If
     * this is not provided the message applies to all policies assigned by this policy assignment.
     * 
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the NonComplianceMessage object itself.
     */
    public NonComplianceMessage withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (message() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property message in model NonComplianceMessage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NonComplianceMessage.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("policyDefinitionReferenceId", this.policyDefinitionReferenceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NonComplianceMessage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NonComplianceMessage if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NonComplianceMessage.
     */
    public static NonComplianceMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NonComplianceMessage deserializedNonComplianceMessage = new NonComplianceMessage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("message".equals(fieldName)) {
                    deserializedNonComplianceMessage.message = reader.getString();
                } else if ("policyDefinitionReferenceId".equals(fieldName)) {
                    deserializedNonComplianceMessage.policyDefinitionReferenceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNonComplianceMessage;
        });
    }
}
