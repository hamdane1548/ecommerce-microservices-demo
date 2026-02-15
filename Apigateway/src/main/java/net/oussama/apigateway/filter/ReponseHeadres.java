package net.oussama.apigateway.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ReponseHeadres {
    String correlationId ;
    @Bean
    public GlobalFilter ReponseHeadresFilter() {
        return ((exchange, chain) ->  {
            HttpHeaders headers = exchange.getRequest().getHeaders();
            headers.forEach((k,v)->{
                if(k.equals("CORRELATION_ID")){
                    correlationId = v.toString();
                }
            });
            exchange.getResponse().getHeaders().add("CORRELATION_ID", correlationId);
            return chain.filter(exchange);
        }
        );
    }
}
