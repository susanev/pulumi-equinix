// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * UUID of Public or VRF IP Reservation to associate with the gateway, the
     * reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
     * 
     */
    @Import(name="ipReservationId")
    private @Nullable Output<String> ipReservationId;

    /**
     * @return UUID of Public or VRF IP Reservation to associate with the gateway, the
     * reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
     * 
     */
    public Optional<Output<String>> ipReservationId() {
        return Optional.ofNullable(this.ipReservationId);
    }

    /**
     * Size of the private IPv4 subnet to create for this metal
     * gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
     * 
     */
    @Import(name="privateIpv4SubnetSize")
    private @Nullable Output<Integer> privateIpv4SubnetSize;

    /**
     * @return Size of the private IPv4 subnet to create for this metal
     * gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
     * 
     */
    public Optional<Output<Integer>> privateIpv4SubnetSize() {
        return Optional.ofNullable(this.privateIpv4SubnetSize);
    }

    /**
     * UUID of the project where the gateway is scoped to.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return UUID of the project where the gateway is scoped to.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * UUID of the VLAN where the gateway is scoped to.
     * 
     */
    @Import(name="vlanId", required=true)
    private Output<String> vlanId;

    /**
     * @return UUID of the VLAN where the gateway is scoped to.
     * 
     */
    public Output<String> vlanId() {
        return this.vlanId;
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.ipReservationId = $.ipReservationId;
        this.privateIpv4SubnetSize = $.privateIpv4SubnetSize;
        this.projectId = $.projectId;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipReservationId UUID of Public or VRF IP Reservation to associate with the gateway, the
         * reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
         * 
         * @return builder
         * 
         */
        public Builder ipReservationId(@Nullable Output<String> ipReservationId) {
            $.ipReservationId = ipReservationId;
            return this;
        }

        /**
         * @param ipReservationId UUID of Public or VRF IP Reservation to associate with the gateway, the
         * reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
         * 
         * @return builder
         * 
         */
        public Builder ipReservationId(String ipReservationId) {
            return ipReservationId(Output.of(ipReservationId));
        }

        /**
         * @param privateIpv4SubnetSize Size of the private IPv4 subnet to create for this metal
         * gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4SubnetSize(@Nullable Output<Integer> privateIpv4SubnetSize) {
            $.privateIpv4SubnetSize = privateIpv4SubnetSize;
            return this;
        }

        /**
         * @param privateIpv4SubnetSize Size of the private IPv4 subnet to create for this metal
         * gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4SubnetSize(Integer privateIpv4SubnetSize) {
            return privateIpv4SubnetSize(Output.of(privateIpv4SubnetSize));
        }

        /**
         * @param projectId UUID of the project where the gateway is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId UUID of the project where the gateway is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param vlanId UUID of the VLAN where the gateway is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId UUID of the VLAN where the gateway is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public GatewayArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.vlanId = Objects.requireNonNull($.vlanId, "expected parameter 'vlanId' to be non-null");
            return $;
        }
    }

}
