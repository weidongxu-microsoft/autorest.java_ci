// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Deployment build status. */
public final class DeploymentBuildStatus extends ExpandableStringEnum<DeploymentBuildStatus> {
    /** Static value TimedOut for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus TIMED_OUT = fromString("TimedOut");

    /** Static value RuntimeFailed for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus RUNTIME_FAILED = fromString("RuntimeFailed");

    /** Static value BuildAborted for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_ABORTED = fromString("BuildAborted");

    /** Static value BuildFailed for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_FAILED = fromString("BuildFailed");

    /** Static value BuildRequestReceived for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_REQUEST_RECEIVED = fromString("BuildRequestReceived");

    /** Static value BuildPending for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_PENDING = fromString("BuildPending");

    /** Static value BuildInProgress for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_IN_PROGRESS = fromString("BuildInProgress");

    /** Static value BuildSuccessful for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus BUILD_SUCCESSFUL = fromString("BuildSuccessful");

    /** Static value PostBuildRestartRequired for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus POST_BUILD_RESTART_REQUIRED = fromString("PostBuildRestartRequired");

    /** Static value StartPolling for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus START_POLLING = fromString("StartPolling");

    /** Static value StartPollingWithRestart for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus START_POLLING_WITH_RESTART = fromString("StartPollingWithRestart");

    /** Static value RuntimeStarting for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus RUNTIME_STARTING = fromString("RuntimeStarting");

    /** Static value RuntimeSuccessful for DeploymentBuildStatus. */
    public static final DeploymentBuildStatus RUNTIME_SUCCESSFUL = fromString("RuntimeSuccessful");

    /**
     * Creates or finds a DeploymentBuildStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentBuildStatus.
     */
    @JsonCreator
    public static DeploymentBuildStatus fromString(String name) {
        return fromString(name, DeploymentBuildStatus.class);
    }

    /**
     * Gets known DeploymentBuildStatus values.
     *
     * @return known DeploymentBuildStatus values.
     */
    public static Collection<DeploymentBuildStatus> values() {
        return values(DeploymentBuildStatus.class);
    }
}
