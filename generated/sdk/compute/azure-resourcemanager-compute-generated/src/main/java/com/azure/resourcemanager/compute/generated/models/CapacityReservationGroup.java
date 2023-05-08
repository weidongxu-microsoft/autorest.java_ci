// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationGroupInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of CapacityReservationGroup. */
public interface CapacityReservationGroup {
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
     * Gets the zones property: Availability Zones to use for this capacity reservation group. The zones can be assigned
     * only during creation. If not provided, the group supports only regional resources in the region. If provided,
     * enforces each capacity reservation in the group to be in one of the zones.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the capacityReservations property: A list of all capacity reservation resource ids that belong to capacity
     * reservation group.
     *
     * @return the capacityReservations value.
     */
    List<SubResourceReadOnly> capacityReservations();

    /**
     * Gets the virtualMachinesAssociated property: A list of references to all virtual machines associated to the
     * capacity reservation group.
     *
     * @return the virtualMachinesAssociated value.
     */
    List<SubResourceReadOnly> virtualMachinesAssociated();

    /**
     * Gets the instanceView property: The capacity reservation group instance view which has the list of instance views
     * for all the capacity reservations that belong to the capacity reservation group.
     *
     * @return the instanceView value.
     */
    CapacityReservationGroupInstanceView instanceView();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationGroupInner object.
     *
     * @return the inner object.
     */
    CapacityReservationGroupInner innerModel();

    /** The entirety of the CapacityReservationGroup definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The CapacityReservationGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the CapacityReservationGroup definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the CapacityReservationGroup definition allowing to specify location. */
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

        /** The stage of the CapacityReservationGroup definition allowing to specify parent resource. */
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
         * The stage of the CapacityReservationGroup definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithZones {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CapacityReservationGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CapacityReservationGroup create(Context context);
        }

        /** The stage of the CapacityReservationGroup definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the CapacityReservationGroup definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: Availability Zones to use for this capacity reservation group. The zones
             * can be assigned only during creation. If not provided, the group supports only regional resources in the
             * region. If provided, enforces each capacity reservation in the group to be in one of the zones..
             *
             * @param zones Availability Zones to use for this capacity reservation group. The zones can be assigned
             *     only during creation. If not provided, the group supports only regional resources in the region. If
             *     provided, enforces each capacity reservation in the group to be in one of the zones.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
    }

    /**
     * Begins update for the CapacityReservationGroup resource.
     *
     * @return the stage of resource update.
     */
    CapacityReservationGroup.Update update();

    /** The template for CapacityReservationGroup update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CapacityReservationGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CapacityReservationGroup apply(Context context);
    }

    /** The CapacityReservationGroup update stages. */
    interface UpdateStages {
        /** The stage of the CapacityReservationGroup update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CapacityReservationGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CapacityReservationGroup refresh(Context context);
}
