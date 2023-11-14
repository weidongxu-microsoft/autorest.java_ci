// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.Architecture;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PirCommunityGalleryResource;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Specifies information about the gallery image definition that you want to create or update.
 */
@Fluent
public final class CommunityGalleryImageInner extends PirCommunityGalleryResource {
    /*
     * Describes the properties of a gallery image definition.
     */
    @JsonProperty(value = "properties")
    private CommunityGalleryImageProperties innerProperties;

    /**
     * Creates an instance of CommunityGalleryImageInner class.
     */
    public CommunityGalleryImageInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a gallery image definition.
     * 
     * @return the innerProperties value.
     */
    private CommunityGalleryImageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommunityGalleryImageInner withUniqueId(String uniqueId) {
        super.withUniqueId(uniqueId);
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk
     * when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk
     * when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     * 
     * @param osType the osType value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     * 
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.innerProperties() == null ? null : this.innerProperties().osState();
    }

    /**
     * Set the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     * 
     * @param osState the osState value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withOsState(OperatingSystemStateTypes osState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withOsState(osState);
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endOfLifeDate();
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /**
     * Get the identifier property: This is the community gallery image definition identifier.
     * 
     * @return the identifier value.
     */
    public CommunityGalleryImageIdentifier identifier() {
        return this.innerProperties() == null ? null : this.innerProperties().identifier();
    }

    /**
     * Set the identifier property: This is the community gallery image definition identifier.
     * 
     * @param identifier the identifier value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withIdentifier(CommunityGalleryImageIdentifier identifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withIdentifier(identifier);
        return this;
    }

    /**
     * Get the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     * 
     * @return the recommended value.
     */
    public RecommendedMachineConfiguration recommended() {
        return this.innerProperties() == null ? null : this.innerProperties().recommended();
    }

    /**
     * Set the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     * 
     * @param recommended the recommended value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withRecommended(RecommendedMachineConfiguration recommended) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withRecommended(recommended);
        return this;
    }

    /**
     * Get the disallowed property: Describes the disallowed disk types.
     * 
     * @return the disallowed value.
     */
    public Disallowed disallowed() {
        return this.innerProperties() == null ? null : this.innerProperties().disallowed();
    }

    /**
     * Set the disallowed property: Describes the disallowed disk types.
     * 
     * @param disallowed the disallowed value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withDisallowed(Disallowed disallowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withDisallowed(disallowed);
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the features property: A list of gallery image features.
     * 
     * @return the features value.
     */
    public List<GalleryImageFeature> features() {
        return this.innerProperties() == null ? null : this.innerProperties().features();
    }

    /**
     * Set the features property: A list of gallery image features.
     * 
     * @param features the features value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withFeatures(List<GalleryImageFeature> features) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withFeatures(features);
        return this;
    }

    /**
     * Get the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     * 
     * @return the purchasePlan value.
     */
    public ImagePurchasePlan purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     * 
     * @param purchasePlan the purchasePlan value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withPurchasePlan(ImagePurchasePlan purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the architecture property: The architecture of the image. Applicable to OS disks only.
     * 
     * @return the architecture value.
     */
    public Architecture architecture() {
        return this.innerProperties() == null ? null : this.innerProperties().architecture();
    }

    /**
     * Set the architecture property: The architecture of the image. Applicable to OS disks only.
     * 
     * @param architecture the architecture value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withArchitecture(Architecture architecture) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withArchitecture(architecture);
        return this;
    }

    /**
     * Get the privacyStatementUri property: Privacy statement uri for the current community gallery image.
     * 
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.innerProperties() == null ? null : this.innerProperties().privacyStatementUri();
    }

    /**
     * Set the privacyStatementUri property: Privacy statement uri for the current community gallery image.
     * 
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withPrivacyStatementUri(String privacyStatementUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    /**
     * Get the eula property: End-user license agreement for the current community gallery image.
     * 
     * @return the eula value.
     */
    public String eula() {
        return this.innerProperties() == null ? null : this.innerProperties().eula();
    }

    /**
     * Set the eula property: End-user license agreement for the current community gallery image.
     * 
     * @param eula the eula value to set.
     * @return the CommunityGalleryImageInner object itself.
     */
    public CommunityGalleryImageInner withEula(String eula) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageProperties();
        }
        this.innerProperties().withEula(eula);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
