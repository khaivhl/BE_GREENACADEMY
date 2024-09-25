package org.green.education.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.green.education.entity.LeaveOfAbsence;

import java.util.Date;

@Data
@Builder
public class LeaveOfAbsenceDTO {

    private int id;
    private int studentId;
    private Date startDate;
    private Date endDate;
    private int status;
    private int subjectId;

    public LeaveOfAbsenceDTO() {}

    public LeaveOfAbsenceDTO(int id, int studentId, Date startDate, Date endDate, int status, int subjectId) {
        this.id = id;
        this.studentId = studentId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.subjectId = subjectId;
    }

    public LeaveOfAbsenceDTO(LeaveOfAbsence leaveOfAbsence) {
        this.id = leaveOfAbsence.getId();
        this.studentId = leaveOfAbsence.getStudent() != null ? leaveOfAbsence.getStudent().getId() : 0;
        this.startDate = leaveOfAbsence.getStartDate();
        this.endDate = leaveOfAbsence.getEndDate();
        this.status = leaveOfAbsence.getStatus();
        this.subjectId = leaveOfAbsence.getSubject() != null ? leaveOfAbsence.getSubject().getSubjectId() : 0;
    }
}
