// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.HubBgpConnectionStatus;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Virtual Appliance Site resource.
 */
@Fluent
public final class BgpConnectionInner extends SubResource {
    /*
     * The properties of the Bgp connections.
     */
    private BgpConnectionProperties innerProperties;

    /*
     * Name of the connection.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Connection type.
     */
    private String type;

    /**
     * Creates an instance of BgpConnectionInner class.
     */
    public BgpConnectionInner() {
    }

    /**
     * Get the innerProperties property: The properties of the Bgp connections.
     * 
     * @return the innerProperties value.
     */
    private BgpConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the connection.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the connection.
     * 
     * @param name the name value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withName(String name) {
        this.name = name;
        return this;
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
     * Get the type property: Connection type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BgpConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the peerAsn property: Peer ASN.
     * 
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().peerAsn();
    }

    /**
     * Set the peerAsn property: Peer ASN.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerAsn(Long peerAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpConnectionProperties();
        }
        this.innerProperties().withPeerAsn(peerAsn);
        return this;
    }

    /**
     * Get the peerIp property: Peer IP.
     * 
     * @return the peerIp value.
     */
    public String peerIp() {
        return this.innerProperties() == null ? null : this.innerProperties().peerIp();
    }

    /**
     * Set the peerIp property: Peer IP.
     * 
     * @param peerIp the peerIp value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerIp(String peerIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpConnectionProperties();
        }
        this.innerProperties().withPeerIp(peerIp);
        return this;
    }

    /**
     * Get the hubVirtualNetworkConnection property: The reference to the HubVirtualNetworkConnection resource.
     * 
     * @return the hubVirtualNetworkConnection value.
     */
    public SubResource hubVirtualNetworkConnection() {
        return this.innerProperties() == null ? null : this.innerProperties().hubVirtualNetworkConnection();
    }

    /**
     * Set the hubVirtualNetworkConnection property: The reference to the HubVirtualNetworkConnection resource.
     * 
     * @param hubVirtualNetworkConnection the hubVirtualNetworkConnection value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withHubVirtualNetworkConnection(SubResource hubVirtualNetworkConnection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpConnectionProperties();
        }
        this.innerProperties().withHubVirtualNetworkConnection(hubVirtualNetworkConnection);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the connectionState property: The current state of the VirtualHub to Peer.
     * 
     * @return the connectionState value.
     */
    public HubBgpConnectionStatus connectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionState();
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BgpConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BgpConnectionInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BgpConnectionInner.
     */
    public static BgpConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BgpConnectionInner deserializedBgpConnectionInner = new BgpConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBgpConnectionInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedBgpConnectionInner.innerProperties = BgpConnectionProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedBgpConnectionInner.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedBgpConnectionInner.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBgpConnectionInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBgpConnectionInner;
        });
    }
}
