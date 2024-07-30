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
 * Specifies the sku profile for the virtual machine scale set. With this property the customer is able to specify a
 * list of VM sizes and an allocation strategy.
 */
@Fluent
public final class SkuProfile implements JsonSerializable<SkuProfile> {
    /*
     * Specifies the VM sizes for the virtual machine scale set.
     */
    private List<SkuProfileVMSize> vmSizes;

    /*
     * Specifies the allocation strategy for the virtual machine scale set based on which the VMs will be allocated.
     */
    private AllocationStrategy allocationStrategy;

    /**
     * Creates an instance of SkuProfile class.
     */
    public SkuProfile() {
    }

    /**
     * Get the vmSizes property: Specifies the VM sizes for the virtual machine scale set.
     * 
     * @return the vmSizes value.
     */
    public List<SkuProfileVMSize> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: Specifies the VM sizes for the virtual machine scale set.
     * 
     * @param vmSizes the vmSizes value to set.
     * @return the SkuProfile object itself.
     */
    public SkuProfile withVmSizes(List<SkuProfileVMSize> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Get the allocationStrategy property: Specifies the allocation strategy for the virtual machine scale set based on
     * which the VMs will be allocated.
     * 
     * @return the allocationStrategy value.
     */
    public AllocationStrategy allocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * Set the allocationStrategy property: Specifies the allocation strategy for the virtual machine scale set based on
     * which the VMs will be allocated.
     * 
     * @param allocationStrategy the allocationStrategy value to set.
     * @return the SkuProfile object itself.
     */
    public SkuProfile withAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSizes() != null) {
            vmSizes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("vmSizes", this.vmSizes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("allocationStrategy",
            this.allocationStrategy == null ? null : this.allocationStrategy.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SkuProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkuProfile if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SkuProfile.
     */
    public static SkuProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkuProfile deserializedSkuProfile = new SkuProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmSizes".equals(fieldName)) {
                    List<SkuProfileVMSize> vmSizes = reader.readArray(reader1 -> SkuProfileVMSize.fromJson(reader1));
                    deserializedSkuProfile.vmSizes = vmSizes;
                } else if ("allocationStrategy".equals(fieldName)) {
                    deserializedSkuProfile.allocationStrategy = AllocationStrategy.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkuProfile;
        });
    }
}
