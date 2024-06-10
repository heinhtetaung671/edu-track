package com.jdc.edu.domain.entity.course;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
public class TimeTableInstructionDayPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID timeTableId;
    private UUID instructionDayId;

}
