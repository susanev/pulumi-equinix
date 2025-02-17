// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ConnectionOperationError;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOperation {
    private @Nullable String equinixStatus;
    private @Nullable List<ConnectionOperationError> errors;
    private @Nullable String providerStatus;

    private ConnectionOperation() {}
    public Optional<String> equinixStatus() {
        return Optional.ofNullable(this.equinixStatus);
    }
    public List<ConnectionOperationError> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    public Optional<String> providerStatus() {
        return Optional.ofNullable(this.providerStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String equinixStatus;
        private @Nullable List<ConnectionOperationError> errors;
        private @Nullable String providerStatus;
        public Builder() {}
        public Builder(ConnectionOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equinixStatus = defaults.equinixStatus;
    	      this.errors = defaults.errors;
    	      this.providerStatus = defaults.providerStatus;
        }

        @CustomType.Setter
        public Builder equinixStatus(@Nullable String equinixStatus) {
            this.equinixStatus = equinixStatus;
            return this;
        }
        @CustomType.Setter
        public Builder errors(@Nullable List<ConnectionOperationError> errors) {
            this.errors = errors;
            return this;
        }
        public Builder errors(ConnectionOperationError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder providerStatus(@Nullable String providerStatus) {
            this.providerStatus = providerStatus;
            return this;
        }
        public ConnectionOperation build() {
            final var o = new ConnectionOperation();
            o.equinixStatus = equinixStatus;
            o.errors = errors;
            o.providerStatus = providerStatus;
            return o;
        }
    }
}
