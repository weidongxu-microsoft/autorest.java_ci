// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerNamespaceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PartnerNamespace. */
public interface PartnerNamespace {
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
     * Gets the systemData property: The system metadata relating to Partner Namespace resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the provisioningState property: Provisioning state of the partner namespace.
     *
     * @return the provisioningState value.
     */
    PartnerNamespaceProvisioningState provisioningState();

    /**
     * Gets the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration
     * that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     *
     * @return the partnerRegistrationFullyQualifiedId value.
     */
    String partnerRegistrationFullyQualifiedId();

    /**
     * Gets the endpoint property: Endpoint for the partner namespace.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules"
     * /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

    /**
     * Gets the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the partner namespace.
     *
     * @return the disableLocalAuth value.
     */
    Boolean disableLocalAuth();

    /**
     * Gets the partnerTopicRoutingMode property: This determines if events published to this partner namespace should
     * use the source attribute in the event payload or use the channel name in the header when matching to the partner
     * topic. If none is specified, source attribute routing will be used to match the partner topic.
     *
     * @return the partnerTopicRoutingMode value.
     */
    PartnerTopicRoutingMode partnerTopicRoutingMode();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerNamespaceInner object.
     *
     * @return the inner object.
     */
    PartnerNamespaceInner innerModel();

    /** The entirety of the PartnerNamespace definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PartnerNamespace definition stages. */
    interface DefinitionStages {
        /** The first stage of the PartnerNamespace definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PartnerNamespace definition allowing to specify location. */
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
        /** The stage of the PartnerNamespace definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the PartnerNamespace definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPartnerRegistrationFullyQualifiedId,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithInboundIpRules,
                DefinitionStages.WithDisableLocalAuth,
                DefinitionStages.WithPartnerTopicRoutingMode {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PartnerNamespace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PartnerNamespace create(Context context);
        }
        /** The stage of the PartnerNamespace definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PartnerNamespace definition allowing to specify partnerRegistrationFullyQualifiedId. */
        interface WithPartnerRegistrationFullyQualifiedId {
            /**
             * Specifies the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner
             * registration that should be associated with this partner namespace. This takes the following format:
             * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}..
             *
             * @param partnerRegistrationFullyQualifiedId The fully qualified ARM Id of the partner registration that
             *     should be associated with this partner namespace. This takes the following format:
             *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
             * @return the next definition stage.
             */
            WithCreate withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId);
        }
        /** The stage of the PartnerNamespace definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties"
                 + ".InboundIpRules"
             * /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties"
                 + ".InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the PartnerNamespace definition allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
        /** The stage of the PartnerNamespace definition allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This boolean is used to enable or disable local auth. Default
             * value is false. When the property is set to true, only AAD token will be used to authenticate if user is
             * allowed to publish to the partner namespace..
             *
             * @param disableLocalAuth This boolean is used to enable or disable local auth. Default value is false.
             *     When the property is set to true, only AAD token will be used to authenticate if user is allowed to
             *     publish to the partner namespace.
             * @return the next definition stage.
             */
            WithCreate withDisableLocalAuth(Boolean disableLocalAuth);
        }
        /** The stage of the PartnerNamespace definition allowing to specify partnerTopicRoutingMode. */
        interface WithPartnerTopicRoutingMode {
            /**
             * Specifies the partnerTopicRoutingMode property: This determines if events published to this partner
             * namespace should use the source attribute in the event payload or use the channel name in the header when
             * matching to the partner topic. If none is specified, source attribute routing will be used to match the
             * partner topic..
             *
             * @param partnerTopicRoutingMode This determines if events published to this partner namespace should use
             *     the source attribute in the event payload or use the channel name in the header when matching to the
             *     partner topic. If none is specified, source attribute routing will be used to match the partner
             *     topic.
             * @return the next definition stage.
             */
            WithCreate withPartnerTopicRoutingMode(PartnerTopicRoutingMode partnerTopicRoutingMode);
        }
    }
    /**
     * Begins update for the PartnerNamespace resource.
     *
     * @return the stage of resource update.
     */
    PartnerNamespace.Update update();

    /** The template for PartnerNamespace update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithInboundIpRules,
            UpdateStages.WithDisableLocalAuth {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PartnerNamespace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PartnerNamespace apply(Context context);
    }
    /** The PartnerNamespace update stages. */
    interface UpdateStages {
        /** The stage of the PartnerNamespace update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the Partner Namespace..
             *
             * @param tags Tags of the Partner Namespace.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PartnerNamespace update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts"
                 + ".PartnerNamespaceUpdateParameterProperties.InboundIpRules"
             * /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts"
                 + ".PartnerNamespaceUpdateParameterProperties.InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the PartnerNamespace update allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
        /** The stage of the PartnerNamespace update allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This boolean is used to enable or disable local auth. Default
             * value is false. When the property is set to true, only AAD token will be used to authenticate if user is
             * allowed to publish to the partner namespace..
             *
             * @param disableLocalAuth This boolean is used to enable or disable local auth. Default value is false.
             *     When the property is set to true, only AAD token will be used to authenticate if user is allowed to
             *     publish to the partner namespace.
             * @return the next definition stage.
             */
            Update withDisableLocalAuth(Boolean disableLocalAuth);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PartnerNamespace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PartnerNamespace refresh(Context context);

    /**
     * List keys for a partner namespace.
     *
     * <p>List the two keys used to publish to a partner namespace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace along with {@link Response}.
     */
    Response<PartnerNamespaceSharedAccessKeys> listSharedAccessKeysWithResponse(Context context);

    /**
     * List keys for a partner namespace.
     *
     * <p>List the two keys used to publish to a partner namespace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    PartnerNamespaceSharedAccessKeys listSharedAccessKeys();

    /**
     * Regenerate key for a partner namespace.
     *
     * <p>Regenerate a shared access key for a partner namespace.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace along with {@link Response}.
     */
    Response<PartnerNamespaceSharedAccessKeys> regenerateKeyWithResponse(
        PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest, Context context);

    /**
     * Regenerate key for a partner namespace.
     *
     * <p>Regenerate a shared access key for a partner namespace.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    PartnerNamespaceSharedAccessKeys regenerateKey(PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest);
}
