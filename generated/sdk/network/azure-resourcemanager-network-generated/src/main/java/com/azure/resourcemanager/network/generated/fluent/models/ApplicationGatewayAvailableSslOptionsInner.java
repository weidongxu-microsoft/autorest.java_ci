// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslPolicyName;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Response for ApplicationGatewayAvailableSslOptions API service call.
 */
@Fluent
public final class ApplicationGatewayAvailableSslOptionsInner extends Resource {
    /*
     * Properties of the application gateway available SSL options.
     */
    private ApplicationGatewayAvailableSslOptionsPropertiesFormat innerProperties;

    /*
     * Resource ID.
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
     * Creates an instance of ApplicationGatewayAvailableSslOptionsInner class.
     */
    public ApplicationGatewayAvailableSslOptionsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway available SSL options.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayAvailableSslOptionsPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withId(String id) {
        this.id = id;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayAvailableSslOptionsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayAvailableSslOptionsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the predefinedPolicies property: List of available Ssl predefined policy.
     * 
     * @return the predefinedPolicies value.
     */
    public List<SubResource> predefinedPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().predefinedPolicies();
    }

    /**
     * Set the predefinedPolicies property: List of available Ssl predefined policy.
     * 
     * @param predefinedPolicies the predefinedPolicies value to set.
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withPredefinedPolicies(List<SubResource> predefinedPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayAvailableSslOptionsPropertiesFormat();
        }
        this.innerProperties().withPredefinedPolicies(predefinedPolicies);
        return this;
    }

    /**
     * Get the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     * 
     * @return the defaultPolicy value.
     */
    public ApplicationGatewaySslPolicyName defaultPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultPolicy();
    }

    /**
     * Set the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     * 
     * @param defaultPolicy the defaultPolicy value to set.
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner withDefaultPolicy(ApplicationGatewaySslPolicyName defaultPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayAvailableSslOptionsPropertiesFormat();
        }
        this.innerProperties().withDefaultPolicy(defaultPolicy);
        return this;
    }

    /**
     * Get the availableCipherSuites property: List of available Ssl cipher suites.
     * 
     * @return the availableCipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> availableCipherSuites() {
        return this.innerProperties() == null ? null : this.innerProperties().availableCipherSuites();
    }

    /**
     * Set the availableCipherSuites property: List of available Ssl cipher suites.
     * 
     * @param availableCipherSuites the availableCipherSuites value to set.
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner
        withAvailableCipherSuites(List<ApplicationGatewaySslCipherSuite> availableCipherSuites) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayAvailableSslOptionsPropertiesFormat();
        }
        this.innerProperties().withAvailableCipherSuites(availableCipherSuites);
        return this;
    }

    /**
     * Get the availableProtocols property: List of available Ssl protocols.
     * 
     * @return the availableProtocols value.
     */
    public List<ApplicationGatewaySslProtocol> availableProtocols() {
        return this.innerProperties() == null ? null : this.innerProperties().availableProtocols();
    }

    /**
     * Set the availableProtocols property: List of available Ssl protocols.
     * 
     * @param availableProtocols the availableProtocols value to set.
     * @return the ApplicationGatewayAvailableSslOptionsInner object itself.
     */
    public ApplicationGatewayAvailableSslOptionsInner
        withAvailableProtocols(List<ApplicationGatewaySslProtocol> availableProtocols) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayAvailableSslOptionsPropertiesFormat();
        }
        this.innerProperties().withAvailableProtocols(availableProtocols);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayAvailableSslOptionsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayAvailableSslOptionsInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationGatewayAvailableSslOptionsInner.
     */
    public static ApplicationGatewayAvailableSslOptionsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayAvailableSslOptionsInner deserializedApplicationGatewayAvailableSslOptionsInner
                = new ApplicationGatewayAvailableSslOptionsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedApplicationGatewayAvailableSslOptionsInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.innerProperties
                        = ApplicationGatewayAvailableSslOptionsPropertiesFormat.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayAvailableSslOptionsInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayAvailableSslOptionsInner;
        });
    }
}
