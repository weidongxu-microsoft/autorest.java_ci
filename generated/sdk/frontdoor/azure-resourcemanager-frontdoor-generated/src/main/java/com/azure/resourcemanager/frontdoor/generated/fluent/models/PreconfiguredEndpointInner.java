// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.models.EndpointType;
import java.io.IOException;
import java.util.Map;

/**
 * Defines the properties of a preconfigured endpoint.
 */
@Fluent
public final class PreconfiguredEndpointInner extends Resource {
    /*
     * The properties of a preconfiguredEndpoint
     */
    private PreconfiguredEndpointProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of PreconfiguredEndpointInner class.
     */
    public PreconfiguredEndpointInner() {
    }

    /**
     * Get the innerProperties property: The properties of a preconfiguredEndpoint.
     * 
     * @return the innerProperties value.
     */
    private PreconfiguredEndpointProperties innerProperties() {
        return this.innerProperties;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreconfiguredEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreconfiguredEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of the endpoint.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the endpoint.
     * 
     * @param description the description value to set.
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PreconfiguredEndpointProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint that is preconfigured.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint that is preconfigured.
     * 
     * @param endpoint the endpoint value to set.
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withEndpoint(String endpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PreconfiguredEndpointProperties();
        }
        this.innerProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the endpointType property: The type of endpoint.
     * 
     * @return the endpointType value.
     */
    public EndpointType endpointType() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointType();
    }

    /**
     * Set the endpointType property: The type of endpoint.
     * 
     * @param endpointType the endpointType value to set.
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withEndpointType(EndpointType endpointType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PreconfiguredEndpointProperties();
        }
        this.innerProperties().withEndpointType(endpointType);
        return this;
    }

    /**
     * Get the backend property: The preconfigured endpoint backend.
     * 
     * @return the backend value.
     */
    public String backend() {
        return this.innerProperties() == null ? null : this.innerProperties().backend();
    }

    /**
     * Set the backend property: The preconfigured endpoint backend.
     * 
     * @param backend the backend value to set.
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withBackend(String backend) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PreconfiguredEndpointProperties();
        }
        this.innerProperties().withBackend(backend);
        return this;
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
                .log(new IllegalArgumentException(
                    "Missing required property location in model PreconfiguredEndpointInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PreconfiguredEndpointInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PreconfiguredEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PreconfiguredEndpointInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PreconfiguredEndpointInner.
     */
    public static PreconfiguredEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PreconfiguredEndpointInner deserializedPreconfiguredEndpointInner = new PreconfiguredEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPreconfiguredEndpointInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPreconfiguredEndpointInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPreconfiguredEndpointInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedPreconfiguredEndpointInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPreconfiguredEndpointInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedPreconfiguredEndpointInner.innerProperties
                        = PreconfiguredEndpointProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPreconfiguredEndpointInner;
        });
    }
}
