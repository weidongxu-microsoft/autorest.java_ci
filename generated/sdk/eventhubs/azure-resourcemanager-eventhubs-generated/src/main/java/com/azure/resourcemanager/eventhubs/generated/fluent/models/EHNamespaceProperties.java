// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.models.Encryption;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Namespace properties supplied for create namespace operation. */
@Fluent
public final class EHNamespaceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceProperties.class);

    /*
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Status of the Namespace.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The time the Namespace was created.
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the Namespace was updated.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Cluster ARM ID of the Namespace.
     */
    @JsonProperty(value = "clusterArmId")
    private String clusterArmId;

    /*
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     */
    @JsonProperty(value = "isAutoInflateEnabled")
    private Boolean isAutoInflateEnabled;

    /*
     * Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled =
     * true)
     */
    @JsonProperty(value = "maximumThroughputUnits")
    private Integer maximumThroughputUnits;

    /*
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     */
    @JsonProperty(value = "kafkaEnabled")
    private Boolean kafkaEnabled;

    /*
     * Enabling this property creates a Standard Event Hubs Namespace in
     * regions supported availability zones.
     */
    @JsonProperty(value = "zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * Properties of BYOK Encryption description
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the Namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the Namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the Namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @return the clusterArmId value.
     */
    public String clusterArmId() {
        return this.clusterArmId;
    }

    /**
     * Set the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @param clusterArmId the clusterArmId value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withClusterArmId(String clusterArmId) {
        this.clusterArmId = clusterArmId;
        return this;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @return the isAutoInflateEnabled value.
     */
    public Boolean isAutoInflateEnabled() {
        return this.isAutoInflateEnabled;
    }

    /**
     * Set the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @param isAutoInflateEnabled the isAutoInflateEnabled value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withIsAutoInflateEnabled(Boolean isAutoInflateEnabled) {
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        return this;
    }

    /**
     * Get the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @return the maximumThroughputUnits value.
     */
    public Integer maximumThroughputUnits() {
        return this.maximumThroughputUnits;
    }

    /**
     * Set the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @param maximumThroughputUnits the maximumThroughputUnits value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withMaximumThroughputUnits(Integer maximumThroughputUnits) {
        this.maximumThroughputUnits = maximumThroughputUnits;
        return this;
    }

    /**
     * Get the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @return the kafkaEnabled value.
     */
    public Boolean kafkaEnabled() {
        return this.kafkaEnabled;
    }

    /**
     * Set the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @param kafkaEnabled the kafkaEnabled value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withKafkaEnabled(Boolean kafkaEnabled) {
        this.kafkaEnabled = kafkaEnabled;
        return this;
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set.
     * @return the EHNamespaceProperties object itself.
     */
    public EHNamespaceProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
