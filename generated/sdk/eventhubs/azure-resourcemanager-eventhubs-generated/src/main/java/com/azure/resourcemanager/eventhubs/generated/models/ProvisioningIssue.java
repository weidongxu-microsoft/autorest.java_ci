// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes Provisioning issue for given NetworkSecurityPerimeterConfiguration.
 */
@Fluent
public final class ProvisioningIssue implements JsonSerializable<ProvisioningIssue> {
    /*
     * Name of the issue
     */
    private String name;

    /*
     * Properties of Provisioning Issue
     */
    private ProvisioningIssueProperties properties;

    /**
     * Creates an instance of ProvisioningIssue class.
     */
    public ProvisioningIssue() {
    }

    /**
     * Get the name property: Name of the issue.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the issue.
     * 
     * @param name the name value to set.
     * @return the ProvisioningIssue object itself.
     */
    public ProvisioningIssue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of Provisioning Issue.
     * 
     * @return the properties value.
     */
    public ProvisioningIssueProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisioningIssue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisioningIssue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProvisioningIssue.
     */
    public static ProvisioningIssue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisioningIssue deserializedProvisioningIssue = new ProvisioningIssue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedProvisioningIssue.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedProvisioningIssue.properties = ProvisioningIssueProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisioningIssue;
        });
    }
}
