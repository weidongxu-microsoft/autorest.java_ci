// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configures the Explicit Analog Television Output Restriction control bits. For further details see the PlayReady
 * Compliance Rules.
 */
@Fluent
public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction {
    /*
     * Indicates whether this restriction is enforced on a Best Effort basis.
     */
    @JsonProperty(value = "bestEffort", required = true)
    private boolean bestEffort;

    /*
     * Configures the restriction control bits. Must be between 0 and 3
     * inclusive.
     */
    @JsonProperty(value = "configurationData", required = true)
    private int configurationData;

    /**
     * Get the bestEffort property: Indicates whether this restriction is enforced on a Best Effort basis.
     *
     * @return the bestEffort value.
     */
    public boolean bestEffort() {
        return this.bestEffort;
    }

    /**
     * Set the bestEffort property: Indicates whether this restriction is enforced on a Best Effort basis.
     *
     * @param bestEffort the bestEffort value to set.
     * @return the ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction object itself.
     */
    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction withBestEffort(boolean bestEffort) {
        this.bestEffort = bestEffort;
        return this;
    }

    /**
     * Get the configurationData property: Configures the restriction control bits. Must be between 0 and 3 inclusive.
     *
     * @return the configurationData value.
     */
    public int configurationData() {
        return this.configurationData;
    }

    /**
     * Set the configurationData property: Configures the restriction control bits. Must be between 0 and 3 inclusive.
     *
     * @param configurationData the configurationData value to set.
     * @return the ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction object itself.
     */
    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction withConfigurationData(int configurationData) {
        this.configurationData = configurationData;
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
