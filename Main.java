import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class Main{
    //com.jtattoo.plaf.noire.NoireLookAndFeel
    //com.jtattoo.plaf.luna.LunaLookAndFeel
    //com.jtattoo.plaf.texture.TextureLookAndFeel
    //com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
    //com.jtattoo.plaf.bernstein.BernsteinLookAndFeel
    //com.jtattoo.plaf.mint.MintLookAndFeel
    //com.jtattoo.plaf.hifi.HifiLookAndField
    public static void main(String [] a){

        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        }catch(Exception e){
        }

        Vista v = new Vista();
    }
}