// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
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
public final class RouteFilterRuleInner extends SubResource {
    /*
     * Properties of the route filter rule.
     */
    private RouteFilterRulePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * Resource location.
     */
    private String location;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of RouteFilterRuleInner class.
     */
    public RouteFilterRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of the route filter rule.
     * 
     * @return the innerProperties value.
     */
    private RouteFilterRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteFilterRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the access property: The access type of the rule.
     * 
     * @return the access value.
     */
    public Access access() {
        return this.innerProperties() == null ? null : this.innerProperties().access();
    }

    /**
     * Set the access property: The access type of the rule.
     * 
     * @param access the access value to set.
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withAccess(Access access) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withAccess(access);
        return this;
    }

    /**
     * Get the routeFilterRuleType property: The rule type of the rule.
     * 
     * @return the routeFilterRuleType value.
     */
    public RouteFilterRuleType routeFilterRuleType() {
        return this.innerProperties() == null ? null : this.innerProperties().routeFilterRuleType();
    }

    /**
     * Set the routeFilterRuleType property: The rule type of the rule.
     * 
     * @param routeFilterRuleType the routeFilterRuleType value to set.
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withRouteFilterRuleType(RouteFilterRuleType routeFilterRuleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withRouteFilterRuleType(routeFilterRuleType);
        return this;
    }

    /**
     * Get the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     * 
     * @return the communities value.
     */
    public List<String> communities() {
        return this.innerProperties() == null ? null : this.innerProperties().communities();
    }

    /**
     * Set the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     * 
     * @param communities the communities value to set.
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withCommunities(List<String> communities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withCommunities(communities);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouteFilterRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteFilterRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteFilterRuleInner.
     */
    public static RouteFilterRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteFilterRuleInner deserializedRouteFilterRuleInner = new RouteFilterRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRouteFilterRuleInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedRouteFilterRuleInner.innerProperties = RouteFilterRulePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedRouteFilterRuleInner.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRouteFilterRuleInner.location = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedRouteFilterRuleInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteFilterRuleInner;
        });
    }
}
