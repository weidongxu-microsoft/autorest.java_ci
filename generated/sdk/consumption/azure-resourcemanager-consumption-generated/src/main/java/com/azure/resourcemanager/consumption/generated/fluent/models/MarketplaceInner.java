// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * A marketplace resource.
 */
@Immutable
public final class MarketplaceInner extends ProxyResource {
    /*
     * The properties of the marketplace usage detail.
     */
    private MarketplaceProperties innerProperties;

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
     * Creates an instance of MarketplaceInner class.
     */
    public MarketplaceInner() {
    }

    /**
     * Get the innerProperties property: The properties of the marketplace usage detail.
     * 
     * @return the innerProperties value.
     */
    private MarketplaceProperties innerProperties() {
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
     * Get the billingPeriodId property: The id of the billing period resource that the usage belongs to.
     * 
     * @return the billingPeriodId value.
     */
    public String billingPeriodId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPeriodId();
    }

    /**
     * Get the usageStart property: The start of the date time range covered by the usage detail.
     * 
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.innerProperties() == null ? null : this.innerProperties().usageStart();
    }

    /**
     * Get the usageEnd property: The end of the date time range covered by the usage detail.
     * 
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.innerProperties() == null ? null : this.innerProperties().usageEnd();
    }

    /**
     * Get the resourceRate property: The marketplace resource rate.
     * 
     * @return the resourceRate value.
     */
    public BigDecimal resourceRate() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceRate();
    }

    /**
     * Get the offerName property: The type of offer.
     * 
     * @return the offerName value.
     */
    public String offerName() {
        return this.innerProperties() == null ? null : this.innerProperties().offerName();
    }

    /**
     * Get the resourceGroup property: The name of resource group.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the additionalInfo property: Additional information.
     * 
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalInfo();
    }

    /**
     * Get the orderNumber property: The order number.
     * 
     * @return the orderNumber value.
     */
    public String orderNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().orderNumber();
    }

    /**
     * Get the instanceName property: The name of the resource instance that the usage is about.
     * 
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceName();
    }

    /**
     * Get the instanceId property: The uri of the resource instance that the usage is about.
     * 
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceId();
    }

    /**
     * Get the currency property: The ISO currency in which the meter is charged, for example, USD.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the consumedQuantity property: The quantity of usage.
     * 
     * @return the consumedQuantity value.
     */
    public BigDecimal consumedQuantity() {
        return this.innerProperties() == null ? null : this.innerProperties().consumedQuantity();
    }

    /**
     * Get the unitOfMeasure property: The unit of measure.
     * 
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.innerProperties() == null ? null : this.innerProperties().unitOfMeasure();
    }

    /**
     * Get the pretaxCost property: The amount of cost before tax.
     * 
     * @return the pretaxCost value.
     */
    public BigDecimal pretaxCost() {
        return this.innerProperties() == null ? null : this.innerProperties().pretaxCost();
    }

    /**
     * Get the isEstimated property: The estimated usage is subject to change.
     * 
     * @return the isEstimated value.
     */
    public Boolean isEstimated() {
        return this.innerProperties() == null ? null : this.innerProperties().isEstimated();
    }

    /**
     * Get the meterId property: The meter id (GUID).
     * 
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.innerProperties() == null ? null : this.innerProperties().meterId();
    }

    /**
     * Get the subscriptionGuid property: Subscription guid.
     * 
     * @return the subscriptionGuid value.
     */
    public UUID subscriptionGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionGuid();
    }

    /**
     * Get the subscriptionName property: Subscription name.
     * 
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionName();
    }

    /**
     * Get the accountName property: Account name.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.innerProperties() == null ? null : this.innerProperties().accountName();
    }

    /**
     * Get the departmentName property: Department name.
     * 
     * @return the departmentName value.
     */
    public String departmentName() {
        return this.innerProperties() == null ? null : this.innerProperties().departmentName();
    }

    /**
     * Get the consumedService property: Consumed service name.
     * 
     * @return the consumedService value.
     */
    public String consumedService() {
        return this.innerProperties() == null ? null : this.innerProperties().consumedService();
    }

    /**
     * Get the costCenter property: The cost center of this department if it is a department and a costcenter exists.
     * 
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.innerProperties() == null ? null : this.innerProperties().costCenter();
    }

    /**
     * Get the additionalProperties property: Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     * 
     * @return the additionalProperties value.
     */
    public String additionalProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalProperties();
    }

    /**
     * Get the publisherName property: The name of publisher.
     * 
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.innerProperties() == null ? null : this.innerProperties().publisherName();
    }

    /**
     * Get the planName property: The name of plan.
     * 
     * @return the planName value.
     */
    public String planName() {
        return this.innerProperties() == null ? null : this.innerProperties().planName();
    }

    /**
     * Get the isRecurringCharge property: Flag indicating whether this is a recurring charge or not.
     * 
     * @return the isRecurringCharge value.
     */
    public Boolean isRecurringCharge() {
        return this.innerProperties() == null ? null : this.innerProperties().isRecurringCharge();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MarketplaceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketplaceInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MarketplaceInner.
     */
    public static MarketplaceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketplaceInner deserializedMarketplaceInner = new MarketplaceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMarketplaceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMarketplaceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMarketplaceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedMarketplaceInner.innerProperties = MarketplaceProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedMarketplaceInner.etag = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedMarketplaceInner.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMarketplaceInner;
        });
    }
}
