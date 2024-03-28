// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservices.generated.fluent.VaultCertificatesClient;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultCertificateResponseInner;
import com.azure.resourcemanager.recoveryservices.generated.models.CertificateRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VaultCertificatesClient.
 */
public final class VaultCertificatesClientImpl implements VaultCertificatesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VaultCertificatesService service;

    /**
     * The service client containing this operation class.
     */
    private final RecoveryServicesManagementClientImpl client;

    /**
     * Initializes an instance of VaultCertificatesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VaultCertificatesClientImpl(RecoveryServicesManagementClientImpl client) {
        this.service
            = RestProxy.create(VaultCertificatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesManagementClientVaultCertificates to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesMana")
    public interface VaultCertificatesService {
        @Headers({ "Content-Type: application/json" })
        @Put("/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/certificates/{certificateName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VaultCertificateResponseInner>> create(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @PathParam("certificateName") String certificateName,
            @BodyParam("application/json") CertificateRequest certificateRequest, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Uploads a certificate for a resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault
     * along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultCertificateResponseInner>> createWithResponseAsync(String resourceGroupName,
        String vaultName, String certificateName, CertificateRequest certificateRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (certificateName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateName is required and cannot be null."));
        }
        if (certificateRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateRequest is required and cannot be null."));
        } else {
            certificateRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), resourceGroupName, vaultName, certificateName, certificateRequest, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Uploads a certificate for a resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault
     * along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultCertificateResponseInner>> createWithResponseAsync(String resourceGroupName,
        String vaultName, String certificateName, CertificateRequest certificateRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (certificateName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateName is required and cannot be null."));
        }
        if (certificateRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateRequest is required and cannot be null."));
        } else {
            certificateRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(),
            resourceGroupName, vaultName, certificateName, certificateRequest, accept, context);
    }

    /**
     * Uploads a certificate for a resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VaultCertificateResponseInner> createAsync(String resourceGroupName, String vaultName,
        String certificateName, CertificateRequest certificateRequest) {
        return createWithResponseAsync(resourceGroupName, vaultName, certificateName, certificateRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Uploads a certificate for a resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault
     * along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VaultCertificateResponseInner> createWithResponse(String resourceGroupName, String vaultName,
        String certificateName, CertificateRequest certificateRequest, Context context) {
        return createWithResponseAsync(resourceGroupName, vaultName, certificateName, certificateRequest, context)
            .block();
    }

    /**
     * Uploads a certificate for a resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param certificateRequest Input parameters for uploading the vault certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return certificate corresponding to a vault that can be used by clients to register themselves with the vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VaultCertificateResponseInner create(String resourceGroupName, String vaultName, String certificateName,
        CertificateRequest certificateRequest) {
        return createWithResponse(resourceGroupName, vaultName, certificateName, certificateRequest, Context.NONE)
            .getValue();
    }
}
