package com.xinbang.bwacl;

import moxie.cloud.service.server.MicroService;

/**
 * Created by sxm on 17/2/10.
 */
public class BWaclCenterStartUp {
    public static void main(String[] args) {
        MicroService service = new MicroService();
        service.start(BWaclCenterStartUp.class, args);


    }
}
