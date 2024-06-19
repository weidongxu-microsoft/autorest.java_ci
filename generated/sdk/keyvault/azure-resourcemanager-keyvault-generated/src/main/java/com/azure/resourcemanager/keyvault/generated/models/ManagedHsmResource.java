// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Managed HSM resource.
 */
@Fluent
public class ManagedHsmResource extends Resource {
    /*
     * SKU details
     */
    private ManagedHsmSku sku;

    /*
     * Metadata pertaining to creation and last modification of the key vault resource.
     */
    private SystemData systemData;

    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    private ManagedServiceIdentity identity;

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
     * Creates an instance of ManagedHsmResource class.
     */
    public ManagedHsmResource() {
    }

    /**
     * Get the sku property: SKU details.
     * 
     * @return the sku value.
     */
    public ManagedHsmSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     * 
     * @param sku the sku value to set.
     * @return the ManagedHsmResource object itself.
     */
    public ManagedHsmResource withSku(ManagedHsmSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the key vault resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Metadata pertaining to creation and last modification of the key vault resource.
     * 
     * @param systemData the systemData value to set.
     * @return the ManagedHsmResource object itself.
     */
    ManagedHsmResource withSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the ManagedHsmResource object itself.
     */
    public ManagedHsmResource withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
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
    public ManagedHsmResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedHsmResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedHsmResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedHsmResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedHsmResource.
     */
    public static ManagedHsmResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedHsmResource deserializedManagedHsmResource = new ManagedHsmResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedHsmResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedHsmResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedHsmResource.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedManagedHsmResource.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedHsmResource.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedManagedHsmResource.sku = ManagedHsmSku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedManagedHsmResource.systemData = SystemData.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedManagedHsmResource.identity = ManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedHsmResource;
        });
    }
}
