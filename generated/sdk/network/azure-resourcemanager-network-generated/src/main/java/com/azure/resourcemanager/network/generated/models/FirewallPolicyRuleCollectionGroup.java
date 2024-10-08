// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleCollectionGroupInner;
import java.util.List;

/**
 * An immutable client-side representation of FirewallPolicyRuleCollectionGroup.
 */
public interface FirewallPolicyRuleCollectionGroup {
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
     * Gets the type property: Rule Group type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the size property: A read-only string that represents the size of the
     * FirewallPolicyRuleCollectionGroupProperties in MB. (ex 1.2MB).
     * 
     * @return the size value.
     */
    String size();

    /**
     * Gets the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     * 
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the ruleCollections property: Group of Firewall Policy rule collections.
     * 
     * @return the ruleCollections value.
     */
    List<FirewallPolicyRuleCollection> ruleCollections();

    /**
     * Gets the provisioningState property: The provisioning state of the firewall policy rule collection group
     * resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleCollectionGroupInner
     * object.
     * 
     * @return the inner object.
     */
    FirewallPolicyRuleCollectionGroupInner innerModel();

    /**
     * The entirety of the FirewallPolicyRuleCollectionGroup definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The FirewallPolicyRuleCollectionGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FirewallPolicyRuleCollectionGroup definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FirewallPolicyRuleCollectionGroup definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, firewallPolicyName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param firewallPolicyName The name of the Firewall Policy.
             * @return the next definition stage.
             */
            WithCreate withExistingFirewallPolicy(String resourceGroupName, String firewallPolicyName);
        }

        /**
         * The stage of the FirewallPolicyRuleCollectionGroup definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName, DefinitionStages.WithPriority, DefinitionStages.WithRuleCollections {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FirewallPolicyRuleCollectionGroup create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FirewallPolicyRuleCollectionGroup create(Context context);
        }

        /**
         * The stage of the FirewallPolicyRuleCollectionGroup definition allowing to specify name.
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
         * The stage of the FirewallPolicyRuleCollectionGroup definition allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority of the Firewall Policy Rule Collection Group resource..
             * 
             * @param priority Priority of the Firewall Policy Rule Collection Group resource.
             * @return the next definition stage.
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the FirewallPolicyRuleCollectionGroup definition allowing to specify ruleCollections.
         */
        interface WithRuleCollections {
            /**
             * Specifies the ruleCollections property: Group of Firewall Policy rule collections..
             * 
             * @param ruleCollections Group of Firewall Policy rule collections.
             * @return the next definition stage.
             */
            WithCreate withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections);
        }
    }

    /**
     * Begins update for the FirewallPolicyRuleCollectionGroup resource.
     * 
     * @return the stage of resource update.
     */
    FirewallPolicyRuleCollectionGroup.Update update();

    /**
     * The template for FirewallPolicyRuleCollectionGroup update.
     */
    interface Update extends UpdateStages.WithName, UpdateStages.WithPriority, UpdateStages.WithRuleCollections {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FirewallPolicyRuleCollectionGroup apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FirewallPolicyRuleCollectionGroup apply(Context context);
    }

    /**
     * The FirewallPolicyRuleCollectionGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FirewallPolicyRuleCollectionGroup update allowing to specify name.
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
         * The stage of the FirewallPolicyRuleCollectionGroup update allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority of the Firewall Policy Rule Collection Group resource..
             * 
             * @param priority Priority of the Firewall Policy Rule Collection Group resource.
             * @return the next definition stage.
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the FirewallPolicyRuleCollectionGroup update allowing to specify ruleCollections.
         */
        interface WithRuleCollections {
            /**
             * Specifies the ruleCollections property: Group of Firewall Policy rule collections..
             * 
             * @param ruleCollections Group of Firewall Policy rule collections.
             * @return the next definition stage.
             */
            Update withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FirewallPolicyRuleCollectionGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FirewallPolicyRuleCollectionGroup refresh(Context context);
}
