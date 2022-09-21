// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.Configuration;
import com.azure.resourcemanager.appservice.generated.models.ContainerAppProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.Template;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ContainerApp resource specific properties. */
@Fluent
public final class ContainerAppProperties {
    /*
     * Provisioning state of the Container App.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerAppProvisioningState provisioningState;

    /*
     * Resource ID of the Container App's KubeEnvironment.
     */
    @JsonProperty(value = "kubeEnvironmentId")
    private String kubeEnvironmentId;

    /*
     * Name of the latest revision of the Container App.
     */
    @JsonProperty(value = "latestRevisionName", access = JsonProperty.Access.WRITE_ONLY)
    private String latestRevisionName;

    /*
     * Fully Qualified Domain Name of the latest revision of the Container App.
     */
    @JsonProperty(value = "latestRevisionFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String latestRevisionFqdn;

    /*
     * Non versioned Container App configuration properties.
     */
    @JsonProperty(value = "configuration")
    private Configuration configuration;

    /*
     * Container App versioned application definition.
     */
    @JsonProperty(value = "template")
    private Template template;

    /** Creates an instance of ContainerAppProperties class. */
    public ContainerAppProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Container App.
     *
     * @return the provisioningState value.
     */
    public ContainerAppProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the kubeEnvironmentId property: Resource ID of the Container App's KubeEnvironment.
     *
     * @return the kubeEnvironmentId value.
     */
    public String kubeEnvironmentId() {
        return this.kubeEnvironmentId;
    }

    /**
     * Set the kubeEnvironmentId property: Resource ID of the Container App's KubeEnvironment.
     *
     * @param kubeEnvironmentId the kubeEnvironmentId value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withKubeEnvironmentId(String kubeEnvironmentId) {
        this.kubeEnvironmentId = kubeEnvironmentId;
        return this;
    }

    /**
     * Get the latestRevisionName property: Name of the latest revision of the Container App.
     *
     * @return the latestRevisionName value.
     */
    public String latestRevisionName() {
        return this.latestRevisionName;
    }

    /**
     * Get the latestRevisionFqdn property: Fully Qualified Domain Name of the latest revision of the Container App.
     *
     * @return the latestRevisionFqdn value.
     */
    public String latestRevisionFqdn() {
        return this.latestRevisionFqdn;
    }

    /**
     * Get the configuration property: Non versioned Container App configuration properties.
     *
     * @return the configuration value.
     */
    public Configuration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Non versioned Container App configuration properties.
     *
     * @param configuration the configuration value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the template property: Container App versioned application definition.
     *
     * @return the template value.
     */
    public Template template() {
        return this.template;
    }

    /**
     * Set the template property: Container App versioned application definition.
     *
     * @param template the template value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withTemplate(Template template) {
        this.template = template;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (template() != null) {
            template().validate();
        }
    }
}
