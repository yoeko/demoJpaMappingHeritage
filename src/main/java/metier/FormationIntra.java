package metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("INTRA")
public class FormationIntra extends Formation {
	private String niveauPersonnalisationSupports;
	
	public FormationIntra() {
		super();
	}

	public FormationIntra(String niveauPersonnalisationSupports) {
		super();
		this.niveauPersonnalisationSupports = niveauPersonnalisationSupports;
	}
	
	

	public FormationIntra(String theme, String niveauPersonnalisationSupports) {
		super(theme);
		this.niveauPersonnalisationSupports = niveauPersonnalisationSupports;
	}

	public String getNiveauPersonnalisationSupports() {
		return niveauPersonnalisationSupports;
	}

	public void setNiveauPersonnalisationSupports(String niveauPersonnalisationSupports) {
		this.niveauPersonnalisationSupports = niveauPersonnalisationSupports;
	}
	
	
	
}
