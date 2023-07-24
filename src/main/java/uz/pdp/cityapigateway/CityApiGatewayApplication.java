package uz.pdp.cityapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CityApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityApiGatewayApplication.class, args);
    }

}
