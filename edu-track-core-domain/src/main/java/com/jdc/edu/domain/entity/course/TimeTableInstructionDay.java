package com.jdc.edu.domain.entity.course;

import com.jdc.edu.domain.entity.AbstractEntity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class TimeTableInstructionDay extends AbstractEntity {

    @EmbeddedId
    private TimeTableInstructionDayPk id;

    @MapsId(value = "timeTableId")
    @ManyToOne(optional = false)
    private TimeTable timeTable;

    @MapsId(value = "instructionDayId")
    @ManyToOne(optional = false)
    private InstructionDay instructionDay;

}
