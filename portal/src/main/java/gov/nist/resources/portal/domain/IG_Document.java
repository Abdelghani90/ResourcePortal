package gov.nist.resources.portal.domain;

import java.lang.annotation.Documented;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="IG_Document")
public class IG_Document {

	public IG_Document() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Id
	private Object id;
	private String name;
	private List<Artifact> profiles;
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Artifact> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Artifact> profiles) {
		this.profiles = profiles;
	}
	
}
