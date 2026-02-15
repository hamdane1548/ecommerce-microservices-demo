package net.oussama.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigatewayApplication.class, args);
    }
    @Bean
    public RouteLocator customerRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(router-> router
                        .path("/ecommerce/product/**")
                        .filters(f -> f
                                .rewritePath("/ecommerce/product/(?<segment>.*)","/${segment}")
                                .addResponseHeader("content-type", "application/json")
                                .addResponseHeader("content-type", "application/xml")
                        )
                        .uri("lb://PRODUCT")
                ).build();
    }

}
