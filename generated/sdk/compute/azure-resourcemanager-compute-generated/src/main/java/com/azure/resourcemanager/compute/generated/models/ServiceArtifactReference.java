// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies the service artifact reference id used to set same image version for all virtual machines in the scale set
 * when using 'latest' image version. Minimum api-version: 2022-11-01.
 */
@Fluent
public final class ServiceArtifactReference implements JsonSerializable<ServiceArtifactReference> {
    /*
     * The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName
     * }/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}
     */
    private String id;

    /**
     * Creates an instance of ServiceArtifactReference class.
     */
    public ServiceArtifactReference() {
    }

    /**
     * Get the id property: The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     * 
     * @param id the id value to set.
     * @return the ServiceArtifactReference object itself.
     */
    public ServiceArtifactReference withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceArtifactReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceArtifactReference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceArtifactReference.
     */
    public static ServiceArtifactReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceArtifactReference deserializedServiceArtifactReference = new ServiceArtifactReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedServiceArtifactReference.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceArtifactReference;
        });
    }
}
