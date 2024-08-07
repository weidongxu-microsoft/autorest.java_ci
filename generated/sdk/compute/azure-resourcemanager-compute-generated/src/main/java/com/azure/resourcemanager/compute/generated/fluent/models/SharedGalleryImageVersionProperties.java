// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageVersionStorageProfile;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Describes the properties of a gallery image version.
 */
@Fluent
public final class SharedGalleryImageVersionProperties
    implements JsonSerializable<SharedGalleryImageVersionProperties> {
    /*
     * The published date of the gallery image version Definition. This property can be used for decommissioning
     * purposes. This property is updatable.
     */
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery image version Definition. This property can be used for decommissioning
     * purposes. This property is updatable.
     */
    private OffsetDateTime endOfLifeDate;

    /*
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image
     * Version.
     */
    private Boolean excludeFromLatest;

    /*
     * Describes the storage profile of the image version.
     */
    private SharedGalleryImageVersionStorageProfile storageProfile;

    /*
     * The artifact tags of a shared gallery resource.
     */
    private Map<String, String> artifactTags;

    /**
     * Creates an instance of SharedGalleryImageVersionProperties class.
     */
    public SharedGalleryImageVersionProperties() {
    }

    /**
     * Get the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Set the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @param publishedDate the publishedDate value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     * 
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     * 
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the storageProfile property: Describes the storage profile of the image version.
     * 
     * @return the storageProfile value.
     */
    public SharedGalleryImageVersionStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Describes the storage profile of the image version.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties
        withStorageProfile(SharedGalleryImageVersionStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the artifactTags property: The artifact tags of a shared gallery resource.
     * 
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.artifactTags;
    }

    /**
     * Set the artifactTags property: The artifact tags of a shared gallery resource.
     * 
     * @param artifactTags the artifactTags value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withArtifactTags(Map<String, String> artifactTags) {
        this.artifactTags = artifactTags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("publishedDate",
            this.publishedDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.publishedDate));
        jsonWriter.writeStringField("endOfLifeDate",
            this.endOfLifeDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endOfLifeDate));
        jsonWriter.writeBooleanField("excludeFromLatest", this.excludeFromLatest);
        jsonWriter.writeJsonField("storageProfile", this.storageProfile);
        jsonWriter.writeMapField("artifactTags", this.artifactTags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedGalleryImageVersionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedGalleryImageVersionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedGalleryImageVersionProperties.
     */
    public static SharedGalleryImageVersionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedGalleryImageVersionProperties deserializedSharedGalleryImageVersionProperties
                = new SharedGalleryImageVersionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publishedDate".equals(fieldName)) {
                    deserializedSharedGalleryImageVersionProperties.publishedDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endOfLifeDate".equals(fieldName)) {
                    deserializedSharedGalleryImageVersionProperties.endOfLifeDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("excludeFromLatest".equals(fieldName)) {
                    deserializedSharedGalleryImageVersionProperties.excludeFromLatest
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedSharedGalleryImageVersionProperties.storageProfile
                        = SharedGalleryImageVersionStorageProfile.fromJson(reader);
                } else if ("artifactTags".equals(fieldName)) {
                    Map<String, String> artifactTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSharedGalleryImageVersionProperties.artifactTags = artifactTags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedGalleryImageVersionProperties;
        });
    }
}
