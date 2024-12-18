public class Wilder {

  // attributs 
private String firstname;
private boolean aware;

//constructeur
public Wilder(String firstname, boolean aware) {
  this.firstname = firstname;
  this.aware = aware;
}

//getters
public String getFirstname(){
  return this.firstname;
  }
  public boolean isAware()
  { return this.aware;
  }
//setters 
public void setFirstname(String newFirstname) {
  this.firstname = newFirstname;
  }
public void setAware(boolean newAware){
  this.aware = newAware;
  }
// methode
public String whoAmI() {
  if (this.isAware()) { return ("Je m'appelle " + this.getFirstname() + " et je suis aware");}; 
    return  ("Je m'appelle " + this.getFirstname() + " et je ne suis pas aware");
  }

};

 // Tu vas créer une classe pour représenter de façon la plus fidèle possible tes camarades !

// Crée une classe Wilder
// Ajoute les attributs String firstname et boolean aware
// Crée un constructeur permettant d'initialiser firstname et aware
// Ajoute des getters et setters pour tous les attributs, en respectant les conventions
// Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware
// Crée une classe Classroom avec une méthode main()
// Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
// Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal
// Compile et teste Classroom : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
// Partage le lien du dépôt GitHub en solution
// Exemple de résultat attendu lors de l'exécution de Classroom :

// $ Je m'appelle Jean-Claude et je suis aware
// $ Je m'appelle Henri et je ne suis pas aware