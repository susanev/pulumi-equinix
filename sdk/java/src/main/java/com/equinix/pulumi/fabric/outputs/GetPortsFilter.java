// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPortsFilter {
    /**
     * @return Query Parameter to Get Ports By Name
     * 
     */
    private @Nullable String name;

    private GetPortsFilter() {}
    /**
     * @return Query Parameter to Get Ports By Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        public Builder() {}
        public Builder(GetPortsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GetPortsFilter build() {
            final var o = new GetPortsFilter();
            o.name = name;
            return o;
        }
    }
}
