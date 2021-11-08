// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.CustomDomainStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** StaticSiteCustomDomainOverviewARMResource resource specific properties. */
@Immutable
public final class StaticSiteCustomDomainOverviewArmResourceProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(StaticSiteCustomDomainOverviewArmResourceProperties.class);

    /*
     * The domain name for the static site custom domain.
     */
    @JsonProperty(value = "domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /*
     * The date and time on which the custom domain was created for the static
     * site.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * The status of the custom domain
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomainStatus status;

    /*
     * The TXT record validation token
     */
    @JsonProperty(value = "validationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String validationToken;

    /*
     * The errorMessage property.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the status property: The status of the custom domain.
     *
     * @return the status value.
     */
    public CustomDomainStatus status() {
        return this.status;
    }

    /**
     * Get the validationToken property: The TXT record validation token.
     *
     * @return the validationToken value.
     */
    public String validationToken() {
        return this.validationToken;
    }

    /**
     * Get the errorMessage property: The errorMessage property.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
