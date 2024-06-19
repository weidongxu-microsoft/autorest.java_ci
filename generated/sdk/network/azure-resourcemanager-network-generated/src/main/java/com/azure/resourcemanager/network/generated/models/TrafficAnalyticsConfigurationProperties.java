// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters that define the configuration of traffic analytics.
 */
@Fluent
public final class TrafficAnalyticsConfigurationProperties
    implements JsonSerializable<TrafficAnalyticsConfigurationProperties> {
    /*
     * Flag to enable/disable traffic analytics.
     */
    private Boolean enabled;

    /*
     * The resource guid of the attached workspace.
     */
    private String workspaceId;

    /*
     * The location of the attached workspace.
     */
    private String workspaceRegion;

    /*
     * Resource Id of the attached workspace.
     */
    private String workspaceResourceId;

    /*
     * The interval in minutes which would decide how frequently TA service should do flow analytics.
     */
    private Integer trafficAnalyticsInterval;

    /**
     * Creates an instance of TrafficAnalyticsConfigurationProperties class.
     */
    public TrafficAnalyticsConfigurationProperties() {
    }

    /**
     * Get the enabled property: Flag to enable/disable traffic analytics.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable traffic analytics.
     * 
     * @param enabled the enabled value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the workspaceId property: The resource guid of the attached workspace.
     * 
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The resource guid of the attached workspace.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the workspaceRegion property: The location of the attached workspace.
     * 
     * @return the workspaceRegion value.
     */
    public String workspaceRegion() {
        return this.workspaceRegion;
    }

    /**
     * Set the workspaceRegion property: The location of the attached workspace.
     * 
     * @param workspaceRegion the workspaceRegion value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceRegion(String workspaceRegion) {
        this.workspaceRegion = workspaceRegion;
        return this;
    }

    /**
     * Get the workspaceResourceId property: Resource Id of the attached workspace.
     * 
     * @return the workspaceResourceId value.
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: Resource Id of the attached workspace.
     * 
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Get the trafficAnalyticsInterval property: The interval in minutes which would decide how frequently TA service
     * should do flow analytics.
     * 
     * @return the trafficAnalyticsInterval value.
     */
    public Integer trafficAnalyticsInterval() {
        return this.trafficAnalyticsInterval;
    }

    /**
     * Set the trafficAnalyticsInterval property: The interval in minutes which would decide how frequently TA service
     * should do flow analytics.
     * 
     * @param trafficAnalyticsInterval the trafficAnalyticsInterval value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withTrafficAnalyticsInterval(Integer trafficAnalyticsInterval) {
        this.trafficAnalyticsInterval = trafficAnalyticsInterval;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("workspaceId", this.workspaceId);
        jsonWriter.writeStringField("workspaceRegion", this.workspaceRegion);
        jsonWriter.writeStringField("workspaceResourceId", this.workspaceResourceId);
        jsonWriter.writeNumberField("trafficAnalyticsInterval", this.trafficAnalyticsInterval);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficAnalyticsConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficAnalyticsConfigurationProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficAnalyticsConfigurationProperties.
     */
    public static TrafficAnalyticsConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficAnalyticsConfigurationProperties deserializedTrafficAnalyticsConfigurationProperties
                = new TrafficAnalyticsConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedTrafficAnalyticsConfigurationProperties.enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("workspaceId".equals(fieldName)) {
                    deserializedTrafficAnalyticsConfigurationProperties.workspaceId = reader.getString();
                } else if ("workspaceRegion".equals(fieldName)) {
                    deserializedTrafficAnalyticsConfigurationProperties.workspaceRegion = reader.getString();
                } else if ("workspaceResourceId".equals(fieldName)) {
                    deserializedTrafficAnalyticsConfigurationProperties.workspaceResourceId = reader.getString();
                } else if ("trafficAnalyticsInterval".equals(fieldName)) {
                    deserializedTrafficAnalyticsConfigurationProperties.trafficAnalyticsInterval
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficAnalyticsConfigurationProperties;
        });
    }
}
