// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The properties of the modern reservation recommendation for single scope.
 */
@Immutable
public final class ModernSingleScopeReservationRecommendationProperties
    extends ModernReservationRecommendationProperties {
    /*
     * Subscription ID associated with single scoped recommendation.
     */
    private UUID subscriptionId;

    /*
     * The total hours for which the cost is covered.
     */
    private Integer totalHours;

    /*
     * The last usage date used for looking back for computing the recommendation.
     */
    private OffsetDateTime lastUsageDate;

    /*
     * This is the ARM Sku name.
     */
    private String skuName;

    /*
     * List of sku properties
     */
    private List<SkuProperty> skuProperties;

    /*
     * The usage date for looking back.
     */
    private OffsetDateTime firstUsageDate;

    /*
     * Total estimated savings with reserved instances.
     */
    private Amount netSavings;

    /*
     * The total amount of cost with reserved instances.
     */
    private Amount totalCostWithReservedInstances;

    /*
     * Resource type.
     */
    private String resourceType;

    /*
     * Recommended quality for reserved instances.
     */
    private BigDecimal recommendedQuantity;

    /*
     * The total amount of cost without reserved instances.
     */
    private Amount costWithNoReservedInstances;

    /*
     * RI recommendations in one or three year terms.
     */
    private String term;

    /*
     * The meter id (GUID)
     */
    private UUID meterId;

    /*
     * The recommended Quantity Normalized.
     */
    private Float recommendedQuantityNormalized;

    /*
     * The normalized Size.
     */
    private String normalizedSize;

    /*
     * The instance Flexibility Group.
     */
    private String instanceFlexibilityGroup;

    /*
     * The instance Flexibility Ratio.
     */
    private Float instanceFlexibilityRatio;

    /*
     * The number of days of usage to look back for recommendation.
     */
    private Integer lookBackPeriod;

    /*
     * Resource Location.
     */
    private String location;

    /**
     * Creates an instance of ModernSingleScopeReservationRecommendationProperties class.
     */
    public ModernSingleScopeReservationRecommendationProperties() {
        this.scope = "Single";
    }

    /**
     * Get the subscriptionId property: Subscription ID associated with single scoped recommendation.
     * 
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the totalHours property: The total hours for which the cost is covered.
     * 
     * @return the totalHours value.
     */
    @Override
    public Integer totalHours() {
        return this.totalHours;
    }

    /**
     * Get the lastUsageDate property: The last usage date used for looking back for computing the recommendation.
     * 
     * @return the lastUsageDate value.
     */
    @Override
    public OffsetDateTime lastUsageDate() {
        return this.lastUsageDate;
    }

    /**
     * Get the skuName property: This is the ARM Sku name.
     * 
     * @return the skuName value.
     */
    @Override
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the skuProperties property: List of sku properties.
     * 
     * @return the skuProperties value.
     */
    @Override
    public List<SkuProperty> skuProperties() {
        return this.skuProperties;
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     * 
     * @return the firstUsageDate value.
     */
    @Override
    public OffsetDateTime firstUsageDate() {
        return this.firstUsageDate;
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     * 
     * @return the netSavings value.
     */
    @Override
    public Amount netSavings() {
        return this.netSavings;
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     * 
     * @return the totalCostWithReservedInstances value.
     */
    @Override
    public Amount totalCostWithReservedInstances() {
        return this.totalCostWithReservedInstances;
    }

    /**
     * Get the resourceType property: Resource type.
     * 
     * @return the resourceType value.
     */
    @Override
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     * 
     * @return the recommendedQuantity value.
     */
    @Override
    public BigDecimal recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     * 
     * @return the costWithNoReservedInstances value.
     */
    @Override
    public Amount costWithNoReservedInstances() {
        return this.costWithNoReservedInstances;
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     * 
     * @return the term value.
     */
    @Override
    public String term() {
        return this.term;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     * 
     * @return the meterId value.
     */
    @Override
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     * 
     * @return the recommendedQuantityNormalized value.
     */
    @Override
    public Float recommendedQuantityNormalized() {
        return this.recommendedQuantityNormalized;
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     * 
     * @return the normalizedSize value.
     */
    @Override
    public String normalizedSize() {
        return this.normalizedSize;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     * 
     * @return the instanceFlexibilityGroup value.
     */
    @Override
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     * 
     * @return the instanceFlexibilityRatio value.
     */
    @Override
    public Float instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     * 
     * @return the lookBackPeriod value.
     */
    @Override
    public Integer lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Get the location property: Resource Location.
     * 
     * @return the location value.
     */
    @Override
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (costWithNoReservedInstances() != null) {
            costWithNoReservedInstances().validate();
        }
        if (totalCostWithReservedInstances() != null) {
            totalCostWithReservedInstances().validate();
        }
        if (netSavings() != null) {
            netSavings().validate();
        }
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModernSingleScopeReservationRecommendationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModernSingleScopeReservationRecommendationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModernSingleScopeReservationRecommendationProperties.
     */
    public static ModernSingleScopeReservationRecommendationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ModernSingleScopeReservationRecommendationProperties deserializedModernSingleScopeReservationRecommendationProperties
                = new ModernSingleScopeReservationRecommendationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.location = reader.getString();
                } else if ("lookBackPeriod".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.lookBackPeriod
                        = reader.getNullable(JsonReader::getInt);
                } else if ("instanceFlexibilityRatio".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.instanceFlexibilityRatio
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("instanceFlexibilityGroup".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.instanceFlexibilityGroup
                        = reader.getString();
                } else if ("normalizedSize".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.normalizedSize
                        = reader.getString();
                } else if ("recommendedQuantityNormalized".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.recommendedQuantityNormalized
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("meterId".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.meterId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("term".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.term = reader.getString();
                } else if ("costWithNoReservedInstances".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.costWithNoReservedInstances
                        = Amount.fromJson(reader);
                } else if ("recommendedQuantity".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.recommendedQuantity
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("resourceType".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.resourceType = reader.getString();
                } else if ("totalCostWithReservedInstances".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.totalCostWithReservedInstances
                        = Amount.fromJson(reader);
                } else if ("netSavings".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.netSavings
                        = Amount.fromJson(reader);
                } else if ("firstUsageDate".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.firstUsageDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("skuProperties".equals(fieldName)) {
                    List<SkuProperty> skuProperties = reader.readArray(reader1 -> SkuProperty.fromJson(reader1));
                    deserializedModernSingleScopeReservationRecommendationProperties.skuProperties = skuProperties;
                } else if ("skuName".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.skuName = reader.getString();
                } else if ("lastUsageDate".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.lastUsageDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("totalHours".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.totalHours
                        = reader.getNullable(JsonReader::getInt);
                } else if ("scope".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.scope = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.subscriptionId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModernSingleScopeReservationRecommendationProperties;
        });
    }
}
