/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.iepscfjemelle.poolabo.martin.entreprise2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author WiikzZ
 */
public class Menu {
    int choix;

    //Menu de départ
    void ShowMenu() throws IOException, FileNotFoundException, ClassNotFoundException {

        System.out.println("Menu de départ");
        System.out.println("-----------------------------");
        System.out.println("0. Quitter");
        System.out.println("1. Introduction des données");
        System.out.println("2. Lecture et affichage console");
        System.out.println("3. Ecriture des données en fichier txt");

        System.out.println("Entrez votre choix: ");

        this.choix = Clavier.lireInt();

        switch (choix) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Controller obj1 = new Controller();
                obj1.start();
                break;
            case 2:
                Controller obj2 = new Controller();
                obj2.Controller();
                break;
            case 3:
                Controller obj3 = new Controller();
                obj3.execute();
                break;

            default:
                this.ShowMenu();
                break;
        }

    }
}
