// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerRegistrationInner;
import java.util.Map;
import java.util.UUID;

/**
 * An immutable client-side representation of PartnerRegistration.
 */
public interface PartnerRegistration {
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
     * Gets the systemData property: The system metadata relating to Partner Registration resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the partner registration.
     * 
     * @return the provisioningState value.
     */
    PartnerRegistrationProvisioningState provisioningState();

    /**
     * Gets the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * Note: This property is marked for deprecation and is not supported in any future GA API version.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    UUID partnerRegistrationImmutableId();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerRegistrationInner object.
     * 
     * @return the inner object.
     */
    PartnerRegistrationInner innerModel();

    /**
     * The entirety of the PartnerRegistration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The PartnerRegistration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PartnerRegistration definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the PartnerRegistration definition allowing to specify location.
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
         * The stage of the PartnerRegistration definition allowing to specify parent resource.
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
         * The stage of the PartnerRegistration definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithPartnerRegistrationImmutableId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PartnerRegistration create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PartnerRegistration create(Context context);
        }

        /**
         * The stage of the PartnerRegistration definition allowing to specify tags.
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
         * The stage of the PartnerRegistration definition allowing to specify partnerRegistrationImmutableId.
         */
        interface WithPartnerRegistrationImmutableId {
            /**
             * Specifies the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
             * Note: This property is marked for deprecation and is not supported in any future GA API version.
             * 
             * @param partnerRegistrationImmutableId The immutableId of the corresponding partner registration.
             * Note: This property is marked for deprecation and is not supported in any future GA API version.
             * @return the next definition stage.
             */
            WithCreate withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId);
        }
    }

    /**
     * Begins update for the PartnerRegistration resource.
     * 
     * @return the stage of resource update.
     */
    PartnerRegistration.Update update();

    /**
     * The template for PartnerRegistration update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PartnerRegistration apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PartnerRegistration apply(Context context);
    }

    /**
     * The PartnerRegistration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PartnerRegistration update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the partner registration resource..
             * 
             * @param tags Tags of the partner registration resource.
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
    PartnerRegistration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PartnerRegistration refresh(Context context);
}
