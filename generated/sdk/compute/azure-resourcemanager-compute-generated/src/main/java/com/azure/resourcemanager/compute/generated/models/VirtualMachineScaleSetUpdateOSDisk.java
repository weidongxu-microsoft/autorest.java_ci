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
 * Describes virtual machine scale set operating system disk Update Object. This should be used for Updating VMSS OS
 * Disk.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateOSDisk implements JsonSerializable<VirtualMachineScaleSetUpdateOSDisk> {
    /*
     * The caching type.
     */
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     */
    private DiffDiskSettings diffDiskSettings;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk
     * in a virtual machine image. <br><br> diskSizeGB is the number of bytes x 1024^3 for the disk and the value cannot
     * be larger than 1023
     */
    private Integer diskSizeGB;

    /*
     * The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using it to attach to the
     * Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not exist.
     */
    private VirtualHardDisk image;

    /*
     * The list of virtual hard disk container uris.
     */
    private List<String> vhdContainers;

    /*
     * The managed disk parameters.
     */
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /*
     * Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion (This feature is available for
     * VMSS with Flexible OrchestrationMode only). <br><br> Possible values: <br><br> **Delete** If this value is used,
     * the OS disk is deleted when VMSS Flex VM is deleted.<br><br> **Detach** If this value is used, the OS disk is
     * retained after VMSS Flex VM is deleted. <br><br> The default value is set to **Delete**. For an Ephemeral OS
     * Disk, the default value is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     */
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Creates an instance of VirtualMachineScaleSetUpdateOSDisk class.
     */
    public VirtualMachineScaleSetUpdateOSDisk() {
    }

    /**
     * Get the caching property: The caching type.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: The caching type.
     * 
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the diffDiskSettings property: Specifies the ephemeral disk Settings for the operating system disk used by
     * the virtual machine scale set.
     * 
     * @return the diffDiskSettings value.
     */
    public DiffDiskSettings diffDiskSettings() {
        return this.diffDiskSettings;
    }

    /**
     * Set the diffDiskSettings property: Specifies the ephemeral disk Settings for the operating system disk used by
     * the virtual machine scale set.
     * 
     * @param diffDiskSettings the diffDiskSettings value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDiffDiskSettings(DiffDiskSettings diffDiskSettings) {
        this.diffDiskSettings = diffDiskSettings;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; diskSizeGB is the number of bytes
     * x 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; diskSizeGB is the number of bytes
     * x 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the image property: The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using
     * it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not
     * exist.
     * 
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: The Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using
     * it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not
     * exist.
     * 
     * @param image the image value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the vhdContainers property: The list of virtual hard disk container uris.
     * 
     * @return the vhdContainers value.
     */
    public List<String> vhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the vhdContainers property: The list of virtual hard disk container uris.
     * 
     * @param vhdContainers the vhdContainers value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     * 
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default value
     * is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     * 
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VMSS Flex deletion
     * (This feature is available for VMSS with Flexible OrchestrationMode only). &lt;br&gt;&lt;br&gt; Possible values:
     * &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the OS disk is deleted when VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the OS disk is retained after VMSS Flex VM is
     * deleted. &lt;br&gt;&lt;br&gt; The default value is set to **Delete**. For an Ephemeral OS Disk, the default value
     * is set to **Delete**. User cannot change the delete option for Ephemeral OS Disk.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diffDiskSettings() != null) {
            diffDiskSettings().validate();
        }
        if (image() != null) {
            image().validate();
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("caching", this.caching == null ? null : this.caching.toString());
        jsonWriter.writeBooleanField("writeAcceleratorEnabled", this.writeAcceleratorEnabled);
        jsonWriter.writeJsonField("diffDiskSettings", this.diffDiskSettings);
        jsonWriter.writeNumberField("diskSizeGB", this.diskSizeGB);
        jsonWriter.writeJsonField("image", this.image);
        jsonWriter.writeArrayField("vhdContainers", this.vhdContainers,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("managedDisk", this.managedDisk);
        jsonWriter.writeStringField("deleteOption", this.deleteOption == null ? null : this.deleteOption.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetUpdateOSDisk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetUpdateOSDisk if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetUpdateOSDisk.
     */
    public static VirtualMachineScaleSetUpdateOSDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetUpdateOSDisk deserializedVirtualMachineScaleSetUpdateOSDisk
                = new VirtualMachineScaleSetUpdateOSDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("caching".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.caching
                        = CachingTypes.fromString(reader.getString());
                } else if ("writeAcceleratorEnabled".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.writeAcceleratorEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("diffDiskSettings".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.diffDiskSettings = DiffDiskSettings.fromJson(reader);
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("image".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.image = VirtualHardDisk.fromJson(reader);
                } else if ("vhdContainers".equals(fieldName)) {
                    List<String> vhdContainers = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualMachineScaleSetUpdateOSDisk.vhdContainers = vhdContainers;
                } else if ("managedDisk".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.managedDisk
                        = VirtualMachineScaleSetManagedDiskParameters.fromJson(reader);
                } else if ("deleteOption".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetUpdateOSDisk.deleteOption
                        = DiskDeleteOptionTypes.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetUpdateOSDisk;
        });
    }
}
