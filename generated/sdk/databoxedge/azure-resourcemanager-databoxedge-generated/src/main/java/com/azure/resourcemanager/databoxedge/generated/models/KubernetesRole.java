// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.KubernetesRoleProperties;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The limited preview of Kubernetes Cluster Management from the Azure supports:
 * 1. Using a simple turn-key option in Azure Portal, deploy a Kubernetes cluster on your Azure Stack Edge device.
 * 2. Configure Kubernetes cluster running on your device with Arc enabled Kubernetes with a click of a button in the
 * Azure Portal.
 * Azure Arc enables organizations to view, manage, and govern their on-premises Kubernetes clusters using the Azure
 * Portal, command line tools, and APIs.
 * 3. Easily configure Persistent Volumes using SMB and NFS shares for storing container data.
 * For more information, refer to the document here:
 * https://databoxupdatepackages.blob.core.windows.net/documentation/Microsoft-Azure-Stack-Edge-K8-Cloud-Management-20210323.pdf
 * Or Demo:
 * https://databoxupdatepackages.blob.core.windows.net/documentation/Microsoft-Azure-Stack-Edge-K8S-Cloud-Management-20210323.mp4
 * By using this feature, you agree to the preview legal terms. See the
 * https://azure.microsoft.com/en-us/support/legal/preview-supplemental-terms/.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Kubernetes")
@Fluent
public final class KubernetesRole extends RoleInner {
    /*
     * Properties specific to Kubernetes role.
     */
    @JsonProperty(value = "properties")
    private KubernetesRoleProperties innerProperties;

    /**
     * Creates an instance of KubernetesRole class.
     */
    public KubernetesRole() {
    }

    /**
     * Get the innerProperties property: Properties specific to Kubernetes role.
     * 
     * @return the innerProperties value.
     */
    private KubernetesRoleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the hostPlatform property: Host OS supported by the Kubernetes role.
     * 
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatform();
    }

    /**
     * Set the hostPlatform property: Host OS supported by the Kubernetes role.
     * 
     * @param hostPlatform the hostPlatform value to set.
     * @return the KubernetesRole object itself.
     */
    public KubernetesRole withHostPlatform(PlatformType hostPlatform) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesRoleProperties();
        }
        this.innerProperties().withHostPlatform(hostPlatform);
        return this;
    }

    /**
     * Get the provisioningState property: State of Kubernetes deployment.
     * 
     * @return the provisioningState value.
     */
    public KubernetesState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hostPlatformType property: Platform where the runtime is hosted.
     * 
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatformType();
    }

    /**
     * Get the kubernetesClusterInfo property: Kubernetes cluster configuration.
     * 
     * @return the kubernetesClusterInfo value.
     */
    public KubernetesClusterInfo kubernetesClusterInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesClusterInfo();
    }

    /**
     * Set the kubernetesClusterInfo property: Kubernetes cluster configuration.
     * 
     * @param kubernetesClusterInfo the kubernetesClusterInfo value to set.
     * @return the KubernetesRole object itself.
     */
    public KubernetesRole withKubernetesClusterInfo(KubernetesClusterInfo kubernetesClusterInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesRoleProperties();
        }
        this.innerProperties().withKubernetesClusterInfo(kubernetesClusterInfo);
        return this;
    }

    /**
     * Get the kubernetesRoleResources property: Kubernetes role resources.
     * 
     * @return the kubernetesRoleResources value.
     */
    public KubernetesRoleResources kubernetesRoleResources() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesRoleResources();
    }

    /**
     * Set the kubernetesRoleResources property: Kubernetes role resources.
     * 
     * @param kubernetesRoleResources the kubernetesRoleResources value to set.
     * @return the KubernetesRole object itself.
     */
    public KubernetesRole withKubernetesRoleResources(KubernetesRoleResources kubernetesRoleResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesRoleProperties();
        }
        this.innerProperties().withKubernetesRoleResources(kubernetesRoleResources);
        return this;
    }

    /**
     * Get the roleStatus property: Role status.
     * 
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().roleStatus();
    }

    /**
     * Set the roleStatus property: Role status.
     * 
     * @param roleStatus the roleStatus value to set.
     * @return the KubernetesRole object itself.
     */
    public KubernetesRole withRoleStatus(RoleStatus roleStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesRoleProperties();
        }
        this.innerProperties().withRoleStatus(roleStatus);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
