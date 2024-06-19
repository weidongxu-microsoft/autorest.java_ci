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
import java.util.List;
import java.util.Map;

/**
 * Route table resource.
 */
@Fluent
public final class RouteTableInner extends Resource {
    /*
     * Properties of the route table.
     */
    private RouteTablePropertiesFormat innerProperties;

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
     * Creates an instance of RouteTableInner class.
     */
    public RouteTableInner() {
    }

    /**
     * Get the innerProperties property: Properties of the route table.
     * 
     * @return the innerProperties value.
     */
    private RouteTablePropertiesFormat innerProperties() {
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
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
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
    public RouteTableInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteTableInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the routes property: Collection of routes contained within a route table.
     * 
     * @return the routes value.
     */
    public List<RouteInner> routes() {
        return this.innerProperties() == null ? null : this.innerProperties().routes();
    }

    /**
     * Set the routes property: Collection of routes contained within a route table.
     * 
     * @param routes the routes value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutes(List<RouteInner> routes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteTablePropertiesFormat();
        }
        this.innerProperties().withRoutes(routes);
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     * 
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().subnets();
    }

    /**
     * Get the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     * 
     * @return the disableBgpRoutePropagation value.
     */
    public Boolean disableBgpRoutePropagation() {
        return this.innerProperties() == null ? null : this.innerProperties().disableBgpRoutePropagation();
    }

    /**
     * Set the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     * 
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteTablePropertiesFormat();
        }
        this.innerProperties().withDisableBgpRoutePropagation(disableBgpRoutePropagation);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route table resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the route table.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
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
     * Reads an instance of RouteTableInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteTableInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouteTableInner.
     */
    public static RouteTableInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteTableInner deserializedRouteTableInner = new RouteTableInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRouteTableInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRouteTableInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRouteTableInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRouteTableInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedRouteTableInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedRouteTableInner.innerProperties = RouteTablePropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedRouteTableInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedRouteTableInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteTableInner;
        });
    }
}
