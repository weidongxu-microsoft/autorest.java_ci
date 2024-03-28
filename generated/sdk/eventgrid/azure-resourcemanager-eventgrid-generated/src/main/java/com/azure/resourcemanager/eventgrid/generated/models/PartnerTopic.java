// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerTopicInner;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * An immutable client-side representation of PartnerTopic.
 */
public interface PartnerTopic {
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
     * Gets the systemData property: The system metadata relating to Partner Topic resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the identity property: Identity information for the Partner Topic resource.
     * 
     * @return the identity value.
     */
    IdentityInfo identity();

    /**
     * Gets the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    UUID partnerRegistrationImmutableId();

    /**
     * Gets the source property: Source associated with this partner topic. This represents a unique partner resource.
     * 
     * @return the source value.
     */
    String source();

    /**
     * Gets the eventTypeInfo property: Event Type information from the corresponding event channel.
     * 
     * @return the eventTypeInfo value.
     */
    EventTypeInfo eventTypeInfo();

    /**
     * Gets the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     * 
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    OffsetDateTime expirationTimeIfNotActivatedUtc();

    /**
     * Gets the provisioningState property: Provisioning state of the partner topic.
     * 
     * @return the provisioningState value.
     */
    PartnerTopicProvisioningState provisioningState();

    /**
     * Gets the activationState property: Activation state of the partner topic.
     * 
     * @return the activationState value.
     */
    PartnerTopicActivationState activationState();

    /**
     * Gets the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     * @return the partnerTopicFriendlyDescription value.
     */
    String partnerTopicFriendlyDescription();

    /**
     * Gets the messageForActivation property: Context or helpful message that can be used during the approval process
     * by the subscriber.
     * 
     * @return the messageForActivation value.
     */
    String messageForActivation();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerTopicInner object.
     * 
     * @return the inner object.
     */
    PartnerTopicInner innerModel();

    /**
     * The entirety of the PartnerTopic definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The PartnerTopic definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PartnerTopic definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify location.
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
         * The stage of the PartnerTopic definition allowing to specify parent resource.
         */
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
         * The stage of the PartnerTopic definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithPartnerRegistrationImmutableId, DefinitionStages.WithSource,
            DefinitionStages.WithEventTypeInfo, DefinitionStages.WithExpirationTimeIfNotActivatedUtc,
            DefinitionStages.WithActivationState, DefinitionStages.WithPartnerTopicFriendlyDescription,
            DefinitionStages.WithMessageForActivation {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PartnerTopic create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PartnerTopic create(Context context);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify tags.
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
         * The stage of the PartnerTopic definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the Partner Topic resource..
             * 
             * @param identity Identity information for the Partner Topic resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityInfo identity);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify partnerRegistrationImmutableId.
         */
        interface WithPartnerRegistrationImmutableId {
            /**
             * Specifies the partnerRegistrationImmutableId property: The immutableId of the corresponding partner
             * registration..
             * 
             * @param partnerRegistrationImmutableId The immutableId of the corresponding partner registration.
             * @return the next definition stage.
             */
            WithCreate withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: Source associated with this partner topic. This represents a unique
             * partner resource..
             * 
             * @param source Source associated with this partner topic. This represents a unique partner resource.
             * @return the next definition stage.
             */
            WithCreate withSource(String source);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify eventTypeInfo.
         */
        interface WithEventTypeInfo {
            /**
             * Specifies the eventTypeInfo property: Event Type information from the corresponding event channel..
             * 
             * @param eventTypeInfo Event Type information from the corresponding event channel.
             * @return the next definition stage.
             */
            WithCreate withEventTypeInfo(EventTypeInfo eventTypeInfo);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify expirationTimeIfNotActivatedUtc.
         */
        interface WithExpirationTimeIfNotActivatedUtc {
            /**
             * Specifies the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this
             * timer expires while the partner topic is still never activated,
             * the partner topic and corresponding event channel are deleted..
             * 
             * @param expirationTimeIfNotActivatedUtc Expiration time of the partner topic. If this timer expires while
             * the partner topic is still never activated,
             * the partner topic and corresponding event channel are deleted.
             * @return the next definition stage.
             */
            WithCreate withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify activationState.
         */
        interface WithActivationState {
            /**
             * Specifies the activationState property: Activation state of the partner topic..
             * 
             * @param activationState Activation state of the partner topic.
             * @return the next definition stage.
             */
            WithCreate withActivationState(PartnerTopicActivationState activationState);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify partnerTopicFriendlyDescription.
         */
        interface WithPartnerTopicFriendlyDescription {
            /**
             * Specifies the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be
             * set by the publisher/partner to show custom description for the customer partner topic.
             * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the
             * customer..
             * 
             * @param partnerTopicFriendlyDescription Friendly description about the topic. This can be set by the
             * publisher/partner to show custom description for the customer partner topic.
             * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the
             * customer.
             * @return the next definition stage.
             */
            WithCreate withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription);
        }

        /**
         * The stage of the PartnerTopic definition allowing to specify messageForActivation.
         */
        interface WithMessageForActivation {
            /**
             * Specifies the messageForActivation property: Context or helpful message that can be used during the
             * approval process by the subscriber..
             * 
             * @param messageForActivation Context or helpful message that can be used during the approval process by
             * the subscriber.
             * @return the next definition stage.
             */
            WithCreate withMessageForActivation(String messageForActivation);
        }
    }

    /**
     * Begins update for the PartnerTopic resource.
     * 
     * @return the stage of resource update.
     */
    PartnerTopic.Update update();

    /**
     * The template for PartnerTopic update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PartnerTopic apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PartnerTopic apply(Context context);
    }

    /**
     * The PartnerTopic update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PartnerTopic update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the Partner Topic resource..
             * 
             * @param tags Tags of the Partner Topic resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the PartnerTopic update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the Partner Topic resource..
             * 
             * @param identity Identity information for the Partner Topic resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityInfo identity);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PartnerTopic refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PartnerTopic refresh(Context context);

    /**
     * Activate a partner topic.
     * 
     * Activate a newly created partner topic.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic along with {@link Response}.
     */
    Response<PartnerTopic> activateWithResponse(Context context);

    /**
     * Activate a partner topic.
     * 
     * Activate a newly created partner topic.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic.
     */
    PartnerTopic activate();

    /**
     * Deactivate a partner topic.
     * 
     * Deactivate specific partner topic.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic along with {@link Response}.
     */
    Response<PartnerTopic> deactivateWithResponse(Context context);

    /**
     * Deactivate a partner topic.
     * 
     * Deactivate specific partner topic.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic.
     */
    PartnerTopic deactivate();
}
