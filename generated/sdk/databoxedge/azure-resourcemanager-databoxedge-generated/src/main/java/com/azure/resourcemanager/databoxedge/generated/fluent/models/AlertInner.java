// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.AlertErrorDetails;
import com.azure.resourcemanager.databoxedge.generated.models.AlertSeverity;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Alert on the data box edge/gateway device.
 */
@Immutable
public final class AlertInner extends ArmBaseModel {
    /*
     * Properties of alert.
     */
    private AlertProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of Alert
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AlertInner class.
     */
    public AlertInner() {
    }

    /**
     * Get the innerProperties property: Properties of alert.
     * 
     * @return the innerProperties value.
     */
    private AlertProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Alert.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the title property: Alert title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Get the alertType property: Alert type.
     * 
     * @return the alertType value.
     */
    public String alertType() {
        return this.innerProperties() == null ? null : this.innerProperties().alertType();
    }

    /**
     * Get the appearedAtDateTime property: UTC time when the alert appeared.
     * 
     * @return the appearedAtDateTime value.
     */
    public OffsetDateTime appearedAtDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().appearedAtDateTime();
    }

    /**
     * Get the recommendation property: Alert recommendation.
     * 
     * @return the recommendation value.
     */
    public String recommendation() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendation();
    }

    /**
     * Get the severity property: Severity of the alert.
     * 
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Get the errorDetails property: Error details of the alert.
     * 
     * @return the errorDetails value.
     */
    public AlertErrorDetails errorDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().errorDetails();
    }

    /**
     * Get the detailedInformation property: Alert details.
     * 
     * @return the detailedInformation value.
     */
    public Map<String, String> detailedInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedInformation();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AlertInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AlertInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AlertInner.
     */
    public static AlertInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AlertInner deserializedAlertInner = new AlertInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAlertInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAlertInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAlertInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAlertInner.innerProperties = AlertProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAlertInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAlertInner;
        });
    }
}
