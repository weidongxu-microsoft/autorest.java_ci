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
 * The configuration settings of the platform of App Service Authentication/Authorization.
 */
@Fluent
public final class AuthPlatform implements JsonSerializable<AuthPlatform> {
    /*
     * <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise,
     * <code>false</code>.
     */
    private Boolean enabled;

    /*
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization
     * module.
     */
    private String runtimeVersion;

    /*
     * The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     */
    private String configFilePath;

    /**
     * Creates an instance of AuthPlatform class.
     */
    public AuthPlatform() {
    }

    /**
     * Get the enabled property: &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled
     * for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled
     * for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the runtimeVersion property: The RuntimeVersion of the Authentication / Authorization feature in use for the
     * current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization
     * module.
     * 
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: The RuntimeVersion of the Authentication / Authorization feature in use for the
     * current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization
     * module.
     * 
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the configFilePath property: The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     * 
     * @return the configFilePath value.
     */
    public String configFilePath() {
        return this.configFilePath;
    }

    /**
     * Set the configFilePath property: The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     * 
     * @param configFilePath the configFilePath value to set.
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("runtimeVersion", this.runtimeVersion);
        jsonWriter.writeStringField("configFilePath", this.configFilePath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthPlatform from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthPlatform if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthPlatform.
     */
    public static AuthPlatform fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthPlatform deserializedAuthPlatform = new AuthPlatform();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAuthPlatform.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("runtimeVersion".equals(fieldName)) {
                    deserializedAuthPlatform.runtimeVersion = reader.getString();
                } else if ("configFilePath".equals(fieldName)) {
                    deserializedAuthPlatform.configFilePath = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthPlatform;
        });
    }
}
