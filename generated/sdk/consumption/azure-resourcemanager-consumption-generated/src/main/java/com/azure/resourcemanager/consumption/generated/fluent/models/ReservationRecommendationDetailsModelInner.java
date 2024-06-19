// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsResourceProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsSavingsProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsUsageProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Reservation recommendation details.
 */
@Fluent
public final class ReservationRecommendationDetailsModelInner extends ProxyResource {
    /*
     * Resource Location.
     */
    private String location;

    /*
     * Resource sku
     */
    private String sku;

    /*
     * The properties of the reservation recommendation.
     */
    private ReservationRecommendationDetailsProperties innerProperties;

    /*
     * The etag for the resource.
     */
    private String etag;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ReservationRecommendationDetailsModelInner class.
     */
    public ReservationRecommendationDetailsModelInner() {
    }

    /**
     * Get the location property: Resource Location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     * 
     * @param location the location value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: Resource sku.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Resource sku.
     * 
     * @param sku the sku value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the reservation recommendation.
     * 
     * @return the innerProperties value.
     */
    private ReservationRecommendationDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The etag for the resource.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the currency property: An ISO 4217 currency code identifier for the costs and savings.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the resource property: Resource specific properties.
     * 
     * @return the resource value.
     */
    public ReservationRecommendationDetailsResourceProperties resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Get the resourceGroup property: Resource Group.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the savings property: Savings information for the recommendation.
     * 
     * @return the savings value.
     */
    public ReservationRecommendationDetailsSavingsProperties savings() {
        return this.innerProperties() == null ? null : this.innerProperties().savings();
    }

    /**
     * Get the scope property: Scope of the reservation, ex: Single or Shared.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the usage property: Historical usage details used to calculate the estimated savings.
     * 
     * @return the usage value.
     */
    public ReservationRecommendationDetailsUsageProperties usage() {
        return this.innerProperties() == null ? null : this.innerProperties().usage();
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
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeStringField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationRecommendationDetailsModelInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationRecommendationDetailsModelInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReservationRecommendationDetailsModelInner.
     */
    public static ReservationRecommendationDetailsModelInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationRecommendationDetailsModelInner deserializedReservationRecommendationDetailsModelInner
                = new ReservationRecommendationDetailsModelInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.location = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.sku = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.innerProperties
                        = ReservationRecommendationDetailsProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedReservationRecommendationDetailsModelInner.etag = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedReservationRecommendationDetailsModelInner.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationRecommendationDetailsModelInner;
        });
    }
}
