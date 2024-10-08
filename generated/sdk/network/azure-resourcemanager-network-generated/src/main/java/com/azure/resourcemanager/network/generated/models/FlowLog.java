// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner;
import java.util.Map;

/**
 * An immutable client-side representation of FlowLog.
 */
public interface FlowLog {
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
     * Gets the identity property: FlowLog resource Managed Identity.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the targetResourceId property: ID of network security group to which flow log will be applied.
     * 
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the targetResourceGuid property: Guid of network security group to which flow log will be applied.
     * 
     * @return the targetResourceGuid value.
     */
    String targetResourceGuid();

    /**
     * Gets the storageId property: ID of the storage account which is used to store the flow log.
     * 
     * @return the storageId value.
     */
    String storageId();

    /**
     * Gets the enabled property: Flag to enable/disable flow logging.
     * 
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the retentionPolicy property: Parameters that define the retention policy for flow log.
     * 
     * @return the retentionPolicy value.
     */
    RetentionPolicyParameters retentionPolicy();

    /**
     * Gets the format property: Parameters that define the flow log format.
     * 
     * @return the format value.
     */
    FlowLogFormatParameters format();

    /**
     * Gets the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     * 
     * @return the flowAnalyticsConfiguration value.
     */
    TrafficAnalyticsProperties flowAnalyticsConfiguration();

    /**
     * Gets the provisioningState property: The provisioning state of the flow log.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner object.
     * 
     * @return the inner object.
     */
    FlowLogInner innerModel();

    /**
     * The entirety of the FlowLog definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The FlowLog definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FlowLog definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the FlowLog definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the FlowLog definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkWatcherName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param networkWatcherName The name of the network watcher.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }

        /**
         * The stage of the FlowLog definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithTargetResourceId,
            DefinitionStages.WithStorageId, DefinitionStages.WithEnabled, DefinitionStages.WithRetentionPolicy,
            DefinitionStages.WithFormat, DefinitionStages.WithFlowAnalyticsConfiguration {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FlowLog create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FlowLog create(Context context);
        }

        /**
         * The stage of the FlowLog definition allowing to specify tags.
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
         * The stage of the FlowLog definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: FlowLog resource Managed Identity.
             * 
             * @param identity FlowLog resource Managed Identity.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the FlowLog definition allowing to specify targetResourceId.
         */
        interface WithTargetResourceId {
            /**
             * Specifies the targetResourceId property: ID of network security group to which flow log will be applied..
             * 
             * @param targetResourceId ID of network security group to which flow log will be applied.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceId(String targetResourceId);
        }

        /**
         * The stage of the FlowLog definition allowing to specify storageId.
         */
        interface WithStorageId {
            /**
             * Specifies the storageId property: ID of the storage account which is used to store the flow log..
             * 
             * @param storageId ID of the storage account which is used to store the flow log.
             * @return the next definition stage.
             */
            WithCreate withStorageId(String storageId);
        }

        /**
         * The stage of the FlowLog definition allowing to specify enabled.
         */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Flag to enable/disable flow logging..
             * 
             * @param enabled Flag to enable/disable flow logging.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the FlowLog definition allowing to specify retentionPolicy.
         */
        interface WithRetentionPolicy {
            /**
             * Specifies the retentionPolicy property: Parameters that define the retention policy for flow log..
             * 
             * @param retentionPolicy Parameters that define the retention policy for flow log.
             * @return the next definition stage.
             */
            WithCreate withRetentionPolicy(RetentionPolicyParameters retentionPolicy);
        }

        /**
         * The stage of the FlowLog definition allowing to specify format.
         */
        interface WithFormat {
            /**
             * Specifies the format property: Parameters that define the flow log format..
             * 
             * @param format Parameters that define the flow log format.
             * @return the next definition stage.
             */
            WithCreate withFormat(FlowLogFormatParameters format);
        }

        /**
         * The stage of the FlowLog definition allowing to specify flowAnalyticsConfiguration.
         */
        interface WithFlowAnalyticsConfiguration {
            /**
             * Specifies the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic
             * analytics..
             * 
             * @param flowAnalyticsConfiguration Parameters that define the configuration of traffic analytics.
             * @return the next definition stage.
             */
            WithCreate withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration);
        }
    }

    /**
     * Begins update for the FlowLog resource.
     * 
     * @return the stage of resource update.
     */
    FlowLog.Update update();

    /**
     * The template for FlowLog update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FlowLog apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FlowLog apply(Context context);
    }

    /**
     * The FlowLog update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FlowLog update allowing to specify tags.
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
    FlowLog refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FlowLog refresh(Context context);
}
