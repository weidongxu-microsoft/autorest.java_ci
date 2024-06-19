// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * NUMA node data.
 */
@Fluent
public final class NumaNodeData implements JsonSerializable<NumaNodeData> {
    /*
     * The NUMA node index.
     */
    private Integer numaNodeIndex;

    /*
     * The total memory on the NUMA node.
     */
    private Long totalMemoryInMb;

    /*
     * The logical cores per core count.
     */
    private Integer logicalCoreCountPerCore;

    /*
     * The effective available memory on the NUMA node in MB.
     */
    private Long effectiveAvailableMemoryInMb;

    /*
     * The free VCPU indices for the Hpn VMs.
     */
    private List<Integer> freeVCpuIndexesForHpn;

    /*
     * The VCPU indices for Hpn VMs
     */
    private List<Integer> vCpuIndexesForHpn;

    /*
     * The VCPU indices for the root.
     */
    private List<Integer> vCpuIndexesForRoot;

    /**
     * Creates an instance of NumaNodeData class.
     */
    public NumaNodeData() {
    }

    /**
     * Get the numaNodeIndex property: The NUMA node index.
     * 
     * @return the numaNodeIndex value.
     */
    public Integer numaNodeIndex() {
        return this.numaNodeIndex;
    }

    /**
     * Set the numaNodeIndex property: The NUMA node index.
     * 
     * @param numaNodeIndex the numaNodeIndex value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withNumaNodeIndex(Integer numaNodeIndex) {
        this.numaNodeIndex = numaNodeIndex;
        return this;
    }

    /**
     * Get the totalMemoryInMb property: The total memory on the NUMA node.
     * 
     * @return the totalMemoryInMb value.
     */
    public Long totalMemoryInMb() {
        return this.totalMemoryInMb;
    }

    /**
     * Set the totalMemoryInMb property: The total memory on the NUMA node.
     * 
     * @param totalMemoryInMb the totalMemoryInMb value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withTotalMemoryInMb(Long totalMemoryInMb) {
        this.totalMemoryInMb = totalMemoryInMb;
        return this;
    }

    /**
     * Get the logicalCoreCountPerCore property: The logical cores per core count.
     * 
     * @return the logicalCoreCountPerCore value.
     */
    public Integer logicalCoreCountPerCore() {
        return this.logicalCoreCountPerCore;
    }

    /**
     * Set the logicalCoreCountPerCore property: The logical cores per core count.
     * 
     * @param logicalCoreCountPerCore the logicalCoreCountPerCore value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withLogicalCoreCountPerCore(Integer logicalCoreCountPerCore) {
        this.logicalCoreCountPerCore = logicalCoreCountPerCore;
        return this;
    }

    /**
     * Get the effectiveAvailableMemoryInMb property: The effective available memory on the NUMA node in MB.
     * 
     * @return the effectiveAvailableMemoryInMb value.
     */
    public Long effectiveAvailableMemoryInMb() {
        return this.effectiveAvailableMemoryInMb;
    }

    /**
     * Set the effectiveAvailableMemoryInMb property: The effective available memory on the NUMA node in MB.
     * 
     * @param effectiveAvailableMemoryInMb the effectiveAvailableMemoryInMb value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withEffectiveAvailableMemoryInMb(Long effectiveAvailableMemoryInMb) {
        this.effectiveAvailableMemoryInMb = effectiveAvailableMemoryInMb;
        return this;
    }

    /**
     * Get the freeVCpuIndexesForHpn property: The free VCPU indices for the Hpn VMs.
     * 
     * @return the freeVCpuIndexesForHpn value.
     */
    public List<Integer> freeVCpuIndexesForHpn() {
        return this.freeVCpuIndexesForHpn;
    }

    /**
     * Set the freeVCpuIndexesForHpn property: The free VCPU indices for the Hpn VMs.
     * 
     * @param freeVCpuIndexesForHpn the freeVCpuIndexesForHpn value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withFreeVCpuIndexesForHpn(List<Integer> freeVCpuIndexesForHpn) {
        this.freeVCpuIndexesForHpn = freeVCpuIndexesForHpn;
        return this;
    }

    /**
     * Get the vCpuIndexesForHpn property: The VCPU indices for Hpn VMs.
     * 
     * @return the vCpuIndexesForHpn value.
     */
    public List<Integer> vCpuIndexesForHpn() {
        return this.vCpuIndexesForHpn;
    }

    /**
     * Set the vCpuIndexesForHpn property: The VCPU indices for Hpn VMs.
     * 
     * @param vCpuIndexesForHpn the vCpuIndexesForHpn value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withVCpuIndexesForHpn(List<Integer> vCpuIndexesForHpn) {
        this.vCpuIndexesForHpn = vCpuIndexesForHpn;
        return this;
    }

    /**
     * Get the vCpuIndexesForRoot property: The VCPU indices for the root.
     * 
     * @return the vCpuIndexesForRoot value.
     */
    public List<Integer> vCpuIndexesForRoot() {
        return this.vCpuIndexesForRoot;
    }

    /**
     * Set the vCpuIndexesForRoot property: The VCPU indices for the root.
     * 
     * @param vCpuIndexesForRoot the vCpuIndexesForRoot value to set.
     * @return the NumaNodeData object itself.
     */
    public NumaNodeData withVCpuIndexesForRoot(List<Integer> vCpuIndexesForRoot) {
        this.vCpuIndexesForRoot = vCpuIndexesForRoot;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("numaNodeIndex", this.numaNodeIndex);
        jsonWriter.writeNumberField("totalMemoryInMb", this.totalMemoryInMb);
        jsonWriter.writeNumberField("logicalCoreCountPerCore", this.logicalCoreCountPerCore);
        jsonWriter.writeNumberField("effectiveAvailableMemoryInMb", this.effectiveAvailableMemoryInMb);
        jsonWriter.writeArrayField("freeVCpuIndexesForHpn", this.freeVCpuIndexesForHpn,
            (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("vCpuIndexesForHpn", this.vCpuIndexesForHpn,
            (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("vCpuIndexesForRoot", this.vCpuIndexesForRoot,
            (writer, element) -> writer.writeInt(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NumaNodeData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NumaNodeData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NumaNodeData.
     */
    public static NumaNodeData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NumaNodeData deserializedNumaNodeData = new NumaNodeData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("numaNodeIndex".equals(fieldName)) {
                    deserializedNumaNodeData.numaNodeIndex = reader.getNullable(JsonReader::getInt);
                } else if ("totalMemoryInMb".equals(fieldName)) {
                    deserializedNumaNodeData.totalMemoryInMb = reader.getNullable(JsonReader::getLong);
                } else if ("logicalCoreCountPerCore".equals(fieldName)) {
                    deserializedNumaNodeData.logicalCoreCountPerCore = reader.getNullable(JsonReader::getInt);
                } else if ("effectiveAvailableMemoryInMb".equals(fieldName)) {
                    deserializedNumaNodeData.effectiveAvailableMemoryInMb = reader.getNullable(JsonReader::getLong);
                } else if ("freeVCpuIndexesForHpn".equals(fieldName)) {
                    List<Integer> freeVCpuIndexesForHpn = reader.readArray(reader1 -> reader1.getInt());
                    deserializedNumaNodeData.freeVCpuIndexesForHpn = freeVCpuIndexesForHpn;
                } else if ("vCpuIndexesForHpn".equals(fieldName)) {
                    List<Integer> vCpuIndexesForHpn = reader.readArray(reader1 -> reader1.getInt());
                    deserializedNumaNodeData.vCpuIndexesForHpn = vCpuIndexesForHpn;
                } else if ("vCpuIndexesForRoot".equals(fieldName)) {
                    List<Integer> vCpuIndexesForRoot = reader.readArray(reader1 -> reader1.getInt());
                    deserializedNumaNodeData.vCpuIndexesForRoot = vCpuIndexesForRoot;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNumaNodeData;
        });
    }
}
