// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.AzureContainerInfo;
import com.azure.resourcemanager.databoxedge.generated.models.ClientAccessRight;
import com.azure.resourcemanager.databoxedge.generated.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.generated.models.MonitoringStatus;
import com.azure.resourcemanager.databoxedge.generated.models.MountPointMap;
import com.azure.resourcemanager.databoxedge.generated.models.RefreshDetails;
import com.azure.resourcemanager.databoxedge.generated.models.ShareAccessProtocol;
import com.azure.resourcemanager.databoxedge.generated.models.ShareStatus;
import com.azure.resourcemanager.databoxedge.generated.models.UserAccessRight;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a share on the Data Box Edge/Gateway device. */
@Fluent
public final class ShareInner extends ArmBaseModel {
    /*
     * The share properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ShareProperties innerProperties = new ShareProperties();

    /*
     * Metadata pertaining to creation and last modification of Share
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ShareInner class. */
    public ShareInner() {
    }

    /**
     * Get the innerProperties property: The share properties.
     *
     * @return the innerProperties value.
     */
    private ShareProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Share.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description for the share.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description for the share.
     *
     * @param description the description value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the shareStatus property: Current status of the share.
     *
     * @return the shareStatus value.
     */
    public ShareStatus shareStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().shareStatus();
    }

    /**
     * Set the shareStatus property: Current status of the share.
     *
     * @param shareStatus the shareStatus value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withShareStatus(ShareStatus shareStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withShareStatus(shareStatus);
        return this;
    }

    /**
     * Get the monitoringStatus property: Current monitoring status of the share.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().monitoringStatus();
    }

    /**
     * Set the monitoringStatus property: Current monitoring status of the share.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withMonitoringStatus(MonitoringStatus monitoringStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withMonitoringStatus(monitoringStatus);
        return this;
    }

    /**
     * Get the azureContainerInfo property: Azure container mapping for the share.
     *
     * @return the azureContainerInfo value.
     */
    public AzureContainerInfo azureContainerInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().azureContainerInfo();
    }

    /**
     * Set the azureContainerInfo property: Azure container mapping for the share.
     *
     * @param azureContainerInfo the azureContainerInfo value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withAzureContainerInfo(AzureContainerInfo azureContainerInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withAzureContainerInfo(azureContainerInfo);
        return this;
    }

    /**
     * Get the accessProtocol property: Access protocol to be used by the share.
     *
     * @return the accessProtocol value.
     */
    public ShareAccessProtocol accessProtocol() {
        return this.innerProperties() == null ? null : this.innerProperties().accessProtocol();
    }

    /**
     * Set the accessProtocol property: Access protocol to be used by the share.
     *
     * @param accessProtocol the accessProtocol value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withAccessProtocol(ShareAccessProtocol accessProtocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withAccessProtocol(accessProtocol);
        return this;
    }

    /**
     * Get the userAccessRights property: Mapping of users and corresponding access rights on the share (required for
     * SMB protocol).
     *
     * @return the userAccessRights value.
     */
    public List<UserAccessRight> userAccessRights() {
        return this.innerProperties() == null ? null : this.innerProperties().userAccessRights();
    }

    /**
     * Set the userAccessRights property: Mapping of users and corresponding access rights on the share (required for
     * SMB protocol).
     *
     * @param userAccessRights the userAccessRights value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withUserAccessRights(List<UserAccessRight> userAccessRights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withUserAccessRights(userAccessRights);
        return this;
    }

    /**
     * Get the clientAccessRights property: List of IP addresses and corresponding access rights on the share(required
     * for NFS protocol).
     *
     * @return the clientAccessRights value.
     */
    public List<ClientAccessRight> clientAccessRights() {
        return this.innerProperties() == null ? null : this.innerProperties().clientAccessRights();
    }

    /**
     * Set the clientAccessRights property: List of IP addresses and corresponding access rights on the share(required
     * for NFS protocol).
     *
     * @param clientAccessRights the clientAccessRights value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withClientAccessRights(List<ClientAccessRight> clientAccessRights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withClientAccessRights(clientAccessRights);
        return this;
    }

    /**
     * Get the refreshDetails property: Details of the refresh job on this share.
     *
     * @return the refreshDetails value.
     */
    public RefreshDetails refreshDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshDetails();
    }

    /**
     * Set the refreshDetails property: Details of the refresh job on this share.
     *
     * @param refreshDetails the refreshDetails value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withRefreshDetails(RefreshDetails refreshDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withRefreshDetails(refreshDetails);
        return this;
    }

    /**
     * Get the shareMappings property: Share mount point to the role.
     *
     * @return the shareMappings value.
     */
    public List<MountPointMap> shareMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().shareMappings();
    }

    /**
     * Get the dataPolicy property: Data policy of the share.
     *
     * @return the dataPolicy value.
     */
    public DataPolicy dataPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().dataPolicy();
    }

    /**
     * Set the dataPolicy property: Data policy of the share.
     *
     * @param dataPolicy the dataPolicy value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withDataPolicy(DataPolicy dataPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ShareProperties();
        }
        this.innerProperties().withDataPolicy(dataPolicy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model ShareInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ShareInner.class);
}
