// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VirtualWan.
 */
public interface VirtualWan {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the disableVpnEncryption property: Vpn encryption to be disabled or not.
     * 
     * @return the disableVpnEncryption value.
     */
    Boolean disableVpnEncryption();

    /**
     * Gets the virtualHubs property: List of VirtualHubs in the VirtualWAN.
     * 
     * @return the virtualHubs value.
     */
    List<SubResource> virtualHubs();

    /**
     * Gets the vpnSites property: List of VpnSites in the VirtualWAN.
     * 
     * @return the vpnSites value.
     */
    List<SubResource> vpnSites();

    /**
     * Gets the allowBranchToBranchTraffic property: True if branch to branch traffic is allowed.
     * 
     * @return the allowBranchToBranchTraffic value.
     */
    Boolean allowBranchToBranchTraffic();

    /**
     * Gets the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is allowed.
     * 
     * @return the allowVnetToVnetTraffic value.
     */
    Boolean allowVnetToVnetTraffic();

    /**
     * Gets the office365LocalBreakoutCategory property: The office local breakout category.
     * 
     * @return the office365LocalBreakoutCategory value.
     */
    OfficeTrafficCategory office365LocalBreakoutCategory();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual WAN resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the typePropertiesType property: The type of the VirtualWAN.
     * 
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualWanInner object.
     * 
     * @return the inner object.
     */
    VirtualWanInner innerModel();

    /**
     * The entirety of the VirtualWan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The VirtualWan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VirtualWan definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the VirtualWan definition allowing to specify location.
         */
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

        /**
         * The stage of the VirtualWan definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The resource group name of the VirtualWan.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the VirtualWan definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithDisableVpnEncryption,
            DefinitionStages.WithAllowBranchToBranchTraffic, DefinitionStages.WithAllowVnetToVnetTraffic,
            DefinitionStages.WithTypePropertiesType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VirtualWan create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualWan create(Context context);
        }

        /**
         * The stage of the VirtualWan definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the VirtualWan definition allowing to specify disableVpnEncryption.
         */
        interface WithDisableVpnEncryption {
            /**
             * Specifies the disableVpnEncryption property: Vpn encryption to be disabled or not..
             * 
             * @param disableVpnEncryption Vpn encryption to be disabled or not.
             * @return the next definition stage.
             */
            WithCreate withDisableVpnEncryption(Boolean disableVpnEncryption);
        }

        /**
         * The stage of the VirtualWan definition allowing to specify allowBranchToBranchTraffic.
         */
        interface WithAllowBranchToBranchTraffic {
            /**
             * Specifies the allowBranchToBranchTraffic property: True if branch to branch traffic is allowed..
             * 
             * @param allowBranchToBranchTraffic True if branch to branch traffic is allowed.
             * @return the next definition stage.
             */
            WithCreate withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic);
        }

        /**
         * The stage of the VirtualWan definition allowing to specify allowVnetToVnetTraffic.
         */
        interface WithAllowVnetToVnetTraffic {
            /**
             * Specifies the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is allowed..
             * 
             * @param allowVnetToVnetTraffic True if Vnet to Vnet traffic is allowed.
             * @return the next definition stage.
             */
            WithCreate withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic);
        }

        /**
         * The stage of the VirtualWan definition allowing to specify typePropertiesType.
         */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: The type of the VirtualWAN..
             * 
             * @param typePropertiesType The type of the VirtualWAN.
             * @return the next definition stage.
             */
            WithCreate withTypePropertiesType(String typePropertiesType);
        }
    }

    /**
     * Begins update for the VirtualWan resource.
     * 
     * @return the stage of resource update.
     */
    VirtualWan.Update update();

    /**
     * The template for VirtualWan update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VirtualWan apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualWan apply(Context context);
    }

    /**
     * The VirtualWan update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VirtualWan update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
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
    VirtualWan refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualWan refresh(Context context);
}
