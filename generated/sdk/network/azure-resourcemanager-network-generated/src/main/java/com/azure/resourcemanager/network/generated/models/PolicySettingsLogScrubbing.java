// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** To scrub sensitive log fields. */
@Fluent
public final class PolicySettingsLogScrubbing {
    /*
     * State of the log scrubbing config. Default value is Enabled.
     */
    @JsonProperty(value = "state")
    private WebApplicationFirewallScrubbingState state;

    /*
     * The rules that are applied to the logs for scrubbing.
     */
    @JsonProperty(value = "scrubbingRules")
    private List<WebApplicationFirewallScrubbingRules> scrubbingRules;

    /** Creates an instance of PolicySettingsLogScrubbing class. */
    public PolicySettingsLogScrubbing() {
    }

    /**
     * Get the state property: State of the log scrubbing config. Default value is Enabled.
     *
     * @return the state value.
     */
    public WebApplicationFirewallScrubbingState state() {
        return this.state;
    }

    /**
     * Set the state property: State of the log scrubbing config. Default value is Enabled.
     *
     * @param state the state value to set.
     * @return the PolicySettingsLogScrubbing object itself.
     */
    public PolicySettingsLogScrubbing withState(WebApplicationFirewallScrubbingState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the scrubbingRules property: The rules that are applied to the logs for scrubbing.
     *
     * @return the scrubbingRules value.
     */
    public List<WebApplicationFirewallScrubbingRules> scrubbingRules() {
        return this.scrubbingRules;
    }

    /**
     * Set the scrubbingRules property: The rules that are applied to the logs for scrubbing.
     *
     * @param scrubbingRules the scrubbingRules value to set.
     * @return the PolicySettingsLogScrubbing object itself.
     */
    public PolicySettingsLogScrubbing withScrubbingRules(List<WebApplicationFirewallScrubbingRules> scrubbingRules) {
        this.scrubbingRules = scrubbingRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scrubbingRules() != null) {
            scrubbingRules().forEach(e -> e.validate());
        }
    }
}
