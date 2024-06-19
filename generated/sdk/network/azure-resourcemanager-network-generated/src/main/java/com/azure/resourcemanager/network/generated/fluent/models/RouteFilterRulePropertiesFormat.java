// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.Access;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RouteFilterRuleType;
import java.io.IOException;
import java.util.List;

/**
 * Route Filter Rule Resource.
 */
@Fluent
public final class RouteFilterRulePropertiesFormat implements JsonSerializable<RouteFilterRulePropertiesFormat> {
    /*
     * The access type of the rule.
     */
    private Access access;

    /*
     * The rule type of the rule.
     */
    private RouteFilterRuleType routeFilterRuleType;

    /*
     * The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     */
    private List<String> communities;

    /*
     * The provisioning state of the route filter rule resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of RouteFilterRulePropertiesFormat class.
     */
    public RouteFilterRulePropertiesFormat() {
    }

    /**
     * Get the access property: The access type of the rule.
     * 
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: The access type of the rule.
     * 
     * @param access the access value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the routeFilterRuleType property: The rule type of the rule.
     * 
     * @return the routeFilterRuleType value.
     */
    public RouteFilterRuleType routeFilterRuleType() {
        return this.routeFilterRuleType;
    }

    /**
     * Set the routeFilterRuleType property: The rule type of the rule.
     * 
     * @param routeFilterRuleType the routeFilterRuleType value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withRouteFilterRuleType(RouteFilterRuleType routeFilterRuleType) {
        this.routeFilterRuleType = routeFilterRuleType;
        return this;
    }

    /**
     * Get the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     * 
     * @return the communities value.
     */
    public List<String> communities() {
        return this.communities;
    }

    /**
     * Set the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     * 
     * @param communities the communities value to set.
     * @return the RouteFilterRulePropertiesFormat object itself.
     */
    public RouteFilterRulePropertiesFormat withCommunities(List<String> communities) {
        this.communities = communities;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (access() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property access in model RouteFilterRulePropertiesFormat"));
        }
        if (routeFilterRuleType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property routeFilterRuleType in model RouteFilterRulePropertiesFormat"));
        }
        if (communities() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property communities in model RouteFilterRulePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RouteFilterRulePropertiesFormat.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("access", this.access == null ? null : this.access.toString());
        jsonWriter.writeStringField("routeFilterRuleType",
            this.routeFilterRuleType == null ? null : this.routeFilterRuleType.toString());
        jsonWriter.writeArrayField("communities", this.communities, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouteFilterRulePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteFilterRulePropertiesFormat if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouteFilterRulePropertiesFormat.
     */
    public static RouteFilterRulePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteFilterRulePropertiesFormat deserializedRouteFilterRulePropertiesFormat
                = new RouteFilterRulePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("access".equals(fieldName)) {
                    deserializedRouteFilterRulePropertiesFormat.access = Access.fromString(reader.getString());
                } else if ("routeFilterRuleType".equals(fieldName)) {
                    deserializedRouteFilterRulePropertiesFormat.routeFilterRuleType
                        = RouteFilterRuleType.fromString(reader.getString());
                } else if ("communities".equals(fieldName)) {
                    List<String> communities = reader.readArray(reader1 -> reader1.getString());
                    deserializedRouteFilterRulePropertiesFormat.communities = communities;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedRouteFilterRulePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteFilterRulePropertiesFormat;
        });
    }
}
