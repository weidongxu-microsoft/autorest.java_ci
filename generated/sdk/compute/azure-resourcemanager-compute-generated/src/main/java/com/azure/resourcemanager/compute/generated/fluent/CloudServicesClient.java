// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceUpdate;
import com.azure.resourcemanager.compute.generated.models.RoleInstances;

/**
 * An instance of this class provides access to all the operations defined in CloudServicesClient.
 */
public interface CloudServicesClient {
    /**
     * Create or update a cloud service. Please note some properties can be set only during cloud service creation.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudServiceInner>, CloudServiceInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudServiceName);

    /**
     * Create or update a cloud service. Please note some properties can be set only during cloud service creation.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters The cloud service object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudServiceInner>, CloudServiceInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudServiceName, CloudServiceInner parameters, Context context);

    /**
     * Create or update a cloud service. Please note some properties can be set only during cloud service creation.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInner createOrUpdate(String resourceGroupName, String cloudServiceName);

    /**
     * Create or update a cloud service. Please note some properties can be set only during cloud service creation.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters The cloud service object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInner createOrUpdate(String resourceGroupName, String cloudServiceName, CloudServiceInner parameters,
        Context context);

    /**
     * Update a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudServiceInner>, CloudServiceInner> beginUpdate(String resourceGroupName,
        String cloudServiceName);

    /**
     * Update a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters The cloud service object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudServiceInner>, CloudServiceInner> beginUpdate(String resourceGroupName,
        String cloudServiceName, CloudServiceUpdate parameters, Context context);

    /**
     * Update a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInner update(String resourceGroupName, String cloudServiceName);

    /**
     * Update a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters The cloud service object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInner update(String resourceGroupName, String cloudServiceName, CloudServiceUpdate parameters,
        Context context);

    /**
     * Deletes a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Deletes a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Display information about a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudServiceInner> getByResourceGroupWithResponse(String resourceGroupName, String cloudServiceName,
        Context context);

    /**
     * Display information about a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInner getByResourceGroup(String resourceGroupName, String cloudServiceName);

    /**
     * Gets the status of a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cloud service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudServiceInstanceViewInner> getInstanceViewWithResponse(String resourceGroupName,
        String cloudServiceName, Context context);

    /**
     * Gets the status of a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudServiceInstanceViewInner getInstanceView(String resourceGroupName, String cloudServiceName);

    /**
     * Gets a list of all cloud services in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of Cloud Services. Do this till nextLink is null to fetch all the
     * Cloud Services.
     * 
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services in the subscription, regardless of the associated resource group as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudServiceInner> list();

    /**
     * Gets a list of all cloud services in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of Cloud Services. Do this till nextLink is null to fetch all the
     * Cloud Services.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services in the subscription, regardless of the associated resource group as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudServiceInner> list(Context context);

    /**
     * Gets a list of all cloud services under a resource group. Use nextLink property in the response to get the next
     * page of Cloud Services. Do this till nextLink is null to fetch all the Cloud Services.
     * 
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services under a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of all cloud services under a resource group. Use nextLink property in the response to get the next
     * page of Cloud Services. Do this till nextLink is null to fetch all the Cloud Services.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services under a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudServiceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Starts the cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String cloudServiceName);

    /**
     * Starts the cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Starts the cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String cloudServiceName);

    /**
     * Starts the cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPowerOff(String resourceGroupName, String cloudServiceName);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPowerOff(String resourceGroupName, String cloudServiceName,
        Context context);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void powerOff(String resourceGroupName, String cloudServiceName);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void powerOff(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Restarts one or more role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String cloudServiceName);

    /**
     * Restarts one or more role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String cloudServiceName,
        RoleInstances parameters, Context context);

    /**
     * Restarts one or more role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String cloudServiceName);

    /**
     * Restarts one or more role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginReimage(String resourceGroupName, String cloudServiceName);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginReimage(String resourceGroupName, String cloudServiceName,
        RoleInstances parameters, Context context);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void reimage(String resourceGroupName, String cloudServiceName);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void reimage(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRebuild(String resourceGroupName, String cloudServiceName);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRebuild(String resourceGroupName, String cloudServiceName,
        RoleInstances parameters, Context context);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void rebuild(String resourceGroupName, String cloudServiceName);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void rebuild(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Deletes role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteInstances(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteInstances(String resourceGroupName, String cloudServiceName,
        RoleInstances parameters, Context context);

    /**
     * Deletes role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteInstances(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes role instances in a cloud service.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters List of cloud service role instance names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteInstances(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);
}
