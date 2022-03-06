// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorDestination;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorOutput;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorSource;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestGroup;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorType;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Information about the connection monitor. */
@Fluent
public final class ConnectionMonitorResultInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of the connection monitor result.
     */
    @JsonProperty(value = "properties")
    private ConnectionMonitorResultProperties innerProperties;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the connection monitor result.
     *
     * @return the innerProperties value.
     */
    private ConnectionMonitorResultProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionMonitorResultInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionMonitorResultInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    public String monitoringStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().monitoringStatus();
    }

    /**
     * Get the connectionMonitorType property: Type of connection monitor.
     *
     * @return the connectionMonitorType value.
     */
    public ConnectionMonitorType connectionMonitorType() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionMonitorType();
    }

    /**
     * Get the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Describes the source of connection monitor.
     *
     * @param source the source value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withSource(ConnectionMonitorSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.innerProperties() == null ? null : this.innerProperties().destination();
    }

    /**
     * Set the destination property: Describes the destination of connection monitor.
     *
     * @param destination the destination value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withDestination(ConnectionMonitorDestination destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withDestination(destination);
        return this;
    }

    /**
     * Get the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.innerProperties() == null ? null : this.innerProperties().autoStart();
    }

    /**
     * Set the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withAutoStart(Boolean autoStart) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withAutoStart(autoStart);
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().monitoringIntervalInSeconds();
    }

    /**
     * Set the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withMonitoringIntervalInSeconds(monitoringIntervalInSeconds);
        return this;
    }

    /**
     * Get the endpoints property: List of connection monitor endpoints.
     *
     * @return the endpoints value.
     */
    public List<ConnectionMonitorEndpoint> endpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoints();
    }

    /**
     * Set the endpoints property: List of connection monitor endpoints.
     *
     * @param endpoints the endpoints value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withEndpoints(endpoints);
        return this;
    }

    /**
     * Get the testConfigurations property: List of connection monitor test configurations.
     *
     * @return the testConfigurations value.
     */
    public List<ConnectionMonitorTestConfiguration> testConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().testConfigurations();
    }

    /**
     * Set the testConfigurations property: List of connection monitor test configurations.
     *
     * @param testConfigurations the testConfigurations value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withTestConfigurations(
        List<ConnectionMonitorTestConfiguration> testConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withTestConfigurations(testConfigurations);
        return this;
    }

    /**
     * Get the testGroups property: List of connection monitor test groups.
     *
     * @return the testGroups value.
     */
    public List<ConnectionMonitorTestGroup> testGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().testGroups();
    }

    /**
     * Set the testGroups property: List of connection monitor test groups.
     *
     * @param testGroups the testGroups value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withTestGroups(testGroups);
        return this;
    }

    /**
     * Get the outputs property: List of connection monitor outputs.
     *
     * @return the outputs value.
     */
    public List<ConnectionMonitorOutput> outputs() {
        return this.innerProperties() == null ? null : this.innerProperties().outputs();
    }

    /**
     * Set the outputs property: List of connection monitor outputs.
     *
     * @param outputs the outputs value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withOutputs(List<ConnectionMonitorOutput> outputs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withOutputs(outputs);
        return this;
    }

    /**
     * Get the notes property: Optional notes to be associated with the connection monitor.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.innerProperties() == null ? null : this.innerProperties().notes();
    }

    /**
     * Set the notes property: Optional notes to be associated with the connection monitor.
     *
     * @param notes the notes value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withNotes(notes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
