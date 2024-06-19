// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * DomainOwnershipIdentifier resource specific properties.
 */
@Fluent
public final class DomainOwnershipIdentifierProperties
    implements JsonSerializable<DomainOwnershipIdentifierProperties> {
    /*
     * Ownership Id.
     */
    private String ownershipId;

    /**
     * Creates an instance of DomainOwnershipIdentifierProperties class.
     */
    public DomainOwnershipIdentifierProperties() {
    }

    /**
     * Get the ownershipId property: Ownership Id.
     * 
     * @return the ownershipId value.
     */
    public String ownershipId() {
        return this.ownershipId;
    }

    /**
     * Set the ownershipId property: Ownership Id.
     * 
     * @param ownershipId the ownershipId value to set.
     * @return the DomainOwnershipIdentifierProperties object itself.
     */
    public DomainOwnershipIdentifierProperties withOwnershipId(String ownershipId) {
        this.ownershipId = ownershipId;
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
        jsonWriter.writeStringField("ownershipId", this.ownershipId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainOwnershipIdentifierProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainOwnershipIdentifierProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DomainOwnershipIdentifierProperties.
     */
    public static DomainOwnershipIdentifierProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainOwnershipIdentifierProperties deserializedDomainOwnershipIdentifierProperties
                = new DomainOwnershipIdentifierProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ownershipId".equals(fieldName)) {
                    deserializedDomainOwnershipIdentifierProperties.ownershipId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainOwnershipIdentifierProperties;
        });
    }
}
