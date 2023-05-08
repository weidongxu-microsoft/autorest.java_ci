// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyDefinitionInner;
import java.util.Map;

/** An immutable client-side representation of PolicyDefinition. */
public interface PolicyDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

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
     * Gets the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     *
     * @return the policyType value.
     */
    PolicyType policyType();

    /**
     * Gets the mode property: The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     *
     * @return the mode value.
     */
    String mode();

    /**
     * Gets the displayName property: The display name of the policy definition.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: The policy definition description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the policyRule property: The policy rule.
     *
     * @return the policyRule value.
     */
    Object policyRule();

    /**
     * Gets the metadata property: The policy definition metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the parameters property: The parameter definitions for parameters used in the policy rule. The keys are the
     * parameter names.
     *
     * @return the parameters value.
     */
    Map<String, ParameterDefinitionsValue> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.policy.generated.fluent.models.PolicyDefinitionInner object.
     *
     * @return the inner object.
     */
    PolicyDefinitionInner innerModel();

    /** The entirety of the PolicyDefinition definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /** The PolicyDefinition definition stages. */
    interface DefinitionStages {
        /** The first stage of the PolicyDefinition definition. */
        interface Blank extends WithCreate {
        }

        /**
         * The stage of the PolicyDefinition definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPolicyType,
                DefinitionStages.WithMode,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithDescription,
                DefinitionStages.WithPolicyRule,
                DefinitionStages.WithMetadata,
                DefinitionStages.WithParameters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PolicyDefinition create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PolicyDefinition create(Context context);
        }

        /** The stage of the PolicyDefinition definition allowing to specify policyType. */
        interface WithPolicyType {
            /**
             * Specifies the policyType property: The type of policy definition. Possible values are NotSpecified,
             * BuiltIn, Custom, and Static..
             *
             * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and
             *     Static.
             * @return the next definition stage.
             */
            WithCreate withPolicyType(PolicyType policyType);
        }

        /** The stage of the PolicyDefinition definition allowing to specify mode. */
        interface WithMode {
            /**
             * Specifies the mode property: The policy definition mode. Some examples are All, Indexed,
             * Microsoft.KeyVault.Data..
             *
             * @param mode The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
             * @return the next definition stage.
             */
            WithCreate withMode(String mode);
        }

        /** The stage of the PolicyDefinition definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the policy definition..
             *
             * @param displayName The display name of the policy definition.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }

        /** The stage of the PolicyDefinition definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The policy definition description..
             *
             * @param description The policy definition description.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /** The stage of the PolicyDefinition definition allowing to specify policyRule. */
        interface WithPolicyRule {
            /**
             * Specifies the policyRule property: The policy rule..
             *
             * @param policyRule The policy rule.
             * @return the next definition stage.
             */
            WithCreate withPolicyRule(Object policyRule);
        }

        /** The stage of the PolicyDefinition definition allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The policy definition metadata. Metadata is an open ended object and is
             * typically a collection of key value pairs..
             *
             * @param metadata The policy definition metadata. Metadata is an open ended object and is typically a
             *     collection of key value pairs.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Object metadata);
        }

        /** The stage of the PolicyDefinition definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameter definitions for parameters used in the policy rule. The
             * keys are the parameter names..
             *
             * @param parameters The parameter definitions for parameters used in the policy rule. The keys are the
             *     parameter names.
             * @return the next definition stage.
             */
            WithCreate withParameters(Map<String, ParameterDefinitionsValue> parameters);
        }
    }

    /**
     * Begins update for the PolicyDefinition resource.
     *
     * @return the stage of resource update.
     */
    PolicyDefinition.Update update();

    /** The template for PolicyDefinition update. */
    interface Update
        extends UpdateStages.WithPolicyType,
            UpdateStages.WithMode,
            UpdateStages.WithDisplayName,
            UpdateStages.WithDescription,
            UpdateStages.WithPolicyRule,
            UpdateStages.WithMetadata,
            UpdateStages.WithParameters {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PolicyDefinition apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PolicyDefinition apply(Context context);
    }

    /** The PolicyDefinition update stages. */
    interface UpdateStages {
        /** The stage of the PolicyDefinition update allowing to specify policyType. */
        interface WithPolicyType {
            /**
             * Specifies the policyType property: The type of policy definition. Possible values are NotSpecified,
             * BuiltIn, Custom, and Static..
             *
             * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and
             *     Static.
             * @return the next definition stage.
             */
            Update withPolicyType(PolicyType policyType);
        }

        /** The stage of the PolicyDefinition update allowing to specify mode. */
        interface WithMode {
            /**
             * Specifies the mode property: The policy definition mode. Some examples are All, Indexed,
             * Microsoft.KeyVault.Data..
             *
             * @param mode The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
             * @return the next definition stage.
             */
            Update withMode(String mode);
        }

        /** The stage of the PolicyDefinition update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the policy definition..
             *
             * @param displayName The display name of the policy definition.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }

        /** The stage of the PolicyDefinition update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The policy definition description..
             *
             * @param description The policy definition description.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /** The stage of the PolicyDefinition update allowing to specify policyRule. */
        interface WithPolicyRule {
            /**
             * Specifies the policyRule property: The policy rule..
             *
             * @param policyRule The policy rule.
             * @return the next definition stage.
             */
            Update withPolicyRule(Object policyRule);
        }

        /** The stage of the PolicyDefinition update allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The policy definition metadata. Metadata is an open ended object and is
             * typically a collection of key value pairs..
             *
             * @param metadata The policy definition metadata. Metadata is an open ended object and is typically a
             *     collection of key value pairs.
             * @return the next definition stage.
             */
            Update withMetadata(Object metadata);
        }

        /** The stage of the PolicyDefinition update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameter definitions for parameters used in the policy rule. The
             * keys are the parameter names..
             *
             * @param parameters The parameter definitions for parameters used in the policy rule. The keys are the
             *     parameter names.
             * @return the next definition stage.
             */
            Update withParameters(Map<String, ParameterDefinitionsValue> parameters);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PolicyDefinition refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PolicyDefinition refresh(Context context);
}
