// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The permissions to set on the SAS URL. */
public final class AssetContainerPermission extends ExpandableStringEnum<AssetContainerPermission> {
    /** Static value Read for AssetContainerPermission. */
    public static final AssetContainerPermission READ = fromString("Read");

    /** Static value ReadWrite for AssetContainerPermission. */
    public static final AssetContainerPermission READ_WRITE = fromString("ReadWrite");

    /** Static value ReadWriteDelete for AssetContainerPermission. */
    public static final AssetContainerPermission READ_WRITE_DELETE = fromString("ReadWriteDelete");

    /**
     * Creates or finds a AssetContainerPermission from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssetContainerPermission.
     */
    @JsonCreator
    public static AssetContainerPermission fromString(String name) {
        return fromString(name, AssetContainerPermission.class);
    }

    /**
     * Gets known AssetContainerPermission values.
     *
     * @return known AssetContainerPermission values.
     */
    public static Collection<AssetContainerPermission> values() {
        return values(AssetContainerPermission.class);
    }
}
