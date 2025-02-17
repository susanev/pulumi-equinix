// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.networkedge.inputs.GetAccountPlainArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceArgs;
import com.equinix.pulumi.networkedge.inputs.GetDevicePlainArgs;
import com.equinix.pulumi.networkedge.inputs.GetDevicePlatformArgs;
import com.equinix.pulumi.networkedge.inputs.GetDevicePlatformPlainArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceSoftwareArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceSoftwarePlainArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceTypeArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceTypePlainArgs;
import com.equinix.pulumi.networkedge.outputs.GetAccountResult;
import com.equinix.pulumi.networkedge.outputs.GetDevicePlatformResult;
import com.equinix.pulumi.networkedge.outputs.GetDeviceResult;
import com.equinix.pulumi.networkedge.outputs.GetDeviceSoftwareResult;
import com.equinix.pulumi.networkedge.outputs.GetDeviceTypeResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NetworkedgeFunctions {
    /**
     * Use this data source to get number and identifier of Equinix Network Edge
     * billing account in a given metro location.
     * 
     * Billing account reference is required to create Network Edge virtual device
     * in corresponding metro location.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
     *             .metroCode(&#34;DC&#34;)
     *             .status(&#34;Active&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;number&#34;, dc.applyValue(getAccountResult -&gt; getAccountResult.number()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get number and identifier of Equinix Network Edge
     * billing account in a given metro location.
     * 
     * Billing account reference is required to create Network Edge virtual device
     * in corresponding metro location.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
     *             .metroCode(&#34;DC&#34;)
     *             .status(&#34;Active&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;number&#34;, dc.applyValue(getAccountResult -&gt; getAccountResult.number()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get number and identifier of Equinix Network Edge
     * billing account in a given metro location.
     * 
     * Billing account reference is required to create Network Edge virtual device
     * in corresponding metro location.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
     *             .metroCode(&#34;DC&#34;)
     *             .status(&#34;Active&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;number&#34;, dc.applyValue(getAccountResult -&gt; getAccountResult.number()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("equinix:networkedge/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get number and identifier of Equinix Network Edge
     * billing account in a given metro location.
     * 
     * Billing account reference is required to create Network Edge virtual device
     * in corresponding metro location.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
     *             .metroCode(&#34;DC&#34;)
     *             .status(&#34;Active&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;number&#34;, dc.applyValue(getAccountResult -&gt; getAccountResult.number()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("equinix:networkedge/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceResult> getDevice() {
        return getDevice(GetDeviceArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevicePlain() {
        return getDevicePlain(GetDevicePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceResult> getDevice(GetDeviceArgs args) {
        return getDevice(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevicePlain(GetDevicePlainArgs args) {
        return getDevicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceResult> getDevice(GetDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("equinix:networkedge/getDevice:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device details.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byUuid = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .uuid(&#34;f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee&#34;)
     *             .build());
     * 
     *         final var byName = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
     *             .name(&#34;Arcus-Gateway-A1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevicePlain(GetDevicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("equinix:networkedge/getDevice:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device platform configuration details
     * for a given device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDevicePlatformArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLarge = NetworkedgeFunctions.getDevicePlatform(GetDevicePlatformArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .flavor(&#34;large&#34;)
     *             .packages(&#34;IPBASE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDevicePlatformResult> getDevicePlatform(GetDevicePlatformArgs args) {
        return getDevicePlatform(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device platform configuration details
     * for a given device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDevicePlatformArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLarge = NetworkedgeFunctions.getDevicePlatform(GetDevicePlatformArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .flavor(&#34;large&#34;)
     *             .packages(&#34;IPBASE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDevicePlatformResult> getDevicePlatformPlain(GetDevicePlatformPlainArgs args) {
        return getDevicePlatformPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device platform configuration details
     * for a given device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDevicePlatformArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLarge = NetworkedgeFunctions.getDevicePlatform(GetDevicePlatformArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .flavor(&#34;large&#34;)
     *             .packages(&#34;IPBASE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDevicePlatformResult> getDevicePlatform(GetDevicePlatformArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("equinix:networkedge/getDevicePlatform:getDevicePlatform", TypeShape.of(GetDevicePlatformResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device platform configuration details
     * for a given device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDevicePlatformArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLarge = NetworkedgeFunctions.getDevicePlatform(GetDevicePlatformArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .flavor(&#34;large&#34;)
     *             .packages(&#34;IPBASE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDevicePlatformResult> getDevicePlatformPlain(GetDevicePlatformPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("equinix:networkedge/getDevicePlatform:getDevicePlatform", TypeShape.of(GetDevicePlatformResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device software details for a given
     * device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceSoftwareArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLatest1609 = NetworkedgeFunctions.getDeviceSoftware(GetDeviceSoftwareArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .mostRecent(true)
     *             .packages(&#34;IPBASE&#34;)
     *             .versionRegex(&#34;^16.09.+&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceSoftwareResult> getDeviceSoftware(GetDeviceSoftwareArgs args) {
        return getDeviceSoftware(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device software details for a given
     * device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceSoftwareArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLatest1609 = NetworkedgeFunctions.getDeviceSoftware(GetDeviceSoftwareArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .mostRecent(true)
     *             .packages(&#34;IPBASE&#34;)
     *             .versionRegex(&#34;^16.09.+&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceSoftwareResult> getDeviceSoftwarePlain(GetDeviceSoftwarePlainArgs args) {
        return getDeviceSoftwarePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device software details for a given
     * device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceSoftwareArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLatest1609 = NetworkedgeFunctions.getDeviceSoftware(GetDeviceSoftwareArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .mostRecent(true)
     *             .packages(&#34;IPBASE&#34;)
     *             .versionRegex(&#34;^16.09.+&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceSoftwareResult> getDeviceSoftware(GetDeviceSoftwareArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("equinix:networkedge/getDeviceSoftware:getDeviceSoftware", TypeShape.of(GetDeviceSoftwareResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device software details for a given
     * device type. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceSoftwareArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var csrLatest1609 = NetworkedgeFunctions.getDeviceSoftware(GetDeviceSoftwareArgs.builder()
     *             .deviceType(&#34;CSR1000V&#34;)
     *             .mostRecent(true)
     *             .packages(&#34;IPBASE&#34;)
     *             .versionRegex(&#34;^16.09.+&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceSoftwareResult> getDeviceSoftwarePlain(GetDeviceSoftwarePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("equinix:networkedge/getDeviceSoftware:getDeviceSoftware", TypeShape.of(GetDeviceSoftwareResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceTypeResult> getDeviceType() {
        return getDeviceType(GetDeviceTypeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceTypeResult> getDeviceTypePlain() {
        return getDeviceTypePlain(GetDeviceTypePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceTypeResult> getDeviceType(GetDeviceTypeArgs args) {
        return getDeviceType(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceTypeResult> getDeviceTypePlain(GetDeviceTypePlainArgs args) {
        return getDeviceTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDeviceTypeResult> getDeviceType(GetDeviceTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("equinix:networkedge/getDeviceType:getDeviceType", TypeShape.of(GetDeviceTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get Equinix Network Edge device type details. For further details, check supported
     * [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
     * import com.pulumi.equinix.networkedge.inputs.GetDeviceTypeArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ciscoRouter = NetworkedgeFunctions.getDeviceType(GetDeviceTypeArgs.builder()
     *             .category(&#34;Router&#34;)
     *             .metroCodes(            
     *                 &#34;DC&#34;,
     *                 &#34;SV&#34;)
     *             .vendor(&#34;Cisco&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDeviceTypeResult> getDeviceTypePlain(GetDeviceTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("equinix:networkedge/getDeviceType:getDeviceType", TypeShape.of(GetDeviceTypeResult.class), args, Utilities.withVersion(options));
    }
}
