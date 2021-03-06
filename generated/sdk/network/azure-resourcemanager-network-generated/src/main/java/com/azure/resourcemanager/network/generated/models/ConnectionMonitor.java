// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Parameters that define the operation to create a connection monitor. */
@Fluent
public final class ConnectionMonitor {
    /*
     * Connection monitor location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Connection monitor tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties of the connection monitor.
     */
    @JsonProperty(value = "properties", required = true)
    private ConnectionMonitorParameters innerProperties = new ConnectionMonitorParameters();

    /**
     * Get the location property: Connection monitor location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Connection monitor location.
     *
     * @param location the location value to set.
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Connection monitor tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Connection monitor tags.
     *
     * @param tags the tags value to set.
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the connection monitor.
     *
     * @return the innerProperties value.
     */
    private ConnectionMonitorParameters innerProperties() {
        return this.innerProperties;
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withSource(ConnectionMonitorSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withDestination(ConnectionMonitorDestination destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withAutoStart(Boolean autoStart) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withOutputs(List<ConnectionMonitorOutput> outputs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
     * @return the ConnectionMonitor object itself.
     */
    public ConnectionMonitor withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorParameters();
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
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ConnectionMonitor"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionMonitor.class);
}
