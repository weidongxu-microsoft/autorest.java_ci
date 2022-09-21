// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the Azure Active Directory login flow. */
@Fluent
public final class AzureActiveDirectoryLogin {
    /*
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     */
    @JsonProperty(value = "loginParameters")
    private List<String> loginParameters;

    /*
     * <code>true</code> if the www-authenticate provider should be omitted from the request; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "disableWWWAuthenticate")
    private Boolean disableWwwAuthenticate;

    /** Creates an instance of AzureActiveDirectoryLogin class. */
    public AzureActiveDirectoryLogin() {
    }

    /**
     * Get the loginParameters property: Login parameters to send to the OpenID Connect authorization endpoint when a
     * user logs in. Each parameter must be in the form "key=value".
     *
     * @return the loginParameters value.
     */
    public List<String> loginParameters() {
        return this.loginParameters;
    }

    /**
     * Set the loginParameters property: Login parameters to send to the OpenID Connect authorization endpoint when a
     * user logs in. Each parameter must be in the form "key=value".
     *
     * @param loginParameters the loginParameters value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withLoginParameters(List<String> loginParameters) {
        this.loginParameters = loginParameters;
        return this;
    }

    /**
     * Get the disableWwwAuthenticate property: &lt;code&gt;true&lt;/code&gt; if the www-authenticate provider should be
     * omitted from the request; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the disableWwwAuthenticate value.
     */
    public Boolean disableWwwAuthenticate() {
        return this.disableWwwAuthenticate;
    }

    /**
     * Set the disableWwwAuthenticate property: &lt;code&gt;true&lt;/code&gt; if the www-authenticate provider should be
     * omitted from the request; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param disableWwwAuthenticate the disableWwwAuthenticate value to set.
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withDisableWwwAuthenticate(Boolean disableWwwAuthenticate) {
        this.disableWwwAuthenticate = disableWwwAuthenticate;
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
