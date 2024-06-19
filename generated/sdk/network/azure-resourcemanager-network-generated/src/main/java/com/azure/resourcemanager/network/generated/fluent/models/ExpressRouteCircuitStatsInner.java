// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains stats associated with the peering.
 */
@Fluent
public final class ExpressRouteCircuitStatsInner implements JsonSerializable<ExpressRouteCircuitStatsInner> {
    /*
     * The Primary BytesIn of the peering.
     */
    private Long primarybytesIn;

    /*
     * The primary BytesOut of the peering.
     */
    private Long primarybytesOut;

    /*
     * The secondary BytesIn of the peering.
     */
    private Long secondarybytesIn;

    /*
     * The secondary BytesOut of the peering.
     */
    private Long secondarybytesOut;

    /**
     * Creates an instance of ExpressRouteCircuitStatsInner class.
     */
    public ExpressRouteCircuitStatsInner() {
    }

    /**
     * Get the primarybytesIn property: The Primary BytesIn of the peering.
     * 
     * @return the primarybytesIn value.
     */
    public Long primarybytesIn() {
        return this.primarybytesIn;
    }

    /**
     * Set the primarybytesIn property: The Primary BytesIn of the peering.
     * 
     * @param primarybytesIn the primarybytesIn value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesIn(Long primarybytesIn) {
        this.primarybytesIn = primarybytesIn;
        return this;
    }

    /**
     * Get the primarybytesOut property: The primary BytesOut of the peering.
     * 
     * @return the primarybytesOut value.
     */
    public Long primarybytesOut() {
        return this.primarybytesOut;
    }

    /**
     * Set the primarybytesOut property: The primary BytesOut of the peering.
     * 
     * @param primarybytesOut the primarybytesOut value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesOut(Long primarybytesOut) {
        this.primarybytesOut = primarybytesOut;
        return this;
    }

    /**
     * Get the secondarybytesIn property: The secondary BytesIn of the peering.
     * 
     * @return the secondarybytesIn value.
     */
    public Long secondarybytesIn() {
        return this.secondarybytesIn;
    }

    /**
     * Set the secondarybytesIn property: The secondary BytesIn of the peering.
     * 
     * @param secondarybytesIn the secondarybytesIn value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesIn(Long secondarybytesIn) {
        this.secondarybytesIn = secondarybytesIn;
        return this;
    }

    /**
     * Get the secondarybytesOut property: The secondary BytesOut of the peering.
     * 
     * @return the secondarybytesOut value.
     */
    public Long secondarybytesOut() {
        return this.secondarybytesOut;
    }

    /**
     * Set the secondarybytesOut property: The secondary BytesOut of the peering.
     * 
     * @param secondarybytesOut the secondarybytesOut value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesOut(Long secondarybytesOut) {
        this.secondarybytesOut = secondarybytesOut;
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
        jsonWriter.writeNumberField("primarybytesIn", this.primarybytesIn);
        jsonWriter.writeNumberField("primarybytesOut", this.primarybytesOut);
        jsonWriter.writeNumberField("secondarybytesIn", this.secondarybytesIn);
        jsonWriter.writeNumberField("secondarybytesOut", this.secondarybytesOut);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCircuitStatsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCircuitStatsInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCircuitStatsInner.
     */
    public static ExpressRouteCircuitStatsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCircuitStatsInner deserializedExpressRouteCircuitStatsInner
                = new ExpressRouteCircuitStatsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primarybytesIn".equals(fieldName)) {
                    deserializedExpressRouteCircuitStatsInner.primarybytesIn = reader.getNullable(JsonReader::getLong);
                } else if ("primarybytesOut".equals(fieldName)) {
                    deserializedExpressRouteCircuitStatsInner.primarybytesOut = reader.getNullable(JsonReader::getLong);
                } else if ("secondarybytesIn".equals(fieldName)) {
                    deserializedExpressRouteCircuitStatsInner.secondarybytesIn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("secondarybytesOut".equals(fieldName)) {
                    deserializedExpressRouteCircuitStatsInner.secondarybytesOut
                        = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCircuitStatsInner;
        });
    }
}
