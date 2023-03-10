// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortRedundancyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionASideAccessPointPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionASideAccessPointPortArgs Empty = new ConnectionASideAccessPointPortArgs();

    /**
     * Connection URI information
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Connection URI information
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Redundancy Information
     * 
     */
    @Import(name="redundancies")
    private @Nullable Output<List<ConnectionASideAccessPointPortRedundancyArgs>> redundancies;

    /**
     * @return Redundancy Information
     * 
     */
    public Optional<Output<List<ConnectionASideAccessPointPortRedundancyArgs>>> redundancies() {
        return Optional.ofNullable(this.redundancies);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private ConnectionASideAccessPointPortArgs() {}

    private ConnectionASideAccessPointPortArgs(ConnectionASideAccessPointPortArgs $) {
        this.href = $.href;
        this.name = $.name;
        this.redundancies = $.redundancies;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionASideAccessPointPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionASideAccessPointPortArgs $;

        public Builder() {
            $ = new ConnectionASideAccessPointPortArgs();
        }

        public Builder(ConnectionASideAccessPointPortArgs defaults) {
            $ = new ConnectionASideAccessPointPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(@Nullable Output<List<ConnectionASideAccessPointPortRedundancyArgs>> redundancies) {
            $.redundancies = redundancies;
            return this;
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(List<ConnectionASideAccessPointPortRedundancyArgs> redundancies) {
            return redundancies(Output.of(redundancies));
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(ConnectionASideAccessPointPortRedundancyArgs... redundancies) {
            return redundancies(List.of(redundancies));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ConnectionASideAccessPointPortArgs build() {
            return $;
        }
    }

}