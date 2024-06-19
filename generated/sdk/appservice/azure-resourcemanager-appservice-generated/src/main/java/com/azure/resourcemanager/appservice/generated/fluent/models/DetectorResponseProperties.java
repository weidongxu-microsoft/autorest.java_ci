// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.DataProviderMetadata;
import com.azure.resourcemanager.appservice.generated.models.DetectorInfo;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticData;
import com.azure.resourcemanager.appservice.generated.models.QueryUtterancesResults;
import com.azure.resourcemanager.appservice.generated.models.Status;
import java.io.IOException;
import java.util.List;

/**
 * DetectorResponse resource specific properties.
 */
@Fluent
public final class DetectorResponseProperties implements JsonSerializable<DetectorResponseProperties> {
    /*
     * metadata for the detector
     */
    private DetectorInfo metadata;

    /*
     * Data Set
     */
    private List<DiagnosticData> dataset;

    /*
     * Indicates status of the most severe insight.
     */
    private Status status;

    /*
     * Additional configuration for different data providers to be used by the UI
     */
    private List<DataProviderMetadata> dataProvidersMetadata;

    /*
     * Suggested utterances where the detector can be applicable.
     */
    private QueryUtterancesResults suggestedUtterances;

    /**
     * Creates an instance of DetectorResponseProperties class.
     */
    public DetectorResponseProperties() {
    }

    /**
     * Get the metadata property: metadata for the detector.
     * 
     * @return the metadata value.
     */
    public DetectorInfo metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: metadata for the detector.
     * 
     * @param metadata the metadata value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withMetadata(DetectorInfo metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the dataset property: Data Set.
     * 
     * @return the dataset value.
     */
    public List<DiagnosticData> dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Data Set.
     * 
     * @param dataset the dataset value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withDataset(List<DiagnosticData> dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the status property: Indicates status of the most severe insight.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates status of the most severe insight.
     * 
     * @param status the status value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     * 
     * @return the dataProvidersMetadata value.
     */
    public List<DataProviderMetadata> dataProvidersMetadata() {
        return this.dataProvidersMetadata;
    }

    /**
     * Set the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     * 
     * @param dataProvidersMetadata the dataProvidersMetadata value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withDataProvidersMetadata(List<DataProviderMetadata> dataProvidersMetadata) {
        this.dataProvidersMetadata = dataProvidersMetadata;
        return this;
    }

    /**
     * Get the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     * 
     * @return the suggestedUtterances value.
     */
    public QueryUtterancesResults suggestedUtterances() {
        return this.suggestedUtterances;
    }

    /**
     * Set the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     * 
     * @param suggestedUtterances the suggestedUtterances value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withSuggestedUtterances(QueryUtterancesResults suggestedUtterances) {
        this.suggestedUtterances = suggestedUtterances;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (dataset() != null) {
            dataset().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
        if (dataProvidersMetadata() != null) {
            dataProvidersMetadata().forEach(e -> e.validate());
        }
        if (suggestedUtterances() != null) {
            suggestedUtterances().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("metadata", this.metadata);
        jsonWriter.writeArrayField("dataset", this.dataset, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("status", this.status);
        jsonWriter.writeArrayField("dataProvidersMetadata", this.dataProvidersMetadata,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("suggestedUtterances", this.suggestedUtterances);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DetectorResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DetectorResponseProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DetectorResponseProperties.
     */
    public static DetectorResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DetectorResponseProperties deserializedDetectorResponseProperties = new DetectorResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metadata".equals(fieldName)) {
                    deserializedDetectorResponseProperties.metadata = DetectorInfo.fromJson(reader);
                } else if ("dataset".equals(fieldName)) {
                    List<DiagnosticData> dataset = reader.readArray(reader1 -> DiagnosticData.fromJson(reader1));
                    deserializedDetectorResponseProperties.dataset = dataset;
                } else if ("status".equals(fieldName)) {
                    deserializedDetectorResponseProperties.status = Status.fromJson(reader);
                } else if ("dataProvidersMetadata".equals(fieldName)) {
                    List<DataProviderMetadata> dataProvidersMetadata
                        = reader.readArray(reader1 -> DataProviderMetadata.fromJson(reader1));
                    deserializedDetectorResponseProperties.dataProvidersMetadata = dataProvidersMetadata;
                } else if ("suggestedUtterances".equals(fieldName)) {
                    deserializedDetectorResponseProperties.suggestedUtterances
                        = QueryUtterancesResults.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDetectorResponseProperties;
        });
    }
}
