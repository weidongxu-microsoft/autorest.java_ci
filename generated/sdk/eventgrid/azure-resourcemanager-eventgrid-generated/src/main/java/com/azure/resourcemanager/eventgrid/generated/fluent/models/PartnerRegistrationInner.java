// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerRegistrationVisibilityState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** Information about a partner registration. */
@Fluent
public final class PartnerRegistrationInner extends Resource {
    /*
     * Properties of the partner registration.
     */
    @JsonProperty(value = "properties")
    private PartnerRegistrationProperties innerProperties;

    /*
     * The system metadata relating to Partner Registration resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the partner registration.
     *
     * @return the innerProperties value.
     */
    private PartnerRegistrationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Partner Registration resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerRegistrationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerRegistrationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner registration.
     *
     * @return the provisioningState value.
     */
    public PartnerRegistrationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     *
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegistrationImmutableId();
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     *
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerRegistrationImmutableId(partnerRegistrationImmutableId);
        return this;
    }

    /**
     * Get the partnerName property: Official name of the partner name. For example: "Contoso".
     *
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerName();
    }

    /**
     * Set the partnerName property: Official name of the partner name. For example: "Contoso".
     *
     * @param partnerName the partnerName value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerName(String partnerName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerName(partnerName);
        return this;
    }

    /**
     * Get the partnerResourceTypeName property: Name of the partner resource type.
     *
     * @return the partnerResourceTypeName value.
     */
    public String partnerResourceTypeName() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerResourceTypeName();
    }

    /**
     * Set the partnerResourceTypeName property: Name of the partner resource type.
     *
     * @param partnerResourceTypeName the partnerResourceTypeName value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerResourceTypeName(String partnerResourceTypeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerResourceTypeName(partnerResourceTypeName);
        return this;
    }

    /**
     * Get the partnerResourceTypeDisplayName property: Display name of the partner resource type.
     *
     * @return the partnerResourceTypeDisplayName value.
     */
    public String partnerResourceTypeDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerResourceTypeDisplayName();
    }

    /**
     * Set the partnerResourceTypeDisplayName property: Display name of the partner resource type.
     *
     * @param partnerResourceTypeDisplayName the partnerResourceTypeDisplayName value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerResourceTypeDisplayName(partnerResourceTypeDisplayName);
        return this;
    }

    /**
     * Get the partnerResourceTypeDescription property: Short description of the partner resource type. The length of
     * this description should not exceed 256 characters.
     *
     * @return the partnerResourceTypeDescription value.
     */
    public String partnerResourceTypeDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerResourceTypeDescription();
    }

    /**
     * Set the partnerResourceTypeDescription property: Short description of the partner resource type. The length of
     * this description should not exceed 256 characters.
     *
     * @param partnerResourceTypeDescription the partnerResourceTypeDescription value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerResourceTypeDescription(String partnerResourceTypeDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerResourceTypeDescription(partnerResourceTypeDescription);
        return this;
    }

    /**
     * Get the longDescription property: Long description for the custom scenarios and integration to be displayed in
     * the portal if needed. Length of this description should not exceed 2048 characters.
     *
     * @return the longDescription value.
     */
    public String longDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().longDescription();
    }

    /**
     * Set the longDescription property: Long description for the custom scenarios and integration to be displayed in
     * the portal if needed. Length of this description should not exceed 2048 characters.
     *
     * @param longDescription the longDescription value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withLongDescription(String longDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withLongDescription(longDescription);
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
        return this.innerProperties() == null ? null : this.innerProperties().partnerCustomerServiceNumber();
    }

    /**
     * Set the partnerCustomerServiceNumber property: The customer service number of the publisher. The expected phone
     * format should start with a '+' sign followed by the country code. The remaining digits are then followed. Only
     * digits and spaces are allowed and its length cannot exceed 16 digits including country code. Examples of valid
     * phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515)
     * 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
     *
     * @param partnerCustomerServiceNumber the partnerCustomerServiceNumber value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerCustomerServiceNumber(String partnerCustomerServiceNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerCustomerServiceNumber(partnerCustomerServiceNumber);
        return this;
    }

    /**
     * Get the partnerCustomerServiceExtension property: The extension of the customer service number of the publisher.
     * Only digits are allowed and number of digits should not exceed 10.
     *
     * @return the partnerCustomerServiceExtension value.
     */
    public String partnerCustomerServiceExtension() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerCustomerServiceExtension();
    }

    /**
     * Set the partnerCustomerServiceExtension property: The extension of the customer service number of the publisher.
     * Only digits are allowed and number of digits should not exceed 10.
     *
     * @param partnerCustomerServiceExtension the partnerCustomerServiceExtension value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withPartnerCustomerServiceExtension(String partnerCustomerServiceExtension) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withPartnerCustomerServiceExtension(partnerCustomerServiceExtension);
        return this;
    }

    /**
     * Get the customerServiceUri property: The extension of the customer service URI of the publisher.
     *
     * @return the customerServiceUri value.
     */
    public String customerServiceUri() {
        return this.innerProperties() == null ? null : this.innerProperties().customerServiceUri();
    }

    /**
     * Set the customerServiceUri property: The extension of the customer service URI of the publisher.
     *
     * @param customerServiceUri the customerServiceUri value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withCustomerServiceUri(String customerServiceUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withCustomerServiceUri(customerServiceUri);
        return this;
    }

    /**
     * Get the setupUri property: URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     *
     * @return the setupUri value.
     */
    public String setupUri() {
        return this.innerProperties() == null ? null : this.innerProperties().setupUri();
    }

    /**
     * Set the setupUri property: URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     *
     * @param setupUri the setupUri value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withSetupUri(String setupUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withSetupUri(setupUri);
        return this;
    }

    /**
     * Get the logoUri property: URI of the logo.
     *
     * @return the logoUri value.
     */
    public String logoUri() {
        return this.innerProperties() == null ? null : this.innerProperties().logoUri();
    }

    /**
     * Set the logoUri property: URI of the logo.
     *
     * @param logoUri the logoUri value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withLogoUri(String logoUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withLogoUri(logoUri);
        return this;
    }

    /**
     * Get the visibilityState property: Visibility state of the partner registration.
     *
     * @return the visibilityState value.
     */
    public PartnerRegistrationVisibilityState visibilityState() {
        return this.innerProperties() == null ? null : this.innerProperties().visibilityState();
    }

    /**
     * Set the visibilityState property: Visibility state of the partner registration.
     *
     * @param visibilityState the visibilityState value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withVisibilityState(PartnerRegistrationVisibilityState visibilityState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withVisibilityState(visibilityState);
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
        return this.innerProperties() == null ? null : this.innerProperties().authorizedAzureSubscriptionIds();
    }

    /**
     * Set the authorizedAzureSubscriptionIds property: List of Azure subscription Ids that are authorized to create a
     * partner namespace associated with this partner registration. This is an optional property. Creating partner
     * namespaces is always permitted under the same Azure subscription as the one used for creating the partner
     * registration.
     *
     * @param authorizedAzureSubscriptionIds the authorizedAzureSubscriptionIds value to set.
     * @return the PartnerRegistrationInner object itself.
     */
    public PartnerRegistrationInner withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerRegistrationProperties();
        }
        this.innerProperties().withAuthorizedAzureSubscriptionIds(authorizedAzureSubscriptionIds);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
