// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.AzureADAdministratorInner;

/** An immutable client-side representation of AzureADAdministrator. */
public interface AzureADAdministrator {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the administratorType property: Type of the sever administrator.
     *
     * @return the administratorType value.
     */
    AdministratorType administratorType();

    /**
     * Gets the login property: Login name of the server administrator.
     *
     * @return the login value.
     */
    String login();

    /**
     * Gets the sid property: SID (object ID) of the server administrator.
     *
     * @return the sid value.
     */
    String sid();

    /**
     * Gets the tenantId property: Tenant ID of the administrator.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the identityResourceId property: The resource id of the identity used for AAD Authentication.
     *
     * @return the identityResourceId value.
     */
    String identityResourceId();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.AzureADAdministratorInner object.
     *
     * @return the inner object.
     */
    AzureADAdministratorInner innerModel();

    /** The entirety of the AzureADAdministrator definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The AzureADAdministrator definition stages. */
    interface DefinitionStages {
        /** The first stage of the AzureADAdministrator definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the AzureADAdministrator definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingFlexibleServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the AzureADAdministrator definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAdministratorType,
                DefinitionStages.WithLogin,
                DefinitionStages.WithSid,
                DefinitionStages.WithTenantId,
                DefinitionStages.WithIdentityResourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AzureADAdministrator create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AzureADAdministrator create(Context context);
        }

        /** The stage of the AzureADAdministrator definition allowing to specify administratorType. */
        interface WithAdministratorType {
            /**
             * Specifies the administratorType property: Type of the sever administrator..
             *
             * @param administratorType Type of the sever administrator.
             * @return the next definition stage.
             */
            WithCreate withAdministratorType(AdministratorType administratorType);
        }

        /** The stage of the AzureADAdministrator definition allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: Login name of the server administrator..
             *
             * @param login Login name of the server administrator.
             * @return the next definition stage.
             */
            WithCreate withLogin(String login);
        }

        /** The stage of the AzureADAdministrator definition allowing to specify sid. */
        interface WithSid {
            /**
             * Specifies the sid property: SID (object ID) of the server administrator..
             *
             * @param sid SID (object ID) of the server administrator.
             * @return the next definition stage.
             */
            WithCreate withSid(String sid);
        }

        /** The stage of the AzureADAdministrator definition allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: Tenant ID of the administrator..
             *
             * @param tenantId Tenant ID of the administrator.
             * @return the next definition stage.
             */
            WithCreate withTenantId(String tenantId);
        }

        /** The stage of the AzureADAdministrator definition allowing to specify identityResourceId. */
        interface WithIdentityResourceId {
            /**
             * Specifies the identityResourceId property: The resource id of the identity used for AAD Authentication..
             *
             * @param identityResourceId The resource id of the identity used for AAD Authentication.
             * @return the next definition stage.
             */
            WithCreate withIdentityResourceId(String identityResourceId);
        }
    }

    /**
     * Begins update for the AzureADAdministrator resource.
     *
     * @return the stage of resource update.
     */
    AzureADAdministrator.Update update();

    /** The template for AzureADAdministrator update. */
    interface Update
        extends UpdateStages.WithAdministratorType,
            UpdateStages.WithLogin,
            UpdateStages.WithSid,
            UpdateStages.WithTenantId,
            UpdateStages.WithIdentityResourceId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AzureADAdministrator apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AzureADAdministrator apply(Context context);
    }

    /** The AzureADAdministrator update stages. */
    interface UpdateStages {
        /** The stage of the AzureADAdministrator update allowing to specify administratorType. */
        interface WithAdministratorType {
            /**
             * Specifies the administratorType property: Type of the sever administrator..
             *
             * @param administratorType Type of the sever administrator.
             * @return the next definition stage.
             */
            Update withAdministratorType(AdministratorType administratorType);
        }

        /** The stage of the AzureADAdministrator update allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: Login name of the server administrator..
             *
             * @param login Login name of the server administrator.
             * @return the next definition stage.
             */
            Update withLogin(String login);
        }

        /** The stage of the AzureADAdministrator update allowing to specify sid. */
        interface WithSid {
            /**
             * Specifies the sid property: SID (object ID) of the server administrator..
             *
             * @param sid SID (object ID) of the server administrator.
             * @return the next definition stage.
             */
            Update withSid(String sid);
        }

        /** The stage of the AzureADAdministrator update allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: Tenant ID of the administrator..
             *
             * @param tenantId Tenant ID of the administrator.
             * @return the next definition stage.
             */
            Update withTenantId(String tenantId);
        }

        /** The stage of the AzureADAdministrator update allowing to specify identityResourceId. */
        interface WithIdentityResourceId {
            /**
             * Specifies the identityResourceId property: The resource id of the identity used for AAD Authentication..
             *
             * @param identityResourceId The resource id of the identity used for AAD Authentication.
             * @return the next definition stage.
             */
            Update withIdentityResourceId(String identityResourceId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AzureADAdministrator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AzureADAdministrator refresh(Context context);
}
