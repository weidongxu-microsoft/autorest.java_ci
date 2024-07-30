// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.Map;

/**
 * An application security group in a resource group.
 */
@Fluent
public final class ApplicationSecurityGroupInner extends Resource {
    /*
     * Properties of the application security group.
     */
    private ApplicationSecurityGroupPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
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
     * Creates an instance of ApplicationSecurityGroupInner class.
     */
    public ApplicationSecurityGroupInner() {
    }

    /**
     * Get the innerProperties property: Properties of the application security group.
     * 
     * @return the innerProperties value.
     */
    private ApplicationSecurityGroupPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationSecurityGroupInner object itself.
     */
    public ApplicationSecurityGroupInner withId(String id) {
        this.id = id;
        return this;
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
    public ApplicationSecurityGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationSecurityGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the application security group resource. It uniquely
     * identifies a resource, even if the user changes its name or migrate the resource across subscriptions or resource
     * groups.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the application security group resource.
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationSecurityGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationSecurityGroupInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationSecurityGroupInner.
     */
    public static ApplicationSecurityGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationSecurityGroupInner deserializedApplicationSecurityGroupInner
                = new ApplicationSecurityGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedApplicationSecurityGroupInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.innerProperties
                        = ApplicationSecurityGroupPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedApplicationSecurityGroupInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationSecurityGroupInner;
        });
    }
}
