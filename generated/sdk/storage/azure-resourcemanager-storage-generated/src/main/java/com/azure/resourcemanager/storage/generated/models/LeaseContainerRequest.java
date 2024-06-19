// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Lease Container request schema.
 */
@Fluent
public final class LeaseContainerRequest implements JsonSerializable<LeaseContainerRequest> {
    /*
     * Specifies the lease action. Can be one of the available actions.
     */
    private LeaseContainerRequestAction action;

    /*
     * Identifies the lease. Can be specified in any valid GUID string format.
     */
    private String leaseId;

    /*
     * Optional. For a break action, proposed duration the lease should continue before it is broken, in seconds,
     * between 0 and 60.
     */
    private Integer breakPeriod;

    /*
     * Required for acquire. Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that
     * never expires.
     */
    private Integer leaseDuration;

    /*
     * Optional for acquire, required for change. Proposed lease ID, in a GUID string format.
     */
    private String proposedLeaseId;

    /**
     * Creates an instance of LeaseContainerRequest class.
     */
    public LeaseContainerRequest() {
    }

    /**
     * Get the action property: Specifies the lease action. Can be one of the available actions.
     * 
     * @return the action value.
     */
    public LeaseContainerRequestAction action() {
        return this.action;
    }

    /**
     * Set the action property: Specifies the lease action. Can be one of the available actions.
     * 
     * @param action the action value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withAction(LeaseContainerRequestAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the leaseId property: Identifies the lease. Can be specified in any valid GUID string format.
     * 
     * @return the leaseId value.
     */
    public String leaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: Identifies the lease. Can be specified in any valid GUID string format.
     * 
     * @param leaseId the leaseId value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get the breakPeriod property: Optional. For a break action, proposed duration the lease should continue before it
     * is broken, in seconds, between 0 and 60.
     * 
     * @return the breakPeriod value.
     */
    public Integer breakPeriod() {
        return this.breakPeriod;
    }

    /**
     * Set the breakPeriod property: Optional. For a break action, proposed duration the lease should continue before it
     * is broken, in seconds, between 0 and 60.
     * 
     * @param breakPeriod the breakPeriod value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withBreakPeriod(Integer breakPeriod) {
        this.breakPeriod = breakPeriod;
        return this;
    }

    /**
     * Get the leaseDuration property: Required for acquire. Specifies the duration of the lease, in seconds, or
     * negative one (-1) for a lease that never expires.
     * 
     * @return the leaseDuration value.
     */
    public Integer leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: Required for acquire. Specifies the duration of the lease, in seconds, or
     * negative one (-1) for a lease that never expires.
     * 
     * @param leaseDuration the leaseDuration value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseDuration(Integer leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the proposedLeaseId property: Optional for acquire, required for change. Proposed lease ID, in a GUID string
     * format.
     * 
     * @return the proposedLeaseId value.
     */
    public String proposedLeaseId() {
        return this.proposedLeaseId;
    }

    /**
     * Set the proposedLeaseId property: Optional for acquire, required for change. Proposed lease ID, in a GUID string
     * format.
     * 
     * @param proposedLeaseId the proposedLeaseId value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withProposedLeaseId(String proposedLeaseId) {
        this.proposedLeaseId = proposedLeaseId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property action in model LeaseContainerRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LeaseContainerRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        jsonWriter.writeStringField("leaseId", this.leaseId);
        jsonWriter.writeNumberField("breakPeriod", this.breakPeriod);
        jsonWriter.writeNumberField("leaseDuration", this.leaseDuration);
        jsonWriter.writeStringField("proposedLeaseId", this.proposedLeaseId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LeaseContainerRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LeaseContainerRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LeaseContainerRequest.
     */
    public static LeaseContainerRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LeaseContainerRequest deserializedLeaseContainerRequest = new LeaseContainerRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action".equals(fieldName)) {
                    deserializedLeaseContainerRequest.action
                        = LeaseContainerRequestAction.fromString(reader.getString());
                } else if ("leaseId".equals(fieldName)) {
                    deserializedLeaseContainerRequest.leaseId = reader.getString();
                } else if ("breakPeriod".equals(fieldName)) {
                    deserializedLeaseContainerRequest.breakPeriod = reader.getNullable(JsonReader::getInt);
                } else if ("leaseDuration".equals(fieldName)) {
                    deserializedLeaseContainerRequest.leaseDuration = reader.getNullable(JsonReader::getInt);
                } else if ("proposedLeaseId".equals(fieldName)) {
                    deserializedLeaseContainerRequest.proposedLeaseId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLeaseContainerRequest;
        });
    }
}
