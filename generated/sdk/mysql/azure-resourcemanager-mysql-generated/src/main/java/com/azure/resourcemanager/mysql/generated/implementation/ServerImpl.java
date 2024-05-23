// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.HighAvailabilityValidationEstimationInner;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerInner;
import com.azure.resourcemanager.mysql.generated.models.Backup;
import com.azure.resourcemanager.mysql.generated.models.CreateMode;
import com.azure.resourcemanager.mysql.generated.models.DataEncryption;
import com.azure.resourcemanager.mysql.generated.models.HighAvailability;
import com.azure.resourcemanager.mysql.generated.models.HighAvailabilityValidationEstimation;
import com.azure.resourcemanager.mysql.generated.models.ImportSourceProperties;
import com.azure.resourcemanager.mysql.generated.models.MaintenanceWindow;
import com.azure.resourcemanager.mysql.generated.models.MySqlServerIdentity;
import com.azure.resourcemanager.mysql.generated.models.MySqlServerSku;
import com.azure.resourcemanager.mysql.generated.models.Network;
import com.azure.resourcemanager.mysql.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.mysql.generated.models.ReplicationRole;
import com.azure.resourcemanager.mysql.generated.models.Server;
import com.azure.resourcemanager.mysql.generated.models.ServerDetachVNetParameter;
import com.azure.resourcemanager.mysql.generated.models.ServerForUpdate;
import com.azure.resourcemanager.mysql.generated.models.ServerGtidSetParameter;
import com.azure.resourcemanager.mysql.generated.models.ServerRestartParameter;
import com.azure.resourcemanager.mysql.generated.models.ServerState;
import com.azure.resourcemanager.mysql.generated.models.ServerVersion;
import com.azure.resourcemanager.mysql.generated.models.Storage;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ServerImpl implements Server, Server.Definition, Server.Update {
    private ServerInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

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

    public MySqlServerIdentity identity() {
        return this.innerModel().identity();
    }

    public MySqlServerSku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String administratorLogin() {
        return this.innerModel().administratorLogin();
    }

    public String administratorLoginPassword() {
        return this.innerModel().administratorLoginPassword();
    }

    public ServerVersion version() {
        return this.innerModel().version();
    }

    public String availabilityZone() {
        return this.innerModel().availabilityZone();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public String sourceServerResourceId() {
        return this.innerModel().sourceServerResourceId();
    }

    public OffsetDateTime restorePointInTime() {
        return this.innerModel().restorePointInTime();
    }

    public ReplicationRole replicationRole() {
        return this.innerModel().replicationRole();
    }

    public Integer replicaCapacity() {
        return this.innerModel().replicaCapacity();
    }

    public DataEncryption dataEncryption() {
        return this.innerModel().dataEncryption();
    }

    public ServerState state() {
        return this.innerModel().state();
    }

    public String fullyQualifiedDomainName() {
        return this.innerModel().fullyQualifiedDomainName();
    }

    public Storage storage() {
        return this.innerModel().storage();
    }

    public Backup backup() {
        return this.innerModel().backup();
    }

    public HighAvailability highAvailability() {
        return this.innerModel().highAvailability();
    }

    public Network network() {
        return this.innerModel().network();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MaintenanceWindow maintenanceWindow() {
        return this.innerModel().maintenanceWindow();
    }

    public ImportSourceProperties importSourceProperties() {
        return this.innerModel().importSourceProperties();
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

    public ServerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private ServerForUpdate updateParameters;

    public ServerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Server create() {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .create(resourceGroupName, serverName, this.innerModel(), Context.NONE);
        return this;
    }

    public Server create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .create(resourceGroupName, serverName, this.innerModel(), context);
        return this;
    }

    ServerImpl(String name, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = new ServerInner();
        this.serviceManager = serviceManager;
        this.serverName = name;
    }

    public ServerImpl update() {
        this.updateParameters = new ServerForUpdate();
        return this;
    }

    public Server apply() {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .update(resourceGroupName, serverName, updateParameters, Context.NONE);
        return this;
    }

    public Server apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .update(resourceGroupName, serverName, updateParameters, context);
        return this;
    }

    ServerImpl(ServerInner innerObject, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "flexibleServers");
    }

    public Server refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .getByResourceGroupWithResponse(resourceGroupName, serverName, Context.NONE)
            .getValue();
        return this;
    }

    public Server refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServers()
            .getByResourceGroupWithResponse(resourceGroupName, serverName, context)
            .getValue();
        return this;
    }

    public void failover() {
        serviceManager.servers().failover(resourceGroupName, serverName);
    }

    public void failover(Context context) {
        serviceManager.servers().failover(resourceGroupName, serverName, context);
    }

    public Response<HighAvailabilityValidationEstimation> validateEstimateHighAvailabilityWithResponse(
        HighAvailabilityValidationEstimationInner parameters, Context context) {
        return serviceManager.servers()
            .validateEstimateHighAvailabilityWithResponse(resourceGroupName, serverName, parameters, context);
    }

    public HighAvailabilityValidationEstimation
        validateEstimateHighAvailability(HighAvailabilityValidationEstimationInner parameters) {
        return serviceManager.servers().validateEstimateHighAvailability(resourceGroupName, serverName, parameters);
    }

    public void restart(ServerRestartParameter parameters) {
        serviceManager.servers().restart(resourceGroupName, serverName, parameters);
    }

    public void restart(ServerRestartParameter parameters, Context context) {
        serviceManager.servers().restart(resourceGroupName, serverName, parameters, context);
    }

    public void start() {
        serviceManager.servers().start(resourceGroupName, serverName);
    }

    public void start(Context context) {
        serviceManager.servers().start(resourceGroupName, serverName, context);
    }

    public void stop() {
        serviceManager.servers().stop(resourceGroupName, serverName);
    }

    public void stop(Context context) {
        serviceManager.servers().stop(resourceGroupName, serverName, context);
    }

    public void resetGtid(ServerGtidSetParameter parameters) {
        serviceManager.servers().resetGtid(resourceGroupName, serverName, parameters);
    }

    public void resetGtid(ServerGtidSetParameter parameters, Context context) {
        serviceManager.servers().resetGtid(resourceGroupName, serverName, parameters, context);
    }

    public Server detachVNet(ServerDetachVNetParameter parameters) {
        return serviceManager.servers().detachVNet(resourceGroupName, serverName, parameters);
    }

    public Server detachVNet(ServerDetachVNetParameter parameters, Context context) {
        return serviceManager.servers().detachVNet(resourceGroupName, serverName, parameters, context);
    }

    public ServerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ServerImpl withIdentity(MySqlServerIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ServerImpl withSku(MySqlServerSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ServerImpl withAdministratorLogin(String administratorLogin) {
        this.innerModel().withAdministratorLogin(administratorLogin);
        return this;
    }

    public ServerImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        if (isInCreateMode()) {
            this.innerModel().withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        } else {
            this.updateParameters.withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        }
    }

    public ServerImpl withVersion(ServerVersion version) {
        if (isInCreateMode()) {
            this.innerModel().withVersion(version);
            return this;
        } else {
            this.updateParameters.withVersion(version);
            return this;
        }
    }

    public ServerImpl withAvailabilityZone(String availabilityZone) {
        this.innerModel().withAvailabilityZone(availabilityZone);
        return this;
    }

    public ServerImpl withCreateMode(CreateMode createMode) {
        this.innerModel().withCreateMode(createMode);
        return this;
    }

    public ServerImpl withSourceServerResourceId(String sourceServerResourceId) {
        this.innerModel().withSourceServerResourceId(sourceServerResourceId);
        return this;
    }

    public ServerImpl withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.innerModel().withRestorePointInTime(restorePointInTime);
        return this;
    }

    public ServerImpl withReplicationRole(ReplicationRole replicationRole) {
        if (isInCreateMode()) {
            this.innerModel().withReplicationRole(replicationRole);
            return this;
        } else {
            this.updateParameters.withReplicationRole(replicationRole);
            return this;
        }
    }

    public ServerImpl withDataEncryption(DataEncryption dataEncryption) {
        if (isInCreateMode()) {
            this.innerModel().withDataEncryption(dataEncryption);
            return this;
        } else {
            this.updateParameters.withDataEncryption(dataEncryption);
            return this;
        }
    }

    public ServerImpl withStorage(Storage storage) {
        if (isInCreateMode()) {
            this.innerModel().withStorage(storage);
            return this;
        } else {
            this.updateParameters.withStorage(storage);
            return this;
        }
    }

    public ServerImpl withBackup(Backup backup) {
        if (isInCreateMode()) {
            this.innerModel().withBackup(backup);
            return this;
        } else {
            this.updateParameters.withBackup(backup);
            return this;
        }
    }

    public ServerImpl withHighAvailability(HighAvailability highAvailability) {
        if (isInCreateMode()) {
            this.innerModel().withHighAvailability(highAvailability);
            return this;
        } else {
            this.updateParameters.withHighAvailability(highAvailability);
            return this;
        }
    }

    public ServerImpl withNetwork(Network network) {
        if (isInCreateMode()) {
            this.innerModel().withNetwork(network);
            return this;
        } else {
            this.updateParameters.withNetwork(network);
            return this;
        }
    }

    public ServerImpl withImportSourceProperties(ImportSourceProperties importSourceProperties) {
        this.innerModel().withImportSourceProperties(importSourceProperties);
        return this;
    }

    public ServerImpl withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.updateParameters.withMaintenanceWindow(maintenanceWindow);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
