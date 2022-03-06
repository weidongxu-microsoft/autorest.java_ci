// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskState;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Snapshot resource properties. */
@Fluent
public final class SnapshotProperties {
    /*
     * The time when the snapshot was created.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Purchase plan information for the image from which the source disk for
     * the snapshot was originally created.
     */
    @JsonProperty(value = "purchasePlan")
    private PurchasePlanAutoGenerated purchasePlan;

    /*
     * List of supported capabilities for the image from which the source disk
     * from the snapshot was originally created.
     */
    @JsonProperty(value = "supportedCapabilities")
    private SupportedCapabilities supportedCapabilities;

    /*
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "creationData", required = true)
    private CreationData creationData;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /*
     * The state of the snapshot.
     */
    @JsonProperty(value = "diskState", access = JsonProperty.Access.WRITE_ONLY)
    private DiskState diskState;

    /*
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The disk provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Whether a snapshot is incremental. Incremental snapshots on the same
     * disk occupy less space than full snapshots and can be diffed.
     */
    @JsonProperty(value = "incremental")
    private Boolean incremental;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "diskAccessId")
    private String diskAccessId;

    /*
     * Contains the security related information for the resource.
     */
    @JsonProperty(value = "securityProfile")
    private DiskSecurityProfile securityProfile;

    /*
     * Indicates the OS on a snapshot supports hibernation.
     */
    @JsonProperty(value = "supportsHibernation")
    private Boolean supportsHibernation;

    /*
     * Policy for controlling export on the disk.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Percentage complete for the background copy when a resource is created
     * via the CopyStart operation.
     */
    @JsonProperty(value = "completionPercent")
    private Float completionPercent;

    /*
     * Additional authentication requirements when exporting or uploading to a
     * disk or snapshot.
     */
    @JsonProperty(value = "dataAccessAuthMode")
    private DataAccessAuthMode dataAccessAuthMode;

    /**
     * Get the timeCreated property: The time when the snapshot was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the image from which the source disk for the
     * snapshot was originally created.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the image from which the source disk for the
     * snapshot was originally created.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the source disk
     * from the snapshot was originally created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.supportedCapabilities;
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the source disk
     * from the snapshot was originally created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        this.supportedCapabilities = supportedCapabilities;
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @param creationData the creationData value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the diskState property: The state of the snapshot.
     *
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.diskState;
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withEncryptionSettingsCollection(
        EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @return the incremental value.
     */
    public Boolean incremental() {
        return this.incremental;
    }

    /**
     * Set the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @param incremental the incremental value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the securityProfile property: Contains the security related information for the resource.
     *
     * @return the securityProfile value.
     */
    public DiskSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Contains the security related information for the resource.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withSecurityProfile(DiskSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.supportsHibernation;
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withSupportsHibernation(Boolean supportsHibernation) {
        this.supportsHibernation = supportsHibernation;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.completionPercent;
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @param completionPercent the completionPercent value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCompletionPercent(Float completionPercent) {
        this.completionPercent = completionPercent;
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.dataAccessAuthMode;
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        this.dataAccessAuthMode = dataAccessAuthMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
        if (supportedCapabilities() != null) {
            supportedCapabilities().validate();
        }
        if (creationData() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property creationData in model SnapshotProperties"));
        } else {
            creationData().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotProperties.class);
}
