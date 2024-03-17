package edu.icbt.las.labappointmentsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MakeAppointmentRequest {
    private String appointmentDate;
    private String recommendedDoctor;
    private List<AppointmentTestRequest> tests;

}
