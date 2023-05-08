// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationPolicyGroupInner;
import java.util.List;

/** An immutable client-side representation of VpnServerConfigurationPolicyGroup. */
public interface VpnServerConfigurationPolicyGroup {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the isDefault property: Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
     *
     * @return the isDefault value.
     */
    Boolean isDefault();

    /**
     * Gets the priority property: Priority for VpnServerConfigurationPolicyGroup.
     *
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the policyMembers property: Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
     *
     * @return the policyMembers value.
     */
    List<VpnServerConfigurationPolicyGroupMember> policyMembers();

    /**
     * Gets the p2SConnectionConfigurations property: List of references to P2SConnectionConfigurations.
     *
     * @return the p2SConnectionConfigurations value.
     */
    List<SubResource> p2SConnectionConfigurations();

    /**
     * Gets the provisioningState property: The provisioning state of the VpnServerConfigurationPolicyGroup resource.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationPolicyGroupInner
     * object.
     *
     * @return the inner object.
     */
    VpnServerConfigurationPolicyGroupInner innerModel();

    /** The entirety of the VpnServerConfigurationPolicyGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The VpnServerConfigurationPolicyGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the VpnServerConfigurationPolicyGroup definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the VpnServerConfigurationPolicyGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vpnServerConfigurationName.
             *
             * @param resourceGroupName The resource group name of the ConfigurationPolicyGroup.
             * @param vpnServerConfigurationName The name of the VpnServerConfiguration.
             * @return the next definition stage.
             */
            WithCreate withExistingVpnServerConfiguration(String resourceGroupName, String vpnServerConfigurationName);
        }

        /**
         * The stage of the VpnServerConfigurationPolicyGroup definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithIsDefault,
                DefinitionStages.WithPriority,
                DefinitionStages.WithPolicyMembers {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VpnServerConfigurationPolicyGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VpnServerConfigurationPolicyGroup create(Context context);
        }

        /** The stage of the VpnServerConfigurationPolicyGroup definition allowing to specify name. */
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

        /** The stage of the VpnServerConfigurationPolicyGroup definition allowing to specify isDefault. */
        interface WithIsDefault {
            /**
             * Specifies the isDefault property: Shows if this is a Default VpnServerConfigurationPolicyGroup or not..
             *
             * @param isDefault Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
             * @return the next definition stage.
             */
            WithCreate withIsDefault(Boolean isDefault);
        }

        /** The stage of the VpnServerConfigurationPolicyGroup definition allowing to specify priority. */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority for VpnServerConfigurationPolicyGroup..
             *
             * @param priority Priority for VpnServerConfigurationPolicyGroup.
             * @return the next definition stage.
             */
            WithCreate withPriority(Integer priority);
        }

        /** The stage of the VpnServerConfigurationPolicyGroup definition allowing to specify policyMembers. */
        interface WithPolicyMembers {
            /**
             * Specifies the policyMembers property: Multiple PolicyMembers for VpnServerConfigurationPolicyGroup..
             *
             * @param policyMembers Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
             * @return the next definition stage.
             */
            WithCreate withPolicyMembers(List<VpnServerConfigurationPolicyGroupMember> policyMembers);
        }
    }

    /**
     * Begins update for the VpnServerConfigurationPolicyGroup resource.
     *
     * @return the stage of resource update.
     */
    VpnServerConfigurationPolicyGroup.Update update();

    /** The template for VpnServerConfigurationPolicyGroup update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithIsDefault,
            UpdateStages.WithPriority,
            UpdateStages.WithPolicyMembers {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VpnServerConfigurationPolicyGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VpnServerConfigurationPolicyGroup apply(Context context);
    }

    /** The VpnServerConfigurationPolicyGroup update stages. */
    interface UpdateStages {
        /** The stage of the VpnServerConfigurationPolicyGroup update allowing to specify name. */
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

        /** The stage of the VpnServerConfigurationPolicyGroup update allowing to specify isDefault. */
        interface WithIsDefault {
            /**
             * Specifies the isDefault property: Shows if this is a Default VpnServerConfigurationPolicyGroup or not..
             *
             * @param isDefault Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
             * @return the next definition stage.
             */
            Update withIsDefault(Boolean isDefault);
        }

        /** The stage of the VpnServerConfigurationPolicyGroup update allowing to specify priority. */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority for VpnServerConfigurationPolicyGroup..
             *
             * @param priority Priority for VpnServerConfigurationPolicyGroup.
             * @return the next definition stage.
             */
            Update withPriority(Integer priority);
        }

        /** The stage of the VpnServerConfigurationPolicyGroup update allowing to specify policyMembers. */
        interface WithPolicyMembers {
            /**
             * Specifies the policyMembers property: Multiple PolicyMembers for VpnServerConfigurationPolicyGroup..
             *
             * @param policyMembers Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
             * @return the next definition stage.
             */
            Update withPolicyMembers(List<VpnServerConfigurationPolicyGroupMember> policyMembers);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VpnServerConfigurationPolicyGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VpnServerConfigurationPolicyGroup refresh(Context context);
}
