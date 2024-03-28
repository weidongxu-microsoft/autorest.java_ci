// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Profile for gallery sharing to subscription or tenant.
 */
@Fluent
public final class SharingProfile {
    /*
     * This property allows you to specify the permission of sharing gallery. Possible values are: **Private,** **Groups,** **Community.**
     */
    @JsonProperty(value = "permissions")
    private GallerySharingPermissionTypes permissions;

    /*
     * A list of sharing profile groups.
     */
    @JsonProperty(value = "groups", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharingProfileGroup> groups;

    /*
     * Information of community gallery if current gallery is shared to community.
     */
    @JsonProperty(value = "communityGalleryInfo")
    private CommunityGalleryInfo communityGalleryInfo;

    /**
     * Creates an instance of SharingProfile class.
     */
    public SharingProfile() {
    }

    /**
     * Get the permissions property: This property allows you to specify the permission of sharing gallery. Possible
     * values are: **Private,** **Groups,** **Community.**.
     * 
     * @return the permissions value.
     */
    public GallerySharingPermissionTypes permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: This property allows you to specify the permission of sharing gallery. Possible
     * values are: **Private,** **Groups,** **Community.**.
     * 
     * @param permissions the permissions value to set.
     * @return the SharingProfile object itself.
     */
    public SharingProfile withPermissions(GallerySharingPermissionTypes permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the groups property: A list of sharing profile groups.
     * 
     * @return the groups value.
     */
    public List<SharingProfileGroup> groups() {
        return this.groups;
    }

    /**
     * Get the communityGalleryInfo property: Information of community gallery if current gallery is shared to
     * community.
     * 
     * @return the communityGalleryInfo value.
     */
    public CommunityGalleryInfo communityGalleryInfo() {
        return this.communityGalleryInfo;
    }

    /**
     * Set the communityGalleryInfo property: Information of community gallery if current gallery is shared to
     * community.
     * 
     * @param communityGalleryInfo the communityGalleryInfo value to set.
     * @return the SharingProfile object itself.
     */
    public SharingProfile withCommunityGalleryInfo(CommunityGalleryInfo communityGalleryInfo) {
        this.communityGalleryInfo = communityGalleryInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (communityGalleryInfo() != null) {
            communityGalleryInfo().validate();
        }
    }
}
