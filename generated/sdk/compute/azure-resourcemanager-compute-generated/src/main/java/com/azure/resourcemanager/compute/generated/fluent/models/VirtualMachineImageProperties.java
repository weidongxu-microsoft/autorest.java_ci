// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.ArchitectureTypes;
import com.azure.resourcemanager.compute.generated.models.AutomaticOSUpgradeProperties;
import com.azure.resourcemanager.compute.generated.models.DataDiskImage;
import com.azure.resourcemanager.compute.generated.models.DisallowedConfiguration;
import com.azure.resourcemanager.compute.generated.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.generated.models.ImageDeprecationStatus;
import com.azure.resourcemanager.compute.generated.models.OSDiskImage;
import com.azure.resourcemanager.compute.generated.models.PurchasePlan;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImageFeature;
import java.io.IOException;
import java.util.List;

/**
 * Describes the properties of a Virtual Machine Image.
 */
@Fluent
public final class VirtualMachineImageProperties implements JsonSerializable<VirtualMachineImageProperties> {
    /*
     * Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     */
    private PurchasePlan plan;

    /*
     * Contains the os disk image information.
     */
    private OSDiskImage osDiskImage;

    /*
     * The dataDiskImages property.
     */
    private List<DataDiskImage> dataDiskImages;

    /*
     * Describes automatic OS upgrade properties on the image.
     */
    private AutomaticOSUpgradeProperties automaticOSUpgradeProperties;

    /*
     * Specifies the HyperVGeneration Type
     */
    private HyperVGenerationTypes hyperVGeneration;

    /*
     * Specifies disallowed configuration for the VirtualMachine created from the image
     */
    private DisallowedConfiguration disallowed;

    /*
     * The features property.
     */
    private List<VirtualMachineImageFeature> features;

    /*
     * Specifies the Architecture Type
     */
    private ArchitectureTypes architecture;

    /*
     * Describes image deprecation status properties on the image.
     */
    private ImageDeprecationStatus imageDeprecationStatus;

    /**
     * Creates an instance of VirtualMachineImageProperties class.
     */
    public VirtualMachineImageProperties() {
    }

    /**
     * Get the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     * 
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     * 
     * @param plan the plan value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withPlan(PurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the osDiskImage property: Contains the os disk image information.
     * 
     * @return the osDiskImage value.
     */
    public OSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: Contains the os disk image information.
     * 
     * @param osDiskImage the osDiskImage value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withOsDiskImage(OSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: The dataDiskImages property.
     * 
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: The dataDiskImages property.
     * 
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withDataDiskImages(List<DataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Get the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     * 
     * @return the automaticOSUpgradeProperties value.
     */
    public AutomaticOSUpgradeProperties automaticOSUpgradeProperties() {
        return this.automaticOSUpgradeProperties;
    }

    /**
     * Set the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     * 
     * @param automaticOSUpgradeProperties the automaticOSUpgradeProperties value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties
        withAutomaticOSUpgradeProperties(AutomaticOSUpgradeProperties automaticOSUpgradeProperties) {
        this.automaticOSUpgradeProperties = automaticOSUpgradeProperties;
        return this;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGeneration Type.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGeneration Type.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     * 
     * @return the disallowed value.
     */
    public DisallowedConfiguration disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     * 
     * @param disallowed the disallowed value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withDisallowed(DisallowedConfiguration disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the features property: The features property.
     * 
     * @return the features value.
     */
    public List<VirtualMachineImageFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: The features property.
     * 
     * @param features the features value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withFeatures(List<VirtualMachineImageFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the architecture property: Specifies the Architecture Type.
     * 
     * @return the architecture value.
     */
    public ArchitectureTypes architecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: Specifies the Architecture Type.
     * 
     * @param architecture the architecture value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withArchitecture(ArchitectureTypes architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get the imageDeprecationStatus property: Describes image deprecation status properties on the image.
     * 
     * @return the imageDeprecationStatus value.
     */
    public ImageDeprecationStatus imageDeprecationStatus() {
        return this.imageDeprecationStatus;
    }

    /**
     * Set the imageDeprecationStatus property: Describes image deprecation status properties on the image.
     * 
     * @param imageDeprecationStatus the imageDeprecationStatus value to set.
     * @return the VirtualMachineImageProperties object itself.
     */
    public VirtualMachineImageProperties withImageDeprecationStatus(ImageDeprecationStatus imageDeprecationStatus) {
        this.imageDeprecationStatus = imageDeprecationStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
        if (automaticOSUpgradeProperties() != null) {
            automaticOSUpgradeProperties().validate();
        }
        if (disallowed() != null) {
            disallowed().validate();
        }
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
        if (imageDeprecationStatus() != null) {
            imageDeprecationStatus().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("plan", this.plan);
        jsonWriter.writeJsonField("osDiskImage", this.osDiskImage);
        jsonWriter.writeArrayField("dataDiskImages", this.dataDiskImages,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("automaticOSUpgradeProperties", this.automaticOSUpgradeProperties);
        jsonWriter.writeStringField("hyperVGeneration",
            this.hyperVGeneration == null ? null : this.hyperVGeneration.toString());
        jsonWriter.writeJsonField("disallowed", this.disallowed);
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("architecture", this.architecture == null ? null : this.architecture.toString());
        jsonWriter.writeJsonField("imageDeprecationStatus", this.imageDeprecationStatus);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineImageProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineImageProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineImageProperties.
     */
    public static VirtualMachineImageProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineImageProperties deserializedVirtualMachineImageProperties
                = new VirtualMachineImageProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("plan".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.plan = PurchasePlan.fromJson(reader);
                } else if ("osDiskImage".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.osDiskImage = OSDiskImage.fromJson(reader);
                } else if ("dataDiskImages".equals(fieldName)) {
                    List<DataDiskImage> dataDiskImages = reader.readArray(reader1 -> DataDiskImage.fromJson(reader1));
                    deserializedVirtualMachineImageProperties.dataDiskImages = dataDiskImages;
                } else if ("automaticOSUpgradeProperties".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.automaticOSUpgradeProperties
                        = AutomaticOSUpgradeProperties.fromJson(reader);
                } else if ("hyperVGeneration".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.hyperVGeneration
                        = HyperVGenerationTypes.fromString(reader.getString());
                } else if ("disallowed".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.disallowed = DisallowedConfiguration.fromJson(reader);
                } else if ("features".equals(fieldName)) {
                    List<VirtualMachineImageFeature> features
                        = reader.readArray(reader1 -> VirtualMachineImageFeature.fromJson(reader1));
                    deserializedVirtualMachineImageProperties.features = features;
                } else if ("architecture".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.architecture
                        = ArchitectureTypes.fromString(reader.getString());
                } else if ("imageDeprecationStatus".equals(fieldName)) {
                    deserializedVirtualMachineImageProperties.imageDeprecationStatus
                        = ImageDeprecationStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineImageProperties;
        });
    }
}
