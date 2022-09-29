// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of GalleryApplication. */
public interface GalleryApplication {
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
     * Gets the description property: The description of this gallery Application Definition resource. This property is
     * updatable.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the eula property: The Eula agreement for the gallery Application Definition.
     *
     * @return the eula value.
     */
    String eula();

    /**
     * Gets the privacyStatementUri property: The privacy statement uri.
     *
     * @return the privacyStatementUri value.
     */
    String privacyStatementUri();

    /**
     * Gets the releaseNoteUri property: The release note uri.
     *
     * @return the releaseNoteUri value.
     */
    String releaseNoteUri();

    /**
     * Gets the endOfLifeDate property: The end of life date of the gallery Application Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    OffsetDateTime endOfLifeDate();

    /**
     * Gets the supportedOSType property: This property allows you to specify the supported type of the OS that
     * application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the supportedOSType value.
     */
    OperatingSystemTypes supportedOSType();

    /**
     * Gets the customActions property: A list of custom actions that can be performed with all of the Gallery
     * Application Versions within this Gallery Application.
     *
     * @return the customActions value.
     */
    List<GalleryApplicationCustomAction> customActions();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationInner object.
     *
     * @return the inner object.
     */
    GalleryApplicationInner innerModel();

    /** The entirety of the GalleryApplication definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The GalleryApplication definition stages. */
    interface DefinitionStages {
        /** The first stage of the GalleryApplication definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the GalleryApplication definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the GalleryApplication definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, galleryName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param galleryName The name of the Shared Application Gallery in which the Application Definition is to
             *     be created.
             * @return the next definition stage.
             */
            WithCreate withExistingGallery(String resourceGroupName, String galleryName);
        }
        /**
         * The stage of the GalleryApplication definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithEula,
                DefinitionStages.WithPrivacyStatementUri,
                DefinitionStages.WithReleaseNoteUri,
                DefinitionStages.WithEndOfLifeDate,
                DefinitionStages.WithSupportedOSType,
                DefinitionStages.WithCustomActions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GalleryApplication create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GalleryApplication create(Context context);
        }
        /** The stage of the GalleryApplication definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryApplication definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this gallery Application Definition resource. This
             * property is updatable..
             *
             * @param description The description of this gallery Application Definition resource. This property is
             *     updatable.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the GalleryApplication definition allowing to specify eula. */
        interface WithEula {
            /**
             * Specifies the eula property: The Eula agreement for the gallery Application Definition..
             *
             * @param eula The Eula agreement for the gallery Application Definition.
             * @return the next definition stage.
             */
            WithCreate withEula(String eula);
        }
        /** The stage of the GalleryApplication definition allowing to specify privacyStatementUri. */
        interface WithPrivacyStatementUri {
            /**
             * Specifies the privacyStatementUri property: The privacy statement uri..
             *
             * @param privacyStatementUri The privacy statement uri.
             * @return the next definition stage.
             */
            WithCreate withPrivacyStatementUri(String privacyStatementUri);
        }
        /** The stage of the GalleryApplication definition allowing to specify releaseNoteUri. */
        interface WithReleaseNoteUri {
            /**
             * Specifies the releaseNoteUri property: The release note uri..
             *
             * @param releaseNoteUri The release note uri.
             * @return the next definition stage.
             */
            WithCreate withReleaseNoteUri(String releaseNoteUri);
        }
        /** The stage of the GalleryApplication definition allowing to specify endOfLifeDate. */
        interface WithEndOfLifeDate {
            /**
             * Specifies the endOfLifeDate property: The end of life date of the gallery Application Definition. This
             * property can be used for decommissioning purposes. This property is updatable..
             *
             * @param endOfLifeDate The end of life date of the gallery Application Definition. This property can be
             *     used for decommissioning purposes. This property is updatable.
             * @return the next definition stage.
             */
            WithCreate withEndOfLifeDate(OffsetDateTime endOfLifeDate);
        }
        /** The stage of the GalleryApplication definition allowing to specify supportedOSType. */
        interface WithSupportedOSType {
            /**
             * Specifies the supportedOSType property: This property allows you to specify the supported type of the OS
             * that application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
             * &lt;br&gt;&lt;br&gt; **Linux**.
             *
             * @param supportedOSType This property allows you to specify the supported type of the OS that application
             *     is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
             *     &lt;br&gt;&lt;br&gt; **Linux**.
             * @return the next definition stage.
             */
            WithCreate withSupportedOSType(OperatingSystemTypes supportedOSType);
        }
        /** The stage of the GalleryApplication definition allowing to specify customActions. */
        interface WithCustomActions {
            /**
             * Specifies the customActions property: A list of custom actions that can be performed with all of the
             * Gallery Application Versions within this Gallery Application..
             *
             * @param customActions A list of custom actions that can be performed with all of the Gallery Application
             *     Versions within this Gallery Application.
             * @return the next definition stage.
             */
            WithCreate withCustomActions(List<GalleryApplicationCustomAction> customActions);
        }
    }
    /**
     * Begins update for the GalleryApplication resource.
     *
     * @return the stage of resource update.
     */
    GalleryApplication.Update update();

    /** The template for GalleryApplication update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithEula,
            UpdateStages.WithPrivacyStatementUri,
            UpdateStages.WithReleaseNoteUri,
            UpdateStages.WithEndOfLifeDate,
            UpdateStages.WithSupportedOSType,
            UpdateStages.WithCustomActions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GalleryApplication apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GalleryApplication apply(Context context);
    }
    /** The GalleryApplication update stages. */
    interface UpdateStages {
        /** The stage of the GalleryApplication update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryApplication update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this gallery Application Definition resource. This
             * property is updatable..
             *
             * @param description The description of this gallery Application Definition resource. This property is
             *     updatable.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the GalleryApplication update allowing to specify eula. */
        interface WithEula {
            /**
             * Specifies the eula property: The Eula agreement for the gallery Application Definition..
             *
             * @param eula The Eula agreement for the gallery Application Definition.
             * @return the next definition stage.
             */
            Update withEula(String eula);
        }
        /** The stage of the GalleryApplication update allowing to specify privacyStatementUri. */
        interface WithPrivacyStatementUri {
            /**
             * Specifies the privacyStatementUri property: The privacy statement uri..
             *
             * @param privacyStatementUri The privacy statement uri.
             * @return the next definition stage.
             */
            Update withPrivacyStatementUri(String privacyStatementUri);
        }
        /** The stage of the GalleryApplication update allowing to specify releaseNoteUri. */
        interface WithReleaseNoteUri {
            /**
             * Specifies the releaseNoteUri property: The release note uri..
             *
             * @param releaseNoteUri The release note uri.
             * @return the next definition stage.
             */
            Update withReleaseNoteUri(String releaseNoteUri);
        }
        /** The stage of the GalleryApplication update allowing to specify endOfLifeDate. */
        interface WithEndOfLifeDate {
            /**
             * Specifies the endOfLifeDate property: The end of life date of the gallery Application Definition. This
             * property can be used for decommissioning purposes. This property is updatable..
             *
             * @param endOfLifeDate The end of life date of the gallery Application Definition. This property can be
             *     used for decommissioning purposes. This property is updatable.
             * @return the next definition stage.
             */
            Update withEndOfLifeDate(OffsetDateTime endOfLifeDate);
        }
        /** The stage of the GalleryApplication update allowing to specify supportedOSType. */
        interface WithSupportedOSType {
            /**
             * Specifies the supportedOSType property: This property allows you to specify the supported type of the OS
             * that application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
             * &lt;br&gt;&lt;br&gt; **Linux**.
             *
             * @param supportedOSType This property allows you to specify the supported type of the OS that application
             *     is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
             *     &lt;br&gt;&lt;br&gt; **Linux**.
             * @return the next definition stage.
             */
            Update withSupportedOSType(OperatingSystemTypes supportedOSType);
        }
        /** The stage of the GalleryApplication update allowing to specify customActions. */
        interface WithCustomActions {
            /**
             * Specifies the customActions property: A list of custom actions that can be performed with all of the
             * Gallery Application Versions within this Gallery Application..
             *
             * @param customActions A list of custom actions that can be performed with all of the Gallery Application
             *     Versions within this Gallery Application.
             * @return the next definition stage.
             */
            Update withCustomActions(List<GalleryApplicationCustomAction> customActions);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GalleryApplication refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GalleryApplication refresh(Context context);
}
