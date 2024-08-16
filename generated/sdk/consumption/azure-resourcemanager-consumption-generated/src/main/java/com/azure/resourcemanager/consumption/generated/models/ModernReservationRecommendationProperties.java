// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The properties of the reservation recommendation.
 */
@Immutable
public class ModernReservationRecommendationProperties
    implements JsonSerializable<ModernReservationRecommendationProperties> {
    /*
     * Shared or single recommendation.
     */
    String scope;

    /*
     * Resource Location.
     */
    private String location;

    /*
     * The number of days of usage to look back for recommendation.
     */
    private Integer lookBackPeriod;

    /*
     * The instance Flexibility Ratio.
     */
    private Float instanceFlexibilityRatio;

    /*
     * The instance Flexibility Group.
     */
    private String instanceFlexibilityGroup;

    /*
     * The normalized Size.
     */
    private String normalizedSize;

    /*
     * The recommended Quantity Normalized.
     */
    private Float recommendedQuantityNormalized;

    /*
     * The meter id (GUID)
     */
    private UUID meterId;

    /*
     * RI recommendations in one or three year terms.
     */
    private String term;

    /*
     * The total amount of cost without reserved instances.
     */
    private Amount costWithNoReservedInstances;

    /*
     * Recommended quality for reserved instances.
     */
    private BigDecimal recommendedQuantity;

    /*
     * Resource type.
     */
    private String resourceType;

    /*
     * The total amount of cost with reserved instances.
     */
    private Amount totalCostWithReservedInstances;

    /*
     * Total estimated savings with reserved instances.
     */
    private Amount netSavings;

    /*
     * The usage date for looking back.
     */
    private OffsetDateTime firstUsageDate;

    /*
     * List of sku properties
     */
    private List<SkuProperty> skuProperties;

    /*
     * This is the ARM Sku name.
     */
    private String skuName;

    /*
     * The last usage date used for looking back for computing the recommendation.
     */
    private OffsetDateTime lastUsageDate;

    /*
     * The total hours for which the cost is covered.
     */
    private Integer totalHours;

    /**
     * Creates an instance of ModernReservationRecommendationProperties class.
     */
    public ModernReservationRecommendationProperties() {
        this.scope = "ModernReservationRecommendationProperties";
    }

    /**
     * Get the scope property: Shared or single recommendation.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
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
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     * 
     * @return the lookBackPeriod value.
     */
    public Integer lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Set the lookBackPeriod property: The number of days of usage to look back for recommendation.
     * 
     * @param lookBackPeriod the lookBackPeriod value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withLookBackPeriod(Integer lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
        return this;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     * 
     * @return the instanceFlexibilityRatio value.
     */
    public Float instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Set the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     * 
     * @param instanceFlexibilityRatio the instanceFlexibilityRatio value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withInstanceFlexibilityRatio(Float instanceFlexibilityRatio) {
        this.instanceFlexibilityRatio = instanceFlexibilityRatio;
        return this;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     * 
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Set the instanceFlexibilityGroup property: The instance Flexibility Group.
     * 
     * @param instanceFlexibilityGroup the instanceFlexibilityGroup value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withInstanceFlexibilityGroup(String instanceFlexibilityGroup) {
        this.instanceFlexibilityGroup = instanceFlexibilityGroup;
        return this;
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     * 
     * @return the normalizedSize value.
     */
    public String normalizedSize() {
        return this.normalizedSize;
    }

    /**
     * Set the normalizedSize property: The normalized Size.
     * 
     * @param normalizedSize the normalizedSize value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withNormalizedSize(String normalizedSize) {
        this.normalizedSize = normalizedSize;
        return this;
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     * 
     * @return the recommendedQuantityNormalized value.
     */
    public Float recommendedQuantityNormalized() {
        return this.recommendedQuantityNormalized;
    }

    /**
     * Set the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     * 
     * @param recommendedQuantityNormalized the recommendedQuantityNormalized value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withRecommendedQuantityNormalized(Float recommendedQuantityNormalized) {
        this.recommendedQuantityNormalized = recommendedQuantityNormalized;
        return this;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     * 
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Set the meterId property: The meter id (GUID).
     * 
     * @param meterId the meterId value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withMeterId(UUID meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     * 
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Set the term property: RI recommendations in one or three year terms.
     * 
     * @param term the term value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withTerm(String term) {
        this.term = term;
        return this;
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     * 
     * @return the costWithNoReservedInstances value.
     */
    public Amount costWithNoReservedInstances() {
        return this.costWithNoReservedInstances;
    }

    /**
     * Set the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     * 
     * @param costWithNoReservedInstances the costWithNoReservedInstances value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withCostWithNoReservedInstances(Amount costWithNoReservedInstances) {
        this.costWithNoReservedInstances = costWithNoReservedInstances;
        return this;
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     * 
     * @return the recommendedQuantity value.
     */
    public BigDecimal recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Set the recommendedQuantity property: Recommended quality for reserved instances.
     * 
     * @param recommendedQuantity the recommendedQuantity value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withRecommendedQuantity(BigDecimal recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
        return this;
    }

    /**
     * Get the resourceType property: Resource type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     * 
     * @return the totalCostWithReservedInstances value.
     */
    public Amount totalCostWithReservedInstances() {
        return this.totalCostWithReservedInstances;
    }

    /**
     * Set the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     * 
     * @param totalCostWithReservedInstances the totalCostWithReservedInstances value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties
        withTotalCostWithReservedInstances(Amount totalCostWithReservedInstances) {
        this.totalCostWithReservedInstances = totalCostWithReservedInstances;
        return this;
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     * 
     * @return the netSavings value.
     */
    public Amount netSavings() {
        return this.netSavings;
    }

    /**
     * Set the netSavings property: Total estimated savings with reserved instances.
     * 
     * @param netSavings the netSavings value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withNetSavings(Amount netSavings) {
        this.netSavings = netSavings;
        return this;
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     * 
     * @return the firstUsageDate value.
     */
    public OffsetDateTime firstUsageDate() {
        return this.firstUsageDate;
    }

    /**
     * Set the firstUsageDate property: The usage date for looking back.
     * 
     * @param firstUsageDate the firstUsageDate value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withFirstUsageDate(OffsetDateTime firstUsageDate) {
        this.firstUsageDate = firstUsageDate;
        return this;
    }

    /**
     * Get the skuProperties property: List of sku properties.
     * 
     * @return the skuProperties value.
     */
    public List<SkuProperty> skuProperties() {
        return this.skuProperties;
    }

    /**
     * Set the skuProperties property: List of sku properties.
     * 
     * @param skuProperties the skuProperties value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withSkuProperties(List<SkuProperty> skuProperties) {
        this.skuProperties = skuProperties;
        return this;
    }

    /**
     * Get the skuName property: This is the ARM Sku name.
     * 
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: This is the ARM Sku name.
     * 
     * @param skuName the skuName value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the lastUsageDate property: The last usage date used for looking back for computing the recommendation.
     * 
     * @return the lastUsageDate value.
     */
    public OffsetDateTime lastUsageDate() {
        return this.lastUsageDate;
    }

    /**
     * Set the lastUsageDate property: The last usage date used for looking back for computing the recommendation.
     * 
     * @param lastUsageDate the lastUsageDate value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withLastUsageDate(OffsetDateTime lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
        return this;
    }

    /**
     * Get the totalHours property: The total hours for which the cost is covered.
     * 
     * @return the totalHours value.
     */
    public Integer totalHours() {
        return this.totalHours;
    }

    /**
     * Set the totalHours property: The total hours for which the cost is covered.
     * 
     * @param totalHours the totalHours value to set.
     * @return the ModernReservationRecommendationProperties object itself.
     */
    ModernReservationRecommendationProperties withTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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

    void toJsonShared(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStringField("scope", this.scope);
    }

    /**
     * Reads an instance of ModernReservationRecommendationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModernReservationRecommendationProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModernReservationRecommendationProperties.
     */
    public static ModernReservationRecommendationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("scope".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Single".equals(discriminatorValue)) {
                    return ModernSingleScopeReservationRecommendationProperties.fromJson(readerToUse.reset());
                } else if ("Shared".equals(discriminatorValue)) {
                    return ModernSharedScopeReservationRecommendationProperties.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ModernReservationRecommendationProperties fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ModernReservationRecommendationProperties deserializedModernReservationRecommendationProperties
                = new ModernReservationRecommendationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scope".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.scope = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.location = reader.getString();
                } else if ("lookBackPeriod".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.lookBackPeriod
                        = reader.getNullable(JsonReader::getInt);
                } else if ("instanceFlexibilityRatio".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.instanceFlexibilityRatio
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("instanceFlexibilityGroup".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.instanceFlexibilityGroup = reader.getString();
                } else if ("normalizedSize".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.normalizedSize = reader.getString();
                } else if ("recommendedQuantityNormalized".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.recommendedQuantityNormalized
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("meterId".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.meterId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("term".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.term = reader.getString();
                } else if ("costWithNoReservedInstances".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.costWithNoReservedInstances
                        = Amount.fromJson(reader);
                } else if ("recommendedQuantity".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.recommendedQuantity
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("resourceType".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.resourceType = reader.getString();
                } else if ("totalCostWithReservedInstances".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.totalCostWithReservedInstances
                        = Amount.fromJson(reader);
                } else if ("netSavings".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.netSavings = Amount.fromJson(reader);
                } else if ("firstUsageDate".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.firstUsageDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("skuProperties".equals(fieldName)) {
                    List<SkuProperty> skuProperties = reader.readArray(reader1 -> SkuProperty.fromJson(reader1));
                    deserializedModernReservationRecommendationProperties.skuProperties = skuProperties;
                } else if ("skuName".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.skuName = reader.getString();
                } else if ("lastUsageDate".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.lastUsageDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("totalHours".equals(fieldName)) {
                    deserializedModernReservationRecommendationProperties.totalHours
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModernReservationRecommendationProperties;
        });
    }
}
