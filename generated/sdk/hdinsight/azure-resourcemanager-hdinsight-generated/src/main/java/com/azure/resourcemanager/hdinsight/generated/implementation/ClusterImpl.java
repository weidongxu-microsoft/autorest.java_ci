// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.hdinsight.generated.models.Cluster;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterCreateParametersExtended;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterCreateProperties;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterDiskEncryptionParameters;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterGetProperties;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterIdentity;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterPatchParameters;
import com.azure.resourcemanager.hdinsight.generated.models.ExecuteScriptActionParameters;
import com.azure.resourcemanager.hdinsight.generated.models.GatewaySettings;
import com.azure.resourcemanager.hdinsight.generated.models.UpdateClusterIdentityCertificateParameters;
import com.azure.resourcemanager.hdinsight.generated.models.UpdateGatewaySettingsParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ClusterGetProperties properties() {
        return this.innerModel().properties();
    }

    public ClusterIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.generated.HDInsightManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private ClusterCreateParametersExtended createParameters;

    private ClusterPatchParameters updateParameters;

    public ClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cluster create() {
        this.innerObject = serviceManager.serviceClient().getClusters().create(resourceGroupName, clusterName,
            createParameters, Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject = serviceManager.serviceClient().getClusters().create(resourceGroupName, clusterName,
            createParameters, context);
        return this;
    }

    ClusterImpl(String name, com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
        this.createParameters = new ClusterCreateParametersExtended();
    }

    public ClusterImpl update() {
        this.updateParameters = new ClusterPatchParameters();
        return this;
    }

    public Cluster apply() {
        this.innerObject = serviceManager.serviceClient().getClusters()
            .updateWithResponse(resourceGroupName, clusterName, updateParameters, Context.NONE).getValue();
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getClusters()
            .updateWithResponse(resourceGroupName, clusterName, updateParameters, context).getValue();
        return this;
    }

    ClusterImpl(ClusterInner innerObject,
        com.azure.resourcemanager.hdinsight.generated.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject = serviceManager.serviceClient().getClusters()
            .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getClusters()
            .getByResourceGroupWithResponse(resourceGroupName, clusterName, context).getValue();
        return this;
    }

    public void rotateDiskEncryptionKey(ClusterDiskEncryptionParameters parameters) {
        serviceManager.clusters().rotateDiskEncryptionKey(resourceGroupName, clusterName, parameters);
    }

    public void rotateDiskEncryptionKey(ClusterDiskEncryptionParameters parameters, Context context) {
        serviceManager.clusters().rotateDiskEncryptionKey(resourceGroupName, clusterName, parameters, context);
    }

    public Response<GatewaySettings> getGatewaySettingsWithResponse(Context context) {
        return serviceManager.clusters().getGatewaySettingsWithResponse(resourceGroupName, clusterName, context);
    }

    public GatewaySettings getGatewaySettings() {
        return serviceManager.clusters().getGatewaySettings(resourceGroupName, clusterName);
    }

    public void updateGatewaySettings(UpdateGatewaySettingsParameters parameters) {
        serviceManager.clusters().updateGatewaySettings(resourceGroupName, clusterName, parameters);
    }

    public void updateGatewaySettings(UpdateGatewaySettingsParameters parameters, Context context) {
        serviceManager.clusters().updateGatewaySettings(resourceGroupName, clusterName, parameters, context);
    }

    public void updateIdentityCertificate(UpdateClusterIdentityCertificateParameters parameters) {
        serviceManager.clusters().updateIdentityCertificate(resourceGroupName, clusterName, parameters);
    }

    public void updateIdentityCertificate(UpdateClusterIdentityCertificateParameters parameters, Context context) {
        serviceManager.clusters().updateIdentityCertificate(resourceGroupName, clusterName, parameters, context);
    }

    public void executeScriptActions(ExecuteScriptActionParameters parameters) {
        serviceManager.clusters().executeScriptActions(resourceGroupName, clusterName, parameters);
    }

    public void executeScriptActions(ExecuteScriptActionParameters parameters, Context context) {
        serviceManager.clusters().executeScriptActions(resourceGroupName, clusterName, parameters, context);
    }

    public ClusterImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ClusterImpl withZones(List<String> zones) {
        this.createParameters.withZones(zones);
        return this;
    }

    public ClusterImpl withProperties(ClusterCreateProperties properties) {
        this.createParameters.withProperties(properties);
        return this;
    }

    public ClusterImpl withIdentity(ClusterIdentity identity) {
        this.createParameters.withIdentity(identity);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
