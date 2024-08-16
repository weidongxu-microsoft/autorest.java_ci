// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A rule management event data source. The discriminator fields is always RuleManagementEventDataSource in this case.
 */
@Fluent
public final class RuleManagementEventDataSource extends RuleDataSource {
    /*
     * the event name.
     */
    private String eventName;

    /*
     * the event source.
     */
    private String eventSource;

    /*
     * the level.
     */
    private String level;

    /*
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     */
    private String operationName;

    /*
     * the resource group name.
     */
    private String resourceGroupName;

    /*
     * the resource provider name.
     */
    private String resourceProviderName;

    /*
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     */
    private String status;

    /*
     * the substatus.
     */
    private String subStatus;

    /*
     * the claims.
     */
    private RuleManagementEventClaimsDataSource claims;

    /**
     * Creates an instance of RuleManagementEventDataSource class.
     */
    public RuleManagementEventDataSource() {
        this.odataType = "Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource";
    }

    /**
     * Get the eventName property: the event name.
     * 
     * @return the eventName value.
     */
    public String eventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: the event name.
     * 
     * @param eventName the eventName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get the eventSource property: the event source.
     * 
     * @return the eventSource value.
     */
    public String eventSource() {
        return this.eventSource;
    }

    /**
     * Set the eventSource property: the event source.
     * 
     * @param eventSource the eventSource value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * Get the level property: the level.
     * 
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: the level.
     * 
     * @param level the level value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the operationName property: The name of the operation that should be checked for. If no name is provided, any
     * operation will match.
     * 
     * @return the operationName value.
     */
    public String operationName() {
        return this.operationName;
    }

    /**
     * Set the operationName property: The name of the operation that should be checked for. If no name is provided, any
     * operation will match.
     * 
     * @param operationName the operationName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the resourceGroupName property: the resource group name.
     * 
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: the resource group name.
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the resourceProviderName property: the resource provider name.
     * 
     * @return the resourceProviderName value.
     */
    public String resourceProviderName() {
        return this.resourceProviderName;
    }

    /**
     * Set the resourceProviderName property: the resource provider name.
     * 
     * @param resourceProviderName the resourceProviderName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withResourceProviderName(String resourceProviderName) {
        this.resourceProviderName = resourceProviderName;
        return this;
    }

    /**
     * Get the status property: The status of the operation that should be checked for. If no status is provided, any
     * status will match.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation that should be checked for. If no status is provided, any
     * status will match.
     * 
     * @param status the status value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subStatus property: the substatus.
     * 
     * @return the subStatus value.
     */
    public String subStatus() {
        return this.subStatus;
    }

    /**
     * Set the subStatus property: the substatus.
     * 
     * @param subStatus the subStatus value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * Get the claims property: the claims.
     * 
     * @return the claims value.
     */
    public RuleManagementEventClaimsDataSource claims() {
        return this.claims;
    }

    /**
     * Set the claims property: the claims.
     * 
     * @param claims the claims value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withClaims(RuleManagementEventClaimsDataSource claims) {
        this.claims = claims;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleManagementEventDataSource withResourceUri(String resourceUri) {
        super.withResourceUri(resourceUri);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleManagementEventDataSource withLegacyResourceId(String legacyResourceId) {
        super.withLegacyResourceId(legacyResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleManagementEventDataSource withResourceLocation(String resourceLocation) {
        super.withResourceLocation(resourceLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleManagementEventDataSource withMetricNamespace(String metricNamespace) {
        super.withMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (claims() != null) {
            claims().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeStringField("eventName", this.eventName);
        jsonWriter.writeStringField("eventSource", this.eventSource);
        jsonWriter.writeStringField("level", this.level);
        jsonWriter.writeStringField("operationName", this.operationName);
        jsonWriter.writeStringField("resourceGroupName", this.resourceGroupName);
        jsonWriter.writeStringField("resourceProviderName", this.resourceProviderName);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("subStatus", this.subStatus);
        jsonWriter.writeJsonField("claims", this.claims);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleManagementEventDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleManagementEventDataSource if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleManagementEventDataSource.
     */
    public static RuleManagementEventDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleManagementEventDataSource deserializedRuleManagementEventDataSource
                = new RuleManagementEventDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceUri".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.withResourceUri(reader.getString());
                } else if ("legacyResourceId".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.withLegacyResourceId(reader.getString());
                } else if ("resourceLocation".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.withResourceLocation(reader.getString());
                } else if ("metricNamespace".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.withMetricNamespace(reader.getString());
                } else if ("odata.type".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.odataType = reader.getString();
                } else if ("eventName".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.eventName = reader.getString();
                } else if ("eventSource".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.eventSource = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.level = reader.getString();
                } else if ("operationName".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.operationName = reader.getString();
                } else if ("resourceGroupName".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.resourceGroupName = reader.getString();
                } else if ("resourceProviderName".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.resourceProviderName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.status = reader.getString();
                } else if ("subStatus".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.subStatus = reader.getString();
                } else if ("claims".equals(fieldName)) {
                    deserializedRuleManagementEventDataSource.claims
                        = RuleManagementEventClaimsDataSource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleManagementEventDataSource;
        });
    }
}
