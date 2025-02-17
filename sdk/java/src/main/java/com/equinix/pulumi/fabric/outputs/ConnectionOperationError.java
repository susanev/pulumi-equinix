// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ConnectionOperationErrorAdditionalInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOperationError {
    /**
     * @return Connection additional information
     * 
     */
    private @Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfo;
    private @Nullable String correlationId;
    private @Nullable String details;
    private @Nullable String errorCode;
    private @Nullable String errorMessage;
    private @Nullable String help;

    private ConnectionOperationError() {}
    /**
     * @return Connection additional information
     * 
     */
    public List<ConnectionOperationErrorAdditionalInfo> additionalInfo() {
        return this.additionalInfo == null ? List.of() : this.additionalInfo;
    }
    public Optional<String> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }
    public Optional<String> details() {
        return Optional.ofNullable(this.details);
    }
    public Optional<String> errorCode() {
        return Optional.ofNullable(this.errorCode);
    }
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    public Optional<String> help() {
        return Optional.ofNullable(this.help);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOperationError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfo;
        private @Nullable String correlationId;
        private @Nullable String details;
        private @Nullable String errorCode;
        private @Nullable String errorMessage;
        private @Nullable String help;
        public Builder() {}
        public Builder(ConnectionOperationError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.correlationId = defaults.correlationId;
    	      this.details = defaults.details;
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.help = defaults.help;
        }

        @CustomType.Setter
        public Builder additionalInfo(@Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public Builder additionalInfo(ConnectionOperationErrorAdditionalInfo... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }
        @CustomType.Setter
        public Builder correlationId(@Nullable String correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable String details) {
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder errorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder help(@Nullable String help) {
            this.help = help;
            return this;
        }
        public ConnectionOperationError build() {
            final var o = new ConnectionOperationError();
            o.additionalInfo = additionalInfo;
            o.correlationId = correlationId;
            o.details = details;
            o.errorCode = errorCode;
            o.errorMessage = errorMessage;
            o.help = help;
            return o;
        }
    }
}
