// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.ProactiveDiagnosticsConsent;
import java.io.IOException;

/**
 * The diagnostic proactive log collection settings of a device.
 */
@Fluent
public final class DiagnosticProactiveLogCollectionSettingsInner extends ArmBaseModel {
    /*
     * Properties of the diagnostic proactive log collection settings.
     */
    private ProactiveLogCollectionSettingsProperties innerProperties = new ProactiveLogCollectionSettingsProperties();

    /*
     * Metadata pertaining to creation and last modification of DiagnosticProactiveLogCollectionSettings
     */
    private SystemData systemData;

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
     * Creates an instance of DiagnosticProactiveLogCollectionSettingsInner class.
     */
    public DiagnosticProactiveLogCollectionSettingsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the diagnostic proactive log collection settings.
     * 
     * @return the innerProperties value.
     */
    private ProactiveLogCollectionSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of
     * DiagnosticProactiveLogCollectionSettings.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the userConsent property: Proactive diagnostic collection consent flag.
     * 
     * @return the userConsent value.
     */
    public ProactiveDiagnosticsConsent userConsent() {
        return this.innerProperties() == null ? null : this.innerProperties().userConsent();
    }

    /**
     * Set the userConsent property: Proactive diagnostic collection consent flag.
     * 
     * @param userConsent the userConsent value to set.
     * @return the DiagnosticProactiveLogCollectionSettingsInner object itself.
     */
    public DiagnosticProactiveLogCollectionSettingsInner withUserConsent(ProactiveDiagnosticsConsent userConsent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProactiveLogCollectionSettingsProperties();
        }
        this.innerProperties().withUserConsent(userConsent);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model DiagnosticProactiveLogCollectionSettingsInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticProactiveLogCollectionSettingsInner.class);

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
     * Reads an instance of DiagnosticProactiveLogCollectionSettingsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticProactiveLogCollectionSettingsInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiagnosticProactiveLogCollectionSettingsInner.
     */
    public static DiagnosticProactiveLogCollectionSettingsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticProactiveLogCollectionSettingsInner deserializedDiagnosticProactiveLogCollectionSettingsInner
                = new DiagnosticProactiveLogCollectionSettingsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDiagnosticProactiveLogCollectionSettingsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDiagnosticProactiveLogCollectionSettingsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDiagnosticProactiveLogCollectionSettingsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDiagnosticProactiveLogCollectionSettingsInner.innerProperties
                        = ProactiveLogCollectionSettingsProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedDiagnosticProactiveLogCollectionSettingsInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticProactiveLogCollectionSettingsInner;
        });
    }
}
