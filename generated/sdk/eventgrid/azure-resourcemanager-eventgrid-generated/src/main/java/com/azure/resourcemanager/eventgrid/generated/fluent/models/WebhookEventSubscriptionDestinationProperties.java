// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeMapping;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the webhook destination properties for an event subscription. */
@Fluent
public final class WebhookEventSubscriptionDestinationProperties {
    /*
     * The URL that represents the endpoint of the destination of an event subscription.
     */
    @JsonProperty(value = "endpointUrl")
    private String endpointUrl;

    /*
     * The base URL that represents the endpoint of the destination of an event subscription.
     */
    @JsonProperty(value = "endpointBaseUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointBaseUrl;

    /*
     * Maximum number of events per batch.
     */
    @JsonProperty(value = "maxEventsPerBatch")
    private Integer maxEventsPerBatch;

    /*
     * Preferred batch size in Kilobytes.
     */
    @JsonProperty(value = "preferredBatchSizeInKilobytes")
    private Integer preferredBatchSizeInKilobytes;

    /*
     * The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in
     * delivery requests.
     */
    @JsonProperty(value = "azureActiveDirectoryTenantId")
    private String azureActiveDirectoryTenantId;

    /*
     * The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer
     * token in delivery requests.
     */
    @JsonProperty(value = "azureActiveDirectoryApplicationIdOrUri")
    private String azureActiveDirectoryApplicationIdOrUri;

    /*
     * Delivery attribute details.
     */
    @JsonProperty(value = "deliveryAttributeMappings")
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

    /*
     * Minimum TLS version that should be supported by webhook endpoint
     */
    @JsonProperty(value = "minimumTlsVersionAllowed")
    private TlsVersion minimumTlsVersionAllowed;

    /** Creates an instance of WebhookEventSubscriptionDestinationProperties class. */
    public WebhookEventSubscriptionDestinationProperties() {
    }

    /**
     * Get the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value.
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Get the endpointBaseUrl property: The base URL that represents the endpoint of the destination of an event
     * subscription.
     *
     * @return the endpointBaseUrl value.
     */
    public String endpointBaseUrl() {
        return this.endpointBaseUrl;
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        this.maxEventsPerBatch = maxEventsPerBatch;
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes;
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withPreferredBatchSizeInKilobytes(
        Integer preferredBatchSizeInKilobytes) {
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
        return this;
    }

    /**
     * Get the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryTenantId value.
     */
    public String azureActiveDirectoryTenantId() {
        return this.azureActiveDirectoryTenantId;
    }

    /**
     * Set the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryTenantId the azureActiveDirectoryTenantId value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withAzureActiveDirectoryTenantId(
        String azureActiveDirectoryTenantId) {
        this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
        return this;
    }

    /**
     * Get the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryApplicationIdOrUri value.
     */
    public String azureActiveDirectoryApplicationIdOrUri() {
        return this.azureActiveDirectoryApplicationIdOrUri;
    }

    /**
     * Set the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryApplicationIdOrUri the azureActiveDirectoryApplicationIdOrUri value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withAzureActiveDirectoryApplicationIdOrUri(
        String azureActiveDirectoryApplicationIdOrUri) {
        this.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.deliveryAttributeMappings;
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        this.deliveryAttributeMappings = deliveryAttributeMappings;
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version that should be supported by webhook endpoint.
     *
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.minimumTlsVersionAllowed;
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version that should be supported by webhook endpoint.
     *
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the WebhookEventSubscriptionDestinationProperties object itself.
     */
    public WebhookEventSubscriptionDestinationProperties withMinimumTlsVersionAllowed(
        TlsVersion minimumTlsVersionAllowed) {
        this.minimumTlsVersionAllowed = minimumTlsVersionAllowed;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryAttributeMappings() != null) {
            deliveryAttributeMappings().forEach(e -> e.validate());
        }
    }
}
