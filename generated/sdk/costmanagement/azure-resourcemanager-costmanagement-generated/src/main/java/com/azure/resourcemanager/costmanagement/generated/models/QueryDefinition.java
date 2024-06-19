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
public final class QueryDefinition implements JsonSerializable<QueryDefinition> {
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
    private QueryDataset dataset;

    /**
     * Creates an instance of QueryDefinition class.
     */
    public QueryDefinition() {
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
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withType(ExportType type) {
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
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withTimeframe(TimeframeType timeframe) {
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
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withTimePeriod(QueryTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataset property: Has definition for data in this query.
     * 
     * @return the dataset value.
     */
    public QueryDataset dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Has definition for data in this query.
     * 
     * @param dataset the dataset value to set.
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withDataset(QueryDataset dataset) {
        this.dataset = dataset;
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
                .log(new IllegalArgumentException("Missing required property type in model QueryDefinition"));
        }
        if (timeframe() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property timeframe in model QueryDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataset() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property dataset in model QueryDefinition"));
        } else {
            dataset().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("timeframe", this.timeframe == null ? null : this.timeframe.toString());
        jsonWriter.writeJsonField("dataset", this.dataset);
        jsonWriter.writeJsonField("timePeriod", this.timePeriod);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QueryDefinition.
     */
    public static QueryDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryDefinition deserializedQueryDefinition = new QueryDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedQueryDefinition.type = ExportType.fromString(reader.getString());
                } else if ("timeframe".equals(fieldName)) {
                    deserializedQueryDefinition.timeframe = TimeframeType.fromString(reader.getString());
                } else if ("dataset".equals(fieldName)) {
                    deserializedQueryDefinition.dataset = QueryDataset.fromJson(reader);
                } else if ("timePeriod".equals(fieldName)) {
                    deserializedQueryDefinition.timePeriod = QueryTimePeriod.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryDefinition;
        });
    }
}
