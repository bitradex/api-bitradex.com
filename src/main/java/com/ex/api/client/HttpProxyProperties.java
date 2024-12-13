package com.ex.api.client;

import lombok.Data;

@Data
public class HttpProxyProperties {

    /**use proxy ip or not*/
    private boolean enabled;
    /**proxy ip*/
    private String host;
    /**proxy port*/
    private int port;

}
