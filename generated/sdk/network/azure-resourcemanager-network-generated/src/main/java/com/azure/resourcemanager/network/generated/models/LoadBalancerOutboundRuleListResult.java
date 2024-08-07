// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.OutboundRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListOutboundRule API service call.
 */
@Fluent
public final class LoadBalancerOutboundRuleListResult implements JsonSerializable<LoadBalancerOutboundRuleListResult> {
    /*
     * A list of outbound rules in a load balancer.
     */
    private List<OutboundRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of LoadBalancerOutboundRuleListResult class.
     */
    public LoadBalancerOutboundRuleListResult() {
    }

    /**
     * Get the value property: A list of outbound rules in a load balancer.
     * 
     * @return the value value.
     */
    public List<OutboundRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of outbound rules in a load balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerOutboundRuleListResult object itself.
     */
    public LoadBalancerOutboundRuleListResult withValue(List<OutboundRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerOutboundRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerOutboundRuleListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerOutboundRuleListResult.
     */
    public static LoadBalancerOutboundRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerOutboundRuleListResult deserializedLoadBalancerOutboundRuleListResult
                = new LoadBalancerOutboundRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OutboundRuleInner> value = reader.readArray(reader1 -> OutboundRuleInner.fromJson(reader1));
                    deserializedLoadBalancerOutboundRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLoadBalancerOutboundRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerOutboundRuleListResult;
        });
    }
}
