
import java.util.Scanner;



public class Menu {

//**********************************DEMARRER**************************************
	public void demarrer(){
		  int a=0;
		  while(a<1||a>3){
		  Scanner sc= new Scanner(System.in);
		  System.out.println("		-----------------");
		  System.out.println("		|EHPTMMMORPGSVR |");
		  System.out.println("		-----------------");
		  System.out.println("\n-----------------------------------------");
		  System.out.println(" 		Que voulez-vous:");
		  System.out.println("-----------------------------------------");
		  System.out.println("\n1-Nouvelle Partie");
		  System.out.println("2-Continuer");
		  System.out.println("3-Quitter le Jeu");
		  System.out.println("-----------------------------------------");
		  a= sc.nextInt();
		  if(a==1){
			  nouvellePartie();
			 
		  }
		  else if(a==2){
			  //jouer();
		  }
		  else if(a==3){
			  System.out.println("\nVous avez quitter le jeu");
		  }
		  else{
			  System.out.println("\n--------------------------------------------");
			  System.out.println("Le numéro que vous avez saisie n'est pas bon");
			  System.out.println("--------------------------------------------");				  
		  }
		  sc.close();
	  }	  	
	}
	
//**********************************NOUVELLE PARTIE**************************************
	
	  public void nouvellePartie(){
		  Grille g= new Grille();
		  int a,i=0;
		  Scanner sc= new Scanner(System.in);
				  	g.initGrille();
					Personnage p = new Personnage(g.creerPersonnage());
					while(i<15){
						System.out.println("\nAttribuer les caractÈristiques : \nReste "+(15-i)+" points ‡ attribuer\n\n1- Force : "+p.getForce()+"\n2- Adresse : "+p.getAdresse()+"\n3- Resistance "+p.getResistance());
						a = sc.nextInt();
						if(a>0&&a<4){
							if(a==1){
								p.setForce(p.getForce()+1);
							}
							else if(a==2){
								p.setAdresse(p.getAdresse()+1);
							}
							else{
								p.setResistance(p.getResistance()+1);
							}
							i++;
						}
					}
					int b=0;
					System.out.println("\nChoisir un Èquipement de dÈpart : \n\n1- Epee en bois\n2- Vetements en cuir");
					a=sc.nextInt();
					while(b==1||b==2){
						
						int q[] = new int[2];
						q[0]=1;
						q[1]=2;
						if(b==1){
							p.setArmeGauche(new Arme("Epee en bois",q,q));
						}
						if(b==2){
							p.setVetement(new Vetement("Vetements en cuir",1,q));
						}
					}
					g.genererMurAleatoire(105);
					g.apparaitreMonstre();
					g.apparaitreObjetAleatoire(10);
					g.affichageGrille();
					jouer(g,p);	
	  }
public void jouer(Grille g, Personnage p){
	int a=0;
		  while(a!=5){
			a=0;
			
			while(a<1||a>6){
				Scanner sc= new Scanner(System.in);
				System.out.println("\nAction :\n\n1- Se Deplacer\n2- Attaquer\n3- Objets\n4- Ramasser\n5- Finir Tour\n6-Quitter le jeu");
				a=sc.nextInt();
				if(a==1){
					g.initDeplacer(p);
				}
				else if(a==2){
					p.attaquer(g.apparaitreMonstre(), new Arme());
				}
				else if(a==6){
					System.out.println("Vous avez quittez le jeu");
				}
			}
		  }
		}
}