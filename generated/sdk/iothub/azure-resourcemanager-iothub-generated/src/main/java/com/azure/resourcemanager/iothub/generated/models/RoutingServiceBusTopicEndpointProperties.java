// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties related to service bus topic endpoint types.
 */
@Fluent
public final class RoutingServiceBusTopicEndpointProperties
    implements JsonSerializable<RoutingServiceBusTopicEndpointProperties> {
    /*
     * Id of the service bus topic endpoint
     */
    private String id;

    /*
     * The connection string of the service bus topic endpoint.
     */
    private String connectionString;

    /*
     * The url of the service bus topic endpoint. It must include the protocol sb://
     */
    private String endpointUri;

    /*
     * Queue name on the service bus topic
     */
    private String entityPath;

    /*
     * Method used to authenticate against the service bus topic endpoint
     */
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of routing service bus topic endpoint.
     */
    private ManagedIdentity identity;

    /*
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores,
     * hyphens and has a maximum length of 64 characters. The following names are reserved: events, fileNotifications,
     * $default. Endpoint names must be unique across endpoint types. The name need not be the same as the actual topic
     * name.
     */
    private String name;

    /*
     * The subscription identifier of the service bus topic endpoint.
     */
    private String subscriptionId;

    /*
     * The name of the resource group of the service bus topic endpoint.
     */
    private String resourceGroup;

    /**
     * Creates an instance of RoutingServiceBusTopicEndpointProperties class.
     */
    public RoutingServiceBusTopicEndpointProperties() {
    }

    /**
     * Get the id property: Id of the service bus topic endpoint.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the service bus topic endpoint.
     * 
     * @param id the id value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the connectionString property: The connection string of the service bus topic endpoint.
     * 
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of the service bus topic endpoint.
     * 
     * @param connectionString the connectionString value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the endpointUri property: The url of the service bus topic endpoint. It must include the protocol sb://.
     * 
     * @return the endpointUri value.
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: The url of the service bus topic endpoint. It must include the protocol sb://.
     * 
     * @param endpointUri the endpointUri value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get the entityPath property: Queue name on the service bus topic.
     * 
     * @return the entityPath value.
     */
    public String entityPath() {
        return this.entityPath;
    }

    /**
     * Set the entityPath property: Queue name on the service bus topic.
     * 
     * @param entityPath the entityPath value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /**
     * Get the authenticationType property: Method used to authenticate against the service bus topic endpoint.
     * 
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Method used to authenticate against the service bus topic endpoint.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of routing service bus topic endpoint.
     * 
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of routing service bus topic endpoint.
     * 
     * @param identity the identity value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual topic name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual topic name.
     * 
     * @param name the name value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription identifier of the service bus topic endpoint.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier of the service bus topic endpoint.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The name of the resource group of the service bus topic endpoint.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The name of the resource group of the service bus topic endpoint.
     * 
     * @param resourceGroup the resourceGroup value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model RoutingServiceBusTopicEndpointProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoutingServiceBusTopicEndpointProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("connectionString", this.connectionString);
        jsonWriter.writeStringField("endpointUri", this.endpointUri);
        jsonWriter.writeStringField("entityPath", this.entityPath);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeStringField("resourceGroup", this.resourceGroup);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoutingServiceBusTopicEndpointProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoutingServiceBusTopicEndpointProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoutingServiceBusTopicEndpointProperties.
     */
    public static RoutingServiceBusTopicEndpointProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoutingServiceBusTopicEndpointProperties deserializedRoutingServiceBusTopicEndpointProperties
                = new RoutingServiceBusTopicEndpointProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.id = reader.getString();
                } else if ("connectionString".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.connectionString = reader.getString();
                } else if ("endpointUri".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.endpointUri = reader.getString();
                } else if ("entityPath".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.entityPath = reader.getString();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.authenticationType
                        = AuthenticationType.fromString(reader.getString());
                } else if ("identity".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.identity = ManagedIdentity.fromJson(reader);
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.subscriptionId = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedRoutingServiceBusTopicEndpointProperties.resourceGroup = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoutingServiceBusTopicEndpointProperties;
        });
    }
}
