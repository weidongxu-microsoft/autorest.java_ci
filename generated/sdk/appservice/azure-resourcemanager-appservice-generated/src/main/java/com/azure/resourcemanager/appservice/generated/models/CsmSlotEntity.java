// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Deployment slot parameters.
 */
@Fluent
public final class CsmSlotEntity implements JsonSerializable<CsmSlotEntity> {
    /*
     * Destination deployment slot during swap operation.
     */
    private String targetSlot;

    /*
     * <code>true</code> to preserve Virtual Network to the slot during swap; otherwise, <code>false</code>.
     */
    private boolean preserveVnet;

    /**
     * Creates an instance of CsmSlotEntity class.
     */
    public CsmSlotEntity() {
    }

    /**
     * Get the targetSlot property: Destination deployment slot during swap operation.
     * 
     * @return the targetSlot value.
     */
    public String targetSlot() {
        return this.targetSlot;
    }

    /**
     * Set the targetSlot property: Destination deployment slot during swap operation.
     * 
     * @param targetSlot the targetSlot value to set.
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
        return this;
    }

    /**
     * Get the preserveVnet property: &lt;code&gt;true&lt;/code&gt; to preserve Virtual Network to the slot during swap;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the preserveVnet value.
     */
    public boolean preserveVnet() {
        return this.preserveVnet;
    }

    /**
     * Set the preserveVnet property: &lt;code&gt;true&lt;/code&gt; to preserve Virtual Network to the slot during swap;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param preserveVnet the preserveVnet value to set.
     * @return the CsmSlotEntity object itself.
     */
    public CsmSlotEntity withPreserveVnet(boolean preserveVnet) {
        this.preserveVnet = preserveVnet;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetSlot() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property targetSlot in model CsmSlotEntity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CsmSlotEntity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetSlot", this.targetSlot);
        jsonWriter.writeBooleanField("preserveVnet", this.preserveVnet);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CsmSlotEntity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CsmSlotEntity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CsmSlotEntity.
     */
    public static CsmSlotEntity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CsmSlotEntity deserializedCsmSlotEntity = new CsmSlotEntity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetSlot".equals(fieldName)) {
                    deserializedCsmSlotEntity.targetSlot = reader.getString();
                } else if ("preserveVnet".equals(fieldName)) {
                    deserializedCsmSlotEntity.preserveVnet = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCsmSlotEntity;
        });
    }
}
