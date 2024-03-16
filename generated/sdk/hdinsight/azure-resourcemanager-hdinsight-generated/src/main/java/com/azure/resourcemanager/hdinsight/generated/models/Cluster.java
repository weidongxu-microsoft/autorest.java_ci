// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of Cluster.
 */
public interface Cluster {
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
     * Gets the etag property: The ETag for the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: The availability zones.
     * 
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the properties property: The properties of the cluster.
     * 
     * @return the properties value.
     */
    ClusterGetProperties properties();

    /**
     * Gets the identity property: The identity of the cluster, if configured.
     * 
     * @return the identity value.
     */
    ClusterIdentity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterInner object.
     * 
     * @return the inner object.
     */
    ClusterInner innerModel();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Cluster definition.
         */
        interface Blank extends WithResourceGroup {
        }

        /**
         * The stage of the Cluster definition allowing to specify parent resource.
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
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithTags,
            DefinitionStages.WithZones, DefinitionStages.WithProperties, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }

        /**
         * The stage of the Cluster definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The location of the cluster.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The location of the cluster.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the Cluster definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags..
             * 
             * @param tags The resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Cluster definition allowing to specify zones.
         */
        interface WithZones {
            /**
             * Specifies the zones property: The availability zones..
             * 
             * @param zones The availability zones.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the Cluster definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The cluster create parameters..
             * 
             * @param properties The cluster create parameters.
             * @return the next definition stage.
             */
            WithCreate withProperties(ClusterCreateProperties properties);
        }

        /**
         * The stage of the Cluster definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the cluster, if configured..
             * 
             * @param identity The identity of the cluster, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ClusterIdentity identity);
        }
    }

    /**
     * Begins update for the Cluster resource.
     * 
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /**
     * The template for Cluster update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }

    /**
     * The Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Cluster update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags..
             * 
             * @param tags The resource tags.
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
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     * 
     * @param parameters The parameters for the disk encryption operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateDiskEncryptionKey(ClusterDiskEncryptionParameters parameters);

    /**
     * Rotate disk encryption key of the specified HDInsight cluster.
     * 
     * @param parameters The parameters for the disk encryption operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateDiskEncryptionKey(ClusterDiskEncryptionParameters parameters, Context context);

    /**
     * Gets the gateway settings for the specified cluster.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the gateway settings for the specified cluster along with {@link Response}.
     */
    Response<GatewaySettings> getGatewaySettingsWithResponse(Context context);

    /**
     * Gets the gateway settings for the specified cluster.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the gateway settings for the specified cluster.
     */
    GatewaySettings getGatewaySettings();

    /**
     * Configures the gateway settings on the specified cluster.
     * 
     * @param parameters The cluster configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateGatewaySettings(UpdateGatewaySettingsParameters parameters);

    /**
     * Configures the gateway settings on the specified cluster.
     * 
     * @param parameters The cluster configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateGatewaySettings(UpdateGatewaySettingsParameters parameters, Context context);

    /**
     * Updates the cluster identity certificate.
     * 
     * @param parameters The cluster configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateIdentityCertificate(UpdateClusterIdentityCertificateParameters parameters);

    /**
     * Updates the cluster identity certificate.
     * 
     * @param parameters The cluster configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateIdentityCertificate(UpdateClusterIdentityCertificateParameters parameters, Context context);

    /**
     * Executes script actions on the specified HDInsight cluster.
     * 
     * @param parameters The parameters for executing script actions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on status code 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void executeScriptActions(ExecuteScriptActionParameters parameters);

    /**
     * Executes script actions on the specified HDInsight cluster.
     * 
     * @param parameters The parameters for executing script actions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on status code 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void executeScriptActions(ExecuteScriptActionParameters parameters, Context context);
}
