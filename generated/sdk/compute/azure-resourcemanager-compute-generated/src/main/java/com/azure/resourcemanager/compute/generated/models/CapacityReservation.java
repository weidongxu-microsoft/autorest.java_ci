// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of CapacityReservation. */
public interface CapacityReservation {
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
     * Gets the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the zones property: Availability Zone to use for this capacity reservation. The zone has to be single value
     * and also should be part for the list of zones specified during the capacity reservation group creation. The zone
     * can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If
     * provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     *
     * @return the reservationId value.
     */
    String reservationId();

    /**
     * Gets the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     *
     * @return the virtualMachinesAssociated value.
     */
    List<SubResourceReadOnly> virtualMachinesAssociated();

    /**
     * Gets the provisioningTime property: The date time when the capacity reservation was last updated.
     *
     * @return the provisioningTime value.
     */
    OffsetDateTime provisioningTime();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the instanceView property: The Capacity reservation instance view.
     *
     * @return the instanceView value.
     */
    CapacityReservationInstanceView instanceView();

    /**
     * Gets the timeCreated property: Specifies the time at which the Capacity Reservation resource was
     * created.&lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationInner object.
     *
     * @return the inner object.
     */
    CapacityReservationInner innerModel();

    /** The entirety of the CapacityReservation definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The CapacityReservation definition stages. */
    interface DefinitionStages {
        /** The first stage of the CapacityReservation definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the CapacityReservation definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the CapacityReservation definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, capacityReservationGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param capacityReservationGroupName The name of the capacity reservation group.
             * @return the next definition stage.
             */
            WithSku withExistingCapacityReservationGroup(String resourceGroupName, String capacityReservationGroupName);
        }
        /** The stage of the CapacityReservation definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and
             * capacity is required to be set. Currently VM Skus with the capability called
             * 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a
             * region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values..
             *
             * @param sku SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
             *     required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set
             *     to true are supported. Refer to List Microsoft.Compute SKUs in a region
             *     (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the CapacityReservation definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithZones {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CapacityReservation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CapacityReservation create(Context context);
        }
        /** The stage of the CapacityReservation definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the CapacityReservation definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: Availability Zone to use for this capacity reservation. The zone has to be
             * single value and also should be part for the list of zones specified during the capacity reservation
             * group creation. The zone can be assigned only during creation. If not provided, the reservation supports
             * only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same
             * zone..
             *
             * @param zones Availability Zone to use for this capacity reservation. The zone has to be single value and
             *     also should be part for the list of zones specified during the capacity reservation group creation.
             *     The zone can be assigned only during creation. If not provided, the reservation supports only
             *     non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same
             *     zone.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
    }
    /**
     * Begins update for the CapacityReservation resource.
     *
     * @return the stage of resource update.
     */
    CapacityReservation.Update update();

    /** The template for CapacityReservation update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CapacityReservation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CapacityReservation apply(Context context);
    }
    /** The CapacityReservation update stages. */
    interface UpdateStages {
        /** The stage of the CapacityReservation update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the CapacityReservation update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and
             * capacity is required to be set. Currently VM Skus with the capability called
             * 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a
             * region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values..
             *
             * @param sku SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
             *     required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set
             *     to true are supported. Refer to List Microsoft.Compute SKUs in a region
             *     (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CapacityReservation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CapacityReservation refresh(Context context);
}
