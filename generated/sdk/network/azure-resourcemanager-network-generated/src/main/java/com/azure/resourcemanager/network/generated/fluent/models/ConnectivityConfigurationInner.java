// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.generated.models.ChildResource;
import com.azure.resourcemanager.network.generated.models.ConnectivityGroupItem;
import com.azure.resourcemanager.network.generated.models.ConnectivityTopology;
import com.azure.resourcemanager.network.generated.models.DeleteExistingPeering;
import com.azure.resourcemanager.network.generated.models.Hub;
import com.azure.resourcemanager.network.generated.models.IsGlobal;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network manager connectivity configuration resource. */
@Fluent
public final class ConnectivityConfigurationInner extends ChildResource {
    /*
     * Properties of a network manager connectivity configuration
     */
    @JsonProperty(value = "properties")
    private ConnectivityConfigurationProperties innerProperties;

    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ConnectivityConfigurationInner class. */
    public ConnectivityConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of a network manager connectivity configuration.
     *
     * @return the innerProperties value.
     */
    private ConnectivityConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: A description of the connectivity configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the connectivity configuration.
     *
     * @param description the description value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the connectivityTopology property: Connectivity topology type.
     *
     * @return the connectivityTopology value.
     */
    public ConnectivityTopology connectivityTopology() {
        return this.innerProperties() == null ? null : this.innerProperties().connectivityTopology();
    }

    /**
     * Set the connectivityTopology property: Connectivity topology type.
     *
     * @param connectivityTopology the connectivityTopology value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withConnectivityTopology(ConnectivityTopology connectivityTopology) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withConnectivityTopology(connectivityTopology);
        return this;
    }

    /**
     * Get the hubs property: List of hubItems.
     *
     * @return the hubs value.
     */
    public List<Hub> hubs() {
        return this.innerProperties() == null ? null : this.innerProperties().hubs();
    }

    /**
     * Set the hubs property: List of hubItems.
     *
     * @param hubs the hubs value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withHubs(List<Hub> hubs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withHubs(hubs);
        return this;
    }

    /**
     * Get the isGlobal property: Flag if global mesh is supported.
     *
     * @return the isGlobal value.
     */
    public IsGlobal isGlobal() {
        return this.innerProperties() == null ? null : this.innerProperties().isGlobal();
    }

    /**
     * Set the isGlobal property: Flag if global mesh is supported.
     *
     * @param isGlobal the isGlobal value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withIsGlobal(IsGlobal isGlobal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withIsGlobal(isGlobal);
        return this;
    }

    /**
     * Get the appliesToGroups property: Groups for configuration.
     *
     * @return the appliesToGroups value.
     */
    public List<ConnectivityGroupItem> appliesToGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().appliesToGroups();
    }

    /**
     * Set the appliesToGroups property: Groups for configuration.
     *
     * @param appliesToGroups the appliesToGroups value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withAppliesToGroups(List<ConnectivityGroupItem> appliesToGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withAppliesToGroups(appliesToGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the connectivity configuration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deleteExistingPeering property: Flag if need to remove current existing peerings.
     *
     * @return the deleteExistingPeering value.
     */
    public DeleteExistingPeering deleteExistingPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteExistingPeering();
    }

    /**
     * Set the deleteExistingPeering property: Flag if need to remove current existing peerings.
     *
     * @param deleteExistingPeering the deleteExistingPeering value to set.
     * @return the ConnectivityConfigurationInner object itself.
     */
    public ConnectivityConfigurationInner withDeleteExistingPeering(DeleteExistingPeering deleteExistingPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectivityConfigurationProperties();
        }
        this.innerProperties().withDeleteExistingPeering(deleteExistingPeering);
        return this;
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
