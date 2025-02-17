// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetPortsDatumAccount;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumChangeLog;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumDevice;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumEncapsulation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumLag;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumLocation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumOperation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumRedundancy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPortsDatum {
    private List<GetPortsDatumAccount> accounts;
    private Integer availableBandwidth;
    private Integer bandwidth;
    private List<GetPortsDatumChangeLog> changeLogs;
    private String description;
    private List<GetPortsDatumDevice> devices;
    private List<GetPortsDatumEncapsulation> encapsulations;
    private String href;
    private List<GetPortsDatumLag> lags;
    private List<GetPortsDatumLocation> locations;
    private String name;
    private List<GetPortsDatumOperation> operations;
    private List<GetPortsDatumRedundancy> redundancies;
    private String serviceType;
    private String state;
    private String type;
    private Integer usedBandwidth;
    private @Nullable String uuid;

    private GetPortsDatum() {}
    public List<GetPortsDatumAccount> accounts() {
        return this.accounts;
    }
    public Integer availableBandwidth() {
        return this.availableBandwidth;
    }
    public Integer bandwidth() {
        return this.bandwidth;
    }
    public List<GetPortsDatumChangeLog> changeLogs() {
        return this.changeLogs;
    }
    public String description() {
        return this.description;
    }
    public List<GetPortsDatumDevice> devices() {
        return this.devices;
    }
    public List<GetPortsDatumEncapsulation> encapsulations() {
        return this.encapsulations;
    }
    public String href() {
        return this.href;
    }
    public List<GetPortsDatumLag> lags() {
        return this.lags;
    }
    public List<GetPortsDatumLocation> locations() {
        return this.locations;
    }
    public String name() {
        return this.name;
    }
    public List<GetPortsDatumOperation> operations() {
        return this.operations;
    }
    public List<GetPortsDatumRedundancy> redundancies() {
        return this.redundancies;
    }
    public String serviceType() {
        return this.serviceType;
    }
    public String state() {
        return this.state;
    }
    public String type() {
        return this.type;
    }
    public Integer usedBandwidth() {
        return this.usedBandwidth;
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatum defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPortsDatumAccount> accounts;
        private Integer availableBandwidth;
        private Integer bandwidth;
        private List<GetPortsDatumChangeLog> changeLogs;
        private String description;
        private List<GetPortsDatumDevice> devices;
        private List<GetPortsDatumEncapsulation> encapsulations;
        private String href;
        private List<GetPortsDatumLag> lags;
        private List<GetPortsDatumLocation> locations;
        private String name;
        private List<GetPortsDatumOperation> operations;
        private List<GetPortsDatumRedundancy> redundancies;
        private String serviceType;
        private String state;
        private String type;
        private Integer usedBandwidth;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPortsDatum defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.availableBandwidth = defaults.availableBandwidth;
    	      this.bandwidth = defaults.bandwidth;
    	      this.changeLogs = defaults.changeLogs;
    	      this.description = defaults.description;
    	      this.devices = defaults.devices;
    	      this.encapsulations = defaults.encapsulations;
    	      this.href = defaults.href;
    	      this.lags = defaults.lags;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.operations = defaults.operations;
    	      this.redundancies = defaults.redundancies;
    	      this.serviceType = defaults.serviceType;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.usedBandwidth = defaults.usedBandwidth;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accounts(List<GetPortsDatumAccount> accounts) {
            this.accounts = Objects.requireNonNull(accounts);
            return this;
        }
        public Builder accounts(GetPortsDatumAccount... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder availableBandwidth(Integer availableBandwidth) {
            this.availableBandwidth = Objects.requireNonNull(availableBandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder changeLogs(List<GetPortsDatumChangeLog> changeLogs) {
            this.changeLogs = Objects.requireNonNull(changeLogs);
            return this;
        }
        public Builder changeLogs(GetPortsDatumChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder devices(List<GetPortsDatumDevice> devices) {
            this.devices = Objects.requireNonNull(devices);
            return this;
        }
        public Builder devices(GetPortsDatumDevice... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder encapsulations(List<GetPortsDatumEncapsulation> encapsulations) {
            this.encapsulations = Objects.requireNonNull(encapsulations);
            return this;
        }
        public Builder encapsulations(GetPortsDatumEncapsulation... encapsulations) {
            return encapsulations(List.of(encapsulations));
        }
        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder lags(List<GetPortsDatumLag> lags) {
            this.lags = Objects.requireNonNull(lags);
            return this;
        }
        public Builder lags(GetPortsDatumLag... lags) {
            return lags(List.of(lags));
        }
        @CustomType.Setter
        public Builder locations(List<GetPortsDatumLocation> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(GetPortsDatumLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder operations(List<GetPortsDatumOperation> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }
        public Builder operations(GetPortsDatumOperation... operations) {
            return operations(List.of(operations));
        }
        @CustomType.Setter
        public Builder redundancies(List<GetPortsDatumRedundancy> redundancies) {
            this.redundancies = Objects.requireNonNull(redundancies);
            return this;
        }
        public Builder redundancies(GetPortsDatumRedundancy... redundancies) {
            return redundancies(List.of(redundancies));
        }
        @CustomType.Setter
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usedBandwidth(Integer usedBandwidth) {
            this.usedBandwidth = Objects.requireNonNull(usedBandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPortsDatum build() {
            final var o = new GetPortsDatum();
            o.accounts = accounts;
            o.availableBandwidth = availableBandwidth;
            o.bandwidth = bandwidth;
            o.changeLogs = changeLogs;
            o.description = description;
            o.devices = devices;
            o.encapsulations = encapsulations;
            o.href = href;
            o.lags = lags;
            o.locations = locations;
            o.name = name;
            o.operations = operations;
            o.redundancies = redundancies;
            o.serviceType = serviceType;
            o.state = state;
            o.type = type;
            o.usedBandwidth = usedBandwidth;
            o.uuid = uuid;
            return o;
        }
    }
}
