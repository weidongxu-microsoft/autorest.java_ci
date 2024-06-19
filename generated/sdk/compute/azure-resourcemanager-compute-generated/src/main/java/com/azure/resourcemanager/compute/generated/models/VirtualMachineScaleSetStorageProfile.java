// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a virtual machine scale set storage profile.
 */
@Fluent
public final class VirtualMachineScaleSetStorageProfile
    implements JsonSerializable<VirtualMachineScaleSetStorageProfile> {
    /*
     * Specifies information about the image to use. You can specify information about platform images, marketplace
     * images, or virtual machine images. This element is required when you want to use a platform image, marketplace
     * image, or virtual machine image, but is not used in other creation operations.
     */
    private ImageReference imageReference;

    /*
     * Specifies information about the operating system disk used by the virtual machines in the scale set. For more
     * information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    private VirtualMachineScaleSetOSDisk osDisk;

    /*
     * Specifies the parameters that are used to add data disks to the virtual machines in the scale set. For more
     * information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    private List<VirtualMachineScaleSetDataDisk> dataDisks;

    /*
     * The diskControllerType property.
     */
    private String diskControllerType;

    /**
     * Creates an instance of VirtualMachineScaleSetStorageProfile class.
     */
    public VirtualMachineScaleSetStorageProfile() {
    }

    /**
     * Get the imageReference property: Specifies information about the image to use. You can specify information about
     * platform images, marketplace images, or virtual machine images. This element is required when you want to use a
     * platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: Specifies information about the image to use. You can specify information about
     * platform images, marketplace images, or virtual machine images. This element is required when you want to use a
     * platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     * @param imageReference the imageReference value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the osDisk property: Specifies information about the operating system disk used by the virtual machines in
     * the scale set. For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the osDisk value.
     */
    public VirtualMachineScaleSetOSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Specifies information about the operating system disk used by the virtual machines in
     * the scale set. For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withOsDisk(VirtualMachineScaleSetOSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: Specifies the parameters that are used to add data disks to the virtual machines in
     * the scale set. For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the dataDisks value.
     */
    public List<VirtualMachineScaleSetDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Specifies the parameters that are used to add data disks to the virtual machines in
     * the scale set. For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withDataDisks(List<VirtualMachineScaleSetDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the diskControllerType property: The diskControllerType property.
     * 
     * @return the diskControllerType value.
     */
    public String diskControllerType() {
        return this.diskControllerType;
    }

    /**
     * Set the diskControllerType property: The diskControllerType property.
     * 
     * @param diskControllerType the diskControllerType value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withDiskControllerType(String diskControllerType) {
        this.diskControllerType = diskControllerType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
        if (osDisk() != null) {
            osDisk().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("imageReference", this.imageReference);
        jsonWriter.writeJsonField("osDisk", this.osDisk);
        jsonWriter.writeArrayField("dataDisks", this.dataDisks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("diskControllerType", this.diskControllerType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetStorageProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetStorageProfile if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetStorageProfile.
     */
    public static VirtualMachineScaleSetStorageProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetStorageProfile deserializedVirtualMachineScaleSetStorageProfile
                = new VirtualMachineScaleSetStorageProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("imageReference".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetStorageProfile.imageReference = ImageReference.fromJson(reader);
                } else if ("osDisk".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetStorageProfile.osDisk
                        = VirtualMachineScaleSetOSDisk.fromJson(reader);
                } else if ("dataDisks".equals(fieldName)) {
                    List<VirtualMachineScaleSetDataDisk> dataDisks
                        = reader.readArray(reader1 -> VirtualMachineScaleSetDataDisk.fromJson(reader1));
                    deserializedVirtualMachineScaleSetStorageProfile.dataDisks = dataDisks;
                } else if ("diskControllerType".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetStorageProfile.diskControllerType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetStorageProfile;
        });
    }
}
