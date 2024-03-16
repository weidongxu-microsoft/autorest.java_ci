// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyExemptionInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of PolicyExemption.
 */
public interface PolicyExemption {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @return the policyAssignmentId value.
     */
    String policyAssignmentId();

    /**
     * Gets the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     * @return the policyDefinitionReferenceIds value.
     */
    List<String> policyDefinitionReferenceIds();

    /**
     * Gets the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @return the exemptionCategory value.
     */
    ExemptionCategory exemptionCategory();

    /**
     * Gets the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
     * 
     * @return the expiresOn value.
     */
    OffsetDateTime expiresOn();

    /**
     * Gets the displayName property: The display name of the policy exemption.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: The description of the policy exemption.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the inner com.azure.resourcemanager.policy.generated.fluent.models.PolicyExemptionInner object.
     * 
     * @return the inner object.
     */
    PolicyExemptionInner innerModel();

    /**
     * The entirety of the PolicyExemption definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope,
        DefinitionStages.WithPolicyAssignmentId, DefinitionStages.WithExemptionCategory, DefinitionStages.WithCreate {
    }

    /**
     * The PolicyExemption definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PolicyExemption definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify parent resource.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * 
             * @param scope The scope of the policy exemption. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
             * @return the next definition stage.
             */
            WithPolicyAssignmentId withExistingScope(String scope);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify policyAssignmentId.
         */
        interface WithPolicyAssignmentId {
            /**
             * Specifies the policyAssignmentId property: The ID of the policy assignment that is being exempted..
             * 
             * @param policyAssignmentId The ID of the policy assignment that is being exempted.
             * @return the next definition stage.
             */
            WithExemptionCategory withPolicyAssignmentId(String policyAssignmentId);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify exemptionCategory.
         */
        interface WithExemptionCategory {
            /**
             * Specifies the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated..
             * 
             * @param exemptionCategory The policy exemption category. Possible values are Waiver and Mitigated.
             * @return the next definition stage.
             */
            WithCreate withExemptionCategory(ExemptionCategory exemptionCategory);
        }

        /**
         * The stage of the PolicyExemption definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPolicyDefinitionReferenceIds, DefinitionStages.WithExpiresOn,
            DefinitionStages.WithDisplayName, DefinitionStages.WithDescription, DefinitionStages.WithMetadata {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PolicyExemption create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PolicyExemption create(Context context);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify policyDefinitionReferenceIds.
         */
        interface WithPolicyDefinitionReferenceIds {
            /**
             * Specifies the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition..
             * 
             * @param policyDefinitionReferenceIds The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
             * @return the next definition stage.
             */
            WithCreate withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify expiresOn.
         */
        interface WithExpiresOn {
            /**
             * Specifies the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption..
             * 
             * @param expiresOn The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
             * @return the next definition stage.
             */
            WithCreate withExpiresOn(OffsetDateTime expiresOn);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify displayName.
         */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the policy exemption..
             * 
             * @param displayName The display name of the policy exemption.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the policy exemption..
             * 
             * @param description The description of the policy exemption.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the PolicyExemption definition allowing to specify metadata.
         */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs..
             * 
             * @param metadata The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Object metadata);
        }
    }

    /**
     * Begins update for the PolicyExemption resource.
     * 
     * @return the stage of resource update.
     */
    PolicyExemption.Update update();

    /**
     * The template for PolicyExemption update.
     */
    interface Update extends UpdateStages.WithPolicyAssignmentId, UpdateStages.WithPolicyDefinitionReferenceIds,
        UpdateStages.WithExemptionCategory, UpdateStages.WithExpiresOn, UpdateStages.WithDisplayName,
        UpdateStages.WithDescription, UpdateStages.WithMetadata {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PolicyExemption apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PolicyExemption apply(Context context);
    }

    /**
     * The PolicyExemption update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PolicyExemption update allowing to specify policyAssignmentId.
         */
        interface WithPolicyAssignmentId {
            /**
             * Specifies the policyAssignmentId property: The ID of the policy assignment that is being exempted..
             * 
             * @param policyAssignmentId The ID of the policy assignment that is being exempted.
             * @return the next definition stage.
             */
            Update withPolicyAssignmentId(String policyAssignmentId);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify policyDefinitionReferenceIds.
         */
        interface WithPolicyDefinitionReferenceIds {
            /**
             * Specifies the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition..
             * 
             * @param policyDefinitionReferenceIds The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
             * @return the next definition stage.
             */
            Update withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify exemptionCategory.
         */
        interface WithExemptionCategory {
            /**
             * Specifies the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated..
             * 
             * @param exemptionCategory The policy exemption category. Possible values are Waiver and Mitigated.
             * @return the next definition stage.
             */
            Update withExemptionCategory(ExemptionCategory exemptionCategory);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify expiresOn.
         */
        interface WithExpiresOn {
            /**
             * Specifies the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption..
             * 
             * @param expiresOn The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
             * @return the next definition stage.
             */
            Update withExpiresOn(OffsetDateTime expiresOn);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify displayName.
         */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the policy exemption..
             * 
             * @param displayName The display name of the policy exemption.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the policy exemption..
             * 
             * @param description The description of the policy exemption.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the PolicyExemption update allowing to specify metadata.
         */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs..
             * 
             * @param metadata The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
             * @return the next definition stage.
             */
            Update withMetadata(Object metadata);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PolicyExemption refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PolicyExemption refresh(Context context);
}
