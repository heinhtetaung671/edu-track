package com.jdc.edu.domain.entity.course;

import com.jdc.edu.domain.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class TimeTable extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    private String remark;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "timeTable")
    private List<TimeTableInstructionDay> timeTableInstructionDays;
}
