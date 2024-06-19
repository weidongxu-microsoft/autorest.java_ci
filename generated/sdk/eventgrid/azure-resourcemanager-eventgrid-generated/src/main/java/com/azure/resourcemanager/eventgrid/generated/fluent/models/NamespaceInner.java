// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceSku;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.generated.models.TopicsConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSpacesConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Namespace resource.
 */
@Fluent
public final class NamespaceInner extends Resource {
    /*
     * Properties of the Namespace resource.
     */
    private NamespaceProperties innerProperties;

    /*
     * Represents available Sku pricing tiers.
     */
    private NamespaceSku sku;

    /*
     * Identity information for the Namespace resource.
     */
    private IdentityInfo identity;

    /*
     * The system metadata relating to the namespace resource.
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
     * Creates an instance of NamespaceInner class.
     */
    public NamespaceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Namespace resource.
     * 
     * @return the innerProperties value.
     */
    private NamespaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Represents available Sku pricing tiers.
     * 
     * @return the sku value.
     */
    public NamespaceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Represents available Sku pricing tiers.
     * 
     * @param sku the sku value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withSku(NamespaceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Identity information for the Namespace resource.
     * 
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the Namespace resource.
     * 
     * @param identity the identity value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to the namespace resource.
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
     * {@inheritDoc}
     */
    @Override
    public NamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NamespaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace resource.
     * 
     * @return the provisioningState value.
     */
    public NamespaceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the topicsConfiguration property: Topics configuration information for the namespace resource.
     * 
     * @return the topicsConfiguration value.
     */
    public TopicsConfiguration topicsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().topicsConfiguration();
    }

    /**
     * Set the topicsConfiguration property: Topics configuration information for the namespace resource.
     * 
     * @param topicsConfiguration the topicsConfiguration value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withTopicsConfiguration(TopicsConfiguration topicsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withTopicsConfiguration(topicsConfiguration);
        return this;
    }

    /**
     * Get the topicSpacesConfiguration property: Topic spaces configuration information for the namespace resource.
     * 
     * @return the topicSpacesConfiguration value.
     */
    public TopicSpacesConfiguration topicSpacesConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().topicSpacesConfiguration();
    }

    /**
     * Set the topicSpacesConfiguration property: Topic spaces configuration information for the namespace resource.
     * 
     * @param topicSpacesConfiguration the topicSpacesConfiguration value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withTopicSpacesConfiguration(TopicSpacesConfiguration topicSpacesConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withTopicSpacesConfiguration(topicSpacesConfiguration);
        return this;
    }

    /**
     * Get the isZoneRedundant property: This is an optional property and it allows the user to specify if the namespace
     * resource supports zone-redundancy capability or not. If this
     * property is not specified explicitly by the user, its default value depends on the following conditions:
     * a. For Availability Zones enabled regions - The default property value would be true.
     * b. For non-Availability Zones enabled regions - The default property value would be false.
     * Once specified, this property cannot be updated.
     * 
     * @return the isZoneRedundant value.
     */
    public Boolean isZoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().isZoneRedundant();
    }

    /**
     * Set the isZoneRedundant property: This is an optional property and it allows the user to specify if the namespace
     * resource supports zone-redundancy capability or not. If this
     * property is not specified explicitly by the user, its default value depends on the following conditions:
     * a. For Availability Zones enabled regions - The default property value would be true.
     * b. For non-Availability Zones enabled regions - The default property value would be false.
     * Once specified, this property cannot be updated.
     * 
     * @param isZoneRedundant the isZoneRedundant value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withIsZoneRedundant(Boolean isZoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withIsZoneRedundant(isZoneRedundant);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     * 
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpRules();
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     * 
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * namespace. Only TLS version 1.2 is supported.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersionAllowed();
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * namespace. Only TLS version 1.2 is supported.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the NamespaceInner object itself.
     */
    public NamespaceInner withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceProperties();
        }
        this.innerProperties().withMinimumTlsVersionAllowed(minimumTlsVersionAllowed);
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
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
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
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamespaceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamespaceInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NamespaceInner.
     */
    public static NamespaceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NamespaceInner deserializedNamespaceInner = new NamespaceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNamespaceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNamespaceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNamespaceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNamespaceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNamespaceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedNamespaceInner.innerProperties = NamespaceProperties.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedNamespaceInner.sku = NamespaceSku.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedNamespaceInner.identity = IdentityInfo.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedNamespaceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNamespaceInner;
        });
    }
}
