// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * PrivateLinkConnection properties for the network interface.
 */
@Immutable
public final class NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties
    implements JsonSerializable<NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties> {
    /*
     * The group ID for current private link connection.
     */
    private String groupId;

    /*
     * The required member name for current private link connection.
     */
    private String requiredMemberName;

    /*
     * List of FQDNs for current private link connection.
     */
    private List<String> fqdns;

    /**
     * Creates an instance of NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties class.
     */
    public NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties() {
    }

    /**
     * Get the groupId property: The group ID for current private link connection.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMemberName property: The required member name for current private link connection.
     * 
     * @return the requiredMemberName value.
     */
    public String requiredMemberName() {
        return this.requiredMemberName;
    }

    /**
     * Get the fqdns property: List of FQDNs for current private link connection.
     * 
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.fqdns;
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
     * Reads an instance of NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties.
     */
    public static NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties deserializedNetworkInterfaceIpConfigurationPrivateLinkConnectionProperties
                = new NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("groupId".equals(fieldName)) {
                    deserializedNetworkInterfaceIpConfigurationPrivateLinkConnectionProperties.groupId
                        = reader.getString();
                } else if ("requiredMemberName".equals(fieldName)) {
                    deserializedNetworkInterfaceIpConfigurationPrivateLinkConnectionProperties.requiredMemberName
                        = reader.getString();
                } else if ("fqdns".equals(fieldName)) {
                    List<String> fqdns = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkInterfaceIpConfigurationPrivateLinkConnectionProperties.fqdns = fqdns;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkInterfaceIpConfigurationPrivateLinkConnectionProperties;
        });
    }
}
