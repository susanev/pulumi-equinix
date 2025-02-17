// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceBgpNeighborsBgpNeighborRoutesOut {
    /**
     * @return (bool) Whether the route is exact.
     * 
     */
    private Boolean exact;
    /**
     * @return CIDR expression of route (IP/mask).
     * 
     */
    private String route;

    private GetDeviceBgpNeighborsBgpNeighborRoutesOut() {}
    /**
     * @return (bool) Whether the route is exact.
     * 
     */
    public Boolean exact() {
        return this.exact;
    }
    /**
     * @return CIDR expression of route (IP/mask).
     * 
     */
    public String route() {
        return this.route;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceBgpNeighborsBgpNeighborRoutesOut defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean exact;
        private String route;
        public Builder() {}
        public Builder(GetDeviceBgpNeighborsBgpNeighborRoutesOut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.route = defaults.route;
        }

        @CustomType.Setter
        public Builder exact(Boolean exact) {
            this.exact = Objects.requireNonNull(exact);
            return this;
        }
        @CustomType.Setter
        public Builder route(String route) {
            this.route = Objects.requireNonNull(route);
            return this;
        }
        public GetDeviceBgpNeighborsBgpNeighborRoutesOut build() {
            final var o = new GetDeviceBgpNeighborsBgpNeighborRoutesOut();
            o.exact = exact;
            o.route = route;
            return o;
        }
    }
}
