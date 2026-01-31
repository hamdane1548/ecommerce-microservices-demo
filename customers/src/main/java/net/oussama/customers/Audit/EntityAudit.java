package net.oussama.customers.Audit;

import org.springframework.data.domain.AuditorAware;

import java.io.Serializable;
import java.util.Optional;

public class EntityAudit implements AuditorAware {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("admin");
    }
}
