// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a role on the cluster.
 */
@Fluent
public final class Role {
    /*
     * The name of the role.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The minimum instance count of the cluster.
     */
    @JsonProperty(value = "minInstanceCount")
    private Integer minInstanceCount;

    /*
     * The instance count of the cluster.
     */
    @JsonProperty(value = "targetInstanceCount")
    private Integer targetInstanceCount;

    /*
     * The name of the virtual machine group.
     */
    @JsonProperty(value = "VMGroupName")
    private String vMGroupName;

    /*
     * The autoscale configurations.
     */
    @JsonProperty(value = "autoscale")
    private Autoscale autoscaleConfiguration;

    /*
     * The hardware profile.
     */
    @JsonProperty(value = "hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * The operating system profile.
     */
    @JsonProperty(value = "osProfile")
    private OsProfile osProfile;

    /*
     * The virtual network profile.
     */
    @JsonProperty(value = "virtualNetworkProfile")
    private VirtualNetworkProfile virtualNetworkProfile;

    /*
     * The data disks groups for the role.
     */
    @JsonProperty(value = "dataDisksGroups")
    private List<DataDisksGroups> dataDisksGroups;

    /*
     * The list of script actions on the role.
     */
    @JsonProperty(value = "scriptActions")
    private List<ScriptAction> scriptActions;

    /*
     * Indicates whether encrypt the data disks.
     */
    @JsonProperty(value = "encryptDataDisks")
    private Boolean encryptDataDisks;

    /**
     * Creates an instance of Role class.
     */
    public Role() {
    }

    /**
     * Get the name property: The name of the role.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the role.
     * 
     * @param name the name value to set.
     * @return the Role object itself.
     */
    public Role withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the minInstanceCount property: The minimum instance count of the cluster.
     * 
     * @return the minInstanceCount value.
     */
    public Integer minInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * Set the minInstanceCount property: The minimum instance count of the cluster.
     * 
     * @param minInstanceCount the minInstanceCount value to set.
     * @return the Role object itself.
     */
    public Role withMinInstanceCount(Integer minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
        return this;
    }

    /**
     * Get the targetInstanceCount property: The instance count of the cluster.
     * 
     * @return the targetInstanceCount value.
     */
    public Integer targetInstanceCount() {
        return this.targetInstanceCount;
    }

    /**
     * Set the targetInstanceCount property: The instance count of the cluster.
     * 
     * @param targetInstanceCount the targetInstanceCount value to set.
     * @return the Role object itself.
     */
    public Role withTargetInstanceCount(Integer targetInstanceCount) {
        this.targetInstanceCount = targetInstanceCount;
        return this;
    }

    /**
     * Get the vMGroupName property: The name of the virtual machine group.
     * 
     * @return the vMGroupName value.
     */
    public String vMGroupName() {
        return this.vMGroupName;
    }

    /**
     * Set the vMGroupName property: The name of the virtual machine group.
     * 
     * @param vMGroupName the vMGroupName value to set.
     * @return the Role object itself.
     */
    public Role withVMGroupName(String vMGroupName) {
        this.vMGroupName = vMGroupName;
        return this;
    }

    /**
     * Get the autoscaleConfiguration property: The autoscale configurations.
     * 
     * @return the autoscaleConfiguration value.
     */
    public Autoscale autoscaleConfiguration() {
        return this.autoscaleConfiguration;
    }

    /**
     * Set the autoscaleConfiguration property: The autoscale configurations.
     * 
     * @param autoscaleConfiguration the autoscaleConfiguration value to set.
     * @return the Role object itself.
     */
    public Role withAutoscaleConfiguration(Autoscale autoscaleConfiguration) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        return this;
    }

    /**
     * Get the hardwareProfile property: The hardware profile.
     * 
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: The hardware profile.
     * 
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the Role object itself.
     */
    public Role withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the osProfile property: The operating system profile.
     * 
     * @return the osProfile value.
     */
    public OsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: The operating system profile.
     * 
     * @param osProfile the osProfile value to set.
     * @return the Role object itself.
     */
    public Role withOsProfile(OsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the virtualNetworkProfile property: The virtual network profile.
     * 
     * @return the virtualNetworkProfile value.
     */
    public VirtualNetworkProfile virtualNetworkProfile() {
        return this.virtualNetworkProfile;
    }

    /**
     * Set the virtualNetworkProfile property: The virtual network profile.
     * 
     * @param virtualNetworkProfile the virtualNetworkProfile value to set.
     * @return the Role object itself.
     */
    public Role withVirtualNetworkProfile(VirtualNetworkProfile virtualNetworkProfile) {
        this.virtualNetworkProfile = virtualNetworkProfile;
        return this;
    }

    /**
     * Get the dataDisksGroups property: The data disks groups for the role.
     * 
     * @return the dataDisksGroups value.
     */
    public List<DataDisksGroups> dataDisksGroups() {
        return this.dataDisksGroups;
    }

    /**
     * Set the dataDisksGroups property: The data disks groups for the role.
     * 
     * @param dataDisksGroups the dataDisksGroups value to set.
     * @return the Role object itself.
     */
    public Role withDataDisksGroups(List<DataDisksGroups> dataDisksGroups) {
        this.dataDisksGroups = dataDisksGroups;
        return this;
    }

    /**
     * Get the scriptActions property: The list of script actions on the role.
     * 
     * @return the scriptActions value.
     */
    public List<ScriptAction> scriptActions() {
        return this.scriptActions;
    }

    /**
     * Set the scriptActions property: The list of script actions on the role.
     * 
     * @param scriptActions the scriptActions value to set.
     * @return the Role object itself.
     */
    public Role withScriptActions(List<ScriptAction> scriptActions) {
        this.scriptActions = scriptActions;
        return this;
    }

    /**
     * Get the encryptDataDisks property: Indicates whether encrypt the data disks.
     * 
     * @return the encryptDataDisks value.
     */
    public Boolean encryptDataDisks() {
        return this.encryptDataDisks;
    }

    /**
     * Set the encryptDataDisks property: Indicates whether encrypt the data disks.
     * 
     * @param encryptDataDisks the encryptDataDisks value to set.
     * @return the Role object itself.
     */
    public Role withEncryptDataDisks(Boolean encryptDataDisks) {
        this.encryptDataDisks = encryptDataDisks;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoscaleConfiguration() != null) {
            autoscaleConfiguration().validate();
        }
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (virtualNetworkProfile() != null) {
            virtualNetworkProfile().validate();
        }
        if (dataDisksGroups() != null) {
            dataDisksGroups().forEach(e -> e.validate());
        }
        if (scriptActions() != null) {
            scriptActions().forEach(e -> e.validate());
        }
    }
}
