// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanPlainArgs Empty = new GetVlanPlainArgs();

    /**
     * Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Import(name="facility")
    private @Nullable String facility;

    /**
     * @return Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public Optional<String> facility() {
        return Optional.ofNullable(this.facility);
    }

    /**
     * Metro where the VLAN is deployed.
     * 
     */
    @Import(name="metro")
    private @Nullable String metro;

    /**
     * @return Metro where the VLAN is deployed.
     * 
     */
    public Optional<String> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Metal UUID of the VLAN resource to look up.
     * 
     */
    @Import(name="vlanId")
    private @Nullable String vlanId;

    /**
     * @return Metal UUID of the VLAN resource to look up.
     * 
     */
    public Optional<String> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    /**
     * vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
     * 
     */
    @Import(name="vxlan")
    private @Nullable Integer vxlan;

    /**
     * @return vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
     * 
     */
    public Optional<Integer> vxlan() {
        return Optional.ofNullable(this.vxlan);
    }

    private GetVlanPlainArgs() {}

    private GetVlanPlainArgs(GetVlanPlainArgs $) {
        this.facility = $.facility;
        this.metro = $.metro;
        this.projectId = $.projectId;
        this.vlanId = $.vlanId;
        this.vxlan = $.vxlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanPlainArgs $;

        public Builder() {
            $ = new GetVlanPlainArgs();
        }

        public Builder(GetVlanPlainArgs defaults) {
            $ = new GetVlanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facility Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facility(@Nullable String facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param metro Metro where the VLAN is deployed.
         * 
         * @return builder
         * 
         */
        public Builder metro(@Nullable String metro) {
            $.metro = metro;
            return this;
        }

        /**
         * @param projectId UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param vlanId Metal UUID of the VLAN resource to look up.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable String vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vxlan vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
         * 
         * @return builder
         * 
         */
        public Builder vxlan(@Nullable Integer vxlan) {
            $.vxlan = vxlan;
            return this;
        }

        public GetVlanPlainArgs build() {
            return $;
        }
    }

}
