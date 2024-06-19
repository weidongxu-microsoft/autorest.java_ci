// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * PrivateEndpointConnection resource.
 */
@Fluent
public final class PrivateEndpointConnectionInner extends SubResource {
    /*
     * Properties of the private end point connection.
     */
    private PrivateEndpointConnectionPropertiesInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * The resource type.
     */
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of PrivateEndpointConnectionInner class.
     */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the private end point connection.
     * 
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * {@inheritDoc}
     */
    @Override
    public PrivateEndpointConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateEndpoint property: The resource of private end point.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionPropertiesInner();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the linkIdentifier property: The consumer link id.
     * 
     * @return the linkIdentifier value.
     */
    public String linkIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().linkIdentifier();
    }

    /**
     * Get the privateEndpointLocation property: The location of the private endpoint.
     * 
     * @return the privateEndpointLocation value.
     */
    public String privateEndpointLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointLocation();
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
     * Reads an instance of PrivateEndpointConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionInner.
     */
    public static PrivateEndpointConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionInner deserializedPrivateEndpointConnectionInner
                = new PrivateEndpointConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.innerProperties
                        = PrivateEndpointConnectionPropertiesInner.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionInner;
        });
    }
}
