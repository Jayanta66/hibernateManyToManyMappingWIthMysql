package myhibernateManytoMany.myhibernateManytoMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Emp {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable(
			
			name="emp_learn", 
			joinColumns= {@JoinColumn(name="eid")}, 
			inverseJoinColumns = {@JoinColumn(name="pid")}
			)
	private List<Project> projects;

}
