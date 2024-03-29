// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkWatcherInner;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersList;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersListParameters;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReport;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportParameters;
import com.azure.resourcemanager.network.generated.models.ConnectivityInformation;
import com.azure.resourcemanager.network.generated.models.ConnectivityParameters;
import com.azure.resourcemanager.network.generated.models.FlowLogInformation;
import com.azure.resourcemanager.network.generated.models.FlowLogStatusParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticResponse;
import com.azure.resourcemanager.network.generated.models.NetworkWatcher;
import com.azure.resourcemanager.network.generated.models.NextHopParameters;
import com.azure.resourcemanager.network.generated.models.NextHopResult;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.QueryTroubleshootingParameters;
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewParameters;
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewResult;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.Topology;
import com.azure.resourcemanager.network.generated.models.TopologyParameters;
import com.azure.resourcemanager.network.generated.models.TroubleshootingParameters;
import com.azure.resourcemanager.network.generated.models.TroubleshootingResult;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowParameters;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowResult;
import java.util.Collections;
import java.util.Map;

public final class NetworkWatcherImpl implements NetworkWatcher, NetworkWatcher.Definition, NetworkWatcher.Update {
    private NetworkWatcherInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

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

    public String id() {
        return this.innerModel().id();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public NetworkWatcherInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkWatcherName;

    private TagsObject updateParameters;

    public NetworkWatcherImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkWatcher create() {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .createOrUpdateWithResponse(resourceGroupName, networkWatcherName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public NetworkWatcher create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .createOrUpdateWithResponse(resourceGroupName, networkWatcherName, this.innerModel(), context)
            .getValue();
        return this;
    }

    NetworkWatcherImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkWatcherInner();
        this.serviceManager = serviceManager;
        this.networkWatcherName = name;
    }

    public NetworkWatcherImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkWatcher apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .updateTagsWithResponse(resourceGroupName, networkWatcherName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkWatcher apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .updateTagsWithResponse(resourceGroupName, networkWatcherName, updateParameters, context)
            .getValue();
        return this;
    }

    NetworkWatcherImpl(NetworkWatcherInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkWatcherName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "networkWatchers");
    }

    public NetworkWatcher refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkWatcher refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkWatchers()
            .getByResourceGroupWithResponse(resourceGroupName, networkWatcherName, context)
            .getValue();
        return this;
    }

    public Response<Topology> getTopologyWithResponse(TopologyParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getTopologyWithResponse(resourceGroupName, networkWatcherName, parameters, context);
    }

    public Topology getTopology(TopologyParameters parameters) {
        return serviceManager.networkWatchers().getTopology(resourceGroupName, networkWatcherName, parameters);
    }

    public VerificationIpFlowResult verifyIpFlow(VerificationIpFlowParameters parameters) {
        return serviceManager.networkWatchers().verifyIpFlow(resourceGroupName, networkWatcherName, parameters);
    }

    public VerificationIpFlowResult verifyIpFlow(VerificationIpFlowParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .verifyIpFlow(resourceGroupName, networkWatcherName, parameters, context);
    }

    public NextHopResult getNextHop(NextHopParameters parameters) {
        return serviceManager.networkWatchers().getNextHop(resourceGroupName, networkWatcherName, parameters);
    }

    public NextHopResult getNextHop(NextHopParameters parameters, Context context) {
        return serviceManager.networkWatchers().getNextHop(resourceGroupName, networkWatcherName, parameters, context);
    }

    public SecurityGroupViewResult getVMSecurityRules(SecurityGroupViewParameters parameters) {
        return serviceManager.networkWatchers().getVMSecurityRules(resourceGroupName, networkWatcherName, parameters);
    }

    public SecurityGroupViewResult getVMSecurityRules(SecurityGroupViewParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getVMSecurityRules(resourceGroupName, networkWatcherName, parameters, context);
    }

    public TroubleshootingResult getTroubleshooting(TroubleshootingParameters parameters) {
        return serviceManager.networkWatchers().getTroubleshooting(resourceGroupName, networkWatcherName, parameters);
    }

    public TroubleshootingResult getTroubleshooting(TroubleshootingParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getTroubleshooting(resourceGroupName, networkWatcherName, parameters, context);
    }

    public TroubleshootingResult getTroubleshootingResult(QueryTroubleshootingParameters parameters) {
        return serviceManager.networkWatchers()
            .getTroubleshootingResult(resourceGroupName, networkWatcherName, parameters);
    }

    public TroubleshootingResult getTroubleshootingResult(QueryTroubleshootingParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getTroubleshootingResult(resourceGroupName, networkWatcherName, parameters, context);
    }

    public FlowLogInformation setFlowLogConfiguration(FlowLogInformationInner parameters) {
        return serviceManager.networkWatchers()
            .setFlowLogConfiguration(resourceGroupName, networkWatcherName, parameters);
    }

    public FlowLogInformation setFlowLogConfiguration(FlowLogInformationInner parameters, Context context) {
        return serviceManager.networkWatchers()
            .setFlowLogConfiguration(resourceGroupName, networkWatcherName, parameters, context);
    }

    public FlowLogInformation getFlowLogStatus(FlowLogStatusParameters parameters) {
        return serviceManager.networkWatchers().getFlowLogStatus(resourceGroupName, networkWatcherName, parameters);
    }

    public FlowLogInformation getFlowLogStatus(FlowLogStatusParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getFlowLogStatus(resourceGroupName, networkWatcherName, parameters, context);
    }

    public ConnectivityInformation checkConnectivity(ConnectivityParameters parameters) {
        return serviceManager.networkWatchers().checkConnectivity(resourceGroupName, networkWatcherName, parameters);
    }

    public ConnectivityInformation checkConnectivity(ConnectivityParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .checkConnectivity(resourceGroupName, networkWatcherName, parameters, context);
    }

    public AzureReachabilityReport getAzureReachabilityReport(AzureReachabilityReportParameters parameters) {
        return serviceManager.networkWatchers()
            .getAzureReachabilityReport(resourceGroupName, networkWatcherName, parameters);
    }

    public AzureReachabilityReport getAzureReachabilityReport(AzureReachabilityReportParameters parameters,
        Context context) {
        return serviceManager.networkWatchers()
            .getAzureReachabilityReport(resourceGroupName, networkWatcherName, parameters, context);
    }

    public AvailableProvidersList listAvailableProviders(AvailableProvidersListParameters parameters) {
        return serviceManager.networkWatchers()
            .listAvailableProviders(resourceGroupName, networkWatcherName, parameters);
    }

    public AvailableProvidersList listAvailableProviders(AvailableProvidersListParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .listAvailableProviders(resourceGroupName, networkWatcherName, parameters, context);
    }

    public NetworkConfigurationDiagnosticResponse
        getNetworkConfigurationDiagnostic(NetworkConfigurationDiagnosticParameters parameters) {
        return serviceManager.networkWatchers()
            .getNetworkConfigurationDiagnostic(resourceGroupName, networkWatcherName, parameters);
    }

    public NetworkConfigurationDiagnosticResponse
        getNetworkConfigurationDiagnostic(NetworkConfigurationDiagnosticParameters parameters, Context context) {
        return serviceManager.networkWatchers()
            .getNetworkConfigurationDiagnostic(resourceGroupName, networkWatcherName, parameters, context);
    }

    public NetworkWatcherImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkWatcherImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkWatcherImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
