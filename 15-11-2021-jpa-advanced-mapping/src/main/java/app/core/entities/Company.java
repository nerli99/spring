package app.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "address")
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToOne(cascade = {

			CascadeType.PERSIST,

			CascadeType.REMOVE,

			CascadeType.DETACH, // remove entity from persistence context

			CascadeType.MERGE, // return a detached entity to persistence context

			CascadeType.REFRESH }) // reload entity data from the database
	@JoinColumn
	private Address address;

	// more CTORs
	public Company(int id, String name, String email) {
		this(id, name, email, null);
	}

}
