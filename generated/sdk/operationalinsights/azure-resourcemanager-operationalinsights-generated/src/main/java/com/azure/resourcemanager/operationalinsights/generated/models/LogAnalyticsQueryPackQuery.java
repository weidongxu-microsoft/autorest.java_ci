// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LogAnalyticsQueryPackQueryInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of LogAnalyticsQueryPackQuery. */
public interface LogAnalyticsQueryPackQuery {
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
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the idPropertiesId property: The unique ID of your application. This field cannot be changed.
     *
     * @return the idPropertiesId value.
     */
    String idPropertiesId();

    /**
     * Gets the displayName property: Unique display name for your query within the Query Pack.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the timeCreated property: Creation Date for the Log Analytics Query, in ISO 8601 format.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the timeModified property: Last modified date of the Log Analytics Query, in ISO 8601 format.
     *
     * @return the timeModified value.
     */
    OffsetDateTime timeModified();

    /**
     * Gets the author property: Object Id of user creating the query.
     *
     * @return the author value.
     */
    String author();

    /**
     * Gets the description property: Description of the query.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the body property: Body of the query.
     *
     * @return the body value.
     */
    String body();

    /**
     * Gets the related property: The related metadata items for the function.
     *
     * @return the related value.
     */
    LogAnalyticsQueryPackQueryPropertiesRelated related();

    /**
     * Gets the tags property: Tags associated with the query.
     *
     * @return the tags value.
     */
    Map<String, List<String>> tags();

    /**
     * Gets the properties property: Additional properties that can be set for the query.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner
     * com.azure.resourcemanager.operationalinsights.generated.fluent.models.LogAnalyticsQueryPackQueryInner object.
     *
     * @return the inner object.
     */
    LogAnalyticsQueryPackQueryInner innerModel();

    /** The entirety of the LogAnalyticsQueryPackQuery definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The LogAnalyticsQueryPackQuery definition stages. */
    interface DefinitionStages {
        /** The first stage of the LogAnalyticsQueryPackQuery definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, queryPackName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param queryPackName The name of the Log Analytics QueryPack resource.
             * @return the next definition stage.
             */
            WithCreate withExistingQueryPack(String resourceGroupName, String queryPackName);
        }
        /**
         * The stage of the LogAnalyticsQueryPackQuery definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithDescription,
                DefinitionStages.WithBody,
                DefinitionStages.WithRelated,
                DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LogAnalyticsQueryPackQuery create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LogAnalyticsQueryPackQuery create(Context context);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags associated with the query..
             *
             * @param tags Tags associated with the query.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, List<String>> tags);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Unique display name for your query within the Query Pack..
             *
             * @param displayName Unique display name for your query within the Query Pack.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the query..
             *
             * @param description Description of the query.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify body. */
        interface WithBody {
            /**
             * Specifies the body property: Body of the query..
             *
             * @param body Body of the query.
             * @return the next definition stage.
             */
            WithCreate withBody(String body);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify related. */
        interface WithRelated {
            /**
             * Specifies the related property: The related metadata items for the function..
             *
             * @param related The related metadata items for the function.
             * @return the next definition stage.
             */
            WithCreate withRelated(LogAnalyticsQueryPackQueryPropertiesRelated related);
        }
        /** The stage of the LogAnalyticsQueryPackQuery definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Additional properties that can be set for the query..
             *
             * @param properties Additional properties that can be set for the query.
             * @return the next definition stage.
             */
            WithCreate withProperties(Object properties);
        }
    }
    /**
     * Begins update for the LogAnalyticsQueryPackQuery resource.
     *
     * @return the stage of resource update.
     */
    LogAnalyticsQueryPackQuery.Update update();

    /** The template for LogAnalyticsQueryPackQuery update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDisplayName,
            UpdateStages.WithDescription,
            UpdateStages.WithBody,
            UpdateStages.WithRelated,
            UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LogAnalyticsQueryPackQuery apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LogAnalyticsQueryPackQuery apply(Context context);
    }
    /** The LogAnalyticsQueryPackQuery update stages. */
    interface UpdateStages {
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags associated with the query..
             *
             * @param tags Tags associated with the query.
             * @return the next definition stage.
             */
            Update withTags(Map<String, List<String>> tags);
        }
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Unique display name for your query within the Query Pack..
             *
             * @param displayName Unique display name for your query within the Query Pack.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the query..
             *
             * @param description Description of the query.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify body. */
        interface WithBody {
            /**
             * Specifies the body property: Body of the query..
             *
             * @param body Body of the query.
             * @return the next definition stage.
             */
            Update withBody(String body);
        }
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify related. */
        interface WithRelated {
            /**
             * Specifies the related property: The related metadata items for the function..
             *
             * @param related The related metadata items for the function.
             * @return the next definition stage.
             */
            Update withRelated(LogAnalyticsQueryPackQueryPropertiesRelated related);
        }
        /** The stage of the LogAnalyticsQueryPackQuery update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Additional properties that can be set for the query..
             *
             * @param properties Additional properties that can be set for the query.
             * @return the next definition stage.
             */
            Update withProperties(Object properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LogAnalyticsQueryPackQuery refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LogAnalyticsQueryPackQuery refresh(Context context);
}
