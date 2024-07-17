// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.DiskRestorePointInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of DiskRestorePoint.
 */
public interface DiskRestorePoint {
    /**
     * Gets the id property: Resource Id.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the timeCreated property: The timestamp of restorePoint creation.
     * 
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the sourceResourceId property: arm id of source disk or source disk restore point.
     * 
     * @return the sourceResourceId value.
     */
    String sourceResourceId();

    /**
     * Gets the osType property: The Operating System type.
     * 
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * 
     * @return the purchasePlan value.
     */
    PurchasePlanAutoGenerated purchasePlan();

    /**
     * Gets the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     * 
     * @return the supportedCapabilities value.
     */
    SupportedCapabilities supportedCapabilities();

    /**
     * Gets the familyId property: id of the backing snapshot's MIS family.
     * 
     * @return the familyId value.
     */
    String familyId();

    /**
     * Gets the sourceUniqueId property: unique incarnation id of the source disk.
     * 
     * @return the sourceUniqueId value.
     */
    String sourceUniqueId();

    /**
     * Gets the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     * 
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     * 
     * @return the supportsHibernation value.
     */
    Boolean supportsHibernation();

    /**
     * Gets the networkAccessPolicy property: Policy for accessing the disk via network.
     * 
     * @return the networkAccessPolicy value.
     */
    NetworkAccessPolicy networkAccessPolicy();

    /**
     * Gets the publicNetworkAccess property: Policy for controlling export on the disk.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     * @return the diskAccessId value.
     */
    String diskAccessId();

    /**
     * Gets the completionPercent property: Percentage complete for the background copy of disk restore point when
     * source resource is from a different region.
     * 
     * @return the completionPercent value.
     */
    Float completionPercent();

    /**
     * Gets the replicationState property: Replication state of disk restore point when source resource is from a
     * different region.
     * 
     * @return the replicationState value.
     */
    String replicationState();

    /**
     * Gets the sourceResourceLocation property: Location of source disk or source disk restore point when source
     * resource is from a different region.
     * 
     * @return the sourceResourceLocation value.
     */
    String sourceResourceLocation();

    /**
     * Gets the securityProfile property: Contains the security related information for the resource.
     * 
     * @return the securityProfile value.
     */
    DiskSecurityProfile securityProfile();

    /**
     * Gets the logicalSectorSize property: Logical sector size in bytes for disk restore points of UltraSSD_LRS and
     * PremiumV2_LRS disks. Supported values are 512 and 4096. 4096 is the default.
     * 
     * @return the logicalSectorSize value.
     */
    Integer logicalSectorSize();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.DiskRestorePointInner object.
     * 
     * @return the inner object.
     */
    DiskRestorePointInner innerModel();
}
