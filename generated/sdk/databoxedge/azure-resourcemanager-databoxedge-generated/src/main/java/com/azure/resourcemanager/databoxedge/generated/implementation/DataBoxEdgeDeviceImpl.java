// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDeviceInner;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceExtendedInfo;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceExtendedInfoPatch;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceKind;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDevicePatch;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.generated.models.DataResidency;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceType;
import com.azure.resourcemanager.databoxedge.generated.models.EdgeProfile;
import com.azure.resourcemanager.databoxedge.generated.models.EdgeProfilePatch;
import com.azure.resourcemanager.databoxedge.generated.models.GenerateCertResponse;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceIdentity;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceMoveDetails;
import com.azure.resourcemanager.databoxedge.generated.models.RoleTypes;
import com.azure.resourcemanager.databoxedge.generated.models.Sku;
import com.azure.resourcemanager.databoxedge.generated.models.UploadCertificateRequest;
import com.azure.resourcemanager.databoxedge.generated.models.UploadCertificateResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DataBoxEdgeDeviceImpl
    implements DataBoxEdgeDevice, DataBoxEdgeDevice.Definition, DataBoxEdgeDevice.Update {
    private DataBoxEdgeDeviceInner innerObject;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public DataBoxEdgeDeviceKind kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SystemData systemDataPropertiesSystemData() {
        return this.innerModel().systemDataPropertiesSystemData();
    }

    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.innerModel().dataBoxEdgeDeviceStatus();
    }

    public String serialNumber() {
        return this.innerModel().serialNumber();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String modelDescription() {
        return this.innerModel().modelDescription();
    }

    public DeviceType deviceType() {
        return this.innerModel().deviceType();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String culture() {
        return this.innerModel().culture();
    }

    public String deviceModel() {
        return this.innerModel().deviceModel();
    }

    public String deviceSoftwareVersion() {
        return this.innerModel().deviceSoftwareVersion();
    }

    public Long deviceLocalCapacity() {
        return this.innerModel().deviceLocalCapacity();
    }

    public String timeZone() {
        return this.innerModel().timeZone();
    }

    public String deviceHcsVersion() {
        return this.innerModel().deviceHcsVersion();
    }

    public List<RoleTypes> configuredRoleTypes() {
        List<RoleTypes> inner = this.innerModel().configuredRoleTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer nodeCount() {
        return this.innerModel().nodeCount();
    }

    public ResourceMoveDetails resourceMoveDetails() {
        return this.innerModel().resourceMoveDetails();
    }

    public EdgeProfile edgeProfile() {
        return this.innerModel().edgeProfile();
    }

    public DataResidency dataResidency() {
        return this.innerModel().dataResidency();
    }

    public String kubernetesWorkloadProfile() {
        return this.innerModel().kubernetesWorkloadProfile();
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

    public DataBoxEdgeDeviceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String resourceGroupName;

    private DataBoxEdgeDevicePatch updateParameters;

    public DataBoxEdgeDeviceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DataBoxEdgeDevice create() {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .createOrUpdateWithResponse(deviceName, resourceGroupName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public DataBoxEdgeDevice create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .createOrUpdateWithResponse(deviceName, resourceGroupName, this.innerModel(), context).getValue();
        return this;
    }

    DataBoxEdgeDeviceImpl(String name,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = new DataBoxEdgeDeviceInner();
        this.serviceManager = serviceManager;
        this.deviceName = name;
    }

    public DataBoxEdgeDeviceImpl update() {
        this.updateParameters = new DataBoxEdgeDevicePatch();
        return this;
    }

    public DataBoxEdgeDevice apply() {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .updateWithResponse(deviceName, resourceGroupName, updateParameters, Context.NONE).getValue();
        return this;
    }

    public DataBoxEdgeDevice apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .updateWithResponse(deviceName, resourceGroupName, updateParameters, context).getValue();
        return this;
    }

    DataBoxEdgeDeviceImpl(DataBoxEdgeDeviceInner innerObject,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public DataBoxEdgeDevice refresh() {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .getByResourceGroupWithResponse(resourceGroupName, deviceName, Context.NONE).getValue();
        return this;
    }

    public DataBoxEdgeDevice refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getDevices()
            .getByResourceGroupWithResponse(resourceGroupName, deviceName, context).getValue();
        return this;
    }

    public void downloadUpdates() {
        serviceManager.devices().downloadUpdates(deviceName, resourceGroupName);
    }

    public void downloadUpdates(Context context) {
        serviceManager.devices().downloadUpdates(deviceName, resourceGroupName, context);
    }

    public Response<GenerateCertResponse> generateCertificateWithResponse(Context context) {
        return serviceManager.devices().generateCertificateWithResponse(deviceName, resourceGroupName, context);
    }

    public GenerateCertResponse generateCertificate() {
        return serviceManager.devices().generateCertificate(deviceName, resourceGroupName);
    }

    public Response<DataBoxEdgeDeviceExtendedInfo> getExtendedInformationWithResponse(Context context) {
        return serviceManager.devices().getExtendedInformationWithResponse(deviceName, resourceGroupName, context);
    }

    public DataBoxEdgeDeviceExtendedInfo getExtendedInformation() {
        return serviceManager.devices().getExtendedInformation(deviceName, resourceGroupName);
    }

    public void installUpdates() {
        serviceManager.devices().installUpdates(deviceName, resourceGroupName);
    }

    public void installUpdates(Context context) {
        serviceManager.devices().installUpdates(deviceName, resourceGroupName, context);
    }

    public void scanForUpdates() {
        serviceManager.devices().scanForUpdates(deviceName, resourceGroupName);
    }

    public void scanForUpdates(Context context) {
        serviceManager.devices().scanForUpdates(deviceName, resourceGroupName, context);
    }

    public Response<DataBoxEdgeDeviceExtendedInfo>
        updateExtendedInformationWithResponse(DataBoxEdgeDeviceExtendedInfoPatch parameters, Context context) {
        return serviceManager.devices().updateExtendedInformationWithResponse(deviceName, resourceGroupName, parameters,
            context);
    }

    public DataBoxEdgeDeviceExtendedInfo updateExtendedInformation(DataBoxEdgeDeviceExtendedInfoPatch parameters) {
        return serviceManager.devices().updateExtendedInformation(deviceName, resourceGroupName, parameters);
    }

    public Response<UploadCertificateResponse> uploadCertificateWithResponse(UploadCertificateRequest parameters,
        Context context) {
        return serviceManager.devices().uploadCertificateWithResponse(deviceName, resourceGroupName, parameters,
            context);
    }

    public UploadCertificateResponse uploadCertificate(UploadCertificateRequest parameters) {
        return serviceManager.devices().uploadCertificate(deviceName, resourceGroupName, parameters);
    }

    public DataBoxEdgeDeviceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DataBoxEdgeDeviceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DataBoxEdgeDeviceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DataBoxEdgeDeviceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public DataBoxEdgeDeviceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public DataBoxEdgeDeviceImpl withIdentity(ResourceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public DataBoxEdgeDeviceImpl withDataResidency(DataResidency dataResidency) {
        this.innerModel().withDataResidency(dataResidency);
        return this;
    }

    public DataBoxEdgeDeviceImpl withEdgeProfile(EdgeProfilePatch edgeProfile) {
        this.updateParameters.withEdgeProfile(edgeProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
