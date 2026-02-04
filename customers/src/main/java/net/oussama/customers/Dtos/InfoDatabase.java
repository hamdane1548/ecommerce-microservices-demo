package net.oussama.customers.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Map;
import java.util.Objects;

@ConfigurationProperties(prefix = "spring")
@Data
@AllArgsConstructor
public class InfoDatabase {
    private Map<String, String> datasource;
    private Map<String, String> rabbitmq;
}
