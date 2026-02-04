package net.oussama.product.Audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("audit")
public class AuditAware implements AuditorAware {

    @Override
    public Optional getCurrentAuditor() {
        return Optional.ofNullable("oussama");
    }
}
