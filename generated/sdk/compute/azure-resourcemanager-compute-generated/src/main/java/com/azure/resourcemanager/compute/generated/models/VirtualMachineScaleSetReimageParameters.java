// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a Virtual Machine Scale Set VM Reimage Parameters.
 */
@Fluent
public final class VirtualMachineScaleSetReimageParameters extends VirtualMachineScaleSetVMReimageParameters {
    /*
     * The virtual machine scale set instance ids. Omitting the virtual machine scale set instance ids will result in
     * the operation being performed on all virtual machines in the virtual machine scale set.
     */
    private List<String> instanceIds;

    /**
     * Creates an instance of VirtualMachineScaleSetReimageParameters class.
     */
    public VirtualMachineScaleSetReimageParameters() {
    }

    /**
     * Get the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     * 
     * @return the instanceIds value.
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     * 
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetReimageParameters object itself.
     */
    public VirtualMachineScaleSetReimageParameters withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters
        withForceUpdateOSDiskForEphemeral(Boolean forceUpdateOSDiskForEphemeral) {
        super.withForceUpdateOSDiskForEphemeral(forceUpdateOSDiskForEphemeral);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withTempDisk(Boolean tempDisk) {
        super.withTempDisk(tempDisk);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withExactVersion(String exactVersion) {
        super.withExactVersion(exactVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withOsProfile(OSProfileProvisioningData osProfile) {
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
        jsonWriter.writeBooleanField("forceUpdateOSDiskForEphemeral", forceUpdateOSDiskForEphemeral());
        jsonWriter.writeArrayField("instanceIds", this.instanceIds, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetReimageParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetReimageParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetReimageParameters.
     */
    public static VirtualMachineScaleSetReimageParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetReimageParameters deserializedVirtualMachineScaleSetReimageParameters
                = new VirtualMachineScaleSetReimageParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tempDisk".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetReimageParameters
                        .withTempDisk(reader.getNullable(JsonReader::getBoolean));
                } else if ("exactVersion".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetReimageParameters.withExactVersion(reader.getString());
                } else if ("osProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetReimageParameters
                        .withOsProfile(OSProfileProvisioningData.fromJson(reader));
                } else if ("forceUpdateOSDiskForEphemeral".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetReimageParameters
                        .withForceUpdateOSDiskForEphemeral(reader.getNullable(JsonReader::getBoolean));
                } else if ("instanceIds".equals(fieldName)) {
                    List<String> instanceIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualMachineScaleSetReimageParameters.instanceIds = instanceIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetReimageParameters;
        });
    }
}
