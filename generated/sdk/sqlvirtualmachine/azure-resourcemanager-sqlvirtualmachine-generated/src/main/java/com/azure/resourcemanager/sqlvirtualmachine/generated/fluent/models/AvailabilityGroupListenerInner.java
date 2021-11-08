// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.generated.models.LoadBalancerConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A SQL Server availability group listener. */
@Fluent
public final class AvailabilityGroupListenerInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilityGroupListenerInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private AvailabilityGroupListenerProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private AvailabilityGroupListenerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the availabilityGroupName property: Name of the availability group.
     *
     * @return the availabilityGroupName value.
     */
    public String availabilityGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityGroupName();
    }

    /**
     * Set the availabilityGroupName property: Name of the availability group.
     *
     * @param availabilityGroupName the availabilityGroupName value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withAvailabilityGroupName(String availabilityGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withAvailabilityGroupName(availabilityGroupName);
        return this;
    }

    /**
     * Get the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     *
     * @return the loadBalancerConfigurations value.
     */
    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerConfigurations();
    }

    /**
     * Set the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     *
     * @param loadBalancerConfigurations the loadBalancerConfigurations value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withLoadBalancerConfigurations(
        List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withLoadBalancerConfigurations(loadBalancerConfigurations);
        return this;
    }

    /**
     * Get the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     *
     * @return the createDefaultAvailabilityGroupIfNotExist value.
     */
    public Boolean createDefaultAvailabilityGroupIfNotExist() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().createDefaultAvailabilityGroupIfNotExist();
    }

    /**
     * Set the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     *
     * @param createDefaultAvailabilityGroupIfNotExist the createDefaultAvailabilityGroupIfNotExist value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withCreateDefaultAvailabilityGroupIfNotExist(
        Boolean createDefaultAvailabilityGroupIfNotExist) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withCreateDefaultAvailabilityGroupIfNotExist(createDefaultAvailabilityGroupIfNotExist);
        return this;
    }

    /**
     * Get the port property: Listener port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: Listener port.
     *
     * @param port the port value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
