// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.VerifiedPartnerInner;
import java.util.UUID;

/** An immutable client-side representation of VerifiedPartner. */
public interface VerifiedPartner {
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
     * Gets the systemData property: The system metadata relating to Verified Partner resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the partnerRegistrationImmutableId property: ImmutableId of the corresponding partner registration.
     *
     * @return the partnerRegistrationImmutableId value.
     */
    UUID partnerRegistrationImmutableId();

    /**
     * Gets the organizationName property: Official name of the Partner.
     *
     * @return the organizationName value.
     */
    String organizationName();

    /**
     * Gets the partnerDisplayName property: Display name of the verified partner.
     *
     * @return the partnerDisplayName value.
     */
    String partnerDisplayName();

    /**
     * Gets the partnerTopicDetails property: Details of the partner topic scenario.
     *
     * @return the partnerTopicDetails value.
     */
    PartnerDetails partnerTopicDetails();

    /**
     * Gets the partnerDestinationDetails property: Details of the partner destination scenario.
     *
     * @return the partnerDestinationDetails value.
     */
    PartnerDetails partnerDestinationDetails();

    /**
     * Gets the provisioningState property: Provisioning state of the verified partner.
     *
     * @return the provisioningState value.
     */
    VerifiedPartnerProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.VerifiedPartnerInner object.
     *
     * @return the inner object.
     */
    VerifiedPartnerInner innerModel();
}
