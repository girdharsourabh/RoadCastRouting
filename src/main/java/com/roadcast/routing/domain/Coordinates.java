/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.roadcast.routing.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Horizontal geographical coordinates consisting of latitude and longitude.
 */
public class Coordinates {

    private final BigDecimal latitude;
    private final BigDecimal longitude;

    public Coordinates(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = Objects.requireNonNull(latitude);
        this.longitude = Objects.requireNonNull(longitude);
    }

    /**
     * Create coordinates from the given latitude in longitude.
     *
     * @param latitude latitude
     * @param longitude longitude
     * @return coordinates with the given latitude and longitude
     */
    public static Coordinates valueOf(double latitude, double longitude) {
        return new Coordinates(BigDecimal.valueOf(latitude), BigDecimal.valueOf(longitude));
    }

    /**
     * Latitude.
     *
     * @return latitude (never {@code null})
     */
    public BigDecimal latitude() {
        return latitude;
    }

    /**
     * Longitude.
     *
     * @return longitude (never {@code null})
     */
    public BigDecimal longitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) o;
        return latitude.compareTo(coordinates.latitude) == 0 &&
                longitude.compareTo(coordinates.longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude.doubleValue(), longitude.doubleValue());
    }

    @Override
    public String toString() {
        return "[" + latitude.toPlainString() +
                ", " + longitude.toPlainString() +
                ']';
    }
}
