// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cloud service properties.
 */
@Fluent
public final class CloudServiceProperties implements JsonSerializable<CloudServiceProperties> {
    /*
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL
     * can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     */
    private String packageUrl;

    /*
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     */
    private String configuration;

    /*
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package
     * URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     */
    private String configurationUrl;

    /*
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is
     * `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is
     * PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs
     * charges, even if it is poweredoff.
     */
    private Boolean startCloudService;

    /*
     * (Optional) Indicates whether the role sku properties (roleProfile.roles.sku) specified in the model/template
     * should override the role instance count and vm size specified in the .cscfg and .csdef respectively.
     * The default value is `false`.
     */
    private Boolean allowModelOverride;

    /*
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed.
     * Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are <br /><br />**Auto**<br /><br />**Manual** <br /><br />**Simultaneous**<br /><br />
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the
     * update. If set to Auto, the update is automatically applied to each update domain in sequence.
     */
    private CloudServiceUpgradeMode upgradeMode;

    /*
     * Describes the role profile for the cloud service.
     */
    private CloudServiceRoleProfile roleProfile;

    /*
     * Describes the OS profile for the cloud service.
     */
    private CloudServiceOsProfile osProfile;

    /*
     * Network Profile for the cloud service.
     */
    private CloudServiceNetworkProfile networkProfile;

    /*
     * Describes a cloud service extension profile.
     */
    private CloudServiceExtensionProfile extensionProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    private String provisioningState;

    /*
     * The unique identifier for the cloud service.
     */
    private String uniqueId;

    /**
     * Creates an instance of CloudServiceProperties class.
     */
    public CloudServiceProperties() {
    }

    /**
     * Get the packageUrl property: Specifies a URL that refers to the location of the service package in the Blob
     * service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     * @return the packageUrl value.
     */
    public String packageUrl() {
        return this.packageUrl;
    }

    /**
     * Set the packageUrl property: Specifies a URL that refers to the location of the service package in the Blob
     * service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     * @param packageUrl the packageUrl value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    /**
     * Get the configuration property: Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     * @return the configuration value.
     */
    public String configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     * @param configuration the configuration value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the configurationUrl property: Specifies a URL that refers to the location of the service configuration in
     * the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     * @return the configurationUrl value.
     */
    public String configurationUrl() {
        return this.configurationUrl;
    }

    /**
     * Set the configurationUrl property: Specifies a URL that refers to the location of the service configuration in
     * the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     * @param configurationUrl the configurationUrl value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
        return this;
    }

    /**
     * Get the startCloudService property: (Optional) Indicates whether to start the cloud service immediately after it
     * is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is
     * PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs
     * charges, even if it is poweredoff.
     * 
     * @return the startCloudService value.
     */
    public Boolean startCloudService() {
        return this.startCloudService;
    }

    /**
     * Set the startCloudService property: (Optional) Indicates whether to start the cloud service immediately after it
     * is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is
     * PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs
     * charges, even if it is poweredoff.
     * 
     * @param startCloudService the startCloudService value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withStartCloudService(Boolean startCloudService) {
        this.startCloudService = startCloudService;
        return this;
    }

    /**
     * Get the allowModelOverride property: (Optional) Indicates whether the role sku properties (roleProfile.roles.sku)
     * specified in the model/template should override the role instance count and vm size specified in the .cscfg and
     * .csdef respectively.
     * The default value is `false`.
     * 
     * @return the allowModelOverride value.
     */
    public Boolean allowModelOverride() {
        return this.allowModelOverride;
    }

    /**
     * Set the allowModelOverride property: (Optional) Indicates whether the role sku properties (roleProfile.roles.sku)
     * specified in the model/template should override the role instance count and vm size specified in the .cscfg and
     * .csdef respectively.
     * The default value is `false`.
     * 
     * @param allowModelOverride the allowModelOverride value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withAllowModelOverride(Boolean allowModelOverride) {
        this.allowModelOverride = allowModelOverride;
        return this;
    }

    /**
     * Get the upgradeMode property: Update mode for the cloud service. Role instances are allocated to update domains
     * when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically
     * in all update domains.
     * Possible Values are &lt;br /&gt;&lt;br /&gt;**Auto**&lt;br /&gt;&lt;br /&gt;**Manual** &lt;br /&gt;&lt;br
     * /&gt;**Simultaneous**&lt;br /&gt;&lt;br /&gt;
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the
     * update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     * @return the upgradeMode value.
     */
    public CloudServiceUpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property: Update mode for the cloud service. Role instances are allocated to update domains
     * when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically
     * in all update domains.
     * Possible Values are &lt;br /&gt;&lt;br /&gt;**Auto**&lt;br /&gt;&lt;br /&gt;**Manual** &lt;br /&gt;&lt;br
     * /&gt;**Simultaneous**&lt;br /&gt;&lt;br /&gt;
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the
     * update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     * @param upgradeMode the upgradeMode value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withUpgradeMode(CloudServiceUpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the roleProfile property: Describes the role profile for the cloud service.
     * 
     * @return the roleProfile value.
     */
    public CloudServiceRoleProfile roleProfile() {
        return this.roleProfile;
    }

    /**
     * Set the roleProfile property: Describes the role profile for the cloud service.
     * 
     * @param roleProfile the roleProfile value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withRoleProfile(CloudServiceRoleProfile roleProfile) {
        this.roleProfile = roleProfile;
        return this;
    }

    /**
     * Get the osProfile property: Describes the OS profile for the cloud service.
     * 
     * @return the osProfile value.
     */
    public CloudServiceOsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Describes the OS profile for the cloud service.
     * 
     * @param osProfile the osProfile value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withOsProfile(CloudServiceOsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Network Profile for the cloud service.
     * 
     * @return the networkProfile value.
     */
    public CloudServiceNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Network Profile for the cloud service.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withNetworkProfile(CloudServiceNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the extensionProfile property: Describes a cloud service extension profile.
     * 
     * @return the extensionProfile value.
     */
    public CloudServiceExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile property: Describes a cloud service extension profile.
     * 
     * @param extensionProfile the extensionProfile value to set.
     * @return the CloudServiceProperties object itself.
     */
    public CloudServiceProperties withExtensionProfile(CloudServiceExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueId property: The unique identifier for the cloud service.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleProfile() != null) {
            roleProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (extensionProfile() != null) {
            extensionProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("packageUrl", this.packageUrl);
        jsonWriter.writeStringField("configuration", this.configuration);
        jsonWriter.writeStringField("configurationUrl", this.configurationUrl);
        jsonWriter.writeBooleanField("startCloudService", this.startCloudService);
        jsonWriter.writeBooleanField("allowModelOverride", this.allowModelOverride);
        jsonWriter.writeStringField("upgradeMode", this.upgradeMode == null ? null : this.upgradeMode.toString());
        jsonWriter.writeJsonField("roleProfile", this.roleProfile);
        jsonWriter.writeJsonField("osProfile", this.osProfile);
        jsonWriter.writeJsonField("networkProfile", this.networkProfile);
        jsonWriter.writeJsonField("extensionProfile", this.extensionProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudServiceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudServiceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudServiceProperties.
     */
    public static CloudServiceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudServiceProperties deserializedCloudServiceProperties = new CloudServiceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("packageUrl".equals(fieldName)) {
                    deserializedCloudServiceProperties.packageUrl = reader.getString();
                } else if ("configuration".equals(fieldName)) {
                    deserializedCloudServiceProperties.configuration = reader.getString();
                } else if ("configurationUrl".equals(fieldName)) {
                    deserializedCloudServiceProperties.configurationUrl = reader.getString();
                } else if ("startCloudService".equals(fieldName)) {
                    deserializedCloudServiceProperties.startCloudService = reader.getNullable(JsonReader::getBoolean);
                } else if ("allowModelOverride".equals(fieldName)) {
                    deserializedCloudServiceProperties.allowModelOverride = reader.getNullable(JsonReader::getBoolean);
                } else if ("upgradeMode".equals(fieldName)) {
                    deserializedCloudServiceProperties.upgradeMode
                        = CloudServiceUpgradeMode.fromString(reader.getString());
                } else if ("roleProfile".equals(fieldName)) {
                    deserializedCloudServiceProperties.roleProfile = CloudServiceRoleProfile.fromJson(reader);
                } else if ("osProfile".equals(fieldName)) {
                    deserializedCloudServiceProperties.osProfile = CloudServiceOsProfile.fromJson(reader);
                } else if ("networkProfile".equals(fieldName)) {
                    deserializedCloudServiceProperties.networkProfile = CloudServiceNetworkProfile.fromJson(reader);
                } else if ("extensionProfile".equals(fieldName)) {
                    deserializedCloudServiceProperties.extensionProfile = CloudServiceExtensionProfile.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCloudServiceProperties.provisioningState = reader.getString();
                } else if ("uniqueId".equals(fieldName)) {
                    deserializedCloudServiceProperties.uniqueId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudServiceProperties;
        });
    }
}
