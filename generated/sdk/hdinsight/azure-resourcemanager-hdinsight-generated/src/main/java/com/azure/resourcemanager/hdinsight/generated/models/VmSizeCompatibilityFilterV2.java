// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * This class represent a single filter object that defines a multidimensional set. The dimensions of this set are
 * Regions, ClusterFlavors, NodeTypes and ClusterVersions. The constraint should be defined based on the following:
 * FilterMode (Exclude vs Include), VMSizes (the vm sizes in affect of exclusion/inclusion) and the ordering of the
 * Filters. Later filters override previous settings if conflicted.
 */
@Fluent
public final class VmSizeCompatibilityFilterV2 implements JsonSerializable<VmSizeCompatibilityFilterV2> {
    /*
     * The filtering mode. Effectively this can enabling or disabling the VM sizes in a particular set.
     */
    private FilterMode filterMode;

    /*
     * The list of regions under the effect of the filter.
     */
    private List<String> regions;

    /*
     * The list of cluster flavors under the effect of the filter.
     */
    private List<String> clusterFlavors;

    /*
     * The list of node types affected by the filter.
     */
    private List<String> nodeTypes;

    /*
     * The list of cluster versions affected in Major.Minor format.
     */
    private List<String> clusterVersions;

    /*
     * The OSType affected, Windows or Linux.
     */
    private List<OSType> osType;

    /*
     * The list of virtual machine sizes to include or exclude.
     */
    private List<String> vmSizes;

    /*
     * Whether apply for ESP cluster. 'true' means only for ESP, 'false' means only for non-ESP, null or empty string or
     * others mean for both.
     */
    private String espApplied;

    /*
     * Whether support compute isolation. 'true' means only for ComputeIsolationEnabled, 'false' means only for regular
     * cluster.
     */
    private String computeIsolationSupported;

    /**
     * Creates an instance of VmSizeCompatibilityFilterV2 class.
     */
    public VmSizeCompatibilityFilterV2() {
    }

    /**
     * Get the filterMode property: The filtering mode. Effectively this can enabling or disabling the VM sizes in a
     * particular set.
     * 
     * @return the filterMode value.
     */
    public FilterMode filterMode() {
        return this.filterMode;
    }

    /**
     * Set the filterMode property: The filtering mode. Effectively this can enabling or disabling the VM sizes in a
     * particular set.
     * 
     * @param filterMode the filterMode value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withFilterMode(FilterMode filterMode) {
        this.filterMode = filterMode;
        return this;
    }

    /**
     * Get the regions property: The list of regions under the effect of the filter.
     * 
     * @return the regions value.
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The list of regions under the effect of the filter.
     * 
     * @param regions the regions value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the clusterFlavors property: The list of cluster flavors under the effect of the filter.
     * 
     * @return the clusterFlavors value.
     */
    public List<String> clusterFlavors() {
        return this.clusterFlavors;
    }

    /**
     * Set the clusterFlavors property: The list of cluster flavors under the effect of the filter.
     * 
     * @param clusterFlavors the clusterFlavors value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withClusterFlavors(List<String> clusterFlavors) {
        this.clusterFlavors = clusterFlavors;
        return this;
    }

    /**
     * Get the nodeTypes property: The list of node types affected by the filter.
     * 
     * @return the nodeTypes value.
     */
    public List<String> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the nodeTypes property: The list of node types affected by the filter.
     * 
     * @param nodeTypes the nodeTypes value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withNodeTypes(List<String> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the clusterVersions property: The list of cluster versions affected in Major.Minor format.
     * 
     * @return the clusterVersions value.
     */
    public List<String> clusterVersions() {
        return this.clusterVersions;
    }

    /**
     * Set the clusterVersions property: The list of cluster versions affected in Major.Minor format.
     * 
     * @param clusterVersions the clusterVersions value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withClusterVersions(List<String> clusterVersions) {
        this.clusterVersions = clusterVersions;
        return this;
    }

    /**
     * Get the osType property: The OSType affected, Windows or Linux.
     * 
     * @return the osType value.
     */
    public List<OSType> osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The OSType affected, Windows or Linux.
     * 
     * @param osType the osType value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withOsType(List<OSType> osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the vmSizes property: The list of virtual machine sizes to include or exclude.
     * 
     * @return the vmSizes value.
     */
    public List<String> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: The list of virtual machine sizes to include or exclude.
     * 
     * @param vmSizes the vmSizes value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withVmSizes(List<String> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Get the espApplied property: Whether apply for ESP cluster. 'true' means only for ESP, 'false' means only for
     * non-ESP, null or empty string or others mean for both.
     * 
     * @return the espApplied value.
     */
    public String espApplied() {
        return this.espApplied;
    }

    /**
     * Set the espApplied property: Whether apply for ESP cluster. 'true' means only for ESP, 'false' means only for
     * non-ESP, null or empty string or others mean for both.
     * 
     * @param espApplied the espApplied value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withEspApplied(String espApplied) {
        this.espApplied = espApplied;
        return this;
    }

    /**
     * Get the computeIsolationSupported property: Whether support compute isolation. 'true' means only for
     * ComputeIsolationEnabled, 'false' means only for regular cluster.
     * 
     * @return the computeIsolationSupported value.
     */
    public String computeIsolationSupported() {
        return this.computeIsolationSupported;
    }

    /**
     * Set the computeIsolationSupported property: Whether support compute isolation. 'true' means only for
     * ComputeIsolationEnabled, 'false' means only for regular cluster.
     * 
     * @param computeIsolationSupported the computeIsolationSupported value to set.
     * @return the VmSizeCompatibilityFilterV2 object itself.
     */
    public VmSizeCompatibilityFilterV2 withComputeIsolationSupported(String computeIsolationSupported) {
        this.computeIsolationSupported = computeIsolationSupported;
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
        jsonWriter.writeStringField("filterMode", this.filterMode == null ? null : this.filterMode.toString());
        jsonWriter.writeArrayField("regions", this.regions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("clusterFlavors", this.clusterFlavors,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("nodeTypes", this.nodeTypes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("clusterVersions", this.clusterVersions,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("osType", this.osType,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("vmSizes", this.vmSizes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("espApplied", this.espApplied);
        jsonWriter.writeStringField("computeIsolationSupported", this.computeIsolationSupported);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VmSizeCompatibilityFilterV2 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VmSizeCompatibilityFilterV2 if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VmSizeCompatibilityFilterV2.
     */
    public static VmSizeCompatibilityFilterV2 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VmSizeCompatibilityFilterV2 deserializedVmSizeCompatibilityFilterV2 = new VmSizeCompatibilityFilterV2();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filterMode".equals(fieldName)) {
                    deserializedVmSizeCompatibilityFilterV2.filterMode = FilterMode.fromString(reader.getString());
                } else if ("regions".equals(fieldName)) {
                    List<String> regions = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmSizeCompatibilityFilterV2.regions = regions;
                } else if ("clusterFlavors".equals(fieldName)) {
                    List<String> clusterFlavors = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmSizeCompatibilityFilterV2.clusterFlavors = clusterFlavors;
                } else if ("nodeTypes".equals(fieldName)) {
                    List<String> nodeTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmSizeCompatibilityFilterV2.nodeTypes = nodeTypes;
                } else if ("clusterVersions".equals(fieldName)) {
                    List<String> clusterVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmSizeCompatibilityFilterV2.clusterVersions = clusterVersions;
                } else if ("osType".equals(fieldName)) {
                    List<OSType> osType = reader.readArray(reader1 -> OSType.fromString(reader1.getString()));
                    deserializedVmSizeCompatibilityFilterV2.osType = osType;
                } else if ("vmSizes".equals(fieldName)) {
                    List<String> vmSizes = reader.readArray(reader1 -> reader1.getString());
                    deserializedVmSizeCompatibilityFilterV2.vmSizes = vmSizes;
                } else if ("espApplied".equals(fieldName)) {
                    deserializedVmSizeCompatibilityFilterV2.espApplied = reader.getString();
                } else if ("computeIsolationSupported".equals(fieldName)) {
                    deserializedVmSizeCompatibilityFilterV2.computeIsolationSupported = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVmSizeCompatibilityFilterV2;
        });
    }
}
