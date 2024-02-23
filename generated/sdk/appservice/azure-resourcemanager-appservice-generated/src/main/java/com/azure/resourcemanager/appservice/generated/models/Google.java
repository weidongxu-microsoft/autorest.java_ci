// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the Google provider.
 */
@Fluent
public final class Google {
    /*
     * <code>false</code> if the Google provider should not be enabled despite the set registration; otherwise,
     * <code>true</code>.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The configuration settings of the app registration for the Google provider.
     */
    @JsonProperty(value = "registration")
    private ClientRegistration registration;

    /*
     * The configuration settings of the login flow.
     */
    @JsonProperty(value = "login")
    private LoginScopes login;

    /*
     * The configuration settings of the Azure Active Directory token validation flow.
     */
    @JsonProperty(value = "validation")
    private AllowedAudiencesValidation validation;

    /**
     * Creates an instance of Google class.
     */
    public Google() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the
     * set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the Google object itself.
     */
    public Google withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the app registration for the Google provider.
     * 
     * @return the registration value.
     */
    public ClientRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the app registration for the Google provider.
     * 
     * @param registration the registration value to set.
     * @return the Google object itself.
     */
    public Google withRegistration(ClientRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow.
     * 
     * @return the login value.
     */
    public LoginScopes login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow.
     * 
     * @param login the login value to set.
     * @return the Google object itself.
     */
    public Google withLogin(LoginScopes login) {
        this.login = login;
        return this;
    }

    /**
     * Get the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @return the validation value.
     */
    public AllowedAudiencesValidation validation() {
        return this.validation;
    }

    /**
     * Set the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @param validation the validation value to set.
     * @return the Google object itself.
     */
    public Google withValidation(AllowedAudiencesValidation validation) {
        this.validation = validation;
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
        if (login() != null) {
            login().validate();
        }
        if (validation() != null) {
            validation().validate();
        }
    }
}
