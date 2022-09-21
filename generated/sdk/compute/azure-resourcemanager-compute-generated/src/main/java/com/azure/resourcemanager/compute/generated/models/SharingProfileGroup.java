// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Group of the gallery sharing profile. */
@Fluent
public final class SharingProfileGroup {
    /*
     * This property allows you to specify the type of sharing group. <br><br> Possible values are: <br><br>
     * **Subscriptions** <br><br> **AADTenants**
     */
    @JsonProperty(value = "type")
    private SharingProfileGroupTypes type;

    /*
     * A list of subscription/tenant ids the gallery is aimed to be shared to.
     */
    @JsonProperty(value = "ids")
    private List<String> ids;

    /** Creates an instance of SharingProfileGroup class. */
    public SharingProfileGroup() {
    }

    /**
     * Get the type property: This property allows you to specify the type of sharing group. &lt;br&gt;&lt;br&gt;
     * Possible values are: &lt;br&gt;&lt;br&gt; **Subscriptions** &lt;br&gt;&lt;br&gt; **AADTenants**.
     *
     * @return the type value.
     */
    public SharingProfileGroupTypes type() {
        return this.type;
    }

    /**
     * Set the type property: This property allows you to specify the type of sharing group. &lt;br&gt;&lt;br&gt;
     * Possible values are: &lt;br&gt;&lt;br&gt; **Subscriptions** &lt;br&gt;&lt;br&gt; **AADTenants**.
     *
     * @param type the type value to set.
     * @return the SharingProfileGroup object itself.
     */
    public SharingProfileGroup withType(SharingProfileGroupTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ids property: A list of subscription/tenant ids the gallery is aimed to be shared to.
     *
     * @return the ids value.
     */
    public List<String> ids() {
        return this.ids;
    }

    /**
     * Set the ids property: A list of subscription/tenant ids the gallery is aimed to be shared to.
     *
     * @param ids the ids value to set.
     * @return the SharingProfileGroup object itself.
     */
    public SharingProfileGroup withIds(List<String> ids) {
        this.ids = ids;
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
