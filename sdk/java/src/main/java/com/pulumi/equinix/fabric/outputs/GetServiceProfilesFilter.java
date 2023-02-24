// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilesFilter {
    /**
     * @return Possible operator to use on filters = - equal
     * 
     */
    private @Nullable String operator;
    /**
     * @return Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
     * 
     */
    private @Nullable String property;
    /**
     * @return Values
     * 
     */
    private @Nullable List<String> values;

    private GetServiceProfilesFilter() {}
    /**
     * @return Possible operator to use on filters = - equal
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }
    /**
     * @return Values
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String operator;
        private @Nullable String property;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetServiceProfilesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.property = defaults.property;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder property(@Nullable String property) {
            this.property = property;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetServiceProfilesFilter build() {
            final var o = new GetServiceProfilesFilter();
            o.operator = operator;
            o.property = property;
            o.values = values;
            return o;
        }
    }
}