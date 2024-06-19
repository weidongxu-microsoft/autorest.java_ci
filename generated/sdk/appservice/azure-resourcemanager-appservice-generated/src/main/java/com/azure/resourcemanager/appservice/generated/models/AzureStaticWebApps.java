// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the Azure Static Web Apps provider.
 */
@Fluent
public final class AzureStaticWebApps implements JsonSerializable<AzureStaticWebApps> {
    /*
     * <code>false</code> if the Azure Static Web Apps provider should not be enabled despite the set registration;
     * otherwise, <code>true</code>.
     */
    private Boolean enabled;

    /*
     * The configuration settings of the Azure Static Web Apps registration.
     */
    private AzureStaticWebAppsRegistration registration;

    /**
     * Creates an instance of AzureStaticWebApps class.
     */
    public AzureStaticWebApps() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the AzureStaticWebApps object itself.
     */
    public AzureStaticWebApps withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the Azure Static Web Apps registration.
     * 
     * @return the registration value.
     */
    public AzureStaticWebAppsRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the Azure Static Web Apps registration.
     * 
     * @param registration the registration value to set.
     * @return the AzureStaticWebApps object itself.
     */
    public AzureStaticWebApps withRegistration(AzureStaticWebAppsRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("registration", this.registration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureStaticWebApps from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureStaticWebApps if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureStaticWebApps.
     */
    public static AzureStaticWebApps fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureStaticWebApps deserializedAzureStaticWebApps = new AzureStaticWebApps();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAzureStaticWebApps.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("registration".equals(fieldName)) {
                    deserializedAzureStaticWebApps.registration = AzureStaticWebAppsRegistration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureStaticWebApps;
        });
    }
}
