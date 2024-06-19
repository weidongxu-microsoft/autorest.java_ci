// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specify action need to be taken when rule type is converting log to metric.
 */
@Fluent
public final class LogToMetricAction extends Action {
    /*
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     */
    private String odataType
        = "Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction";

    /*
     * Criteria of Metric
     */
    private List<Criteria> criteria;

    /**
     * Creates an instance of LogToMetricAction class.
     */
    public LogToMetricAction() {
    }

    /**
     * Get the odataType property: Specifies the action. Supported values - AlertingAction, LogToMetricAction.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the criteria property: Criteria of Metric.
     * 
     * @return the criteria value.
     */
    public List<Criteria> criteria() {
        return this.criteria;
    }

    /**
     * Set the criteria property: Criteria of Metric.
     * 
     * @param criteria the criteria value to set.
     * @return the LogToMetricAction object itself.
     */
    public LogToMetricAction withCriteria(List<Criteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (criteria() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property criteria in model LogToMetricAction"));
        } else {
            criteria().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogToMetricAction.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("criteria", this.criteria, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogToMetricAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogToMetricAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LogToMetricAction.
     */
    public static LogToMetricAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogToMetricAction deserializedLogToMetricAction = new LogToMetricAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("criteria".equals(fieldName)) {
                    List<Criteria> criteria = reader.readArray(reader1 -> Criteria.fromJson(reader1));
                    deserializedLogToMetricAction.criteria = criteria;
                } else if ("odata.type".equals(fieldName)) {
                    deserializedLogToMetricAction.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogToMetricAction;
        });
    }
}
