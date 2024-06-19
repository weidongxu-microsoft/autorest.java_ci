// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorDestination;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorOutput;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorSource;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestGroup;
import java.io.IOException;
import java.util.List;

/**
 * Parameters that define the operation to create a connection monitor.
 */
@Fluent
public class ConnectionMonitorParameters implements JsonSerializable<ConnectionMonitorParameters> {
    /*
     * Describes the source of connection monitor.
     */
    private ConnectionMonitorSource source;

    /*
     * Describes the destination of connection monitor.
     */
    private ConnectionMonitorDestination destination;

    /*
     * Determines if the connection monitor will start automatically once created.
     */
    private Boolean autoStart;

    /*
     * Monitoring interval in seconds.
     */
    private Integer monitoringIntervalInSeconds;

    /*
     * List of connection monitor endpoints.
     */
    private List<ConnectionMonitorEndpoint> endpoints;

    /*
     * List of connection monitor test configurations.
     */
    private List<ConnectionMonitorTestConfiguration> testConfigurations;

    /*
     * List of connection monitor test groups.
     */
    private List<ConnectionMonitorTestGroup> testGroups;

    /*
     * List of connection monitor outputs.
     */
    private List<ConnectionMonitorOutput> outputs;

    /*
     * Optional notes to be associated with the connection monitor.
     */
    private String notes;

    /**
     * Creates an instance of ConnectionMonitorParameters class.
     */
    public ConnectionMonitorParameters() {
    }

    /**
     * Get the source property: Describes the source of connection monitor.
     * 
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set the source property: Describes the source of connection monitor.
     * 
     * @param source the source value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection monitor.
     * 
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Describes the destination of connection monitor.
     * 
     * @param destination the destination value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the autoStart property: Determines if the connection monitor will start automatically once created.
     * 
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set the autoStart property: Determines if the connection monitor will start automatically once created.
     * 
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     * 
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     * 
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

    /**
     * Get the endpoints property: List of connection monitor endpoints.
     * 
     * @return the endpoints value.
     */
    public List<ConnectionMonitorEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: List of connection monitor endpoints.
     * 
     * @param endpoints the endpoints value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the testConfigurations property: List of connection monitor test configurations.
     * 
     * @return the testConfigurations value.
     */
    public List<ConnectionMonitorTestConfiguration> testConfigurations() {
        return this.testConfigurations;
    }

    /**
     * Set the testConfigurations property: List of connection monitor test configurations.
     * 
     * @param testConfigurations the testConfigurations value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters
        withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations) {
        this.testConfigurations = testConfigurations;
        return this;
    }

    /**
     * Get the testGroups property: List of connection monitor test groups.
     * 
     * @return the testGroups value.
     */
    public List<ConnectionMonitorTestGroup> testGroups() {
        return this.testGroups;
    }

    /**
     * Set the testGroups property: List of connection monitor test groups.
     * 
     * @param testGroups the testGroups value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        this.testGroups = testGroups;
        return this;
    }

    /**
     * Get the outputs property: List of connection monitor outputs.
     * 
     * @return the outputs value.
     */
    public List<ConnectionMonitorOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: List of connection monitor outputs.
     * 
     * @param outputs the outputs value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withOutputs(List<ConnectionMonitorOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the notes property: Optional notes to be associated with the connection monitor.
     * 
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: Optional notes to be associated with the connection monitor.
     * 
     * @param notes the notes value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (destination() != null) {
            destination().validate();
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (testConfigurations() != null) {
            testConfigurations().forEach(e -> e.validate());
        }
        if (testGroups() != null) {
            testGroups().forEach(e -> e.validate());
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("source", this.source);
        jsonWriter.writeJsonField("destination", this.destination);
        jsonWriter.writeBooleanField("autoStart", this.autoStart);
        jsonWriter.writeNumberField("monitoringIntervalInSeconds", this.monitoringIntervalInSeconds);
        jsonWriter.writeArrayField("endpoints", this.endpoints, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("testConfigurations", this.testConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("testGroups", this.testGroups, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", this.outputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("notes", this.notes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorParameters.
     */
    public static ConnectionMonitorParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorParameters deserializedConnectionMonitorParameters = new ConnectionMonitorParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source".equals(fieldName)) {
                    deserializedConnectionMonitorParameters.source = ConnectionMonitorSource.fromJson(reader);
                } else if ("destination".equals(fieldName)) {
                    deserializedConnectionMonitorParameters.destination = ConnectionMonitorDestination.fromJson(reader);
                } else if ("autoStart".equals(fieldName)) {
                    deserializedConnectionMonitorParameters.autoStart = reader.getNullable(JsonReader::getBoolean);
                } else if ("monitoringIntervalInSeconds".equals(fieldName)) {
                    deserializedConnectionMonitorParameters.monitoringIntervalInSeconds
                        = reader.getNullable(JsonReader::getInt);
                } else if ("endpoints".equals(fieldName)) {
                    List<ConnectionMonitorEndpoint> endpoints
                        = reader.readArray(reader1 -> ConnectionMonitorEndpoint.fromJson(reader1));
                    deserializedConnectionMonitorParameters.endpoints = endpoints;
                } else if ("testConfigurations".equals(fieldName)) {
                    List<ConnectionMonitorTestConfiguration> testConfigurations
                        = reader.readArray(reader1 -> ConnectionMonitorTestConfiguration.fromJson(reader1));
                    deserializedConnectionMonitorParameters.testConfigurations = testConfigurations;
                } else if ("testGroups".equals(fieldName)) {
                    List<ConnectionMonitorTestGroup> testGroups
                        = reader.readArray(reader1 -> ConnectionMonitorTestGroup.fromJson(reader1));
                    deserializedConnectionMonitorParameters.testGroups = testGroups;
                } else if ("outputs".equals(fieldName)) {
                    List<ConnectionMonitorOutput> outputs
                        = reader.readArray(reader1 -> ConnectionMonitorOutput.fromJson(reader1));
                    deserializedConnectionMonitorParameters.outputs = outputs;
                } else if ("notes".equals(fieldName)) {
                    deserializedConnectionMonitorParameters.notes = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorParameters;
        });
    }
}
