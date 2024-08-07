// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The effective route configured on the virtual hub or specified resource.
 */
@Fluent
public final class VirtualHubEffectiveRoute implements JsonSerializable<VirtualHubEffectiveRoute> {
    /*
     * The list of address prefixes.
     */
    private List<String> addressPrefixes;

    /*
     * The list of next hops.
     */
    private List<String> nextHops;

    /*
     * The type of the next hop.
     */
    private String nextHopType;

    /*
     * The ASPath of this route.
     */
    private String asPath;

    /*
     * The origin of this route.
     */
    private String routeOrigin;

    /**
     * Creates an instance of VirtualHubEffectiveRoute class.
     */
    public VirtualHubEffectiveRoute() {
    }

    /**
     * Get the addressPrefixes property: The list of address prefixes.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: The list of address prefixes.
     * 
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the nextHops property: The list of next hops.
     * 
     * @return the nextHops value.
     */
    public List<String> nextHops() {
        return this.nextHops;
    }

    /**
     * Set the nextHops property: The list of next hops.
     * 
     * @param nextHops the nextHops value to set.
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withNextHops(List<String> nextHops) {
        this.nextHops = nextHops;
        return this;
    }

    /**
     * Get the nextHopType property: The type of the next hop.
     * 
     * @return the nextHopType value.
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType property: The type of the next hop.
     * 
     * @param nextHopType the nextHopType value to set.
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get the asPath property: The ASPath of this route.
     * 
     * @return the asPath value.
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Set the asPath property: The ASPath of this route.
     * 
     * @param asPath the asPath value to set.
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }

    /**
     * Get the routeOrigin property: The origin of this route.
     * 
     * @return the routeOrigin value.
     */
    public String routeOrigin() {
        return this.routeOrigin;
    }

    /**
     * Set the routeOrigin property: The origin of this route.
     * 
     * @param routeOrigin the routeOrigin value to set.
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("addressPrefixes", this.addressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("nextHops", this.nextHops, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("nextHopType", this.nextHopType);
        jsonWriter.writeStringField("asPath", this.asPath);
        jsonWriter.writeStringField("routeOrigin", this.routeOrigin);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualHubEffectiveRoute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualHubEffectiveRoute if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualHubEffectiveRoute.
     */
    public static VirtualHubEffectiveRoute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualHubEffectiveRoute deserializedVirtualHubEffectiveRoute = new VirtualHubEffectiveRoute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefixes".equals(fieldName)) {
                    List<String> addressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualHubEffectiveRoute.addressPrefixes = addressPrefixes;
                } else if ("nextHops".equals(fieldName)) {
                    List<String> nextHops = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualHubEffectiveRoute.nextHops = nextHops;
                } else if ("nextHopType".equals(fieldName)) {
                    deserializedVirtualHubEffectiveRoute.nextHopType = reader.getString();
                } else if ("asPath".equals(fieldName)) {
                    deserializedVirtualHubEffectiveRoute.asPath = reader.getString();
                } else if ("routeOrigin".equals(fieldName)) {
                    deserializedVirtualHubEffectiveRoute.routeOrigin = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualHubEffectiveRoute;
        });
    }
}
