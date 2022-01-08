// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.models.QuotaCapability;
import com.azure.resourcemanager.hdinsight.generated.models.RegionsCapability;
import com.azure.resourcemanager.hdinsight.generated.models.VersionsCapability;
import com.azure.resourcemanager.hdinsight.generated.models.VmSizeCompatibilityFilter;
import com.azure.resourcemanager.hdinsight.generated.models.VmSizesCapability;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Get Capabilities operation response. */
@Fluent
public final class CapabilitiesResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilitiesResultInner.class);

    /*
     * The version capability.
     */
    @JsonProperty(value = "versions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, VersionsCapability> versions;

    /*
     * The virtual machine size compatibility features.
     */
    @JsonProperty(value = "regions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, RegionsCapability> regions;

    /*
     * The virtual machine sizes.
     */
    @JsonProperty(value = "vmsizes")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, VmSizesCapability> vmsizes;

    /*
     * The virtual machine size compatibility filters.
     */
    @JsonProperty(value = "vmsize_filters")
    private List<VmSizeCompatibilityFilter> vmsizeFilters;

    /*
     * The capability features.
     */
    @JsonProperty(value = "features")
    private List<String> features;

    /*
     * The quota capability.
     */
    @JsonProperty(value = "quota", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaCapability quota;

    /**
     * Get the versions property: The version capability.
     *
     * @return the versions value.
     */
    public Map<String, VersionsCapability> versions() {
        return this.versions;
    }

    /**
     * Set the versions property: The version capability.
     *
     * @param versions the versions value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVersions(Map<String, VersionsCapability> versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Get the regions property: The virtual machine size compatibility features.
     *
     * @return the regions value.
     */
    public Map<String, RegionsCapability> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The virtual machine size compatibility features.
     *
     * @param regions the regions value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withRegions(Map<String, RegionsCapability> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the vmsizes property: The virtual machine sizes.
     *
     * @return the vmsizes value.
     */
    public Map<String, VmSizesCapability> vmsizes() {
        return this.vmsizes;
    }

    /**
     * Set the vmsizes property: The virtual machine sizes.
     *
     * @param vmsizes the vmsizes value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVmsizes(Map<String, VmSizesCapability> vmsizes) {
        this.vmsizes = vmsizes;
        return this;
    }

    /**
     * Get the vmsizeFilters property: The virtual machine size compatibility filters.
     *
     * @return the vmsizeFilters value.
     */
    public List<VmSizeCompatibilityFilter> vmsizeFilters() {
        return this.vmsizeFilters;
    }

    /**
     * Set the vmsizeFilters property: The virtual machine size compatibility filters.
     *
     * @param vmsizeFilters the vmsizeFilters value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVmsizeFilters(List<VmSizeCompatibilityFilter> vmsizeFilters) {
        this.vmsizeFilters = vmsizeFilters;
        return this;
    }

    /**
     * Get the features property: The capability features.
     *
     * @return the features value.
     */
    public List<String> features() {
        return this.features;
    }

    /**
     * Set the features property: The capability features.
     *
     * @param features the features value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the quota property: The quota capability.
     *
     * @return the quota value.
     */
    public QuotaCapability quota() {
        return this.quota;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (versions() != null) {
            versions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (regions() != null) {
            regions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (vmsizes() != null) {
            vmsizes()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (vmsizeFilters() != null) {
            vmsizeFilters().forEach(e -> e.validate());
        }
        if (quota() != null) {
            quota().validate();
        }
    }
}
