// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.enums.AccessPointPeeringType;
import com.equinix.pulumi.fabric.enums.AccessPointType;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointAccountArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointGatewayArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointLocationArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointProfileArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointRoutingProtocolArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionASideAccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionASideAccessPointArgs Empty = new ConnectionASideAccessPointArgs();

    /**
     * Customer account information that is associated with this connection
     * 
     */
    @Import(name="account")
    private @Nullable Output<ConnectionASideAccessPointAccountArgs> account;

    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public Optional<Output<ConnectionASideAccessPointAccountArgs>> account() {
        return Optional.ofNullable(this.account);
    }

    @Import(name="authenticationKey")
    private @Nullable Output<String> authenticationKey;

    public Optional<Output<String>> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }

    @Import(name="gateway")
    private @Nullable Output<ConnectionASideAccessPointGatewayArgs> gateway;

    public Optional<Output<ConnectionASideAccessPointGatewayArgs>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    @Import(name="interface")
    private @Nullable Output<ConnectionASideAccessPointInterfaceArgs> interface_;

    public Optional<Output<ConnectionASideAccessPointInterfaceArgs>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    @Import(name="linkProtocol")
    private @Nullable Output<ConnectionASideAccessPointLinkProtocolArgs> linkProtocol;

    public Optional<Output<ConnectionASideAccessPointLinkProtocolArgs>> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }

    @Import(name="location")
    private @Nullable Output<ConnectionASideAccessPointLocationArgs> location;

    public Optional<Output<ConnectionASideAccessPointLocationArgs>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="peeringType")
    private @Nullable Output<Either<String,AccessPointPeeringType>> peeringType;

    public Optional<Output<Either<String,AccessPointPeeringType>>> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }

    @Import(name="port")
    private @Nullable Output<ConnectionASideAccessPointPortArgs> port;

    public Optional<Output<ConnectionASideAccessPointPortArgs>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="profile")
    private @Nullable Output<ConnectionASideAccessPointProfileArgs> profile;

    public Optional<Output<ConnectionASideAccessPointProfileArgs>> profile() {
        return Optional.ofNullable(this.profile);
    }

    @Import(name="providerConnectionId")
    private @Nullable Output<String> providerConnectionId;

    public Optional<Output<String>> providerConnectionId() {
        return Optional.ofNullable(this.providerConnectionId);
    }

    @Import(name="routingProtocols")
    private @Nullable Output<List<ConnectionASideAccessPointRoutingProtocolArgs>> routingProtocols;

    public Optional<Output<List<ConnectionASideAccessPointRoutingProtocolArgs>>> routingProtocols() {
        return Optional.ofNullable(this.routingProtocols);
    }

    @Import(name="sellerRegion")
    private @Nullable Output<String> sellerRegion;

    public Optional<Output<String>> sellerRegion() {
        return Optional.ofNullable(this.sellerRegion);
    }

    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,AccessPointType>> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Optional<Output<Either<String,AccessPointType>>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="virtualDevice")
    private @Nullable Output<ConnectionASideAccessPointVirtualDeviceArgs> virtualDevice;

    public Optional<Output<ConnectionASideAccessPointVirtualDeviceArgs>> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    private ConnectionASideAccessPointArgs() {}

    private ConnectionASideAccessPointArgs(ConnectionASideAccessPointArgs $) {
        this.account = $.account;
        this.authenticationKey = $.authenticationKey;
        this.gateway = $.gateway;
        this.interface_ = $.interface_;
        this.linkProtocol = $.linkProtocol;
        this.location = $.location;
        this.peeringType = $.peeringType;
        this.port = $.port;
        this.profile = $.profile;
        this.providerConnectionId = $.providerConnectionId;
        this.routingProtocols = $.routingProtocols;
        this.sellerRegion = $.sellerRegion;
        this.type = $.type;
        this.virtualDevice = $.virtualDevice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionASideAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionASideAccessPointArgs $;

        public Builder() {
            $ = new ConnectionASideAccessPointArgs();
        }

        public Builder(ConnectionASideAccessPointArgs defaults) {
            $ = new ConnectionASideAccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<ConnectionASideAccessPointAccountArgs> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder account(ConnectionASideAccessPointAccountArgs account) {
            return account(Output.of(account));
        }

        public Builder authenticationKey(@Nullable Output<String> authenticationKey) {
            $.authenticationKey = authenticationKey;
            return this;
        }

        public Builder authenticationKey(String authenticationKey) {
            return authenticationKey(Output.of(authenticationKey));
        }

        public Builder gateway(@Nullable Output<ConnectionASideAccessPointGatewayArgs> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(ConnectionASideAccessPointGatewayArgs gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder interface_(@Nullable Output<ConnectionASideAccessPointInterfaceArgs> interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder interface_(ConnectionASideAccessPointInterfaceArgs interface_) {
            return interface_(Output.of(interface_));
        }

        public Builder linkProtocol(@Nullable Output<ConnectionASideAccessPointLinkProtocolArgs> linkProtocol) {
            $.linkProtocol = linkProtocol;
            return this;
        }

        public Builder linkProtocol(ConnectionASideAccessPointLinkProtocolArgs linkProtocol) {
            return linkProtocol(Output.of(linkProtocol));
        }

        public Builder location(@Nullable Output<ConnectionASideAccessPointLocationArgs> location) {
            $.location = location;
            return this;
        }

        public Builder location(ConnectionASideAccessPointLocationArgs location) {
            return location(Output.of(location));
        }

        public Builder peeringType(@Nullable Output<Either<String,AccessPointPeeringType>> peeringType) {
            $.peeringType = peeringType;
            return this;
        }

        public Builder peeringType(Either<String,AccessPointPeeringType> peeringType) {
            return peeringType(Output.of(peeringType));
        }

        public Builder peeringType(String peeringType) {
            return peeringType(Either.ofLeft(peeringType));
        }

        public Builder peeringType(AccessPointPeeringType peeringType) {
            return peeringType(Either.ofRight(peeringType));
        }

        public Builder port(@Nullable Output<ConnectionASideAccessPointPortArgs> port) {
            $.port = port;
            return this;
        }

        public Builder port(ConnectionASideAccessPointPortArgs port) {
            return port(Output.of(port));
        }

        public Builder profile(@Nullable Output<ConnectionASideAccessPointProfileArgs> profile) {
            $.profile = profile;
            return this;
        }

        public Builder profile(ConnectionASideAccessPointProfileArgs profile) {
            return profile(Output.of(profile));
        }

        public Builder providerConnectionId(@Nullable Output<String> providerConnectionId) {
            $.providerConnectionId = providerConnectionId;
            return this;
        }

        public Builder providerConnectionId(String providerConnectionId) {
            return providerConnectionId(Output.of(providerConnectionId));
        }

        public Builder routingProtocols(@Nullable Output<List<ConnectionASideAccessPointRoutingProtocolArgs>> routingProtocols) {
            $.routingProtocols = routingProtocols;
            return this;
        }

        public Builder routingProtocols(List<ConnectionASideAccessPointRoutingProtocolArgs> routingProtocols) {
            return routingProtocols(Output.of(routingProtocols));
        }

        public Builder routingProtocols(ConnectionASideAccessPointRoutingProtocolArgs... routingProtocols) {
            return routingProtocols(List.of(routingProtocols));
        }

        public Builder sellerRegion(@Nullable Output<String> sellerRegion) {
            $.sellerRegion = sellerRegion;
            return this;
        }

        public Builder sellerRegion(String sellerRegion) {
            return sellerRegion(Output.of(sellerRegion));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,AccessPointType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,AccessPointType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(AccessPointType type) {
            return type(Either.ofRight(type));
        }

        public Builder virtualDevice(@Nullable Output<ConnectionASideAccessPointVirtualDeviceArgs> virtualDevice) {
            $.virtualDevice = virtualDevice;
            return this;
        }

        public Builder virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs virtualDevice) {
            return virtualDevice(Output.of(virtualDevice));
        }

        public ConnectionASideAccessPointArgs build() {
            return $;
        }
    }

}
