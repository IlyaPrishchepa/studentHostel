package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "staff" )
public class Staff {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "base_id", referencedColumnName = "id")
  private Base baseId;

  @Basic
  @Column(name = "role_id")
  private int roleId;

  @Basic
  @Column(name = "description")
  private String description;

}
