// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ProcessThreadInfo resource specific properties.
 */
@Fluent
public final class ProcessThreadInfoProperties implements JsonSerializable<ProcessThreadInfoProperties> {
    /*
     * Site extension ID.
     */
    private Integer identifier;

    /*
     * HRef URI.
     */
    private String href;

    /*
     * Process URI.
     */
    private String process;

    /*
     * Start address.
     */
    private String startAddress;

    /*
     * Current thread priority.
     */
    private Integer currentPriority;

    /*
     * Thread priority level.
     */
    private String priorityLevel;

    /*
     * Base priority.
     */
    private Integer basePriority;

    /*
     * Start time.
     */
    private OffsetDateTime startTime;

    /*
     * Total processor time.
     */
    private String totalProcessorTime;

    /*
     * User processor time.
     */
    private String userProcessorTime;

    /*
     * Thread state.
     */
    private String state;

    /*
     * Wait reason.
     */
    private String waitReason;

    /**
     * Creates an instance of ProcessThreadInfoProperties class.
     */
    public ProcessThreadInfoProperties() {
    }

    /**
     * Get the identifier property: Site extension ID.
     * 
     * @return the identifier value.
     */
    public Integer identifier() {
        return this.identifier;
    }

    /**
     * Get the href property: HRef URI.
     * 
     * @return the href value.
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href property: HRef URI.
     * 
     * @param href the href value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the process property: Process URI.
     * 
     * @return the process value.
     */
    public String process() {
        return this.process;
    }

    /**
     * Set the process property: Process URI.
     * 
     * @param process the process value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * Get the startAddress property: Start address.
     * 
     * @return the startAddress value.
     */
    public String startAddress() {
        return this.startAddress;
    }

    /**
     * Set the startAddress property: Start address.
     * 
     * @param startAddress the startAddress value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }

    /**
     * Get the currentPriority property: Current thread priority.
     * 
     * @return the currentPriority value.
     */
    public Integer currentPriority() {
        return this.currentPriority;
    }

    /**
     * Set the currentPriority property: Current thread priority.
     * 
     * @param currentPriority the currentPriority value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withCurrentPriority(Integer currentPriority) {
        this.currentPriority = currentPriority;
        return this;
    }

    /**
     * Get the priorityLevel property: Thread priority level.
     * 
     * @return the priorityLevel value.
     */
    public String priorityLevel() {
        return this.priorityLevel;
    }

    /**
     * Set the priorityLevel property: Thread priority level.
     * 
     * @param priorityLevel the priorityLevel value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    /**
     * Get the basePriority property: Base priority.
     * 
     * @return the basePriority value.
     */
    public Integer basePriority() {
        return this.basePriority;
    }

    /**
     * Set the basePriority property: Base priority.
     * 
     * @param basePriority the basePriority value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withBasePriority(Integer basePriority) {
        this.basePriority = basePriority;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time.
     * 
     * @param startTime the startTime value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the totalProcessorTime property: Total processor time.
     * 
     * @return the totalProcessorTime value.
     */
    public String totalProcessorTime() {
        return this.totalProcessorTime;
    }

    /**
     * Set the totalProcessorTime property: Total processor time.
     * 
     * @param totalProcessorTime the totalProcessorTime value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withTotalProcessorTime(String totalProcessorTime) {
        this.totalProcessorTime = totalProcessorTime;
        return this;
    }

    /**
     * Get the userProcessorTime property: User processor time.
     * 
     * @return the userProcessorTime value.
     */
    public String userProcessorTime() {
        return this.userProcessorTime;
    }

    /**
     * Set the userProcessorTime property: User processor time.
     * 
     * @param userProcessorTime the userProcessorTime value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withUserProcessorTime(String userProcessorTime) {
        this.userProcessorTime = userProcessorTime;
        return this;
    }

    /**
     * Get the state property: Thread state.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: Thread state.
     * 
     * @param state the state value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the waitReason property: Wait reason.
     * 
     * @return the waitReason value.
     */
    public String waitReason() {
        return this.waitReason;
    }

    /**
     * Set the waitReason property: Wait reason.
     * 
     * @param waitReason the waitReason value to set.
     * @return the ProcessThreadInfoProperties object itself.
     */
    public ProcessThreadInfoProperties withWaitReason(String waitReason) {
        this.waitReason = waitReason;
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
        jsonWriter.writeStringField("href", this.href);
        jsonWriter.writeStringField("process", this.process);
        jsonWriter.writeStringField("start_address", this.startAddress);
        jsonWriter.writeNumberField("current_priority", this.currentPriority);
        jsonWriter.writeStringField("priority_level", this.priorityLevel);
        jsonWriter.writeNumberField("base_priority", this.basePriority);
        jsonWriter.writeStringField("start_time",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("total_processor_time", this.totalProcessorTime);
        jsonWriter.writeStringField("user_processor_time", this.userProcessorTime);
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("wait_reason", this.waitReason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProcessThreadInfoProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProcessThreadInfoProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProcessThreadInfoProperties.
     */
    public static ProcessThreadInfoProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProcessThreadInfoProperties deserializedProcessThreadInfoProperties = new ProcessThreadInfoProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identifier".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.identifier = reader.getNullable(JsonReader::getInt);
                } else if ("href".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.href = reader.getString();
                } else if ("process".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.process = reader.getString();
                } else if ("start_address".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.startAddress = reader.getString();
                } else if ("current_priority".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.currentPriority = reader.getNullable(JsonReader::getInt);
                } else if ("priority_level".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.priorityLevel = reader.getString();
                } else if ("base_priority".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.basePriority = reader.getNullable(JsonReader::getInt);
                } else if ("start_time".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("total_processor_time".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.totalProcessorTime = reader.getString();
                } else if ("user_processor_time".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.userProcessorTime = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.state = reader.getString();
                } else if ("wait_reason".equals(fieldName)) {
                    deserializedProcessThreadInfoProperties.waitReason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProcessThreadInfoProperties;
        });
    }
}
