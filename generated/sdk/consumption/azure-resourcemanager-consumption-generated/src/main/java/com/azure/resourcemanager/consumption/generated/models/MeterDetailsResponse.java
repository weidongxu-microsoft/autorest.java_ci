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

/**
 * The properties of the meter detail.
 */
@Immutable
public final class MeterDetailsResponse implements JsonSerializable<MeterDetailsResponse> {
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
    private String unitOfMeasure;

    /*
     * The service family.
     */
    private String serviceFamily;

    /**
     * Creates an instance of MeterDetailsResponse class.
     */
    public MeterDetailsResponse() {
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
     * Get the unitOfMeasure property: The unit in which the meter consumption is charged, for example, 'Hours', 'GB',
     * etc.
     * 
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the serviceFamily property: The service family.
     * 
     * @return the serviceFamily value.
     */
    public String serviceFamily() {
        return this.serviceFamily;
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
     * Reads an instance of MeterDetailsResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MeterDetailsResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MeterDetailsResponse.
     */
    public static MeterDetailsResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MeterDetailsResponse deserializedMeterDetailsResponse = new MeterDetailsResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("meterName".equals(fieldName)) {
                    deserializedMeterDetailsResponse.meterName = reader.getString();
                } else if ("meterCategory".equals(fieldName)) {
                    deserializedMeterDetailsResponse.meterCategory = reader.getString();
                } else if ("meterSubCategory".equals(fieldName)) {
                    deserializedMeterDetailsResponse.meterSubCategory = reader.getString();
                } else if ("unitOfMeasure".equals(fieldName)) {
                    deserializedMeterDetailsResponse.unitOfMeasure = reader.getString();
                } else if ("serviceFamily".equals(fieldName)) {
                    deserializedMeterDetailsResponse.serviceFamily = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMeterDetailsResponse;
        });
    }
}
