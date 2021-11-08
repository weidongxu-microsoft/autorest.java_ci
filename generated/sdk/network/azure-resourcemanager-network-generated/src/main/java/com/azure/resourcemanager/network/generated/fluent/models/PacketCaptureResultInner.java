// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.generated.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about packet capture session. */
@Fluent
public final class PacketCaptureResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCaptureResultInner.class);

    /*
     * Name of the packet capture session.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * ID of the packet capture operation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of the packet capture result.
     */
    @JsonProperty(value = "properties")
    private PacketCaptureResultProperties innerProperties;

    /**
     * Get the name property: Name of the packet capture session.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: ID of the packet capture operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the packet capture result.
     *
     * @return the innerProperties value.
     */
    private PacketCaptureResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTarget(String target) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTotalBytesPerSession(Long totalBytesPerSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withFilters(List<PacketCaptureFilter> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCaptureResultProperties();
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
