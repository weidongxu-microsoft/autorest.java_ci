// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.NetworkManagerDeploymentStatus;
import java.io.IOException;
import java.util.List;

/**
 * A list of Network Manager Deployment Status.
 */
@Fluent
public final class NetworkManagerDeploymentStatusListResultInner
    implements JsonSerializable<NetworkManagerDeploymentStatusListResultInner> {
    /*
     * Gets a page of Network Manager Deployment Status
     */
    private List<NetworkManagerDeploymentStatus> value;

    /*
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in
     * the current request) to retrieve the next page of data.
     */
    private String skipToken;

    /**
     * Creates an instance of NetworkManagerDeploymentStatusListResultInner class.
     */
    public NetworkManagerDeploymentStatusListResultInner() {
    }

    /**
     * Get the value property: Gets a page of Network Manager Deployment Status.
     * 
     * @return the value value.
     */
    public List<NetworkManagerDeploymentStatus> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of Network Manager Deployment Status.
     * 
     * @param value the value value to set.
     * @return the NetworkManagerDeploymentStatusListResultInner object itself.
     */
    public NetworkManagerDeploymentStatusListResultInner withValue(List<NetworkManagerDeploymentStatus> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @param skipToken the skipToken value to set.
     * @return the NetworkManagerDeploymentStatusListResultInner object itself.
     */
    public NetworkManagerDeploymentStatusListResultInner withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
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
        jsonWriter.writeStringField("skipToken", this.skipToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkManagerDeploymentStatusListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkManagerDeploymentStatusListResultInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkManagerDeploymentStatusListResultInner.
     */
    public static NetworkManagerDeploymentStatusListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkManagerDeploymentStatusListResultInner deserializedNetworkManagerDeploymentStatusListResultInner
                = new NetworkManagerDeploymentStatusListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkManagerDeploymentStatus> value
                        = reader.readArray(reader1 -> NetworkManagerDeploymentStatus.fromJson(reader1));
                    deserializedNetworkManagerDeploymentStatusListResultInner.value = value;
                } else if ("skipToken".equals(fieldName)) {
                    deserializedNetworkManagerDeploymentStatusListResultInner.skipToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkManagerDeploymentStatusListResultInner;
        });
    }
}
