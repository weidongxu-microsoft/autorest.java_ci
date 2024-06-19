// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.generated.models.PacketCaptureMachineScope;
import com.azure.resourcemanager.network.generated.models.PacketCaptureSettings;
import com.azure.resourcemanager.network.generated.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.generated.models.PacketCaptureTargetType;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * The properties of a packet capture session.
 */
@Fluent
public final class PacketCaptureResultProperties extends PacketCaptureParameters {
    /*
     * The provisioning state of the packet capture session.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of PacketCaptureResultProperties class.
     */
    public PacketCaptureResultProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withScope(PacketCaptureMachineScope scope) {
        super.withScope(scope);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTargetType(PacketCaptureTargetType targetType) {
        super.withTargetType(targetType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        super.withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTotalBytesPerSession(Long totalBytesPerSession) {
        super.withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        super.withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        super.withStorageLocation(storageLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withFilters(List<PacketCaptureFilter> filters) {
        super.withFilters(filters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withContinuousCapture(Boolean continuousCapture) {
        super.withContinuousCapture(continuousCapture);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacketCaptureResultProperties withCaptureSettings(PacketCaptureSettings captureSettings) {
        super.withCaptureSettings(captureSettings);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("target", target());
        jsonWriter.writeJsonField("storageLocation", storageLocation());
        jsonWriter.writeJsonField("scope", scope());
        jsonWriter.writeStringField("targetType", targetType() == null ? null : targetType().toString());
        jsonWriter.writeNumberField("bytesToCapturePerPacket", bytesToCapturePerPacket());
        jsonWriter.writeNumberField("totalBytesPerSession", totalBytesPerSession());
        jsonWriter.writeNumberField("timeLimitInSeconds", timeLimitInSeconds());
        jsonWriter.writeArrayField("filters", filters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("continuousCapture", continuousCapture());
        jsonWriter.writeJsonField("captureSettings", captureSettings());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PacketCaptureResultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PacketCaptureResultProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PacketCaptureResultProperties.
     */
    public static PacketCaptureResultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PacketCaptureResultProperties deserializedPacketCaptureResultProperties
                = new PacketCaptureResultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("target".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties.withTarget(reader.getString());
                } else if ("storageLocation".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withStorageLocation(PacketCaptureStorageLocation.fromJson(reader));
                } else if ("scope".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties.withScope(PacketCaptureMachineScope.fromJson(reader));
                } else if ("targetType".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withTargetType(PacketCaptureTargetType.fromString(reader.getString()));
                } else if ("bytesToCapturePerPacket".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withBytesToCapturePerPacket(reader.getNullable(JsonReader::getLong));
                } else if ("totalBytesPerSession".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withTotalBytesPerSession(reader.getNullable(JsonReader::getLong));
                } else if ("timeLimitInSeconds".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withTimeLimitInSeconds(reader.getNullable(JsonReader::getInt));
                } else if ("filters".equals(fieldName)) {
                    List<PacketCaptureFilter> filters
                        = reader.readArray(reader1 -> PacketCaptureFilter.fromJson(reader1));
                    deserializedPacketCaptureResultProperties.withFilters(filters);
                } else if ("continuousCapture".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withContinuousCapture(reader.getNullable(JsonReader::getBoolean));
                } else if ("captureSettings".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties
                        .withCaptureSettings(PacketCaptureSettings.fromJson(reader));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPacketCaptureResultProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPacketCaptureResultProperties;
        });
    }
}
