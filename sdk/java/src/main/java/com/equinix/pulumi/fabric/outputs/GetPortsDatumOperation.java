// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortsDatumOperation {
    private Integer connectionCount;
    private String opStatusChangedAt;
    private String operationalStatus;

    private GetPortsDatumOperation() {}
    public Integer connectionCount() {
        return this.connectionCount;
    }
    public String opStatusChangedAt() {
        return this.opStatusChangedAt;
    }
    public String operationalStatus() {
        return this.operationalStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatumOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer connectionCount;
        private String opStatusChangedAt;
        private String operationalStatus;
        public Builder() {}
        public Builder(GetPortsDatumOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionCount = defaults.connectionCount;
    	      this.opStatusChangedAt = defaults.opStatusChangedAt;
    	      this.operationalStatus = defaults.operationalStatus;
        }

        @CustomType.Setter
        public Builder connectionCount(Integer connectionCount) {
            this.connectionCount = Objects.requireNonNull(connectionCount);
            return this;
        }
        @CustomType.Setter
        public Builder opStatusChangedAt(String opStatusChangedAt) {
            this.opStatusChangedAt = Objects.requireNonNull(opStatusChangedAt);
            return this;
        }
        @CustomType.Setter
        public Builder operationalStatus(String operationalStatus) {
            this.operationalStatus = Objects.requireNonNull(operationalStatus);
            return this;
        }
        public GetPortsDatumOperation build() {
            final var o = new GetPortsDatumOperation();
            o.connectionCount = connectionCount;
            o.opStatusChangedAt = opStatusChangedAt;
            o.operationalStatus = operationalStatus;
            return o;
        }
    }
}
