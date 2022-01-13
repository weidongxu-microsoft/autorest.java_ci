// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import java.util.List;

/** Resource collection API of AppServiceCertificateOrders. */
public interface AppServiceCertificateOrders {
    /**
     * Description for List all certificate orders in a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    PagedIterable<AppServiceCertificateOrder> list();

    /**
     * Description for List all certificate orders in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    PagedIterable<AppServiceCertificateOrder> list(Context context);

    /**
     * Description for Validate information for a certificate order.
     *
     * @param appServiceCertificateOrder Information for a certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validatePurchaseInformation(AppServiceCertificateOrderInner appServiceCertificateOrder);

    /**
     * Description for Validate information for a certificate order.
     *
     * @param appServiceCertificateOrder Information for a certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> validatePurchaseInformationWithResponse(
        AppServiceCertificateOrderInner appServiceCertificateOrder, Context context);

    /**
     * Description for Get certificate orders in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    PagedIterable<AppServiceCertificateOrder> listByResourceGroup(String resourceGroupName);

    /**
     * Description for Get certificate orders in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate orders.
     */
    PagedIterable<AppServiceCertificateOrder> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Description for Get a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order..
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order.
     */
    AppServiceCertificateOrder getByResourceGroup(String resourceGroupName, String certificateOrderName);

    /**
     * Description for Get a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order..
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order along with {@link Response}.
     */
    Response<AppServiceCertificateOrder> getByResourceGroupWithResponse(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Description for Delete an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String certificateOrderName);

    /**
     * Description for Delete an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Description for List all certificates associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    PagedIterable<AppServiceCertificateResource> listCertificates(
        String resourceGroupName, String certificateOrderName);

    /**
     * Description for List all certificates associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificate order certificates.
     */
    PagedIterable<AppServiceCertificateResource> listCertificates(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Description for Get the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure.
     */
    AppServiceCertificateResource getCertificate(String resourceGroupName, String certificateOrderName, String name);

    /**
     * Description for Get the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure along with {@link
     *     Response}.
     */
    Response<AppServiceCertificateResource> getCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Description for Delete the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCertificate(String resourceGroupName, String certificateOrderName, String name);

    /**
     * Description for Delete the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteCertificateWithResponse(
        String resourceGroupName, String certificateOrderName, String name, Context context);

    /**
     * Description for Reissue an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reissue(
        String resourceGroupName,
        String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest);

    /**
     * Description for Reissue an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> reissueWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest,
        Context context);

    /**
     * Description for Renew an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param renewCertificateOrderRequest Renew parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void renew(
        String resourceGroupName,
        String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest);

    /**
     * Description for Renew an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param renewCertificateOrderRequest Renew parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> renewWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest,
        Context context);

    /**
     * Description for Resend certificate email.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resendEmail(String resourceGroupName, String certificateOrderName);

    /**
     * Description for Resend certificate email.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> resendEmailWithResponse(String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Resend domain verification ownership email containing steps on how to verify a domain for a given certificate
     * order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param nameIdentifier Email address.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resendRequestEmails(String resourceGroupName, String certificateOrderName, NameIdentifierInner nameIdentifier);

    /**
     * Resend domain verification ownership email containing steps on how to verify a domain for a given certificate
     * order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param nameIdentifier Email address.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> resendRequestEmailsWithResponse(
        String resourceGroupName, String certificateOrderName, NameIdentifierInner nameIdentifier, Context context);

    /**
     * This method is used to obtain the site seal information for an issued certificate. A site seal is a graphic that
     * the certificate purchaser can embed on their web site to show their visitors information about their SSL
     * certificate. If a web site visitor clicks on the site seal image, a pop-up page is displayed that contains
     * detailed information about the SSL certificate. The site seal token is used to link the site seal graphic image
     * to the appropriate certificate details pop-up page display when a user clicks on the site seal. The site seal
     * images are expected to be static images and hosted by the reseller, to minimize delays for customer page load
     * times.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param siteSealRequest Site seal request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal.
     */
    SiteSeal retrieveSiteSeal(String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest);

    /**
     * This method is used to obtain the site seal information for an issued certificate. A site seal is a graphic that
     * the certificate purchaser can embed on their web site to show their visitors information about their SSL
     * certificate. If a web site visitor clicks on the site seal image, a pop-up page is displayed that contains
     * detailed information about the SSL certificate. The site seal token is used to link the site seal graphic image
     * to the appropriate certificate details pop-up page display when a user clicks on the site seal. The site seal
     * images are expected to be static images and hosted by the reseller, to minimize delays for customer page load
     * times.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param siteSealRequest Site seal request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return site seal along with {@link Response}.
     */
    Response<SiteSeal> retrieveSiteSealWithResponse(
        String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest, Context context);

    /**
     * Description for Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void verifyDomainOwnership(String resourceGroupName, String certificateOrderName);

    /**
     * Description for Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> verifyDomainOwnershipWithResponse(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Description for Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction.
     */
    List<CertificateOrderAction> retrieveCertificateActions(String resourceGroupName, String name);

    /**
     * Description for Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateOrderAction along with {@link Response}.
     */
    Response<List<CertificateOrderAction>> retrieveCertificateActionsWithResponse(
        String resourceGroupName, String name, Context context);

    /**
     * Description for Retrieve email history.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail.
     */
    List<CertificateEmail> retrieveCertificateEmailHistory(String resourceGroupName, String name);

    /**
     * Description for Retrieve email history.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of CertificateEmail along with {@link Response}.
     */
    Response<List<CertificateEmail>> retrieveCertificateEmailHistoryWithResponse(
        String resourceGroupName, String name, Context context);

    /**
     * Description for Get a certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order along with {@link Response}.
     */
    AppServiceCertificateOrder getById(String id);

    /**
     * Description for Get a certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate purchase order along with {@link Response}.
     */
    Response<AppServiceCertificateOrder> getByIdWithResponse(String id, Context context);

    /**
     * Description for Get the certificate associated with a certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure along with {@link
     *     Response}.
     */
    AppServiceCertificateResource getCertificateById(String id);

    /**
     * Description for Get the certificate associated with a certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return key Vault container ARM resource for a certificate that is purchased through Azure along with {@link
     *     Response}.
     */
    Response<AppServiceCertificateResource> getCertificateByIdWithResponse(String id, Context context);

    /**
     * Description for Delete an existing certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Description for Delete an existing certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Description for Delete the certificate associated with a certificate order.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCertificateById(String id);

    /**
     * Description for Delete the certificate associated with a certificate order.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteCertificateByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AppServiceCertificateOrder resource.
     *
     * @param name resource name.
     * @return the first stage of the new AppServiceCertificateOrder definition.
     */
    AppServiceCertificateOrder.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new AppServiceCertificateResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new AppServiceCertificateResource definition.
     */
    AppServiceCertificateResource.DefinitionStages.Blank defineCertificate(String name);
}
