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
 * Domain ownership Identifier.
 */
@Fluent
public final class DomainOwnershipIdentifierInner extends ProxyOnlyResource {
    /*
     * DomainOwnershipIdentifier resource specific properties
     */
    private DomainOwnershipIdentifierProperties innerProperties;

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
     * Creates an instance of DomainOwnershipIdentifierInner class.
     */
    public DomainOwnershipIdentifierInner() {
    }

    /**
     * Get the innerProperties property: DomainOwnershipIdentifier resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DomainOwnershipIdentifierProperties innerProperties() {
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
    public DomainOwnershipIdentifierInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the ownershipId property: Ownership Id.
     * 
     * @return the ownershipId value.
     */
    public String ownershipId() {
        return this.innerProperties() == null ? null : this.innerProperties().ownershipId();
    }

    /**
     * Set the ownershipId property: Ownership Id.
     * 
     * @param ownershipId the ownershipId value to set.
     * @return the DomainOwnershipIdentifierInner object itself.
     */
    public DomainOwnershipIdentifierInner withOwnershipId(String ownershipId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainOwnershipIdentifierProperties();
        }
        this.innerProperties().withOwnershipId(ownershipId);
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
     * Reads an instance of DomainOwnershipIdentifierInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainOwnershipIdentifierInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DomainOwnershipIdentifierInner.
     */
    public static DomainOwnershipIdentifierInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainOwnershipIdentifierInner deserializedDomainOwnershipIdentifierInner
                = new DomainOwnershipIdentifierInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierInner.innerProperties
                        = DomainOwnershipIdentifierProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainOwnershipIdentifierInner;
        });
    }
}
