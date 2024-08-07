// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServicePlanInner;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlan;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlanPatchResource;
import com.azure.resourcemanager.appservice.generated.models.ExtendedLocation;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.StatusOptions;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class AppServicePlanImpl implements AppServicePlan, AppServicePlan.Definition, AppServicePlan.Update {
    private AppServicePlanInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SkuDescription sku() {
        return this.innerModel().sku();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String workerTierName() {
        return this.innerModel().workerTierName();
    }

    public StatusOptions status() {
        return this.innerModel().status();
    }

    public String subscription() {
        return this.innerModel().subscription();
    }

    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerModel().hostingEnvironmentProfile();
    }

    public Integer maximumNumberOfWorkers() {
        return this.innerModel().maximumNumberOfWorkers();
    }

    public Integer numberOfWorkers() {
        return this.innerModel().numberOfWorkers();
    }

    public String geoRegion() {
        return this.innerModel().geoRegion();
    }

    public Boolean perSiteScaling() {
        return this.innerModel().perSiteScaling();
    }

    public Boolean elasticScaleEnabled() {
        return this.innerModel().elasticScaleEnabled();
    }

    public Integer maximumElasticWorkerCount() {
        return this.innerModel().maximumElasticWorkerCount();
    }

    public Integer numberOfSites() {
        return this.innerModel().numberOfSites();
    }

    public Boolean isSpot() {
        return this.innerModel().isSpot();
    }

    public OffsetDateTime spotExpirationTime() {
        return this.innerModel().spotExpirationTime();
    }

    public OffsetDateTime freeOfferExpirationTime() {
        return this.innerModel().freeOfferExpirationTime();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public Boolean reserved() {
        return this.innerModel().reserved();
    }

    public Boolean isXenon() {
        return this.innerModel().isXenon();
    }

    public Boolean hyperV() {
        return this.innerModel().hyperV();
    }

    public Integer targetWorkerCount() {
        return this.innerModel().targetWorkerCount();
    }

    public Integer targetWorkerSizeId() {
        return this.innerModel().targetWorkerSizeId();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public KubeEnvironmentProfile kubeEnvironmentProfile() {
        return this.innerModel().kubeEnvironmentProfile();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AppServicePlanInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private AppServicePlanPatchResource updateAppServicePlan;

    public AppServicePlanImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AppServicePlan create() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public AppServicePlan create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    AppServicePlanImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new AppServicePlanInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public AppServicePlanImpl update() {
        this.updateAppServicePlan = new AppServicePlanPatchResource();
        return this;
    }

    public AppServicePlan apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .updateWithResponse(resourceGroupName, name, updateAppServicePlan, Context.NONE)
            .getValue();
        return this;
    }

    public AppServicePlan apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .updateWithResponse(resourceGroupName, name, updateAppServicePlan, context)
            .getValue();
        return this;
    }

    AppServicePlanImpl(AppServicePlanInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "serverfarms");
    }

    public AppServicePlan refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
            .getValue();
        return this;
    }

    public AppServicePlan refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServicePlans()
            .getByResourceGroupWithResponse(resourceGroupName, name, context)
            .getValue();
        return this;
    }

    public Response<Void> restartWebAppsWithResponse(Boolean softRestart, Context context) {
        return serviceManager.appServicePlans()
            .restartWebAppsWithResponse(resourceGroupName, name, softRestart, context);
    }

    public void restartWebApps() {
        serviceManager.appServicePlans().restartWebApps(resourceGroupName, name);
    }

    public AppServicePlanImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppServicePlanImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppServicePlanImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AppServicePlanImpl withSku(SkuDescription sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public AppServicePlanImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public AppServicePlanImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateAppServicePlan.withKind(kind);
            return this;
        }
    }

    public AppServicePlanImpl withWorkerTierName(String workerTierName) {
        if (isInCreateMode()) {
            this.innerModel().withWorkerTierName(workerTierName);
            return this;
        } else {
            this.updateAppServicePlan.withWorkerTierName(workerTierName);
            return this;
        }
    }

    public AppServicePlanImpl withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.innerModel().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        return this;
    }

    public AppServicePlanImpl withPerSiteScaling(Boolean perSiteScaling) {
        if (isInCreateMode()) {
            this.innerModel().withPerSiteScaling(perSiteScaling);
            return this;
        } else {
            this.updateAppServicePlan.withPerSiteScaling(perSiteScaling);
            return this;
        }
    }

    public AppServicePlanImpl withElasticScaleEnabled(Boolean elasticScaleEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withElasticScaleEnabled(elasticScaleEnabled);
            return this;
        } else {
            this.updateAppServicePlan.withElasticScaleEnabled(elasticScaleEnabled);
            return this;
        }
    }

    public AppServicePlanImpl withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
        if (isInCreateMode()) {
            this.innerModel().withMaximumElasticWorkerCount(maximumElasticWorkerCount);
            return this;
        } else {
            this.updateAppServicePlan.withMaximumElasticWorkerCount(maximumElasticWorkerCount);
            return this;
        }
    }

    public AppServicePlanImpl withIsSpot(Boolean isSpot) {
        if (isInCreateMode()) {
            this.innerModel().withIsSpot(isSpot);
            return this;
        } else {
            this.updateAppServicePlan.withIsSpot(isSpot);
            return this;
        }
    }

    public AppServicePlanImpl withSpotExpirationTime(OffsetDateTime spotExpirationTime) {
        if (isInCreateMode()) {
            this.innerModel().withSpotExpirationTime(spotExpirationTime);
            return this;
        } else {
            this.updateAppServicePlan.withSpotExpirationTime(spotExpirationTime);
            return this;
        }
    }

    public AppServicePlanImpl withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime) {
        if (isInCreateMode()) {
            this.innerModel().withFreeOfferExpirationTime(freeOfferExpirationTime);
            return this;
        } else {
            this.updateAppServicePlan.withFreeOfferExpirationTime(freeOfferExpirationTime);
            return this;
        }
    }

    public AppServicePlanImpl withReserved(Boolean reserved) {
        this.innerModel().withReserved(reserved);
        return this;
    }

    public AppServicePlanImpl withIsXenon(Boolean isXenon) {
        this.innerModel().withIsXenon(isXenon);
        return this;
    }

    public AppServicePlanImpl withHyperV(Boolean hyperV) {
        this.innerModel().withHyperV(hyperV);
        return this;
    }

    public AppServicePlanImpl withTargetWorkerCount(Integer targetWorkerCount) {
        if (isInCreateMode()) {
            this.innerModel().withTargetWorkerCount(targetWorkerCount);
            return this;
        } else {
            this.updateAppServicePlan.withTargetWorkerCount(targetWorkerCount);
            return this;
        }
    }

    public AppServicePlanImpl withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        if (isInCreateMode()) {
            this.innerModel().withTargetWorkerSizeId(targetWorkerSizeId);
            return this;
        } else {
            this.updateAppServicePlan.withTargetWorkerSizeId(targetWorkerSizeId);
            return this;
        }
    }

    public AppServicePlanImpl withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile) {
        if (isInCreateMode()) {
            this.innerModel().withKubeEnvironmentProfile(kubeEnvironmentProfile);
            return this;
        } else {
            this.updateAppServicePlan.withKubeEnvironmentProfile(kubeEnvironmentProfile);
            return this;
        }
    }

    public AppServicePlanImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.innerModel().withZoneRedundant(zoneRedundant);
            return this;
        } else {
            this.updateAppServicePlan.withZoneRedundant(zoneRedundant);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
