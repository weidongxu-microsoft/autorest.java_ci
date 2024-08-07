// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayNatRuleInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VpnGateway.
 */
public interface VpnGateway {
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
     * Gets the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * Gets the connections property: List of all vpn connections to the gateway.
     * 
     * @return the connections value.
     */
    List<VpnConnection> connections();

    /**
     * Gets the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * Gets the provisioningState property: The provisioning state of the VPN gateway resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    Integer vpnGatewayScaleUnit();

    /**
     * Gets the ipConfigurations property: List of all IPs configured on the gateway.
     * 
     * @return the ipConfigurations value.
     */
    List<VpnGatewayIpConfiguration> ipConfigurations();

    /**
     * Gets the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     * 
     * @return the enableBgpRouteTranslationForNat value.
     */
    Boolean enableBgpRouteTranslationForNat();

    /**
     * Gets the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     * 
     * @return the isRoutingPreferenceInternet value.
     */
    Boolean isRoutingPreferenceInternet();

    /**
     * Gets the natRules property: List of all the nat Rules associated with the gateway.
     * 
     * @return the natRules value.
     */
    List<VpnGatewayNatRule> natRules();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner object.
     * 
     * @return the inner object.
     */
    VpnGatewayInner innerModel();

    /**
     * The entirety of the VpnGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The VpnGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VpnGateway definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the VpnGateway definition allowing to specify location.
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
         * The stage of the VpnGateway definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The resource group name of the VpnGateway.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the VpnGateway definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithVirtualHub,
            DefinitionStages.WithConnections, DefinitionStages.WithBgpSettings,
            DefinitionStages.WithVpnGatewayScaleUnit, DefinitionStages.WithEnableBgpRouteTranslationForNat,
            DefinitionStages.WithIsRoutingPreferenceInternet, DefinitionStages.WithNatRules {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VpnGateway create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VpnGateway create(Context context);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify tags.
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
         * The stage of the VpnGateway definition allowing to specify virtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies the virtualHub property: The VirtualHub to which the gateway belongs..
             * 
             * @param virtualHub The VirtualHub to which the gateway belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify connections.
         */
        interface WithConnections {
            /**
             * Specifies the connections property: List of all vpn connections to the gateway..
             * 
             * @param connections List of all vpn connections to the gateway.
             * @return the next definition stage.
             */
            WithCreate withConnections(List<VpnConnectionInner> connections);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify bgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies the bgpSettings property: Local network gateway's BGP speaker settings..
             * 
             * @param bgpSettings Local network gateway's BGP speaker settings.
             * @return the next definition stage.
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify vpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies the vpnGatewayScaleUnit property: The scale unit for this vpn gateway..
             * 
             * @param vpnGatewayScaleUnit The scale unit for this vpn gateway.
             * @return the next definition stage.
             */
            WithCreate withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify enableBgpRouteTranslationForNat.
         */
        interface WithEnableBgpRouteTranslationForNat {
            /**
             * Specifies the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this
             * VpnGateway..
             * 
             * @param enableBgpRouteTranslationForNat Enable BGP routes translation for NAT on this VpnGateway.
             * @return the next definition stage.
             */
            WithCreate withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify isRoutingPreferenceInternet.
         */
        interface WithIsRoutingPreferenceInternet {
            /**
             * Specifies the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP
             * Interface of the VpnGateway..
             * 
             * @param isRoutingPreferenceInternet Enable Routing Preference property for the Public IP Interface of the
             * VpnGateway.
             * @return the next definition stage.
             */
            WithCreate withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet);
        }

        /**
         * The stage of the VpnGateway definition allowing to specify natRules.
         */
        interface WithNatRules {
            /**
             * Specifies the natRules property: List of all the nat Rules associated with the gateway..
             * 
             * @param natRules List of all the nat Rules associated with the gateway.
             * @return the next definition stage.
             */
            WithCreate withNatRules(List<VpnGatewayNatRuleInner> natRules);
        }
    }

    /**
     * Begins update for the VpnGateway resource.
     * 
     * @return the stage of resource update.
     */
    VpnGateway.Update update();

    /**
     * The template for VpnGateway update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VpnGateway apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VpnGateway apply(Context context);
    }

    /**
     * The VpnGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VpnGateway update allowing to specify tags.
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
    VpnGateway refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VpnGateway refresh(Context context);

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    VpnGateway reset();

    /**
     * Resets the primary of the vpn gateway in the specified resource group.
     * 
     * @param ipConfigurationId VpnGateway ipConfigurationId to specify the gateway instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnGateway Resource.
     */
    VpnGateway reset(String ipConfigurationId, Context context);

    /**
     * Starts packet capture on vpn gateway in the specified resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture();

    /**
     * Starts packet capture on vpn gateway in the specified resource group.
     * 
     * @param parameters Vpn gateway packet capture parameters supplied to start packet capture on vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(VpnGatewayPacketCaptureStartParameters parameters, Context context);

    /**
     * Stops packet capture on vpn gateway in the specified resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture();

    /**
     * Stops packet capture on vpn gateway in the specified resource group.
     * 
     * @param parameters Vpn gateway packet capture parameters supplied to stop packet capture on vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture(VpnGatewayPacketCaptureStopParameters parameters, Context context);
}
