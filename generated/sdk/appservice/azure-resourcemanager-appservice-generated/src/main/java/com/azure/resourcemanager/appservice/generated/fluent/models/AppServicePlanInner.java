// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.appservice.generated.models.ExtendedLocation;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.StatusOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * App Service plan.
 */
@Fluent
public final class AppServicePlanInner extends Resource {
    /*
     * AppServicePlan resource specific properties
     */
    @JsonProperty(value = "properties")
    private AppServicePlanProperties innerProperties;

    /*
     * Description of a SKU for a scalable resource.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /*
     * Extended Location.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of AppServicePlanInner class.
     */
    public AppServicePlanInner() {
    }

    /**
     * Get the innerProperties property: AppServicePlan resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private AppServicePlanProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Description of a SKU for a scalable resource.
     * 
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Description of a SKU for a scalable resource.
     * 
     * @param sku the sku value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the extendedLocation property: Extended Location.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended Location.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     * 
     * @param kind the kind value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppServicePlanInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppServicePlanInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the workerTierName property: Target worker tier assigned to the App Service plan.
     * 
     * @return the workerTierName value.
     */
    public String workerTierName() {
        return this.innerProperties() == null ? null : this.innerProperties().workerTierName();
    }

    /**
     * Set the workerTierName property: Target worker tier assigned to the App Service plan.
     * 
     * @param workerTierName the workerTierName value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withWorkerTierName(String workerTierName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withWorkerTierName(workerTierName);
        return this;
    }

    /**
     * Get the status property: App Service plan status.
     * 
     * @return the status value.
     */
    public StatusOptions status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the subscription property: App Service plan subscription.
     * 
     * @return the subscription value.
     */
    public String subscription() {
        return this.innerProperties() == null ? null : this.innerProperties().subscription();
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App Service plan.
     * 
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hostingEnvironmentProfile();
    }

    /**
     * Set the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App Service plan.
     * 
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        return this;
    }

    /**
     * Get the maximumNumberOfWorkers property: Maximum number of instances that can be assigned to this App Service plan.
     * 
     * @return the maximumNumberOfWorkers value.
     */
    public Integer maximumNumberOfWorkers() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumNumberOfWorkers();
    }

    /**
     * Get the numberOfWorkers property: The number of instances that are assigned to this App Service plan.
     * 
     * @return the numberOfWorkers value.
     */
    public Integer numberOfWorkers() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfWorkers();
    }

    /**
     * Get the geoRegion property: Geographical location for the App Service plan.
     * 
     * @return the geoRegion value.
     */
    public String geoRegion() {
        return this.innerProperties() == null ? null : this.innerProperties().geoRegion();
    }

    /**
     * Get the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     * @return the perSiteScaling value.
     */
    public Boolean perSiteScaling() {
        return this.innerProperties() == null ? null : this.innerProperties().perSiteScaling();
    }

    /**
     * Set the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     * 
     * @param perSiteScaling the perSiteScaling value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withPerSiteScaling(Boolean perSiteScaling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withPerSiteScaling(perSiteScaling);
        return this;
    }

    /**
     * Get the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the ServerFarm was ElasticPremium sku.
     * 
     * @return the elasticScaleEnabled value.
     */
    public Boolean elasticScaleEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().elasticScaleEnabled();
    }

    /**
     * Set the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the ServerFarm was ElasticPremium sku.
     * 
     * @param elasticScaleEnabled the elasticScaleEnabled value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withElasticScaleEnabled(Boolean elasticScaleEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withElasticScaleEnabled(elasticScaleEnabled);
        return this;
    }

    /**
     * Get the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan.
     * 
     * @return the maximumElasticWorkerCount value.
     */
    public Integer maximumElasticWorkerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumElasticWorkerCount();
    }

    /**
     * Set the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan.
     * 
     * @param maximumElasticWorkerCount the maximumElasticWorkerCount value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withMaximumElasticWorkerCount(maximumElasticWorkerCount);
        return this;
    }

    /**
     * Get the numberOfSites property: Number of apps assigned to this App Service plan.
     * 
     * @return the numberOfSites value.
     */
    public Integer numberOfSites() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfSites();
    }

    /**
     * Get the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.innerProperties() == null ? null : this.innerProperties().isSpot();
    }

    /**
     * Set the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     * @param isSpot the isSpot value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withIsSpot(Boolean isSpot) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withIsSpot(isSpot);
        return this;
    }

    /**
     * Get the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     * @return the spotExpirationTime value.
     */
    public OffsetDateTime spotExpirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().spotExpirationTime();
    }

    /**
     * Set the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server farm.
     * 
     * @param spotExpirationTime the spotExpirationTime value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withSpotExpirationTime(OffsetDateTime spotExpirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withSpotExpirationTime(spotExpirationTime);
        return this;
    }

    /**
     * Get the freeOfferExpirationTime property: The time when the server farm free offer expires.
     * 
     * @return the freeOfferExpirationTime value.
     */
    public OffsetDateTime freeOfferExpirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().freeOfferExpirationTime();
    }

    /**
     * Set the freeOfferExpirationTime property: The time when the server farm free offer expires.
     * 
     * @param freeOfferExpirationTime the freeOfferExpirationTime value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withFreeOfferExpirationTime(freeOfferExpirationTime);
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group of the App Service plan.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.innerProperties() == null ? null : this.innerProperties().reserved();
    }

    /**
     * Set the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param reserved the reserved value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withReserved(Boolean reserved) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withReserved(reserved);
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.innerProperties() == null ? null : this.innerProperties().isXenon();
    }

    /**
     * Set the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param isXenon the isXenon value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withIsXenon(Boolean isXenon) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withIsXenon(isXenon);
        return this;
    }

    /**
     * Get the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperV();
    }

    /**
     * Set the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param hyperV the hyperV value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withHyperV(Boolean hyperV) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withHyperV(hyperV);
        return this;
    }

    /**
     * Get the targetWorkerCount property: Scaling worker count.
     * 
     * @return the targetWorkerCount value.
     */
    public Integer targetWorkerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().targetWorkerCount();
    }

    /**
     * Set the targetWorkerCount property: Scaling worker count.
     * 
     * @param targetWorkerCount the targetWorkerCount value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerCount(Integer targetWorkerCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withTargetWorkerCount(targetWorkerCount);
        return this;
    }

    /**
     * Get the targetWorkerSizeId property: Scaling worker size ID.
     * 
     * @return the targetWorkerSizeId value.
     */
    public Integer targetWorkerSizeId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetWorkerSizeId();
    }

    /**
     * Set the targetWorkerSizeId property: Scaling worker size ID.
     * 
     * @param targetWorkerSizeId the targetWorkerSizeId value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withTargetWorkerSizeId(targetWorkerSizeId);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App Service Plan.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     * @return the kubeEnvironmentProfile value.
     */
    public KubeEnvironmentProfile kubeEnvironmentProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().kubeEnvironmentProfile();
    }

    /**
     * Set the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service plan.
     * 
     * @param kubeEnvironmentProfile the kubeEnvironmentProfile value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withKubeEnvironmentProfile(kubeEnvironmentProfile);
        return this;
    }

    /**
     * Get the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability zone balancing.
     * If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone balancing.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Set the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability zone balancing.
     * If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone balancing.
     * 
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServicePlanProperties();
        }
        this.innerProperties().withZoneRedundant(zoneRedundant);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
