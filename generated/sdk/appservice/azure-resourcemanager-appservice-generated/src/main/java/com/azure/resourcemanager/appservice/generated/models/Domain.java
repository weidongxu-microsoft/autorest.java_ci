// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Domain. */
public interface Domain {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the contactAdmin property: Administrative contact.
     *
     * @return the contactAdmin value.
     */
    Contact contactAdmin();

    /**
     * Gets the contactBilling property: Billing contact.
     *
     * @return the contactBilling value.
     */
    Contact contactBilling();

    /**
     * Gets the contactRegistrant property: Registrant contact.
     *
     * @return the contactRegistrant value.
     */
    Contact contactRegistrant();

    /**
     * Gets the contactTech property: Technical contact.
     *
     * @return the contactTech value.
     */
    Contact contactTech();

    /**
     * Gets the registrationStatus property: Domain registration status.
     *
     * @return the registrationStatus value.
     */
    DomainStatus registrationStatus();

    /**
     * Gets the provisioningState property: Domain provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the nameServers property: Name servers.
     *
     * @return the nameServers value.
     */
    List<String> nameServers();

    /**
     * Gets the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the privacy value.
     */
    Boolean privacy();

    /**
     * Gets the createdTime property: Domain creation timestamp.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the expirationTime property: Domain expiration timestamp.
     *
     * @return the expirationTime value.
     */
    OffsetDateTime expirationTime();

    /**
     * Gets the lastRenewedTime property: Timestamp when the domain was renewed last time.
     *
     * @return the lastRenewedTime value.
     */
    OffsetDateTime lastRenewedTime();

    /**
     * Gets the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value.
     */
    Boolean autoRenew();

    /**
     * Gets the readyForDnsRecordManagement property: &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to
     * App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if
     * domain registration status is active and it is hosted on name servers Azure has programmatic access to.
     *
     * @return the readyForDnsRecordManagement value.
     */
    Boolean readyForDnsRecordManagement();

    /**
     * Gets the managedHostNames property: All hostnames derived from the domain and assigned to Azure resources.
     *
     * @return the managedHostNames value.
     */
    List<Hostname> managedHostNames();

    /**
     * Gets the consent property: Legal agreement consent.
     *
     * @return the consent value.
     */
    DomainPurchaseConsent consent();

    /**
     * Gets the domainNotRenewableReasons property: Reasons why domain is not renewable.
     *
     * @return the domainNotRenewableReasons value.
     */
    List<DomainPropertiesDomainNotRenewableReasonsItem> domainNotRenewableReasons();

    /**
     * Gets the dnsType property: Current DNS type.
     *
     * @return the dnsType value.
     */
    DnsType dnsType();

    /**
     * Gets the dnsZoneId property: Azure DNS Zone to use.
     *
     * @return the dnsZoneId value.
     */
    String dnsZoneId();

    /**
     * Gets the targetDnsType property: Target DNS type (would be used for migration).
     *
     * @return the targetDnsType value.
     */
    DnsType targetDnsType();

    /**
     * Gets the authCode property: The authCode property.
     *
     * @return the authCode value.
     */
    String authCode();

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
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DomainInner object.
     *
     * @return the inner object.
     */
    DomainInner innerModel();

    /** The entirety of the Domain definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Domain definition stages. */
    interface DefinitionStages {
        /** The first stage of the Domain definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Domain definition allowing to specify location. */
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
        /** The stage of the Domain definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Domain definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithKind,
                DefinitionStages.WithContactAdmin,
                DefinitionStages.WithContactBilling,
                DefinitionStages.WithContactRegistrant,
                DefinitionStages.WithContactTech,
                DefinitionStages.WithPrivacy,
                DefinitionStages.WithAutoRenew,
                DefinitionStages.WithConsent,
                DefinitionStages.WithDnsType,
                DefinitionStages.WithDnsZoneId,
                DefinitionStages.WithTargetDnsType,
                DefinitionStages.WithAuthCode {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Domain create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Domain create(Context context);
        }
        /** The stage of the Domain definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Domain definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the Domain definition allowing to specify contactAdmin. */
        interface WithContactAdmin {
            /**
             * Specifies the contactAdmin property: Administrative contact..
             *
             * @param contactAdmin Administrative contact.
             * @return the next definition stage.
             */
            WithCreate withContactAdmin(Contact contactAdmin);
        }
        /** The stage of the Domain definition allowing to specify contactBilling. */
        interface WithContactBilling {
            /**
             * Specifies the contactBilling property: Billing contact..
             *
             * @param contactBilling Billing contact.
             * @return the next definition stage.
             */
            WithCreate withContactBilling(Contact contactBilling);
        }
        /** The stage of the Domain definition allowing to specify contactRegistrant. */
        interface WithContactRegistrant {
            /**
             * Specifies the contactRegistrant property: Registrant contact..
             *
             * @param contactRegistrant Registrant contact.
             * @return the next definition stage.
             */
            WithCreate withContactRegistrant(Contact contactRegistrant);
        }
        /** The stage of the Domain definition allowing to specify contactTech. */
        interface WithContactTech {
            /**
             * Specifies the contactTech property: Technical contact..
             *
             * @param contactTech Technical contact.
             * @return the next definition stage.
             */
            WithCreate withContactTech(Contact contactTech);
        }
        /** The stage of the Domain definition allowing to specify privacy. */
        interface WithPrivacy {
            /**
             * Specifies the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this
             * domain; otherwise, &lt;code&gt;false&lt;/code&gt;..
             *
             * @param privacy &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
             *     &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            WithCreate withPrivacy(Boolean privacy);
        }
        /** The stage of the Domain definition allowing to specify autoRenew. */
        interface WithAutoRenew {
            /**
             * Specifies the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically
             * renewed; otherwise, &lt;code&gt;false&lt;/code&gt;..
             *
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise,
             *     &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            WithCreate withAutoRenew(Boolean autoRenew);
        }
        /** The stage of the Domain definition allowing to specify consent. */
        interface WithConsent {
            /**
             * Specifies the consent property: Legal agreement consent..
             *
             * @param consent Legal agreement consent.
             * @return the next definition stage.
             */
            WithCreate withConsent(DomainPurchaseConsent consent);
        }
        /** The stage of the Domain definition allowing to specify dnsType. */
        interface WithDnsType {
            /**
             * Specifies the dnsType property: Current DNS type.
             *
             * @param dnsType Current DNS type.
             * @return the next definition stage.
             */
            WithCreate withDnsType(DnsType dnsType);
        }
        /** The stage of the Domain definition allowing to specify dnsZoneId. */
        interface WithDnsZoneId {
            /**
             * Specifies the dnsZoneId property: Azure DNS Zone to use.
             *
             * @param dnsZoneId Azure DNS Zone to use.
             * @return the next definition stage.
             */
            WithCreate withDnsZoneId(String dnsZoneId);
        }
        /** The stage of the Domain definition allowing to specify targetDnsType. */
        interface WithTargetDnsType {
            /**
             * Specifies the targetDnsType property: Target DNS type (would be used for migration).
             *
             * @param targetDnsType Target DNS type (would be used for migration).
             * @return the next definition stage.
             */
            WithCreate withTargetDnsType(DnsType targetDnsType);
        }
        /** The stage of the Domain definition allowing to specify authCode. */
        interface WithAuthCode {
            /**
             * Specifies the authCode property: The authCode property..
             *
             * @param authCode The authCode property.
             * @return the next definition stage.
             */
            WithCreate withAuthCode(String authCode);
        }
    }
    /**
     * Begins update for the Domain resource.
     *
     * @return the stage of resource update.
     */
    Domain.Update update();

    /** The template for Domain update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithPrivacy,
            UpdateStages.WithAutoRenew,
            UpdateStages.WithDnsType,
            UpdateStages.WithDnsZoneId,
            UpdateStages.WithTargetDnsType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Domain apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Domain apply(Context context);
    }
    /** The Domain update stages. */
    interface UpdateStages {
        /** The stage of the Domain update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the Domain update allowing to specify privacy. */
        interface WithPrivacy {
            /**
             * Specifies the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this
             * domain; otherwise, &lt;code&gt;false&lt;/code&gt;..
             *
             * @param privacy &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
             *     &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            Update withPrivacy(Boolean privacy);
        }
        /** The stage of the Domain update allowing to specify autoRenew. */
        interface WithAutoRenew {
            /**
             * Specifies the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically
             * renewed; otherwise, &lt;code&gt;false&lt;/code&gt;..
             *
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise,
             *     &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            Update withAutoRenew(Boolean autoRenew);
        }
        /** The stage of the Domain update allowing to specify dnsType. */
        interface WithDnsType {
            /**
             * Specifies the dnsType property: Current DNS type.
             *
             * @param dnsType Current DNS type.
             * @return the next definition stage.
             */
            Update withDnsType(DnsType dnsType);
        }
        /** The stage of the Domain update allowing to specify dnsZoneId. */
        interface WithDnsZoneId {
            /**
             * Specifies the dnsZoneId property: Azure DNS Zone to use.
             *
             * @param dnsZoneId Azure DNS Zone to use.
             * @return the next definition stage.
             */
            Update withDnsZoneId(String dnsZoneId);
        }
        /** The stage of the Domain update allowing to specify targetDnsType. */
        interface WithTargetDnsType {
            /**
             * Specifies the targetDnsType property: Target DNS type (would be used for migration).
             *
             * @param targetDnsType Target DNS type (would be used for migration).
             * @return the next definition stage.
             */
            Update withTargetDnsType(DnsType targetDnsType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Domain refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Domain refresh(Context context);

    /**
     * Description for Renew a domain.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void renew();

    /**
     * Description for Renew a domain.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> renewWithResponse(Context context);
}
