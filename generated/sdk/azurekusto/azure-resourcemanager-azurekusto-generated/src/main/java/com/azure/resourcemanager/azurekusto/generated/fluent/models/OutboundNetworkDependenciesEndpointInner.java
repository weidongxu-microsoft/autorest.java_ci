// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurekusto.generated.models.EndpointDependency;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Endpoints accessed for a common purpose that the Kusto Service Environment requires outbound network access to.
 */
@Fluent
public final class OutboundNetworkDependenciesEndpointInner extends ProxyResource {
    /*
     * The outbound environment endpoint properties.
     */
    private OutboundNetworkDependenciesEndpointProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

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
     * Creates an instance of OutboundNetworkDependenciesEndpointInner class.
     */
    public OutboundNetworkDependenciesEndpointInner() {
    }

    /**
     * Get the innerProperties property: The outbound environment endpoint properties.
     * 
     * @return the innerProperties value.
     */
    private OutboundNetworkDependenciesEndpointProperties innerProperties() {
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
     * Get the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     * 
     * @return the category value.
     */
    public String category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     * 
     * @param category the category value to set.
     * @return the OutboundNetworkDependenciesEndpointInner object itself.
     */
    public OutboundNetworkDependenciesEndpointInner withCategory(String category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundNetworkDependenciesEndpointProperties();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     * 
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoints();
    }

    /**
     * Set the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     * 
     * @param endpoints the endpoints value to set.
     * @return the OutboundNetworkDependenciesEndpointInner object itself.
     */
    public OutboundNetworkDependenciesEndpointInner withEndpoints(List<EndpointDependency> endpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundNetworkDependenciesEndpointProperties();
        }
        this.innerProperties().withEndpoints(endpoints);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutboundNetworkDependenciesEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutboundNetworkDependenciesEndpointInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutboundNetworkDependenciesEndpointInner.
     */
    public static OutboundNetworkDependenciesEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutboundNetworkDependenciesEndpointInner deserializedOutboundNetworkDependenciesEndpointInner
                = new OutboundNetworkDependenciesEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOutboundNetworkDependenciesEndpointInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOutboundNetworkDependenciesEndpointInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOutboundNetworkDependenciesEndpointInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOutboundNetworkDependenciesEndpointInner.innerProperties
                        = OutboundNetworkDependenciesEndpointProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedOutboundNetworkDependenciesEndpointInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutboundNetworkDependenciesEndpointInner;
        });
    }
}
