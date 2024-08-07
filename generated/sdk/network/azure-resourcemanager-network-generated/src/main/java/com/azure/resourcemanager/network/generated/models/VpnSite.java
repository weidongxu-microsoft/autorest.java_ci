// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VpnSite.
 */
public interface VpnSite {
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
     * Gets the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     * 
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * Gets the deviceProperties property: The device properties.
     * 
     * @return the deviceProperties value.
     */
    DeviceProperties deviceProperties();

    /**
     * Gets the ipAddress property: The ip-address for the vpn-site.
     * 
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * Gets the siteKey property: The key for vpn-site that can be used for connections.
     * 
     * @return the siteKey value.
     */
    String siteKey();

    /**
     * Gets the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     * 
     * @return the addressSpace value.
     */
    AddressSpace addressSpace();

    /**
     * Gets the bgpProperties property: The set of bgp properties.
     * 
     * @return the bgpProperties value.
     */
    BgpSettings bgpProperties();

    /**
     * Gets the provisioningState property: The provisioning state of the VPN site resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the isSecuritySite property: IsSecuritySite flag.
     * 
     * @return the isSecuritySite value.
     */
    Boolean isSecuritySite();

    /**
     * Gets the vpnSiteLinks property: List of all vpn site links.
     * 
     * @return the vpnSiteLinks value.
     */
    List<VpnSiteLink> vpnSiteLinks();

    /**
     * Gets the o365Policy property: Office365 Policy.
     * 
     * @return the o365Policy value.
     */
    O365PolicyProperties o365Policy();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnSiteInner object.
     * 
     * @return the inner object.
     */
    VpnSiteInner innerModel();

    /**
     * The entirety of the VpnSite definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The VpnSite definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VpnSite definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the VpnSite definition allowing to specify location.
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
         * The stage of the VpnSite definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The resource group name of the VpnSite.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the VpnSite definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithVirtualWan,
            DefinitionStages.WithDeviceProperties, DefinitionStages.WithIpAddress, DefinitionStages.WithSiteKey,
            DefinitionStages.WithAddressSpace, DefinitionStages.WithBgpProperties, DefinitionStages.WithIsSecuritySite,
            DefinitionStages.WithVpnSiteLinks, DefinitionStages.WithO365Policy {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VpnSite create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VpnSite create(Context context);
        }

        /**
         * The stage of the VpnSite definition allowing to specify tags.
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
         * The stage of the VpnSite definition allowing to specify virtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies the virtualWan property: The VirtualWAN to which the vpnSite belongs..
             * 
             * @param virtualWan The VirtualWAN to which the vpnSite belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }

        /**
         * The stage of the VpnSite definition allowing to specify deviceProperties.
         */
        interface WithDeviceProperties {
            /**
             * Specifies the deviceProperties property: The device properties..
             * 
             * @param deviceProperties The device properties.
             * @return the next definition stage.
             */
            WithCreate withDeviceProperties(DeviceProperties deviceProperties);
        }

        /**
         * The stage of the VpnSite definition allowing to specify ipAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies the ipAddress property: The ip-address for the vpn-site..
             * 
             * @param ipAddress The ip-address for the vpn-site.
             * @return the next definition stage.
             */
            WithCreate withIpAddress(String ipAddress);
        }

        /**
         * The stage of the VpnSite definition allowing to specify siteKey.
         */
        interface WithSiteKey {
            /**
             * Specifies the siteKey property: The key for vpn-site that can be used for connections..
             * 
             * @param siteKey The key for vpn-site that can be used for connections.
             * @return the next definition stage.
             */
            WithCreate withSiteKey(String siteKey);
        }

        /**
         * The stage of the VpnSite definition allowing to specify addressSpace.
         */
        interface WithAddressSpace {
            /**
             * Specifies the addressSpace property: The AddressSpace that contains an array of IP address ranges..
             * 
             * @param addressSpace The AddressSpace that contains an array of IP address ranges.
             * @return the next definition stage.
             */
            WithCreate withAddressSpace(AddressSpace addressSpace);
        }

        /**
         * The stage of the VpnSite definition allowing to specify bgpProperties.
         */
        interface WithBgpProperties {
            /**
             * Specifies the bgpProperties property: The set of bgp properties..
             * 
             * @param bgpProperties The set of bgp properties.
             * @return the next definition stage.
             */
            WithCreate withBgpProperties(BgpSettings bgpProperties);
        }

        /**
         * The stage of the VpnSite definition allowing to specify isSecuritySite.
         */
        interface WithIsSecuritySite {
            /**
             * Specifies the isSecuritySite property: IsSecuritySite flag..
             * 
             * @param isSecuritySite IsSecuritySite flag.
             * @return the next definition stage.
             */
            WithCreate withIsSecuritySite(Boolean isSecuritySite);
        }

        /**
         * The stage of the VpnSite definition allowing to specify vpnSiteLinks.
         */
        interface WithVpnSiteLinks {
            /**
             * Specifies the vpnSiteLinks property: List of all vpn site links..
             * 
             * @param vpnSiteLinks List of all vpn site links.
             * @return the next definition stage.
             */
            WithCreate withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks);
        }

        /**
         * The stage of the VpnSite definition allowing to specify o365Policy.
         */
        interface WithO365Policy {
            /**
             * Specifies the o365Policy property: Office365 Policy..
             * 
             * @param o365Policy Office365 Policy.
             * @return the next definition stage.
             */
            WithCreate withO365Policy(O365PolicyProperties o365Policy);
        }
    }

    /**
     * Begins update for the VpnSite resource.
     * 
     * @return the stage of resource update.
     */
    VpnSite.Update update();

    /**
     * The template for VpnSite update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VpnSite apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VpnSite apply(Context context);
    }

    /**
     * The VpnSite update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VpnSite update allowing to specify tags.
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
    VpnSite refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VpnSite refresh(Context context);
}
