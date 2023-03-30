// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.ConnectionArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionState;
import com.equinix.pulumi.fabric.outputs.ConnectionASide;
import com.equinix.pulumi.fabric.outputs.ConnectionAccount;
import com.equinix.pulumi.fabric.outputs.ConnectionAdditionalInfo;
import com.equinix.pulumi.fabric.outputs.ConnectionChangeLog;
import com.equinix.pulumi.fabric.outputs.ConnectionNotification;
import com.equinix.pulumi.fabric.outputs.ConnectionOperation;
import com.equinix.pulumi.fabric.outputs.ConnectionOrder;
import com.equinix.pulumi.fabric.outputs.ConnectionProject;
import com.equinix.pulumi.fabric.outputs.ConnectionRedundancy;
import com.equinix.pulumi.fabric.outputs.ConnectionZSide;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.equinix.pulumi.fabric.Connection;
 * import com.equinix.pulumi.fabric.ConnectionArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionNotificationArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionRedundancyArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionASideArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointPortArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionZSideArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
 * import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
 * import com.equinix.pulumi.fabric.inputs.GetServiceProfilesArgs;
 * import com.equinix.pulumi.fabric.inputs.GetServiceProfilesFilterArgs;
 * import com.equinix.pulumi.fabric.inputs.GetPortsArgs;
 * import com.equinix.pulumi.fabric.inputs.GetPortsFilterArgs;
 * import com.equinix.pulumi.fabric.FabricFunctions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var metro = config.get(&#34;metro&#34;).orElse(&#34;FR&#34;);
 *         final var speedInMbps = Integer.parseInt(config.get(&#34;speedInMbps&#34;).orElse(&#34;50&#34;));
 *         final var fabricPortName = config.get(&#34;fabricPortName&#34;).get().toString();
 *         final var awsRegion = config.get(&#34;awsRegion&#34;).orElse(&#34;eu-central-1&#34;);
 *         final var awsAccountId = config.get(&#34;awsAccountId&#34;).get().toString();
 *         System.out.println(System.getProperty(&#34;java.classpath&#34;));
 *         final var serviceProfileId = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
 *             .filter(GetServiceProfilesFilterArgs.builder()
 *                 .property(&#34;/name&#34;)
 *                 .operator(&#34;=&#34;)
 *                 .values(&#34;AWS Direct Connect&#34;)
 *                 .build())
 *             .build()).applyValue(data -&gt; data.data().get(0).uuid().get());
 * 
 *         final var portId = FabricFunctions.getPorts(GetPortsArgs.builder()
 *             .filter(GetPortsFilterArgs.builder()
 *                 .name(fabricPortName)
 *                 .build())
 *             .build()).applyValue(data -&gt; data.data().get(0).uuid().get());
 * 
 *         var colo2Aws = new Connection(&#34;colo2Aws&#34;, ConnectionArgs.builder()        
 *             .name(&#34;Pulumi-colo2Aws&#34;)
 *             .type(&#34;EVPL_VC&#34;)
 *             .notifications(ConnectionNotificationArgs.builder()
 *                 .type(&#34;ALL&#34;)
 *                 .emails(&#34;example@equinix.com&#34;)
 *                 .build())
 *             .bandwidth(speedInMbps)
 *             .redundancy(ConnectionRedundancyArgs.builder()
 *                 .priority(&#34;PRIMARY&#34;)
 *                 .build())
 *             .aSide(ConnectionASideArgs.builder()
 *                 .accessPoint(ConnectionASideAccessPointArgs.builder()
 *                     .type(&#34;COLO&#34;)
 *                     .port(ConnectionASideAccessPointPortArgs.builder()
 *                         .uuid(portId)
 *                         .build())
 *                     .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
 *                         .type(&#34;DOT1Q&#34;)
 *                         .vlanTag(1234)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .zSide(ConnectionZSideArgs.builder()
 *                 .accessPoint(ConnectionZSideAccessPointArgs.builder()
 *                     .type(&#34;SP&#34;)
 *                     .authenticationKey(awsAccountId)
 *                     .sellerRegion(awsRegion)
 *                     .profile(ConnectionZSideAccessPointProfileArgs.builder()
 *                         .type(&#34;L2_PROFILE&#34;)
 *                         .uuid(serviceProfileId)
 *                         .build())
 *                     .location(ConnectionZSideAccessPointLocationArgs.builder()
 *                         .metroCode(metro)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;connectionId&#34;, colo2Aws.id());
 *         ctx.export(&#34;connectionStatus&#34;, colo2Aws.operation().applyValue(operation -&gt; operation.equinixStatus()));
 *         ctx.export(&#34;connectionProviderStatus&#34;, colo2Aws.operation().applyValue(operation -&gt; operation.providerStatus()));
 *         ctx.export(&#34;awsDirectConnectId&#34;, colo2Aws.zSide().applyValue(zSide -&gt; zSide.accessPoint().get().providerConnectionId()));
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:fabric/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    @Export(name="aSide", refs={ConnectionASide.class}, tree="[0]")
    private Output<ConnectionASide> aSide;

    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    public Output<ConnectionASide> aSide() {
        return this.aSide;
    }
    /**
     * Customer account information that is associated with this connection
     * 
     */
    @Export(name="account", refs={ConnectionAccount.class}, tree="[0]")
    private Output<ConnectionAccount> account;

    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public Output<ConnectionAccount> account() {
        return this.account;
    }
    /**
     * Connection additional information
     * 
     */
    @Export(name="additionalInfo", refs={List.class,ConnectionAdditionalInfo.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConnectionAdditionalInfo>> additionalInfo;

    /**
     * @return Connection additional information
     * 
     */
    public Output<Optional<List<ConnectionAdditionalInfo>>> additionalInfo() {
        return Codegen.optional(this.additionalInfo);
    }
    /**
     * Connection bandwidth in Mbps
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * Captures connection lifecycle change information
     * 
     */
    @Export(name="changeLog", refs={ConnectionChangeLog.class}, tree="[0]")
    private Output<ConnectionChangeLog> changeLog;

    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public Output<ConnectionChangeLog> changeLog() {
        return this.changeLog;
    }
    /**
     * Connection directionality from the requester point of view
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output<String> direction;

    /**
     * @return Connection directionality from the requester point of view
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * Connection URI information
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Connection URI information
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Connection property derived from access point locations
     * 
     */
    @Export(name="isRemote", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isRemote;

    /**
     * @return Connection property derived from access point locations
     * 
     */
    public Output<Boolean> isRemote() {
        return this.isRemote;
    }
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferences for notifications on connection configuration or status changes
     * 
     */
    @Export(name="notifications", refs={List.class,ConnectionNotification.class}, tree="[0,1]")
    private Output<List<ConnectionNotification>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Output<List<ConnectionNotification>> notifications() {
        return this.notifications;
    }
    /**
     * Connection type-specific operational data
     * 
     */
    @Export(name="operation", refs={ConnectionOperation.class}, tree="[0]")
    private Output<ConnectionOperation> operation;

    /**
     * @return Connection type-specific operational data
     * 
     */
    public Output<ConnectionOperation> operation() {
        return this.operation;
    }
    /**
     * Order related to this connection information
     * 
     */
    @Export(name="order", refs={ConnectionOrder.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionOrder> order;

    /**
     * @return Order related to this connection information
     * 
     */
    public Output<Optional<ConnectionOrder>> order() {
        return Codegen.optional(this.order);
    }
    /**
     * Project information
     * 
     */
    @Export(name="project", refs={ConnectionProject.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionProject> project;

    /**
     * @return Project information
     * 
     */
    public Output<Optional<ConnectionProject>> project() {
        return Codegen.optional(this.project);
    }
    /**
     * Redundancy Information
     * 
     */
    @Export(name="redundancy", refs={ConnectionRedundancy.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionRedundancy> redundancy;

    /**
     * @return Redundancy Information
     * 
     */
    public Output<Optional<ConnectionRedundancy>> redundancy() {
        return Codegen.optional(this.redundancy);
    }
    /**
     * Connection overall state
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Connection overall state
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    @Export(name="zSide", refs={ConnectionZSide.class}, tree="[0]")
    private Output<ConnectionZSide> zSide;

    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    public Output<ConnectionZSide> zSide() {
        return this.zSide;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
