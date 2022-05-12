// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ShareInner;
import java.util.List;

/** An immutable client-side representation of Share. */
public interface Share {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of Share.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: Description for the share.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the shareStatus property: Current status of the share.
     *
     * @return the shareStatus value.
     */
    ShareStatus shareStatus();

    /**
     * Gets the monitoringStatus property: Current monitoring status of the share.
     *
     * @return the monitoringStatus value.
     */
    MonitoringStatus monitoringStatus();

    /**
     * Gets the azureContainerInfo property: Azure container mapping for the share.
     *
     * @return the azureContainerInfo value.
     */
    AzureContainerInfo azureContainerInfo();

    /**
     * Gets the accessProtocol property: Access protocol to be used by the share.
     *
     * @return the accessProtocol value.
     */
    ShareAccessProtocol accessProtocol();

    /**
     * Gets the userAccessRights property: Mapping of users and corresponding access rights on the share (required for
     * SMB protocol).
     *
     * @return the userAccessRights value.
     */
    List<UserAccessRight> userAccessRights();

    /**
     * Gets the clientAccessRights property: List of IP addresses and corresponding access rights on the share(required
     * for NFS protocol).
     *
     * @return the clientAccessRights value.
     */
    List<ClientAccessRight> clientAccessRights();

    /**
     * Gets the refreshDetails property: Details of the refresh job on this share.
     *
     * @return the refreshDetails value.
     */
    RefreshDetails refreshDetails();

    /**
     * Gets the shareMappings property: Share mount point to the role.
     *
     * @return the shareMappings value.
     */
    List<MountPointMap> shareMappings();

    /**
     * Gets the dataPolicy property: Data policy of the share.
     *
     * @return the dataPolicy value.
     */
    DataPolicy dataPolicy();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.generated.fluent.models.ShareInner object.
     *
     * @return the inner object.
     */
    ShareInner innerModel();

    /** The entirety of the Share definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithShareStatus,
            DefinitionStages.WithMonitoringStatus,
            DefinitionStages.WithAccessProtocol,
            DefinitionStages.WithCreate {
    }
    /** The Share definition stages. */
    interface DefinitionStages {
        /** The first stage of the Share definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Share definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies deviceName, resourceGroupName.
             *
             * @param deviceName The device name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithShareStatus withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }
        /** The stage of the Share definition allowing to specify shareStatus. */
        interface WithShareStatus {
            /**
             * Specifies the shareStatus property: Current status of the share..
             *
             * @param shareStatus Current status of the share.
             * @return the next definition stage.
             */
            WithMonitoringStatus withShareStatus(ShareStatus shareStatus);
        }
        /** The stage of the Share definition allowing to specify monitoringStatus. */
        interface WithMonitoringStatus {
            /**
             * Specifies the monitoringStatus property: Current monitoring status of the share..
             *
             * @param monitoringStatus Current monitoring status of the share.
             * @return the next definition stage.
             */
            WithAccessProtocol withMonitoringStatus(MonitoringStatus monitoringStatus);
        }
        /** The stage of the Share definition allowing to specify accessProtocol. */
        interface WithAccessProtocol {
            /**
             * Specifies the accessProtocol property: Access protocol to be used by the share..
             *
             * @param accessProtocol Access protocol to be used by the share.
             * @return the next definition stage.
             */
            WithCreate withAccessProtocol(ShareAccessProtocol accessProtocol);
        }
        /**
         * The stage of the Share definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDescription,
                DefinitionStages.WithAzureContainerInfo,
                DefinitionStages.WithUserAccessRights,
                DefinitionStages.WithClientAccessRights,
                DefinitionStages.WithRefreshDetails,
                DefinitionStages.WithDataPolicy {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Share create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Share create(Context context);
        }
        /** The stage of the Share definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description for the share..
             *
             * @param description Description for the share.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Share definition allowing to specify azureContainerInfo. */
        interface WithAzureContainerInfo {
            /**
             * Specifies the azureContainerInfo property: Azure container mapping for the share..
             *
             * @param azureContainerInfo Azure container mapping for the share.
             * @return the next definition stage.
             */
            WithCreate withAzureContainerInfo(AzureContainerInfo azureContainerInfo);
        }
        /** The stage of the Share definition allowing to specify userAccessRights. */
        interface WithUserAccessRights {
            /**
             * Specifies the userAccessRights property: Mapping of users and corresponding access rights on the share
             * (required for SMB protocol)..
             *
             * @param userAccessRights Mapping of users and corresponding access rights on the share (required for SMB
             *     protocol).
             * @return the next definition stage.
             */
            WithCreate withUserAccessRights(List<UserAccessRight> userAccessRights);
        }
        /** The stage of the Share definition allowing to specify clientAccessRights. */
        interface WithClientAccessRights {
            /**
             * Specifies the clientAccessRights property: List of IP addresses and corresponding access rights on the
             * share(required for NFS protocol)..
             *
             * @param clientAccessRights List of IP addresses and corresponding access rights on the share(required for
             *     NFS protocol).
             * @return the next definition stage.
             */
            WithCreate withClientAccessRights(List<ClientAccessRight> clientAccessRights);
        }
        /** The stage of the Share definition allowing to specify refreshDetails. */
        interface WithRefreshDetails {
            /**
             * Specifies the refreshDetails property: Details of the refresh job on this share..
             *
             * @param refreshDetails Details of the refresh job on this share.
             * @return the next definition stage.
             */
            WithCreate withRefreshDetails(RefreshDetails refreshDetails);
        }
        /** The stage of the Share definition allowing to specify dataPolicy. */
        interface WithDataPolicy {
            /**
             * Specifies the dataPolicy property: Data policy of the share..
             *
             * @param dataPolicy Data policy of the share.
             * @return the next definition stage.
             */
            WithCreate withDataPolicy(DataPolicy dataPolicy);
        }
    }
    /**
     * Begins update for the Share resource.
     *
     * @return the stage of resource update.
     */
    Share.Update update();

    /** The template for Share update. */
    interface Update
        extends UpdateStages.WithDescription,
            UpdateStages.WithShareStatus,
            UpdateStages.WithMonitoringStatus,
            UpdateStages.WithAzureContainerInfo,
            UpdateStages.WithAccessProtocol,
            UpdateStages.WithUserAccessRights,
            UpdateStages.WithClientAccessRights,
            UpdateStages.WithRefreshDetails,
            UpdateStages.WithDataPolicy {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Share apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Share apply(Context context);
    }
    /** The Share update stages. */
    interface UpdateStages {
        /** The stage of the Share update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description for the share..
             *
             * @param description Description for the share.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Share update allowing to specify shareStatus. */
        interface WithShareStatus {
            /**
             * Specifies the shareStatus property: Current status of the share..
             *
             * @param shareStatus Current status of the share.
             * @return the next definition stage.
             */
            Update withShareStatus(ShareStatus shareStatus);
        }
        /** The stage of the Share update allowing to specify monitoringStatus. */
        interface WithMonitoringStatus {
            /**
             * Specifies the monitoringStatus property: Current monitoring status of the share..
             *
             * @param monitoringStatus Current monitoring status of the share.
             * @return the next definition stage.
             */
            Update withMonitoringStatus(MonitoringStatus monitoringStatus);
        }
        /** The stage of the Share update allowing to specify azureContainerInfo. */
        interface WithAzureContainerInfo {
            /**
             * Specifies the azureContainerInfo property: Azure container mapping for the share..
             *
             * @param azureContainerInfo Azure container mapping for the share.
             * @return the next definition stage.
             */
            Update withAzureContainerInfo(AzureContainerInfo azureContainerInfo);
        }
        /** The stage of the Share update allowing to specify accessProtocol. */
        interface WithAccessProtocol {
            /**
             * Specifies the accessProtocol property: Access protocol to be used by the share..
             *
             * @param accessProtocol Access protocol to be used by the share.
             * @return the next definition stage.
             */
            Update withAccessProtocol(ShareAccessProtocol accessProtocol);
        }
        /** The stage of the Share update allowing to specify userAccessRights. */
        interface WithUserAccessRights {
            /**
             * Specifies the userAccessRights property: Mapping of users and corresponding access rights on the share
             * (required for SMB protocol)..
             *
             * @param userAccessRights Mapping of users and corresponding access rights on the share (required for SMB
             *     protocol).
             * @return the next definition stage.
             */
            Update withUserAccessRights(List<UserAccessRight> userAccessRights);
        }
        /** The stage of the Share update allowing to specify clientAccessRights. */
        interface WithClientAccessRights {
            /**
             * Specifies the clientAccessRights property: List of IP addresses and corresponding access rights on the
             * share(required for NFS protocol)..
             *
             * @param clientAccessRights List of IP addresses and corresponding access rights on the share(required for
             *     NFS protocol).
             * @return the next definition stage.
             */
            Update withClientAccessRights(List<ClientAccessRight> clientAccessRights);
        }
        /** The stage of the Share update allowing to specify refreshDetails. */
        interface WithRefreshDetails {
            /**
             * Specifies the refreshDetails property: Details of the refresh job on this share..
             *
             * @param refreshDetails Details of the refresh job on this share.
             * @return the next definition stage.
             */
            Update withRefreshDetails(RefreshDetails refreshDetails);
        }
        /** The stage of the Share update allowing to specify dataPolicy. */
        interface WithDataPolicy {
            /**
             * Specifies the dataPolicy property: Data policy of the share..
             *
             * @param dataPolicy Data policy of the share.
             * @return the next definition stage.
             */
            Update withDataPolicy(DataPolicy dataPolicy);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Share refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Share refresh(Context context);
}
