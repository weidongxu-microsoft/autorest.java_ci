// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BgpConnectionInner;

/**
 * An immutable client-side representation of BgpConnection.
 */
public interface BgpConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the connection.
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
     * Gets the type property: Connection type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the peerAsn property: Peer ASN.
     * 
     * @return the peerAsn value.
     */
    Long peerAsn();

    /**
     * Gets the peerIp property: Peer IP.
     * 
     * @return the peerIp value.
     */
    String peerIp();

    /**
     * Gets the hubVirtualNetworkConnection property: The reference to the HubVirtualNetworkConnection resource.
     * 
     * @return the hubVirtualNetworkConnection value.
     */
    SubResource hubVirtualNetworkConnection();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the connectionState property: The current state of the VirtualHub to Peer.
     * 
     * @return the connectionState value.
     */
    HubBgpConnectionStatus connectionState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BgpConnectionInner object.
     * 
     * @return the inner object.
     */
    BgpConnectionInner innerModel();

    /**
     * The entirety of the BgpConnection definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The BgpConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the BgpConnection definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the BgpConnection definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualHubName.
             * 
             * @param resourceGroupName The resource group name of the VirtualHub.
             * @param virtualHubName The name of the VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }

        /**
         * The stage of the BgpConnection definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithPeerAsn,
            DefinitionStages.WithPeerIp, DefinitionStages.WithHubVirtualNetworkConnection {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            BgpConnection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BgpConnection create(Context context);
        }

        /**
         * The stage of the BgpConnection definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Name of the connection..
             * 
             * @param name Name of the connection.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the BgpConnection definition allowing to specify peerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies the peerAsn property: Peer ASN..
             * 
             * @param peerAsn Peer ASN.
             * @return the next definition stage.
             */
            WithCreate withPeerAsn(Long peerAsn);
        }

        /**
         * The stage of the BgpConnection definition allowing to specify peerIp.
         */
        interface WithPeerIp {
            /**
             * Specifies the peerIp property: Peer IP..
             * 
             * @param peerIp Peer IP.
             * @return the next definition stage.
             */
            WithCreate withPeerIp(String peerIp);
        }

        /**
         * The stage of the BgpConnection definition allowing to specify hubVirtualNetworkConnection.
         */
        interface WithHubVirtualNetworkConnection {
            /**
             * Specifies the hubVirtualNetworkConnection property: The reference to the HubVirtualNetworkConnection
             * resource..
             * 
             * @param hubVirtualNetworkConnection The reference to the HubVirtualNetworkConnection resource.
             * @return the next definition stage.
             */
            WithCreate withHubVirtualNetworkConnection(SubResource hubVirtualNetworkConnection);
        }
    }

    /**
     * Begins update for the BgpConnection resource.
     * 
     * @return the stage of resource update.
     */
    BgpConnection.Update update();

    /**
     * The template for BgpConnection update.
     */
    interface Update extends UpdateStages.WithName, UpdateStages.WithPeerAsn, UpdateStages.WithPeerIp,
        UpdateStages.WithHubVirtualNetworkConnection {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        BgpConnection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BgpConnection apply(Context context);
    }

    /**
     * The BgpConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the BgpConnection update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: Name of the connection..
             * 
             * @param name Name of the connection.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the BgpConnection update allowing to specify peerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies the peerAsn property: Peer ASN..
             * 
             * @param peerAsn Peer ASN.
             * @return the next definition stage.
             */
            Update withPeerAsn(Long peerAsn);
        }

        /**
         * The stage of the BgpConnection update allowing to specify peerIp.
         */
        interface WithPeerIp {
            /**
             * Specifies the peerIp property: Peer IP..
             * 
             * @param peerIp Peer IP.
             * @return the next definition stage.
             */
            Update withPeerIp(String peerIp);
        }

        /**
         * The stage of the BgpConnection update allowing to specify hubVirtualNetworkConnection.
         */
        interface WithHubVirtualNetworkConnection {
            /**
             * Specifies the hubVirtualNetworkConnection property: The reference to the HubVirtualNetworkConnection
             * resource..
             * 
             * @param hubVirtualNetworkConnection The reference to the HubVirtualNetworkConnection resource.
             * @return the next definition stage.
             */
            Update withHubVirtualNetworkConnection(SubResource hubVirtualNetworkConnection);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    BgpConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BgpConnection refresh(Context context);
}
