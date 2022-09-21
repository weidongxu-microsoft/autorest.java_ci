// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskSku;
import com.azure.resourcemanager.compute.generated.models.DiskState;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PropertyUpdatesInProgress;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.ShareInfoElement;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Disk resource. */
@Fluent
public final class DiskInner extends Resource {
    /*
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * List of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a
     * value greater than one for disks to allow attaching them to multiple VMs.
     */
    @JsonProperty(value = "managedByExtended", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> managedByExtended;

    /*
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS,
     * StandardSSD_ZRS, or PremiumV2_LRS.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /*
     * The Logical zone list for Disk.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The extended location where the disk will be created. Extended location cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Disk resource properties.
     */
    @JsonProperty(value = "properties")
    private DiskProperties innerProperties;

    /** Creates an instance of DiskInner class. */
    public DiskInner() {
    }

    /**
     * Get the managedBy property: A relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the managedByExtended property: List of relative URIs containing the IDs of the VMs that have the disk
     * attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the managedByExtended value.
     */
    public List<String> managedByExtended() {
        return this.managedByExtended;
    }

    /**
     * Get the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS,
     * Premium_ZRS, StandardSSD_ZRS, or PremiumV2_LRS.
     *
     * @return the sku value.
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS,
     * Premium_ZRS, StandardSSD_ZRS, or PremiumV2_LRS.
     *
     * @param sku the sku value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: The Logical zone list for Disk.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The Logical zone list for Disk.
     *
     * @param zones the zones value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location where the disk will be created. Extended location cannot
     * be changed.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location where the disk will be created. Extended location cannot
     * be changed.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Disk resource properties.
     *
     * @return the innerProperties value.
     */
    private DiskProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DiskInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the timeCreated property: The time when the disk was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: The Operating System type.
     *
     * @param osType the osType value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCapabilities();
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withSupportedCapabilities(supportedCapabilities);
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.innerProperties() == null ? null : this.innerProperties().creationData();
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @param creationData the creationData value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withCreationData(CreationData creationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withCreationData(creationData);
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
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeGB();
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskSizeGB(Integer diskSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeBytes();
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueId();
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettingsCollection();
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withEncryptionSettingsCollection(encryptionSettingsCollection);
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.innerProperties() == null ? null : this.innerProperties().diskIopsReadWrite();
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIopsReadWrite(Long diskIopsReadWrite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskIopsReadWrite(diskIopsReadWrite);
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.innerProperties() == null ? null : this.innerProperties().diskMBpsReadWrite();
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskMBpsReadWrite(diskMBpsReadWrite);
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().diskIopsReadOnly();
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIopsReadOnly(Long diskIopsReadOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskIopsReadOnly(diskIopsReadOnly);
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().diskMBpsReadOnly();
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskMBpsReadOnly(diskMBpsReadOnly);
        return this;
    }

    /**
     * Get the diskState property: The state of the disk.
     *
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.innerProperties() == null ? null : this.innerProperties().diskState();
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.innerProperties() == null ? null : this.innerProperties().maxShares();
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @param maxShares the maxShares value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withMaxShares(Integer maxShares) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withMaxShares(maxShares);
        return this;
    }

    /**
     * Get the shareInfo property: Details of the list of all VMs that have the disk attached. maxShares should be set
     * to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the shareInfo value.
     */
    public List<ShareInfoElement> shareInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().shareInfo();
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAccessPolicy();
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withNetworkAccessPolicy(networkAccessPolicy);
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskAccessId();
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskAccessId(String diskAccessId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDiskAccessId(diskAccessId);
        return this;
    }

    /**
     * Get the burstingEnabledTime property: Latest time when bursting was last enabled on a disk.
     *
     * @return the burstingEnabledTime value.
     */
    public OffsetDateTime burstingEnabledTime() {
        return this.innerProperties() == null ? null : this.innerProperties().burstingEnabledTime();
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.innerProperties() == null ? null : this.innerProperties().tier();
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @param tier the tier value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withTier(String tier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withTier(tier);
        return this;
    }

    /**
     * Get the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @return the burstingEnabled value.
     */
    public Boolean burstingEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().burstingEnabled();
    }

    /**
     * Set the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @param burstingEnabled the burstingEnabled value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withBurstingEnabled(Boolean burstingEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withBurstingEnabled(burstingEnabled);
        return this;
    }

    /**
     * Get the propertyUpdatesInProgress property: Properties of the disk for which update is pending.
     *
     * @return the propertyUpdatesInProgress value.
     */
    public PropertyUpdatesInProgress propertyUpdatesInProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().propertyUpdatesInProgress();
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsHibernation();
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withSupportsHibernation(Boolean supportsHibernation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withSupportsHibernation(supportsHibernation);
        return this;
    }

    /**
     * Get the securityProfile property: Contains the security related information for the resource.
     *
     * @return the securityProfile value.
     */
    public DiskSecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Contains the security related information for the resource.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withSecurityProfile(DiskSecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.innerProperties() == null ? null : this.innerProperties().completionPercent();
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     *
     * @param completionPercent the completionPercent value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withCompletionPercent(Float completionPercent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withCompletionPercent(completionPercent);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.innerProperties() == null ? null : this.innerProperties().dataAccessAuthMode();
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withDataAccessAuthMode(dataAccessAuthMode);
        return this;
    }

    /**
     * Get the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     *
     * @return the optimizedForFrequentAttach value.
     */
    public Boolean optimizedForFrequentAttach() {
        return this.innerProperties() == null ? null : this.innerProperties().optimizedForFrequentAttach();
    }

    /**
     * Set the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     *
     * @param optimizedForFrequentAttach the optimizedForFrequentAttach value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withOptimizedForFrequentAttach(Boolean optimizedForFrequentAttach) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskProperties();
        }
        this.innerProperties().withOptimizedForFrequentAttach(optimizedForFrequentAttach);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
