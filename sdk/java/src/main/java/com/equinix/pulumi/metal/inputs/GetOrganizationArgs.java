// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    /**
     * The organization name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The organization name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The UUID of the organization resource.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The UUID of the organization resource.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetOrganizationArgs() {}

    private GetOrganizationArgs(GetOrganizationArgs $) {
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationArgs $;

        public Builder() {
            $ = new GetOrganizationArgs();
        }

        public Builder(GetOrganizationArgs defaults) {
            $ = new GetOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The organization name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The organization name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The UUID of the organization resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The UUID of the organization resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetOrganizationArgs build() {
            return $;
        }
    }

}
