// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Describes the basic gallery artifact publishing profile.
 */
@Fluent
public class GalleryArtifactPublishingProfileBase implements JsonSerializable<GalleryArtifactPublishingProfileBase> {
    /*
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     */
    private List<TargetRegion> targetRegions;

    /*
     * The number of replicas of the Image Version to be created per region. This property would take effect for a
     * region when regionalReplicaCount is not specified. This property is updatable.
     */
    private Integer replicaCount;

    /*
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image
     * Version.
     */
    private Boolean excludeFromLatest;

    /*
     * The timestamp for when the gallery image version is published.
     */
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This
     * property is updatable.
     */
    private OffsetDateTime endOfLifeDate;

    /*
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     */
    private StorageAccountType storageAccountType;

    /*
     * Optional parameter which specifies the mode to be used for replication. This property is not updatable.
     */
    private ReplicationMode replicationMode;

    /*
     * The target extended locations where the Image Version is going to be replicated to. This property is updatable.
     */
    private List<GalleryTargetExtendedLocation> targetExtendedLocations;

    /**
     * Creates an instance of GalleryArtifactPublishingProfileBase class.
     */
    public GalleryArtifactPublishingProfileBase() {
    }

    /**
     * Get the targetRegions property: The target regions where the Image Version is going to be replicated to. This
     * property is updatable.
     * 
     * @return the targetRegions value.
     */
    public List<TargetRegion> targetRegions() {
        return this.targetRegions;
    }

    /**
     * Set the targetRegions property: The target regions where the Image Version is going to be replicated to. This
     * property is updatable.
     * 
     * @param targetRegions the targetRegions value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withTargetRegions(List<TargetRegion> targetRegions) {
        this.targetRegions = targetRegions;
        return this;
    }

    /**
     * Get the replicaCount property: The number of replicas of the Image Version to be created per region. This
     * property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     * @return the replicaCount value.
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount property: The number of replicas of the Image Version to be created per region. This
     * property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     * @param replicaCount the replicaCount value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
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
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the publishedDate property: The timestamp for when the gallery image version is published.
     * 
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Set the publishedDate property: The timestamp for when the gallery image version is published.
     * 
     * @param publishedDate the publishedDate value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    GalleryArtifactPublishingProfileBase withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version. This property can be used for
     * decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version. This property can be used for
     * decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     * 
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     * 
     * @param storageAccountType the storageAccountType value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the replicationMode property: Optional parameter which specifies the mode to be used for replication. This
     * property is not updatable.
     * 
     * @return the replicationMode value.
     */
    public ReplicationMode replicationMode() {
        return this.replicationMode;
    }

    /**
     * Set the replicationMode property: Optional parameter which specifies the mode to be used for replication. This
     * property is not updatable.
     * 
     * @param replicationMode the replicationMode value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withReplicationMode(ReplicationMode replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * Get the targetExtendedLocations property: The target extended locations where the Image Version is going to be
     * replicated to. This property is updatable.
     * 
     * @return the targetExtendedLocations value.
     */
    public List<GalleryTargetExtendedLocation> targetExtendedLocations() {
        return this.targetExtendedLocations;
    }

    /**
     * Set the targetExtendedLocations property: The target extended locations where the Image Version is going to be
     * replicated to. This property is updatable.
     * 
     * @param targetExtendedLocations the targetExtendedLocations value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase
        withTargetExtendedLocations(List<GalleryTargetExtendedLocation> targetExtendedLocations) {
        this.targetExtendedLocations = targetExtendedLocations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetRegions() != null) {
            targetRegions().forEach(e -> e.validate());
        }
        if (targetExtendedLocations() != null) {
            targetExtendedLocations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("targetRegions", this.targetRegions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("replicaCount", this.replicaCount);
        jsonWriter.writeBooleanField("excludeFromLatest", this.excludeFromLatest);
        jsonWriter.writeStringField("endOfLifeDate",
            this.endOfLifeDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endOfLifeDate));
        jsonWriter.writeStringField("storageAccountType",
            this.storageAccountType == null ? null : this.storageAccountType.toString());
        jsonWriter.writeStringField("replicationMode",
            this.replicationMode == null ? null : this.replicationMode.toString());
        jsonWriter.writeArrayField("targetExtendedLocations", this.targetExtendedLocations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryArtifactPublishingProfileBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryArtifactPublishingProfileBase if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GalleryArtifactPublishingProfileBase.
     */
    public static GalleryArtifactPublishingProfileBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryArtifactPublishingProfileBase deserializedGalleryArtifactPublishingProfileBase
                = new GalleryArtifactPublishingProfileBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetRegions".equals(fieldName)) {
                    List<TargetRegion> targetRegions = reader.readArray(reader1 -> TargetRegion.fromJson(reader1));
                    deserializedGalleryArtifactPublishingProfileBase.targetRegions = targetRegions;
                } else if ("replicaCount".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.replicaCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("excludeFromLatest".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.excludeFromLatest
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("publishedDate".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.publishedDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endOfLifeDate".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.endOfLifeDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("storageAccountType".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.storageAccountType
                        = StorageAccountType.fromString(reader.getString());
                } else if ("replicationMode".equals(fieldName)) {
                    deserializedGalleryArtifactPublishingProfileBase.replicationMode
                        = ReplicationMode.fromString(reader.getString());
                } else if ("targetExtendedLocations".equals(fieldName)) {
                    List<GalleryTargetExtendedLocation> targetExtendedLocations
                        = reader.readArray(reader1 -> GalleryTargetExtendedLocation.fromJson(reader1));
                    deserializedGalleryArtifactPublishingProfileBase.targetExtendedLocations = targetExtendedLocations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryArtifactPublishingProfileBase;
        });
    }
}
