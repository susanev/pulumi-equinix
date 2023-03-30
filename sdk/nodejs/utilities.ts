// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export function getEnv(...vars: string[]): string | undefined {
    for (const v of vars) {
        const value = process.env[v];
        if (value) {
            return value;
        }
    }
    return undefined;
}

export function getEnvBoolean(...vars: string[]): boolean | undefined {
    const s = getEnv(...vars);
    if (s !== undefined) {
        // NOTE: these values are taken from https://golang.org/src/strconv/atob.go?s=351:391#L1, which is what
        // Terraform uses internally when parsing boolean values.
        if (["1", "t", "T", "true", "TRUE", "True"].find(v => v === s) !== undefined) {
            return true;
        }
        if (["0", "f", "F", "false", "FALSE", "False"].find(v => v === s) !== undefined) {
            return false;
        }
    }
    return undefined;
}

export function getEnvNumber(...vars: string[]): number | undefined {
    const s = getEnv(...vars);
    if (s !== undefined) {
        const f = parseFloat(s);
        if (!isNaN(f)) {
            return f;
        }
    }
    return undefined;
}

export function getVersion(): string {
    let version = require('./package.json').version;
    // Node allows for the version to be prefixed by a "v", while semver doesn't.
    // If there is a v, strip it off.
    if (version.indexOf('v') === 0) {
        version = version.slice(1);
    }
    return version;
}

/** @internal */
export function resourceOptsDefaults(): any {
    return { version: getVersion(), pluginDownloadURL: "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1680197579+b252741a.dirty" };
}

/** @internal */
export function lazyLoad(exports: any, props: string[], loadModule: any) {
    for (let property of props) {
        Object.defineProperty(exports, property, {
            enumerable: true,
            get: function() {
                return loadModule()[property];
            },
        });
    }
}
