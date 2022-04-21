// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobType. */
public final class JobType extends ExpandableStringEnum<JobType> {
    /** Static value unknown for JobType. */
    public static final JobType UNKNOWN = fromString("unknown");

    /** Static value export for JobType. */
    public static final JobType EXPORT = fromString("export");

    /** Static value import for JobType. */
    public static final JobType IMPORT = fromString("import");

    /** Static value backup for JobType. */
    public static final JobType BACKUP = fromString("backup");

    /** Static value readDeviceProperties for JobType. */
    public static final JobType READ_DEVICE_PROPERTIES = fromString("readDeviceProperties");

    /** Static value writeDeviceProperties for JobType. */
    public static final JobType WRITE_DEVICE_PROPERTIES = fromString("writeDeviceProperties");

    /** Static value updateDeviceConfiguration for JobType. */
    public static final JobType UPDATE_DEVICE_CONFIGURATION = fromString("updateDeviceConfiguration");

    /** Static value rebootDevice for JobType. */
    public static final JobType REBOOT_DEVICE = fromString("rebootDevice");

    /** Static value factoryResetDevice for JobType. */
    public static final JobType FACTORY_RESET_DEVICE = fromString("factoryResetDevice");

    /** Static value firmwareUpdate for JobType. */
    public static final JobType FIRMWARE_UPDATE = fromString("firmwareUpdate");

    /**
     * Creates or finds a JobType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobType.
     */
    @JsonCreator
    public static JobType fromString(String name) {
        return fromString(name, JobType.class);
    }

    /**
     * Gets known JobType values.
     *
     * @return known JobType values.
     */
    public static Collection<JobType> values() {
        return values(JobType.class);
    }
}
