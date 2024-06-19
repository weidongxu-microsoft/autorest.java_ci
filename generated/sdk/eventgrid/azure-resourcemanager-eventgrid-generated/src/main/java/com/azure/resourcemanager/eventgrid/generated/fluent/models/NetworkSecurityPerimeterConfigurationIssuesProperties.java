// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssueSeverity;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssueType;
import java.io.IOException;
import java.util.List;

/**
 * Network security perimeter configuration issues properties.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationIssuesProperties
    implements JsonSerializable<NetworkSecurityPerimeterConfigurationIssuesProperties> {
    /*
     * Provisioning issue type.
     */
    private NetworkSecurityPerimeterConfigurationIssueType issueType;

    /*
     * Provisioning issue severity.
     */
    private NetworkSecurityPerimeterConfigurationIssueSeverity severity;

    /*
     * Provisioning issue description.
     */
    private String description;

    /*
     * ARM IDs of resources that can be associated to the same perimeter to remediate the issue.
     */
    private List<String> suggestedResourceIds;

    /*
     * Access rules that can be added to the same profile to remediate the issue.
     */
    private List<String> suggestedAccessRules;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationIssuesProperties class.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties() {
    }

    /**
     * Get the issueType property: Provisioning issue type.
     * 
     * @return the issueType value.
     */
    public NetworkSecurityPerimeterConfigurationIssueType issueType() {
        return this.issueType;
    }

    /**
     * Set the issueType property: Provisioning issue type.
     * 
     * @param issueType the issueType value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withIssueType(NetworkSecurityPerimeterConfigurationIssueType issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * Get the severity property: Provisioning issue severity.
     * 
     * @return the severity value.
     */
    public NetworkSecurityPerimeterConfigurationIssueSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Provisioning issue severity.
     * 
     * @param severity the severity value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the description property: Provisioning issue description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Provisioning issue description.
     * 
     * @param description the description value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @return the suggestedResourceIds value.
     */
    public List<String> suggestedResourceIds() {
        return this.suggestedResourceIds;
    }

    /**
     * Set the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @param suggestedResourceIds the suggestedResourceIds value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSuggestedResourceIds(List<String> suggestedResourceIds) {
        this.suggestedResourceIds = suggestedResourceIds;
        return this;
    }

    /**
     * Get the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @return the suggestedAccessRules value.
     */
    public List<String> suggestedAccessRules() {
        return this.suggestedAccessRules;
    }

    /**
     * Set the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @param suggestedAccessRules the suggestedAccessRules value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSuggestedAccessRules(List<String> suggestedAccessRules) {
        this.suggestedAccessRules = suggestedAccessRules;
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
        jsonWriter.writeStringField("issueType", this.issueType == null ? null : this.issueType.toString());
        jsonWriter.writeStringField("severity", this.severity == null ? null : this.severity.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("suggestedResourceIds", this.suggestedResourceIds,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("suggestedAccessRules", this.suggestedAccessRules,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityPerimeterConfigurationIssuesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeterConfigurationIssuesProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeterConfigurationIssuesProperties.
     */
    public static NetworkSecurityPerimeterConfigurationIssuesProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeterConfigurationIssuesProperties deserializedNetworkSecurityPerimeterConfigurationIssuesProperties
                = new NetworkSecurityPerimeterConfigurationIssuesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("issueType".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationIssuesProperties.issueType
                        = NetworkSecurityPerimeterConfigurationIssueType.fromString(reader.getString());
                } else if ("severity".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationIssuesProperties.severity
                        = NetworkSecurityPerimeterConfigurationIssueSeverity.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationIssuesProperties.description = reader.getString();
                } else if ("suggestedResourceIds".equals(fieldName)) {
                    List<String> suggestedResourceIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterConfigurationIssuesProperties.suggestedResourceIds
                        = suggestedResourceIds;
                } else if ("suggestedAccessRules".equals(fieldName)) {
                    List<String> suggestedAccessRules = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterConfigurationIssuesProperties.suggestedAccessRules
                        = suggestedAccessRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeterConfigurationIssuesProperties;
        });
    }
}
