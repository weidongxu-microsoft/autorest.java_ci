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
 * Azure Firewall FQDN Tag Resource.
 */
@Fluent
public final class AzureFirewallFqdnTagInner extends Resource {
    /*
     * Properties of the azure firewall FQDN tag.
     */
    private AzureFirewallFqdnTagPropertiesFormat innerProperties;

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
     * Creates an instance of AzureFirewallFqdnTagInner class.
     */
    public AzureFirewallFqdnTagInner() {
    }

    /**
     * Get the innerProperties property: Properties of the azure firewall FQDN tag.
     * 
     * @return the innerProperties value.
     */
    private AzureFirewallFqdnTagPropertiesFormat innerProperties() {
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
     * @return the AzureFirewallFqdnTagInner object itself.
     */
    public AzureFirewallFqdnTagInner withId(String id) {
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
    public AzureFirewallFqdnTagInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFirewallFqdnTagInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall FQDN tag resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the fqdnTagName property: The name of this FQDN Tag.
     * 
     * @return the fqdnTagName value.
     */
    public String fqdnTagName() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdnTagName();
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
     * Reads an instance of AzureFirewallFqdnTagInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallFqdnTagInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFirewallFqdnTagInner.
     */
    public static AzureFirewallFqdnTagInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallFqdnTagInner deserializedAzureFirewallFqdnTagInner = new AzureFirewallFqdnTagInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAzureFirewallFqdnTagInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.innerProperties
                        = AzureFirewallFqdnTagPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedAzureFirewallFqdnTagInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallFqdnTagInner;
        });
    }
}
