package com.jdc.edu.domain.entity.course;

import com.jdc.edu.domain.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseAdditionalInfo extends AbstractEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private short studentCapacity;

    private LocalDate startDate;
    private short duration_week;

    private String remark;

    @MapsId
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Course course;

}
