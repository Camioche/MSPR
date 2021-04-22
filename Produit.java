package tp;

import java.util.Currency;
import java.util.HashMap;

public class Produit
    {

//ATTRIBUTS
        private int idProduit;
        private String nom;
        private String reference;
        private String libelle;
        private double prixHT;
        private String tauxVente;

//CONSTRUCTEUR
        public Produit(int idProduitValue, String nomValue, String referenceValue, String libelleValue, double prixHTValue, String tauxVenteValue)
            {
                this.idProduit = idProduitValue;
                this.nom = nomValue;
                this.reference = referenceValue;
                this.libelle = libelleValue;
                this.prixHT = prixHTValue;
                this.tauxVente = tauxVenteValue;
            }

//Methodes
    // Créer un tableau panier : pour lister les produits dedans
        public static HashMap ajouterpanier(Produit produit, int quantite)
        {
            HashMap<Produit ,Integer > listeProduits = new HashMap<Produit, Integer>();
            listeProduits.put(produit, quantite);
            return listeProduits;
        }
//    //Soldes
//        public void reductionObtenue(int reductionValue, int prixredduit)
//        {
//             prixreduit = prixHT * reductionValue;
//            return;
//        }
//
//    //TVA
//        public void tvaApliquée(Currency tvaValue, Currency prixttc)
//        {
//
//            prixTTC = prixHT * tvaValue;
//            return;
//        }

//GETTER & SETTER
        public int getIdProduit()
            {
                return idProduit;
            }

        public void setIdProduit(int idProduit)
            {
                this.idProduit = idProduit;
            }
        public String getReference()
            {
                return reference;
            }

        public String getNom()
            {
                return nom;
            }

        public void setNom(String nom)
            {
                this.nom = nom;
            }
        public void setReference(String reference)
            {
                this.reference = reference;
            }

        public String getLibelle()
            {
                return libelle;
            }

        public void setLibelle(String libelle)
            {
                this.libelle = libelle;
            }

        public double getPrixHT()
            {
                return prixHT;
            }

        public void setPrixHT(double prixHT)
            {
                this.prixHT = prixHT;
            }
        public String getTauxVente()
            {
                return tauxVente;
            }

        public void setTauxVente(String tauxVente)
            {
                this.tauxVente = tauxVente;
            }
    }

