// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a Virtual Machine Scale Set VM Reimage Parameters.
 */
@Fluent
public class VirtualMachineScaleSetVMReimageParameters extends VirtualMachineReimageParameters {
    /*
     * Parameter to force update ephemeral OS disk for a virtual machine scale set VM
     */
    private Boolean forceUpdateOSDiskForEphemeral;

    /**
     * Creates an instance of VirtualMachineScaleSetVMReimageParameters class.
     */
    public VirtualMachineScaleSetVMReimageParameters() {
    }

    /**
     * Get the forceUpdateOSDiskForEphemeral property: Parameter to force update ephemeral OS disk for a virtual machine
     * scale set VM.
     * 
     * @return the forceUpdateOSDiskForEphemeral value.
     */
    public Boolean forceUpdateOSDiskForEphemeral() {
        return this.forceUpdateOSDiskForEphemeral;
    }

    /**
     * Set the forceUpdateOSDiskForEphemeral property: Parameter to force update ephemeral OS disk for a virtual machine
     * scale set VM.
     * 
     * @param forceUpdateOSDiskForEphemeral the forceUpdateOSDiskForEphemeral value to set.
     * @return the VirtualMachineScaleSetVMReimageParameters object itself.
     */
    public VirtualMachineScaleSetVMReimageParameters
        withForceUpdateOSDiskForEphemeral(Boolean forceUpdateOSDiskForEphemeral) {
        this.forceUpdateOSDiskForEphemeral = forceUpdateOSDiskForEphemeral;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetVMReimageParameters withTempDisk(Boolean tempDisk) {
        super.withTempDisk(tempDisk);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetVMReimageParameters withExactVersion(String exactVersion) {
        super.withExactVersion(exactVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetVMReimageParameters withOsProfile(OSProfileProvisioningData osProfile) {
        super.withOsProfile(osProfile);
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
        jsonWriter.writeBooleanField("tempDisk", tempDisk());
        jsonWriter.writeStringField("exactVersion", exactVersion());
        jsonWriter.writeJsonField("osProfile", osProfile());
        jsonWriter.writeBooleanField("forceUpdateOSDiskForEphemeral", this.forceUpdateOSDiskForEphemeral);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetVMReimageParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetVMReimageParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetVMReimageParameters.
     */
    public static VirtualMachineScaleSetVMReimageParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetVMReimageParameters deserializedVirtualMachineScaleSetVMReimageParameters
                = new VirtualMachineScaleSetVMReimageParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tempDisk".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMReimageParameters
                        .withTempDisk(reader.getNullable(JsonReader::getBoolean));
                } else if ("exactVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMReimageParameters.withExactVersion(reader.getString());
                } else if ("osProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMReimageParameters
                        .withOsProfile(OSProfileProvisioningData.fromJson(reader));
                } else if ("forceUpdateOSDiskForEphemeral".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMReimageParameters.forceUpdateOSDiskForEphemeral
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetVMReimageParameters;
        });
    }
}
