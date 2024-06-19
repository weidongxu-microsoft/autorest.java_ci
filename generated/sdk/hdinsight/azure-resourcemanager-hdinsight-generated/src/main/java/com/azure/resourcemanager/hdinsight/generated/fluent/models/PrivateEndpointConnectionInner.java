// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateLinkServiceConnectionState;
import java.io.IOException;

/**
 * The private endpoint connection.
 */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    /*
     * The private endpoint connection properties.
     */
    private PrivateEndpointConnectionProperties innerProperties = new PrivateEndpointConnectionProperties();

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

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
     * Creates an instance of PrivateEndpointConnectionInner class.
     */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the innerProperties property: The private endpoint connection properties.
     * 
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the privateEndpoint property: The private endpoint of the private endpoint connection.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Get the privateLinkServiceConnectionState property: The private link service connection state.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: The private link service connection state.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the linkIdentifier property: The link identifier.
     * 
     * @return the linkIdentifier value.
     */
    public String linkIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().linkIdentifier();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
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
                    "Missing required property innerProperties in model PrivateEndpointConnectionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionInner.class);

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
     * Reads an instance of PrivateEndpointConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
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
                    deserializedPrivateEndpointConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.innerProperties
                        = PrivateEndpointConnectionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionInner;
        });
    }
}
