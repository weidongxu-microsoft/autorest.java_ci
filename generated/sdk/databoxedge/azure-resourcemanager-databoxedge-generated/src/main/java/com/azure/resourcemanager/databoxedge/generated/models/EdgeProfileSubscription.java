// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.SubscriptionProperties;
import java.io.IOException;
import java.util.List;

/**
 * Subscription details for the Edge Profile.
 */
@Fluent
public final class EdgeProfileSubscription implements JsonSerializable<EdgeProfileSubscription> {
    /*
     * Edge Subscription Registration ID
     */
    private String registrationId;

    /*
     * ARM ID of the subscription
     */
    private String id;

    /*
     * The state property.
     */
    private SubscriptionState state;

    /*
     * The registrationDate property.
     */
    private String registrationDate;

    /*
     * The subscriptionId property.
     */
    private String subscriptionId;

    /*
     * The properties property.
     */
    private SubscriptionProperties innerProperties;

    /**
     * Creates an instance of EdgeProfileSubscription class.
     */
    public EdgeProfileSubscription() {
    }

    /**
     * Get the registrationId property: Edge Subscription Registration ID.
     * 
     * @return the registrationId value.
     */
    public String registrationId() {
        return this.registrationId;
    }

    /**
     * Set the registrationId property: Edge Subscription Registration ID.
     * 
     * @param registrationId the registrationId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    /**
     * Get the id property: ARM ID of the subscription.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ARM ID of the subscription.
     * 
     * @param id the id value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the state property: The state property.
     * 
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     * 
     * @param state the state value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the registrationDate property: The registrationDate property.
     * 
     * @return the registrationDate value.
     */
    public String registrationDate() {
        return this.registrationDate;
    }

    /**
     * Set the registrationDate property: The registrationDate property.
     * 
     * @param registrationDate the registrationDate value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscriptionId property.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscriptionId property.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private SubscriptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The tenantId property.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenantId property.
     * 
     * @param tenantId the tenantId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the locationPlacementId property: The locationPlacementId property.
     * 
     * @return the locationPlacementId value.
     */
    public String locationPlacementId() {
        return this.innerProperties() == null ? null : this.innerProperties().locationPlacementId();
    }

    /**
     * Set the locationPlacementId property: The locationPlacementId property.
     * 
     * @param locationPlacementId the locationPlacementId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withLocationPlacementId(String locationPlacementId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withLocationPlacementId(locationPlacementId);
        return this;
    }

    /**
     * Get the quotaId property: The quotaId property.
     * 
     * @return the quotaId value.
     */
    public String quotaId() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaId();
    }

    /**
     * Set the quotaId property: The quotaId property.
     * 
     * @param quotaId the quotaId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withQuotaId(String quotaId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withQuotaId(quotaId);
        return this;
    }

    /**
     * Get the serializedDetails property: The serializedDetails property.
     * 
     * @return the serializedDetails value.
     */
    public String serializedDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().serializedDetails();
    }

    /**
     * Set the serializedDetails property: The serializedDetails property.
     * 
     * @param serializedDetails the serializedDetails value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withSerializedDetails(String serializedDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withSerializedDetails(serializedDetails);
        return this;
    }

    /**
     * Get the registeredFeatures property: The registeredFeatures property.
     * 
     * @return the registeredFeatures value.
     */
    public List<SubscriptionRegisteredFeatures> registeredFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().registeredFeatures();
    }

    /**
     * Set the registeredFeatures property: The registeredFeatures property.
     * 
     * @param registeredFeatures the registeredFeatures value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegisteredFeatures(List<SubscriptionRegisteredFeatures> registeredFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withRegisteredFeatures(registeredFeatures);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("registrationId", this.registrationId);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("registrationDate", this.registrationDate);
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EdgeProfileSubscription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EdgeProfileSubscription if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EdgeProfileSubscription.
     */
    public static EdgeProfileSubscription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EdgeProfileSubscription deserializedEdgeProfileSubscription = new EdgeProfileSubscription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("registrationId".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.registrationId = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.id = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.state = SubscriptionState.fromString(reader.getString());
                } else if ("registrationDate".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.registrationDate = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.subscriptionId = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedEdgeProfileSubscription.innerProperties = SubscriptionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEdgeProfileSubscription;
        });
    }
}
