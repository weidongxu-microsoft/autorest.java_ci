// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iothub.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.generated.fluent.models.SharedAccessSignatureAuthorizationRuleInner;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The properties of an IoT hub.
 */
@Fluent
public final class IotHubProperties implements JsonSerializable<IotHubProperties> {
    /*
     * The shared access policies you can use to secure a connection to the IoT hub.
     */
    private List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies;

    /*
     * If true, SAS tokens with Iot hub scoped SAS keys cannot be used for authentication.
     */
    private Boolean disableLocalAuth;

    /*
     * If true, all device(including Edge devices but excluding modules) scoped SAS keys cannot be used for
     * authentication.
     */
    private Boolean disableDeviceSas;

    /*
     * If true, all module scoped SAS keys cannot be used for authentication.
     */
    private Boolean disableModuleSas;

    /*
     * If true, egress from IotHub will be restricted to only the allowed FQDNs that are configured via allowedFqdnList.
     */
    private Boolean restrictOutboundNetworkAccess;

    /*
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot Hub.
     */
    private List<String> allowedFqdnList;

    /*
     * Whether requests from Public Network are allowed
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The IP filter rules.
     */
    private List<IpFilterRule> ipFilterRules;

    /*
     * Network Rule Set Properties of IotHub
     */
    private NetworkRuleSetProperties networkRuleSets;

    /*
     * Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to have clients that use a TLS
     * version below 1.2 to be rejected.
     */
    private String minTlsVersion;

    /*
     * Private endpoint connections created on this IotHub
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The provisioning state.
     */
    private String provisioningState;

    /*
     * The hub state.
     */
    private String state;

    /*
     * The name of the host.
     */
    private String hostname;

    /*
     * The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has
     * to be present in the dictionary while making create or update calls for the IoT hub.
     */
    private Map<String, EventHubProperties> eventHubEndpoints;

    /*
     * The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     */
    private RoutingProperties routing;

    /*
     * The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure
     * Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error
     * to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to
     * True, causes an error to be thrown.
     */
    private Map<String, StorageEndpointProperties> storageEndpoints;

    /*
     * The messaging endpoint properties for the file upload notification queue.
     */
    private Map<String, MessagingEndpointProperties> messagingEndpoints;

    /*
     * If True, file upload notifications are enabled.
     */
    private Boolean enableFileUploadNotifications;

    /*
     * The IoT hub cloud-to-device messaging properties.
     */
    private CloudToDeviceProperties cloudToDevice;

    /*
     * IoT hub comments.
     */
    private String comments;

    /*
     * The capabilities and features enabled for the IoT hub.
     */
    private Capabilities features;

    /*
     * Primary and secondary location for iot hub
     */
    private List<IotHubLocationDescription> locations;

    /*
     * This property when set to true, will enable data residency, thus, disabling disaster recovery.
     */
    private Boolean enableDataResidency;

    /**
     * Creates an instance of IotHubProperties class.
     */
    public IotHubProperties() {
    }

    /**
     * Get the authorizationPolicies property: The shared access policies you can use to secure a connection to the IoT
     * hub.
     * 
     * @return the authorizationPolicies value.
     */
    public List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies() {
        return this.authorizationPolicies;
    }

    /**
     * Set the authorizationPolicies property: The shared access policies you can use to secure a connection to the IoT
     * hub.
     * 
     * @param authorizationPolicies the authorizationPolicies value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties
        withAuthorizationPolicies(List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies) {
        this.authorizationPolicies = authorizationPolicies;
        return this;
    }

    /**
     * Get the disableLocalAuth property: If true, SAS tokens with Iot hub scoped SAS keys cannot be used for
     * authentication.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: If true, SAS tokens with Iot hub scoped SAS keys cannot be used for
     * authentication.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the disableDeviceSas property: If true, all device(including Edge devices but excluding modules) scoped SAS
     * keys cannot be used for authentication.
     * 
     * @return the disableDeviceSas value.
     */
    public Boolean disableDeviceSas() {
        return this.disableDeviceSas;
    }

    /**
     * Set the disableDeviceSas property: If true, all device(including Edge devices but excluding modules) scoped SAS
     * keys cannot be used for authentication.
     * 
     * @param disableDeviceSas the disableDeviceSas value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableDeviceSas(Boolean disableDeviceSas) {
        this.disableDeviceSas = disableDeviceSas;
        return this;
    }

    /**
     * Get the disableModuleSas property: If true, all module scoped SAS keys cannot be used for authentication.
     * 
     * @return the disableModuleSas value.
     */
    public Boolean disableModuleSas() {
        return this.disableModuleSas;
    }

    /**
     * Set the disableModuleSas property: If true, all module scoped SAS keys cannot be used for authentication.
     * 
     * @param disableModuleSas the disableModuleSas value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDisableModuleSas(Boolean disableModuleSas) {
        this.disableModuleSas = disableModuleSas;
        return this;
    }

    /**
     * Get the restrictOutboundNetworkAccess property: If true, egress from IotHub will be restricted to only the
     * allowed FQDNs that are configured via allowedFqdnList.
     * 
     * @return the restrictOutboundNetworkAccess value.
     */
    public Boolean restrictOutboundNetworkAccess() {
        return this.restrictOutboundNetworkAccess;
    }

    /**
     * Set the restrictOutboundNetworkAccess property: If true, egress from IotHub will be restricted to only the
     * allowed FQDNs that are configured via allowedFqdnList.
     * 
     * @param restrictOutboundNetworkAccess the restrictOutboundNetworkAccess value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withRestrictOutboundNetworkAccess(Boolean restrictOutboundNetworkAccess) {
        this.restrictOutboundNetworkAccess = restrictOutboundNetworkAccess;
        return this;
    }

    /**
     * Get the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot Hub.
     * 
     * @return the allowedFqdnList value.
     */
    public List<String> allowedFqdnList() {
        return this.allowedFqdnList;
    }

    /**
     * Set the allowedFqdnList property: List of allowed FQDNs(Fully Qualified Domain Name) for egress from Iot Hub.
     * 
     * @param allowedFqdnList the allowedFqdnList value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withAllowedFqdnList(List<String> allowedFqdnList) {
        this.allowedFqdnList = allowedFqdnList;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the ipFilterRules property: The IP filter rules.
     * 
     * @return the ipFilterRules value.
     */
    public List<IpFilterRule> ipFilterRules() {
        return this.ipFilterRules;
    }

    /**
     * Set the ipFilterRules property: The IP filter rules.
     * 
     * @param ipFilterRules the ipFilterRules value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withIpFilterRules(List<IpFilterRule> ipFilterRules) {
        this.ipFilterRules = ipFilterRules;
        return this;
    }

    /**
     * Get the networkRuleSets property: Network Rule Set Properties of IotHub.
     * 
     * @return the networkRuleSets value.
     */
    public NetworkRuleSetProperties networkRuleSets() {
        return this.networkRuleSets;
    }

    /**
     * Set the networkRuleSets property: Network Rule Set Properties of IotHub.
     * 
     * @param networkRuleSets the networkRuleSets value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withNetworkRuleSets(NetworkRuleSetProperties networkRuleSets) {
        this.networkRuleSets = networkRuleSets;
        return this;
    }

    /**
     * Get the minTlsVersion property: Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to
     * have clients that use a TLS version below 1.2 to be rejected.
     * 
     * @return the minTlsVersion value.
     */
    public String minTlsVersion() {
        return this.minTlsVersion;
    }

    /**
     * Set the minTlsVersion property: Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to
     * have clients that use a TLS version below 1.2 to be rejected.
     * 
     * @param minTlsVersion the minTlsVersion value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withMinTlsVersion(String minTlsVersion) {
        this.minTlsVersion = minTlsVersion;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections created on this IotHub.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: Private endpoint connections created on this IotHub.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state property: The hub state.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the hostname property: The name of the host.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the eventHubEndpoints property: The Event Hub-compatible endpoint properties. The only possible keys to this
     * dictionary is events. This key has to be present in the dictionary while making create or update calls for the
     * IoT hub.
     * 
     * @return the eventHubEndpoints value.
     */
    public Map<String, EventHubProperties> eventHubEndpoints() {
        return this.eventHubEndpoints;
    }

    /**
     * Set the eventHubEndpoints property: The Event Hub-compatible endpoint properties. The only possible keys to this
     * dictionary is events. This key has to be present in the dictionary while making create or update calls for the
     * IoT hub.
     * 
     * @param eventHubEndpoints the eventHubEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEventHubEndpoints(Map<String, EventHubProperties> eventHubEndpoints) {
        this.eventHubEndpoints = eventHubEndpoints;
        return this;
    }

    /**
     * Get the routing property: The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging.
     * 
     * @return the routing value.
     */
    public RoutingProperties routing() {
        return this.routing;
    }

    /**
     * Set the routing property: The routing related properties of the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging.
     * 
     * @param routing the routing value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withRouting(RoutingProperties routing) {
        this.routing = routing;
        return this;
    }

    /**
     * Get the storageEndpoints property: The list of Azure Storage endpoints where you can upload files. Currently you
     * can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one
     * storage account causes an error to be thrown. Not specifying a value for this property when the
     * enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     * @return the storageEndpoints value.
     */
    public Map<String, StorageEndpointProperties> storageEndpoints() {
        return this.storageEndpoints;
    }

    /**
     * Set the storageEndpoints property: The list of Azure Storage endpoints where you can upload files. Currently you
     * can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one
     * storage account causes an error to be thrown. Not specifying a value for this property when the
     * enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     * @param storageEndpoints the storageEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withStorageEndpoints(Map<String, StorageEndpointProperties> storageEndpoints) {
        this.storageEndpoints = storageEndpoints;
        return this;
    }

    /**
     * Get the messagingEndpoints property: The messaging endpoint properties for the file upload notification queue.
     * 
     * @return the messagingEndpoints value.
     */
    public Map<String, MessagingEndpointProperties> messagingEndpoints() {
        return this.messagingEndpoints;
    }

    /**
     * Set the messagingEndpoints property: The messaging endpoint properties for the file upload notification queue.
     * 
     * @param messagingEndpoints the messagingEndpoints value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withMessagingEndpoints(Map<String, MessagingEndpointProperties> messagingEndpoints) {
        this.messagingEndpoints = messagingEndpoints;
        return this;
    }

    /**
     * Get the enableFileUploadNotifications property: If True, file upload notifications are enabled.
     * 
     * @return the enableFileUploadNotifications value.
     */
    public Boolean enableFileUploadNotifications() {
        return this.enableFileUploadNotifications;
    }

    /**
     * Set the enableFileUploadNotifications property: If True, file upload notifications are enabled.
     * 
     * @param enableFileUploadNotifications the enableFileUploadNotifications value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEnableFileUploadNotifications(Boolean enableFileUploadNotifications) {
        this.enableFileUploadNotifications = enableFileUploadNotifications;
        return this;
    }

    /**
     * Get the cloudToDevice property: The IoT hub cloud-to-device messaging properties.
     * 
     * @return the cloudToDevice value.
     */
    public CloudToDeviceProperties cloudToDevice() {
        return this.cloudToDevice;
    }

    /**
     * Set the cloudToDevice property: The IoT hub cloud-to-device messaging properties.
     * 
     * @param cloudToDevice the cloudToDevice value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withCloudToDevice(CloudToDeviceProperties cloudToDevice) {
        this.cloudToDevice = cloudToDevice;
        return this;
    }

    /**
     * Get the comments property: IoT hub comments.
     * 
     * @return the comments value.
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the comments property: IoT hub comments.
     * 
     * @param comments the comments value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the features property: The capabilities and features enabled for the IoT hub.
     * 
     * @return the features value.
     */
    public Capabilities features() {
        return this.features;
    }

    /**
     * Set the features property: The capabilities and features enabled for the IoT hub.
     * 
     * @param features the features value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withFeatures(Capabilities features) {
        this.features = features;
        return this;
    }

    /**
     * Get the locations property: Primary and secondary location for iot hub.
     * 
     * @return the locations value.
     */
    public List<IotHubLocationDescription> locations() {
        return this.locations;
    }

    /**
     * Get the enableDataResidency property: This property when set to true, will enable data residency, thus, disabling
     * disaster recovery.
     * 
     * @return the enableDataResidency value.
     */
    public Boolean enableDataResidency() {
        return this.enableDataResidency;
    }

    /**
     * Set the enableDataResidency property: This property when set to true, will enable data residency, thus, disabling
     * disaster recovery.
     * 
     * @param enableDataResidency the enableDataResidency value to set.
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEnableDataResidency(Boolean enableDataResidency) {
        this.enableDataResidency = enableDataResidency;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizationPolicies() != null) {
            authorizationPolicies().forEach(e -> e.validate());
        }
        if (ipFilterRules() != null) {
            ipFilterRules().forEach(e -> e.validate());
        }
        if (networkRuleSets() != null) {
            networkRuleSets().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (eventHubEndpoints() != null) {
            eventHubEndpoints().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (routing() != null) {
            routing().validate();
        }
        if (storageEndpoints() != null) {
            storageEndpoints().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (messagingEndpoints() != null) {
            messagingEndpoints().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (cloudToDevice() != null) {
            cloudToDevice().validate();
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("authorizationPolicies", this.authorizationPolicies,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("disableLocalAuth", this.disableLocalAuth);
        jsonWriter.writeBooleanField("disableDeviceSAS", this.disableDeviceSas);
        jsonWriter.writeBooleanField("disableModuleSAS", this.disableModuleSas);
        jsonWriter.writeBooleanField("restrictOutboundNetworkAccess", this.restrictOutboundNetworkAccess);
        jsonWriter.writeArrayField("allowedFqdnList", this.allowedFqdnList,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeArrayField("ipFilterRules", this.ipFilterRules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("networkRuleSets", this.networkRuleSets);
        jsonWriter.writeStringField("minTlsVersion", this.minTlsVersion);
        jsonWriter.writeArrayField("privateEndpointConnections", this.privateEndpointConnections,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("eventHubEndpoints", this.eventHubEndpoints,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("routing", this.routing);
        jsonWriter.writeMapField("storageEndpoints", this.storageEndpoints,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("messagingEndpoints", this.messagingEndpoints,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("enableFileUploadNotifications", this.enableFileUploadNotifications);
        jsonWriter.writeJsonField("cloudToDevice", this.cloudToDevice);
        jsonWriter.writeStringField("comments", this.comments);
        jsonWriter.writeStringField("features", this.features == null ? null : this.features.toString());
        jsonWriter.writeBooleanField("enableDataResidency", this.enableDataResidency);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotHubProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IotHubProperties.
     */
    public static IotHubProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotHubProperties deserializedIotHubProperties = new IotHubProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authorizationPolicies".equals(fieldName)) {
                    List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies
                        = reader.readArray(reader1 -> SharedAccessSignatureAuthorizationRuleInner.fromJson(reader1));
                    deserializedIotHubProperties.authorizationPolicies = authorizationPolicies;
                } else if ("disableLocalAuth".equals(fieldName)) {
                    deserializedIotHubProperties.disableLocalAuth = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableDeviceSAS".equals(fieldName)) {
                    deserializedIotHubProperties.disableDeviceSas = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableModuleSAS".equals(fieldName)) {
                    deserializedIotHubProperties.disableModuleSas = reader.getNullable(JsonReader::getBoolean);
                } else if ("restrictOutboundNetworkAccess".equals(fieldName)) {
                    deserializedIotHubProperties.restrictOutboundNetworkAccess
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowedFqdnList".equals(fieldName)) {
                    List<String> allowedFqdnList = reader.readArray(reader1 -> reader1.getString());
                    deserializedIotHubProperties.allowedFqdnList = allowedFqdnList;
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedIotHubProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("ipFilterRules".equals(fieldName)) {
                    List<IpFilterRule> ipFilterRules = reader.readArray(reader1 -> IpFilterRule.fromJson(reader1));
                    deserializedIotHubProperties.ipFilterRules = ipFilterRules;
                } else if ("networkRuleSets".equals(fieldName)) {
                    deserializedIotHubProperties.networkRuleSets = NetworkRuleSetProperties.fromJson(reader);
                } else if ("minTlsVersion".equals(fieldName)) {
                    deserializedIotHubProperties.minTlsVersion = reader.getString();
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedIotHubProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedIotHubProperties.provisioningState = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedIotHubProperties.state = reader.getString();
                } else if ("hostName".equals(fieldName)) {
                    deserializedIotHubProperties.hostname = reader.getString();
                } else if ("eventHubEndpoints".equals(fieldName)) {
                    Map<String, EventHubProperties> eventHubEndpoints
                        = reader.readMap(reader1 -> EventHubProperties.fromJson(reader1));
                    deserializedIotHubProperties.eventHubEndpoints = eventHubEndpoints;
                } else if ("routing".equals(fieldName)) {
                    deserializedIotHubProperties.routing = RoutingProperties.fromJson(reader);
                } else if ("storageEndpoints".equals(fieldName)) {
                    Map<String, StorageEndpointProperties> storageEndpoints
                        = reader.readMap(reader1 -> StorageEndpointProperties.fromJson(reader1));
                    deserializedIotHubProperties.storageEndpoints = storageEndpoints;
                } else if ("messagingEndpoints".equals(fieldName)) {
                    Map<String, MessagingEndpointProperties> messagingEndpoints
                        = reader.readMap(reader1 -> MessagingEndpointProperties.fromJson(reader1));
                    deserializedIotHubProperties.messagingEndpoints = messagingEndpoints;
                } else if ("enableFileUploadNotifications".equals(fieldName)) {
                    deserializedIotHubProperties.enableFileUploadNotifications
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("cloudToDevice".equals(fieldName)) {
                    deserializedIotHubProperties.cloudToDevice = CloudToDeviceProperties.fromJson(reader);
                } else if ("comments".equals(fieldName)) {
                    deserializedIotHubProperties.comments = reader.getString();
                } else if ("features".equals(fieldName)) {
                    deserializedIotHubProperties.features = Capabilities.fromString(reader.getString());
                } else if ("locations".equals(fieldName)) {
                    List<IotHubLocationDescription> locations
                        = reader.readArray(reader1 -> IotHubLocationDescription.fromJson(reader1));
                    deserializedIotHubProperties.locations = locations;
                } else if ("enableDataResidency".equals(fieldName)) {
                    deserializedIotHubProperties.enableDataResidency = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotHubProperties;
        });
    }
}
