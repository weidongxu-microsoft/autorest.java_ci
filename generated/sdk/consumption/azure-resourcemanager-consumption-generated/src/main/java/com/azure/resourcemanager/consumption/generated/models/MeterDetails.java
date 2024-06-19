// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The properties of the meter detail.
 */
@Immutable
public final class MeterDetails implements JsonSerializable<MeterDetails> {
    /*
     * The name of the meter, within the given meter category
     */
    private String meterName;

    /*
     * The category of the meter, for example, 'Cloud services', 'Networking', etc..
     */
    private String meterCategory;

    /*
     * The subcategory of the meter, for example, 'A6 Cloud services', 'ExpressRoute (IXP)', etc..
     */
    private String meterSubCategory;

    /*
     * The unit in which the meter consumption is charged, for example, 'Hours', 'GB', etc.
     */
    private String unit;

    /*
     * The location in which the Azure service is available.
     */
    private String meterLocation;

    /*
     * The total included quantity associated with the offer.
     */
    private BigDecimal totalIncludedQuantity;

    /*
     * The pretax listing price.
     */
    private BigDecimal pretaxStandardRate;

    /*
     * The name of the service.
     */
    private String serviceName;

    /*
     * The service tier.
     */
    private String serviceTier;

    /**
     * Creates an instance of MeterDetails class.
     */
    public MeterDetails() {
    }

    /**
     * Get the meterName property: The name of the meter, within the given meter category.
     * 
     * @return the meterName value.
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Get the meterCategory property: The category of the meter, for example, 'Cloud services', 'Networking', etc..
     * 
     * @return the meterCategory value.
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Get the meterSubCategory property: The subcategory of the meter, for example, 'A6 Cloud services', 'ExpressRoute
     * (IXP)', etc..
     * 
     * @return the meterSubCategory value.
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Get the unit property: The unit in which the meter consumption is charged, for example, 'Hours', 'GB', etc.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the meterLocation property: The location in which the Azure service is available.
     * 
     * @return the meterLocation value.
     */
    public String meterLocation() {
        return this.meterLocation;
    }

    /**
     * Get the totalIncludedQuantity property: The total included quantity associated with the offer.
     * 
     * @return the totalIncludedQuantity value.
     */
    public BigDecimal totalIncludedQuantity() {
        return this.totalIncludedQuantity;
    }

    /**
     * Get the pretaxStandardRate property: The pretax listing price.
     * 
     * @return the pretaxStandardRate value.
     */
    public BigDecimal pretaxStandardRate() {
        return this.pretaxStandardRate;
    }

    /**
     * Get the serviceName property: The name of the service.
     * 
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Get the serviceTier property: The service tier.
     * 
     * @return the serviceTier value.
     */
    public String serviceTier() {
        return this.serviceTier;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MeterDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MeterDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MeterDetails.
     */
    public static MeterDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MeterDetails deserializedMeterDetails = new MeterDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("meterName".equals(fieldName)) {
                    deserializedMeterDetails.meterName = reader.getString();
                } else if ("meterCategory".equals(fieldName)) {
                    deserializedMeterDetails.meterCategory = reader.getString();
                } else if ("meterSubCategory".equals(fieldName)) {
                    deserializedMeterDetails.meterSubCategory = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedMeterDetails.unit = reader.getString();
                } else if ("meterLocation".equals(fieldName)) {
                    deserializedMeterDetails.meterLocation = reader.getString();
                } else if ("totalIncludedQuantity".equals(fieldName)) {
                    deserializedMeterDetails.totalIncludedQuantity
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("pretaxStandardRate".equals(fieldName)) {
                    deserializedMeterDetails.pretaxStandardRate
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("serviceName".equals(fieldName)) {
                    deserializedMeterDetails.serviceName = reader.getString();
                } else if ("serviceTier".equals(fieldName)) {
                    deserializedMeterDetails.serviceTier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMeterDetails;
        });
    }
}
