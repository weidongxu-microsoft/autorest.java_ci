// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class to represent shoebox service specification in json client discovery.
 */
@Fluent
public final class ClientDiscoveryForServiceSpecification
    implements JsonSerializable<ClientDiscoveryForServiceSpecification> {
    /*
     * List of log specifications of this operation.
     */
    private List<ClientDiscoveryForLogSpecification> logSpecifications;

    /**
     * Creates an instance of ClientDiscoveryForServiceSpecification class.
     */
    public ClientDiscoveryForServiceSpecification() {
    }

    /**
     * Get the logSpecifications property: List of log specifications of this operation.
     * 
     * @return the logSpecifications value.
     */
    public List<ClientDiscoveryForLogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: List of log specifications of this operation.
     * 
     * @param logSpecifications the logSpecifications value to set.
     * @return the ClientDiscoveryForServiceSpecification object itself.
     */
    public ClientDiscoveryForServiceSpecification
        withLogSpecifications(List<ClientDiscoveryForLogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("logSpecifications", this.logSpecifications,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientDiscoveryForServiceSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientDiscoveryForServiceSpecification if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClientDiscoveryForServiceSpecification.
     */
    public static ClientDiscoveryForServiceSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientDiscoveryForServiceSpecification deserializedClientDiscoveryForServiceSpecification
                = new ClientDiscoveryForServiceSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logSpecifications".equals(fieldName)) {
                    List<ClientDiscoveryForLogSpecification> logSpecifications
                        = reader.readArray(reader1 -> ClientDiscoveryForLogSpecification.fromJson(reader1));
                    deserializedClientDiscoveryForServiceSpecification.logSpecifications = logSpecifications;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientDiscoveryForServiceSpecification;
        });
    }
}
