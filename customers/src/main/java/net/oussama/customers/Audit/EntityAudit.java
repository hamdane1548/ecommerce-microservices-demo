package net.oussama.customers.Audit;

import jakarta.persistence.EntityListeners;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Optional;
@Component("auditCustomers")
public class EntityAudit implements AuditorAware {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("oussama");
    }
}
