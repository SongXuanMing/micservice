package com.xinbang.bwacl.api;

import com.xinbang.bwacl.common.constant.SERVICE_CONSTANT;
import lombok.extern.slf4j.Slf4j;
import moxie.cloud.service.client.Client;

import java.net.URI;

/**
 * Created by sxm on 17/2/10.
 */
@Slf4j
public class BWaclCenterClient extends Client{
    public BWaclCenterClient(BWaclCenterClientFactory factory) {
        super(factory, URI.create("http://" + SERVICE_CONSTANT.SERVICE_NAME));
    }

    public BWaclCenterClient(BWaclCenterClientFactory factory, URI baseUri) {
        super(factory, baseUri, false);
    }
}
