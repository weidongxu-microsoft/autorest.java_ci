// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.CapabilityInner;
import java.io.IOException;
import java.util.List;

/**
 * A Global SKU Description.
 */
@Fluent
public final class GlobalCsmSkuDescription implements JsonSerializable<GlobalCsmSkuDescription> {
    /*
     * Name of the resource SKU.
     */
    private String name;

    /*
     * Service Tier of the resource SKU.
     */
    private String tier;

    /*
     * Size specifier of the resource SKU.
     */
    private String size;

    /*
     * Family code of the resource SKU.
     */
    private String family;

    /*
     * Min, max, and default scale values of the SKU.
     */
    private SkuCapacity capacity;

    /*
     * Locations of the SKU.
     */
    private List<String> locations;

    /*
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     */
    private List<CapabilityInner> capabilities;

    /**
     * Creates an instance of GlobalCsmSkuDescription class.
     */
    public GlobalCsmSkuDescription() {
    }

    /**
     * Get the name property: Name of the resource SKU.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource SKU.
     * 
     * @param name the name value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Service Tier of the resource SKU.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Service Tier of the resource SKU.
     * 
     * @param tier the tier value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: Size specifier of the resource SKU.
     * 
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: Size specifier of the resource SKU.
     * 
     * @param size the size value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: Family code of the resource SKU.
     * 
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: Family code of the resource SKU.
     * 
     * @param family the family value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: Min, max, and default scale values of the SKU.
     * 
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Min, max, and default scale values of the SKU.
     * 
     * @param capacity the capacity value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the locations property: Locations of the SKU.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Locations of the SKU.
     * 
     * @param locations the locations value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     * 
     * @return the capabilities value.
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     * 
     * @param capabilities the capabilities value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("tier", this.tier);
        jsonWriter.writeStringField("size", this.size);
        jsonWriter.writeStringField("family", this.family);
        jsonWriter.writeJsonField("capacity", this.capacity);
        jsonWriter.writeArrayField("locations", this.locations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("capabilities", this.capabilities, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GlobalCsmSkuDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GlobalCsmSkuDescription if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GlobalCsmSkuDescription.
     */
    public static GlobalCsmSkuDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GlobalCsmSkuDescription deserializedGlobalCsmSkuDescription = new GlobalCsmSkuDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedGlobalCsmSkuDescription.name = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedGlobalCsmSkuDescription.tier = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedGlobalCsmSkuDescription.size = reader.getString();
                } else if ("family".equals(fieldName)) {
                    deserializedGlobalCsmSkuDescription.family = reader.getString();
                } else if ("capacity".equals(fieldName)) {
                    deserializedGlobalCsmSkuDescription.capacity = SkuCapacity.fromJson(reader);
                } else if ("locations".equals(fieldName)) {
                    List<String> locations = reader.readArray(reader1 -> reader1.getString());
                    deserializedGlobalCsmSkuDescription.locations = locations;
                } else if ("capabilities".equals(fieldName)) {
                    List<CapabilityInner> capabilities = reader.readArray(reader1 -> CapabilityInner.fromJson(reader1));
                    deserializedGlobalCsmSkuDescription.capabilities = capabilities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGlobalCsmSkuDescription;
        });
    }
}
