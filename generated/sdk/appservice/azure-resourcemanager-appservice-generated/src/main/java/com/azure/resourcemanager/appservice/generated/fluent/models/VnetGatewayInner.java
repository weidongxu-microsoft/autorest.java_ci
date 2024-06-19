// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * The Virtual Network gateway contract. This is used to give the Virtual Network gateway access to the VPN package.
 */
@Fluent
public final class VnetGatewayInner extends ProxyOnlyResource {
    /*
     * VnetGateway resource specific properties
     */
    private VnetGatewayProperties innerProperties;

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
     * Creates an instance of VnetGatewayInner class.
     */
    public VnetGatewayInner() {
    }

    /**
     * Get the innerProperties property: VnetGateway resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private VnetGatewayProperties innerProperties() {
        return this.innerProperties;
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
    public VnetGatewayInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the vnetName property: The Virtual Network name.
     * 
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetName();
    }

    /**
     * Set the vnetName property: The Virtual Network name.
     * 
     * @param vnetName the vnetName value to set.
     * @return the VnetGatewayInner object itself.
     */
    public VnetGatewayInner withVnetName(String vnetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetGatewayProperties();
        }
        this.innerProperties().withVnetName(vnetName);
        return this;
    }

    /**
     * Get the vpnPackageUri property: The URI where the VPN package can be downloaded.
     * 
     * @return the vpnPackageUri value.
     */
    public String vpnPackageUri() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnPackageUri();
    }

    /**
     * Set the vpnPackageUri property: The URI where the VPN package can be downloaded.
     * 
     * @param vpnPackageUri the vpnPackageUri value to set.
     * @return the VnetGatewayInner object itself.
     */
    public VnetGatewayInner withVpnPackageUri(String vpnPackageUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetGatewayProperties();
        }
        this.innerProperties().withVpnPackageUri(vpnPackageUri);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VnetGatewayInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VnetGatewayInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VnetGatewayInner.
     */
    public static VnetGatewayInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VnetGatewayInner deserializedVnetGatewayInner = new VnetGatewayInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVnetGatewayInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVnetGatewayInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVnetGatewayInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedVnetGatewayInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVnetGatewayInner.innerProperties = VnetGatewayProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVnetGatewayInner;
        });
    }
}
