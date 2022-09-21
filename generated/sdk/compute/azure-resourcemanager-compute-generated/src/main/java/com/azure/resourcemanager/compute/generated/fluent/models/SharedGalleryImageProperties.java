// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.Architecture;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Describes the properties of a gallery image definition. */
@Fluent
public final class SharedGalleryImageProperties {
    /*
     * This property allows you to specify the type of the OS that is included in the disk when creating a VM from a
     * managed image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /*
     * This property allows the user to specify whether the virtual machines created under this image are 'Generalized'
     * or 'Specialized'.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /*
     * The end of life date of the gallery image definition. This property can be used for decommissioning purposes.
     * This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * This is the gallery image definition identifier.
     */
    @JsonProperty(value = "identifier", required = true)
    private GalleryImageIdentifier identifier;

    /*
     * The properties describe the recommended machine configuration for this Image Definition. These properties are
     * updatable.
     */
    @JsonProperty(value = "recommended")
    private RecommendedMachineConfiguration recommended;

    /*
     * Describes the disallowed disk types.
     */
    @JsonProperty(value = "disallowed")
    private Disallowed disallowed;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * A list of gallery image features.
     */
    @JsonProperty(value = "features")
    private List<GalleryImageFeature> features;

    /*
     * Describes the gallery image definition purchase plan. This is used by marketplace images.
     */
    @JsonProperty(value = "purchasePlan")
    private ImagePurchasePlan purchasePlan;

    /*
     * The architecture of the image. Applicable to OS disks only.
     */
    @JsonProperty(value = "architecture")
    private Architecture architecture;

    /** Creates an instance of SharedGalleryImageProperties class. */
    public SharedGalleryImageProperties() {
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @param osState the osState value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the identifier property: This is the gallery image definition identifier.
     *
     * @return the identifier value.
     */
    public GalleryImageIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: This is the gallery image definition identifier.
     *
     * @param identifier the identifier value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withIdentifier(GalleryImageIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @return the recommended value.
     */
    public RecommendedMachineConfiguration recommended() {
        return this.recommended;
    }

    /**
     * Set the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @param recommended the recommended value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withRecommended(RecommendedMachineConfiguration recommended) {
        this.recommended = recommended;
        return this;
    }

    /**
     * Get the disallowed property: Describes the disallowed disk types.
     *
     * @return the disallowed value.
     */
    public Disallowed disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed property: Describes the disallowed disk types.
     *
     * @param disallowed the disallowed value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withDisallowed(Disallowed disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the features property: A list of gallery image features.
     *
     * @return the features value.
     */
    public List<GalleryImageFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: A list of gallery image features.
     *
     * @param features the features value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withFeatures(List<GalleryImageFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @return the purchasePlan value.
     */
    public ImagePurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the architecture property: The architecture of the image. Applicable to OS disks only.
     *
     * @return the architecture value.
     */
    public Architecture architecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: The architecture of the image. Applicable to OS disks only.
     *
     * @param architecture the architecture value to set.
     * @return the SharedGalleryImageProperties object itself.
     */
    public SharedGalleryImageProperties withArchitecture(Architecture architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property osType in model SharedGalleryImageProperties"));
        }
        if (osState() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property osState in model SharedGalleryImageProperties"));
        }
        if (identifier() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property identifier in model SharedGalleryImageProperties"));
        } else {
            identifier().validate();
        }
        if (recommended() != null) {
            recommended().validate();
        }
        if (disallowed() != null) {
            disallowed().validate();
        }
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SharedGalleryImageProperties.class);
}
