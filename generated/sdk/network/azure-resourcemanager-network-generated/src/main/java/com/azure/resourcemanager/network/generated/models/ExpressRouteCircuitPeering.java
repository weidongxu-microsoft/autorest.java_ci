// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitStatsInner;
import java.util.List;

/** An immutable client-side representation of ExpressRouteCircuitPeering. */
public interface ExpressRouteCircuitPeering {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the peeringType property: The peering type.
     *
     * @return the peeringType value.
     */
    ExpressRoutePeeringType peeringType();

    /**
     * Gets the state property: The peering state.
     *
     * @return the state value.
     */
    ExpressRoutePeeringState state();

    /**
     * Gets the azureAsn property: The Azure ASN.
     *
     * @return the azureAsn value.
     */
    Integer azureAsn();

    /**
     * Gets the peerAsn property: The peer ASN.
     *
     * @return the peerAsn value.
     */
    Long peerAsn();

    /**
     * Gets the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value.
     */
    String primaryPeerAddressPrefix();

    /**
     * Gets the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value.
     */
    String secondaryPeerAddressPrefix();

    /**
     * Gets the primaryAzurePort property: The primary port.
     *
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * Gets the secondaryAzurePort property: The secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * Gets the sharedKey property: The shared key.
     *
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * Gets the vlanId property: The VLAN ID.
     *
     * @return the vlanId value.
     */
    Integer vlanId();

    /**
     * Gets the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value.
     */
    ExpressRouteCircuitPeeringConfig microsoftPeeringConfig();

    /**
     * Gets the stats property: The peering stats of express route circuit.
     *
     * @return the stats value.
     */
    ExpressRouteCircuitStats stats();

    /**
     * Gets the provisioningState property: The provisioning state of the express route circuit peering resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * Gets the lastModifiedBy property: Who was the last to modify the peering.
     *
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * Gets the routeFilter property: The reference to the RouteFilter resource.
     *
     * @return the routeFilter value.
     */
    SubResource routeFilter();

    /**
     * Gets the ipv6PeeringConfig property: The IPv6 peering configuration.
     *
     * @return the ipv6PeeringConfig value.
     */
    Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig();

    /**
     * Gets the expressRouteConnection property: The ExpressRoute connection.
     *
     * @return the expressRouteConnection value.
     */
    ExpressRouteConnectionId expressRouteConnection();

    /**
     * Gets the connections property: The list of circuit connections associated with Azure Private Peering for this
     * circuit.
     *
     * @return the connections value.
     */
    List<ExpressRouteCircuitConnection> connections();

    /**
     * Gets the peeredConnections property: The list of peered circuit connections associated with Azure Private Peering
     * for this circuit.
     *
     * @return the peeredConnections value.
     */
    List<PeerExpressRouteCircuitConnection> peeredConnections();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner object.
     *
     * @return the inner object.
     */
    ExpressRouteCircuitPeeringInner innerModel();

    /** The entirety of the ExpressRouteCircuitPeering definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The ExpressRouteCircuitPeering definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExpressRouteCircuitPeering definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, circuitName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param circuitName The name of the express route circuit.
             * @return the next definition stage.
             */
            WithCreate withExistingExpressRouteCircuit(String resourceGroupName, String circuitName);
        }

        /**
         * The stage of the ExpressRouteCircuitPeering definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithPeeringType,
                DefinitionStages.WithState,
                DefinitionStages.WithAzureAsn,
                DefinitionStages.WithPeerAsn,
                DefinitionStages.WithPrimaryPeerAddressPrefix,
                DefinitionStages.WithSecondaryPeerAddressPrefix,
                DefinitionStages.WithPrimaryAzurePort,
                DefinitionStages.WithSecondaryAzurePort,
                DefinitionStages.WithSharedKey,
                DefinitionStages.WithVlanId,
                DefinitionStages.WithMicrosoftPeeringConfig,
                DefinitionStages.WithStats,
                DefinitionStages.WithGatewayManagerEtag,
                DefinitionStages.WithRouteFilter,
                DefinitionStages.WithIpv6PeeringConfig,
                DefinitionStages.WithExpressRouteConnection,
                DefinitionStages.WithConnections {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExpressRouteCircuitPeering create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRouteCircuitPeering create(Context context);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify peeringType. */
        interface WithPeeringType {
            /**
             * Specifies the peeringType property: The peering type..
             *
             * @param peeringType The peering type.
             * @return the next definition stage.
             */
            WithCreate withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: The peering state..
             *
             * @param state The peering state.
             * @return the next definition stage.
             */
            WithCreate withState(ExpressRoutePeeringState state);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify azureAsn. */
        interface WithAzureAsn {
            /**
             * Specifies the azureAsn property: The Azure ASN..
             *
             * @param azureAsn The Azure ASN.
             * @return the next definition stage.
             */
            WithCreate withAzureAsn(Integer azureAsn);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify peerAsn. */
        interface WithPeerAsn {
            /**
             * Specifies the peerAsn property: The peer ASN..
             *
             * @param peerAsn The peer ASN.
             * @return the next definition stage.
             */
            WithCreate withPeerAsn(Long peerAsn);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify primaryPeerAddressPrefix. */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies the primaryPeerAddressPrefix property: The primary address prefix..
             *
             * @param primaryPeerAddressPrefix The primary address prefix.
             * @return the next definition stage.
             */
            WithCreate withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify secondaryPeerAddressPrefix. */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies the secondaryPeerAddressPrefix property: The secondary address prefix..
             *
             * @param secondaryPeerAddressPrefix The secondary address prefix.
             * @return the next definition stage.
             */
            WithCreate withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify primaryAzurePort. */
        interface WithPrimaryAzurePort {
            /**
             * Specifies the primaryAzurePort property: The primary port..
             *
             * @param primaryAzurePort The primary port.
             * @return the next definition stage.
             */
            WithCreate withPrimaryAzurePort(String primaryAzurePort);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify secondaryAzurePort. */
        interface WithSecondaryAzurePort {
            /**
             * Specifies the secondaryAzurePort property: The secondary port..
             *
             * @param secondaryAzurePort The secondary port.
             * @return the next definition stage.
             */
            WithCreate withSecondaryAzurePort(String secondaryAzurePort);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify sharedKey. */
        interface WithSharedKey {
            /**
             * Specifies the sharedKey property: The shared key..
             *
             * @param sharedKey The shared key.
             * @return the next definition stage.
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify vlanId. */
        interface WithVlanId {
            /**
             * Specifies the vlanId property: The VLAN ID..
             *
             * @param vlanId The VLAN ID.
             * @return the next definition stage.
             */
            WithCreate withVlanId(Integer vlanId);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify microsoftPeeringConfig. */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies the microsoftPeeringConfig property: The Microsoft peering configuration..
             *
             * @param microsoftPeeringConfig The Microsoft peering configuration.
             * @return the next definition stage.
             */
            WithCreate withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify stats. */
        interface WithStats {
            /**
             * Specifies the stats property: The peering stats of express route circuit..
             *
             * @param stats The peering stats of express route circuit.
             * @return the next definition stage.
             */
            WithCreate withStats(ExpressRouteCircuitStatsInner stats);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify gatewayManagerEtag. */
        interface WithGatewayManagerEtag {
            /**
             * Specifies the gatewayManagerEtag property: The GatewayManager Etag..
             *
             * @param gatewayManagerEtag The GatewayManager Etag.
             * @return the next definition stage.
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify routeFilter. */
        interface WithRouteFilter {
            /**
             * Specifies the routeFilter property: The reference to the RouteFilter resource..
             *
             * @param routeFilter The reference to the RouteFilter resource.
             * @return the next definition stage.
             */
            WithCreate withRouteFilter(SubResource routeFilter);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify ipv6PeeringConfig. */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies the ipv6PeeringConfig property: The IPv6 peering configuration..
             *
             * @param ipv6PeeringConfig The IPv6 peering configuration.
             * @return the next definition stage.
             */
            WithCreate withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify expressRouteConnection. */
        interface WithExpressRouteConnection {
            /**
             * Specifies the expressRouteConnection property: The ExpressRoute connection..
             *
             * @param expressRouteConnection The ExpressRoute connection.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection);
        }

        /** The stage of the ExpressRouteCircuitPeering definition allowing to specify connections. */
        interface WithConnections {
            /**
             * Specifies the connections property: The list of circuit connections associated with Azure Private Peering
             * for this circuit..
             *
             * @param connections The list of circuit connections associated with Azure Private Peering for this
             *     circuit.
             * @return the next definition stage.
             */
            WithCreate withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }
    }

    /**
     * Begins update for the ExpressRouteCircuitPeering resource.
     *
     * @return the stage of resource update.
     */
    ExpressRouteCircuitPeering.Update update();

    /** The template for ExpressRouteCircuitPeering update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithPeeringType,
            UpdateStages.WithState,
            UpdateStages.WithAzureAsn,
            UpdateStages.WithPeerAsn,
            UpdateStages.WithPrimaryPeerAddressPrefix,
            UpdateStages.WithSecondaryPeerAddressPrefix,
            UpdateStages.WithPrimaryAzurePort,
            UpdateStages.WithSecondaryAzurePort,
            UpdateStages.WithSharedKey,
            UpdateStages.WithVlanId,
            UpdateStages.WithMicrosoftPeeringConfig,
            UpdateStages.WithStats,
            UpdateStages.WithGatewayManagerEtag,
            UpdateStages.WithRouteFilter,
            UpdateStages.WithIpv6PeeringConfig,
            UpdateStages.WithExpressRouteConnection,
            UpdateStages.WithConnections {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExpressRouteCircuitPeering apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRouteCircuitPeering apply(Context context);
    }

    /** The ExpressRouteCircuitPeering update stages. */
    interface UpdateStages {
        /** The stage of the ExpressRouteCircuitPeering update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify peeringType. */
        interface WithPeeringType {
            /**
             * Specifies the peeringType property: The peering type..
             *
             * @param peeringType The peering type.
             * @return the next definition stage.
             */
            Update withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: The peering state..
             *
             * @param state The peering state.
             * @return the next definition stage.
             */
            Update withState(ExpressRoutePeeringState state);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify azureAsn. */
        interface WithAzureAsn {
            /**
             * Specifies the azureAsn property: The Azure ASN..
             *
             * @param azureAsn The Azure ASN.
             * @return the next definition stage.
             */
            Update withAzureAsn(Integer azureAsn);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify peerAsn. */
        interface WithPeerAsn {
            /**
             * Specifies the peerAsn property: The peer ASN..
             *
             * @param peerAsn The peer ASN.
             * @return the next definition stage.
             */
            Update withPeerAsn(Long peerAsn);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify primaryPeerAddressPrefix. */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies the primaryPeerAddressPrefix property: The primary address prefix..
             *
             * @param primaryPeerAddressPrefix The primary address prefix.
             * @return the next definition stage.
             */
            Update withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify secondaryPeerAddressPrefix. */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies the secondaryPeerAddressPrefix property: The secondary address prefix..
             *
             * @param secondaryPeerAddressPrefix The secondary address prefix.
             * @return the next definition stage.
             */
            Update withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify primaryAzurePort. */
        interface WithPrimaryAzurePort {
            /**
             * Specifies the primaryAzurePort property: The primary port..
             *
             * @param primaryAzurePort The primary port.
             * @return the next definition stage.
             */
            Update withPrimaryAzurePort(String primaryAzurePort);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify secondaryAzurePort. */
        interface WithSecondaryAzurePort {
            /**
             * Specifies the secondaryAzurePort property: The secondary port..
             *
             * @param secondaryAzurePort The secondary port.
             * @return the next definition stage.
             */
            Update withSecondaryAzurePort(String secondaryAzurePort);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify sharedKey. */
        interface WithSharedKey {
            /**
             * Specifies the sharedKey property: The shared key..
             *
             * @param sharedKey The shared key.
             * @return the next definition stage.
             */
            Update withSharedKey(String sharedKey);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify vlanId. */
        interface WithVlanId {
            /**
             * Specifies the vlanId property: The VLAN ID..
             *
             * @param vlanId The VLAN ID.
             * @return the next definition stage.
             */
            Update withVlanId(Integer vlanId);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify microsoftPeeringConfig. */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies the microsoftPeeringConfig property: The Microsoft peering configuration..
             *
             * @param microsoftPeeringConfig The Microsoft peering configuration.
             * @return the next definition stage.
             */
            Update withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify stats. */
        interface WithStats {
            /**
             * Specifies the stats property: The peering stats of express route circuit..
             *
             * @param stats The peering stats of express route circuit.
             * @return the next definition stage.
             */
            Update withStats(ExpressRouteCircuitStatsInner stats);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify gatewayManagerEtag. */
        interface WithGatewayManagerEtag {
            /**
             * Specifies the gatewayManagerEtag property: The GatewayManager Etag..
             *
             * @param gatewayManagerEtag The GatewayManager Etag.
             * @return the next definition stage.
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify routeFilter. */
        interface WithRouteFilter {
            /**
             * Specifies the routeFilter property: The reference to the RouteFilter resource..
             *
             * @param routeFilter The reference to the RouteFilter resource.
             * @return the next definition stage.
             */
            Update withRouteFilter(SubResource routeFilter);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify ipv6PeeringConfig. */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies the ipv6PeeringConfig property: The IPv6 peering configuration..
             *
             * @param ipv6PeeringConfig The IPv6 peering configuration.
             * @return the next definition stage.
             */
            Update withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify expressRouteConnection. */
        interface WithExpressRouteConnection {
            /**
             * Specifies the expressRouteConnection property: The ExpressRoute connection..
             *
             * @param expressRouteConnection The ExpressRoute connection.
             * @return the next definition stage.
             */
            Update withExpressRouteConnection(ExpressRouteConnectionId expressRouteConnection);
        }

        /** The stage of the ExpressRouteCircuitPeering update allowing to specify connections. */
        interface WithConnections {
            /**
             * Specifies the connections property: The list of circuit connections associated with Azure Private Peering
             * for this circuit..
             *
             * @param connections The list of circuit connections associated with Azure Private Peering for this
             *     circuit.
             * @return the next definition stage.
             */
            Update withConnections(List<ExpressRouteCircuitConnectionInner> connections);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ExpressRouteCircuitPeering refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExpressRouteCircuitPeering refresh(Context context);
}
