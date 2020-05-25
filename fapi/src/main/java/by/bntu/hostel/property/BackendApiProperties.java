package by.bntu.hostel.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BackendApiProperties {

    @Value("${back.server.uri}")
    private String backUri;

    public String getBaseUri() {
        return backUri + "/base";
    }

    public String getDutyUri() {
        return backUri + "/duty";
    }

    public String getDutyTypeUri() {
        return backUri + "/duty-type";
    }

    public String getGroupUri() {
        return backUri + "/group";
    }

    public String getPaymentUri() {
        return backUri + "/payment";
    }

    public String getReprimandUri() {
        return backUri + "/reprimand";
    }

    public String getRoleUri() {
        return backUri + "/role";
    }

    public String getRoomUri() {
        return backUri + "/room";
    }

    public String getStaffUri() {
        return backUri + "/staff";
    }

    public String getStatementUri() {
        return backUri + "/statement";
    }

    public String getStatusPassportUri() {
        return backUri + "/status-passport";
    }

    public String getStatusStatementUri() {
        return backUri + "/status-statement";
    }

    public String getStudentUri() {
        return backUri + "/student";
    }

    public String getStudentPaymentUri() {
        return backUri + "/student-payment";
    }

    public String getStudentReprimandUri() {
        return backUri + "/student-reprimand";
    }

    public String getStudentRoomUri() {
        return backUri + "/student-room";
    }

    public String getWorkingOffUri() {
        return backUri + "/working-off";
    }




}
