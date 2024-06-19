// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * SCM type.
 */
public final class ScmType extends ExpandableStringEnum<ScmType> {
    /**
     * Static value None for ScmType.
     */
    public static final ScmType NONE = fromString("None");

    /**
     * Static value Dropbox for ScmType.
     */
    public static final ScmType DROPBOX = fromString("Dropbox");

    /**
     * Static value Tfs for ScmType.
     */
    public static final ScmType TFS = fromString("Tfs");

    /**
     * Static value LocalGit for ScmType.
     */
    public static final ScmType LOCAL_GIT = fromString("LocalGit");

    /**
     * Static value GitHub for ScmType.
     */
    public static final ScmType GIT_HUB = fromString("GitHub");

    /**
     * Static value CodePlexGit for ScmType.
     */
    public static final ScmType CODE_PLEX_GIT = fromString("CodePlexGit");

    /**
     * Static value CodePlexHg for ScmType.
     */
    public static final ScmType CODE_PLEX_HG = fromString("CodePlexHg");

    /**
     * Static value BitbucketGit for ScmType.
     */
    public static final ScmType BITBUCKET_GIT = fromString("BitbucketGit");

    /**
     * Static value BitbucketHg for ScmType.
     */
    public static final ScmType BITBUCKET_HG = fromString("BitbucketHg");

    /**
     * Static value ExternalGit for ScmType.
     */
    public static final ScmType EXTERNAL_GIT = fromString("ExternalGit");

    /**
     * Static value ExternalHg for ScmType.
     */
    public static final ScmType EXTERNAL_HG = fromString("ExternalHg");

    /**
     * Static value OneDrive for ScmType.
     */
    public static final ScmType ONE_DRIVE = fromString("OneDrive");

    /**
     * Static value VSO for ScmType.
     */
    public static final ScmType VSO = fromString("VSO");

    /**
     * Static value VSTSRM for ScmType.
     */
    public static final ScmType VSTSRM = fromString("VSTSRM");

    /**
     * Creates a new instance of ScmType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScmType() {
    }

    /**
     * Creates or finds a ScmType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScmType.
     */
    public static ScmType fromString(String name) {
        return fromString(name, ScmType.class);
    }

    /**
     * Gets known ScmType values.
     * 
     * @return known ScmType values.
     */
    public static Collection<ScmType> values() {
        return values(ScmType.class);
    }
}
