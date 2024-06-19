// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Trigger based on status code.
 */
@Fluent
public final class StatusCodesBasedTrigger implements JsonSerializable<StatusCodesBasedTrigger> {
    /*
     * HTTP status code.
     */
    private Integer status;

    /*
     * Request Sub Status.
     */
    private Integer subStatus;

    /*
     * Win32 error code.
     */
    private Integer win32Status;

    /*
     * Request Count.
     */
    private Integer count;

    /*
     * Time interval.
     */
    private String timeInterval;

    /*
     * Request Path
     */
    private String path;

    /**
     * Creates an instance of StatusCodesBasedTrigger class.
     */
    public StatusCodesBasedTrigger() {
    }

    /**
     * Get the status property: HTTP status code.
     * 
     * @return the status value.
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the status property: HTTP status code.
     * 
     * @param status the status value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subStatus property: Request Sub Status.
     * 
     * @return the subStatus value.
     */
    public Integer subStatus() {
        return this.subStatus;
    }

    /**
     * Set the subStatus property: Request Sub Status.
     * 
     * @param subStatus the subStatus value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withSubStatus(Integer subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * Get the win32Status property: Win32 error code.
     * 
     * @return the win32Status value.
     */
    public Integer win32Status() {
        return this.win32Status;
    }

    /**
     * Set the win32Status property: Win32 error code.
     * 
     * @param win32Status the win32Status value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withWin32Status(Integer win32Status) {
        this.win32Status = win32Status;
        return this;
    }

    /**
     * Get the count property: Request Count.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     * 
     * @param count the count value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     * 
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     * 
     * @param timeInterval the timeInterval value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * Get the path property: Request Path.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Request Path.
     * 
     * @param path the path value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withPath(String path) {
        this.path = path;
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
        jsonWriter.writeNumberField("status", this.status);
        jsonWriter.writeNumberField("subStatus", this.subStatus);
        jsonWriter.writeNumberField("win32Status", this.win32Status);
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeStringField("timeInterval", this.timeInterval);
        jsonWriter.writeStringField("path", this.path);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StatusCodesBasedTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StatusCodesBasedTrigger if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StatusCodesBasedTrigger.
     */
    public static StatusCodesBasedTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StatusCodesBasedTrigger deserializedStatusCodesBasedTrigger = new StatusCodesBasedTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.status = reader.getNullable(JsonReader::getInt);
                } else if ("subStatus".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.subStatus = reader.getNullable(JsonReader::getInt);
                } else if ("win32Status".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.win32Status = reader.getNullable(JsonReader::getInt);
                } else if ("count".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.count = reader.getNullable(JsonReader::getInt);
                } else if ("timeInterval".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.timeInterval = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedStatusCodesBasedTrigger.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStatusCodesBasedTrigger;
        });
    }
}
