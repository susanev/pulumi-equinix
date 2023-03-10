// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilesSort {
    /**
     * @return Priority type- DESC, ASC
     * 
     */
    private @Nullable String direction;
    /**
     * @return Search operation sort criteria /name /state /changeLog/createdDateTime /changeLog/updatedDateTime
     * 
     */
    private @Nullable String property;

    private GetServiceProfilesSort() {}
    /**
     * @return Priority type- DESC, ASC
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Search operation sort criteria /name /state /changeLog/createdDateTime /changeLog/updatedDateTime
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesSort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private @Nullable String property;
        public Builder() {}
        public Builder(GetServiceProfilesSort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.property = defaults.property;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder property(@Nullable String property) {
            this.property = property;
            return this;
        }
        public GetServiceProfilesSort build() {
            final var o = new GetServiceProfilesSort();
            o.direction = direction;
            o.property = property;
            return o;
        }
    }
}