// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * StaticSiteBasicAuthPropertiesARMResource resource specific properties.
 */
@Fluent
public final class StaticSiteBasicAuthPropertiesArmResourceProperties
    implements JsonSerializable<StaticSiteBasicAuthPropertiesArmResourceProperties> {
    /*
     * The password for basic auth.
     */
    private String password;

    /*
     * Url to the secret in Key Vault.
     */
    private String secretUrl;

    /*
     * State indicating if basic auth is enabled and for what environments it is active.
     */
    private String applicableEnvironmentsMode;

    /*
     * The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is set to SpecifiedEnvironments.
     */
    private List<String> environments;

    /*
     * State indicating if basic auth has a secret and what type it is.
     */
    private String secretState;

    /**
     * Creates an instance of StaticSiteBasicAuthPropertiesArmResourceProperties class.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties() {
    }

    /**
     * Get the password property: The password for basic auth.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for basic auth.
     * 
     * @param password the password value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the secretUrl property: Url to the secret in Key Vault.
     * 
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: Url to the secret in Key Vault.
     * 
     * @param secretUrl the secretUrl value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the applicableEnvironmentsMode property: State indicating if basic auth is enabled and for what environments
     * it is active.
     * 
     * @return the applicableEnvironmentsMode value.
     */
    public String applicableEnvironmentsMode() {
        return this.applicableEnvironmentsMode;
    }

    /**
     * Set the applicableEnvironmentsMode property: State indicating if basic auth is enabled and for what environments
     * it is active.
     * 
     * @param applicableEnvironmentsMode the applicableEnvironmentsMode value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties
        withApplicableEnvironmentsMode(String applicableEnvironmentsMode) {
        this.applicableEnvironmentsMode = applicableEnvironmentsMode;
        return this;
    }

    /**
     * Get the environments property: The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is
     * set to SpecifiedEnvironments.
     * 
     * @return the environments value.
     */
    public List<String> environments() {
        return this.environments;
    }

    /**
     * Set the environments property: The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is
     * set to SpecifiedEnvironments.
     * 
     * @param environments the environments value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withEnvironments(List<String> environments) {
        this.environments = environments;
        return this;
    }

    /**
     * Get the secretState property: State indicating if basic auth has a secret and what type it is.
     * 
     * @return the secretState value.
     */
    public String secretState() {
        return this.secretState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicableEnvironmentsMode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property applicableEnvironmentsMode in model StaticSiteBasicAuthPropertiesArmResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(StaticSiteBasicAuthPropertiesArmResourceProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("applicableEnvironmentsMode", this.applicableEnvironmentsMode);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("secretUrl", this.secretUrl);
        jsonWriter.writeArrayField("environments", this.environments, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteBasicAuthPropertiesArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteBasicAuthPropertiesArmResourceProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteBasicAuthPropertiesArmResourceProperties.
     */
    public static StaticSiteBasicAuthPropertiesArmResourceProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteBasicAuthPropertiesArmResourceProperties deserializedStaticSiteBasicAuthPropertiesArmResourceProperties
                = new StaticSiteBasicAuthPropertiesArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicableEnvironmentsMode".equals(fieldName)) {
                    deserializedStaticSiteBasicAuthPropertiesArmResourceProperties.applicableEnvironmentsMode
                        = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedStaticSiteBasicAuthPropertiesArmResourceProperties.password = reader.getString();
                } else if ("secretUrl".equals(fieldName)) {
                    deserializedStaticSiteBasicAuthPropertiesArmResourceProperties.secretUrl = reader.getString();
                } else if ("environments".equals(fieldName)) {
                    List<String> environments = reader.readArray(reader1 -> reader1.getString());
                    deserializedStaticSiteBasicAuthPropertiesArmResourceProperties.environments = environments;
                } else if ("secretState".equals(fieldName)) {
                    deserializedStaticSiteBasicAuthPropertiesArmResourceProperties.secretState = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteBasicAuthPropertiesArmResourceProperties;
        });
    }
}
