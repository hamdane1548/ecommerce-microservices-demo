package net.oussama.apigateway.filter;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@Order(1)
@Component
public class RequestFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        HttpHeaders headers = exchange.getRequest().getHeaders();
        if(checkId(headers)){
            System.out.println("filer");
        }else {
             String CorrelationId = UUID.randomUUID().toString();
            exchange = exchange.mutate().request(exchange.getRequest().mutate().header("CORRELATION_ID", CorrelationId).build()).build();
        }
        return chain.filter(exchange);
    }
    private Boolean checkId(HttpHeaders headers){
        Map<String,List<String>> headers8 = new HashMap<>();
        headers.forEach((k,v)->{
            if(k.equals("CORRELATION_ID")){
                headers8.put(k,v);
            }
        });
        if(headers8.get("CORRELATION_ID")==null){
            return false;
        }else  {
            return true;
        }
    }
}
