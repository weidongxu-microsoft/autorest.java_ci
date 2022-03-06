// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Use to provide parameters when requesting an export of all devices in the IoT hub. */
@Fluent
public final class ExportDevicesRequest {
    /*
     * The export blob container URI.
     */
    @JsonProperty(value = "exportBlobContainerUri", required = true)
    private String exportBlobContainerUri;

    /*
     * The value indicating whether keys should be excluded during export.
     */
    @JsonProperty(value = "excludeKeys", required = true)
    private boolean excludeKeys;

    /*
     * The name of the blob that will be created in the provided output blob
     * container. This blob will contain the exported device registry
     * information for the IoT Hub.
     */
    @JsonProperty(value = "exportBlobName")
    private String exportBlobName;

    /*
     * Specifies authentication type being used for connecting to the storage
     * account.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of storage endpoint for export devices.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * The value indicating whether configurations should be exported.
     */
    @JsonProperty(value = "includeConfigurations")
    private Boolean includeConfigurations;

    /*
     * The name of the blob that will be created in the provided output blob
     * container. This blob will contain the exported configurations for the
     * Iot Hub.
     */
    @JsonProperty(value = "configurationsBlobName")
    private String configurationsBlobName;

    /**
     * Get the exportBlobContainerUri property: The export blob container URI.
     *
     * @return the exportBlobContainerUri value.
     */
    public String exportBlobContainerUri() {
        return this.exportBlobContainerUri;
    }

    /**
     * Set the exportBlobContainerUri property: The export blob container URI.
     *
     * @param exportBlobContainerUri the exportBlobContainerUri value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExportBlobContainerUri(String exportBlobContainerUri) {
        this.exportBlobContainerUri = exportBlobContainerUri;
        return this;
    }

    /**
     * Get the excludeKeys property: The value indicating whether keys should be excluded during export.
     *
     * @return the excludeKeys value.
     */
    public boolean excludeKeys() {
        return this.excludeKeys;
    }

    /**
     * Set the excludeKeys property: The value indicating whether keys should be excluded during export.
     *
     * @param excludeKeys the excludeKeys value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExcludeKeys(boolean excludeKeys) {
        this.excludeKeys = excludeKeys;
        return this;
    }

    /**
     * Get the exportBlobName property: The name of the blob that will be created in the provided output blob container.
     * This blob will contain the exported device registry information for the IoT Hub.
     *
     * @return the exportBlobName value.
     */
    public String exportBlobName() {
        return this.exportBlobName;
    }

    /**
     * Set the exportBlobName property: The name of the blob that will be created in the provided output blob container.
     * This blob will contain the exported device registry information for the IoT Hub.
     *
     * @param exportBlobName the exportBlobName value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withExportBlobName(String exportBlobName) {
        this.exportBlobName = exportBlobName;
        return this;
    }

    /**
     * Get the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of storage endpoint for export devices.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of storage endpoint for export devices.
     *
     * @param identity the identity value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the includeConfigurations property: The value indicating whether configurations should be exported.
     *
     * @return the includeConfigurations value.
     */
    public Boolean includeConfigurations() {
        return this.includeConfigurations;
    }

    /**
     * Set the includeConfigurations property: The value indicating whether configurations should be exported.
     *
     * @param includeConfigurations the includeConfigurations value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withIncludeConfigurations(Boolean includeConfigurations) {
        this.includeConfigurations = includeConfigurations;
        return this;
    }

    /**
     * Get the configurationsBlobName property: The name of the blob that will be created in the provided output blob
     * container. This blob will contain the exported configurations for the Iot Hub.
     *
     * @return the configurationsBlobName value.
     */
    public String configurationsBlobName() {
        return this.configurationsBlobName;
    }

    /**
     * Set the configurationsBlobName property: The name of the blob that will be created in the provided output blob
     * container. This blob will contain the exported configurations for the Iot Hub.
     *
     * @param configurationsBlobName the configurationsBlobName value to set.
     * @return the ExportDevicesRequest object itself.
     */
    public ExportDevicesRequest withConfigurationsBlobName(String configurationsBlobName) {
        this.configurationsBlobName = configurationsBlobName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exportBlobContainerUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property exportBlobContainerUri in model ExportDevicesRequest"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportDevicesRequest.class);
}
