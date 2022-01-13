// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppserviceGithubTokenInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.BillingMeterInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentLocationsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.GeoRegionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.PremierAddOnOfferInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceNameAvailabilityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SkuInfosInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.UserInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ValidateResponseInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetValidationFailureDetailsInner;
import com.azure.resourcemanager.appservice.generated.models.AppserviceGithubTokenRequest;
import com.azure.resourcemanager.appservice.generated.models.CsmMoveResourceEnvelope;
import com.azure.resourcemanager.appservice.generated.models.ResourceNameAvailabilityRequest;
import com.azure.resourcemanager.appservice.generated.models.SkuName;
import com.azure.resourcemanager.appservice.generated.models.ValidateRequest;
import com.azure.resourcemanager.appservice.generated.models.VnetParameters;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Description for Exchange code for GitHub access token for AppService CLI.
     *
     * @param request Appservice Github token request content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return github access token for Appservice CLI github integration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppserviceGithubTokenInner generateGithubAccessTokenForAppserviceCliAsync(AppserviceGithubTokenRequest request);

    /**
     * Description for Exchange code for GitHub access token for AppService CLI.
     *
     * @param request Appservice Github token request content.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return github access token for Appservice CLI github integration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppserviceGithubTokenInner> generateGithubAccessTokenForAppserviceCliAsyncWithResponse(
        AppserviceGithubTokenRequest request, Context context);

    /**
     * Description for Gets publishing user.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user credentials used for publishing activity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserInner getPublishingUser();

    /**
     * Description for Gets publishing user.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user credentials used for publishing activity along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserInner> getPublishingUserWithResponse(Context context);

    /**
     * Description for Updates publishing user.
     *
     * @param userDetails Details of publishing user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user credentials used for publishing activity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserInner updatePublishingUser(UserInner userDetails);

    /**
     * Description for Updates publishing user.
     *
     * @param userDetails Details of publishing user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user credentials used for publishing activity along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserInner> updatePublishingUserWithResponse(UserInner userDetails, Context context);

    /**
     * Description for Gets the source controls available for Azure websites.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of source controls.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listSourceControls();

    /**
     * Description for Gets the source controls available for Azure websites.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of source controls.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listSourceControls(Context context);

    /**
     * Description for Gets source control token.
     *
     * @param sourceControlType Type of source control.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source control OAuth token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner getSourceControl(String sourceControlType);

    /**
     * Description for Gets source control token.
     *
     * @param sourceControlType Type of source control.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source control OAuth token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> getSourceControlWithResponse(String sourceControlType, Context context);

    /**
     * Description for Updates source control token.
     *
     * @param sourceControlType Type of source control.
     * @param requestMessage Source control token information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source control OAuth token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner updateSourceControl(String sourceControlType, SourceControlInner requestMessage);

    /**
     * Description for Updates source control token.
     *
     * @param sourceControlType Type of source control.
     * @param requestMessage Source control token information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source control OAuth token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> updateSourceControlWithResponse(
        String sourceControlType, SourceControlInner requestMessage, Context context);

    /**
     * Description for Gets a list of meters for a given location.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Billing Meters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingMeterInner> list();

    /**
     * Description for Gets a list of meters for a given location.
     *
     * @param billingLocation Azure Location of billable resource.
     * @param osType App Service OS type meters used for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Billing Meters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingMeterInner> list(String billingLocation, String osType, Context context);

    /**
     * Description for Check if a resource name is available.
     *
     * @param request Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceNameAvailabilityInner checkNameAvailability(ResourceNameAvailabilityRequest request);

    /**
     * Description for Check if a resource name is available.
     *
     * @param request Name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceNameAvailabilityInner> checkNameAvailabilityWithResponse(
        ResourceNameAvailabilityRequest request, Context context);

    /**
     * Description for Gets list of available geo regions plus ministamps.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available locations (regions or App Service Environments) for deployment of App Service
     *     resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentLocationsInner getSubscriptionDeploymentLocations();

    /**
     * Description for Gets list of available geo regions plus ministamps.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available locations (regions or App Service Environments) for deployment of App Service resources
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentLocationsInner> getSubscriptionDeploymentLocationsWithResponse(Context context);

    /**
     * Description for Get a list of available geographical regions.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of geographical regions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoRegionInner> listGeoRegions();

    /**
     * Description for Get a list of available geographical regions.
     *
     * @param sku Name of SKU used to filter the regions.
     * @param linuxWorkersEnabled Specify &lt;code&gt;true&lt;/code&gt; if you want to filter to only regions that
     *     support Linux workers.
     * @param xenonWorkersEnabled Specify &lt;code&gt;true&lt;/code&gt; if you want to filter to only regions that
     *     support Xenon workers.
     * @param linuxDynamicWorkersEnabled Specify &lt;code&gt;true&lt;/code&gt; if you want to filter to only regions
     *     that support Linux Consumption Workers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of geographical regions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoRegionInner> listGeoRegions(
        SkuName sku,
        Boolean linuxWorkersEnabled,
        Boolean xenonWorkersEnabled,
        Boolean linuxDynamicWorkersEnabled,
        Context context);

    /**
     * Description for List all apps that are assigned to a hostname.
     *
     * @param nameIdentifier Hostname information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of identifiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentifierInner> listSiteIdentifiersAssignedToHostname(NameIdentifierInner nameIdentifier);

    /**
     * Description for List all apps that are assigned to a hostname.
     *
     * @param nameIdentifier Hostname information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of identifiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentifierInner> listSiteIdentifiersAssignedToHostname(
        NameIdentifierInner nameIdentifier, Context context);

    /**
     * Description for List all premier add-on offers.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of premier add-on offers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PremierAddOnOfferInner> listPremierAddOnOffers();

    /**
     * Description for List all premier add-on offers.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of premier add-on offers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PremierAddOnOfferInner> listPremierAddOnOffers(Context context);

    /**
     * Description for List all SKUs.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of SKU information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuInfosInner listSkus();

    /**
     * Description for List all SKUs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of SKU information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuInfosInner> listSkusWithResponse(Context context);

    /**
     * Description for Verifies if this VNET is compatible with an App Service Environment by analyzing the Network
     * Security Group rules.
     *
     * @param parameters VNET information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class that describes the reason for a validation failure.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VnetValidationFailureDetailsInner verifyHostingEnvironmentVnet(VnetParameters parameters);

    /**
     * Description for Verifies if this VNET is compatible with an App Service Environment by analyzing the Network
     * Security Group rules.
     *
     * @param parameters VNET information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class that describes the reason for a validation failure along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VnetValidationFailureDetailsInner> verifyHostingEnvironmentVnetWithResponse(
        VnetParameters parameters, Context context);

    /**
     * Description for Move resources between resource groups.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param moveResourceEnvelope Object that represents the resource to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void move(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope);

    /**
     * Description for Move resources between resource groups.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param moveResourceEnvelope Object that represents the resource to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> moveWithResponse(
        String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, Context context);

    /**
     * Description for Validate if a resource can be created.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param validateRequest Request with the resources to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of resource validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateResponseInner validate(String resourceGroupName, ValidateRequest validateRequest);

    /**
     * Description for Validate if a resource can be created.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param validateRequest Request with the resources to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of resource validation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateResponseInner> validateWithResponse(
        String resourceGroupName, ValidateRequest validateRequest, Context context);

    /**
     * Description for Validate whether a resource can be moved.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param moveResourceEnvelope Object that represents the resource to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateMove(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope);

    /**
     * Description for Validate whether a resource can be moved.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param moveResourceEnvelope Object that represents the resource to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> validateMoveWithResponse(
        String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, Context context);
}
