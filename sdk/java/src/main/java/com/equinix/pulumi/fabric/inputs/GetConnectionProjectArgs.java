// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetConnectionProjectArgs Empty = new GetConnectionProjectArgs();

    /**
     * Unique Resource URL
     * 
     */
    @Import(name="href", required=true)
    private Output<String> href;

    /**
     * @return Unique Resource URL
     * 
     */
    public Output<String> href() {
        return this.href;
    }

    /**
     * Project Id
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Project Id
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetConnectionProjectArgs() {}

    private GetConnectionProjectArgs(GetConnectionProjectArgs $) {
        this.href = $.href;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionProjectArgs $;

        public Builder() {
            $ = new GetConnectionProjectArgs();
        }

        public Builder(GetConnectionProjectArgs defaults) {
            $ = new GetConnectionProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param href Unique Resource URL
         * 
         * @return builder
         * 
         */
        public Builder href(Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Unique Resource URL
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param projectId Project Id
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Id
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetConnectionProjectArgs build() {
            $.href = Objects.requireNonNull($.href, "expected parameter 'href' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
