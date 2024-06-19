// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.StatusOptions;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * AppServicePlan resource specific properties.
 */
@Fluent
public final class AppServicePlanProperties implements JsonSerializable<AppServicePlanProperties> {
    /*
     * Target worker tier assigned to the App Service plan.
     */
    private String workerTierName;

    /*
     * App Service plan status.
     */
    private StatusOptions status;

    /*
     * App Service plan subscription.
     */
    private String subscription;

    /*
     * Specification for the App Service Environment to use for the App Service plan.
     */
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * Maximum number of instances that can be assigned to this App Service plan.
     */
    private Integer maximumNumberOfWorkers;

    /*
     * The number of instances that are assigned to this App Service plan.
     */
    private Integer numberOfWorkers;

    /*
     * Geographical location for the App Service plan.
     */
    private String geoRegion;

    /*
     * If <code>true</code>, apps assigned to this App Service plan can be scaled independently.
     * If <code>false</code>, apps assigned to this App Service plan will scale to all instances of the plan.
     */
    private Boolean perSiteScaling;

    /*
     * ServerFarm supports ElasticScale. Apps in this plan will scale as if the ServerFarm was ElasticPremium sku
     */
    private Boolean elasticScaleEnabled;

    /*
     * Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
     */
    private Integer maximumElasticWorkerCount;

    /*
     * Number of apps assigned to this App Service plan.
     */
    private Integer numberOfSites;

    /*
     * If <code>true</code>, this App Service Plan owns spot instances.
     */
    private Boolean isSpot;

    /*
     * The time when the server farm expires. Valid only if it is a spot server farm.
     */
    private OffsetDateTime spotExpirationTime;

    /*
     * The time when the server farm free offer expires.
     */
    private OffsetDateTime freeOfferExpirationTime;

    /*
     * Resource group of the App Service plan.
     */
    private String resourceGroup;

    /*
     * If Linux app service plan <code>true</code>, <code>false</code> otherwise.
     */
    private Boolean reserved;

    /*
     * Obsolete: If Hyper-V container app service plan <code>true</code>, <code>false</code> otherwise.
     */
    private Boolean isXenon;

    /*
     * If Hyper-V container app service plan <code>true</code>, <code>false</code> otherwise.
     */
    private Boolean hyperV;

    /*
     * Scaling worker count.
     */
    private Integer targetWorkerCount;

    /*
     * Scaling worker size ID.
     */
    private Integer targetWorkerSizeId;

    /*
     * Provisioning state of the App Service Plan.
     */
    private ProvisioningState provisioningState;

    /*
     * Specification for the Kubernetes Environment to use for the App Service plan.
     */
    private KubeEnvironmentProfile kubeEnvironmentProfile;

    /*
     * If <code>true</code>, this App Service Plan will perform availability zone balancing.
     * If <code>false</code>, this App Service Plan will not perform availability zone balancing.
     */
    private Boolean zoneRedundant;

    /**
     * Creates an instance of AppServicePlanProperties class.
     */
    public AppServicePlanProperties() {
    }

    /**
     * Get the workerTierName property: Target worker tier assigned to the App Service plan.
     * 
     * @return the workerTierName value.
     */
    public String workerTierName() {
        return this.workerTierName;
    }

    /**
     * Set the workerTierName property: Target worker tier assigned to the App Service plan.
     * 
     * @param workerTierName the workerTierName value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withWorkerTierName(String workerTierName) {
        this.workerTierName = workerTierName;
        return this;
    }

    /**
     * Get the status property: App Service plan status.
     * 
     * @return the status value.
     */
    public StatusOptions status() {
        return this.status;
    }

    /**
     * Get the subscription property: App Service plan subscription.
     * 
     * @return the subscription value.
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App
     * Service plan.
     * 
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App
     * Service plan.
     * 
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the maximumNumberOfWorkers property: Maximum number of instances that can be assigned to this App Service
     * plan.
     * 
     * @return the maximumNumberOfWorkers value.
     */
    public Integer maximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }

    /**
     * Get the numberOfWorkers property: The number of instances that are assigned to this App Service plan.
     * 
     * @return the numberOfWorkers value.
     */
    public Integer numberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Get the geoRegion property: Geographical location for the App Service plan.
     * 
     * @return the geoRegion value.
     */
    public String geoRegion() {
        return this.geoRegion;
    }

    /**
     * Get the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
     * scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the
     * plan.
     * 
     * @return the perSiteScaling value.
     */
    public Boolean perSiteScaling() {
        return this.perSiteScaling;
    }

    /**
     * Set the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
     * scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the
     * plan.
     * 
     * @param perSiteScaling the perSiteScaling value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withPerSiteScaling(Boolean perSiteScaling) {
        this.perSiteScaling = perSiteScaling;
        return this;
    }

    /**
     * Get the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku.
     * 
     * @return the elasticScaleEnabled value.
     */
    public Boolean elasticScaleEnabled() {
        return this.elasticScaleEnabled;
    }

    /**
     * Set the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku.
     * 
     * @param elasticScaleEnabled the elasticScaleEnabled value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withElasticScaleEnabled(Boolean elasticScaleEnabled) {
        this.elasticScaleEnabled = elasticScaleEnabled;
        return this;
    }

    /**
     * Get the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled
     * App Service Plan.
     * 
     * @return the maximumElasticWorkerCount value.
     */
    public Integer maximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount;
    }

    /**
     * Set the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled
     * App Service Plan.
     * 
     * @param maximumElasticWorkerCount the maximumElasticWorkerCount value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
        this.maximumElasticWorkerCount = maximumElasticWorkerCount;
        return this;
    }

    /**
     * Get the numberOfSites property: Number of apps assigned to this App Service plan.
     * 
     * @return the numberOfSites value.
     */
    public Integer numberOfSites() {
        return this.numberOfSites;
    }

    /**
     * Get the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     * 
     * @param isSpot the isSpot value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server
     * farm.
     * 
     * @return the spotExpirationTime value.
     */
    public OffsetDateTime spotExpirationTime() {
        return this.spotExpirationTime;
    }

    /**
     * Set the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server
     * farm.
     * 
     * @param spotExpirationTime the spotExpirationTime value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withSpotExpirationTime(OffsetDateTime spotExpirationTime) {
        this.spotExpirationTime = spotExpirationTime;
        return this;
    }

    /**
     * Get the freeOfferExpirationTime property: The time when the server farm free offer expires.
     * 
     * @return the freeOfferExpirationTime value.
     */
    public OffsetDateTime freeOfferExpirationTime() {
        return this.freeOfferExpirationTime;
    }

    /**
     * Set the freeOfferExpirationTime property: The time when the server farm free offer expires.
     * 
     * @param freeOfferExpirationTime the freeOfferExpirationTime value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime) {
        this.freeOfferExpirationTime = freeOfferExpirationTime;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group of the App Service plan.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param reserved the reserved value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param isXenon the isXenon value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.hyperV;
    }

    /**
     * Set the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     * 
     * @param hyperV the hyperV value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withHyperV(Boolean hyperV) {
        this.hyperV = hyperV;
        return this;
    }

    /**
     * Get the targetWorkerCount property: Scaling worker count.
     * 
     * @return the targetWorkerCount value.
     */
    public Integer targetWorkerCount() {
        return this.targetWorkerCount;
    }

    /**
     * Set the targetWorkerCount property: Scaling worker count.
     * 
     * @param targetWorkerCount the targetWorkerCount value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withTargetWorkerCount(Integer targetWorkerCount) {
        this.targetWorkerCount = targetWorkerCount;
        return this;
    }

    /**
     * Get the targetWorkerSizeId property: Scaling worker size ID.
     * 
     * @return the targetWorkerSizeId value.
     */
    public Integer targetWorkerSizeId() {
        return this.targetWorkerSizeId;
    }

    /**
     * Set the targetWorkerSizeId property: Scaling worker size ID.
     * 
     * @param targetWorkerSizeId the targetWorkerSizeId value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        this.targetWorkerSizeId = targetWorkerSizeId;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App Service Plan.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service
     * plan.
     * 
     * @return the kubeEnvironmentProfile value.
     */
    public KubeEnvironmentProfile kubeEnvironmentProfile() {
        return this.kubeEnvironmentProfile;
    }

    /**
     * Set the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service
     * plan.
     * 
     * @param kubeEnvironmentProfile the kubeEnvironmentProfile value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile) {
        this.kubeEnvironmentProfile = kubeEnvironmentProfile;
        return this;
    }

    /**
     * Get the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
     * zone balancing.
     * If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone balancing.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
     * zone balancing.
     * If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone balancing.
     * 
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
        if (kubeEnvironmentProfile() != null) {
            kubeEnvironmentProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("workerTierName", this.workerTierName);
        jsonWriter.writeJsonField("hostingEnvironmentProfile", this.hostingEnvironmentProfile);
        jsonWriter.writeBooleanField("perSiteScaling", this.perSiteScaling);
        jsonWriter.writeBooleanField("elasticScaleEnabled", this.elasticScaleEnabled);
        jsonWriter.writeNumberField("maximumElasticWorkerCount", this.maximumElasticWorkerCount);
        jsonWriter.writeBooleanField("isSpot", this.isSpot);
        jsonWriter.writeStringField("spotExpirationTime",
            this.spotExpirationTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.spotExpirationTime));
        jsonWriter.writeStringField("freeOfferExpirationTime",
            this.freeOfferExpirationTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.freeOfferExpirationTime));
        jsonWriter.writeBooleanField("reserved", this.reserved);
        jsonWriter.writeBooleanField("isXenon", this.isXenon);
        jsonWriter.writeBooleanField("hyperV", this.hyperV);
        jsonWriter.writeNumberField("targetWorkerCount", this.targetWorkerCount);
        jsonWriter.writeNumberField("targetWorkerSizeId", this.targetWorkerSizeId);
        jsonWriter.writeJsonField("kubeEnvironmentProfile", this.kubeEnvironmentProfile);
        jsonWriter.writeBooleanField("zoneRedundant", this.zoneRedundant);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppServicePlanProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppServicePlanProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AppServicePlanProperties.
     */
    public static AppServicePlanProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppServicePlanProperties deserializedAppServicePlanProperties = new AppServicePlanProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("workerTierName".equals(fieldName)) {
                    deserializedAppServicePlanProperties.workerTierName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedAppServicePlanProperties.status = StatusOptions.fromString(reader.getString());
                } else if ("subscription".equals(fieldName)) {
                    deserializedAppServicePlanProperties.subscription = reader.getString();
                } else if ("hostingEnvironmentProfile".equals(fieldName)) {
                    deserializedAppServicePlanProperties.hostingEnvironmentProfile
                        = HostingEnvironmentProfile.fromJson(reader);
                } else if ("maximumNumberOfWorkers".equals(fieldName)) {
                    deserializedAppServicePlanProperties.maximumNumberOfWorkers
                        = reader.getNullable(JsonReader::getInt);
                } else if ("numberOfWorkers".equals(fieldName)) {
                    deserializedAppServicePlanProperties.numberOfWorkers = reader.getNullable(JsonReader::getInt);
                } else if ("geoRegion".equals(fieldName)) {
                    deserializedAppServicePlanProperties.geoRegion = reader.getString();
                } else if ("perSiteScaling".equals(fieldName)) {
                    deserializedAppServicePlanProperties.perSiteScaling = reader.getNullable(JsonReader::getBoolean);
                } else if ("elasticScaleEnabled".equals(fieldName)) {
                    deserializedAppServicePlanProperties.elasticScaleEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("maximumElasticWorkerCount".equals(fieldName)) {
                    deserializedAppServicePlanProperties.maximumElasticWorkerCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("numberOfSites".equals(fieldName)) {
                    deserializedAppServicePlanProperties.numberOfSites = reader.getNullable(JsonReader::getInt);
                } else if ("isSpot".equals(fieldName)) {
                    deserializedAppServicePlanProperties.isSpot = reader.getNullable(JsonReader::getBoolean);
                } else if ("spotExpirationTime".equals(fieldName)) {
                    deserializedAppServicePlanProperties.spotExpirationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("freeOfferExpirationTime".equals(fieldName)) {
                    deserializedAppServicePlanProperties.freeOfferExpirationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedAppServicePlanProperties.resourceGroup = reader.getString();
                } else if ("reserved".equals(fieldName)) {
                    deserializedAppServicePlanProperties.reserved = reader.getNullable(JsonReader::getBoolean);
                } else if ("isXenon".equals(fieldName)) {
                    deserializedAppServicePlanProperties.isXenon = reader.getNullable(JsonReader::getBoolean);
                } else if ("hyperV".equals(fieldName)) {
                    deserializedAppServicePlanProperties.hyperV = reader.getNullable(JsonReader::getBoolean);
                } else if ("targetWorkerCount".equals(fieldName)) {
                    deserializedAppServicePlanProperties.targetWorkerCount = reader.getNullable(JsonReader::getInt);
                } else if ("targetWorkerSizeId".equals(fieldName)) {
                    deserializedAppServicePlanProperties.targetWorkerSizeId = reader.getNullable(JsonReader::getInt);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAppServicePlanProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("kubeEnvironmentProfile".equals(fieldName)) {
                    deserializedAppServicePlanProperties.kubeEnvironmentProfile
                        = KubeEnvironmentProfile.fromJson(reader);
                } else if ("zoneRedundant".equals(fieldName)) {
                    deserializedAppServicePlanProperties.zoneRedundant = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppServicePlanProperties;
        });
    }
}
