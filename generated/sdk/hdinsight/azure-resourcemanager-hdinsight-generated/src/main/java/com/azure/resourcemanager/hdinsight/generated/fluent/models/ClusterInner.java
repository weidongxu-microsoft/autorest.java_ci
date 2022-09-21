// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterGetProperties;
import com.azure.resourcemanager.hdinsight.generated.models.ClusterIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The HDInsight cluster. */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * The ETag for the resource
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The availability zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The properties of the cluster.
     */
    @JsonProperty(value = "properties")
    private ClusterGetProperties properties;

    /*
     * The identity of the cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ClusterIdentity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClusterInner class. */
    public ClusterInner() {
    }

    /**
     * Get the etag property: The ETag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag for the resource.
     *
     * @param etag the etag value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: The availability zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The availability zones.
     *
     * @param zones the zones value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the properties property: The properties of the cluster.
     *
     * @return the properties value.
     */
    public ClusterGetProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the cluster.
     *
     * @param properties the properties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withProperties(ClusterGetProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The identity of the cluster, if configured.
     *
     * @return the identity value.
     */
    public ClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the cluster, if configured.
     *
     * @param identity the identity value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(ClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
