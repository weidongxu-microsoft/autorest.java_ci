// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListFrontendIPConfiguration API service call.
 */
@Fluent
public final class LoadBalancerFrontendIpConfigurationListResult
    implements JsonSerializable<LoadBalancerFrontendIpConfigurationListResult> {
    /*
     * A list of frontend IP configurations in a load balancer.
     */
    private List<FrontendIpConfigurationInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of LoadBalancerFrontendIpConfigurationListResult class.
     */
    public LoadBalancerFrontendIpConfigurationListResult() {
    }

    /**
     * Get the value property: A list of frontend IP configurations in a load balancer.
     * 
     * @return the value value.
     */
    public List<FrontendIpConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of frontend IP configurations in a load balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerFrontendIpConfigurationListResult object itself.
     */
    public LoadBalancerFrontendIpConfigurationListResult withValue(List<FrontendIpConfigurationInner> value) {
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
     * Reads an instance of LoadBalancerFrontendIpConfigurationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerFrontendIpConfigurationListResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerFrontendIpConfigurationListResult.
     */
    public static LoadBalancerFrontendIpConfigurationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerFrontendIpConfigurationListResult deserializedLoadBalancerFrontendIpConfigurationListResult
                = new LoadBalancerFrontendIpConfigurationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FrontendIpConfigurationInner> value
                        = reader.readArray(reader1 -> FrontendIpConfigurationInner.fromJson(reader1));
                    deserializedLoadBalancerFrontendIpConfigurationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLoadBalancerFrontendIpConfigurationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerFrontendIpConfigurationListResult;
        });
    }
}
