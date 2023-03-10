// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileVirtualDeviceLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileVirtualDeviceLocationArgs Empty = new ServiceProfileVirtualDeviceLocationArgs();

    @Import(name="ibx")
    private @Nullable Output<String> ibx;

    public Optional<Output<String>> ibx() {
        return Optional.ofNullable(this.ibx);
    }

    @Import(name="metroCode")
    private @Nullable Output<String> metroCode;

    public Optional<Output<String>> metroCode() {
        return Optional.ofNullable(this.metroCode);
    }

    @Import(name="metroName")
    private @Nullable Output<String> metroName;

    public Optional<Output<String>> metroName() {
        return Optional.ofNullable(this.metroName);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ServiceProfileVirtualDeviceLocationArgs() {}

    private ServiceProfileVirtualDeviceLocationArgs(ServiceProfileVirtualDeviceLocationArgs $) {
        this.ibx = $.ibx;
        this.metroCode = $.metroCode;
        this.metroName = $.metroName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileVirtualDeviceLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileVirtualDeviceLocationArgs $;

        public Builder() {
            $ = new ServiceProfileVirtualDeviceLocationArgs();
        }

        public Builder(ServiceProfileVirtualDeviceLocationArgs defaults) {
            $ = new ServiceProfileVirtualDeviceLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder ibx(@Nullable Output<String> ibx) {
            $.ibx = ibx;
            return this;
        }

        public Builder ibx(String ibx) {
            return ibx(Output.of(ibx));
        }

        public Builder metroCode(@Nullable Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        public Builder metroName(@Nullable Output<String> metroName) {
            $.metroName = metroName;
            return this;
        }

        public Builder metroName(String metroName) {
            return metroName(Output.of(metroName));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ServiceProfileVirtualDeviceLocationArgs build() {
            return $;
        }
    }

}