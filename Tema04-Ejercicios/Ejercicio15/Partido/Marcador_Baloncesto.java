
package Partido;
import java.time.*;


public class Marcador_Baloncesto {
    
    private String nomLocal;
    private String nomVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    
    public Marcador_Baloncesto(String nLoc,String nVis){
        nomLocal=nLoc;
        nomVisitante=nVis;
        puntosLocal=0;
        puntosVisitante=0;
        fecha=LocalDate.now();
    }
    
    public Marcador_Baloncesto(String nLoc,String nVis,LocalDate date){
        nomLocal=nLoc;
        nomVisitante=nVis;
        puntosLocal=0;
        puntosVisitante=0;
        fecha=date;
    }
    
    public Marcador_Baloncesto(String nLoc,String nVis,LocalDate date, int punloc, int punvis){
        nomLocal=nLoc;
        nomVisitante=nVis;
        puntosLocal=punloc;
        puntosVisitante=punvis;
        fecha=date;
    }
    
    
    public LocalDate verfecha(){
        return fecha;
    }
    public int getPuntosLocal(){
        return puntosLocal;
    }
    public int getPuntosVisitante(){
        return puntosVisitante;
    }
    public String getNomLoc(){
        return nomLocal;
    }
    public String getNomVis(){
        return nomVisitante;
    }
    public void AñadirCanasta(char E,int pun){
        
        if((pun<4)&&(pun>0)){
            if(E=='L'||E=='l'){
                puntosLocal+=pun;
            }
            else{
                if(E=='V'||E=='v'){
                    puntosVisitante+=pun;
                }}
    
        }
    }
    
    public void Reset(){
        puntosLocal=0;
        puntosVisitante=0;
    }
    
    public void CambiarnomLocal(String nom){
        nomVisitante=nom;
    }
    
    public void CambiarnomVisitante(String nom){
        nomVisitante=nom;
    }
    
    public String getGanador(){
        if(this.puntosLocal>this.puntosVisitante){
            return this.nomLocal+" Esta apisonando al rival";
        }
        else{
            if(this.puntosLocal<this.puntosVisitante){
                return this.nomVisitante+" Esta apisonando al rival";
            }
            else{
                return "Nadie apisona a nadie";
            }
        }
        
    }
    
}

