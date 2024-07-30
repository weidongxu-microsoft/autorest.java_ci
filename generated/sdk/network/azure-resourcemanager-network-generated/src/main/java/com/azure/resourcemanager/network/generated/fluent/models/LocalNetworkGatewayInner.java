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
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.Map;

/**
 * A common class for general resource information.
 */
@Fluent
public final class LocalNetworkGatewayInner extends Resource {
    /*
     * Properties of the local network gateway.
     */
    private LocalNetworkGatewayPropertiesFormat innerProperties = new LocalNetworkGatewayPropertiesFormat();

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
     * Creates an instance of LocalNetworkGatewayInner class.
     */
    public LocalNetworkGatewayInner() {
    }

    /**
     * Get the innerProperties property: Properties of the local network gateway.
     * 
     * @return the innerProperties value.
     */
    private LocalNetworkGatewayPropertiesFormat innerProperties() {
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
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withId(String id) {
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
    public LocalNetworkGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalNetworkGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the localNetworkAddressSpace property: Local network site address space.
     * 
     * @return the localNetworkAddressSpace value.
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().localNetworkAddressSpace();
    }

    /**
     * Set the localNetworkAddressSpace property: Local network site address space.
     * 
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withLocalNetworkAddressSpace(localNetworkAddressSpace);
        return this;
    }

    /**
     * Get the gatewayIpAddress property: IP address of local network gateway.
     * 
     * @return the gatewayIpAddress value.
     */
    public String gatewayIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayIpAddress();
    }

    /**
     * Set the gatewayIpAddress property: IP address of local network gateway.
     * 
     * @param gatewayIpAddress the gatewayIpAddress value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withGatewayIpAddress(String gatewayIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withGatewayIpAddress(gatewayIpAddress);
        return this;
    }

    /**
     * Get the fqdn property: FQDN of local network gateway.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Set the fqdn property: FQDN of local network gateway.
     * 
     * @param fqdn the fqdn value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withFqdn(String fqdn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withFqdn(fqdn);
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpSettings();
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @param bgpSettings the bgpSettings value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withBgpSettings(bgpSettings);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the local network gateway resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the local network gateway resource.
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
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model LocalNetworkGatewayInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LocalNetworkGatewayInner.class);

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
     * Reads an instance of LocalNetworkGatewayInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalNetworkGatewayInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LocalNetworkGatewayInner.
     */
    public static LocalNetworkGatewayInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalNetworkGatewayInner deserializedLocalNetworkGatewayInner = new LocalNetworkGatewayInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedLocalNetworkGatewayInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.innerProperties
                        = LocalNetworkGatewayPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedLocalNetworkGatewayInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalNetworkGatewayInner;
        });
    }
}
