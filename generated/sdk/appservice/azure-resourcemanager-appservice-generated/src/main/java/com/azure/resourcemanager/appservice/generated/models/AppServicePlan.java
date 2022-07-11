// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServicePlanInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of AppServicePlan. */
public interface AppServicePlan {
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
     * Gets the sku property: Description of a SKU for a scalable resource.
     *
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * Gets the extendedLocation property: Extended Location.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the workerTierName property: Target worker tier assigned to the App Service plan.
     *
     * @return the workerTierName value.
     */
    String workerTierName();

    /**
     * Gets the status property: App Service plan status.
     *
     * @return the status value.
     */
    StatusOptions status();

    /**
     * Gets the subscription property: App Service plan subscription.
     *
     * @return the subscription value.
     */
    String subscription();

    /**
     * Gets the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App
     * Service plan.
     *
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * Gets the maximumNumberOfWorkers property: Maximum number of instances that can be assigned to this App Service
     * plan.
     *
     * @return the maximumNumberOfWorkers value.
     */
    Integer maximumNumberOfWorkers();

    /**
     * Gets the numberOfWorkers property: The number of instances that are assigned to this App Service plan.
     *
     * @return the numberOfWorkers value.
     */
    Integer numberOfWorkers();

    /**
     * Gets the geoRegion property: Geographical location for the App Service plan.
     *
     * @return the geoRegion value.
     */
    String geoRegion();

    /**
     * Gets the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
     * scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all
     * instances of the plan.
     *
     * @return the perSiteScaling value.
     */
    Boolean perSiteScaling();

    /**
     * Gets the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku.
     *
     * @return the elasticScaleEnabled value.
     */
    Boolean elasticScaleEnabled();

    /**
     * Gets the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled
     * App Service Plan.
     *
     * @return the maximumElasticWorkerCount value.
     */
    Integer maximumElasticWorkerCount();

    /**
     * Gets the numberOfSites property: Number of apps assigned to this App Service plan.
     *
     * @return the numberOfSites value.
     */
    Integer numberOfSites();

    /**
     * Gets the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     *
     * @return the isSpot value.
     */
    Boolean isSpot();

    /**
     * Gets the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server
     * farm.
     *
     * @return the spotExpirationTime value.
     */
    OffsetDateTime spotExpirationTime();

    /**
     * Gets the freeOfferExpirationTime property: The time when the server farm free offer expires.
     *
     * @return the freeOfferExpirationTime value.
     */
    OffsetDateTime freeOfferExpirationTime();

    /**
     * Gets the resourceGroup property: Resource group of the App Service plan.
     *
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * Gets the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * Gets the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * Gets the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the hyperV value.
     */
    Boolean hyperV();

    /**
     * Gets the targetWorkerCount property: Scaling worker count.
     *
     * @return the targetWorkerCount value.
     */
    Integer targetWorkerCount();

    /**
     * Gets the targetWorkerSizeId property: Scaling worker size ID.
     *
     * @return the targetWorkerSizeId value.
     */
    Integer targetWorkerSizeId();

    /**
     * Gets the provisioningState property: Provisioning state of the App Service Plan.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service
     * plan.
     *
     * @return the kubeEnvironmentProfile value.
     */
    KubeEnvironmentProfile kubeEnvironmentProfile();

    /**
     * Gets the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform
     * availability zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform
     * availability zone balancing.
     *
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

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
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AppServicePlanInner object.
     *
     * @return the inner object.
     */
    AppServicePlanInner innerModel();

    /** The entirety of the AppServicePlan definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AppServicePlan definition stages. */
    interface DefinitionStages {
        /** The first stage of the AppServicePlan definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AppServicePlan definition allowing to specify location. */
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
        /** The stage of the AppServicePlan definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AppServicePlan definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithKind,
                DefinitionStages.WithWorkerTierName,
                DefinitionStages.WithHostingEnvironmentProfile,
                DefinitionStages.WithPerSiteScaling,
                DefinitionStages.WithElasticScaleEnabled,
                DefinitionStages.WithMaximumElasticWorkerCount,
                DefinitionStages.WithIsSpot,
                DefinitionStages.WithSpotExpirationTime,
                DefinitionStages.WithFreeOfferExpirationTime,
                DefinitionStages.WithReserved,
                DefinitionStages.WithIsXenon,
                DefinitionStages.WithHyperV,
                DefinitionStages.WithTargetWorkerCount,
                DefinitionStages.WithTargetWorkerSizeId,
                DefinitionStages.WithKubeEnvironmentProfile,
                DefinitionStages.WithZoneRedundant {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AppServicePlan create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AppServicePlan create(Context context);
        }
        /** The stage of the AppServicePlan definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AppServicePlan definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Description of a SKU for a scalable resource..
             *
             * @param sku Description of a SKU for a scalable resource.
             * @return the next definition stage.
             */
            WithCreate withSku(SkuDescription sku);
        }
        /** The stage of the AppServicePlan definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: Extended Location..
             *
             * @param extendedLocation Extended Location.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the AppServicePlan definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the AppServicePlan definition allowing to specify workerTierName. */
        interface WithWorkerTierName {
            /**
             * Specifies the workerTierName property: Target worker tier assigned to the App Service plan..
             *
             * @param workerTierName Target worker tier assigned to the App Service plan.
             * @return the next definition stage.
             */
            WithCreate withWorkerTierName(String workerTierName);
        }
        /** The stage of the AppServicePlan definition allowing to specify hostingEnvironmentProfile. */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies the hostingEnvironmentProfile property: Specification for the App Service Environment to use
             * for the App Service plan..
             *
             * @param hostingEnvironmentProfile Specification for the App Service Environment to use for the App Service
             *     plan.
             * @return the next definition stage.
             */
            WithCreate withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }
        /** The stage of the AppServicePlan definition allowing to specify perSiteScaling. */
        interface WithPerSiteScaling {
            /**
             * Specifies the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App
             * Service plan can be scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App
             * Service plan will scale to all instances of the plan..
             *
             * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
             *     scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will
             *     scale to all instances of the plan.
             * @return the next definition stage.
             */
            WithCreate withPerSiteScaling(Boolean perSiteScaling);
        }
        /** The stage of the AppServicePlan definition allowing to specify elasticScaleEnabled. */
        interface WithElasticScaleEnabled {
            /**
             * Specifies the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will
             * scale as if the ServerFarm was ElasticPremium sku.
             *
             * @param elasticScaleEnabled ServerFarm supports ElasticScale. Apps in this plan will scale as if the
             *     ServerFarm was ElasticPremium sku.
             * @return the next definition stage.
             */
            WithCreate withElasticScaleEnabled(Boolean elasticScaleEnabled);
        }
        /** The stage of the AppServicePlan definition allowing to specify maximumElasticWorkerCount. */
        interface WithMaximumElasticWorkerCount {
            /**
             * Specifies the maximumElasticWorkerCount property: Maximum number of total workers allowed for this
             * ElasticScaleEnabled App Service Plan.
             *
             * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App
             *     Service Plan.
             * @return the next definition stage.
             */
            WithCreate withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount);
        }
        /** The stage of the AppServicePlan definition allowing to specify isSpot. */
        interface WithIsSpot {
            /**
             * Specifies the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot
             * instances..
             *
             * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
             * @return the next definition stage.
             */
            WithCreate withIsSpot(Boolean isSpot);
        }
        /** The stage of the AppServicePlan definition allowing to specify spotExpirationTime. */
        interface WithSpotExpirationTime {
            /**
             * Specifies the spotExpirationTime property: The time when the server farm expires. Valid only if it is a
             * spot server farm..
             *
             * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm.
             * @return the next definition stage.
             */
            WithCreate withSpotExpirationTime(OffsetDateTime spotExpirationTime);
        }
        /** The stage of the AppServicePlan definition allowing to specify freeOfferExpirationTime. */
        interface WithFreeOfferExpirationTime {
            /**
             * Specifies the freeOfferExpirationTime property: The time when the server farm free offer expires..
             *
             * @param freeOfferExpirationTime The time when the server farm free offer expires.
             * @return the next definition stage.
             */
            WithCreate withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime);
        }
        /** The stage of the AppServicePlan definition allowing to specify reserved. */
        interface WithReserved {
            /**
             * Specifies the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
             * &lt;code&gt;false&lt;/code&gt; otherwise..
             *
             * @param reserved If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt;
             *     otherwise.
             * @return the next definition stage.
             */
            WithCreate withReserved(Boolean reserved);
        }
        /** The stage of the AppServicePlan definition allowing to specify isXenon. */
        interface WithIsXenon {
            /**
             * Specifies the isXenon property: Obsolete: If Hyper-V container app service plan
             * &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise..
             *
             * @param isXenon Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
             *     &lt;code&gt;false&lt;/code&gt; otherwise.
             * @return the next definition stage.
             */
            WithCreate withIsXenon(Boolean isXenon);
        }
        /** The stage of the AppServicePlan definition allowing to specify hyperV. */
        interface WithHyperV {
            /**
             * Specifies the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
             * &lt;code&gt;false&lt;/code&gt; otherwise..
             *
             * @param hyperV If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
             *     &lt;code&gt;false&lt;/code&gt; otherwise.
             * @return the next definition stage.
             */
            WithCreate withHyperV(Boolean hyperV);
        }
        /** The stage of the AppServicePlan definition allowing to specify targetWorkerCount. */
        interface WithTargetWorkerCount {
            /**
             * Specifies the targetWorkerCount property: Scaling worker count..
             *
             * @param targetWorkerCount Scaling worker count.
             * @return the next definition stage.
             */
            WithCreate withTargetWorkerCount(Integer targetWorkerCount);
        }
        /** The stage of the AppServicePlan definition allowing to specify targetWorkerSizeId. */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies the targetWorkerSizeId property: Scaling worker size ID..
             *
             * @param targetWorkerSizeId Scaling worker size ID.
             * @return the next definition stage.
             */
            WithCreate withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }
        /** The stage of the AppServicePlan definition allowing to specify kubeEnvironmentProfile. */
        interface WithKubeEnvironmentProfile {
            /**
             * Specifies the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for
             * the App Service plan..
             *
             * @param kubeEnvironmentProfile Specification for the Kubernetes Environment to use for the App Service
             *     plan.
             * @return the next definition stage.
             */
            WithCreate withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile);
        }
        /** The stage of the AppServicePlan definition allowing to specify zoneRedundant. */
        interface WithZoneRedundant {
            /**
             * Specifies the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will
             * perform availability zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not
             * perform availability zone balancing..
             *
             * @param zoneRedundant If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
             *     zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform
             *     availability zone balancing.
             * @return the next definition stage.
             */
            WithCreate withZoneRedundant(Boolean zoneRedundant);
        }
    }
    /**
     * Begins update for the AppServicePlan resource.
     *
     * @return the stage of resource update.
     */
    AppServicePlan.Update update();

    /** The template for AppServicePlan update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithWorkerTierName,
            UpdateStages.WithPerSiteScaling,
            UpdateStages.WithElasticScaleEnabled,
            UpdateStages.WithMaximumElasticWorkerCount,
            UpdateStages.WithIsSpot,
            UpdateStages.WithSpotExpirationTime,
            UpdateStages.WithFreeOfferExpirationTime,
            UpdateStages.WithTargetWorkerCount,
            UpdateStages.WithTargetWorkerSizeId,
            UpdateStages.WithKubeEnvironmentProfile,
            UpdateStages.WithZoneRedundant {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AppServicePlan apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AppServicePlan apply(Context context);
    }
    /** The AppServicePlan update stages. */
    interface UpdateStages {
        /** The stage of the AppServicePlan update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the AppServicePlan update allowing to specify workerTierName. */
        interface WithWorkerTierName {
            /**
             * Specifies the workerTierName property: Target worker tier assigned to the App Service plan..
             *
             * @param workerTierName Target worker tier assigned to the App Service plan.
             * @return the next definition stage.
             */
            Update withWorkerTierName(String workerTierName);
        }
        /** The stage of the AppServicePlan update allowing to specify perSiteScaling. */
        interface WithPerSiteScaling {
            /**
             * Specifies the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App
             * Service plan can be scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App
             * Service plan will scale to all instances of the plan..
             *
             * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
             *     scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will
             *     scale to all instances of the plan.
             * @return the next definition stage.
             */
            Update withPerSiteScaling(Boolean perSiteScaling);
        }
        /** The stage of the AppServicePlan update allowing to specify elasticScaleEnabled. */
        interface WithElasticScaleEnabled {
            /**
             * Specifies the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will
             * scale as if the ServerFarm was ElasticPremium sku.
             *
             * @param elasticScaleEnabled ServerFarm supports ElasticScale. Apps in this plan will scale as if the
             *     ServerFarm was ElasticPremium sku.
             * @return the next definition stage.
             */
            Update withElasticScaleEnabled(Boolean elasticScaleEnabled);
        }
        /** The stage of the AppServicePlan update allowing to specify maximumElasticWorkerCount. */
        interface WithMaximumElasticWorkerCount {
            /**
             * Specifies the maximumElasticWorkerCount property: Maximum number of total workers allowed for this
             * ElasticScaleEnabled App Service Plan.
             *
             * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App
             *     Service Plan.
             * @return the next definition stage.
             */
            Update withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount);
        }
        /** The stage of the AppServicePlan update allowing to specify isSpot. */
        interface WithIsSpot {
            /**
             * Specifies the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot
             * instances..
             *
             * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
             * @return the next definition stage.
             */
            Update withIsSpot(Boolean isSpot);
        }
        /** The stage of the AppServicePlan update allowing to specify spotExpirationTime. */
        interface WithSpotExpirationTime {
            /**
             * Specifies the spotExpirationTime property: The time when the server farm expires. Valid only if it is a
             * spot server farm..
             *
             * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm.
             * @return the next definition stage.
             */
            Update withSpotExpirationTime(OffsetDateTime spotExpirationTime);
        }
        /** The stage of the AppServicePlan update allowing to specify freeOfferExpirationTime. */
        interface WithFreeOfferExpirationTime {
            /**
             * Specifies the freeOfferExpirationTime property: The time when the server farm free offer expires..
             *
             * @param freeOfferExpirationTime The time when the server farm free offer expires.
             * @return the next definition stage.
             */
            Update withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime);
        }
        /** The stage of the AppServicePlan update allowing to specify targetWorkerCount. */
        interface WithTargetWorkerCount {
            /**
             * Specifies the targetWorkerCount property: Scaling worker count..
             *
             * @param targetWorkerCount Scaling worker count.
             * @return the next definition stage.
             */
            Update withTargetWorkerCount(Integer targetWorkerCount);
        }
        /** The stage of the AppServicePlan update allowing to specify targetWorkerSizeId. */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies the targetWorkerSizeId property: Scaling worker size ID..
             *
             * @param targetWorkerSizeId Scaling worker size ID.
             * @return the next definition stage.
             */
            Update withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }
        /** The stage of the AppServicePlan update allowing to specify kubeEnvironmentProfile. */
        interface WithKubeEnvironmentProfile {
            /**
             * Specifies the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for
             * the App Service plan..
             *
             * @param kubeEnvironmentProfile Specification for the Kubernetes Environment to use for the App Service
             *     plan.
             * @return the next definition stage.
             */
            Update withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile);
        }
        /** The stage of the AppServicePlan update allowing to specify zoneRedundant. */
        interface WithZoneRedundant {
            /**
             * Specifies the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will
             * perform availability zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not
             * perform availability zone balancing..
             *
             * @param zoneRedundant If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
             *     zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform
             *     availability zone balancing.
             * @return the next definition stage.
             */
            Update withZoneRedundant(Boolean zoneRedundant);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AppServicePlan refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AppServicePlan refresh(Context context);

    /**
     * Restart all apps in an App Service plan.
     *
     * <p>Description for Restart all apps in an App Service plan.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restartWebApps();

    /**
     * Restart all apps in an App Service plan.
     *
     * <p>Description for Restart all apps in an App Service plan.
     *
     * @param softRestart Specify &lt;code&gt;true&lt;/code&gt; to perform a soft restart, applies the configuration
     *     settings and restarts the apps if necessary. The default is &lt;code&gt;false&lt;/code&gt;, which always
     *     restarts and reprovisions the apps.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> restartWebAppsWithResponse(Boolean softRestart, Context context);
}
