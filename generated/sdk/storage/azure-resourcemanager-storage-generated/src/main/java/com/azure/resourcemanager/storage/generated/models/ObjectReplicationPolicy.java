// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.ObjectReplicationPolicyInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of ObjectReplicationPolicy.
 */
public interface ObjectReplicationPolicy {
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
     * Gets the policyId property: A unique id for object replication policy.
     * 
     * @return the policyId value.
     */
    String policyId();

    /**
     * Gets the enabledTime property: Indicates when the policy is enabled on the source account.
     * 
     * @return the enabledTime value.
     */
    OffsetDateTime enabledTime();

    /**
     * Gets the sourceAccount property: Required. Source account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the sourceAccount value.
     */
    String sourceAccount();

    /**
     * Gets the destinationAccount property: Required. Destination account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the destinationAccount value.
     */
    String destinationAccount();

    /**
     * Gets the rules property: The storage account object replication rules.
     * 
     * @return the rules value.
     */
    List<ObjectReplicationPolicyRule> rules();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.ObjectReplicationPolicyInner object.
     * 
     * @return the inner object.
     */
    ObjectReplicationPolicyInner innerModel();

    /**
     * The entirety of the ObjectReplicationPolicy definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ObjectReplicationPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ObjectReplicationPolicy definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ObjectReplicationPolicy definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             * 
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             * insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             * names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the ObjectReplicationPolicy definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithSourceAccount, DefinitionStages.WithDestinationAccount,
            DefinitionStages.WithRules {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ObjectReplicationPolicy create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ObjectReplicationPolicy create(Context context);
        }

        /**
         * The stage of the ObjectReplicationPolicy definition allowing to specify sourceAccount.
         */
        interface WithSourceAccount {
            /**
             * Specifies the sourceAccount property: Required. Source account name. It should be full resource id if
             * allowCrossTenantReplication set to false..
             * 
             * @param sourceAccount Required. Source account name. It should be full resource id if
             * allowCrossTenantReplication set to false.
             * @return the next definition stage.
             */
            WithCreate withSourceAccount(String sourceAccount);
        }

        /**
         * The stage of the ObjectReplicationPolicy definition allowing to specify destinationAccount.
         */
        interface WithDestinationAccount {
            /**
             * Specifies the destinationAccount property: Required. Destination account name. It should be full resource
             * id if allowCrossTenantReplication set to false..
             * 
             * @param destinationAccount Required. Destination account name. It should be full resource id if
             * allowCrossTenantReplication set to false.
             * @return the next definition stage.
             */
            WithCreate withDestinationAccount(String destinationAccount);
        }

        /**
         * The stage of the ObjectReplicationPolicy definition allowing to specify rules.
         */
        interface WithRules {
            /**
             * Specifies the rules property: The storage account object replication rules..
             * 
             * @param rules The storage account object replication rules.
             * @return the next definition stage.
             */
            WithCreate withRules(List<ObjectReplicationPolicyRule> rules);
        }
    }

    /**
     * Begins update for the ObjectReplicationPolicy resource.
     * 
     * @return the stage of resource update.
     */
    ObjectReplicationPolicy.Update update();

    /**
     * The template for ObjectReplicationPolicy update.
     */
    interface Update
        extends UpdateStages.WithSourceAccount, UpdateStages.WithDestinationAccount, UpdateStages.WithRules {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ObjectReplicationPolicy apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ObjectReplicationPolicy apply(Context context);
    }

    /**
     * The ObjectReplicationPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ObjectReplicationPolicy update allowing to specify sourceAccount.
         */
        interface WithSourceAccount {
            /**
             * Specifies the sourceAccount property: Required. Source account name. It should be full resource id if
             * allowCrossTenantReplication set to false..
             * 
             * @param sourceAccount Required. Source account name. It should be full resource id if
             * allowCrossTenantReplication set to false.
             * @return the next definition stage.
             */
            Update withSourceAccount(String sourceAccount);
        }

        /**
         * The stage of the ObjectReplicationPolicy update allowing to specify destinationAccount.
         */
        interface WithDestinationAccount {
            /**
             * Specifies the destinationAccount property: Required. Destination account name. It should be full resource
             * id if allowCrossTenantReplication set to false..
             * 
             * @param destinationAccount Required. Destination account name. It should be full resource id if
             * allowCrossTenantReplication set to false.
             * @return the next definition stage.
             */
            Update withDestinationAccount(String destinationAccount);
        }

        /**
         * The stage of the ObjectReplicationPolicy update allowing to specify rules.
         */
        interface WithRules {
            /**
             * Specifies the rules property: The storage account object replication rules..
             * 
             * @param rules The storage account object replication rules.
             * @return the next definition stage.
             */
            Update withRules(List<ObjectReplicationPolicyRule> rules);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ObjectReplicationPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ObjectReplicationPolicy refresh(Context context);
}
