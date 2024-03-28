// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the required information to reference a compute gallery application version.
 */
@Fluent
public final class VMGalleryApplication {
    /*
     * Optional, Specifies a passthrough value for more generic context.
     */
    @JsonProperty(value = "tags")
    private String tags;

    /*
     * Optional, Specifies the order in which the packages have to be installed
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * Specifies the GalleryApplicationVersion resource id on the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{application}/versions/{version}
     */
    @JsonProperty(value = "packageReferenceId", required = true)
    private String packageReferenceId;

    /*
     * Optional, Specifies the uri to an azure blob that will replace the default configuration for the package if provided
     */
    @JsonProperty(value = "configurationReference")
    private String configurationReference;

    /*
     * Optional, If true, any failure for any operation in the VmApplication will fail the deployment
     */
    @JsonProperty(value = "treatFailureAsDeploymentFailure")
    private Boolean treatFailureAsDeploymentFailure;

    /*
     * If set to true, when a new Gallery Application version is available in PIR/SIG, it will be automatically updated for the VM/VMSS
     */
    @JsonProperty(value = "enableAutomaticUpgrade")
    private Boolean enableAutomaticUpgrade;

    /**
     * Creates an instance of VMGalleryApplication class.
     */
    public VMGalleryApplication() {
    }

    /**
     * Get the tags property: Optional, Specifies a passthrough value for more generic context.
     * 
     * @return the tags value.
     */
    public String tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Optional, Specifies a passthrough value for more generic context.
     * 
     * @param tags the tags value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the order property: Optional, Specifies the order in which the packages have to be installed.
     * 
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: Optional, Specifies the order in which the packages have to be installed.
     * 
     * @param order the order value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the packageReferenceId property: Specifies the GalleryApplicationVersion resource id on the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{application}/versions/{version}.
     * 
     * @return the packageReferenceId value.
     */
    public String packageReferenceId() {
        return this.packageReferenceId;
    }

    /**
     * Set the packageReferenceId property: Specifies the GalleryApplicationVersion resource id on the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{application}/versions/{version}.
     * 
     * @param packageReferenceId the packageReferenceId value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withPackageReferenceId(String packageReferenceId) {
        this.packageReferenceId = packageReferenceId;
        return this;
    }

    /**
     * Get the configurationReference property: Optional, Specifies the uri to an azure blob that will replace the
     * default configuration for the package if provided.
     * 
     * @return the configurationReference value.
     */
    public String configurationReference() {
        return this.configurationReference;
    }

    /**
     * Set the configurationReference property: Optional, Specifies the uri to an azure blob that will replace the
     * default configuration for the package if provided.
     * 
     * @param configurationReference the configurationReference value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withConfigurationReference(String configurationReference) {
        this.configurationReference = configurationReference;
        return this;
    }

    /**
     * Get the treatFailureAsDeploymentFailure property: Optional, If true, any failure for any operation in the
     * VmApplication will fail the deployment.
     * 
     * @return the treatFailureAsDeploymentFailure value.
     */
    public Boolean treatFailureAsDeploymentFailure() {
        return this.treatFailureAsDeploymentFailure;
    }

    /**
     * Set the treatFailureAsDeploymentFailure property: Optional, If true, any failure for any operation in the
     * VmApplication will fail the deployment.
     * 
     * @param treatFailureAsDeploymentFailure the treatFailureAsDeploymentFailure value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withTreatFailureAsDeploymentFailure(Boolean treatFailureAsDeploymentFailure) {
        this.treatFailureAsDeploymentFailure = treatFailureAsDeploymentFailure;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: If set to true, when a new Gallery Application version is available in
     * PIR/SIG, it will be automatically updated for the VM/VMSS.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: If set to true, when a new Gallery Application version is available in
     * PIR/SIG, it will be automatically updated for the VM/VMSS.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VMGalleryApplication object itself.
     */
    public VMGalleryApplication withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (packageReferenceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property packageReferenceId in model VMGalleryApplication"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMGalleryApplication.class);
}
