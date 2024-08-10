// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectivityConfigurationProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Active connectivity configuration.
 */
@Fluent
public final class ActiveConnectivityConfiguration extends EffectiveConnectivityConfiguration {
    /*
     * Deployment time string.
     */
    private OffsetDateTime commitTime;

    /*
     * Deployment region.
     */
    private String region;

    /*
     * Properties of a network manager connectivity configuration
     */
    private ConnectivityConfigurationProperties innerProperties;

    /**
     * Creates an instance of ActiveConnectivityConfiguration class.
     */
    public ActiveConnectivityConfiguration() {
    }

    /**
     * Get the commitTime property: Deployment time string.
     * 
     * @return the commitTime value.
     */
    public OffsetDateTime commitTime() {
        return this.commitTime;
    }

    /**
     * Set the commitTime property: Deployment time string.
     * 
     * @param commitTime the commitTime value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withCommitTime(OffsetDateTime commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    /**
     * Get the region property: Deployment region.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Deployment region.
     * 
     * @param region the region value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of a network manager connectivity configuration.
     * 
     * @return the innerProperties value.
     */
    private ConnectivityConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectivityConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectivityConfiguration withConfigurationGroups(List<ConfigurationGroup> configurationGroups) {
        super.withConfigurationGroups(configurationGroups);
        return this;
    }

    /**
     * Get the description property: A description of the connectivity configuration.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the connectivity configuration.
     * 
     * @param description the description value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the connectivityTopology property: Connectivity topology type.
     * 
     * @return the connectivityTopology value.
     */
    public ConnectivityTopology connectivityTopology() {
        return this.innerProperties() == null ? null : this.innerProperties().connectivityTopology();
    }

    /**
     * Set the connectivityTopology property: Connectivity topology type.
     * 
     * @param connectivityTopology the connectivityTopology value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withConnectivityTopology(ConnectivityTopology connectivityTopology) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withConnectivityTopology(connectivityTopology);
        return this;
    }

    /**
     * Get the hubs property: List of hubItems.
     * 
     * @return the hubs value.
     */
    public List<Hub> hubs() {
        return this.innerProperties() == null ? null : this.innerProperties().hubs();
    }

    /**
     * Set the hubs property: List of hubItems.
     * 
     * @param hubs the hubs value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withHubs(List<Hub> hubs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withHubs(hubs);
        return this;
    }

    /**
     * Get the isGlobal property: Flag if global mesh is supported.
     * 
     * @return the isGlobal value.
     */
    public IsGlobal isGlobal() {
        return this.innerProperties() == null ? null : this.innerProperties().isGlobal();
    }

    /**
     * Set the isGlobal property: Flag if global mesh is supported.
     * 
     * @param isGlobal the isGlobal value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withIsGlobal(IsGlobal isGlobal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withIsGlobal(isGlobal);
        return this;
    }

    /**
     * Get the appliesToGroups property: Groups for configuration.
     * 
     * @return the appliesToGroups value.
     */
    public List<ConnectivityGroupItem> appliesToGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().appliesToGroups();
    }

    /**
     * Set the appliesToGroups property: Groups for configuration.
     * 
     * @param appliesToGroups the appliesToGroups value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withAppliesToGroups(List<ConnectivityGroupItem> appliesToGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withAppliesToGroups(appliesToGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the connectivity configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deleteExistingPeering property: Flag if need to remove current existing peerings.
     * 
     * @return the deleteExistingPeering value.
     */
    public DeleteExistingPeering deleteExistingPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteExistingPeering();
    }

    /**
     * Set the deleteExistingPeering property: Flag if need to remove current existing peerings.
     * 
     * @param deleteExistingPeering the deleteExistingPeering value to set.
     * @return the ActiveConnectivityConfiguration object itself.
     */
    public ActiveConnectivityConfiguration withDeleteExistingPeering(DeleteExistingPeering deleteExistingPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withDeleteExistingPeering(deleteExistingPeering);
        return this;
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (configurationGroups() != null) {
            configurationGroups().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", innerProperties());
        jsonWriter.writeArrayField("configurationGroups", configurationGroups(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("commitTime",
            this.commitTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.commitTime));
        jsonWriter.writeStringField("region", this.region);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActiveConnectivityConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActiveConnectivityConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ActiveConnectivityConfiguration.
     */
    public static ActiveConnectivityConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActiveConnectivityConfiguration deserializedActiveConnectivityConfiguration
                = new ActiveConnectivityConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedActiveConnectivityConfiguration.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedActiveConnectivityConfiguration.innerProperties
                        = ConnectivityConfigurationProperties.fromJson(reader);
                } else if ("configurationGroups".equals(fieldName)) {
                    List<ConfigurationGroup> configurationGroups
                        = reader.readArray(reader1 -> ConfigurationGroup.fromJson(reader1));
                    deserializedActiveConnectivityConfiguration.withConfigurationGroups(configurationGroups);
                } else if ("commitTime".equals(fieldName)) {
                    deserializedActiveConnectivityConfiguration.commitTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("region".equals(fieldName)) {
                    deserializedActiveConnectivityConfiguration.region = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActiveConnectivityConfiguration;
        });
    }
}
