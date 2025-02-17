// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeviceBehavior {
    /**
     * @return List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
     * 
     */
    private @Nullable List<String> allowChanges;

    private DeviceBehavior() {}
    /**
     * @return List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
     * 
     */
    public List<String> allowChanges() {
        return this.allowChanges == null ? List.of() : this.allowChanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceBehavior defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowChanges;
        public Builder() {}
        public Builder(DeviceBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowChanges = defaults.allowChanges;
        }

        @CustomType.Setter
        public Builder allowChanges(@Nullable List<String> allowChanges) {
            this.allowChanges = allowChanges;
            return this;
        }
        public Builder allowChanges(String... allowChanges) {
            return allowChanges(List.of(allowChanges));
        }
        public DeviceBehavior build() {
            final var o = new DeviceBehavior();
            o.allowChanges = allowChanges;
            return o;
        }
    }
}
