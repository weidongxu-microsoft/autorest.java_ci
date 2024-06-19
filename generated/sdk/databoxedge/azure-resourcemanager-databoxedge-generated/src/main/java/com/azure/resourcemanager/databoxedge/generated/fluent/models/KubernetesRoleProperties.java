// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.HostPlatformType;
import com.azure.resourcemanager.databoxedge.generated.models.KubernetesClusterInfo;
import com.azure.resourcemanager.databoxedge.generated.models.KubernetesRoleResources;
import com.azure.resourcemanager.databoxedge.generated.models.KubernetesState;
import com.azure.resourcemanager.databoxedge.generated.models.PlatformType;
import com.azure.resourcemanager.databoxedge.generated.models.RoleStatus;
import java.io.IOException;

/**
 * Kubernetes role properties.
 */
@Fluent
public final class KubernetesRoleProperties implements JsonSerializable<KubernetesRoleProperties> {
    /*
     * Host OS supported by the Kubernetes role.
     */
    private PlatformType hostPlatform;

    /*
     * State of Kubernetes deployment
     */
    private KubernetesState provisioningState;

    /*
     * Platform where the runtime is hosted.
     */
    private HostPlatformType hostPlatformType;

    /*
     * Kubernetes cluster configuration
     */
    private KubernetesClusterInfo kubernetesClusterInfo;

    /*
     * Kubernetes role resources
     */
    private KubernetesRoleResources kubernetesRoleResources;

    /*
     * Role status.
     */
    private RoleStatus roleStatus;

    /**
     * Creates an instance of KubernetesRoleProperties class.
     */
    public KubernetesRoleProperties() {
    }

    /**
     * Get the hostPlatform property: Host OS supported by the Kubernetes role.
     * 
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.hostPlatform;
    }

    /**
     * Set the hostPlatform property: Host OS supported by the Kubernetes role.
     * 
     * @param hostPlatform the hostPlatform value to set.
     * @return the KubernetesRoleProperties object itself.
     */
    public KubernetesRoleProperties withHostPlatform(PlatformType hostPlatform) {
        this.hostPlatform = hostPlatform;
        return this;
    }

    /**
     * Get the provisioningState property: State of Kubernetes deployment.
     * 
     * @return the provisioningState value.
     */
    public KubernetesState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostPlatformType property: Platform where the runtime is hosted.
     * 
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.hostPlatformType;
    }

    /**
     * Get the kubernetesClusterInfo property: Kubernetes cluster configuration.
     * 
     * @return the kubernetesClusterInfo value.
     */
    public KubernetesClusterInfo kubernetesClusterInfo() {
        return this.kubernetesClusterInfo;
    }

    /**
     * Set the kubernetesClusterInfo property: Kubernetes cluster configuration.
     * 
     * @param kubernetesClusterInfo the kubernetesClusterInfo value to set.
     * @return the KubernetesRoleProperties object itself.
     */
    public KubernetesRoleProperties withKubernetesClusterInfo(KubernetesClusterInfo kubernetesClusterInfo) {
        this.kubernetesClusterInfo = kubernetesClusterInfo;
        return this;
    }

    /**
     * Get the kubernetesRoleResources property: Kubernetes role resources.
     * 
     * @return the kubernetesRoleResources value.
     */
    public KubernetesRoleResources kubernetesRoleResources() {
        return this.kubernetesRoleResources;
    }

    /**
     * Set the kubernetesRoleResources property: Kubernetes role resources.
     * 
     * @param kubernetesRoleResources the kubernetesRoleResources value to set.
     * @return the KubernetesRoleProperties object itself.
     */
    public KubernetesRoleProperties withKubernetesRoleResources(KubernetesRoleResources kubernetesRoleResources) {
        this.kubernetesRoleResources = kubernetesRoleResources;
        return this;
    }

    /**
     * Get the roleStatus property: Role status.
     * 
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.roleStatus;
    }

    /**
     * Set the roleStatus property: Role status.
     * 
     * @param roleStatus the roleStatus value to set.
     * @return the KubernetesRoleProperties object itself.
     */
    public KubernetesRoleProperties withRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostPlatform() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property hostPlatform in model KubernetesRoleProperties"));
        }
        if (kubernetesClusterInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property kubernetesClusterInfo in model KubernetesRoleProperties"));
        } else {
            kubernetesClusterInfo().validate();
        }
        if (kubernetesRoleResources() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property kubernetesRoleResources in model KubernetesRoleProperties"));
        } else {
            kubernetesRoleResources().validate();
        }
        if (roleStatus() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property roleStatus in model KubernetesRoleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesRoleProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostPlatform", this.hostPlatform == null ? null : this.hostPlatform.toString());
        jsonWriter.writeJsonField("kubernetesClusterInfo", this.kubernetesClusterInfo);
        jsonWriter.writeJsonField("kubernetesRoleResources", this.kubernetesRoleResources);
        jsonWriter.writeStringField("roleStatus", this.roleStatus == null ? null : this.roleStatus.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesRoleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesRoleProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KubernetesRoleProperties.
     */
    public static KubernetesRoleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesRoleProperties deserializedKubernetesRoleProperties = new KubernetesRoleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostPlatform".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.hostPlatform = PlatformType.fromString(reader.getString());
                } else if ("kubernetesClusterInfo".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.kubernetesClusterInfo = KubernetesClusterInfo.fromJson(reader);
                } else if ("kubernetesRoleResources".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.kubernetesRoleResources
                        = KubernetesRoleResources.fromJson(reader);
                } else if ("roleStatus".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.roleStatus = RoleStatus.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.provisioningState
                        = KubernetesState.fromString(reader.getString());
                } else if ("hostPlatformType".equals(fieldName)) {
                    deserializedKubernetesRoleProperties.hostPlatformType
                        = HostPlatformType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesRoleProperties;
        });
    }
}
