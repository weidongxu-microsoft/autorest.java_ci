// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterProfileAccessRuleDirection;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterSubscription;
import java.io.IOException;
import java.util.List;

/**
 * Network security perimeter profile access rule properties.
 */
@Fluent
public final class NetworkSecurityPerimeterProfileAccessRuleProperties
    implements JsonSerializable<NetworkSecurityPerimeterProfileAccessRuleProperties> {
    /*
     * NSP access rule direction.
     */
    private NetworkSecurityPerimeterProfileAccessRuleDirection direction;

    /*
     * Address prefixes.
     */
    private List<String> addressPrefixes;

    /*
     * List of subscriptions.
     */
    private List<NetworkSecurityPerimeterSubscription> subscriptions;

    /*
     * Network security perimeters.
     */
    private List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters;

    /*
     * Fully qualified domain names.
     */
    private List<String> fullyQualifiedDomainNames;

    /*
     * List of email addresses.
     */
    private List<String> emailAddresses;

    /*
     * List of phone numbers.
     */
    private List<String> phoneNumbers;

    /**
     * Creates an instance of NetworkSecurityPerimeterProfileAccessRuleProperties class.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties() {
    }

    /**
     * Get the direction property: NSP access rule direction.
     * 
     * @return the direction value.
     */
    public NetworkSecurityPerimeterProfileAccessRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: NSP access rule direction.
     * 
     * @param direction the direction value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties
        withDirection(NetworkSecurityPerimeterProfileAccessRuleDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the addressPrefixes property: Address prefixes.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: Address prefixes.
     * 
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the subscriptions property: List of subscriptions.
     * 
     * @return the subscriptions value.
     */
    public List<NetworkSecurityPerimeterSubscription> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: List of subscriptions.
     * 
     * @param subscriptions the subscriptions value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties
        withSubscriptions(List<NetworkSecurityPerimeterSubscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get the networkSecurityPerimeters property: Network security perimeters.
     * 
     * @return the networkSecurityPerimeters value.
     */
    public List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters() {
        return this.networkSecurityPerimeters;
    }

    /**
     * Set the networkSecurityPerimeters property: Network security perimeters.
     * 
     * @param networkSecurityPerimeters the networkSecurityPerimeters value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties
        withNetworkSecurityPerimeters(List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters) {
        this.networkSecurityPerimeters = networkSecurityPerimeters;
        return this;
    }

    /**
     * Get the fullyQualifiedDomainNames property: Fully qualified domain names.
     * 
     * @return the fullyQualifiedDomainNames value.
     */
    public List<String> fullyQualifiedDomainNames() {
        return this.fullyQualifiedDomainNames;
    }

    /**
     * Set the fullyQualifiedDomainNames property: Fully qualified domain names.
     * 
     * @param fullyQualifiedDomainNames the fullyQualifiedDomainNames value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties
        withFullyQualifiedDomainNames(List<String> fullyQualifiedDomainNames) {
        this.fullyQualifiedDomainNames = fullyQualifiedDomainNames;
        return this;
    }

    /**
     * Get the emailAddresses property: List of email addresses.
     * 
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses property: List of email addresses.
     * 
     * @param emailAddresses the emailAddresses value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get the phoneNumbers property: List of phone numbers.
     * 
     * @return the phoneNumbers value.
     */
    public List<String> phoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: List of phone numbers.
     * 
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRuleProperties object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRuleProperties withPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptions() != null) {
            subscriptions().forEach(e -> e.validate());
        }
        if (networkSecurityPerimeters() != null) {
            networkSecurityPerimeters().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("direction", this.direction == null ? null : this.direction.toString());
        jsonWriter.writeArrayField("addressPrefixes", this.addressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("subscriptions", this.subscriptions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("networkSecurityPerimeters", this.networkSecurityPerimeters,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("fullyQualifiedDomainNames", this.fullyQualifiedDomainNames,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("emailAddresses", this.emailAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("phoneNumbers", this.phoneNumbers, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityPerimeterProfileAccessRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeterProfileAccessRuleProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeterProfileAccessRuleProperties.
     */
    public static NetworkSecurityPerimeterProfileAccessRuleProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeterProfileAccessRuleProperties deserializedNetworkSecurityPerimeterProfileAccessRuleProperties
                = new NetworkSecurityPerimeterProfileAccessRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("direction".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.direction
                        = NetworkSecurityPerimeterProfileAccessRuleDirection.fromString(reader.getString());
                } else if ("addressPrefixes".equals(fieldName)) {
                    List<String> addressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.addressPrefixes = addressPrefixes;
                } else if ("subscriptions".equals(fieldName)) {
                    List<NetworkSecurityPerimeterSubscription> subscriptions
                        = reader.readArray(reader1 -> NetworkSecurityPerimeterSubscription.fromJson(reader1));
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.subscriptions = subscriptions;
                } else if ("networkSecurityPerimeters".equals(fieldName)) {
                    List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters
                        = reader.readArray(reader1 -> NetworkSecurityPerimeterInfo.fromJson(reader1));
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.networkSecurityPerimeters
                        = networkSecurityPerimeters;
                } else if ("fullyQualifiedDomainNames".equals(fieldName)) {
                    List<String> fullyQualifiedDomainNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.fullyQualifiedDomainNames
                        = fullyQualifiedDomainNames;
                } else if ("emailAddresses".equals(fieldName)) {
                    List<String> emailAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.emailAddresses = emailAddresses;
                } else if ("phoneNumbers".equals(fieldName)) {
                    List<String> phoneNumbers = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterProfileAccessRuleProperties.phoneNumbers = phoneNumbers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeterProfileAccessRuleProperties;
        });
    }
}
