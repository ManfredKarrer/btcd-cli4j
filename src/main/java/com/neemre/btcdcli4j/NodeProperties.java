package com.neemre.btcdcli4j;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum NodeProperties {
	
	RPC_PROTOCOL("node.bitcoind.rpc.protocol"),
	RPC_USER("node.bitcoind.rpc.user"),
	RPC_PASSWORD("node.bitcoind.rpc.password"),
	RPC_HOST("node.bitcoind.rpc.host"),
	RPC_PORT("node.bitcoind.rpc.port"),
	HTTP_AUTH_SCHEME("node.bitcoind.http.auth_scheme");
	
	@Getter
	@Setter
	private String key;
}