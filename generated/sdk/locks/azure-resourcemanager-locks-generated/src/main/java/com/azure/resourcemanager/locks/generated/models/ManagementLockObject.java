// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.locks.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.locks.generated.fluent.models.ManagementLockObjectInner;
import java.util.List;

/** An immutable client-side representation of ManagementLockObject. */
public interface ManagementLockObject {
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
     * Gets the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
     * CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means
     * authorized users can only read from a resource, but they can't modify or delete it.
     *
     * @return the level value.
     */
    LockLevel level();

    /**
     * Gets the notes property: Notes about the lock. Maximum of 512 characters.
     *
     * @return the notes value.
     */
    String notes();

    /**
     * Gets the owners property: The owners of the lock.
     *
     * @return the owners value.
     */
    List<ManagementLockOwner> owners();

    /**
     * Gets the inner com.azure.resourcemanager.locks.generated.fluent.models.ManagementLockObjectInner object.
     *
     * @return the inner object.
     */
    ManagementLockObjectInner innerModel();

    /** The entirety of the ManagementLockObject definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithLevel,
            DefinitionStages.WithCreate {
    }
    /** The ManagementLockObject definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagementLockObject definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the ManagementLockObject definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group to lock.
             * @return the next definition stage.
             */
            WithLevel withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ManagementLockObject definition allowing to specify level. */
        interface WithLevel {
            /**
             * Specifies the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete,
             * ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete.
             * ReadOnly means authorized users can only read from a resource, but they can't modify or delete it..
             *
             * @param level The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
             *     CanNotDelete means authorized users are able to read and modify the resources, but not delete.
             *     ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
             * @return the next definition stage.
             */
            WithCreate withLevel(LockLevel level);
        }
        /**
         * The stage of the ManagementLockObject definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithNotes, DefinitionStages.WithOwners {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagementLockObject create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagementLockObject create(Context context);
        }
        /** The stage of the ManagementLockObject definition allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: Notes about the lock. Maximum of 512 characters..
             *
             * @param notes Notes about the lock. Maximum of 512 characters.
             * @return the next definition stage.
             */
            WithCreate withNotes(String notes);
        }
        /** The stage of the ManagementLockObject definition allowing to specify owners. */
        interface WithOwners {
            /**
             * Specifies the owners property: The owners of the lock..
             *
             * @param owners The owners of the lock.
             * @return the next definition stage.
             */
            WithCreate withOwners(List<ManagementLockOwner> owners);
        }
    }
    /**
     * Begins update for the ManagementLockObject resource.
     *
     * @return the stage of resource update.
     */
    ManagementLockObject.Update update();

    /** The template for ManagementLockObject update. */
    interface Update extends UpdateStages.WithLevel, UpdateStages.WithNotes, UpdateStages.WithOwners {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagementLockObject apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagementLockObject apply(Context context);
    }
    /** The ManagementLockObject update stages. */
    interface UpdateStages {
        /** The stage of the ManagementLockObject update allowing to specify level. */
        interface WithLevel {
            /**
             * Specifies the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete,
             * ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete.
             * ReadOnly means authorized users can only read from a resource, but they can't modify or delete it..
             *
             * @param level The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
             *     CanNotDelete means authorized users are able to read and modify the resources, but not delete.
             *     ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
             * @return the next definition stage.
             */
            Update withLevel(LockLevel level);
        }
        /** The stage of the ManagementLockObject update allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: Notes about the lock. Maximum of 512 characters..
             *
             * @param notes Notes about the lock. Maximum of 512 characters.
             * @return the next definition stage.
             */
            Update withNotes(String notes);
        }
        /** The stage of the ManagementLockObject update allowing to specify owners. */
        interface WithOwners {
            /**
             * Specifies the owners property: The owners of the lock..
             *
             * @param owners The owners of the lock.
             * @return the next definition stage.
             */
            Update withOwners(List<ManagementLockOwner> owners);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagementLockObject refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagementLockObject refresh(Context context);
}
