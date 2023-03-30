// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionProject {
    /**
     * @return Unique Resource URL
     * 
     */
    private @Nullable String href;
    /**
     * @return Project Id
     * 
     */
    private @Nullable String projectId;

    private ConnectionProject() {}
    /**
     * @return Unique Resource URL
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Project Id
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private @Nullable String projectId;
        public Builder() {}
        public Builder(ConnectionProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public ConnectionProject build() {
            final var o = new ConnectionProject();
            o.href = href;
            o.projectId = projectId;
            return o;
        }
    }
}