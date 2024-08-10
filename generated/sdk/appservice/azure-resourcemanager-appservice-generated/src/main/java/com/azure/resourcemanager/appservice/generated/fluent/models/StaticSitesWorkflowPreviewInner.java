// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Preview for the Static Site Workflow to be generated.
 */
@Fluent
public final class StaticSitesWorkflowPreviewInner extends ProxyOnlyResource {
    /*
     * StaticSitesWorkflowPreview resource specific properties
     */
    private StaticSitesWorkflowPreviewProperties innerProperties;

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
     * Creates an instance of StaticSitesWorkflowPreviewInner class.
     */
    public StaticSitesWorkflowPreviewInner() {
    }

    /**
     * Get the innerProperties property: StaticSitesWorkflowPreview resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSitesWorkflowPreviewProperties innerProperties() {
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
    public StaticSitesWorkflowPreviewInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the path property: The path for the workflow file to be generated.
     * 
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Get the contents property: The contents for the workflow file to be generated.
     * 
     * @return the contents value.
     */
    public String contents() {
        return this.innerProperties() == null ? null : this.innerProperties().contents();
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
     * Reads an instance of StaticSitesWorkflowPreviewInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSitesWorkflowPreviewInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSitesWorkflowPreviewInner.
     */
    public static StaticSitesWorkflowPreviewInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSitesWorkflowPreviewInner deserializedStaticSitesWorkflowPreviewInner
                = new StaticSitesWorkflowPreviewInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSitesWorkflowPreviewInner.innerProperties
                        = StaticSitesWorkflowPreviewProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSitesWorkflowPreviewInner;
        });
    }
}
