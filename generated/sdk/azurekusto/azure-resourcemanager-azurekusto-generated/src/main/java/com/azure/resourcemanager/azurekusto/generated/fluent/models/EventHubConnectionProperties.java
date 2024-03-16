// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.models.Compression;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseRouting;
import com.azure.resourcemanager.azurekusto.generated.models.EventHubDataFormat;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Class representing the Kusto event hub connection properties.
 */
@Fluent
public final class EventHubConnectionProperties {
    /*
     * The resource ID of the event hub to be used to create a data connection.
     */
    @JsonProperty(value = "eventHubResourceId", required = true)
    private String eventHubResourceId;

    /*
     * The event hub consumer group.
     */
    @JsonProperty(value = "consumerGroup", required = true)
    private String consumerGroup;

    /*
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /*
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     */
    @JsonProperty(value = "mappingRuleName")
    private String mappingRuleName;

    /*
     * The data format of the message. Optionally the data format can be added to each message.
     */
    @JsonProperty(value = "dataFormat")
    private EventHubDataFormat dataFormat;

    /*
     * System properties of the event hub
     */
    @JsonProperty(value = "eventSystemProperties")
    private List<String> eventSystemProperties;

    /*
     * The event hub messages compression type
     */
    @JsonProperty(value = "compression")
    private Compression compression;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     */
    @JsonProperty(value = "managedIdentityResourceId")
    private String managedIdentityResourceId;

    /*
     * The object ID of the managedIdentityResourceId
     */
    @JsonProperty(value = "managedIdentityObjectId", access = JsonProperty.Access.WRITE_ONLY)
    private String managedIdentityObjectId;

    /*
     * Indication for database routing information from the data connection, by default only database routing information is allowed
     */
    @JsonProperty(value = "databaseRouting")
    private DatabaseRouting databaseRouting;

    /*
     * When defined, the data connection retrieves existing Event hub events created since the Retrieval start date. It can only retrieve events retained by the Event hub, based on its retention period.
     */
    @JsonProperty(value = "retrievalStartDate")
    private OffsetDateTime retrievalStartDate;

    /**
     * Creates an instance of EventHubConnectionProperties class.
     */
    public EventHubConnectionProperties() {
    }

    /**
     * Get the eventHubResourceId property: The resource ID of the event hub to be used to create a data connection.
     * 
     * @return the eventHubResourceId value.
     */
    public String eventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * Set the eventHubResourceId property: The resource ID of the event hub to be used to create a data connection.
     * 
     * @param eventHubResourceId the eventHubResourceId value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withEventHubResourceId(String eventHubResourceId) {
        this.eventHubResourceId = eventHubResourceId;
        return this;
    }

    /**
     * Get the consumerGroup property: The event hub consumer group.
     * 
     * @return the consumerGroup value.
     */
    public String consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Set the consumerGroup property: The event hub consumer group.
     * 
     * @param consumerGroup the consumerGroup value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Get the tableName property: The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     * @param tableName the tableName value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     * @return the mappingRuleName value.
     */
    public String mappingRuleName() {
        return this.mappingRuleName;
    }

    /**
     * Set the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     * @param mappingRuleName the mappingRuleName value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withMappingRuleName(String mappingRuleName) {
        this.mappingRuleName = mappingRuleName;
        return this;
    }

    /**
     * Get the dataFormat property: The data format of the message. Optionally the data format can be added to each message.
     * 
     * @return the dataFormat value.
     */
    public EventHubDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set the dataFormat property: The data format of the message. Optionally the data format can be added to each message.
     * 
     * @param dataFormat the dataFormat value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withDataFormat(EventHubDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * Get the eventSystemProperties property: System properties of the event hub.
     * 
     * @return the eventSystemProperties value.
     */
    public List<String> eventSystemProperties() {
        return this.eventSystemProperties;
    }

    /**
     * Set the eventSystemProperties property: System properties of the event hub.
     * 
     * @param eventSystemProperties the eventSystemProperties value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withEventSystemProperties(List<String> eventSystemProperties) {
        this.eventSystemProperties = eventSystemProperties;
        return this;
    }

    /**
     * Get the compression property: The event hub messages compression type.
     * 
     * @return the compression value.
     */
    public Compression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The event hub messages compression type.
     * 
     * @param compression the compression value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withCompression(Compression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     * 
     * @return the managedIdentityResourceId value.
     */
    public String managedIdentityResourceId() {
        return this.managedIdentityResourceId;
    }

    /**
     * Set the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     * 
     * @param managedIdentityResourceId the managedIdentityResourceId value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withManagedIdentityResourceId(String managedIdentityResourceId) {
        this.managedIdentityResourceId = managedIdentityResourceId;
        return this;
    }

    /**
     * Get the managedIdentityObjectId property: The object ID of the managedIdentityResourceId.
     * 
     * @return the managedIdentityObjectId value.
     */
    public String managedIdentityObjectId() {
        return this.managedIdentityObjectId;
    }

    /**
     * Get the databaseRouting property: Indication for database routing information from the data connection, by default only database routing information is allowed.
     * 
     * @return the databaseRouting value.
     */
    public DatabaseRouting databaseRouting() {
        return this.databaseRouting;
    }

    /**
     * Set the databaseRouting property: Indication for database routing information from the data connection, by default only database routing information is allowed.
     * 
     * @param databaseRouting the databaseRouting value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withDatabaseRouting(DatabaseRouting databaseRouting) {
        this.databaseRouting = databaseRouting;
        return this;
    }

    /**
     * Get the retrievalStartDate property: When defined, the data connection retrieves existing Event hub events created since the Retrieval start date. It can only retrieve events retained by the Event hub, based on its retention period.
     * 
     * @return the retrievalStartDate value.
     */
    public OffsetDateTime retrievalStartDate() {
        return this.retrievalStartDate;
    }

    /**
     * Set the retrievalStartDate property: When defined, the data connection retrieves existing Event hub events created since the Retrieval start date. It can only retrieve events retained by the Event hub, based on its retention period.
     * 
     * @param retrievalStartDate the retrievalStartDate value to set.
     * @return the EventHubConnectionProperties object itself.
     */
    public EventHubConnectionProperties withRetrievalStartDate(OffsetDateTime retrievalStartDate) {
        this.retrievalStartDate = retrievalStartDate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventHubResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property eventHubResourceId in model EventHubConnectionProperties"));
        }
        if (consumerGroup() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property consumerGroup in model EventHubConnectionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventHubConnectionProperties.class);
}
