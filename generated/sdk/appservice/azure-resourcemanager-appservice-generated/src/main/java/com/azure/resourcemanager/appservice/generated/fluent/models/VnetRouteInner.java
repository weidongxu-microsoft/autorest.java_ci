// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.RouteType;
import java.io.IOException;

/**
 * Virtual Network route contract used to pass routing information for a Virtual Network.
 */
@Fluent
public final class VnetRouteInner extends ProxyOnlyResource {
    /*
     * VnetRoute resource specific properties
     */
    private VnetRouteProperties innerProperties;

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
     * Creates an instance of VnetRouteInner class.
     */
    public VnetRouteInner() {
    }

    /**
     * Get the innerProperties property: VnetRoute resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private VnetRouteProperties innerProperties() {
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
    public VnetRouteInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the startAddress property: The starting address for this route. This may also include a CIDR notation, in
     * which case the end address must not be specified.
     * 
     * @return the startAddress value.
     */
    public String startAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startAddress();
    }

    /**
     * Set the startAddress property: The starting address for this route. This may also include a CIDR notation, in
     * which case the end address must not be specified.
     * 
     * @param startAddress the startAddress value to set.
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withStartAddress(String startAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetRouteProperties();
        }
        this.innerProperties().withStartAddress(startAddress);
        return this;
    }

    /**
     * Get the endAddress property: The ending address for this route. If the start address is specified in CIDR
     * notation, this must be omitted.
     * 
     * @return the endAddress value.
     */
    public String endAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endAddress();
    }

    /**
     * Set the endAddress property: The ending address for this route. If the start address is specified in CIDR
     * notation, this must be omitted.
     * 
     * @param endAddress the endAddress value to set.
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withEndAddress(String endAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetRouteProperties();
        }
        this.innerProperties().withEndAddress(endAddress);
        return this;
    }

    /**
     * Get the routeType property: The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     * @return the routeType value.
     */
    public RouteType routeType() {
        return this.innerProperties() == null ? null : this.innerProperties().routeType();
    }

    /**
     * Set the routeType property: The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     * @param routeType the routeType value to set.
     * @return the VnetRouteInner object itself.
     */
    public VnetRouteInner withRouteType(RouteType routeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetRouteProperties();
        }
        this.innerProperties().withRouteType(routeType);
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
     * Reads an instance of VnetRouteInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VnetRouteInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VnetRouteInner.
     */
    public static VnetRouteInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VnetRouteInner deserializedVnetRouteInner = new VnetRouteInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVnetRouteInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVnetRouteInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVnetRouteInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedVnetRouteInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVnetRouteInner.innerProperties = VnetRouteProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVnetRouteInner;
        });
    }
}
