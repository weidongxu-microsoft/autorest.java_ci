// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The definition of a query.
 */
@Fluent
public final class ExportDefinition implements JsonSerializable<ExportDefinition> {
    /*
     * The type of the query.
     */
    private ExportType type;

    /*
     * The time frame for pulling data for the query. If custom, then a specific time period must be provided.
     */
    private TimeframeType timeframe;

    /*
     * Has time period for pulling data for the query.
     */
    private QueryTimePeriod timePeriod;

    /*
     * Has definition for data in this query.
     */
    private QueryDatasetAutoGenerated dataSet;

    /**
     * Creates an instance of ExportDefinition class.
     */
    public ExportDefinition() {
    }

    /**
     * Get the type property: The type of the query.
     * 
     * @return the type value.
     */
    public ExportType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the query.
     * 
     * @param type the type value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withType(ExportType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the query. If custom, then a specific time period
     * must be provided.
     * 
     * @return the timeframe value.
     */
    public TimeframeType timeframe() {
        return this.timeframe;
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the query. If custom, then a specific time period
     * must be provided.
     * 
     * @param timeframe the timeframe value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withTimeframe(TimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the query.
     * 
     * @return the timePeriod value.
     */
    public QueryTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the query.
     * 
     * @param timePeriod the timePeriod value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withTimePeriod(QueryTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataSet property: Has definition for data in this query.
     * 
     * @return the dataSet value.
     */
    public QueryDatasetAutoGenerated dataSet() {
        return this.dataSet;
    }

    /**
     * Set the dataSet property: Has definition for data in this query.
     * 
     * @param dataSet the dataSet value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withDataSet(QueryDatasetAutoGenerated dataSet) {
        this.dataSet = dataSet;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model ExportDefinition"));
        }
        if (timeframe() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property timeframe in model ExportDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataSet() != null) {
            dataSet().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("timeframe", this.timeframe == null ? null : this.timeframe.toString());
        jsonWriter.writeJsonField("timePeriod", this.timePeriod);
        jsonWriter.writeJsonField("dataSet", this.dataSet);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExportDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExportDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExportDefinition.
     */
    public static ExportDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExportDefinition deserializedExportDefinition = new ExportDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedExportDefinition.type = ExportType.fromString(reader.getString());
                } else if ("timeframe".equals(fieldName)) {
                    deserializedExportDefinition.timeframe = TimeframeType.fromString(reader.getString());
                } else if ("timePeriod".equals(fieldName)) {
                    deserializedExportDefinition.timePeriod = QueryTimePeriod.fromJson(reader);
                } else if ("dataSet".equals(fieldName)) {
                    deserializedExportDefinition.dataSet = QueryDatasetAutoGenerated.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExportDefinition;
        });
    }
}
