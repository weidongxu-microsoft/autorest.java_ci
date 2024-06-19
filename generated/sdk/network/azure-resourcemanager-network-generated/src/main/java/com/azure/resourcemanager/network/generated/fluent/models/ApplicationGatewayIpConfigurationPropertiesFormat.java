// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of IP configuration of an application gateway.
 */
@Fluent
public final class ApplicationGatewayIpConfigurationPropertiesFormat
    implements JsonSerializable<ApplicationGatewayIpConfigurationPropertiesFormat> {
    /*
     * Reference to the subnet resource. A subnet from where application gateway gets its private address.
     */
    private SubResource subnet;

    /*
     * The provisioning state of the application gateway IP configuration resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewayIpConfigurationPropertiesFormat class.
     */
    public ApplicationGatewayIpConfigurationPropertiesFormat() {
    }

    /**
     * Get the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     * 
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeJsonField("subnet", this.subnet);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayIpConfigurationPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayIpConfigurationPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayIpConfigurationPropertiesFormat.
     */
    public static ApplicationGatewayIpConfigurationPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayIpConfigurationPropertiesFormat deserializedApplicationGatewayIpConfigurationPropertiesFormat
                = new ApplicationGatewayIpConfigurationPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subnet".equals(fieldName)) {
                    deserializedApplicationGatewayIpConfigurationPropertiesFormat.subnet = SubResource.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewayIpConfigurationPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayIpConfigurationPropertiesFormat;
        });
    }
}
