// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.KubernetesRoleProperties;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import java.io.IOException;

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
@Fluent
public final class KubernetesRole extends RoleInner {
    /*
     * Role type.
     */
    private RoleTypes kind = RoleTypes.KUBERNETES;

    /*
     * Properties specific to Kubernetes role.
     */
    private KubernetesRoleProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * Metadata pertaining to creation and last modification of Role
     */
    private SystemData systemData;

    /**
     * Creates an instance of KubernetesRole class.
     */
    public KubernetesRole() {
    }

    /**
     * Get the kind property: Role type.
     * 
     * @return the kind value.
     */
    @Override
    public RoleTypes kind() {
        return this.kind;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Role.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesRole from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesRole if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KubernetesRole.
     */
    public static KubernetesRole fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesRole deserializedKubernetesRole = new KubernetesRole();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedKubernetesRole.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedKubernetesRole.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedKubernetesRole.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedKubernetesRole.systemData = SystemData.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedKubernetesRole.kind = RoleTypes.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedKubernetesRole.innerProperties = KubernetesRoleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesRole;
        });
    }
}
