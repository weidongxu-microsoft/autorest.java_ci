// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import java.util.List;

/**
 * An immutable client-side representation of ServiceEndpointPolicyDefinition.
 */
public interface ServiceEndpointPolicyDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the description property: A description for this rule. Restricted to 140 chars.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the service property: Service endpoint name.
     * 
     * @return the service value.
     */
    String service();

    /**
     * Gets the serviceResources property: A list of service resources.
     * 
     * @return the serviceResources value.
     */
    List<String> serviceResources();

    /**
     * Gets the provisioningState property: The provisioning state of the service endpoint policy definition resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner
     * object.
     * 
     * @return the inner object.
     */
    ServiceEndpointPolicyDefinitionInner innerModel();

    /**
     * The entirety of the ServiceEndpointPolicyDefinition definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ServiceEndpointPolicyDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ServiceEndpointPolicyDefinition definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceEndpointPolicyName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param serviceEndpointPolicyName The name of the service endpoint policy.
             * @return the next definition stage.
             */
            WithCreate withExistingServiceEndpointPolicy(String resourceGroupName, String serviceEndpointPolicyName);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName, DefinitionStages.WithType,
            DefinitionStages.WithDescription, DefinitionStages.WithService, DefinitionStages.WithServiceResources {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ServiceEndpointPolicyDefinition create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceEndpointPolicyDefinition create(Context context);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             * access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify type.
         */
        interface WithType {
            /**
             * Specifies the type property: The type of the resource..
             * 
             * @param type The type of the resource.
             * @return the next definition stage.
             */
            WithCreate withType(String type);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description for this rule. Restricted to 140 chars..
             * 
             * @param description A description for this rule. Restricted to 140 chars.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify service.
         */
        interface WithService {
            /**
             * Specifies the service property: Service endpoint name..
             * 
             * @param service Service endpoint name.
             * @return the next definition stage.
             */
            WithCreate withService(String service);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition definition allowing to specify serviceResources.
         */
        interface WithServiceResources {
            /**
             * Specifies the serviceResources property: A list of service resources..
             * 
             * @param serviceResources A list of service resources.
             * @return the next definition stage.
             */
            WithCreate withServiceResources(List<String> serviceResources);
        }
    }

    /**
     * Begins update for the ServiceEndpointPolicyDefinition resource.
     * 
     * @return the stage of resource update.
     */
    ServiceEndpointPolicyDefinition.Update update();

    /**
     * The template for ServiceEndpointPolicyDefinition update.
     */
    interface Update extends UpdateStages.WithName, UpdateStages.WithType, UpdateStages.WithDescription,
        UpdateStages.WithService, UpdateStages.WithServiceResources {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ServiceEndpointPolicyDefinition apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServiceEndpointPolicyDefinition apply(Context context);
    }

    /**
     * The ServiceEndpointPolicyDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ServiceEndpointPolicyDefinition update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             * access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition update allowing to specify type.
         */
        interface WithType {
            /**
             * Specifies the type property: The type of the resource..
             * 
             * @param type The type of the resource.
             * @return the next definition stage.
             */
            Update withType(String type);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: A description for this rule. Restricted to 140 chars..
             * 
             * @param description A description for this rule. Restricted to 140 chars.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition update allowing to specify service.
         */
        interface WithService {
            /**
             * Specifies the service property: Service endpoint name..
             * 
             * @param service Service endpoint name.
             * @return the next definition stage.
             */
            Update withService(String service);
        }

        /**
         * The stage of the ServiceEndpointPolicyDefinition update allowing to specify serviceResources.
         */
        interface WithServiceResources {
            /**
             * Specifies the serviceResources property: A list of service resources..
             * 
             * @param serviceResources A list of service resources.
             * @return the next definition stage.
             */
            Update withServiceResources(List<String> serviceResources);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ServiceEndpointPolicyDefinition refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceEndpointPolicyDefinition refresh(Context context);
}
