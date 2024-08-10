// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.CustomDomainStatus;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Static Site Custom Domain Overview ARM resource.
 */
@Fluent
public final class StaticSiteCustomDomainOverviewArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteCustomDomainOverviewARMResource resource specific properties
     */
    private StaticSiteCustomDomainOverviewArmResourceProperties innerProperties;

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
     * Creates an instance of StaticSiteCustomDomainOverviewArmResourceInner class.
     */
    public StaticSiteCustomDomainOverviewArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteCustomDomainOverviewARMResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteCustomDomainOverviewArmResourceProperties innerProperties() {
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
    public StaticSiteCustomDomainOverviewArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.innerProperties() == null ? null : this.innerProperties().domainName();
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the status property: The status of the custom domain.
     * 
     * @return the status value.
     */
    public CustomDomainStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the validationToken property: The TXT record validation token.
     * 
     * @return the validationToken value.
     */
    public String validationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().validationToken();
    }

    /**
     * Get the errorMessage property: The errorMessage property.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
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
     * Reads an instance of StaticSiteCustomDomainOverviewArmResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteCustomDomainOverviewArmResourceInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteCustomDomainOverviewArmResourceInner.
     */
    public static StaticSiteCustomDomainOverviewArmResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteCustomDomainOverviewArmResourceInner deserializedStaticSiteCustomDomainOverviewArmResourceInner
                = new StaticSiteCustomDomainOverviewArmResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceInner.innerProperties
                        = StaticSiteCustomDomainOverviewArmResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteCustomDomainOverviewArmResourceInner;
        });
    }
}
