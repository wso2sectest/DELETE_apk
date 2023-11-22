//  Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
//
//  WSO2 LLC. licenses this file to you under the Apache License,
//  Version 2.0 (the "License"); you may not use this file except
//  in compliance with the License.
//  You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing,
//  software distributed under the License is distributed on an
//  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//  KIND, either express or implied.  See the License for the
//  specific language governing permissions and limitations
//  under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.13.0
// source: wso2/discovery/api/BackendJWTTokenInfo.proto

package api

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Endpoint config model
type BackendJWTTokenInfo struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Enabled          bool              `protobuf:"varint,1,opt,name=enabled,proto3" json:"enabled,omitempty"`
	Encoding         string            `protobuf:"bytes,2,opt,name=encoding,proto3" json:"encoding,omitempty"`
	Header           string            `protobuf:"bytes,3,opt,name=header,proto3" json:"header,omitempty"`
	SigningAlgorithm string            `protobuf:"bytes,4,opt,name=signingAlgorithm,proto3" json:"signingAlgorithm,omitempty"`
	CustomClaims     map[string]*Claim `protobuf:"bytes,5,rep,name=customClaims,proto3" json:"customClaims,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	TokenTTL         int32             `protobuf:"varint,6,opt,name=tokenTTL,proto3" json:"tokenTTL,omitempty"`
}

func (x *BackendJWTTokenInfo) Reset() {
	*x = BackendJWTTokenInfo{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BackendJWTTokenInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BackendJWTTokenInfo) ProtoMessage() {}

func (x *BackendJWTTokenInfo) ProtoReflect() protoreflect.Message {
	mi := &file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BackendJWTTokenInfo.ProtoReflect.Descriptor instead.
func (*BackendJWTTokenInfo) Descriptor() ([]byte, []int) {
	return file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescGZIP(), []int{0}
}

func (x *BackendJWTTokenInfo) GetEnabled() bool {
	if x != nil {
		return x.Enabled
	}
	return false
}

func (x *BackendJWTTokenInfo) GetEncoding() string {
	if x != nil {
		return x.Encoding
	}
	return ""
}

func (x *BackendJWTTokenInfo) GetHeader() string {
	if x != nil {
		return x.Header
	}
	return ""
}

func (x *BackendJWTTokenInfo) GetSigningAlgorithm() string {
	if x != nil {
		return x.SigningAlgorithm
	}
	return ""
}

func (x *BackendJWTTokenInfo) GetCustomClaims() map[string]*Claim {
	if x != nil {
		return x.CustomClaims
	}
	return nil
}

func (x *BackendJWTTokenInfo) GetTokenTTL() int32 {
	if x != nil {
		return x.TokenTTL
	}
	return 0
}

type Claim struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Value string `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	Type  string `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
}

func (x *Claim) Reset() {
	*x = Claim{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Claim) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Claim) ProtoMessage() {}

func (x *Claim) ProtoReflect() protoreflect.Message {
	mi := &file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Claim.ProtoReflect.Descriptor instead.
func (*Claim) Descriptor() ([]byte, []int) {
	return file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescGZIP(), []int{1}
}

func (x *Claim) GetValue() string {
	if x != nil {
		return x.Value
	}
	return ""
}

func (x *Claim) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

var File_wso2_discovery_api_BackendJWTTokenInfo_proto protoreflect.FileDescriptor

var file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDesc = []byte{
	0x0a, 0x2c, 0x77, 0x73, 0x6f, 0x32, 0x2f, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79,
	0x2f, 0x61, 0x70, 0x69, 0x2f, 0x42, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x4a, 0x57, 0x54, 0x54,
	0x6f, 0x6b, 0x65, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x12,
	0x77, 0x73, 0x6f, 0x32, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x61,
	0x70, 0x69, 0x22, 0xe6, 0x02, 0x0a, 0x13, 0x42, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x4a, 0x57,
	0x54, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x18, 0x0a, 0x07, 0x65, 0x6e,
	0x61, 0x62, 0x6c, 0x65, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x65, 0x6e, 0x61,
	0x62, 0x6c, 0x65, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67,
	0x12, 0x16, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x2a, 0x0a, 0x10, 0x73, 0x69, 0x67, 0x6e,
	0x69, 0x6e, 0x67, 0x41, 0x6c, 0x67, 0x6f, 0x72, 0x69, 0x74, 0x68, 0x6d, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x10, 0x73, 0x69, 0x67, 0x6e, 0x69, 0x6e, 0x67, 0x41, 0x6c, 0x67, 0x6f, 0x72,
	0x69, 0x74, 0x68, 0x6d, 0x12, 0x5d, 0x0a, 0x0c, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x43, 0x6c,
	0x61, 0x69, 0x6d, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x39, 0x2e, 0x77, 0x73, 0x6f,
	0x32, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x61, 0x70, 0x69, 0x2e,
	0x42, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x4a, 0x57, 0x54, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x49,
	0x6e, 0x66, 0x6f, 0x2e, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x43, 0x6c, 0x61, 0x69, 0x6d, 0x73,
	0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x0c, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x43, 0x6c, 0x61,
	0x69, 0x6d, 0x73, 0x12, 0x1a, 0x0a, 0x08, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x54, 0x54, 0x4c, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x05, 0x52, 0x08, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x54, 0x54, 0x4c, 0x1a,
	0x5a, 0x0a, 0x11, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x43, 0x6c, 0x61, 0x69, 0x6d, 0x73, 0x45,
	0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x2f, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x64, 0x69, 0x73,
	0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x43, 0x6c, 0x61, 0x69, 0x6d,
	0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0x31, 0x0a, 0x05, 0x43,
	0x6c, 0x61, 0x69, 0x6d, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x42, 0x80,
	0x01, 0x0a, 0x23, 0x6f, 0x72, 0x67, 0x2e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x61, 0x70, 0x6b, 0x2e,
	0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65,
	0x72, 0x79, 0x2e, 0x61, 0x70, 0x69, 0x42, 0x18, 0x42, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x4a,
	0x57, 0x54, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x3d, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65,
	0x6e, 0x76, 0x6f, 0x79, 0x70, 0x72, 0x6f, 0x78, 0x79, 0x2f, 0x67, 0x6f, 0x2d, 0x63, 0x6f, 0x6e,
	0x74, 0x72, 0x6f, 0x6c, 0x2d, 0x70, 0x6c, 0x61, 0x6e, 0x65, 0x2f, 0x77, 0x73, 0x6f, 0x32, 0x2f,
	0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2f, 0x61, 0x70, 0x69, 0x3b, 0x61, 0x70,
	0x69, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescOnce sync.Once
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescData = file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDesc
)

func file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescGZIP() []byte {
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescOnce.Do(func() {
		file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescData = protoimpl.X.CompressGZIP(file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescData)
	})
	return file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDescData
}

var file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_wso2_discovery_api_BackendJWTTokenInfo_proto_goTypes = []interface{}{
	(*BackendJWTTokenInfo)(nil), // 0: wso2.discovery.api.BackendJWTTokenInfo
	(*Claim)(nil),               // 1: wso2.discovery.api.Claim
	nil,                         // 2: wso2.discovery.api.BackendJWTTokenInfo.CustomClaimsEntry
}
var file_wso2_discovery_api_BackendJWTTokenInfo_proto_depIdxs = []int32{
	2, // 0: wso2.discovery.api.BackendJWTTokenInfo.customClaims:type_name -> wso2.discovery.api.BackendJWTTokenInfo.CustomClaimsEntry
	1, // 1: wso2.discovery.api.BackendJWTTokenInfo.CustomClaimsEntry.value:type_name -> wso2.discovery.api.Claim
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_wso2_discovery_api_BackendJWTTokenInfo_proto_init() }
func file_wso2_discovery_api_BackendJWTTokenInfo_proto_init() {
	if File_wso2_discovery_api_BackendJWTTokenInfo_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BackendJWTTokenInfo); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Claim); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_wso2_discovery_api_BackendJWTTokenInfo_proto_goTypes,
		DependencyIndexes: file_wso2_discovery_api_BackendJWTTokenInfo_proto_depIdxs,
		MessageInfos:      file_wso2_discovery_api_BackendJWTTokenInfo_proto_msgTypes,
	}.Build()
	File_wso2_discovery_api_BackendJWTTokenInfo_proto = out.File
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_rawDesc = nil
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_goTypes = nil
	file_wso2_discovery_api_BackendJWTTokenInfo_proto_depIdxs = nil
}
