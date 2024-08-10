// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleUpdateParameters;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink;
import java.io.IOException;
import java.util.List;

/**
 * The JSON object that contains the properties required to create a routing rule.
 */
@Fluent
public final class RoutingRuleProperties extends RoutingRuleUpdateParameters {
    /*
     * Resource status.
     */
    private FrontDoorResourceState resourceState;

    /**
     * Creates an instance of RoutingRuleProperties class.
     */
    public RoutingRuleProperties() {
    }

    /**
     * Get the resourceState property: Resource status.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withFrontendEndpoints(List<SubResource> frontendEndpoints) {
        super.withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withAcceptedProtocols(List<FrontDoorProtocol> acceptedProtocols) {
        super.withAcceptedProtocols(acceptedProtocols);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withPatternsToMatch(List<String> patternsToMatch) {
        super.withPatternsToMatch(patternsToMatch);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withEnabledState(RoutingRuleEnabledState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withRouteConfiguration(RouteConfiguration routeConfiguration) {
        super.withRouteConfiguration(routeConfiguration);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withRulesEngine(SubResource rulesEngine) {
        super.withRulesEngine(rulesEngine);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutingRuleProperties withWebApplicationFirewallPolicyLink(
        RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        super.withWebApplicationFirewallPolicyLink(webApplicationFirewallPolicyLink);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (routeConfiguration() != null) {
            routeConfiguration().validate();
        }
        if (webApplicationFirewallPolicyLink() != null) {
            webApplicationFirewallPolicyLink().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("frontendEndpoints", frontendEndpoints(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("acceptedProtocols", acceptedProtocols(),
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("patternsToMatch", patternsToMatch(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("enabledState", enabledState() == null ? null : enabledState().toString());
        jsonWriter.writeJsonField("routeConfiguration", routeConfiguration());
        jsonWriter.writeJsonField("rulesEngine", rulesEngine());
        jsonWriter.writeJsonField("webApplicationFirewallPolicyLink", webApplicationFirewallPolicyLink());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoutingRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoutingRuleProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoutingRuleProperties.
     */
    public static RoutingRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoutingRuleProperties deserializedRoutingRuleProperties = new RoutingRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frontendEndpoints".equals(fieldName)) {
                    List<SubResource> frontendEndpoints = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedRoutingRuleProperties.withFrontendEndpoints(frontendEndpoints);
                } else if ("acceptedProtocols".equals(fieldName)) {
                    List<FrontDoorProtocol> acceptedProtocols
                        = reader.readArray(reader1 -> FrontDoorProtocol.fromString(reader1.getString()));
                    deserializedRoutingRuleProperties.withAcceptedProtocols(acceptedProtocols);
                } else if ("patternsToMatch".equals(fieldName)) {
                    List<String> patternsToMatch = reader.readArray(reader1 -> reader1.getString());
                    deserializedRoutingRuleProperties.withPatternsToMatch(patternsToMatch);
                } else if ("enabledState".equals(fieldName)) {
                    deserializedRoutingRuleProperties
                        .withEnabledState(RoutingRuleEnabledState.fromString(reader.getString()));
                } else if ("routeConfiguration".equals(fieldName)) {
                    deserializedRoutingRuleProperties.withRouteConfiguration(RouteConfiguration.fromJson(reader));
                } else if ("rulesEngine".equals(fieldName)) {
                    deserializedRoutingRuleProperties.withRulesEngine(SubResource.fromJson(reader));
                } else if ("webApplicationFirewallPolicyLink".equals(fieldName)) {
                    deserializedRoutingRuleProperties.withWebApplicationFirewallPolicyLink(
                        RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink.fromJson(reader));
                } else if ("resourceState".equals(fieldName)) {
                    deserializedRoutingRuleProperties.resourceState
                        = FrontDoorResourceState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoutingRuleProperties;
        });
    }
}
