// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This is the data disk image.
 */
@Fluent
public final class SharedGalleryDataDiskImage extends SharedGalleryDiskImage {
    /*
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks
     * within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     */
    private int lun;

    /*
     * This property indicates the size of the VHD to be created.
     */
    private Integer diskSizeGB;

    /**
     * Creates an instance of SharedGalleryDataDiskImage class.
     */
    public SharedGalleryDataDiskImage() {
    }

    /**
     * Get the lun property: This property specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the
     * Virtual Machine.
     * 
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: This property specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the
     * Virtual Machine.
     * 
     * @param lun the lun value to set.
     * @return the SharedGalleryDataDiskImage object itself.
     */
    public SharedGalleryDataDiskImage withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the diskSizeGB property: This property indicates the size of the VHD to be created.
     * 
     * @return the diskSizeGB value.
     */
    @Override
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharedGalleryDataDiskImage withHostCaching(SharedGalleryHostCaching hostCaching) {
        super.withHostCaching(hostCaching);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostCaching", hostCaching() == null ? null : hostCaching().toString());
        jsonWriter.writeIntField("lun", this.lun);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedGalleryDataDiskImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedGalleryDataDiskImage if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SharedGalleryDataDiskImage.
     */
    public static SharedGalleryDataDiskImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedGalleryDataDiskImage deserializedSharedGalleryDataDiskImage = new SharedGalleryDataDiskImage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskSizeGB".equals(fieldName)) {
                    deserializedSharedGalleryDataDiskImage.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("hostCaching".equals(fieldName)) {
                    deserializedSharedGalleryDataDiskImage
                        .withHostCaching(SharedGalleryHostCaching.fromString(reader.getString()));
                } else if ("lun".equals(fieldName)) {
                    deserializedSharedGalleryDataDiskImage.lun = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedGalleryDataDiskImage;
        });
    }
}
