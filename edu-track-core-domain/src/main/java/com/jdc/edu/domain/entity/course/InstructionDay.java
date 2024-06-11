package com.jdc.edu.domain.entity.course;

import com.jdc.edu.domain.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(indexes = { @Index(name = "instruction_day_unique_idx", columnList = "dayOfWeek, startTime, endTime", unique = true)})
@Data
@EqualsAndHashCode(callSuper = false)
public class InstructionDay extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "dayOfWeek")
    private DayOfWeek dayOfWeek;

    @Column(name = "startTime", nullable = false)
    private LocalTime startTime;
    @Column(name = "endTime", nullable = false)
    private LocalTime endTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instructionDay")
    private List<TimeTableInstructionDay> timeTableInstructionDays;
    
}
