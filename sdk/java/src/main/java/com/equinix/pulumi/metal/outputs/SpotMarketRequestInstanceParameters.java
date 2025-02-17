// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotMarketRequestInstanceParameters {
    private @Nullable Boolean alwaysPxe;
    private String billingCycle;
    private @Nullable String customdata;
    private @Nullable String description;
    private @Nullable List<String> features;
    private String hostname;
    private @Nullable String ipxeScriptUrl;
    /**
     * @return Blocks deletion of the SpotMarketRequest device until the lock is disabled.
     * 
     */
    private @Nullable Boolean locked;
    private String operatingSystem;
    private String plan;
    private @Nullable List<String> projectSshKeys;
    private @Nullable List<String> tags;
    private @Nullable String termintationTime;
    private @Nullable List<String> userSshKeys;
    private @Nullable String userdata;

    private SpotMarketRequestInstanceParameters() {}
    public Optional<Boolean> alwaysPxe() {
        return Optional.ofNullable(this.alwaysPxe);
    }
    public String billingCycle() {
        return this.billingCycle;
    }
    public Optional<String> customdata() {
        return Optional.ofNullable(this.customdata);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<String> features() {
        return this.features == null ? List.of() : this.features;
    }
    public String hostname() {
        return this.hostname;
    }
    public Optional<String> ipxeScriptUrl() {
        return Optional.ofNullable(this.ipxeScriptUrl);
    }
    /**
     * @return Blocks deletion of the SpotMarketRequest device until the lock is disabled.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public String operatingSystem() {
        return this.operatingSystem;
    }
    public String plan() {
        return this.plan;
    }
    public List<String> projectSshKeys() {
        return this.projectSshKeys == null ? List.of() : this.projectSshKeys;
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> termintationTime() {
        return Optional.ofNullable(this.termintationTime);
    }
    public List<String> userSshKeys() {
        return this.userSshKeys == null ? List.of() : this.userSshKeys;
    }
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotMarketRequestInstanceParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysPxe;
        private String billingCycle;
        private @Nullable String customdata;
        private @Nullable String description;
        private @Nullable List<String> features;
        private String hostname;
        private @Nullable String ipxeScriptUrl;
        private @Nullable Boolean locked;
        private String operatingSystem;
        private String plan;
        private @Nullable List<String> projectSshKeys;
        private @Nullable List<String> tags;
        private @Nullable String termintationTime;
        private @Nullable List<String> userSshKeys;
        private @Nullable String userdata;
        public Builder() {}
        public Builder(SpotMarketRequestInstanceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysPxe = defaults.alwaysPxe;
    	      this.billingCycle = defaults.billingCycle;
    	      this.customdata = defaults.customdata;
    	      this.description = defaults.description;
    	      this.features = defaults.features;
    	      this.hostname = defaults.hostname;
    	      this.ipxeScriptUrl = defaults.ipxeScriptUrl;
    	      this.locked = defaults.locked;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.plan = defaults.plan;
    	      this.projectSshKeys = defaults.projectSshKeys;
    	      this.tags = defaults.tags;
    	      this.termintationTime = defaults.termintationTime;
    	      this.userSshKeys = defaults.userSshKeys;
    	      this.userdata = defaults.userdata;
        }

        @CustomType.Setter
        public Builder alwaysPxe(@Nullable Boolean alwaysPxe) {
            this.alwaysPxe = alwaysPxe;
            return this;
        }
        @CustomType.Setter
        public Builder billingCycle(String billingCycle) {
            this.billingCycle = Objects.requireNonNull(billingCycle);
            return this;
        }
        @CustomType.Setter
        public Builder customdata(@Nullable String customdata) {
            this.customdata = customdata;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder features(@Nullable List<String> features) {
            this.features = features;
            return this;
        }
        public Builder features(String... features) {
            return features(List.of(features));
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder ipxeScriptUrl(@Nullable String ipxeScriptUrl) {
            this.ipxeScriptUrl = ipxeScriptUrl;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }
        @CustomType.Setter
        public Builder plan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }
        @CustomType.Setter
        public Builder projectSshKeys(@Nullable List<String> projectSshKeys) {
            this.projectSshKeys = projectSshKeys;
            return this;
        }
        public Builder projectSshKeys(String... projectSshKeys) {
            return projectSshKeys(List.of(projectSshKeys));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder termintationTime(@Nullable String termintationTime) {
            this.termintationTime = termintationTime;
            return this;
        }
        @CustomType.Setter
        public Builder userSshKeys(@Nullable List<String> userSshKeys) {
            this.userSshKeys = userSshKeys;
            return this;
        }
        public Builder userSshKeys(String... userSshKeys) {
            return userSshKeys(List.of(userSshKeys));
        }
        @CustomType.Setter
        public Builder userdata(@Nullable String userdata) {
            this.userdata = userdata;
            return this;
        }
        public SpotMarketRequestInstanceParameters build() {
            final var o = new SpotMarketRequestInstanceParameters();
            o.alwaysPxe = alwaysPxe;
            o.billingCycle = billingCycle;
            o.customdata = customdata;
            o.description = description;
            o.features = features;
            o.hostname = hostname;
            o.ipxeScriptUrl = ipxeScriptUrl;
            o.locked = locked;
            o.operatingSystem = operatingSystem;
            o.plan = plan;
            o.projectSshKeys = projectSshKeys;
            o.tags = tags;
            o.termintationTime = termintationTime;
            o.userSshKeys = userSshKeys;
            o.userdata = userdata;
            return o;
        }
    }
}
