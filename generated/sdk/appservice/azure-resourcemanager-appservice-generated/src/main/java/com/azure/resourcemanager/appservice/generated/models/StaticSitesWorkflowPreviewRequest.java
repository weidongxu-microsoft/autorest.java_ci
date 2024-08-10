// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSitesWorkflowPreviewRequestProperties;
import java.io.IOException;

/**
 * Request entity for previewing the Static Site workflow.
 */
@Fluent
public final class StaticSitesWorkflowPreviewRequest extends ProxyOnlyResource {
    /*
     * StaticSitesWorkflowPreviewRequest resource specific properties
     */
    private StaticSitesWorkflowPreviewRequestProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of StaticSitesWorkflowPreviewRequest class.
     */
    public StaticSitesWorkflowPreviewRequest() {
    }

    /**
     * Get the innerProperties property: StaticSitesWorkflowPreviewRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSitesWorkflowPreviewRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticSitesWorkflowPreviewRequest withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     * 
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryUrl();
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     * 
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withRepositoryUrl(String repositoryUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withRepositoryUrl(repositoryUrl);
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The target branch in the repository.
     * 
     * @param branch the branch value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     * 
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().buildProperties();
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     * 
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withBuildProperties(StaticSiteBuildProperties buildProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withBuildProperties(buildProperties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSitesWorkflowPreviewRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSitesWorkflowPreviewRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSitesWorkflowPreviewRequest.
     */
    public static StaticSitesWorkflowPreviewRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSitesWorkflowPreviewRequest deserializedStaticSitesWorkflowPreviewRequest
                = new StaticSitesWorkflowPreviewRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequest.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequest.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewRequest.innerProperties
                        = StaticSitesWorkflowPreviewRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSitesWorkflowPreviewRequest;
        });
    }
}
