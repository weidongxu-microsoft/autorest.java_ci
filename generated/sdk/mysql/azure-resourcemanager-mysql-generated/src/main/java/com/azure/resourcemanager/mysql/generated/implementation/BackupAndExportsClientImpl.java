// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysql.generated.fluent.BackupAndExportsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.BackupAndExportResponseInner;
import com.azure.resourcemanager.mysql.generated.fluent.models.ValidateBackupResponseInner;
import com.azure.resourcemanager.mysql.generated.models.BackupAndExportRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in BackupAndExportsClient.
 */
public final class BackupAndExportsClientImpl implements BackupAndExportsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final BackupAndExportsService service;

    /**
     * The service client containing this operation class.
     */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of BackupAndExportsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    BackupAndExportsClientImpl(MySqlManagementClientImpl client) {
        this.service
            = RestProxy.create(BackupAndExportsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientBackupAndExports to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    public interface BackupAndExportsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/backupAndExport")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @BodyParam("application/json") BackupAndExportRequest parameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/validateBackup")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ValidateBackupResponseInner>> validateBackup(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), apiVersion,
                this.client.getSubscriptionId(), resourceGroupName, serverName, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName,
            serverName, parameters, accept, context);
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<BackupAndExportResponseInner>, BackupAndExportResponseInner>
        beginCreateAsync(String resourceGroupName, String serverName, BackupAndExportRequest parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(resourceGroupName, serverName, parameters);
        return this.client.<BackupAndExportResponseInner, BackupAndExportResponseInner>getLroResult(mono,
            this.client.getHttpPipeline(), BackupAndExportResponseInner.class, BackupAndExportResponseInner.class,
            this.client.getContext());
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<BackupAndExportResponseInner>, BackupAndExportResponseInner> beginCreateAsync(
        String resourceGroupName, String serverName, BackupAndExportRequest parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = createWithResponseAsync(resourceGroupName, serverName, parameters, context);
        return this.client.<BackupAndExportResponseInner, BackupAndExportResponseInner>getLroResult(mono,
            this.client.getHttpPipeline(), BackupAndExportResponseInner.class, BackupAndExportResponseInner.class,
            context);
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<BackupAndExportResponseInner>, BackupAndExportResponseInner>
        beginCreate(String resourceGroupName, String serverName, BackupAndExportRequest parameters) {
        return this.beginCreateAsync(resourceGroupName, serverName, parameters).getSyncPoller();
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<BackupAndExportResponseInner>, BackupAndExportResponseInner>
        beginCreate(String resourceGroupName, String serverName, BackupAndExportRequest parameters, Context context) {
        return this.beginCreateAsync(resourceGroupName, serverName, parameters, context).getSyncPoller();
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BackupAndExportResponseInner> createAsync(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters) {
        return beginCreateAsync(resourceGroupName, serverName, parameters).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BackupAndExportResponseInner> createAsync(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters, Context context) {
        return beginCreateAsync(resourceGroupName, serverName, parameters, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupAndExportResponseInner create(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters) {
        return createAsync(resourceGroupName, serverName, parameters).block();
    }

    /**
     * Exports the backup of the given server by creating a backup if not existing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for creating and exporting backup of the given server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents BackupAndExport API Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupAndExportResponseInner create(String resourceGroupName, String serverName,
        BackupAndExportRequest parameters, Context context) {
        return createAsync(resourceGroupName, serverName, parameters, context).block();
    }

    /**
     * Validates if backup can be performed for given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents ValidateBackup API Response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ValidateBackupResponseInner>> validateBackupWithResponseAsync(String resourceGroupName,
        String serverName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.validateBackup(this.client.getEndpoint(), apiVersion,
                this.client.getSubscriptionId(), resourceGroupName, serverName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Validates if backup can be performed for given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents ValidateBackup API Response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ValidateBackupResponseInner>> validateBackupWithResponseAsync(String resourceGroupName,
        String serverName, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.validateBackup(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
            resourceGroupName, serverName, accept, context);
    }

    /**
     * Validates if backup can be performed for given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents ValidateBackup API Response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ValidateBackupResponseInner> validateBackupAsync(String resourceGroupName, String serverName) {
        return validateBackupWithResponseAsync(resourceGroupName, serverName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Validates if backup can be performed for given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents ValidateBackup API Response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ValidateBackupResponseInner> validateBackupWithResponse(String resourceGroupName, String serverName,
        Context context) {
        return validateBackupWithResponseAsync(resourceGroupName, serverName, context).block();
    }

    /**
     * Validates if backup can be performed for given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents ValidateBackup API Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ValidateBackupResponseInner validateBackup(String resourceGroupName, String serverName) {
        return validateBackupWithResponse(resourceGroupName, serverName, Context.NONE).getValue();
    }
}
