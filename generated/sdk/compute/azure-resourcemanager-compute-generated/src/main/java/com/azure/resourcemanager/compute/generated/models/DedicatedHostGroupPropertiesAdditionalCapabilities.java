// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enables or disables a capability on the dedicated host group.&lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01. */
@Fluent
public final class DedicatedHostGroupPropertiesAdditionalCapabilities {
    /*
     * The flag that enables or disables a capability to have UltraSSD Enabled
     * Virtual Machines on Dedicated Hosts of the Dedicated Host Group. For the
     * Virtual Machines to be UltraSSD Enabled, UltraSSDEnabled flag for the
     * resource needs to be set true as well. The value is defaulted to 'false'
     * when not provided. Please refer to
     * https://docs.microsoft.com/en-us/azure/virtual-machines/disks-enable-ultra-ssd
     * for more details on Ultra SSD feature. <br><br>NOTE: The ultraSSDEnabled
     * setting can only be enabled for Host Groups that are created as zonal.
     * <br><br>Minimum api-version: 2022-03-01.
     */
    @JsonProperty(value = "ultraSSDEnabled")
    private Boolean ultraSsdEnabled;

    /**
     * Get the ultraSsdEnabled property: The flag that enables or disables a capability to have UltraSSD Enabled Virtual
     * Machines on Dedicated Hosts of the Dedicated Host Group. For the Virtual Machines to be UltraSSD Enabled,
     * UltraSSDEnabled flag for the resource needs to be set true as well. The value is defaulted to 'false' when not
     * provided. Please refer to https://docs.microsoft.com/en-us/azure/virtual-machines/disks-enable-ultra-ssd for more
     * details on Ultra SSD feature. &lt;br&gt;&lt;br&gt;NOTE: The ultraSSDEnabled setting can only be enabled for Host
     * Groups that are created as zonal. &lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01.
     *
     * @return the ultraSsdEnabled value.
     */
    public Boolean ultraSsdEnabled() {
        return this.ultraSsdEnabled;
    }

    /**
     * Set the ultraSsdEnabled property: The flag that enables or disables a capability to have UltraSSD Enabled Virtual
     * Machines on Dedicated Hosts of the Dedicated Host Group. For the Virtual Machines to be UltraSSD Enabled,
     * UltraSSDEnabled flag for the resource needs to be set true as well. The value is defaulted to 'false' when not
     * provided. Please refer to https://docs.microsoft.com/en-us/azure/virtual-machines/disks-enable-ultra-ssd for more
     * details on Ultra SSD feature. &lt;br&gt;&lt;br&gt;NOTE: The ultraSSDEnabled setting can only be enabled for Host
     * Groups that are created as zonal. &lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01.
     *
     * @param ultraSsdEnabled the ultraSsdEnabled value to set.
     * @return the DedicatedHostGroupPropertiesAdditionalCapabilities object itself.
     */
    public DedicatedHostGroupPropertiesAdditionalCapabilities withUltraSsdEnabled(Boolean ultraSsdEnabled) {
        this.ultraSsdEnabled = ultraSsdEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
