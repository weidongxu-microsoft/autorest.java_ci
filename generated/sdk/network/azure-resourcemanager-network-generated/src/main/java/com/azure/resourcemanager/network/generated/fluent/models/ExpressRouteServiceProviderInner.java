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
import com.azure.resourcemanager.network.generated.models.ExpressRouteServiceProviderBandwidthsOffered;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A ExpressRouteResourceProvider object.
 */
@Fluent
public final class ExpressRouteServiceProviderInner extends Resource {
    /*
     * Properties of the express route service provider.
     */
    private ExpressRouteServiceProviderPropertiesFormat innerProperties;

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
     * Creates an instance of ExpressRouteServiceProviderInner class.
     */
    public ExpressRouteServiceProviderInner() {
    }

    /**
     * Get the innerProperties property: Properties of the express route service provider.
     * 
     * @return the innerProperties value.
     */
    private ExpressRouteServiceProviderPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withId(String id) {
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
    public ExpressRouteServiceProviderInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExpressRouteServiceProviderInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the peeringLocations property: A list of peering locations.
     * 
     * @return the peeringLocations value.
     */
    public List<String> peeringLocations() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringLocations();
    }

    /**
     * Set the peeringLocations property: A list of peering locations.
     * 
     * @param peeringLocations the peeringLocations value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withPeeringLocations(List<String> peeringLocations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteServiceProviderPropertiesFormat();
        }
        this.innerProperties().withPeeringLocations(peeringLocations);
        return this;
    }

    /**
     * Get the bandwidthsOffered property: A list of bandwidths offered.
     * 
     * @return the bandwidthsOffered value.
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        return this.innerProperties() == null ? null : this.innerProperties().bandwidthsOffered();
    }

    /**
     * Set the bandwidthsOffered property: A list of bandwidths offered.
     * 
     * @param bandwidthsOffered the bandwidthsOffered value to set.
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner
        withBandwidthsOffered(List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteServiceProviderPropertiesFormat();
        }
        this.innerProperties().withBandwidthsOffered(bandwidthsOffered);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route service provider resource.
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
                .log(new IllegalArgumentException(
                    "Missing required property location in model ExpressRouteServiceProviderInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteServiceProviderInner.class);

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
     * Reads an instance of ExpressRouteServiceProviderInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteServiceProviderInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExpressRouteServiceProviderInner.
     */
    public static ExpressRouteServiceProviderInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteServiceProviderInner deserializedExpressRouteServiceProviderInner
                = new ExpressRouteServiceProviderInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedExpressRouteServiceProviderInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExpressRouteServiceProviderInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedExpressRouteServiceProviderInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedExpressRouteServiceProviderInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedExpressRouteServiceProviderInner.innerProperties
                        = ExpressRouteServiceProviderPropertiesFormat.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedExpressRouteServiceProviderInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteServiceProviderInner;
        });
    }
}
