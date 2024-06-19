// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmGeoReplicatedRegionInner;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Properties of the managed HSM Pool.
 */
@Fluent
public final class ManagedHsmProperties implements JsonSerializable<ManagedHsmProperties> {
    /*
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the managed HSM pool.
     */
    private UUID tenantId;

    /*
     * Array of initial administrators object ids for this managed hsm pool.
     */
    private List<String> initialAdminObjectIds;

    /*
     * The URI of the managed hsm pool for performing operations on keys.
     */
    private String hsmUri;

    /*
     * Property to specify whether the 'soft delete' functionality is enabled for this managed HSM pool. Soft delete is
     * enabled by default for all managed HSMs and is immutable.
     */
    private Boolean enableSoftDelete;

    /*
     * Soft deleted data retention days. When you delete an HSM or a key, it will remain recoverable for the configured
     * retention period or for a default period of 90 days. It accepts values between 7 and 90.
     */
    private Integer softDeleteRetentionInDays;

    /*
     * Property specifying whether protection against purge is enabled for this managed HSM pool. Setting this property
     * to true activates protection against purge for this managed HSM pool and its content - only the Managed HSM
     * service may initiate a hard, irrecoverable deletion. Enabling this functionality is irreversible.
     */
    private Boolean enablePurgeProtection;

    /*
     * The create mode to indicate whether the resource is being created or is being recovered from a deleted resource.
     */
    private CreateMode createMode;

    /*
     * Resource Status Message.
     */
    private String statusMessage;

    /*
     * Provisioning state.
     */
    private ProvisioningState provisioningState;

    /*
     * Rules governing the accessibility of the key vault from specific network locations.
     */
    private MhsmNetworkRuleSet networkAcls;

    /*
     * List of all regions associated with the managed hsm pool.
     */
    private List<MhsmGeoReplicatedRegionInner> regions;

    /*
     * List of private endpoint connections associated with the managed hsm pool.
     */
    private List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections;

    /*
     * Control permission to the managed HSM from public networks.
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The scheduled purge date in UTC.
     */
    private OffsetDateTime scheduledPurgeDate;

    /*
     * Managed HSM security domain properties.
     */
    private ManagedHsmSecurityDomainProperties securityDomainProperties;

    /**
     * Creates an instance of ManagedHsmProperties class.
     */
    public ManagedHsmProperties() {
    }

    /**
     * Get the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the managed HSM pool.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the managed HSM pool.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the initialAdminObjectIds property: Array of initial administrators object ids for this managed hsm pool.
     * 
     * @return the initialAdminObjectIds value.
     */
    public List<String> initialAdminObjectIds() {
        return this.initialAdminObjectIds;
    }

    /**
     * Set the initialAdminObjectIds property: Array of initial administrators object ids for this managed hsm pool.
     * 
     * @param initialAdminObjectIds the initialAdminObjectIds value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withInitialAdminObjectIds(List<String> initialAdminObjectIds) {
        this.initialAdminObjectIds = initialAdminObjectIds;
        return this;
    }

    /**
     * Get the hsmUri property: The URI of the managed hsm pool for performing operations on keys.
     * 
     * @return the hsmUri value.
     */
    public String hsmUri() {
        return this.hsmUri;
    }

    /**
     * Get the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this managed HSM pool. Soft delete is enabled by default for all managed HSMs and is immutable.
     * 
     * @return the enableSoftDelete value.
     */
    public Boolean enableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this managed HSM pool. Soft delete is enabled by default for all managed HSMs and is immutable.
     * 
     * @param enableSoftDelete the enableSoftDelete value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

    /**
     * Get the softDeleteRetentionInDays property: Soft deleted data retention days. When you delete an HSM or a key, it
     * will remain recoverable for the configured retention period or for a default period of 90 days. It accepts values
     * between 7 and 90.
     * 
     * @return the softDeleteRetentionInDays value.
     */
    public Integer softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    /**
     * Set the softDeleteRetentionInDays property: Soft deleted data retention days. When you delete an HSM or a key, it
     * will remain recoverable for the configured retention period or for a default period of 90 days. It accepts values
     * between 7 and 90.
     * 
     * @param softDeleteRetentionInDays the softDeleteRetentionInDays value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and
     * its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. Enabling this
     * functionality is irreversible.
     * 
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and
     * its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. Enabling this
     * functionality is irreversible.
     * 
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the createMode property: The create mode to indicate whether the resource is being created or is being
     * recovered from a deleted resource.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The create mode to indicate whether the resource is being created or is being
     * recovered from a deleted resource.
     * 
     * @param createMode the createMode value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the statusMessage property: Resource Status Message.
     * 
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     * 
     * @return the networkAcls value.
     */
    public MhsmNetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withNetworkAcls(MhsmNetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the regions property: List of all regions associated with the managed hsm pool.
     * 
     * @return the regions value.
     */
    public List<MhsmGeoReplicatedRegionInner> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: List of all regions associated with the managed hsm pool.
     * 
     * @param regions the regions value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withRegions(List<MhsmGeoReplicatedRegionInner> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the managed hsm
     * pool.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the publicNetworkAccess property: Control permission to the managed HSM from public networks.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Control permission to the managed HSM from public networks.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the scheduledPurgeDate property: The scheduled purge date in UTC.
     * 
     * @return the scheduledPurgeDate value.
     */
    public OffsetDateTime scheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    /**
     * Get the securityDomainProperties property: Managed HSM security domain properties.
     * 
     * @return the securityDomainProperties value.
     */
    public ManagedHsmSecurityDomainProperties securityDomainProperties() {
        return this.securityDomainProperties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkAcls() != null) {
            networkAcls().validate();
        }
        if (regions() != null) {
            regions().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (securityDomainProperties() != null) {
            securityDomainProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tenantId", Objects.toString(this.tenantId, null));
        jsonWriter.writeArrayField("initialAdminObjectIds", this.initialAdminObjectIds,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("enableSoftDelete", this.enableSoftDelete);
        jsonWriter.writeNumberField("softDeleteRetentionInDays", this.softDeleteRetentionInDays);
        jsonWriter.writeBooleanField("enablePurgeProtection", this.enablePurgeProtection);
        jsonWriter.writeStringField("createMode", this.createMode == null ? null : this.createMode.toString());
        jsonWriter.writeJsonField("networkAcls", this.networkAcls);
        jsonWriter.writeArrayField("regions", this.regions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedHsmProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedHsmProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedHsmProperties.
     */
    public static ManagedHsmProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedHsmProperties deserializedManagedHsmProperties = new ManagedHsmProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tenantId".equals(fieldName)) {
                    deserializedManagedHsmProperties.tenantId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("initialAdminObjectIds".equals(fieldName)) {
                    List<String> initialAdminObjectIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedManagedHsmProperties.initialAdminObjectIds = initialAdminObjectIds;
                } else if ("hsmUri".equals(fieldName)) {
                    deserializedManagedHsmProperties.hsmUri = reader.getString();
                } else if ("enableSoftDelete".equals(fieldName)) {
                    deserializedManagedHsmProperties.enableSoftDelete = reader.getNullable(JsonReader::getBoolean);
                } else if ("softDeleteRetentionInDays".equals(fieldName)) {
                    deserializedManagedHsmProperties.softDeleteRetentionInDays = reader.getNullable(JsonReader::getInt);
                } else if ("enablePurgeProtection".equals(fieldName)) {
                    deserializedManagedHsmProperties.enablePurgeProtection = reader.getNullable(JsonReader::getBoolean);
                } else if ("createMode".equals(fieldName)) {
                    deserializedManagedHsmProperties.createMode = CreateMode.fromString(reader.getString());
                } else if ("statusMessage".equals(fieldName)) {
                    deserializedManagedHsmProperties.statusMessage = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedManagedHsmProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("networkAcls".equals(fieldName)) {
                    deserializedManagedHsmProperties.networkAcls = MhsmNetworkRuleSet.fromJson(reader);
                } else if ("regions".equals(fieldName)) {
                    List<MhsmGeoReplicatedRegionInner> regions
                        = reader.readArray(reader1 -> MhsmGeoReplicatedRegionInner.fromJson(reader1));
                    deserializedManagedHsmProperties.regions = regions;
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections
                        = reader.readArray(reader1 -> MhsmPrivateEndpointConnectionItem.fromJson(reader1));
                    deserializedManagedHsmProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedManagedHsmProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("scheduledPurgeDate".equals(fieldName)) {
                    deserializedManagedHsmProperties.scheduledPurgeDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("securityDomainProperties".equals(fieldName)) {
                    deserializedManagedHsmProperties.securityDomainProperties
                        = ManagedHsmSecurityDomainProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedHsmProperties;
        });
    }
}
