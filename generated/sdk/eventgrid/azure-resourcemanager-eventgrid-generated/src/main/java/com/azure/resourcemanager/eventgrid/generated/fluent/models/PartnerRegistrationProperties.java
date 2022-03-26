// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationVisibilityState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Properties of the partner registration. */
@Fluent
public final class PartnerRegistrationProperties {
    /*
     * Provisioning state of the partner registration.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerRegistrationProvisioningState provisioningState;

    /*
     * The immutableId of the corresponding partner registration.
     */
    @JsonProperty(value = "partnerRegistrationImmutableId")
    private UUID partnerRegistrationImmutableId;

    /*
     * Official name of the partner name. For example: "Contoso".
     */
    @JsonProperty(value = "partnerName")
    private String partnerName;

    /*
     * Name of the partner resource type.
     */
    @JsonProperty(value = "partnerResourceTypeName")
    private String partnerResourceTypeName;

    /*
     * Display name of the partner resource type.
     */
    @JsonProperty(value = "partnerResourceTypeDisplayName")
    private String partnerResourceTypeDisplayName;

    /*
     * Short description of the partner resource type. The length of this
     * description should not exceed 256 characters.
     */
    @JsonProperty(value = "partnerResourceTypeDescription")
    private String partnerResourceTypeDescription;

    /*
     * Long description for the custom scenarios and integration to be
     * displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     */
    @JsonProperty(value = "longDescription")
    private String longDescription;

    /*
     * The customer service number of the publisher. The expected phone format
     * should start with a '+' sign
     * followed by the country code. The remaining digits are then followed.
     * Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid
     * phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515)
     * 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     */
    @JsonProperty(value = "partnerCustomerServiceNumber")
    private String partnerCustomerServiceNumber;

    /*
     * The extension of the customer service number of the publisher. Only
     * digits are allowed and number of digits should not exceed 10.
     */
    @JsonProperty(value = "partnerCustomerServiceExtension")
    private String partnerCustomerServiceExtension;

    /*
     * The extension of the customer service URI of the publisher.
     */
    @JsonProperty(value = "customerServiceUri")
    private String customerServiceUri;

    /*
     * URI of the partner website that can be used by Azure customers to setup
     * Event Grid
     * integration on an event source.
     */
    @JsonProperty(value = "setupUri")
    private String setupUri;

    /*
     * URI of the logo.
     */
    @JsonProperty(value = "logoUri")
    private String logoUri;

    /*
     * Visibility state of the partner registration.
     */
    @JsonProperty(value = "visibilityState")
    private PartnerRegistrationVisibilityState visibilityState;

    /*
     * List of Azure subscription Ids that are authorized to create a partner
     * namespace
     * associated with this partner registration. This is an optional property.
     * Creating
     * partner namespaces is always permitted under the same Azure subscription
     * as the one used
     * for creating the partner registration.
     */
    @JsonProperty(value = "authorizedAzureSubscriptionIds")
    private List<String> authorizedAzureSubscriptionIds;

    /**
     * Get the provisioningState property: Provisioning state of the partner registration.
     *
     * @return the provisioningState value.
     */
    public PartnerRegistrationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     *
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.partnerRegistrationImmutableId;
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     *
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        this.partnerRegistrationImmutableId = partnerRegistrationImmutableId;
        return this;
    }

    /**
     * Get the partnerName property: Official name of the partner name. For example: "Contoso".
     *
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set the partnerName property: Official name of the partner name. For example: "Contoso".
     *
     * @param partnerName the partnerName value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get the partnerResourceTypeName property: Name of the partner resource type.
     *
     * @return the partnerResourceTypeName value.
     */
    public String partnerResourceTypeName() {
        return this.partnerResourceTypeName;
    }

    /**
     * Set the partnerResourceTypeName property: Name of the partner resource type.
     *
     * @param partnerResourceTypeName the partnerResourceTypeName value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerResourceTypeName(String partnerResourceTypeName) {
        this.partnerResourceTypeName = partnerResourceTypeName;
        return this;
    }

    /**
     * Get the partnerResourceTypeDisplayName property: Display name of the partner resource type.
     *
     * @return the partnerResourceTypeDisplayName value.
     */
    public String partnerResourceTypeDisplayName() {
        return this.partnerResourceTypeDisplayName;
    }

    /**
     * Set the partnerResourceTypeDisplayName property: Display name of the partner resource type.
     *
     * @param partnerResourceTypeDisplayName the partnerResourceTypeDisplayName value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName) {
        this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
        return this;
    }

    /**
     * Get the partnerResourceTypeDescription property: Short description of the partner resource type. The length of
     * this description should not exceed 256 characters.
     *
     * @return the partnerResourceTypeDescription value.
     */
    public String partnerResourceTypeDescription() {
        return this.partnerResourceTypeDescription;
    }

    /**
     * Set the partnerResourceTypeDescription property: Short description of the partner resource type. The length of
     * this description should not exceed 256 characters.
     *
     * @param partnerResourceTypeDescription the partnerResourceTypeDescription value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerResourceTypeDescription(String partnerResourceTypeDescription) {
        this.partnerResourceTypeDescription = partnerResourceTypeDescription;
        return this;
    }

    /**
     * Get the longDescription property: Long description for the custom scenarios and integration to be displayed in
     * the portal if needed. Length of this description should not exceed 2048 characters.
     *
     * @return the longDescription value.
     */
    public String longDescription() {
        return this.longDescription;
    }

    /**
     * Set the longDescription property: Long description for the custom scenarios and integration to be displayed in
     * the portal if needed. Length of this description should not exceed 2048 characters.
     *
     * @param longDescription the longDescription value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    /**
     * Get the partnerCustomerServiceNumber property: The customer service number of the publisher. The expected phone
     * format should start with a '+' sign followed by the country code. The remaining digits are then followed. Only
     * digits and spaces are allowed and its length cannot exceed 16 digits including country code. Examples of valid
     * phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515)
     * 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
     *
     * @return the partnerCustomerServiceNumber value.
     */
    public String partnerCustomerServiceNumber() {
        return this.partnerCustomerServiceNumber;
    }

    /**
     * Set the partnerCustomerServiceNumber property: The customer service number of the publisher. The expected phone
     * format should start with a '+' sign followed by the country code. The remaining digits are then followed. Only
     * digits and spaces are allowed and its length cannot exceed 16 digits including country code. Examples of valid
     * phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515)
     * 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
     *
     * @param partnerCustomerServiceNumber the partnerCustomerServiceNumber value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerCustomerServiceNumber(String partnerCustomerServiceNumber) {
        this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
        return this;
    }

    /**
     * Get the partnerCustomerServiceExtension property: The extension of the customer service number of the publisher.
     * Only digits are allowed and number of digits should not exceed 10.
     *
     * @return the partnerCustomerServiceExtension value.
     */
    public String partnerCustomerServiceExtension() {
        return this.partnerCustomerServiceExtension;
    }

    /**
     * Set the partnerCustomerServiceExtension property: The extension of the customer service number of the publisher.
     * Only digits are allowed and number of digits should not exceed 10.
     *
     * @param partnerCustomerServiceExtension the partnerCustomerServiceExtension value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withPartnerCustomerServiceExtension(String partnerCustomerServiceExtension) {
        this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
        return this;
    }

    /**
     * Get the customerServiceUri property: The extension of the customer service URI of the publisher.
     *
     * @return the customerServiceUri value.
     */
    public String customerServiceUri() {
        return this.customerServiceUri;
    }

    /**
     * Set the customerServiceUri property: The extension of the customer service URI of the publisher.
     *
     * @param customerServiceUri the customerServiceUri value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withCustomerServiceUri(String customerServiceUri) {
        this.customerServiceUri = customerServiceUri;
        return this;
    }

    /**
     * Get the setupUri property: URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     *
     * @return the setupUri value.
     */
    public String setupUri() {
        return this.setupUri;
    }

    /**
     * Set the setupUri property: URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     *
     * @param setupUri the setupUri value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withSetupUri(String setupUri) {
        this.setupUri = setupUri;
        return this;
    }

    /**
     * Get the logoUri property: URI of the logo.
     *
     * @return the logoUri value.
     */
    public String logoUri() {
        return this.logoUri;
    }

    /**
     * Set the logoUri property: URI of the logo.
     *
     * @param logoUri the logoUri value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withLogoUri(String logoUri) {
        this.logoUri = logoUri;
        return this;
    }

    /**
     * Get the visibilityState property: Visibility state of the partner registration.
     *
     * @return the visibilityState value.
     */
    public PartnerRegistrationVisibilityState visibilityState() {
        return this.visibilityState;
    }

    /**
     * Set the visibilityState property: Visibility state of the partner registration.
     *
     * @param visibilityState the visibilityState value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withVisibilityState(PartnerRegistrationVisibilityState visibilityState) {
        this.visibilityState = visibilityState;
        return this;
    }

    /**
     * Get the authorizedAzureSubscriptionIds property: List of Azure subscription Ids that are authorized to create a
     * partner namespace associated with this partner registration. This is an optional property. Creating partner
     * namespaces is always permitted under the same Azure subscription as the one used for creating the partner
     * registration.
     *
     * @return the authorizedAzureSubscriptionIds value.
     */
    public List<String> authorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds;
    }

    /**
     * Set the authorizedAzureSubscriptionIds property: List of Azure subscription Ids that are authorized to create a
     * partner namespace associated with this partner registration. This is an optional property. Creating partner
     * namespaces is always permitted under the same Azure subscription as the one used for creating the partner
     * registration.
     *
     * @param authorizedAzureSubscriptionIds the authorizedAzureSubscriptionIds value to set.
     * @return the PartnerRegistrationProperties object itself.
     */
    public PartnerRegistrationProperties withAuthorizedAzureSubscriptionIds(
        List<String> authorizedAzureSubscriptionIds) {
        this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
