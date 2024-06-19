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
 * The GitHub action container configuration.
 */
@Fluent
public final class GitHubActionContainerConfiguration implements JsonSerializable<GitHubActionContainerConfiguration> {
    /*
     * The server URL for the container registry where the build will be hosted.
     */
    private String serverUrl;

    /*
     * The image name for the build.
     */
    private String imageName;

    /*
     * The username used to upload the image to the container registry.
     */
    private String username;

    /*
     * The password used to upload the image to the container registry.
     */
    private String password;

    /**
     * Creates an instance of GitHubActionContainerConfiguration class.
     */
    public GitHubActionContainerConfiguration() {
    }

    /**
     * Get the serverUrl property: The server URL for the container registry where the build will be hosted.
     * 
     * @return the serverUrl value.
     */
    public String serverUrl() {
        return this.serverUrl;
    }

    /**
     * Set the serverUrl property: The server URL for the container registry where the build will be hosted.
     * 
     * @param serverUrl the serverUrl value to set.
     * @return the GitHubActionContainerConfiguration object itself.
     */
    public GitHubActionContainerConfiguration withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Get the imageName property: The image name for the build.
     * 
     * @return the imageName value.
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName property: The image name for the build.
     * 
     * @param imageName the imageName value to set.
     * @return the GitHubActionContainerConfiguration object itself.
     */
    public GitHubActionContainerConfiguration withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the username property: The username used to upload the image to the container registry.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username used to upload the image to the container registry.
     * 
     * @param username the username value to set.
     * @return the GitHubActionContainerConfiguration object itself.
     */
    public GitHubActionContainerConfiguration withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password used to upload the image to the container registry.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password used to upload the image to the container registry.
     * 
     * @param password the password value to set.
     * @return the GitHubActionContainerConfiguration object itself.
     */
    public GitHubActionContainerConfiguration withPassword(String password) {
        this.password = password;
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
        jsonWriter.writeStringField("serverUrl", this.serverUrl);
        jsonWriter.writeStringField("imageName", this.imageName);
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GitHubActionContainerConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GitHubActionContainerConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GitHubActionContainerConfiguration.
     */
    public static GitHubActionContainerConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GitHubActionContainerConfiguration deserializedGitHubActionContainerConfiguration
                = new GitHubActionContainerConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serverUrl".equals(fieldName)) {
                    deserializedGitHubActionContainerConfiguration.serverUrl = reader.getString();
                } else if ("imageName".equals(fieldName)) {
                    deserializedGitHubActionContainerConfiguration.imageName = reader.getString();
                } else if ("username".equals(fieldName)) {
                    deserializedGitHubActionContainerConfiguration.username = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedGitHubActionContainerConfiguration.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGitHubActionContainerConfiguration;
        });
    }
}
