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
import com.azure.resourcemanager.appservice.generated.models.AbnormalTimePeriod;
import com.azure.resourcemanager.appservice.generated.models.AnalysisData;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * DiagnosticAnalysis resource specific properties.
 */
@Fluent
public final class DiagnosticAnalysisProperties implements JsonSerializable<DiagnosticAnalysisProperties> {
    /*
     * Start time of the period
     */
    private OffsetDateTime startTime;

    /*
     * End time of the period
     */
    private OffsetDateTime endTime;

    /*
     * List of time periods.
     */
    private List<AbnormalTimePeriod> abnormalTimePeriods;

    /*
     * Data by each detector
     */
    private List<AnalysisData> payload;

    /*
     * Data by each detector for detectors that did not corelate
     */
    private List<DetectorDefinition> nonCorrelatedDetectors;

    /**
     * Creates an instance of DiagnosticAnalysisProperties class.
     */
    public DiagnosticAnalysisProperties() {
    }

    /**
     * Get the startTime property: Start time of the period.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     * 
     * @param startTime the startTime value to set.
     * @return the DiagnosticAnalysisProperties object itself.
     */
    public DiagnosticAnalysisProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     * 
     * @param endTime the endTime value to set.
     * @return the DiagnosticAnalysisProperties object itself.
     */
    public DiagnosticAnalysisProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the abnormalTimePeriods property: List of time periods.
     * 
     * @return the abnormalTimePeriods value.
     */
    public List<AbnormalTimePeriod> abnormalTimePeriods() {
        return this.abnormalTimePeriods;
    }

    /**
     * Set the abnormalTimePeriods property: List of time periods.
     * 
     * @param abnormalTimePeriods the abnormalTimePeriods value to set.
     * @return the DiagnosticAnalysisProperties object itself.
     */
    public DiagnosticAnalysisProperties withAbnormalTimePeriods(List<AbnormalTimePeriod> abnormalTimePeriods) {
        this.abnormalTimePeriods = abnormalTimePeriods;
        return this;
    }

    /**
     * Get the payload property: Data by each detector.
     * 
     * @return the payload value.
     */
    public List<AnalysisData> payload() {
        return this.payload;
    }

    /**
     * Set the payload property: Data by each detector.
     * 
     * @param payload the payload value to set.
     * @return the DiagnosticAnalysisProperties object itself.
     */
    public DiagnosticAnalysisProperties withPayload(List<AnalysisData> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get the nonCorrelatedDetectors property: Data by each detector for detectors that did not corelate.
     * 
     * @return the nonCorrelatedDetectors value.
     */
    public List<DetectorDefinition> nonCorrelatedDetectors() {
        return this.nonCorrelatedDetectors;
    }

    /**
     * Set the nonCorrelatedDetectors property: Data by each detector for detectors that did not corelate.
     * 
     * @param nonCorrelatedDetectors the nonCorrelatedDetectors value to set.
     * @return the DiagnosticAnalysisProperties object itself.
     */
    public DiagnosticAnalysisProperties withNonCorrelatedDetectors(List<DetectorDefinition> nonCorrelatedDetectors) {
        this.nonCorrelatedDetectors = nonCorrelatedDetectors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (abnormalTimePeriods() != null) {
            abnormalTimePeriods().forEach(e -> e.validate());
        }
        if (payload() != null) {
            payload().forEach(e -> e.validate());
        }
        if (nonCorrelatedDetectors() != null) {
            nonCorrelatedDetectors().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeArrayField("abnormalTimePeriods", this.abnormalTimePeriods,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("payload", this.payload, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("nonCorrelatedDetectors", this.nonCorrelatedDetectors,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticAnalysisProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticAnalysisProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticAnalysisProperties.
     */
    public static DiagnosticAnalysisProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticAnalysisProperties deserializedDiagnosticAnalysisProperties = new DiagnosticAnalysisProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startTime".equals(fieldName)) {
                    deserializedDiagnosticAnalysisProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedDiagnosticAnalysisProperties.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("abnormalTimePeriods".equals(fieldName)) {
                    List<AbnormalTimePeriod> abnormalTimePeriods
                        = reader.readArray(reader1 -> AbnormalTimePeriod.fromJson(reader1));
                    deserializedDiagnosticAnalysisProperties.abnormalTimePeriods = abnormalTimePeriods;
                } else if ("payload".equals(fieldName)) {
                    List<AnalysisData> payload = reader.readArray(reader1 -> AnalysisData.fromJson(reader1));
                    deserializedDiagnosticAnalysisProperties.payload = payload;
                } else if ("nonCorrelatedDetectors".equals(fieldName)) {
                    List<DetectorDefinition> nonCorrelatedDetectors
                        = reader.readArray(reader1 -> DetectorDefinition.fromJson(reader1));
                    deserializedDiagnosticAnalysisProperties.nonCorrelatedDetectors = nonCorrelatedDetectors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticAnalysisProperties;
        });
    }
}
