// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * This is the safety profile of the Gallery Image Version.
 */
@Fluent
public final class GalleryImageVersionSafetyProfile extends GalleryArtifactSafetyProfileBase {
    /*
     * Indicates whether this image has been reported as violating Microsoft's policies.
     */
    private Boolean reportedForPolicyViolation;

    /*
     * A list of Policy Violations that have been reported for this Gallery Image Version.
     */
    private List<PolicyViolation> policyViolations;

    /**
     * Creates an instance of GalleryImageVersionSafetyProfile class.
     */
    public GalleryImageVersionSafetyProfile() {
    }

    /**
     * Get the reportedForPolicyViolation property: Indicates whether this image has been reported as violating
     * Microsoft's policies.
     * 
     * @return the reportedForPolicyViolation value.
     */
    public Boolean reportedForPolicyViolation() {
        return this.reportedForPolicyViolation;
    }

    /**
     * Get the policyViolations property: A list of Policy Violations that have been reported for this Gallery Image
     * Version.
     * 
     * @return the policyViolations value.
     */
    public List<PolicyViolation> policyViolations() {
        return this.policyViolations;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryImageVersionSafetyProfile
        withAllowDeletionOfReplicatedLocations(Boolean allowDeletionOfReplicatedLocations) {
        super.withAllowDeletionOfReplicatedLocations(allowDeletionOfReplicatedLocations);
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
        if (policyViolations() != null) {
            policyViolations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("allowDeletionOfReplicatedLocations", allowDeletionOfReplicatedLocations());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryImageVersionSafetyProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryImageVersionSafetyProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GalleryImageVersionSafetyProfile.
     */
    public static GalleryImageVersionSafetyProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryImageVersionSafetyProfile deserializedGalleryImageVersionSafetyProfile
                = new GalleryImageVersionSafetyProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowDeletionOfReplicatedLocations".equals(fieldName)) {
                    deserializedGalleryImageVersionSafetyProfile
                        .withAllowDeletionOfReplicatedLocations(reader.getNullable(JsonReader::getBoolean));
                } else if ("reportedForPolicyViolation".equals(fieldName)) {
                    deserializedGalleryImageVersionSafetyProfile.reportedForPolicyViolation
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("policyViolations".equals(fieldName)) {
                    List<PolicyViolation> policyViolations
                        = reader.readArray(reader1 -> PolicyViolation.fromJson(reader1));
                    deserializedGalleryImageVersionSafetyProfile.policyViolations = policyViolations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryImageVersionSafetyProfile;
        });
    }
}
