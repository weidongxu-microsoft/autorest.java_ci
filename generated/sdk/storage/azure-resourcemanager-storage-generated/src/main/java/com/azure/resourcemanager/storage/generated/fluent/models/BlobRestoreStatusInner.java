// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreParameters;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreProgressStatus;
import java.io.IOException;

/**
 * Blob restore status.
 */
@Immutable
public final class BlobRestoreStatusInner implements JsonSerializable<BlobRestoreStatusInner> {
    /*
     * The status of blob restore progress. Possible values are: - InProgress: Indicates that blob restore is ongoing. -
     * Complete: Indicates that blob restore has been completed successfully. - Failed: Indicates that blob restore is
     * failed.
     */
    private BlobRestoreProgressStatus status;

    /*
     * Failure reason when blob restore is failed.
     */
    private String failureReason;

    /*
     * Id for tracking blob restore request.
     */
    private String restoreId;

    /*
     * Blob restore request parameters.
     */
    private BlobRestoreParameters parameters;

    /**
     * Creates an instance of BlobRestoreStatusInner class.
     */
    public BlobRestoreStatusInner() {
    }

    /**
     * Get the status property: The status of blob restore progress. Possible values are: - InProgress: Indicates that
     * blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed:
     * Indicates that blob restore is failed.
     * 
     * @return the status value.
     */
    public BlobRestoreProgressStatus status() {
        return this.status;
    }

    /**
     * Get the failureReason property: Failure reason when blob restore is failed.
     * 
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Get the restoreId property: Id for tracking blob restore request.
     * 
     * @return the restoreId value.
     */
    public String restoreId() {
        return this.restoreId;
    }

    /**
     * Get the parameters property: Blob restore request parameters.
     * 
     * @return the parameters value.
     */
    public BlobRestoreParameters parameters() {
        return this.parameters;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobRestoreStatusInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobRestoreStatusInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BlobRestoreStatusInner.
     */
    public static BlobRestoreStatusInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobRestoreStatusInner deserializedBlobRestoreStatusInner = new BlobRestoreStatusInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedBlobRestoreStatusInner.status
                        = BlobRestoreProgressStatus.fromString(reader.getString());
                } else if ("failureReason".equals(fieldName)) {
                    deserializedBlobRestoreStatusInner.failureReason = reader.getString();
                } else if ("restoreId".equals(fieldName)) {
                    deserializedBlobRestoreStatusInner.restoreId = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    deserializedBlobRestoreStatusInner.parameters = BlobRestoreParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobRestoreStatusInner;
        });
    }
}
