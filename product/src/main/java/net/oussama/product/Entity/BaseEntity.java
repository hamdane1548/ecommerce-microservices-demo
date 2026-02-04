package net.oussama.product.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @CreatedBy
    @Column(updatable = false)
    private String CreatedBy;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime CreatedDate;
    @LastModifiedBy
    @Column(insertable = false)
    private  String ModifiedBy;
    @LastModifiedDate
    @Column(insertable = false )
    private LocalDateTime ModifiedAt;


}
