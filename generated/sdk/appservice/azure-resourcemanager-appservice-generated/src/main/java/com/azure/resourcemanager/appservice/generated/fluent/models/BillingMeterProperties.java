// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BillingMeter resource specific properties.
 */
@Fluent
public final class BillingMeterProperties implements JsonSerializable<BillingMeterProperties> {
    /*
     * Meter GUID onboarded in Commerce
     */
    private String meterId;

    /*
     * Azure Location of billable resource
     */
    private String billingLocation;

    /*
     * Short Name from App Service Azure pricing Page
     */
    private String shortName;

    /*
     * Friendly name of the meter
     */
    private String friendlyName;

    /*
     * App Service ResourceType meter used for
     */
    private String resourceType;

    /*
     * App Service OS type meter used for
     */
    private String osType;

    /*
     * Meter Multiplier
     */
    private Double multiplier;

    /**
     * Creates an instance of BillingMeterProperties class.
     */
    public BillingMeterProperties() {
    }

    /**
     * Get the meterId property: Meter GUID onboarded in Commerce.
     * 
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set the meterId property: Meter GUID onboarded in Commerce.
     * 
     * @param meterId the meterId value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get the billingLocation property: Azure Location of billable resource.
     * 
     * @return the billingLocation value.
     */
    public String billingLocation() {
        return this.billingLocation;
    }

    /**
     * Set the billingLocation property: Azure Location of billable resource.
     * 
     * @param billingLocation the billingLocation value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withBillingLocation(String billingLocation) {
        this.billingLocation = billingLocation;
        return this;
    }

    /**
     * Get the shortName property: Short Name from App Service Azure pricing Page.
     * 
     * @return the shortName value.
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set the shortName property: Short Name from App Service Azure pricing Page.
     * 
     * @param shortName the shortName value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the meter.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the meter.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the resourceType property: App Service ResourceType meter used for.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: App Service ResourceType meter used for.
     * 
     * @param resourceType the resourceType value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the osType property: App Service OS type meter used for.
     * 
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: App Service OS type meter used for.
     * 
     * @param osType the osType value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the multiplier property: Meter Multiplier.
     * 
     * @return the multiplier value.
     */
    public Double multiplier() {
        return this.multiplier;
    }

    /**
     * Set the multiplier property: Meter Multiplier.
     * 
     * @param multiplier the multiplier value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withMultiplier(Double multiplier) {
        this.multiplier = multiplier;
        return this;
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
        jsonWriter.writeStringField("meterId", this.meterId);
        jsonWriter.writeStringField("billingLocation", this.billingLocation);
        jsonWriter.writeStringField("shortName", this.shortName);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("osType", this.osType);
        jsonWriter.writeNumberField("multiplier", this.multiplier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingMeterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingMeterProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BillingMeterProperties.
     */
    public static BillingMeterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingMeterProperties deserializedBillingMeterProperties = new BillingMeterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("meterId".equals(fieldName)) {
                    deserializedBillingMeterProperties.meterId = reader.getString();
                } else if ("billingLocation".equals(fieldName)) {
                    deserializedBillingMeterProperties.billingLocation = reader.getString();
                } else if ("shortName".equals(fieldName)) {
                    deserializedBillingMeterProperties.shortName = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedBillingMeterProperties.friendlyName = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedBillingMeterProperties.resourceType = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedBillingMeterProperties.osType = reader.getString();
                } else if ("multiplier".equals(fieldName)) {
                    deserializedBillingMeterProperties.multiplier = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingMeterProperties;
        });
    }
}
