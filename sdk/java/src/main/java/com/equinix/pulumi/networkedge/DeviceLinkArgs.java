// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge;

import com.equinix.pulumi.networkedge.inputs.DeviceLinkDeviceArgs;
import com.equinix.pulumi.networkedge.inputs.DeviceLinkLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceLinkArgs Empty = new DeviceLinkArgs();

    /**
     * definition of one or more devices belonging to the
     * device link. See Device section below for more details.
     * 
     */
    @Import(name="devices", required=true)
    private Output<List<DeviceLinkDeviceArgs>> devices;

    /**
     * @return definition of one or more devices belonging to the
     * device link. See Device section below for more details.
     * 
     */
    public Output<List<DeviceLinkDeviceArgs>> devices() {
        return this.devices;
    }

    /**
     * definition of one or more, inter metro, connections belonging
     * to the device link. See Link section below for more details.
     * 
     */
    @Import(name="links")
    private @Nullable Output<List<DeviceLinkLinkArgs>> links;

    /**
     * @return definition of one or more, inter metro, connections belonging
     * to the device link. See Link section below for more details.
     * 
     */
    public Optional<Output<List<DeviceLinkLinkArgs>>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * device link name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return device link name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * device link subnet in CIDR format. Not required for link
     * between self configured devices.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return device link subnet in CIDR format. Not required for link
     * between self configured devices.
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private DeviceLinkArgs() {}

    private DeviceLinkArgs(DeviceLinkArgs $) {
        this.devices = $.devices;
        this.links = $.links;
        this.name = $.name;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceLinkArgs $;

        public Builder() {
            $ = new DeviceLinkArgs();
        }

        public Builder(DeviceLinkArgs defaults) {
            $ = new DeviceLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(Output<List<DeviceLinkDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(List<DeviceLinkDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(DeviceLinkDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(@Nullable Output<List<DeviceLinkLinkArgs>> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(List<DeviceLinkLinkArgs> links) {
            return links(Output.of(links));
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(DeviceLinkLinkArgs... links) {
            return links(List.of(links));
        }

        /**
         * @param name device link name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name device link name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subnet device link subnet in CIDR format. Not required for link
         * between self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet device link subnet in CIDR format. Not required for link
         * between self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public DeviceLinkArgs build() {
            $.devices = Objects.requireNonNull($.devices, "expected parameter 'devices' to be non-null");
            return $;
        }
    }

}
