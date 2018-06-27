package com.hq.gateway.entity;

import lombok.Data;

/**
 * @author huangqi
 * @Package com.hq.gateway.entity
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @date 2018/6/27 9:47
 */
@Data
public class JWT {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;

    @Override
    public String toString() {
        return "JWT{" +
                "access_token='" + access_token + '\'' +
                ", token_type='" + token_type + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", expires_in=" + expires_in +
                ", scope='" + scope + '\'' +
                ", jti='" + jti + '\'' +
                '}';
    }
}