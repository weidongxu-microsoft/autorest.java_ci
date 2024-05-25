// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.fluent.models.SearchServiceInner;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * An immutable client-side representation of SearchService.
 */
public interface SearchService {
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
     * Gets the sku property: The SKU of the search service, which determines price tier and capacity limits. This
     * property is required when creating a new search service.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the replicaCount property: The number of replicas in the search service. If specified, it must be a value
     * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     * @return the replicaCount value.
     */
    Integer replicaCount();

    /**
     * Gets the partitionCount property: The number of partitions in the search service; if specified, it can be 1, 2,
     * 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode
     * set to 'highDensity', the allowed values are between 1 and 3.
     * 
     * @return the partitionCount value.
     */
    Integer partitionCount();

    /**
     * Gets the hostingMode property: Applicable only for the standard3 SKU. You can set this property to enable up to 3
     * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for
     * any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this
     * value must be 'default'.
     * 
     * @return the hostingMode value.
     */
    HostingMode hostingMode();

    /**
     * Gets the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private
     * endpoint connections would be the exclusive access method.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the status property: The status of the search service. Possible values include: 'running': The search
     * service is running and no provisioning operations are underway. 'provisioning': The search service is being
     * provisioned or scaled up or down. 'deleting': The search service is being deleted. 'degraded': The search service
     * is degraded. This can occur when the underlying search units are not healthy. The search service is most likely
     * operational, but performance might be slow and some requests might be dropped. 'disabled': The search service is
     * disabled. In this state, the service will reject all API requests. 'error': The search service is in an error
     * state. 'stopped': The search service is in a subscription that's disabled. If your service is in the degraded,
     * disabled, or error states, it means the Azure AI Search team is actively investigating the underlying issue.
     * Dedicated services in these states are still chargeable based on the number of search units provisioned.
     * 
     * @return the status value.
     */
    SearchServiceStatus status();

    /**
     * Gets the statusDetails property: The details of the search service status.
     * 
     * @return the statusDetails value.
     */
    String statusDetails();

    /**
     * Gets the provisioningState property: The state of the last provisioning operation performed on the search
     * service. Provisioning is an intermediate state that occurs while service capacity is being established. After
     * capacity is set up, provisioningState changes to either 'Succeeded' or 'Failed'. Client applications can poll
     * provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search
     * Service operation to see when an operation is completed. If you are using the free service, this value tends to
     * come back as 'Succeeded' directly in the call to Create search service. This is because the free service uses
     * capacity that is already set up.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the networkRuleSet property: Network specific rules that determine how the Azure AI Search service may be
     * reached.
     * 
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * Gets the disabledDataExfiltrationOptions property: A list of data exfiltration scenarios that are explicitly
     * disallowed for the search service. Currently, the only supported value is 'All' to disable all possible data
     * export scenarios with more fine grained controls planned for the future.
     * 
     * @return the disabledDataExfiltrationOptions value.
     */
    List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions();

    /**
     * Gets the encryptionWithCmk property: Specifies any policy regarding encryption of resources (such as indexes)
     * using customer manager keys within a search service.
     * 
     * @return the encryptionWithCmk value.
     */
    EncryptionWithCmk encryptionWithCmk();

    /**
     * Gets the disableLocalAuth property: When set to true, calls to the search service will not be permitted to
     * utilize API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions' are defined.
     * 
     * @return the disableLocalAuth value.
     */
    Boolean disableLocalAuth();

    /**
     * Gets the authOptions property: Defines the options for how the data plane API of a search service authenticates
     * requests. This cannot be set if 'disableLocalAuth' is set to true.
     * 
     * @return the authOptions value.
     */
    DataPlaneAuthOptions authOptions();

    /**
     * Gets the semanticSearch property: Sets options that control the availability of semantic search. This
     * configuration is only possible for certain Azure AI Search SKUs in certain locations.
     * 
     * @return the semanticSearch value.
     */
    SearchSemanticSearch semanticSearch();

    /**
     * Gets the privateEndpointConnections property: The list of private endpoint connections to the Azure AI Search
     * service.
     * 
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the sharedPrivateLinkResources property: The list of shared private link resources managed by the Azure AI
     * Search service.
     * 
     * @return the sharedPrivateLinkResources value.
     */
    List<SharedPrivateLinkResource> sharedPrivateLinkResources();

    /**
     * Gets the etag property: A system generated property representing the service's etag that can be for optimistic
     * concurrency control during updates.
     * 
     * @return the etag value.
     */
    String etag();

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
     * Gets the inner com.azure.resourcemanager.search.generated.fluent.models.SearchServiceInner object.
     * 
     * @return the inner object.
     */
    SearchServiceInner innerModel();

    /**
     * The entirety of the SearchService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The SearchService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SearchService definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the SearchService definition allowing to specify location.
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
         * The stage of the SearchService definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group within the current subscription. You can obtain
             * this value from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the SearchService definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSku, DefinitionStages.WithIdentity,
            DefinitionStages.WithReplicaCount, DefinitionStages.WithPartitionCount, DefinitionStages.WithHostingMode,
            DefinitionStages.WithPublicNetworkAccess, DefinitionStages.WithNetworkRuleSet,
            DefinitionStages.WithDisabledDataExfiltrationOptions, DefinitionStages.WithEncryptionWithCmk,
            DefinitionStages.WithDisableLocalAuth, DefinitionStages.WithAuthOptions,
            DefinitionStages.WithSemanticSearch, DefinitionStages.WithClientRequestId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SearchService create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SearchService create(Context context);
        }

        /**
         * The stage of the SearchService definition allowing to specify tags.
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
         * The stage of the SearchService definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the search service, which determines price tier and capacity
             * limits. This property is required when creating a new search service..
             * 
             * @param sku The SKU of the search service, which determines price tier and capacity limits. This property
             * is required when creating a new search service.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the SearchService definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             * 
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the SearchService definition allowing to specify replicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies the replicaCount property: The number of replicas in the search service. If specified, it must
             * be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU..
             * 
             * @param replicaCount The number of replicas in the search service. If specified, it must be a value
             * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
             * @return the next definition stage.
             */
            WithCreate withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the SearchService definition allowing to specify partitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies the partitionCount property: The number of partitions in the search service; if specified, it
             * can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3'
             * services with hostingMode set to 'highDensity', the allowed values are between 1 and 3..
             * 
             * @param partitionCount The number of partitions in the search service; if specified, it can be 1, 2, 3, 4,
             * 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with
             * hostingMode set to 'highDensity', the allowed values are between 1 and 3.
             * @return the next definition stage.
             */
            WithCreate withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the SearchService definition allowing to specify hostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies the hostingMode property: Applicable only for the standard3 SKU. You can set this property to
             * enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the
             * maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or
             * 'highDensity'. For all other SKUs, this value must be 'default'..
             * 
             * @param hostingMode Applicable only for the standard3 SKU. You can set this property to enable up to 3
             * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes
             * allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all
             * other SKUs, this value must be 'default'.
             * @return the next definition stage.
             */
            WithCreate withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the SearchService definition allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes
             * on existing customer resources and templates. If set to 'disabled', traffic over public interface is not
             * allowed, and private endpoint connections would be the exclusive access method..
             * 
             * @param publicNetworkAccess This value can be set to 'enabled' to avoid breaking changes on existing
             * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and
             * private endpoint connections would be the exclusive access method.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the SearchService definition allowing to specify networkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: Network specific rules that determine how the Azure AI Search
             * service may be reached..
             * 
             * @param networkRuleSet Network specific rules that determine how the Azure AI Search service may be
             * reached.
             * @return the next definition stage.
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the SearchService definition allowing to specify disabledDataExfiltrationOptions.
         */
        interface WithDisabledDataExfiltrationOptions {
            /**
             * Specifies the disabledDataExfiltrationOptions property: A list of data exfiltration scenarios that are
             * explicitly disallowed for the search service. Currently, the only supported value is 'All' to disable all
             * possible data export scenarios with more fine grained controls planned for the future..
             * 
             * @param disabledDataExfiltrationOptions A list of data exfiltration scenarios that are explicitly
             * disallowed for the search service. Currently, the only supported value is 'All' to disable all possible
             * data export scenarios with more fine grained controls planned for the future.
             * @return the next definition stage.
             */
            WithCreate withDisabledDataExfiltrationOptions(
                List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions);
        }

        /**
         * The stage of the SearchService definition allowing to specify encryptionWithCmk.
         */
        interface WithEncryptionWithCmk {
            /**
             * Specifies the encryptionWithCmk property: Specifies any policy regarding encryption of resources (such as
             * indexes) using customer manager keys within a search service..
             * 
             * @param encryptionWithCmk Specifies any policy regarding encryption of resources (such as indexes) using
             * customer manager keys within a search service.
             * @return the next definition stage.
             */
            WithCreate withEncryptionWithCmk(EncryptionWithCmk encryptionWithCmk);
        }

        /**
         * The stage of the SearchService definition allowing to specify disableLocalAuth.
         */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: When set to true, calls to the search service will not be
             * permitted to utilize API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions'
             * are defined..
             * 
             * @param disableLocalAuth When set to true, calls to the search service will not be permitted to utilize
             * API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions' are defined.
             * @return the next definition stage.
             */
            WithCreate withDisableLocalAuth(Boolean disableLocalAuth);
        }

        /**
         * The stage of the SearchService definition allowing to specify authOptions.
         */
        interface WithAuthOptions {
            /**
             * Specifies the authOptions property: Defines the options for how the data plane API of a search service
             * authenticates requests. This cannot be set if 'disableLocalAuth' is set to true..
             * 
             * @param authOptions Defines the options for how the data plane API of a search service authenticates
             * requests. This cannot be set if 'disableLocalAuth' is set to true.
             * @return the next definition stage.
             */
            WithCreate withAuthOptions(DataPlaneAuthOptions authOptions);
        }

        /**
         * The stage of the SearchService definition allowing to specify semanticSearch.
         */
        interface WithSemanticSearch {
            /**
             * Specifies the semanticSearch property: Sets options that control the availability of semantic search.
             * This configuration is only possible for certain Azure AI Search SKUs in certain locations..
             * 
             * @param semanticSearch Sets options that control the availability of semantic search. This configuration
             * is only possible for certain Azure AI Search SKUs in certain locations.
             * @return the next definition stage.
             */
            WithCreate withSemanticSearch(SearchSemanticSearch semanticSearch);
        }

        /**
         * The stage of the SearchService definition allowing to specify clientRequestId.
         */
        interface WithClientRequestId {
            /**
             * Specifies the clientRequestId property: A client-generated GUID value that identifies this request. If
             * specified, this will be included in response information as a way to track the request..
             * 
             * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this
             * will be included in response information as a way to track the request.
             * @return the next definition stage.
             */
            WithCreate withClientRequestId(UUID clientRequestId);
        }
    }

    /**
     * Begins update for the SearchService resource.
     * 
     * @return the stage of resource update.
     */
    SearchService.Update update();

    /**
     * The template for SearchService update.
     */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithSku, UpdateStages.WithIdentity, UpdateStages.WithReplicaCount,
        UpdateStages.WithPartitionCount, UpdateStages.WithHostingMode, UpdateStages.WithPublicNetworkAccess,
        UpdateStages.WithNetworkRuleSet, UpdateStages.WithDisabledDataExfiltrationOptions,
        UpdateStages.WithEncryptionWithCmk, UpdateStages.WithDisableLocalAuth, UpdateStages.WithAuthOptions,
        UpdateStages.WithSemanticSearch, UpdateStages.WithClientRequestId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SearchService apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SearchService apply(Context context);
    }

    /**
     * The SearchService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SearchService update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Tags to help categorize the resource in the Azure portal..
             * 
             * @param tags Tags to help categorize the resource in the Azure portal.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SearchService update allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the search service, which determines price tier and capacity
             * limits. This property is required when creating a new search service..
             * 
             * @param sku The SKU of the search service, which determines price tier and capacity limits. This property
             * is required when creating a new search service.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the SearchService update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Details about the search service identity. A null value indicates that
             * the search service has no identity assigned..
             * 
             * @param identity Details about the search service identity. A null value indicates that the search service
             * has no identity assigned.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the SearchService update allowing to specify replicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies the replicaCount property: The number of replicas in the search service. If specified, it must
             * be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU..
             * 
             * @param replicaCount The number of replicas in the search service. If specified, it must be a value
             * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
             * @return the next definition stage.
             */
            Update withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the SearchService update allowing to specify partitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies the partitionCount property: The number of partitions in the search service; if specified, it
             * can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3'
             * services with hostingMode set to 'highDensity', the allowed values are between 1 and 3..
             * 
             * @param partitionCount The number of partitions in the search service; if specified, it can be 1, 2, 3, 4,
             * 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with
             * hostingMode set to 'highDensity', the allowed values are between 1 and 3.
             * @return the next definition stage.
             */
            Update withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the SearchService update allowing to specify hostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies the hostingMode property: Applicable only for the standard3 SKU. You can set this property to
             * enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the
             * maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or
             * 'highDensity'. For all other SKUs, this value must be 'default'..
             * 
             * @param hostingMode Applicable only for the standard3 SKU. You can set this property to enable up to 3
             * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes
             * allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all
             * other SKUs, this value must be 'default'.
             * @return the next definition stage.
             */
            Update withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the SearchService update allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes
             * on existing customer resources and templates. If set to 'disabled', traffic over public interface is not
             * allowed, and private endpoint connections would be the exclusive access method..
             * 
             * @param publicNetworkAccess This value can be set to 'enabled' to avoid breaking changes on existing
             * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and
             * private endpoint connections would be the exclusive access method.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the SearchService update allowing to specify networkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: Network specific rules that determine how the Azure AI Search
             * service may be reached..
             * 
             * @param networkRuleSet Network specific rules that determine how the Azure AI Search service may be
             * reached.
             * @return the next definition stage.
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the SearchService update allowing to specify disabledDataExfiltrationOptions.
         */
        interface WithDisabledDataExfiltrationOptions {
            /**
             * Specifies the disabledDataExfiltrationOptions property: A list of data exfiltration scenarios that are
             * explicitly disallowed for the search service. Currently, the only supported value is 'All' to disable all
             * possible data export scenarios with more fine grained controls planned for the future..
             * 
             * @param disabledDataExfiltrationOptions A list of data exfiltration scenarios that are explicitly
             * disallowed for the search service. Currently, the only supported value is 'All' to disable all possible
             * data export scenarios with more fine grained controls planned for the future.
             * @return the next definition stage.
             */
            Update withDisabledDataExfiltrationOptions(
                List<SearchDisabledDataExfiltrationOption> disabledDataExfiltrationOptions);
        }

        /**
         * The stage of the SearchService update allowing to specify encryptionWithCmk.
         */
        interface WithEncryptionWithCmk {
            /**
             * Specifies the encryptionWithCmk property: Specifies any policy regarding encryption of resources (such as
             * indexes) using customer manager keys within a search service..
             * 
             * @param encryptionWithCmk Specifies any policy regarding encryption of resources (such as indexes) using
             * customer manager keys within a search service.
             * @return the next definition stage.
             */
            Update withEncryptionWithCmk(EncryptionWithCmk encryptionWithCmk);
        }

        /**
         * The stage of the SearchService update allowing to specify disableLocalAuth.
         */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: When set to true, calls to the search service will not be
             * permitted to utilize API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions'
             * are defined..
             * 
             * @param disableLocalAuth When set to true, calls to the search service will not be permitted to utilize
             * API keys for authentication. This cannot be set to true if 'dataPlaneAuthOptions' are defined.
             * @return the next definition stage.
             */
            Update withDisableLocalAuth(Boolean disableLocalAuth);
        }

        /**
         * The stage of the SearchService update allowing to specify authOptions.
         */
        interface WithAuthOptions {
            /**
             * Specifies the authOptions property: Defines the options for how the data plane API of a search service
             * authenticates requests. This cannot be set if 'disableLocalAuth' is set to true..
             * 
             * @param authOptions Defines the options for how the data plane API of a search service authenticates
             * requests. This cannot be set if 'disableLocalAuth' is set to true.
             * @return the next definition stage.
             */
            Update withAuthOptions(DataPlaneAuthOptions authOptions);
        }

        /**
         * The stage of the SearchService update allowing to specify semanticSearch.
         */
        interface WithSemanticSearch {
            /**
             * Specifies the semanticSearch property: Sets options that control the availability of semantic search.
             * This configuration is only possible for certain Azure AI Search SKUs in certain locations..
             * 
             * @param semanticSearch Sets options that control the availability of semantic search. This configuration
             * is only possible for certain Azure AI Search SKUs in certain locations.
             * @return the next definition stage.
             */
            Update withSemanticSearch(SearchSemanticSearch semanticSearch);
        }

        /**
         * The stage of the SearchService update allowing to specify clientRequestId.
         */
        interface WithClientRequestId {
            /**
             * Specifies the clientRequestId property: A client-generated GUID value that identifies this request. If
             * specified, this will be included in response information as a way to track the request..
             * 
             * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this
             * will be included in response information as a way to track the request.
             * @return the next definition stage.
             */
            Update withClientRequestId(UUID clientRequestId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SearchService refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SearchService refresh(Context context);
}
