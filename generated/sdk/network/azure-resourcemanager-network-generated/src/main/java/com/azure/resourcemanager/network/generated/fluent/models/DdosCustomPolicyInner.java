// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.Map;

/**
 * A DDoS custom policy in a resource group.
 */
@Fluent
public final class DdosCustomPolicyInner extends Resource {
    /*
     * Properties of the DDoS custom policy.
     */
    private DdosCustomPolicyPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /**
     * Creates an instance of DdosCustomPolicyInner class.
     */
    public DdosCustomPolicyInner() {
    }

    /**
     * Get the innerProperties property: Properties of the DDoS custom policy.
     * 
     * @return the innerProperties value.
     */
    private DdosCustomPolicyPropertiesFormat innerProperties() {
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
     * @return the DdosCustomPolicyInner object itself.
     */
    public DdosCustomPolicyInner withId(String id) {
        this.id = id;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public DdosCustomPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdosCustomPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS custom policy resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS custom policy resource.
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
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property location in model DdosCustomPolicyInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DdosCustomPolicyInner.class);

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
     * Reads an instance of DdosCustomPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DdosCustomPolicyInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DdosCustomPolicyInner.
     */
    public static DdosCustomPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DdosCustomPolicyInner deserializedDdosCustomPolicyInner = new DdosCustomPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDdosCustomPolicyInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.innerProperties
                        = DdosCustomPolicyPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedDdosCustomPolicyInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDdosCustomPolicyInner;
        });
    }
}
