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
import java.util.List;

/**
 * This is the storage profile of a Gallery Image Version.
 */
@Fluent
public final class SharedGalleryImageVersionStorageProfile
    implements JsonSerializable<SharedGalleryImageVersionStorageProfile> {
    /*
     * This is the OS disk image.
     */
    private SharedGalleryOSDiskImage osDiskImage;

    /*
     * A list of data disk images.
     */
    private List<SharedGalleryDataDiskImage> dataDiskImages;

    /**
     * Creates an instance of SharedGalleryImageVersionStorageProfile class.
     */
    public SharedGalleryImageVersionStorageProfile() {
    }

    /**
     * Get the osDiskImage property: This is the OS disk image.
     * 
     * @return the osDiskImage value.
     */
    public SharedGalleryOSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: This is the OS disk image.
     * 
     * @param osDiskImage the osDiskImage value to set.
     * @return the SharedGalleryImageVersionStorageProfile object itself.
     */
    public SharedGalleryImageVersionStorageProfile withOsDiskImage(SharedGalleryOSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: A list of data disk images.
     * 
     * @return the dataDiskImages value.
     */
    public List<SharedGalleryDataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: A list of data disk images.
     * 
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the SharedGalleryImageVersionStorageProfile object itself.
     */
    public SharedGalleryImageVersionStorageProfile withDataDiskImages(List<SharedGalleryDataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("osDiskImage", this.osDiskImage);
        jsonWriter.writeArrayField("dataDiskImages", this.dataDiskImages,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedGalleryImageVersionStorageProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedGalleryImageVersionStorageProfile if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedGalleryImageVersionStorageProfile.
     */
    public static SharedGalleryImageVersionStorageProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedGalleryImageVersionStorageProfile deserializedSharedGalleryImageVersionStorageProfile
                = new SharedGalleryImageVersionStorageProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("osDiskImage".equals(fieldName)) {
                    deserializedSharedGalleryImageVersionStorageProfile.osDiskImage
                        = SharedGalleryOSDiskImage.fromJson(reader);
                } else if ("dataDiskImages".equals(fieldName)) {
                    List<SharedGalleryDataDiskImage> dataDiskImages
                        = reader.readArray(reader1 -> SharedGalleryDataDiskImage.fromJson(reader1));
                    deserializedSharedGalleryImageVersionStorageProfile.dataDiskImages = dataDiskImages;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedGalleryImageVersionStorageProfile;
        });
    }
}
