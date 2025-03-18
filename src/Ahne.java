public class Ahne {
    private String Vorname;
    private String Nachname;
    private char geschlecht;

  Ahne(String pVorname, String pNachname,char pgeschlecht){
      pVorname=Vorname;
      pNachname=Nachname;
      pgeschlecht=geschlecht;
  }
    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }
    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }
    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

}
