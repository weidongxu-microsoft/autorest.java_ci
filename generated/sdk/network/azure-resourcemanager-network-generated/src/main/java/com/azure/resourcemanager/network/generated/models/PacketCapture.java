// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.PacketCaptureParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters that define the create packet capture operation. */
@Fluent
public final class PacketCapture {
    /*
     * Properties of the packet capture.
     */
    @JsonProperty(value = "properties", required = true)
    private PacketCaptureParameters innerProperties = new PacketCaptureParameters();

    /**
     * Get the innerProperties property: Properties of the packet capture.
     *
     * @return the innerProperties value.
     */
    private PacketCaptureParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @return the target value.
     */
    public String target() {
        return this.innerProperties() == null ? null : this.innerProperties().target();
    }

    /**
     * Set the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @param target the target value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withTarget(String target) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withTarget(target);
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @return the bytesToCapturePerPacket value.
     */
    public Long bytesToCapturePerPacket() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesToCapturePerPacket();
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @return the totalBytesPerSession value.
     */
    public Long totalBytesPerSession() {
        return this.innerProperties() == null ? null : this.innerProperties().totalBytesPerSession();
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withTotalBytesPerSession(Long totalBytesPerSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().timeLimitInSeconds();
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    /**
     * Get the storageLocation property: The storage location for a packet capture session.
     *
     * @return the storageLocation value.
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().storageLocation();
    }

    /**
     * Set the storageLocation property: The storage location for a packet capture session.
     *
     * @param storageLocation the storageLocation value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withStorageLocation(storageLocation);
        return this;
    }

    /**
     * Get the filters property: A list of packet capture filters.
     *
     * @return the filters value.
     */
    public List<PacketCaptureFilter> filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: A list of packet capture filters.
     *
     * @param filters the filters value to set.
     * @return the PacketCapture object itself.
     */
    public PacketCapture withFilters(List<PacketCaptureFilter> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureParameters();
        }
        this.innerProperties().withFilters(filters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model PacketCapture"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCapture.class);
}
