package com.jdc.edu.domain.entity.course;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class TimeTableInstructionDayPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID timeTableId;
    private UUID instructionDayId;

}
