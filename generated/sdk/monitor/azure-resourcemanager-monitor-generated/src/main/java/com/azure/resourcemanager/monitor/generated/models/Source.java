// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specifies the log search query.
 */
@Fluent
public final class Source implements JsonSerializable<Source> {
    /*
     * Log search query. Required for action type - AlertingAction
     */
    private String query;

    /*
     * List of Resource referred into query
     */
    private List<String> authorizedResources;

    /*
     * The resource uri over which log search query is to be run.
     */
    private String dataSourceId;

    /*
     * Set value to 'ResultCount' .
     */
    private QueryType queryType;

    /**
     * Creates an instance of Source class.
     */
    public Source() {
    }

    /**
     * Get the query property: Log search query. Required for action type - AlertingAction.
     * 
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Log search query. Required for action type - AlertingAction.
     * 
     * @param query the query value to set.
     * @return the Source object itself.
     */
    public Source withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the authorizedResources property: List of Resource referred into query.
     * 
     * @return the authorizedResources value.
     */
    public List<String> authorizedResources() {
        return this.authorizedResources;
    }

    /**
     * Set the authorizedResources property: List of Resource referred into query.
     * 
     * @param authorizedResources the authorizedResources value to set.
     * @return the Source object itself.
     */
    public Source withAuthorizedResources(List<String> authorizedResources) {
        this.authorizedResources = authorizedResources;
        return this;
    }

    /**
     * Get the dataSourceId property: The resource uri over which log search query is to be run.
     * 
     * @return the dataSourceId value.
     */
    public String dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Set the dataSourceId property: The resource uri over which log search query is to be run.
     * 
     * @param dataSourceId the dataSourceId value to set.
     * @return the Source object itself.
     */
    public Source withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * Get the queryType property: Set value to 'ResultCount' .
     * 
     * @return the queryType value.
     */
    public QueryType queryType() {
        return this.queryType;
    }

    /**
     * Set the queryType property: Set value to 'ResultCount' .
     * 
     * @param queryType the queryType value to set.
     * @return the Source object itself.
     */
    public Source withQueryType(QueryType queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataSourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property dataSourceId in model Source"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Source.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceId", this.dataSourceId);
        jsonWriter.writeStringField("query", this.query);
        jsonWriter.writeArrayField("authorizedResources", this.authorizedResources,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("queryType", this.queryType == null ? null : this.queryType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Source from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Source if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Source.
     */
    public static Source fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Source deserializedSource = new Source();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceId".equals(fieldName)) {
                    deserializedSource.dataSourceId = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedSource.query = reader.getString();
                } else if ("authorizedResources".equals(fieldName)) {
                    List<String> authorizedResources = reader.readArray(reader1 -> reader1.getString());
                    deserializedSource.authorizedResources = authorizedResources;
                } else if ("queryType".equals(fieldName)) {
                    deserializedSource.queryType = QueryType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSource;
        });
    }
}
