package com.xinbang.bwacl.api;
import moxie.cloud.service.client.ClientFactory;
import moxie.cloud.service.client.auth.AuthorizationProvider;

/**
 * Created by sxm on 17/2/10.
 */
public class BWaclCenterClientFactory extends ClientFactory {

    protected BWaclCenterClientFactory(Builder builder) {
        super(builder);
    }

    public BWaclCenterClient newClient() {
        return new BWaclCenterClient(this);
    }



    public BWaclCenterClient newClient(String authorization) {
        BWaclCenterClient client = new BWaclCenterClient(this);
        client.setAuthorization(authorization);
        return client;
    }

    public BWaclCenterClient newClient(AuthorizationProvider provider) {
        BWaclCenterClient client = new BWaclCenterClient(this);
        client.setAuthorizationProvider(provider);
        return client;
    }

    public static Builder builder(ClientFactory.Options options) {
        return new Builder(options);
    }

    public static class Builder extends ClientFactory.Builder<Builder> {
        public Builder(ClientFactory.Options options) {
            super(options);
        }

        public BWaclCenterClientFactory build() {
            return new BWaclCenterClientFactory(this);
        }
    }
}
