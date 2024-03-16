// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.WorkbookInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of Workbook.
 */
public interface Workbook {
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
     * Gets the kind property: The kind of workbook. Choices are user and shared.
     * 
     * @return the kind value.
     */
    SharedTypeKind kind();

    /**
     * Gets the namePropertiesName property: The user-defined name of the workbook.
     * 
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the serializedData property: Configuration of this particular workbook. Configuration data is a string containing valid JSON.
     * 
     * @return the serializedData value.
     */
    String serializedData();

    /**
     * Gets the version property: This instance's version of the data model. This can change as new features are added that can be marked workbook.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the workbookId property: Internally assigned unique id of the workbook definition.
     * 
     * @return the workbookId value.
     */
    String workbookId();

    /**
     * Gets the sharedTypeKind property: Enum indicating if this workbook definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     * @return the sharedTypeKind value.
     */
    SharedTypeKind sharedTypeKind();

    /**
     * Gets the timeModified property: Date and time in UTC of the last modification that was made to this workbook definition.
     * 
     * @return the timeModified value.
     */
    String timeModified();

    /**
     * Gets the category property: Workbook category, as defined by the user at creation time.
     * 
     * @return the category value.
     */
    String category();

    /**
     * Gets the tagsPropertiesTags property: A list of 0 or more tags that are associated with this workbook definition.
     * 
     * @return the tagsPropertiesTags value.
     */
    List<String> tagsPropertiesTags();

    /**
     * Gets the userId property: Unique user id of the specific user that owns this workbook.
     * 
     * @return the userId value.
     */
    String userId();

    /**
     * Gets the sourceResourceId property: Optional resourceId for a source resource.
     * 
     * @return the sourceResourceId value.
     */
    String sourceResourceId();

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
     * Gets the inner com.azure.resourcemanager.applicationinsights.generated.fluent.models.WorkbookInner object.
     * 
     * @return the inner object.
     */
    WorkbookInner innerModel();

    /**
     * The entirety of the Workbook definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The Workbook definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Workbook definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Workbook definition allowing to specify location.
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
         * The stage of the Workbook definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Workbook definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithKind, DefinitionStages.WithNamePropertiesName,
            DefinitionStages.WithSerializedData, DefinitionStages.WithVersion, DefinitionStages.WithWorkbookId,
            DefinitionStages.WithSharedTypeKind, DefinitionStages.WithCategory, DefinitionStages.WithTagsPropertiesTags,
            DefinitionStages.WithUserId, DefinitionStages.WithSourceResourceId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Workbook create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Workbook create(Context context);
        }

        /**
         * The stage of the Workbook definition allowing to specify tags.
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
         * The stage of the Workbook definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of workbook. Choices are user and shared..
             * 
             * @param kind The kind of workbook. Choices are user and shared.
             * @return the next definition stage.
             */
            WithCreate withKind(SharedTypeKind kind);
        }

        /**
         * The stage of the Workbook definition allowing to specify namePropertiesName.
         */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: The user-defined name of the workbook..
             * 
             * @param namePropertiesName The user-defined name of the workbook.
             * @return the next definition stage.
             */
            WithCreate withNamePropertiesName(String namePropertiesName);
        }

        /**
         * The stage of the Workbook definition allowing to specify serializedData.
         */
        interface WithSerializedData {
            /**
             * Specifies the serializedData property: Configuration of this particular workbook. Configuration data is a string containing valid JSON.
             * 
             * @param serializedData Configuration of this particular workbook. Configuration data is a string containing valid JSON.
             * @return the next definition stage.
             */
            WithCreate withSerializedData(String serializedData);
        }

        /**
         * The stage of the Workbook definition allowing to specify version.
         */
        interface WithVersion {
            /**
             * Specifies the version property: This instance's version of the data model. This can change as new features are added that can be marked workbook..
             * 
             * @param version This instance's version of the data model. This can change as new features are added that can be marked workbook.
             * @return the next definition stage.
             */
            WithCreate withVersion(String version);
        }

        /**
         * The stage of the Workbook definition allowing to specify workbookId.
         */
        interface WithWorkbookId {
            /**
             * Specifies the workbookId property: Internally assigned unique id of the workbook definition..
             * 
             * @param workbookId Internally assigned unique id of the workbook definition.
             * @return the next definition stage.
             */
            WithCreate withWorkbookId(String workbookId);
        }

        /**
         * The stage of the Workbook definition allowing to specify sharedTypeKind.
         */
        interface WithSharedTypeKind {
            /**
             * Specifies the sharedTypeKind property: Enum indicating if this workbook definition is owned by a specific user or is shared between all users with access to the Application Insights component..
             * 
             * @param sharedTypeKind Enum indicating if this workbook definition is owned by a specific user or is shared between all users with access to the Application Insights component.
             * @return the next definition stage.
             */
            WithCreate withSharedTypeKind(SharedTypeKind sharedTypeKind);
        }

        /**
         * The stage of the Workbook definition allowing to specify category.
         */
        interface WithCategory {
            /**
             * Specifies the category property: Workbook category, as defined by the user at creation time..
             * 
             * @param category Workbook category, as defined by the user at creation time.
             * @return the next definition stage.
             */
            WithCreate withCategory(String category);
        }

        /**
         * The stage of the Workbook definition allowing to specify tagsPropertiesTags.
         */
        interface WithTagsPropertiesTags {
            /**
             * Specifies the tagsPropertiesTags property: A list of 0 or more tags that are associated with this workbook definition.
             * 
             * @param tagsPropertiesTags A list of 0 or more tags that are associated with this workbook definition.
             * @return the next definition stage.
             */
            WithCreate withTagsPropertiesTags(List<String> tagsPropertiesTags);
        }

        /**
         * The stage of the Workbook definition allowing to specify userId.
         */
        interface WithUserId {
            /**
             * Specifies the userId property: Unique user id of the specific user that owns this workbook..
             * 
             * @param userId Unique user id of the specific user that owns this workbook.
             * @return the next definition stage.
             */
            WithCreate withUserId(String userId);
        }

        /**
         * The stage of the Workbook definition allowing to specify sourceResourceId.
         */
        interface WithSourceResourceId {
            /**
             * Specifies the sourceResourceId property: Optional resourceId for a source resource..
             * 
             * @param sourceResourceId Optional resourceId for a source resource.
             * @return the next definition stage.
             */
            WithCreate withSourceResourceId(String sourceResourceId);
        }
    }

    /**
     * Begins update for the Workbook resource.
     * 
     * @return the stage of resource update.
     */
    Workbook.Update update();

    /**
     * The template for Workbook update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithKind, UpdateStages.WithNamePropertiesName,
        UpdateStages.WithSerializedData, UpdateStages.WithVersion, UpdateStages.WithWorkbookId,
        UpdateStages.WithSharedTypeKind, UpdateStages.WithCategory, UpdateStages.WithTagsPropertiesTags,
        UpdateStages.WithUserId, UpdateStages.WithSourceResourceId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Workbook apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Workbook apply(Context context);
    }

    /**
     * The Workbook update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Workbook update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Workbook update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of workbook. Choices are user and shared..
             * 
             * @param kind The kind of workbook. Choices are user and shared.
             * @return the next definition stage.
             */
            Update withKind(SharedTypeKind kind);
        }

        /**
         * The stage of the Workbook update allowing to specify namePropertiesName.
         */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: The user-defined name of the workbook..
             * 
             * @param namePropertiesName The user-defined name of the workbook.
             * @return the next definition stage.
             */
            Update withNamePropertiesName(String namePropertiesName);
        }

        /**
         * The stage of the Workbook update allowing to specify serializedData.
         */
        interface WithSerializedData {
            /**
             * Specifies the serializedData property: Configuration of this particular workbook. Configuration data is a string containing valid JSON.
             * 
             * @param serializedData Configuration of this particular workbook. Configuration data is a string containing valid JSON.
             * @return the next definition stage.
             */
            Update withSerializedData(String serializedData);
        }

        /**
         * The stage of the Workbook update allowing to specify version.
         */
        interface WithVersion {
            /**
             * Specifies the version property: This instance's version of the data model. This can change as new features are added that can be marked workbook..
             * 
             * @param version This instance's version of the data model. This can change as new features are added that can be marked workbook.
             * @return the next definition stage.
             */
            Update withVersion(String version);
        }

        /**
         * The stage of the Workbook update allowing to specify workbookId.
         */
        interface WithWorkbookId {
            /**
             * Specifies the workbookId property: Internally assigned unique id of the workbook definition..
             * 
             * @param workbookId Internally assigned unique id of the workbook definition.
             * @return the next definition stage.
             */
            Update withWorkbookId(String workbookId);
        }

        /**
         * The stage of the Workbook update allowing to specify sharedTypeKind.
         */
        interface WithSharedTypeKind {
            /**
             * Specifies the sharedTypeKind property: Enum indicating if this workbook definition is owned by a specific user or is shared between all users with access to the Application Insights component..
             * 
             * @param sharedTypeKind Enum indicating if this workbook definition is owned by a specific user or is shared between all users with access to the Application Insights component.
             * @return the next definition stage.
             */
            Update withSharedTypeKind(SharedTypeKind sharedTypeKind);
        }

        /**
         * The stage of the Workbook update allowing to specify category.
         */
        interface WithCategory {
            /**
             * Specifies the category property: Workbook category, as defined by the user at creation time..
             * 
             * @param category Workbook category, as defined by the user at creation time.
             * @return the next definition stage.
             */
            Update withCategory(String category);
        }

        /**
         * The stage of the Workbook update allowing to specify tagsPropertiesTags.
         */
        interface WithTagsPropertiesTags {
            /**
             * Specifies the tagsPropertiesTags property: A list of 0 or more tags that are associated with this workbook definition.
             * 
             * @param tagsPropertiesTags A list of 0 or more tags that are associated with this workbook definition.
             * @return the next definition stage.
             */
            Update withTagsPropertiesTags(List<String> tagsPropertiesTags);
        }

        /**
         * The stage of the Workbook update allowing to specify userId.
         */
        interface WithUserId {
            /**
             * Specifies the userId property: Unique user id of the specific user that owns this workbook..
             * 
             * @param userId Unique user id of the specific user that owns this workbook.
             * @return the next definition stage.
             */
            Update withUserId(String userId);
        }

        /**
         * The stage of the Workbook update allowing to specify sourceResourceId.
         */
        interface WithSourceResourceId {
            /**
             * Specifies the sourceResourceId property: Optional resourceId for a source resource..
             * 
             * @param sourceResourceId Optional resourceId for a source resource.
             * @return the next definition stage.
             */
            Update withSourceResourceId(String sourceResourceId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Workbook refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Workbook refresh(Context context);
}
