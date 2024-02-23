// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.models.ApplicationGroupPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ApplicationGroupProperties model.
 */
@Fluent
public final class ApplicationGroupProperties {
    /*
     * Determines if Application Group is allowed to create connection with namespace or not. Once the isEnabled is set
     * to false, all the existing connections of application group gets dropped and no new connections will be allowed
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * The Unique identifier for application group.Supports SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid)
     */
    @JsonProperty(value = "clientAppGroupIdentifier", required = true)
    private String clientAppGroupIdentifier;

    /*
     * List of group policies that define the behavior of application group. The policies can support resource
     * governance scenarios such as limiting ingress or egress traffic.
     */
    @JsonProperty(value = "policies")
    private List<ApplicationGroupPolicy> policies;

    /**
     * Creates an instance of ApplicationGroupProperties class.
     */
    public ApplicationGroupProperties() {
    }

    /**
     * Get the isEnabled property: Determines if Application Group is allowed to create connection with namespace or
     * not. Once the isEnabled is set to false, all the existing connections of application group gets dropped and no
     * new connections will be allowed.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Determines if Application Group is allowed to create connection with namespace or
     * not. Once the isEnabled is set to false, all the existing connections of application group gets dropped and no
     * new connections will be allowed.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the ApplicationGroupProperties object itself.
     */
    public ApplicationGroupProperties withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the clientAppGroupIdentifier property: The Unique identifier for application group.Supports
     * SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
     * 
     * @return the clientAppGroupIdentifier value.
     */
    public String clientAppGroupIdentifier() {
        return this.clientAppGroupIdentifier;
    }

    /**
     * Set the clientAppGroupIdentifier property: The Unique identifier for application group.Supports
     * SAS(SASKeyName=KeyName) or AAD(AADAppID=Guid).
     * 
     * @param clientAppGroupIdentifier the clientAppGroupIdentifier value to set.
     * @return the ApplicationGroupProperties object itself.
     */
    public ApplicationGroupProperties withClientAppGroupIdentifier(String clientAppGroupIdentifier) {
        this.clientAppGroupIdentifier = clientAppGroupIdentifier;
        return this;
    }

    /**
     * Get the policies property: List of group policies that define the behavior of application group. The policies can
     * support resource governance scenarios such as limiting ingress or egress traffic.
     * 
     * @return the policies value.
     */
    public List<ApplicationGroupPolicy> policies() {
        return this.policies;
    }

    /**
     * Set the policies property: List of group policies that define the behavior of application group. The policies can
     * support resource governance scenarios such as limiting ingress or egress traffic.
     * 
     * @param policies the policies value to set.
     * @return the ApplicationGroupProperties object itself.
     */
    public ApplicationGroupProperties withPolicies(List<ApplicationGroupPolicy> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientAppGroupIdentifier() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property clientAppGroupIdentifier in model ApplicationGroupProperties"));
        }
        if (policies() != null) {
            policies().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGroupProperties.class);
}
