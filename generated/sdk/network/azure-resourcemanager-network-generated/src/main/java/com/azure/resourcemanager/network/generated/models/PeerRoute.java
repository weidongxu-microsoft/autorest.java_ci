// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Peer routing details.
 */
@Immutable
public final class PeerRoute implements JsonSerializable<PeerRoute> {
    /*
     * The peer's local address.
     */
    private String localAddress;

    /*
     * The route's network prefix.
     */
    private String network;

    /*
     * The route's next hop.
     */
    private String nextHop;

    /*
     * The peer this route was learned from.
     */
    private String sourcePeer;

    /*
     * The source this route was learned from.
     */
    private String origin;

    /*
     * The route's AS path sequence.
     */
    private String asPath;

    /*
     * The route's weight.
     */
    private Integer weight;

    /**
     * Creates an instance of PeerRoute class.
     */
    public PeerRoute() {
    }

    /**
     * Get the localAddress property: The peer's local address.
     * 
     * @return the localAddress value.
     */
    public String localAddress() {
        return this.localAddress;
    }

    /**
     * Get the network property: The route's network prefix.
     * 
     * @return the network value.
     */
    public String network() {
        return this.network;
    }

    /**
     * Get the nextHop property: The route's next hop.
     * 
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Get the sourcePeer property: The peer this route was learned from.
     * 
     * @return the sourcePeer value.
     */
    public String sourcePeer() {
        return this.sourcePeer;
    }

    /**
     * Get the origin property: The source this route was learned from.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the asPath property: The route's AS path sequence.
     * 
     * @return the asPath value.
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Get the weight property: The route's weight.
     * 
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeerRoute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeerRoute if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the PeerRoute.
     */
    public static PeerRoute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeerRoute deserializedPeerRoute = new PeerRoute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("localAddress".equals(fieldName)) {
                    deserializedPeerRoute.localAddress = reader.getString();
                } else if ("network".equals(fieldName)) {
                    deserializedPeerRoute.network = reader.getString();
                } else if ("nextHop".equals(fieldName)) {
                    deserializedPeerRoute.nextHop = reader.getString();
                } else if ("sourcePeer".equals(fieldName)) {
                    deserializedPeerRoute.sourcePeer = reader.getString();
                } else if ("origin".equals(fieldName)) {
                    deserializedPeerRoute.origin = reader.getString();
                } else if ("asPath".equals(fieldName)) {
                    deserializedPeerRoute.asPath = reader.getString();
                } else if ("weight".equals(fieldName)) {
                    deserializedPeerRoute.weight = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeerRoute;
        });
    }
}
