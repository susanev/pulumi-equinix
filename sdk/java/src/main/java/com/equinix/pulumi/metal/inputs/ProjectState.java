// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.equinix.pulumi.metal.inputs.ProjectBgpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
     * 
     */
    @Import(name="backendTransfer")
    private @Nullable Output<Boolean> backendTransfer;

    /**
     * @return Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
     * 
     */
    public Optional<Output<Boolean>> backendTransfer() {
        return Optional.ofNullable(this.backendTransfer);
    }

    /**
     * Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
     * 
     */
    @Import(name="bgpConfig")
    private @Nullable Output<ProjectBgpConfigArgs> bgpConfig;

    /**
     * @return Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
     * 
     */
    public Optional<Output<ProjectBgpConfigArgs>> bgpConfig() {
        return Optional.ofNullable(this.bgpConfig);
    }

    /**
     * The timestamp for when the project was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The timestamp for when the project was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The name of the project.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the project.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The UUID of organization under which you want to create the project. If you
     * leave it out, the project will be create under your the default organization of your account.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The UUID of organization under which you want to create the project. If you
     * leave it out, the project will be create under your the default organization of your account.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The UUID of payment method for this project. The payment method and the
     * project need to belong to the same organization (passed with `organization_id`, or default).
     * 
     */
    @Import(name="paymentMethodId")
    private @Nullable Output<String> paymentMethodId;

    /**
     * @return The UUID of payment method for this project. The payment method and the
     * project need to belong to the same organization (passed with `organization_id`, or default).
     * 
     */
    public Optional<Output<String>> paymentMethodId() {
        return Optional.ofNullable(this.paymentMethodId);
    }

    /**
     * The timestamp for the last time the project was updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return The timestamp for the last time the project was updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    private ProjectState() {}

    private ProjectState(ProjectState $) {
        this.backendTransfer = $.backendTransfer;
        this.bgpConfig = $.bgpConfig;
        this.created = $.created;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.paymentMethodId = $.paymentMethodId;
        this.updated = $.updated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectState $;

        public Builder() {
            $ = new ProjectState();
        }

        public Builder(ProjectState defaults) {
            $ = new ProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendTransfer Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder backendTransfer(@Nullable Output<Boolean> backendTransfer) {
            $.backendTransfer = backendTransfer;
            return this;
        }

        /**
         * @param backendTransfer Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder backendTransfer(Boolean backendTransfer) {
            return backendTransfer(Output.of(backendTransfer));
        }

        /**
         * @param bgpConfig Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
         * 
         * @return builder
         * 
         */
        public Builder bgpConfig(@Nullable Output<ProjectBgpConfigArgs> bgpConfig) {
            $.bgpConfig = bgpConfig;
            return this;
        }

        /**
         * @param bgpConfig Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
         * 
         * @return builder
         * 
         */
        public Builder bgpConfig(ProjectBgpConfigArgs bgpConfig) {
            return bgpConfig(Output.of(bgpConfig));
        }

        /**
         * @param created The timestamp for when the project was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The timestamp for when the project was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param name The name of the project.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The UUID of organization under which you want to create the project. If you
         * leave it out, the project will be create under your the default organization of your account.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The UUID of organization under which you want to create the project. If you
         * leave it out, the project will be create under your the default organization of your account.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param paymentMethodId The UUID of payment method for this project. The payment method and the
         * project need to belong to the same organization (passed with `organization_id`, or default).
         * 
         * @return builder
         * 
         */
        public Builder paymentMethodId(@Nullable Output<String> paymentMethodId) {
            $.paymentMethodId = paymentMethodId;
            return this;
        }

        /**
         * @param paymentMethodId The UUID of payment method for this project. The payment method and the
         * project need to belong to the same organization (passed with `organization_id`, or default).
         * 
         * @return builder
         * 
         */
        public Builder paymentMethodId(String paymentMethodId) {
            return paymentMethodId(Output.of(paymentMethodId));
        }

        /**
         * @param updated The timestamp for the last time the project was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated The timestamp for the last time the project was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        public ProjectState build() {
            return $;
        }
    }

}
