package hu.petrik.aukcio;

import java.time.LocalDateTime;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }

    public String GetFesto() {
        return this.festo;
    }

    public String GetStilus() {
        return this.stilus;
    }

    public int GetLicitekSzama() {
        return this.licitekSzama;
    }

    public int GetLegmagasabbLicit() {
        return this.legmagasabbLicit;
    }

    public LocalDateTime GetLegutolsoLicitIdeje() {
        return this.legutolsoLicitIdeje;
    }

    public boolean GetElkelt() {
        return this.elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = true;
    }

    public void licit(int mertek) {

    }

}
