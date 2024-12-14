package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Biblioteque {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void ajouterLivre(String titre,String auteur,String language,String genre,String isbn,String prix,String exemplaire){
        if (titre.isEmpty() || auteur.isEmpty() || language.isEmpty() || genre.isEmpty() || isbn.isEmpty() || prix.isEmpty() || exemplaire.isEmpty()) {
            Ajout_livre al=new Ajout_livre();
            JOptionPane.showMessageDialog(al, "remplir tous les case!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:bib.db");
                String sql="insert into livre(titre,auteur,language,genre,isbn,prix,exemplaire) values(?,?,?,?,?,?,?);";
                pst=con.prepareStatement(sql);
                pst.setString(1,titre);
                pst.setString(2,auteur);
                pst.setString(3,language);
                pst.setString(4,genre);
                pst.setString(5,isbn);
                pst.setString(6,prix);
                pst.setString(7,exemplaire);
                pst.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(null,"enregistrement reussi");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void delete_livre(String isbn,Supprime_livre s){
        try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:bib.db");
                String sql="delete from livre where isbn=?;";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, isbn);
                int x=pst.executeUpdate();
                con.close();
                if (x==1) {
                    JOptionPane.showMessageDialog(null,"suprition reussi");
                }
                else{
                    JOptionPane.showMessageDialog(null,"this element doesn't exist");
                }
                s.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
