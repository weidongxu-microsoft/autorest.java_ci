// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the Twitter provider.
 */
@Fluent
public final class Twitter {
    /*
     * <code>false</code> if the Twitter provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The configuration settings of the app registration for the Twitter provider.
     */
    @JsonProperty(value = "registration")
    private TwitterRegistration registration;

    /**
     * Creates an instance of Twitter class.
     */
    public Twitter() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Twitter provider should not be enabled despite
     * the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Twitter provider should not be enabled despite
     * the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the Twitter object itself.
     */
    public Twitter withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the app registration for the Twitter provider.
     * 
     * @return the registration value.
     */
    public TwitterRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the app registration for the Twitter provider.
     * 
     * @param registration the registration value to set.
     * @return the Twitter object itself.
     */
    public Twitter withRegistration(TwitterRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
    }
}
