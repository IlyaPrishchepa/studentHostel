package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Blob;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegStudent {

    private String login;
    private String password;
    private String firstName;
    private String secondName;
    private String middleName;
    private String phone;
    private Blob photo;
    private int group;
    private int statusPassportId;
    private String key;
}
