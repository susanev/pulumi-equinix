// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReservedIpBlockResult {
    private String address;
    private Integer addressFamily;
    private Integer cidr;
    private String cidrNotation;
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    private String facility;
    private String gateway;
    private Boolean global;
    private String id;
    private @Nullable String ipAddress;
    private Boolean manageable;
    private Boolean management;
    private String metro;
    private String netmask;
    private String network;
    private String projectId;
    private Boolean public_;
    private Integer quantity;
    /**
     * @return One of `global_ipv4`, `public_ipv4`, `private_ipv4`, `public_ipv6`,or `vrf`
     * 
     */
    private String type;
    private Integer vrfId;

    private GetReservedIpBlockResult() {}
    public String address() {
        return this.address;
    }
    public Integer addressFamily() {
        return this.addressFamily;
    }
    public Integer cidr() {
        return this.cidr;
    }
    public String cidrNotation() {
        return this.cidrNotation;
    }
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public String facility() {
        return this.facility;
    }
    public String gateway() {
        return this.gateway;
    }
    public Boolean global() {
        return this.global;
    }
    public String id() {
        return this.id;
    }
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Boolean manageable() {
        return this.manageable;
    }
    public Boolean management() {
        return this.management;
    }
    public String metro() {
        return this.metro;
    }
    public String netmask() {
        return this.netmask;
    }
    public String network() {
        return this.network;
    }
    public String projectId() {
        return this.projectId;
    }
    public Boolean public_() {
        return this.public_;
    }
    public Integer quantity() {
        return this.quantity;
    }
    /**
     * @return One of `global_ipv4`, `public_ipv4`, `private_ipv4`, `public_ipv6`,or `vrf`
     * 
     */
    public String type() {
        return this.type;
    }
    public Integer vrfId() {
        return this.vrfId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservedIpBlockResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer addressFamily;
        private Integer cidr;
        private String cidrNotation;
        private String facility;
        private String gateway;
        private Boolean global;
        private String id;
        private @Nullable String ipAddress;
        private Boolean manageable;
        private Boolean management;
        private String metro;
        private String netmask;
        private String network;
        private String projectId;
        private Boolean public_;
        private Integer quantity;
        private String type;
        private Integer vrfId;
        public Builder() {}
        public Builder(GetReservedIpBlockResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressFamily = defaults.addressFamily;
    	      this.cidr = defaults.cidr;
    	      this.cidrNotation = defaults.cidrNotation;
    	      this.facility = defaults.facility;
    	      this.gateway = defaults.gateway;
    	      this.global = defaults.global;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.manageable = defaults.manageable;
    	      this.management = defaults.management;
    	      this.metro = defaults.metro;
    	      this.netmask = defaults.netmask;
    	      this.network = defaults.network;
    	      this.projectId = defaults.projectId;
    	      this.public_ = defaults.public_;
    	      this.quantity = defaults.quantity;
    	      this.type = defaults.type;
    	      this.vrfId = defaults.vrfId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder addressFamily(Integer addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }
        @CustomType.Setter
        public Builder cidr(Integer cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        @CustomType.Setter
        public Builder cidrNotation(String cidrNotation) {
            this.cidrNotation = Objects.requireNonNull(cidrNotation);
            return this;
        }
        @CustomType.Setter
        public Builder facility(String facility) {
            this.facility = Objects.requireNonNull(facility);
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        @CustomType.Setter
        public Builder global(Boolean global) {
            this.global = Objects.requireNonNull(global);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder manageable(Boolean manageable) {
            this.manageable = Objects.requireNonNull(manageable);
            return this;
        }
        @CustomType.Setter
        public Builder management(Boolean management) {
            this.management = Objects.requireNonNull(management);
            return this;
        }
        @CustomType.Setter
        public Builder metro(String metro) {
            this.metro = Objects.requireNonNull(metro);
            return this;
        }
        @CustomType.Setter
        public Builder netmask(String netmask) {
            this.netmask = Objects.requireNonNull(netmask);
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(Boolean public_) {
            this.public_ = Objects.requireNonNull(public_);
            return this;
        }
        @CustomType.Setter
        public Builder quantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder vrfId(Integer vrfId) {
            this.vrfId = Objects.requireNonNull(vrfId);
            return this;
        }
        public GetReservedIpBlockResult build() {
            final var o = new GetReservedIpBlockResult();
            o.address = address;
            o.addressFamily = addressFamily;
            o.cidr = cidr;
            o.cidrNotation = cidrNotation;
            o.facility = facility;
            o.gateway = gateway;
            o.global = global;
            o.id = id;
            o.ipAddress = ipAddress;
            o.manageable = manageable;
            o.management = management;
            o.metro = metro;
            o.netmask = netmask;
            o.network = network;
            o.projectId = projectId;
            o.public_ = public_;
            o.quantity = quantity;
            o.type = type;
            o.vrfId = vrfId;
            return o;
        }
    }
}
