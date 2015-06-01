
import java.util.ArrayList;
import java.util.Scanner;

public class Equipements {

    private ArrayList<Object> equipement;
    
    public Equipements(){
        this.equipement=new ArrayList<Object>();
    }

//********************CONSTRUCTEUR PAR DEFAUT*************************
    public Equipements( ArrayList<Object> equipement){
        this.equipement=equipement;
    }
//********************CHOISIR OBJET***********************************
    public void choisirObjet() {
    	int a=0;
    	Scanner sc= new Scanner(System.in);
        do{
        System.out.println("Veuillez saisir l'objet que vous voulez\n");
        System.out.println("1-Armes");
        System.out.println("2-Potions");
        System.out.println("3-Vetements");  
        a=sc.nextInt();
        }while(a<1 && a>3);
        if(a==1){// arme
            choisirArme();
        }
        if(a==2){// potion
            choisirPotion();
        }
        if(a==3){// vetements
            choisirVetement();
        }
        sc.close();
    }
//**********************CHOISIR ARME******************************************
    public void choisirArme(){
        System.out.println("Veuillez saisir l'objet que vous voulez\n");
            for(int i=0;i<this.equipement.size();i++){
                Arme a= (Arme)this.equipement.get(i);
                System.out.println(a);
            }
            // afficher tout les elements du tableau qui on type de arme
    }
  //**********************CHOISIR POTION******************************************
    public void choisirPotion(){
        System.out.println("Veuillez saisir l'objet que vous voulez\n");
            for(int i=0;i<this.equipement.size();i++){
                Potion p= (Potion)this.equipement.get(i);
                System.out.println(p);
            }
            // afficher tout les elements du tableau qui on type de arme
    }
//**********************CHOISIR VETEMENT******************************************
    public void choisirVetement(){
        System.out.println("Veuillez saisir l'objet que vous voulez\n");
            for(int i=0;i<this.equipement.size();i++){
                Vetement v= (Vetement)this.equipement.get(i);
                System.out.println(v);
            }
            // afficher tout les elements du tableau qui on type de arme
    }

  //**********************ACCESSEUR******************************************
    public ArrayList<Object> getequipement() {
        return this.equipement;
    }
  //**********************MUTATEUR******************************************
    public void setequipement(ArrayList<Object> equipement) {
        this.equipement = equipement;
    }

}

