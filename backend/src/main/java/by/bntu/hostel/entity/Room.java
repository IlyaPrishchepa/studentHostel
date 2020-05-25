package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "room" )
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Basic
  @Column(name = "number_places")
  private int numberPlace;

  @Basic
  @Column(name = "number_room")
  private String numberRoom;

  @OneToMany(mappedBy = "roomId", cascade = CascadeType.ALL)
  @JsonIgnore
  private Collection<Duty> duty;

}
