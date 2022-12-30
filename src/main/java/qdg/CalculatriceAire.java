package qdg;
import java.util.*;

public class CalculatriceAire {
    public static double aire(List<Iforme> formes){
        double aire=0;
        for(Iforme forme : formes){
            aire+=forme.aire();
        }
        return aire;
    }
}
