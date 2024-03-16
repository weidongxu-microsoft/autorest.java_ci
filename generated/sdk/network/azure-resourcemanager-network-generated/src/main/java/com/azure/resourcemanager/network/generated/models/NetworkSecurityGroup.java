// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of NetworkSecurityGroup.
 */
public interface NetworkSecurityGroup {
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
     * Gets the flushConnection property: When enabled, flows created from Network Security Group connections will be re-evaluated when rules are updates. Initial enablement will trigger re-evaluation.
     * 
     * @return the flushConnection value.
     */
    Boolean flushConnection();

    /**
     * Gets the securityRules property: A collection of security rules of the network security group.
     * 
     * @return the securityRules value.
     */
    List<SecurityRule> securityRules();

    /**
     * Gets the defaultSecurityRules property: The default security rules of network security group.
     * 
     * @return the defaultSecurityRules value.
     */
    List<SecurityRule> defaultSecurityRules();

    /**
     * Gets the networkInterfaces property: A collection of references to network interfaces.
     * 
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * Gets the subnets property: A collection of references to subnets.
     * 
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * Gets the flowLogs property: A collection of references to flow log resources.
     * 
     * @return the flowLogs value.
     */
    List<FlowLog> flowLogs();

    /**
     * Gets the resourceGuid property: The resource GUID property of the network security group resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the network security group resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner object.
     * 
     * @return the inner object.
     */
    NetworkSecurityGroupInner innerModel();

    /**
     * The entirety of the NetworkSecurityGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkSecurityGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkSecurityGroup definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the NetworkSecurityGroup definition allowing to specify location.
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
         * The stage of the NetworkSecurityGroup definition allowing to specify parent resource.
         */
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
         * The stage of the NetworkSecurityGroup definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithFlushConnection,
            DefinitionStages.WithSecurityRules {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkSecurityGroup create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkSecurityGroup create(Context context);
        }

        /**
         * The stage of the NetworkSecurityGroup definition allowing to specify tags.
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
         * The stage of the NetworkSecurityGroup definition allowing to specify flushConnection.
         */
        interface WithFlushConnection {
            /**
             * Specifies the flushConnection property: When enabled, flows created from Network Security Group connections will be re-evaluated when rules are updates. Initial enablement will trigger re-evaluation..
             * 
             * @param flushConnection When enabled, flows created from Network Security Group connections will be re-evaluated when rules are updates. Initial enablement will trigger re-evaluation.
             * @return the next definition stage.
             */
            WithCreate withFlushConnection(Boolean flushConnection);
        }

        /**
         * The stage of the NetworkSecurityGroup definition allowing to specify securityRules.
         */
        interface WithSecurityRules {
            /**
             * Specifies the securityRules property: A collection of security rules of the network security group..
             * 
             * @param securityRules A collection of security rules of the network security group.
             * @return the next definition stage.
             */
            WithCreate withSecurityRules(List<SecurityRuleInner> securityRules);
        }
    }

    /**
     * Begins update for the NetworkSecurityGroup resource.
     * 
     * @return the stage of resource update.
     */
    NetworkSecurityGroup.Update update();

    /**
     * The template for NetworkSecurityGroup update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkSecurityGroup apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkSecurityGroup apply(Context context);
    }

    /**
     * The NetworkSecurityGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkSecurityGroup update allowing to specify tags.
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
    NetworkSecurityGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkSecurityGroup refresh(Context context);
}
