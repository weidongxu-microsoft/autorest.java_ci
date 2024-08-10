// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ChildResource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * StaticMember Item.
 */
@Fluent
public final class StaticMemberInner extends ChildResource {
    /*
     * The Static Member properties
     */
    private StaticMemberProperties innerProperties;

    /*
     * The system metadata related to this resource.
     */
    private SystemData systemData;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

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
     * Creates an instance of StaticMemberInner class.
     */
    public StaticMemberInner() {
    }

    /**
     * Get the innerProperties property: The Static Member properties.
     * 
     * @return the innerProperties value.
     */
    private StaticMemberProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
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
     * Get the resourceId property: Resource Id.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Resource Id.
     * 
     * @param resourceId the resourceId value to set.
     * @return the StaticMemberInner object itself.
     */
    public StaticMemberInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticMemberProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the region property: Resource region.
     * 
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticMemberInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticMemberInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticMemberInner.
     */
    public static StaticMemberInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticMemberInner deserializedStaticMemberInner = new StaticMemberInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticMemberInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticMemberInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticMemberInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedStaticMemberInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticMemberInner.innerProperties = StaticMemberProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedStaticMemberInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticMemberInner;
        });
    }
}
