// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A list of services that support encryption.
 */
@Fluent
public final class EncryptionServices implements JsonSerializable<EncryptionServices> {
    /*
     * The encryption function of the blob storage service.
     */
    private EncryptionService blob;

    /*
     * The encryption function of the file storage service.
     */
    private EncryptionService file;

    /*
     * The encryption function of the table storage service.
     */
    private EncryptionService table;

    /*
     * The encryption function of the queue storage service.
     */
    private EncryptionService queue;

    /**
     * Creates an instance of EncryptionServices class.
     */
    public EncryptionServices() {
    }

    /**
     * Get the blob property: The encryption function of the blob storage service.
     * 
     * @return the blob value.
     */
    public EncryptionService blob() {
        return this.blob;
    }

    /**
     * Set the blob property: The encryption function of the blob storage service.
     * 
     * @param blob the blob value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withBlob(EncryptionService blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Get the file property: The encryption function of the file storage service.
     * 
     * @return the file value.
     */
    public EncryptionService file() {
        return this.file;
    }

    /**
     * Set the file property: The encryption function of the file storage service.
     * 
     * @param file the file value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withFile(EncryptionService file) {
        this.file = file;
        return this;
    }

    /**
     * Get the table property: The encryption function of the table storage service.
     * 
     * @return the table value.
     */
    public EncryptionService table() {
        return this.table;
    }

    /**
     * Set the table property: The encryption function of the table storage service.
     * 
     * @param table the table value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withTable(EncryptionService table) {
        this.table = table;
        return this;
    }

    /**
     * Get the queue property: The encryption function of the queue storage service.
     * 
     * @return the queue value.
     */
    public EncryptionService queue() {
        return this.queue;
    }

    /**
     * Set the queue property: The encryption function of the queue storage service.
     * 
     * @param queue the queue value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withQueue(EncryptionService queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blob() != null) {
            blob().validate();
        }
        if (file() != null) {
            file().validate();
        }
        if (table() != null) {
            table().validate();
        }
        if (queue() != null) {
            queue().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("blob", this.blob);
        jsonWriter.writeJsonField("file", this.file);
        jsonWriter.writeJsonField("table", this.table);
        jsonWriter.writeJsonField("queue", this.queue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionServices from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionServices if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionServices.
     */
    public static EncryptionServices fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionServices deserializedEncryptionServices = new EncryptionServices();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blob".equals(fieldName)) {
                    deserializedEncryptionServices.blob = EncryptionService.fromJson(reader);
                } else if ("file".equals(fieldName)) {
                    deserializedEncryptionServices.file = EncryptionService.fromJson(reader);
                } else if ("table".equals(fieldName)) {
                    deserializedEncryptionServices.table = EncryptionService.fromJson(reader);
                } else if ("queue".equals(fieldName)) {
                    deserializedEncryptionServices.queue = EncryptionService.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionServices;
        });
    }
}
