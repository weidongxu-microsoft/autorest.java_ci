// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AvailabilitySet. */
public interface AvailabilitySet {
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
     * Gets the sku property: Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes
     * for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual
     * machines with unmanaged disks. Default value is 'Classic'.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the platformUpdateDomainCount property: Update Domain count.
     *
     * @return the platformUpdateDomainCount value.
     */
    Integer platformUpdateDomainCount();

    /**
     * Gets the platformFaultDomainCount property: Fault Domain count.
     *
     * @return the platformFaultDomainCount value.
     */
    Integer platformFaultDomainCount();

    /**
     * Gets the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value.
     */
    List<SubResource> virtualMachines();

    /**
     * Gets the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    SubResource proximityPlacementGroup();

    /**
     * Gets the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner object.
     *
     * @return the inner object.
     */
    AvailabilitySetInner innerModel();

    /** The entirety of the AvailabilitySet definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AvailabilitySet definition stages. */
    interface DefinitionStages {
        /** The first stage of the AvailabilitySet definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AvailabilitySet definition allowing to specify location. */
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
        /** The stage of the AvailabilitySet definition allowing to specify parent resource. */
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
         * The stage of the AvailabilitySet definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithPlatformUpdateDomainCount,
                DefinitionStages.WithPlatformFaultDomainCount,
                DefinitionStages.WithVirtualMachines,
                DefinitionStages.WithProximityPlacementGroup {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AvailabilitySet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AvailabilitySet create(Context context);
        }
        /** The stage of the AvailabilitySet definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AvailabilitySet definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Sku of the availability set, only name is required to be set. See
             * AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks
             * and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'..
             *
             * @param sku Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for
             *     possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for
             *     virtual machines with unmanaged disks. Default value is 'Classic'.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the AvailabilitySet definition allowing to specify platformUpdateDomainCount. */
        interface WithPlatformUpdateDomainCount {
            /**
             * Specifies the platformUpdateDomainCount property: Update Domain count..
             *
             * @param platformUpdateDomainCount Update Domain count.
             * @return the next definition stage.
             */
            WithCreate withPlatformUpdateDomainCount(Integer platformUpdateDomainCount);
        }
        /** The stage of the AvailabilitySet definition allowing to specify platformFaultDomainCount. */
        interface WithPlatformFaultDomainCount {
            /**
             * Specifies the platformFaultDomainCount property: Fault Domain count..
             *
             * @param platformFaultDomainCount Fault Domain count.
             * @return the next definition stage.
             */
            WithCreate withPlatformFaultDomainCount(Integer platformFaultDomainCount);
        }
        /** The stage of the AvailabilitySet definition allowing to specify virtualMachines. */
        interface WithVirtualMachines {
            /**
             * Specifies the virtualMachines property: A list of references to all virtual machines in the availability
             * set..
             *
             * @param virtualMachines A list of references to all virtual machines in the availability set.
             * @return the next definition stage.
             */
            WithCreate withVirtualMachines(List<SubResource> virtualMachines);
        }
        /** The stage of the AvailabilitySet definition allowing to specify proximityPlacementGroup. */
        interface WithProximityPlacementGroup {
            /**
             * Specifies the proximityPlacementGroup property: Specifies information about the proximity placement group
             * that the availability set should be assigned to. Minimum api-version: 2018-04-01..
             *
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the
             *     availability set should be assigned to. Minimum api-version: 2018-04-01.
             * @return the next definition stage.
             */
            WithCreate withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }
    }
    /**
     * Begins update for the AvailabilitySet resource.
     *
     * @return the stage of resource update.
     */
    AvailabilitySet.Update update();

    /** The template for AvailabilitySet update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithPlatformUpdateDomainCount,
            UpdateStages.WithPlatformFaultDomainCount,
            UpdateStages.WithVirtualMachines,
            UpdateStages.WithProximityPlacementGroup {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AvailabilitySet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AvailabilitySet apply(Context context);
    }
    /** The AvailabilitySet update stages. */
    interface UpdateStages {
        /** The stage of the AvailabilitySet update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AvailabilitySet update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Sku of the availability set.
             *
             * @param sku Sku of the availability set.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the AvailabilitySet update allowing to specify platformUpdateDomainCount. */
        interface WithPlatformUpdateDomainCount {
            /**
             * Specifies the platformUpdateDomainCount property: Update Domain count..
             *
             * @param platformUpdateDomainCount Update Domain count.
             * @return the next definition stage.
             */
            Update withPlatformUpdateDomainCount(Integer platformUpdateDomainCount);
        }
        /** The stage of the AvailabilitySet update allowing to specify platformFaultDomainCount. */
        interface WithPlatformFaultDomainCount {
            /**
             * Specifies the platformFaultDomainCount property: Fault Domain count..
             *
             * @param platformFaultDomainCount Fault Domain count.
             * @return the next definition stage.
             */
            Update withPlatformFaultDomainCount(Integer platformFaultDomainCount);
        }
        /** The stage of the AvailabilitySet update allowing to specify virtualMachines. */
        interface WithVirtualMachines {
            /**
             * Specifies the virtualMachines property: A list of references to all virtual machines in the availability
             * set..
             *
             * @param virtualMachines A list of references to all virtual machines in the availability set.
             * @return the next definition stage.
             */
            Update withVirtualMachines(List<SubResource> virtualMachines);
        }
        /** The stage of the AvailabilitySet update allowing to specify proximityPlacementGroup. */
        interface WithProximityPlacementGroup {
            /**
             * Specifies the proximityPlacementGroup property: Specifies information about the proximity placement group
             * that the availability set should be assigned to. Minimum api-version: 2018-04-01..
             *
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the
             *     availability set should be assigned to. Minimum api-version: 2018-04-01.
             * @return the next definition stage.
             */
            Update withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AvailabilitySet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AvailabilitySet refresh(Context context);
}
