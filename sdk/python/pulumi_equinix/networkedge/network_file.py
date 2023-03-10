# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from .. import _enums as _root_enums
from ._enums import *

__all__ = ['NetworkFileArgs', 'NetworkFile']

@pulumi.input_type
class NetworkFileArgs:
    def __init__(__self__, *,
                 byol: pulumi.Input[bool],
                 content: pulumi.Input[str],
                 device_type_code: pulumi.Input[str],
                 file_name: pulumi.Input[str],
                 metro_code: pulumi.Input[Union[str, '_root_enums.Metro']],
                 process_type: pulumi.Input[Union[str, 'FileType']],
                 self_managed: pulumi.Input[bool]):
        """
        The set of arguments for constructing a NetworkFile resource.
        :param pulumi.Input[bool] byol: Boolean value that determines device licensing mode, i.e.,
               `bring your own license` or `subscription`.
        :param pulumi.Input[str] content: Uploaded file content, expected to be a UTF-8 encoded string.
        :param pulumi.Input[str] device_type_code: Device type code
        :param pulumi.Input[str] file_name: File name.
        :param pulumi.Input[Union[str, '_root_enums.Metro']] metro_code: File upload location metro code. It should match the device location metro code.
        :param pulumi.Input[Union[str, 'FileType']] process_type: File process type (LICENSE or CLOUD_INIT).
        :param pulumi.Input[bool] self_managed: Boolean value that determines device management mode, i.e.,
               `self-managed` or `Equinix-managed`.
        """
        pulumi.set(__self__, "byol", byol)
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "device_type_code", device_type_code)
        pulumi.set(__self__, "file_name", file_name)
        pulumi.set(__self__, "metro_code", metro_code)
        pulumi.set(__self__, "process_type", process_type)
        pulumi.set(__self__, "self_managed", self_managed)

    @property
    @pulumi.getter
    def byol(self) -> pulumi.Input[bool]:
        """
        Boolean value that determines device licensing mode, i.e.,
        `bring your own license` or `subscription`.
        """
        return pulumi.get(self, "byol")

    @byol.setter
    def byol(self, value: pulumi.Input[bool]):
        pulumi.set(self, "byol", value)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        Uploaded file content, expected to be a UTF-8 encoded string.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="deviceTypeCode")
    def device_type_code(self) -> pulumi.Input[str]:
        """
        Device type code
        """
        return pulumi.get(self, "device_type_code")

    @device_type_code.setter
    def device_type_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "device_type_code", value)

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> pulumi.Input[str]:
        """
        File name.
        """
        return pulumi.get(self, "file_name")

    @file_name.setter
    def file_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "file_name", value)

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> pulumi.Input[Union[str, '_root_enums.Metro']]:
        """
        File upload location metro code. It should match the device location metro code.
        """
        return pulumi.get(self, "metro_code")

    @metro_code.setter
    def metro_code(self, value: pulumi.Input[Union[str, '_root_enums.Metro']]):
        pulumi.set(self, "metro_code", value)

    @property
    @pulumi.getter(name="processType")
    def process_type(self) -> pulumi.Input[Union[str, 'FileType']]:
        """
        File process type (LICENSE or CLOUD_INIT).
        """
        return pulumi.get(self, "process_type")

    @process_type.setter
    def process_type(self, value: pulumi.Input[Union[str, 'FileType']]):
        pulumi.set(self, "process_type", value)

    @property
    @pulumi.getter(name="selfManaged")
    def self_managed(self) -> pulumi.Input[bool]:
        """
        Boolean value that determines device management mode, i.e.,
        `self-managed` or `Equinix-managed`.
        """
        return pulumi.get(self, "self_managed")

    @self_managed.setter
    def self_managed(self, value: pulumi.Input[bool]):
        pulumi.set(self, "self_managed", value)


@pulumi.input_type
class _NetworkFileState:
    def __init__(__self__, *,
                 byol: Optional[pulumi.Input[bool]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 device_type_code: Optional[pulumi.Input[str]] = None,
                 file_name: Optional[pulumi.Input[str]] = None,
                 metro_code: Optional[pulumi.Input[Union[str, '_root_enums.Metro']]] = None,
                 process_type: Optional[pulumi.Input[Union[str, 'FileType']]] = None,
                 self_managed: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkFile resources.
        :param pulumi.Input[bool] byol: Boolean value that determines device licensing mode, i.e.,
               `bring your own license` or `subscription`.
        :param pulumi.Input[str] content: Uploaded file content, expected to be a UTF-8 encoded string.
        :param pulumi.Input[str] device_type_code: Device type code
        :param pulumi.Input[str] file_name: File name.
        :param pulumi.Input[Union[str, '_root_enums.Metro']] metro_code: File upload location metro code. It should match the device location metro code.
        :param pulumi.Input[Union[str, 'FileType']] process_type: File process type (LICENSE or CLOUD_INIT).
        :param pulumi.Input[bool] self_managed: Boolean value that determines device management mode, i.e.,
               `self-managed` or `Equinix-managed`.
        :param pulumi.Input[str] status: File upload status.
        :param pulumi.Input[str] uuid: Unique identifier of file resource.
        """
        if byol is not None:
            pulumi.set(__self__, "byol", byol)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if device_type_code is not None:
            pulumi.set(__self__, "device_type_code", device_type_code)
        if file_name is not None:
            pulumi.set(__self__, "file_name", file_name)
        if metro_code is not None:
            pulumi.set(__self__, "metro_code", metro_code)
        if process_type is not None:
            pulumi.set(__self__, "process_type", process_type)
        if self_managed is not None:
            pulumi.set(__self__, "self_managed", self_managed)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def byol(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value that determines device licensing mode, i.e.,
        `bring your own license` or `subscription`.
        """
        return pulumi.get(self, "byol")

    @byol.setter
    def byol(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "byol", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        Uploaded file content, expected to be a UTF-8 encoded string.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="deviceTypeCode")
    def device_type_code(self) -> Optional[pulumi.Input[str]]:
        """
        Device type code
        """
        return pulumi.get(self, "device_type_code")

    @device_type_code.setter
    def device_type_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_type_code", value)

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> Optional[pulumi.Input[str]]:
        """
        File name.
        """
        return pulumi.get(self, "file_name")

    @file_name.setter
    def file_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_name", value)

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> Optional[pulumi.Input[Union[str, '_root_enums.Metro']]]:
        """
        File upload location metro code. It should match the device location metro code.
        """
        return pulumi.get(self, "metro_code")

    @metro_code.setter
    def metro_code(self, value: Optional[pulumi.Input[Union[str, '_root_enums.Metro']]]):
        pulumi.set(self, "metro_code", value)

    @property
    @pulumi.getter(name="processType")
    def process_type(self) -> Optional[pulumi.Input[Union[str, 'FileType']]]:
        """
        File process type (LICENSE or CLOUD_INIT).
        """
        return pulumi.get(self, "process_type")

    @process_type.setter
    def process_type(self, value: Optional[pulumi.Input[Union[str, 'FileType']]]):
        pulumi.set(self, "process_type", value)

    @property
    @pulumi.getter(name="selfManaged")
    def self_managed(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value that determines device management mode, i.e.,
        `self-managed` or `Equinix-managed`.
        """
        return pulumi.get(self, "self_managed")

    @self_managed.setter
    def self_managed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "self_managed", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        File upload status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of file resource.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class NetworkFile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 byol: Optional[pulumi.Input[bool]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 device_type_code: Optional[pulumi.Input[str]] = None,
                 file_name: Optional[pulumi.Input[str]] = None,
                 metro_code: Optional[pulumi.Input[Union[str, '_root_enums.Metro']]] = None,
                 process_type: Optional[pulumi.Input[Union[str, 'FileType']]] = None,
                 self_managed: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Resource `networkedge.NetworkFile` allows creation and management of Equinix Network Edge files.

        ## Import

        This resource can be imported using an existing ID

        ```sh
         $ pulumi import equinix:networkedge/networkFile:NetworkFile example {existing_id}
        ```

         The `content`, `self_managed` and `byol` fields can not be imported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] byol: Boolean value that determines device licensing mode, i.e.,
               `bring your own license` or `subscription`.
        :param pulumi.Input[str] content: Uploaded file content, expected to be a UTF-8 encoded string.
        :param pulumi.Input[str] device_type_code: Device type code
        :param pulumi.Input[str] file_name: File name.
        :param pulumi.Input[Union[str, '_root_enums.Metro']] metro_code: File upload location metro code. It should match the device location metro code.
        :param pulumi.Input[Union[str, 'FileType']] process_type: File process type (LICENSE or CLOUD_INIT).
        :param pulumi.Input[bool] self_managed: Boolean value that determines device management mode, i.e.,
               `self-managed` or `Equinix-managed`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkFileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource `networkedge.NetworkFile` allows creation and management of Equinix Network Edge files.

        ## Import

        This resource can be imported using an existing ID

        ```sh
         $ pulumi import equinix:networkedge/networkFile:NetworkFile example {existing_id}
        ```

         The `content`, `self_managed` and `byol` fields can not be imported.

        :param str resource_name: The name of the resource.
        :param NetworkFileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkFileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 byol: Optional[pulumi.Input[bool]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 device_type_code: Optional[pulumi.Input[str]] = None,
                 file_name: Optional[pulumi.Input[str]] = None,
                 metro_code: Optional[pulumi.Input[Union[str, '_root_enums.Metro']]] = None,
                 process_type: Optional[pulumi.Input[Union[str, 'FileType']]] = None,
                 self_managed: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkFileArgs.__new__(NetworkFileArgs)

            if byol is None and not opts.urn:
                raise TypeError("Missing required property 'byol'")
            __props__.__dict__["byol"] = byol
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = None if content is None else pulumi.Output.secret(content)
            if device_type_code is None and not opts.urn:
                raise TypeError("Missing required property 'device_type_code'")
            __props__.__dict__["device_type_code"] = device_type_code
            if file_name is None and not opts.urn:
                raise TypeError("Missing required property 'file_name'")
            __props__.__dict__["file_name"] = file_name
            if metro_code is None and not opts.urn:
                raise TypeError("Missing required property 'metro_code'")
            __props__.__dict__["metro_code"] = metro_code
            if process_type is None and not opts.urn:
                raise TypeError("Missing required property 'process_type'")
            __props__.__dict__["process_type"] = process_type
            if self_managed is None and not opts.urn:
                raise TypeError("Missing required property 'self_managed'")
            __props__.__dict__["self_managed"] = self_managed
            __props__.__dict__["status"] = None
            __props__.__dict__["uuid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["content"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(NetworkFile, __self__).__init__(
            'equinix:networkedge/networkFile:NetworkFile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            byol: Optional[pulumi.Input[bool]] = None,
            content: Optional[pulumi.Input[str]] = None,
            device_type_code: Optional[pulumi.Input[str]] = None,
            file_name: Optional[pulumi.Input[str]] = None,
            metro_code: Optional[pulumi.Input[Union[str, '_root_enums.Metro']]] = None,
            process_type: Optional[pulumi.Input[Union[str, 'FileType']]] = None,
            self_managed: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'NetworkFile':
        """
        Get an existing NetworkFile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] byol: Boolean value that determines device licensing mode, i.e.,
               `bring your own license` or `subscription`.
        :param pulumi.Input[str] content: Uploaded file content, expected to be a UTF-8 encoded string.
        :param pulumi.Input[str] device_type_code: Device type code
        :param pulumi.Input[str] file_name: File name.
        :param pulumi.Input[Union[str, '_root_enums.Metro']] metro_code: File upload location metro code. It should match the device location metro code.
        :param pulumi.Input[Union[str, 'FileType']] process_type: File process type (LICENSE or CLOUD_INIT).
        :param pulumi.Input[bool] self_managed: Boolean value that determines device management mode, i.e.,
               `self-managed` or `Equinix-managed`.
        :param pulumi.Input[str] status: File upload status.
        :param pulumi.Input[str] uuid: Unique identifier of file resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkFileState.__new__(_NetworkFileState)

        __props__.__dict__["byol"] = byol
        __props__.__dict__["content"] = content
        __props__.__dict__["device_type_code"] = device_type_code
        __props__.__dict__["file_name"] = file_name
        __props__.__dict__["metro_code"] = metro_code
        __props__.__dict__["process_type"] = process_type
        __props__.__dict__["self_managed"] = self_managed
        __props__.__dict__["status"] = status
        __props__.__dict__["uuid"] = uuid
        return NetworkFile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def byol(self) -> pulumi.Output[bool]:
        """
        Boolean value that determines device licensing mode, i.e.,
        `bring your own license` or `subscription`.
        """
        return pulumi.get(self, "byol")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        Uploaded file content, expected to be a UTF-8 encoded string.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="deviceTypeCode")
    def device_type_code(self) -> pulumi.Output[str]:
        """
        Device type code
        """
        return pulumi.get(self, "device_type_code")

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> pulumi.Output[str]:
        """
        File name.
        """
        return pulumi.get(self, "file_name")

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> pulumi.Output[str]:
        """
        File upload location metro code. It should match the device location metro code.
        """
        return pulumi.get(self, "metro_code")

    @property
    @pulumi.getter(name="processType")
    def process_type(self) -> pulumi.Output[str]:
        """
        File process type (LICENSE or CLOUD_INIT).
        """
        return pulumi.get(self, "process_type")

    @property
    @pulumi.getter(name="selfManaged")
    def self_managed(self) -> pulumi.Output[bool]:
        """
        Boolean value that determines device management mode, i.e.,
        `self-managed` or `Equinix-managed`.
        """
        return pulumi.get(self, "self_managed")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        File upload status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        Unique identifier of file resource.
        """
        return pulumi.get(self, "uuid")
