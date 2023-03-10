// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.equinix.pulumi.equinix.fabric.outputs.ConnectionOperationErrorAdditionalInfo;
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
    private @Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfos;
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
    public List<ConnectionOperationErrorAdditionalInfo> additionalInfos() {
        return this.additionalInfos == null ? List.of() : this.additionalInfos;
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
        private @Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfos;
        private @Nullable String correlationId;
        private @Nullable String details;
        private @Nullable String errorCode;
        private @Nullable String errorMessage;
        private @Nullable String help;
        public Builder() {}
        public Builder(ConnectionOperationError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfos = defaults.additionalInfos;
    	      this.correlationId = defaults.correlationId;
    	      this.details = defaults.details;
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.help = defaults.help;
        }

        @CustomType.Setter
        public Builder additionalInfos(@Nullable List<ConnectionOperationErrorAdditionalInfo> additionalInfos) {
            this.additionalInfos = additionalInfos;
            return this;
        }
        public Builder additionalInfos(ConnectionOperationErrorAdditionalInfo... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
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
            o.additionalInfos = additionalInfos;
            o.correlationId = correlationId;
            o.details = details;
            o.errorCode = errorCode;
            o.errorMessage = errorMessage;
            o.help = help;
            return o;
        }
    }
}