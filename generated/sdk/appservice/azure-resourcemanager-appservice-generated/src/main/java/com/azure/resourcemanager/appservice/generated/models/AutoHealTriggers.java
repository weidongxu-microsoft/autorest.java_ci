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
import java.util.List;

/**
 * Triggers for auto-heal.
 */
@Fluent
public final class AutoHealTriggers implements JsonSerializable<AutoHealTriggers> {
    /*
     * A rule based on total requests.
     */
    private RequestsBasedTrigger requests;

    /*
     * A rule based on private bytes.
     */
    private Integer privateBytesInKB;

    /*
     * A rule based on status codes.
     */
    private List<StatusCodesBasedTrigger> statusCodes;

    /*
     * A rule based on request execution time.
     */
    private SlowRequestsBasedTrigger slowRequests;

    /*
     * A rule based on multiple Slow Requests Rule with path
     */
    private List<SlowRequestsBasedTrigger> slowRequestsWithPath;

    /*
     * A rule based on status codes ranges.
     */
    private List<StatusCodesRangeBasedTrigger> statusCodesRange;

    /**
     * Creates an instance of AutoHealTriggers class.
     */
    public AutoHealTriggers() {
    }

    /**
     * Get the requests property: A rule based on total requests.
     * 
     * @return the requests value.
     */
    public RequestsBasedTrigger requests() {
        return this.requests;
    }

    /**
     * Set the requests property: A rule based on total requests.
     * 
     * @param requests the requests value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withRequests(RequestsBasedTrigger requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the privateBytesInKB property: A rule based on private bytes.
     * 
     * @return the privateBytesInKB value.
     */
    public Integer privateBytesInKB() {
        return this.privateBytesInKB;
    }

    /**
     * Set the privateBytesInKB property: A rule based on private bytes.
     * 
     * @param privateBytesInKB the privateBytesInKB value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withPrivateBytesInKB(Integer privateBytesInKB) {
        this.privateBytesInKB = privateBytesInKB;
        return this;
    }

    /**
     * Get the statusCodes property: A rule based on status codes.
     * 
     * @return the statusCodes value.
     */
    public List<StatusCodesBasedTrigger> statusCodes() {
        return this.statusCodes;
    }

    /**
     * Set the statusCodes property: A rule based on status codes.
     * 
     * @param statusCodes the statusCodes value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withStatusCodes(List<StatusCodesBasedTrigger> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    /**
     * Get the slowRequests property: A rule based on request execution time.
     * 
     * @return the slowRequests value.
     */
    public SlowRequestsBasedTrigger slowRequests() {
        return this.slowRequests;
    }

    /**
     * Set the slowRequests property: A rule based on request execution time.
     * 
     * @param slowRequests the slowRequests value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withSlowRequests(SlowRequestsBasedTrigger slowRequests) {
        this.slowRequests = slowRequests;
        return this;
    }

    /**
     * Get the slowRequestsWithPath property: A rule based on multiple Slow Requests Rule with path.
     * 
     * @return the slowRequestsWithPath value.
     */
    public List<SlowRequestsBasedTrigger> slowRequestsWithPath() {
        return this.slowRequestsWithPath;
    }

    /**
     * Set the slowRequestsWithPath property: A rule based on multiple Slow Requests Rule with path.
     * 
     * @param slowRequestsWithPath the slowRequestsWithPath value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withSlowRequestsWithPath(List<SlowRequestsBasedTrigger> slowRequestsWithPath) {
        this.slowRequestsWithPath = slowRequestsWithPath;
        return this;
    }

    /**
     * Get the statusCodesRange property: A rule based on status codes ranges.
     * 
     * @return the statusCodesRange value.
     */
    public List<StatusCodesRangeBasedTrigger> statusCodesRange() {
        return this.statusCodesRange;
    }

    /**
     * Set the statusCodesRange property: A rule based on status codes ranges.
     * 
     * @param statusCodesRange the statusCodesRange value to set.
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withStatusCodesRange(List<StatusCodesRangeBasedTrigger> statusCodesRange) {
        this.statusCodesRange = statusCodesRange;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requests() != null) {
            requests().validate();
        }
        if (statusCodes() != null) {
            statusCodes().forEach(e -> e.validate());
        }
        if (slowRequests() != null) {
            slowRequests().validate();
        }
        if (slowRequestsWithPath() != null) {
            slowRequestsWithPath().forEach(e -> e.validate());
        }
        if (statusCodesRange() != null) {
            statusCodesRange().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("requests", this.requests);
        jsonWriter.writeNumberField("privateBytesInKB", this.privateBytesInKB);
        jsonWriter.writeArrayField("statusCodes", this.statusCodes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("slowRequests", this.slowRequests);
        jsonWriter.writeArrayField("slowRequestsWithPath", this.slowRequestsWithPath,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("statusCodesRange", this.statusCodesRange,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoHealTriggers from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoHealTriggers if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutoHealTriggers.
     */
    public static AutoHealTriggers fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoHealTriggers deserializedAutoHealTriggers = new AutoHealTriggers();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("requests".equals(fieldName)) {
                    deserializedAutoHealTriggers.requests = RequestsBasedTrigger.fromJson(reader);
                } else if ("privateBytesInKB".equals(fieldName)) {
                    deserializedAutoHealTriggers.privateBytesInKB = reader.getNullable(JsonReader::getInt);
                } else if ("statusCodes".equals(fieldName)) {
                    List<StatusCodesBasedTrigger> statusCodes
                        = reader.readArray(reader1 -> StatusCodesBasedTrigger.fromJson(reader1));
                    deserializedAutoHealTriggers.statusCodes = statusCodes;
                } else if ("slowRequests".equals(fieldName)) {
                    deserializedAutoHealTriggers.slowRequests = SlowRequestsBasedTrigger.fromJson(reader);
                } else if ("slowRequestsWithPath".equals(fieldName)) {
                    List<SlowRequestsBasedTrigger> slowRequestsWithPath
                        = reader.readArray(reader1 -> SlowRequestsBasedTrigger.fromJson(reader1));
                    deserializedAutoHealTriggers.slowRequestsWithPath = slowRequestsWithPath;
                } else if ("statusCodesRange".equals(fieldName)) {
                    List<StatusCodesRangeBasedTrigger> statusCodesRange
                        = reader.readArray(reader1 -> StatusCodesRangeBasedTrigger.fromJson(reader1));
                    deserializedAutoHealTriggers.statusCodesRange = statusCodesRange;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoHealTriggers;
        });
    }
}
