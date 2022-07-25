// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.BackendPool;
import com.azure.resourcemanager.frontdoor.generated.models.BackendPoolsSettings;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorEnabledState;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorUpdateParameters;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeSettingsModel;
import com.azure.resourcemanager.frontdoor.generated.models.LoadBalancingSettingsModel;
import com.azure.resourcemanager.frontdoor.generated.models.RoutingRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The JSON object that contains the properties required to create an endpoint. */
@Fluent
public final class FrontDoorProperties extends FrontDoorUpdateParameters {
    /*
     * Resource status of the Front Door or Front Door SubResource.
     *
     * Resource status of the Front Door.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /*
     * Provisioning state of the Front Door.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The host that each frontendEndpoint must CNAME to.
     */
    @JsonProperty(value = "cname", access = JsonProperty.Access.WRITE_ONLY)
    private String cname;

    /*
     * The Id of the frontdoor.
     */
    @JsonProperty(value = "frontdoorId", access = JsonProperty.Access.WRITE_ONLY)
    private String frontdoorId;

    /*
     * Rules Engine Configurations available to routing rules.
     */
    @JsonProperty(value = "rulesEngines", access = JsonProperty.Access.WRITE_ONLY)
    private List<RulesEngineInner> rulesEngines;

    /*
     * Key-Value pair representing additional properties for frontdoor.
     */
    @JsonProperty(value = "extendedProperties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> extendedProperties;

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource.
     *
     * <p>Resource status of the Front Door.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Front Door.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the cname property: The host that each frontendEndpoint must CNAME to.
     *
     * @return the cname value.
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Get the frontdoorId property: The Id of the frontdoor.
     *
     * @return the frontdoorId value.
     */
    public String frontdoorId() {
        return this.frontdoorId;
    }

    /**
     * Get the rulesEngines property: Rules Engine Configurations available to routing rules.
     *
     * @return the rulesEngines value.
     */
    public List<RulesEngineInner> rulesEngines() {
        return this.rulesEngines;
    }

    /**
     * Get the extendedProperties property: Key-Value pair representing additional properties for frontdoor.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withRoutingRules(List<RoutingRule> routingRules) {
        super.withRoutingRules(routingRules);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withLoadBalancingSettings(List<LoadBalancingSettingsModel> loadBalancingSettings) {
        super.withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withHealthProbeSettings(List<HealthProbeSettingsModel> healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withBackendPools(List<BackendPool> backendPools) {
        super.withBackendPools(backendPools);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withFrontendEndpoints(List<FrontendEndpointInner> frontendEndpoints) {
        super.withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withBackendPoolsSettings(BackendPoolsSettings backendPoolsSettings) {
        super.withBackendPoolsSettings(backendPoolsSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FrontDoorProperties withEnabledState(FrontDoorEnabledState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (rulesEngines() != null) {
            rulesEngines().forEach(e -> e.validate());
        }
    }
}
