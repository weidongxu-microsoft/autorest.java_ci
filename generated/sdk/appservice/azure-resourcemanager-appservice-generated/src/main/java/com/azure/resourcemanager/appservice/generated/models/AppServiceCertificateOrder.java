// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificate;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of AppServiceCertificateOrder.
 */
public interface AppServiceCertificateOrder {
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
     * Gets the certificates property: State of the Key Vault secret.
     * 
     * @return the certificates value.
     */
    Map<String, AppServiceCertificate> certificates();

    /**
     * Gets the distinguishedName property: Certificate distinguished name.
     * 
     * @return the distinguishedName value.
     */
    String distinguishedName();

    /**
     * Gets the domainVerificationToken property: Domain verification token.
     * 
     * @return the domainVerificationToken value.
     */
    String domainVerificationToken();

    /**
     * Gets the validityInYears property: Duration in years (must be 1).
     * 
     * @return the validityInYears value.
     */
    Integer validityInYears();

    /**
     * Gets the keySize property: Certificate key size.
     * 
     * @return the keySize value.
     */
    Integer keySize();

    /**
     * Gets the productType property: Certificate product type.
     * 
     * @return the productType value.
     */
    CertificateProductType productType();

    /**
     * Gets the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the autoRenew value.
     */
    Boolean autoRenew();

    /**
     * Gets the provisioningState property: Status of certificate order.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: Current order status.
     * 
     * @return the status value.
     */
    CertificateOrderStatus status();

    /**
     * Gets the signedCertificate property: Signed certificate.
     * 
     * @return the signedCertificate value.
     */
    CertificateDetails signedCertificate();

    /**
     * Gets the csr property: Last CSR that was created for this order.
     * 
     * @return the csr value.
     */
    String csr();

    /**
     * Gets the intermediate property: Intermediate certificate.
     * 
     * @return the intermediate value.
     */
    CertificateDetails intermediate();

    /**
     * Gets the root property: Root certificate.
     * 
     * @return the root value.
     */
    CertificateDetails root();

    /**
     * Gets the serialNumber property: Current serial number of the certificate.
     * 
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the lastCertificateIssuanceTime property: Certificate last issuance time.
     * 
     * @return the lastCertificateIssuanceTime value.
     */
    OffsetDateTime lastCertificateIssuanceTime();

    /**
     * Gets the expirationTime property: Certificate expiration time.
     * 
     * @return the expirationTime value.
     */
    OffsetDateTime expirationTime();

    /**
     * Gets the isPrivateKeyExternal property: &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isPrivateKeyExternal value.
     */
    Boolean isPrivateKeyExternal();

    /**
     * Gets the appServiceCertificateNotRenewableReasons property: Reasons why App Service Certificate is not renewable at the current moment.
     * 
     * @return the appServiceCertificateNotRenewableReasons value.
     */
    List<ResourceNotRenewableReason> appServiceCertificateNotRenewableReasons();

    /**
     * Gets the nextAutoRenewalTimestamp property: Time stamp when the certificate would be auto renewed next.
     * 
     * @return the nextAutoRenewalTimestamp value.
     */
    OffsetDateTime nextAutoRenewalTimestamp();

    /**
     * Gets the contact property: Contact info.
     * 
     * @return the contact value.
     */
    CertificateOrderContact contact();

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
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner object.
     * 
     * @return the inner object.
     */
    AppServiceCertificateOrderInner innerModel();

    /**
     * The entirety of the AppServiceCertificateOrder definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The AppServiceCertificateOrder definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AppServiceCertificateOrder definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify location.
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
         * The stage of the AppServiceCertificateOrder definition allowing to specify parent resource.
         */
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
         * The stage of the AppServiceCertificateOrder definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithKind, DefinitionStages.WithCertificates,
            DefinitionStages.WithDistinguishedName, DefinitionStages.WithValidityInYears, DefinitionStages.WithKeySize,
            DefinitionStages.WithProductType, DefinitionStages.WithAutoRenew, DefinitionStages.WithCsr {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AppServiceCertificateOrder create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AppServiceCertificateOrder create(Context context);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify tags.
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
         * The stage of the AppServiceCertificateOrder definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify certificates.
         */
        interface WithCertificates {
            /**
             * Specifies the certificates property: State of the Key Vault secret..
             * 
             * @param certificates State of the Key Vault secret.
             * @return the next definition stage.
             */
            WithCreate withCertificates(Map<String, AppServiceCertificate> certificates);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify distinguishedName.
         */
        interface WithDistinguishedName {
            /**
             * Specifies the distinguishedName property: Certificate distinguished name..
             * 
             * @param distinguishedName Certificate distinguished name.
             * @return the next definition stage.
             */
            WithCreate withDistinguishedName(String distinguishedName);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify validityInYears.
         */
        interface WithValidityInYears {
            /**
             * Specifies the validityInYears property: Duration in years (must be 1)..
             * 
             * @param validityInYears Duration in years (must be 1).
             * @return the next definition stage.
             */
            WithCreate withValidityInYears(Integer validityInYears);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify keySize.
         */
        interface WithKeySize {
            /**
             * Specifies the keySize property: Certificate key size..
             * 
             * @param keySize Certificate key size.
             * @return the next definition stage.
             */
            WithCreate withKeySize(Integer keySize);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify productType.
         */
        interface WithProductType {
            /**
             * Specifies the productType property: Certificate product type..
             * 
             * @param productType Certificate product type.
             * @return the next definition stage.
             */
            WithCreate withProductType(CertificateProductType productType);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify autoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;..
             * 
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            WithCreate withAutoRenew(Boolean autoRenew);
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify csr.
         */
        interface WithCsr {
            /**
             * Specifies the csr property: Last CSR that was created for this order..
             * 
             * @param csr Last CSR that was created for this order.
             * @return the next definition stage.
             */
            WithCreate withCsr(String csr);
        }
    }

    /**
     * Begins update for the AppServiceCertificateOrder resource.
     * 
     * @return the stage of resource update.
     */
    AppServiceCertificateOrder.Update update();

    /**
     * The template for AppServiceCertificateOrder update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithCertificates, UpdateStages.WithAutoRenew {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AppServiceCertificateOrder apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AppServiceCertificateOrder apply(Context context);
    }

    /**
     * The AppServiceCertificateOrder update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AppServiceCertificateOrder update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the AppServiceCertificateOrder update allowing to specify certificates.
         */
        interface WithCertificates {
            /**
             * Specifies the certificates property: State of the Key Vault secret..
             * 
             * @param certificates State of the Key Vault secret.
             * @return the next definition stage.
             */
            Update withCertificates(Map<String, AppServiceCertificate> certificates);
        }

        /**
         * The stage of the AppServiceCertificateOrder update allowing to specify autoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;..
             * 
             * @param autoRenew &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            Update withAutoRenew(Boolean autoRenew);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AppServiceCertificateOrder refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AppServiceCertificateOrder refresh(Context context);

    /**
     * Reissue an existing certificate order.
     * 
     * Description for Reissue an existing certificate order.
     * 
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> reissueWithResponse(ReissueCertificateOrderRequest reissueCertificateOrderRequest, Context context);

    /**
     * Reissue an existing certificate order.
     * 
     * Description for Reissue an existing certificate order.
     * 
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reissue(ReissueCertificateOrderRequest reissueCertificateOrderRequest);

    /**
     * Renew an existing certificate order.
     * 
     * Description for Renew an existing certificate order.
     * 
     * @param renewCertificateOrderRequest Renew parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> renewWithResponse(RenewCertificateOrderRequest renewCertificateOrderRequest, Context context);

    /**
     * Renew an existing certificate order.
     * 
     * Description for Renew an existing certificate order.
     * 
     * @param renewCertificateOrderRequest Renew parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void renew(RenewCertificateOrderRequest renewCertificateOrderRequest);

    /**
     * Resend certificate email.
     * 
     * Description for Resend certificate email.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> resendEmailWithResponse(Context context);

    /**
     * Resend certificate email.
     * 
     * Description for Resend certificate email.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resendEmail();

    /**
     * Resend domain verification email to customer for this certificate order
     * 
     * Resend domain verification ownership email containing steps on how to verify a domain for a given certificate order.
     * 
     * @param nameIdentifier Email address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> resendRequestEmailsWithResponse(NameIdentifierInner nameIdentifier, Context context);

    /**
     * Resend domain verification email to customer for this certificate order
     * 
     * Resend domain verification ownership email containing steps on how to verify a domain for a given certificate order.
     * 
     * @param nameIdentifier Email address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resendRequestEmails(NameIdentifierInner nameIdentifier);

    /**
     * This method is used to obtain the site seal information for an issued certificate. 
     * 
     * This method is used to obtain the site seal information for an issued certificate. A site seal is a graphic that the certificate purchaser can embed on their web site to show their visitors information about their SSL certificate. If a web site visitor clicks on the site seal image, a pop-up page is displayed that contains detailed information about the SSL certificate. The site seal token is used to link the site seal graphic image to the appropriate certificate details pop-up page display when a user clicks on the site seal. The site seal images are expected to be static images and hosted by the reseller, to minimize delays for customer page load times.
     * 
     * @param siteSealRequest Site seal request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal along with {@link Response}.
     */
    Response<SiteSeal> retrieveSiteSealWithResponse(SiteSealRequest siteSealRequest, Context context);

    /**
     * This method is used to obtain the site seal information for an issued certificate. 
     * 
     * This method is used to obtain the site seal information for an issued certificate. A site seal is a graphic that the certificate purchaser can embed on their web site to show their visitors information about their SSL certificate. If a web site visitor clicks on the site seal image, a pop-up page is displayed that contains detailed information about the SSL certificate. The site seal token is used to link the site seal graphic image to the appropriate certificate details pop-up page display when a user clicks on the site seal. The site seal images are expected to be static images and hosted by the reseller, to minimize delays for customer page load times.
     * 
     * @param siteSealRequest Site seal request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal.
     */
    SiteSeal retrieveSiteSeal(SiteSealRequest siteSealRequest);

    /**
     * Verify domain ownership for this certificate order.
     * 
     * Description for Verify domain ownership for this certificate order.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> verifyDomainOwnershipWithResponse(Context context);

    /**
     * Verify domain ownership for this certificate order.
     * 
     * Description for Verify domain ownership for this certificate order.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void verifyDomainOwnership();
}
