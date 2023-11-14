// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.appservice.generated.models.Configuration;
import com.azure.resourcemanager.appservice.generated.models.ContainerAppProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.Template;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Container App.
 */
@Fluent
public final class ContainerAppInner extends Resource {
    /*
     * ContainerApp resource specific properties
     */
    @JsonProperty(value = "properties")
    private ContainerAppProperties innerProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of ContainerAppInner class.
     */
    public ContainerAppInner() {
    }

    /**
     * Get the innerProperties property: ContainerApp resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private ContainerAppProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     * 
     * @param kind the kind value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainerAppInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainerAppInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Container App.
     * 
     * @return the provisioningState value.
     */
    public ContainerAppProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the kubeEnvironmentId property: Resource ID of the Container App's KubeEnvironment.
     * 
     * @return the kubeEnvironmentId value.
     */
    public String kubeEnvironmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().kubeEnvironmentId();
    }

    /**
     * Set the kubeEnvironmentId property: Resource ID of the Container App's KubeEnvironment.
     * 
     * @param kubeEnvironmentId the kubeEnvironmentId value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withKubeEnvironmentId(String kubeEnvironmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withKubeEnvironmentId(kubeEnvironmentId);
        return this;
    }

    /**
     * Get the latestRevisionName property: Name of the latest revision of the Container App.
     * 
     * @return the latestRevisionName value.
     */
    public String latestRevisionName() {
        return this.innerProperties() == null ? null : this.innerProperties().latestRevisionName();
    }

    /**
     * Get the latestRevisionFqdn property: Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     * @return the latestRevisionFqdn value.
     */
    public String latestRevisionFqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().latestRevisionFqdn();
    }

    /**
     * Get the configuration property: Non versioned Container App configuration properties.
     * 
     * @return the configuration value.
     */
    public Configuration configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().configuration();
    }

    /**
     * Set the configuration property: Non versioned Container App configuration properties.
     * 
     * @param configuration the configuration value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withConfiguration(Configuration configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withConfiguration(configuration);
        return this;
    }

    /**
     * Get the template property: Container App versioned application definition.
     * 
     * @return the template value.
     */
    public Template template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Set the template property: Container App versioned application definition.
     * 
     * @param template the template value to set.
     * @return the ContainerAppInner object itself.
     */
    public ContainerAppInner withTemplate(Template template) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerAppProperties();
        }
        this.innerProperties().withTemplate(template);
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
