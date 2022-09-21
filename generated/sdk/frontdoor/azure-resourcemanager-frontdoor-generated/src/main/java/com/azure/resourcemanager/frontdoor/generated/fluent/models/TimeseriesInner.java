// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.frontdoor.generated.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesDataPoint;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Defines the Timeseries. */
@Fluent
public final class TimeseriesInner extends Resource {
    /*
     * The properties of a Timeseries
     */
    @JsonProperty(value = "properties")
    private TimeseriesProperties innerProperties;

    /** Creates an instance of TimeseriesInner class. */
    public TimeseriesInner() {
    }

    /**
     * Get the innerProperties property: The properties of a Timeseries.
     *
     * @return the innerProperties value.
     */
    private TimeseriesProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TimeseriesInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TimeseriesInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint associated with the Timeseries data point.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint associated with the Timeseries data point.
     *
     * @param endpoint the endpoint value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withEndpoint(String endpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the startDateTimeUtc property: The start DateTime of the Timeseries in UTC.
     *
     * @return the startDateTimeUtc value.
     */
    public String startDateTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().startDateTimeUtc();
    }

    /**
     * Set the startDateTimeUtc property: The start DateTime of the Timeseries in UTC.
     *
     * @param startDateTimeUtc the startDateTimeUtc value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withStartDateTimeUtc(String startDateTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withStartDateTimeUtc(startDateTimeUtc);
        return this;
    }

    /**
     * Get the endDateTimeUtc property: The end DateTime of the Timeseries in UTC.
     *
     * @return the endDateTimeUtc value.
     */
    public String endDateTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().endDateTimeUtc();
    }

    /**
     * Set the endDateTimeUtc property: The end DateTime of the Timeseries in UTC.
     *
     * @param endDateTimeUtc the endDateTimeUtc value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withEndDateTimeUtc(String endDateTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withEndDateTimeUtc(endDateTimeUtc);
        return this;
    }

    /**
     * Get the aggregationInterval property: The aggregation interval of the Timeseries.
     *
     * @return the aggregationInterval value.
     */
    public AggregationInterval aggregationInterval() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregationInterval();
    }

    /**
     * Set the aggregationInterval property: The aggregation interval of the Timeseries.
     *
     * @param aggregationInterval the aggregationInterval value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withAggregationInterval(AggregationInterval aggregationInterval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withAggregationInterval(aggregationInterval);
        return this;
    }

    /**
     * Get the timeseriesType property: The type of Timeseries.
     *
     * @return the timeseriesType value.
     */
    public TimeseriesType timeseriesType() {
        return this.innerProperties() == null ? null : this.innerProperties().timeseriesType();
    }

    /**
     * Set the timeseriesType property: The type of Timeseries.
     *
     * @param timeseriesType the timeseriesType value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withTimeseriesType(TimeseriesType timeseriesType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withTimeseriesType(timeseriesType);
        return this;
    }

    /**
     * Get the country property: The country associated with the Timeseries. Values are country ISO codes as specified
     * here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @return the country value.
     */
    public String country() {
        return this.innerProperties() == null ? null : this.innerProperties().country();
    }

    /**
     * Set the country property: The country associated with the Timeseries. Values are country ISO codes as specified
     * here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @param country the country value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withCountry(String country) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withCountry(country);
        return this;
    }

    /**
     * Get the timeseriesData property: The set of data points for the timeseries.
     *
     * @return the timeseriesData value.
     */
    public List<TimeseriesDataPoint> timeseriesData() {
        return this.innerProperties() == null ? null : this.innerProperties().timeseriesData();
    }

    /**
     * Set the timeseriesData property: The set of data points for the timeseries.
     *
     * @param timeseriesData the timeseriesData value to set.
     * @return the TimeseriesInner object itself.
     */
    public TimeseriesInner withTimeseriesData(List<TimeseriesDataPoint> timeseriesData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TimeseriesProperties();
        }
        this.innerProperties().withTimeseriesData(timeseriesData);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
