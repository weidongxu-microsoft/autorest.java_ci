// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeEnabled;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeSettingsUpdateParameters;
import java.io.IOException;

/**
 * The JSON object that contains the properties required to create a health probe settings.
 */
@Fluent
public final class HealthProbeSettingsProperties extends HealthProbeSettingsUpdateParameters {
    /*
     * Resource status.
     */
    private FrontDoorResourceState resourceState;

    /**
     * Creates an instance of HealthProbeSettingsProperties class.
     */
    public HealthProbeSettingsProperties() {
    }

    /**
     * Get the resourceState property: Resource status.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withPath(String path) {
        super.withPath(path);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withProtocol(FrontDoorProtocol protocol) {
        super.withProtocol(protocol);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withIntervalInSeconds(Integer intervalInSeconds) {
        super.withIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        super.withHealthProbeMethod(healthProbeMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withEnabledState(HealthProbeEnabled enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("path", path());
        jsonWriter.writeStringField("protocol", protocol() == null ? null : protocol().toString());
        jsonWriter.writeNumberField("intervalInSeconds", intervalInSeconds());
        jsonWriter.writeStringField("healthProbeMethod",
            healthProbeMethod() == null ? null : healthProbeMethod().toString());
        jsonWriter.writeStringField("enabledState", enabledState() == null ? null : enabledState().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthProbeSettingsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthProbeSettingsProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HealthProbeSettingsProperties.
     */
    public static HealthProbeSettingsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthProbeSettingsProperties deserializedHealthProbeSettingsProperties
                = new HealthProbeSettingsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties.withPath(reader.getString());
                } else if ("protocol".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties
                        .withProtocol(FrontDoorProtocol.fromString(reader.getString()));
                } else if ("intervalInSeconds".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties
                        .withIntervalInSeconds(reader.getNullable(JsonReader::getInt));
                } else if ("healthProbeMethod".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties
                        .withHealthProbeMethod(FrontDoorHealthProbeMethod.fromString(reader.getString()));
                } else if ("enabledState".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties
                        .withEnabledState(HealthProbeEnabled.fromString(reader.getString()));
                } else if ("resourceState".equals(fieldName)) {
                    deserializedHealthProbeSettingsProperties.resourceState
                        = FrontDoorResourceState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthProbeSettingsProperties;
        });
    }
}
