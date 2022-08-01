import assignments.assignment4.backend.penerbangan.Bandara;
import assignments.assignment4.backend.penerbangan.Maskapai;
import assignments.assignment4.backend.penerbangan.Penerbangan;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class BandaraTest{
    Maskapai maskapai1 = new Maskapai("Lion Air", "JT");
    Bandara bandaraAsal1= new Bandara("Soekarno-Hatta", "CGK", "Banten");
    Bandara bandaraTujuan1 = new Bandara("Sultan Thaha", "DJB", "Jambi");
    Penerbangan penerbangan1 = new Penerbangan(maskapai1, bandaraAsal1, bandaraTujuan1, "10:50", "12:00", 820000);

    public BandaraTest() throws ParseException {
    }

    @Test
    public void addPenerbangan(){
        bandaraAsal1.addPenerbangan(penerbangan1);
    }

    @Test
    public void addMaskapai(){
        bandaraAsal1.addMaskapai(maskapai1);
    }

    @Test
    public void getPenerbangan(){
        bandaraAsal1.getDaftarPenerbangan();
    }

    @Test
    public void findPenerbanganThatsNotExist(){
    }
}