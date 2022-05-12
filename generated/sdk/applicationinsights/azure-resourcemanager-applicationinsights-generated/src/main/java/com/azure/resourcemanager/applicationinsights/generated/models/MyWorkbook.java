// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.MyWorkbookInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of MyWorkbook. */
public interface MyWorkbook {
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
     * Gets the id property: Azure resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Azure resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Azure resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    SharedTypeKind kind();

    /**
     * Gets the displayName property: The user-defined name of the private workbook.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the serializedData property: Configuration of this particular private workbook. Configuration data is a
     * string containing valid JSON.
     *
     * @return the serializedData value.
     */
    String serializedData();

    /**
     * Gets the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked private workbook.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the timeModified property: Date and time in UTC of the last modification that was made to this private
     * workbook definition.
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
     * Gets the tagsPropertiesTags property: A list of 0 or more tags that are associated with this private workbook
     * definition.
     *
     * @return the tagsPropertiesTags value.
     */
    List<String> tagsPropertiesTags();

    /**
     * Gets the userId property: Unique user id of the specific user that owns this private workbook.
     *
     * @return the userId value.
     */
    String userId();

    /**
     * Gets the sourceId property: Optional resourceId for a source resource.
     *
     * @return the sourceId value.
     */
    String sourceId();

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
     * Gets the inner com.azure.resourcemanager.applicationinsights.generated.fluent.models.MyWorkbookInner object.
     *
     * @return the inner object.
     */
    MyWorkbookInner innerModel();

    /** The entirety of the MyWorkbook definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The MyWorkbook definition stages. */
    interface DefinitionStages {
        /** The first stage of the MyWorkbook definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the MyWorkbook definition allowing to specify location. */
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
        /** The stage of the MyWorkbook definition allowing to specify parent resource. */
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
         * The stage of the MyWorkbook definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithName,
                DefinitionStages.WithType,
                DefinitionStages.WithKind,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithSerializedData,
                DefinitionStages.WithVersion,
                DefinitionStages.WithCategory,
                DefinitionStages.WithTagsPropertiesTags,
                DefinitionStages.WithSourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            MyWorkbook create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MyWorkbook create(Context context);
        }
        /** The stage of the MyWorkbook definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the MyWorkbook definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Azure resource name.
             *
             * @param name Azure resource name.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the MyWorkbook definition allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Azure resource type.
             *
             * @param type Azure resource type.
             * @return the next definition stage.
             */
            WithCreate withType(String type);
        }
        /** The stage of the MyWorkbook definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of workbook. Choices are user and shared..
             *
             * @param kind The kind of workbook. Choices are user and shared.
             * @return the next definition stage.
             */
            WithCreate withKind(SharedTypeKind kind);
        }
        /** The stage of the MyWorkbook definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The user-defined name of the private workbook..
             *
             * @param displayName The user-defined name of the private workbook.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the MyWorkbook definition allowing to specify serializedData. */
        interface WithSerializedData {
            /**
             * Specifies the serializedData property: Configuration of this particular private workbook. Configuration
             * data is a string containing valid JSON.
             *
             * @param serializedData Configuration of this particular private workbook. Configuration data is a string
             *     containing valid JSON.
             * @return the next definition stage.
             */
            WithCreate withSerializedData(String serializedData);
        }
        /** The stage of the MyWorkbook definition allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: This instance's version of the data model. This can change as new
             * features are added that can be marked private workbook..
             *
             * @param version This instance's version of the data model. This can change as new features are added that
             *     can be marked private workbook.
             * @return the next definition stage.
             */
            WithCreate withVersion(String version);
        }
        /** The stage of the MyWorkbook definition allowing to specify category. */
        interface WithCategory {
            /**
             * Specifies the category property: Workbook category, as defined by the user at creation time..
             *
             * @param category Workbook category, as defined by the user at creation time.
             * @return the next definition stage.
             */
            WithCreate withCategory(String category);
        }
        /** The stage of the MyWorkbook definition allowing to specify tagsPropertiesTags. */
        interface WithTagsPropertiesTags {
            /**
             * Specifies the tagsPropertiesTags property: A list of 0 or more tags that are associated with this private
             * workbook definition.
             *
             * @param tagsPropertiesTags A list of 0 or more tags that are associated with this private workbook
             *     definition.
             * @return the next definition stage.
             */
            WithCreate withTagsPropertiesTags(List<String> tagsPropertiesTags);
        }
        /** The stage of the MyWorkbook definition allowing to specify sourceId. */
        interface WithSourceId {
            /**
             * Specifies the sourceId property: Optional resourceId for a source resource..
             *
             * @param sourceId Optional resourceId for a source resource.
             * @return the next definition stage.
             */
            WithCreate withSourceId(String sourceId);
        }
    }
    /**
     * Begins update for the MyWorkbook resource.
     *
     * @return the stage of resource update.
     */
    MyWorkbook.Update update();

    /** The template for MyWorkbook update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithKind,
            UpdateStages.WithDisplayName,
            UpdateStages.WithSerializedData,
            UpdateStages.WithVersion,
            UpdateStages.WithCategory,
            UpdateStages.WithTagsPropertiesTags,
            UpdateStages.WithSourceId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        MyWorkbook apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MyWorkbook apply(Context context);
    }
    /** The MyWorkbook update stages. */
    interface UpdateStages {
        /** The stage of the MyWorkbook update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the MyWorkbook update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of workbook. Choices are user and shared..
             *
             * @param kind The kind of workbook. Choices are user and shared.
             * @return the next definition stage.
             */
            Update withKind(SharedTypeKind kind);
        }
        /** The stage of the MyWorkbook update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The user-defined name of the private workbook..
             *
             * @param displayName The user-defined name of the private workbook.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the MyWorkbook update allowing to specify serializedData. */
        interface WithSerializedData {
            /**
             * Specifies the serializedData property: Configuration of this particular private workbook. Configuration
             * data is a string containing valid JSON.
             *
             * @param serializedData Configuration of this particular private workbook. Configuration data is a string
             *     containing valid JSON.
             * @return the next definition stage.
             */
            Update withSerializedData(String serializedData);
        }
        /** The stage of the MyWorkbook update allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: This instance's version of the data model. This can change as new
             * features are added that can be marked private workbook..
             *
             * @param version This instance's version of the data model. This can change as new features are added that
             *     can be marked private workbook.
             * @return the next definition stage.
             */
            Update withVersion(String version);
        }
        /** The stage of the MyWorkbook update allowing to specify category. */
        interface WithCategory {
            /**
             * Specifies the category property: Workbook category, as defined by the user at creation time..
             *
             * @param category Workbook category, as defined by the user at creation time.
             * @return the next definition stage.
             */
            Update withCategory(String category);
        }
        /** The stage of the MyWorkbook update allowing to specify tagsPropertiesTags. */
        interface WithTagsPropertiesTags {
            /**
             * Specifies the tagsPropertiesTags property: A list of 0 or more tags that are associated with this private
             * workbook definition.
             *
             * @param tagsPropertiesTags A list of 0 or more tags that are associated with this private workbook
             *     definition.
             * @return the next definition stage.
             */
            Update withTagsPropertiesTags(List<String> tagsPropertiesTags);
        }
        /** The stage of the MyWorkbook update allowing to specify sourceId. */
        interface WithSourceId {
            /**
             * Specifies the sourceId property: Optional resourceId for a source resource..
             *
             * @param sourceId Optional resourceId for a source resource.
             * @return the next definition stage.
             */
            Update withSourceId(String sourceId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    MyWorkbook refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MyWorkbook refresh(Context context);
}
