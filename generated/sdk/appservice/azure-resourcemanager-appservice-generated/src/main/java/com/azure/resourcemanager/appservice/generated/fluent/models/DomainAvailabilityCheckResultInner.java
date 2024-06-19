// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.DomainType;
import java.io.IOException;

/**
 * Domain availability check result.
 */
@Fluent
public final class DomainAvailabilityCheckResultInner implements JsonSerializable<DomainAvailabilityCheckResultInner> {
    /*
     * Name of the domain.
     */
    private String name;

    /*
     * <code>true</code> if domain can be purchased using CreateDomain API; otherwise, <code>false</code>.
     */
    private Boolean available;

    /*
     * Valid values are Regular domain: Azure will charge the full price of domain registration, SoftDeleted: Purchasing
     * this domain will simply restore it and this operation will not cost anything.
     */
    private DomainType domainType;

    /**
     * Creates an instance of DomainAvailabilityCheckResultInner class.
     */
    public DomainAvailabilityCheckResultInner() {
    }

    /**
     * Get the name property: Name of the domain.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the domain.
     * 
     * @param name the name value to set.
     * @return the DomainAvailabilityCheckResultInner object itself.
     */
    public DomainAvailabilityCheckResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the available property: &lt;code&gt;true&lt;/code&gt; if domain can be purchased using CreateDomain API;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: &lt;code&gt;true&lt;/code&gt; if domain can be purchased using CreateDomain API;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param available the available value to set.
     * @return the DomainAvailabilityCheckResultInner object itself.
     */
    public DomainAvailabilityCheckResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the domainType property: Valid values are Regular domain: Azure will charge the full price of domain
     * registration, SoftDeleted: Purchasing this domain will simply restore it and this operation will not cost
     * anything.
     * 
     * @return the domainType value.
     */
    public DomainType domainType() {
        return this.domainType;
    }

    /**
     * Set the domainType property: Valid values are Regular domain: Azure will charge the full price of domain
     * registration, SoftDeleted: Purchasing this domain will simply restore it and this operation will not cost
     * anything.
     * 
     * @param domainType the domainType value to set.
     * @return the DomainAvailabilityCheckResultInner object itself.
     */
    public DomainAvailabilityCheckResultInner withDomainType(DomainType domainType) {
        this.domainType = domainType;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeBooleanField("available", this.available);
        jsonWriter.writeStringField("domainType", this.domainType == null ? null : this.domainType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainAvailabilityCheckResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainAvailabilityCheckResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DomainAvailabilityCheckResultInner.
     */
    public static DomainAvailabilityCheckResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainAvailabilityCheckResultInner deserializedDomainAvailabilityCheckResultInner
                = new DomainAvailabilityCheckResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDomainAvailabilityCheckResultInner.name = reader.getString();
                } else if ("available".equals(fieldName)) {
                    deserializedDomainAvailabilityCheckResultInner.available
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("domainType".equals(fieldName)) {
                    deserializedDomainAvailabilityCheckResultInner.domainType
                        = DomainType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainAvailabilityCheckResultInner;
        });
    }
}
