// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner;
import java.util.List;

/**
 * An immutable client-side representation of VirtualNetworkGatewayNatRule.
 */
public interface VirtualNetworkGatewayNatRule {
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
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: The provisioning state of the NAT Rule resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the typePropertiesType property: The type of NAT rule for VPN NAT.
     * 
     * @return the typePropertiesType value.
     */
    VpnNatRuleType typePropertiesType();

    /**
     * Gets the mode property: The Source NAT direction of a VPN NAT.
     * 
     * @return the mode value.
     */
    VpnNatRuleMode mode();

    /**
     * Gets the internalMappings property: The private IP address internal mapping for NAT.
     * 
     * @return the internalMappings value.
     */
    List<VpnNatRuleMapping> internalMappings();

    /**
     * Gets the externalMappings property: The private IP address external mapping for NAT.
     * 
     * @return the externalMappings value.
     */
    List<VpnNatRuleMapping> externalMappings();

    /**
     * Gets the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     * 
     * @return the ipConfigurationId value.
     */
    String ipConfigurationId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner
     * object.
     * 
     * @return the inner object.
     */
    VirtualNetworkGatewayNatRuleInner innerModel();

    /**
     * The entirety of the VirtualNetworkGatewayNatRule definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The VirtualNetworkGatewayNatRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VirtualNetworkGatewayNatRule definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualNetworkGatewayName.
             * 
             * @param resourceGroupName The resource group name of the Virtual Network Gateway.
             * @param virtualNetworkGatewayName The name of the gateway.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualNetworkGateway(String resourceGroupName, String virtualNetworkGatewayName);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithTypePropertiesType,
            DefinitionStages.WithMode, DefinitionStages.WithInternalMappings, DefinitionStages.WithExternalMappings,
            DefinitionStages.WithIpConfigurationId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VirtualNetworkGatewayNatRule create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkGatewayNatRule create(Context context);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             * access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify typePropertiesType.
         */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: The type of NAT rule for VPN NAT..
             * 
             * @param typePropertiesType The type of NAT rule for VPN NAT.
             * @return the next definition stage.
             */
            WithCreate withTypePropertiesType(VpnNatRuleType typePropertiesType);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify mode.
         */
        interface WithMode {
            /**
             * Specifies the mode property: The Source NAT direction of a VPN NAT..
             * 
             * @param mode The Source NAT direction of a VPN NAT.
             * @return the next definition stage.
             */
            WithCreate withMode(VpnNatRuleMode mode);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify internalMappings.
         */
        interface WithInternalMappings {
            /**
             * Specifies the internalMappings property: The private IP address internal mapping for NAT..
             * 
             * @param internalMappings The private IP address internal mapping for NAT.
             * @return the next definition stage.
             */
            WithCreate withInternalMappings(List<VpnNatRuleMapping> internalMappings);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify externalMappings.
         */
        interface WithExternalMappings {
            /**
             * Specifies the externalMappings property: The private IP address external mapping for NAT..
             * 
             * @param externalMappings The private IP address external mapping for NAT.
             * @return the next definition stage.
             */
            WithCreate withExternalMappings(List<VpnNatRuleMapping> externalMappings);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule definition allowing to specify ipConfigurationId.
         */
        interface WithIpConfigurationId {
            /**
             * Specifies the ipConfigurationId property: The IP Configuration ID this NAT rule applies to..
             * 
             * @param ipConfigurationId The IP Configuration ID this NAT rule applies to.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurationId(String ipConfigurationId);
        }
    }

    /**
     * Begins update for the VirtualNetworkGatewayNatRule resource.
     * 
     * @return the stage of resource update.
     */
    VirtualNetworkGatewayNatRule.Update update();

    /**
     * The template for VirtualNetworkGatewayNatRule update.
     */
    interface Update extends UpdateStages.WithName, UpdateStages.WithTypePropertiesType, UpdateStages.WithMode,
        UpdateStages.WithInternalMappings, UpdateStages.WithExternalMappings, UpdateStages.WithIpConfigurationId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VirtualNetworkGatewayNatRule apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkGatewayNatRule apply(Context context);
    }

    /**
     * The VirtualNetworkGatewayNatRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             * access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify typePropertiesType.
         */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: The type of NAT rule for VPN NAT..
             * 
             * @param typePropertiesType The type of NAT rule for VPN NAT.
             * @return the next definition stage.
             */
            Update withTypePropertiesType(VpnNatRuleType typePropertiesType);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify mode.
         */
        interface WithMode {
            /**
             * Specifies the mode property: The Source NAT direction of a VPN NAT..
             * 
             * @param mode The Source NAT direction of a VPN NAT.
             * @return the next definition stage.
             */
            Update withMode(VpnNatRuleMode mode);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify internalMappings.
         */
        interface WithInternalMappings {
            /**
             * Specifies the internalMappings property: The private IP address internal mapping for NAT..
             * 
             * @param internalMappings The private IP address internal mapping for NAT.
             * @return the next definition stage.
             */
            Update withInternalMappings(List<VpnNatRuleMapping> internalMappings);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify externalMappings.
         */
        interface WithExternalMappings {
            /**
             * Specifies the externalMappings property: The private IP address external mapping for NAT..
             * 
             * @param externalMappings The private IP address external mapping for NAT.
             * @return the next definition stage.
             */
            Update withExternalMappings(List<VpnNatRuleMapping> externalMappings);
        }

        /**
         * The stage of the VirtualNetworkGatewayNatRule update allowing to specify ipConfigurationId.
         */
        interface WithIpConfigurationId {
            /**
             * Specifies the ipConfigurationId property: The IP Configuration ID this NAT rule applies to..
             * 
             * @param ipConfigurationId The IP Configuration ID this NAT rule applies to.
             * @return the next definition stage.
             */
            Update withIpConfigurationId(String ipConfigurationId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    VirtualNetworkGatewayNatRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkGatewayNatRule refresh(Context context);
}
