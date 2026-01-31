package net.oussama.customers.entity;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
public class BaseEntity {
    @CreatedBy
    @Column(updatable = false)
    private String creatdeBy;
    @Column(updatable = false)
    @CreatedDate()
    private Date CreatedAt;
    @LastModifiedBy()
    @Column(insertable = false)
    private String updateBy;
    @LastModifiedDate()
    @Column(insertable = false)
    private Date UpdatedAt;

}
