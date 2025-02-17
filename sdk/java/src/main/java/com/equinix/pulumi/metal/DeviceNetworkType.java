// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.DeviceNetworkTypeArgs;
import com.equinix.pulumi.metal.inputs.DeviceNetworkTypeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.equinix.pulumi.metal.DeviceNetworkType;
 * import com.equinix.pulumi.metal.DeviceNetworkTypeArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var deviceId = config.get(&#34;deviceId&#34;).get();
 *         final var networkType = config.get(&#34;networkType&#34;).orElse(&#34;hybrid&#34;);
 *         var deviceNetwork = new DeviceNetworkType(&#34;deviceNetwork&#34;, DeviceNetworkTypeArgs.builder()        
 *             .deviceId(deviceId)
 *             .type(networkType)
 *             .build());
 * 
 *         ctx.export(&#34;deviceNetworkId&#34;, deviceNetwork.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can also be imported using existing device ID: &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
 * 
 */
@ResourceType(type="equinix:metal/deviceNetworkType:DeviceNetworkType")
public class DeviceNetworkType extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the device on which the network type should be set.
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return The ID of the device on which the network type should be set.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
     * and `layer2-bonded`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
     * and `layer2-bonded`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceNetworkType(String name) {
        this(name, DeviceNetworkTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceNetworkType(String name, DeviceNetworkTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceNetworkType(String name, DeviceNetworkTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/deviceNetworkType:DeviceNetworkType", name, args == null ? DeviceNetworkTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceNetworkType(String name, Output<String> id, @Nullable DeviceNetworkTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/deviceNetworkType:DeviceNetworkType", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DeviceNetworkType get(String name, Output<String> id, @Nullable DeviceNetworkTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceNetworkType(name, id, state, options);
    }
}
