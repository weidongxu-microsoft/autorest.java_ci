// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.ImageInner;
import java.util.Map;

/** An immutable client-side representation of Image. */
public interface Image {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: The extended location of the Image.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value.
     */
    SubResource sourceVirtualMachine();

    /**
     * Gets the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    ImageStorageProfile storageProfile();

    /**
     * Gets the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created from the
     * image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if
     * the source is managed resource like disk or snapshot, we may require the user to specify the property if we
     * cannot deduce it from the source managed resource.
     *
     * @return the hyperVGeneration value.
     */
    HyperVGenerationTypes hyperVGeneration();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.ImageInner object.
     *
     * @return the inner object.
     */
    ImageInner innerModel();

    /** The entirety of the Image definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The Image definition stages. */
    interface DefinitionStages {
        /** The first stage of the Image definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Image definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the Image definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Image definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithSourceVirtualMachine,
                DefinitionStages.WithStorageProfile,
                DefinitionStages.WithHyperVGeneration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Image create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Image create(Context context);
        }

        /** The stage of the Image definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the Image definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the Image..
             *
             * @param extendedLocation The extended location of the Image.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the Image definition allowing to specify sourceVirtualMachine. */
        interface WithSourceVirtualMachine {
            /**
             * Specifies the sourceVirtualMachine property: The source virtual machine from which Image is created..
             *
             * @param sourceVirtualMachine The source virtual machine from which Image is created.
             * @return the next definition stage.
             */
            WithCreate withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /** The stage of the Image definition allowing to specify storageProfile. */
        interface WithStorageProfile {
            /**
             * Specifies the storageProfile property: Specifies the storage settings for the virtual machine disks..
             *
             * @param storageProfile Specifies the storage settings for the virtual machine disks.
             * @return the next definition stage.
             */
            WithCreate withStorageProfile(ImageStorageProfile storageProfile);
        }

        /** The stage of the Image definition allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created
             * from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to
             * specify the value, if the source is managed resource like disk or snapshot, we may require the user to
             * specify the property if we cannot deduce it from the source managed resource..
             *
             * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image.
             *     From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the
             *     value, if the source is managed resource like disk or snapshot, we may require the user to specify
             *     the property if we cannot deduce it from the source managed resource.
             * @return the next definition stage.
             */
            WithCreate withHyperVGeneration(HyperVGenerationTypes hyperVGeneration);
        }
    }

    /**
     * Begins update for the Image resource.
     *
     * @return the stage of resource update.
     */
    Image.Update update();

    /** The template for Image update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSourceVirtualMachine,
            UpdateStages.WithStorageProfile,
            UpdateStages.WithHyperVGeneration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Image apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Image apply(Context context);
    }

    /** The Image update stages. */
    interface UpdateStages {
        /** The stage of the Image update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the Image update allowing to specify sourceVirtualMachine. */
        interface WithSourceVirtualMachine {
            /**
             * Specifies the sourceVirtualMachine property: The source virtual machine from which Image is created..
             *
             * @param sourceVirtualMachine The source virtual machine from which Image is created.
             * @return the next definition stage.
             */
            Update withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /** The stage of the Image update allowing to specify storageProfile. */
        interface WithStorageProfile {
            /**
             * Specifies the storageProfile property: Specifies the storage settings for the virtual machine disks..
             *
             * @param storageProfile Specifies the storage settings for the virtual machine disks.
             * @return the next definition stage.
             */
            Update withStorageProfile(ImageStorageProfile storageProfile);
        }

        /** The stage of the Image update allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: Specifies the HyperVGenerationType of the VirtualMachine created
             * from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to
             * specify the value, if the source is managed resource like disk or snapshot, we may require the user to
             * specify the property if we cannot deduce it from the source managed resource..
             *
             * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image.
             *     From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the
             *     value, if the source is managed resource like disk or snapshot, we may require the user to specify
             *     the property if we cannot deduce it from the source managed resource.
             * @return the next definition stage.
             */
            Update withHyperVGeneration(HyperVGenerationTypes hyperVGeneration);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Image refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Image refresh(Context context);
}
