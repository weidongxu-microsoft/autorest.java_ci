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
import java.util.List;

/**
 * A hostname and its assigned sites.
 */
@Fluent
public final class CustomHostnameSitesInner extends ProxyOnlyResource {
    /*
     * CustomHostnameSites resource specific properties
     */
    private CustomHostnameSitesProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of CustomHostnameSitesInner class.
     */
    public CustomHostnameSitesInner() {
    }

    /**
     * Get the innerProperties property: CustomHostnameSites resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private CustomHostnameSitesProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public CustomHostnameSitesInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the customHostname property: The customHostname property.
     * 
     * @return the customHostname value.
     */
    public String customHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().customHostname();
    }

    /**
     * Set the customHostname property: The customHostname property.
     * 
     * @param customHostname the customHostname value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withCustomHostname(String customHostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withCustomHostname(customHostname);
        return this;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
    }

    /**
     * Get the siteResourceIds property: The siteResourceIds property.
     * 
     * @return the siteResourceIds value.
     */
    public List<IdentifierInner> siteResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().siteResourceIds();
    }

    /**
     * Set the siteResourceIds property: The siteResourceIds property.
     * 
     * @param siteResourceIds the siteResourceIds value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withSiteResourceIds(List<IdentifierInner> siteResourceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withSiteResourceIds(siteResourceIds);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
     * Reads an instance of CustomHostnameSitesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomHostnameSitesInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomHostnameSitesInner.
     */
    public static CustomHostnameSitesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomHostnameSitesInner deserializedCustomHostnameSitesInner = new CustomHostnameSitesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCustomHostnameSitesInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCustomHostnameSitesInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCustomHostnameSitesInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedCustomHostnameSitesInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedCustomHostnameSitesInner.innerProperties
                        = CustomHostnameSitesProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomHostnameSitesInner;
        });
    }
}
