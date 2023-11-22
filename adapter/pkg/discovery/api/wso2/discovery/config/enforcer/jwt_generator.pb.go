// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.13.0
// source: wso2/discovery/config/enforcer/jwt_generator.proto

package enforcer

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

// JWT Generator model
type JWTGenerator struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Keypairs []*Keypair `protobuf:"bytes,1,rep,name=keypairs,proto3" json:"keypairs,omitempty"`
}

func (x *JWTGenerator) Reset() {
	*x = JWTGenerator{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JWTGenerator) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JWTGenerator) ProtoMessage() {}

func (x *JWTGenerator) ProtoReflect() protoreflect.Message {
	mi := &file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JWTGenerator.ProtoReflect.Descriptor instead.
func (*JWTGenerator) Descriptor() ([]byte, []int) {
	return file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescGZIP(), []int{0}
}

func (x *JWTGenerator) GetKeypairs() []*Keypair {
	if x != nil {
		return x.Keypairs
	}
	return nil
}

// keypair model
type Keypair struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PublicCertificatePath string `protobuf:"bytes,1,opt,name=public_certificate_path,json=publicCertificatePath,proto3" json:"public_certificate_path,omitempty"`
	PrivateKeyPath        string `protobuf:"bytes,2,opt,name=private_key_path,json=privateKeyPath,proto3" json:"private_key_path,omitempty"`
	UseForSigning         bool   `protobuf:"varint,3,opt,name=use_for_signing,json=useForSigning,proto3" json:"use_for_signing,omitempty"`
}

func (x *Keypair) Reset() {
	*x = Keypair{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Keypair) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Keypair) ProtoMessage() {}

func (x *Keypair) ProtoReflect() protoreflect.Message {
	mi := &file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Keypair.ProtoReflect.Descriptor instead.
func (*Keypair) Descriptor() ([]byte, []int) {
	return file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescGZIP(), []int{1}
}

func (x *Keypair) GetPublicCertificatePath() string {
	if x != nil {
		return x.PublicCertificatePath
	}
	return ""
}

func (x *Keypair) GetPrivateKeyPath() string {
	if x != nil {
		return x.PrivateKeyPath
	}
	return ""
}

func (x *Keypair) GetUseForSigning() bool {
	if x != nil {
		return x.UseForSigning
	}
	return false
}

var File_wso2_discovery_config_enforcer_jwt_generator_proto protoreflect.FileDescriptor

var file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDesc = []byte{
	0x0a, 0x32, 0x77, 0x73, 0x6f, 0x32, 0x2f, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79,
	0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72,
	0x2f, 0x6a, 0x77, 0x74, 0x5f, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f,
	0x76, 0x65, 0x72, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x65, 0x6e, 0x66, 0x6f,
	0x72, 0x63, 0x65, 0x72, 0x22, 0x53, 0x0a, 0x0c, 0x4a, 0x57, 0x54, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x6f, 0x72, 0x12, 0x43, 0x0a, 0x08, 0x6b, 0x65, 0x79, 0x70, 0x61, 0x69, 0x72, 0x73,
	0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x64, 0x69,
	0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x65,
	0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x2e, 0x4b, 0x65, 0x79, 0x70, 0x61, 0x69, 0x72, 0x52,
	0x08, 0x6b, 0x65, 0x79, 0x70, 0x61, 0x69, 0x72, 0x73, 0x22, 0x93, 0x01, 0x0a, 0x07, 0x4b, 0x65,
	0x79, 0x70, 0x61, 0x69, 0x72, 0x12, 0x36, 0x0a, 0x17, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x5f,
	0x63, 0x65, 0x72, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x65, 0x5f, 0x70, 0x61, 0x74, 0x68,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x15, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x43, 0x65,
	0x72, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x65, 0x50, 0x61, 0x74, 0x68, 0x12, 0x28, 0x0a,
	0x10, 0x70, 0x72, 0x69, 0x76, 0x61, 0x74, 0x65, 0x5f, 0x6b, 0x65, 0x79, 0x5f, 0x70, 0x61, 0x74,
	0x68, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x70, 0x72, 0x69, 0x76, 0x61, 0x74, 0x65,
	0x4b, 0x65, 0x79, 0x50, 0x61, 0x74, 0x68, 0x12, 0x26, 0x0a, 0x0f, 0x75, 0x73, 0x65, 0x5f, 0x66,
	0x6f, 0x72, 0x5f, 0x73, 0x69, 0x67, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0d, 0x75, 0x73, 0x65, 0x46, 0x6f, 0x72, 0x53, 0x69, 0x67, 0x6e, 0x69, 0x6e, 0x67, 0x42,
	0x96, 0x01, 0x0a, 0x2f, 0x6f, 0x72, 0x67, 0x2e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x61, 0x70, 0x6b,
	0x2e, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76,
	0x65, 0x72, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x65, 0x6e, 0x66, 0x6f, 0x72,
	0x63, 0x65, 0x72, 0x42, 0x11, 0x4a, 0x57, 0x54, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x6f,
	0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x70, 0x72, 0x6f, 0x78, 0x79, 0x2f,
	0x67, 0x6f, 0x2d, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2d, 0x70, 0x6c, 0x61, 0x6e, 0x65,
	0x2f, 0x77, 0x73, 0x6f, 0x32, 0x2f, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2f,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x3b,
	0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescOnce sync.Once
	file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescData = file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDesc
)

func file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescGZIP() []byte {
	file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescOnce.Do(func() {
		file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescData = protoimpl.X.CompressGZIP(file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescData)
	})
	return file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDescData
}

var file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_wso2_discovery_config_enforcer_jwt_generator_proto_goTypes = []interface{}{
	(*JWTGenerator)(nil), // 0: wso2.discovery.config.enforcer.JWTGenerator
	(*Keypair)(nil),      // 1: wso2.discovery.config.enforcer.Keypair
}
var file_wso2_discovery_config_enforcer_jwt_generator_proto_depIdxs = []int32{
	1, // 0: wso2.discovery.config.enforcer.JWTGenerator.keypairs:type_name -> wso2.discovery.config.enforcer.Keypair
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_wso2_discovery_config_enforcer_jwt_generator_proto_init() }
func file_wso2_discovery_config_enforcer_jwt_generator_proto_init() {
	if File_wso2_discovery_config_enforcer_jwt_generator_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JWTGenerator); i {
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
		file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Keypair); i {
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
			RawDescriptor: file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_wso2_discovery_config_enforcer_jwt_generator_proto_goTypes,
		DependencyIndexes: file_wso2_discovery_config_enforcer_jwt_generator_proto_depIdxs,
		MessageInfos:      file_wso2_discovery_config_enforcer_jwt_generator_proto_msgTypes,
	}.Build()
	File_wso2_discovery_config_enforcer_jwt_generator_proto = out.File
	file_wso2_discovery_config_enforcer_jwt_generator_proto_rawDesc = nil
	file_wso2_discovery_config_enforcer_jwt_generator_proto_goTypes = nil
	file_wso2_discovery_config_enforcer_jwt_generator_proto_depIdxs = nil
}