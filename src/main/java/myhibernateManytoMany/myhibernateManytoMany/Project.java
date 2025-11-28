package myhibernateManytoMany.myhibernateManytoMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Project {

	@Id
	private int pid;
	
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;
	
}
