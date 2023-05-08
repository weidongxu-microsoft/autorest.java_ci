// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.WebApplicationFirewallPolicyInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of WebApplicationFirewallPolicy. */
public interface WebApplicationFirewallPolicy {
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
     * Gets the policySettings property: The PolicySettings for policy.
     *
     * @return the policySettings value.
     */
    PolicySettings policySettings();

    /**
     * Gets the customRules property: The custom rules inside the policy.
     *
     * @return the customRules value.
     */
    List<WebApplicationFirewallCustomRule> customRules();

    /**
     * Gets the applicationGateways property: A collection of references to application gateways.
     *
     * @return the applicationGateways value.
     */
    List<ApplicationGateway> applicationGateways();

    /**
     * Gets the provisioningState property: The provisioning state of the web application firewall policy resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceState property: Resource status of the policy.
     *
     * @return the resourceState value.
     */
    WebApplicationFirewallPolicyResourceState resourceState();

    /**
     * Gets the managedRules property: Describes the managedRules structure.
     *
     * @return the managedRules value.
     */
    ManagedRulesDefinition managedRules();

    /**
     * Gets the httpListeners property: A collection of references to application gateway http listeners.
     *
     * @return the httpListeners value.
     */
    List<SubResource> httpListeners();

    /**
     * Gets the pathBasedRules property: A collection of references to application gateway path rules.
     *
     * @return the pathBasedRules value.
     */
    List<SubResource> pathBasedRules();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.WebApplicationFirewallPolicyInner
     * object.
     *
     * @return the inner object.
     */
    WebApplicationFirewallPolicyInner innerModel();

    /** The entirety of the WebApplicationFirewallPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The WebApplicationFirewallPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the WebApplicationFirewallPolicy definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify location. */
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

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify parent resource. */
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
         * The stage of the WebApplicationFirewallPolicy definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPolicySettings,
                DefinitionStages.WithCustomRules,
                DefinitionStages.WithManagedRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            WebApplicationFirewallPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WebApplicationFirewallPolicy create(Context context);
        }

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify policySettings. */
        interface WithPolicySettings {
            /**
             * Specifies the policySettings property: The PolicySettings for policy..
             *
             * @param policySettings The PolicySettings for policy.
             * @return the next definition stage.
             */
            WithCreate withPolicySettings(PolicySettings policySettings);
        }

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify customRules. */
        interface WithCustomRules {
            /**
             * Specifies the customRules property: The custom rules inside the policy..
             *
             * @param customRules The custom rules inside the policy.
             * @return the next definition stage.
             */
            WithCreate withCustomRules(List<WebApplicationFirewallCustomRule> customRules);
        }

        /** The stage of the WebApplicationFirewallPolicy definition allowing to specify managedRules. */
        interface WithManagedRules {
            /**
             * Specifies the managedRules property: Describes the managedRules structure..
             *
             * @param managedRules Describes the managedRules structure.
             * @return the next definition stage.
             */
            WithCreate withManagedRules(ManagedRulesDefinition managedRules);
        }
    }

    /**
     * Begins update for the WebApplicationFirewallPolicy resource.
     *
     * @return the stage of resource update.
     */
    WebApplicationFirewallPolicy.Update update();

    /** The template for WebApplicationFirewallPolicy update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithPolicySettings,
            UpdateStages.WithCustomRules,
            UpdateStages.WithManagedRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        WebApplicationFirewallPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        WebApplicationFirewallPolicy apply(Context context);
    }

    /** The WebApplicationFirewallPolicy update stages. */
    interface UpdateStages {
        /** The stage of the WebApplicationFirewallPolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the WebApplicationFirewallPolicy update allowing to specify policySettings. */
        interface WithPolicySettings {
            /**
             * Specifies the policySettings property: The PolicySettings for policy..
             *
             * @param policySettings The PolicySettings for policy.
             * @return the next definition stage.
             */
            Update withPolicySettings(PolicySettings policySettings);
        }

        /** The stage of the WebApplicationFirewallPolicy update allowing to specify customRules. */
        interface WithCustomRules {
            /**
             * Specifies the customRules property: The custom rules inside the policy..
             *
             * @param customRules The custom rules inside the policy.
             * @return the next definition stage.
             */
            Update withCustomRules(List<WebApplicationFirewallCustomRule> customRules);
        }

        /** The stage of the WebApplicationFirewallPolicy update allowing to specify managedRules. */
        interface WithManagedRules {
            /**
             * Specifies the managedRules property: Describes the managedRules structure..
             *
             * @param managedRules Describes the managedRules structure.
             * @return the next definition stage.
             */
            Update withManagedRules(ManagedRulesDefinition managedRules);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    WebApplicationFirewallPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WebApplicationFirewallPolicy refresh(Context context);
}
