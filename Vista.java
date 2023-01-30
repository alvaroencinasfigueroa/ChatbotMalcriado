import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

public class Vista extends JFrame implements ActionListener{
    JTextArea chatArea = new JTextArea(); 
    JTextField chatDialog = new JTextField();
    JButton botonEnviar = new JButton("ENVIAR");
    JLabel nombreChat = new JLabel("CHAT MALCRIADO");
    
    public Vista(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(750, 1000);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        crearCampoChat();
        crearChatDialogo();
        crearBotonEnviar();
        crearNombre();
        botonEnviar.addActionListener(this);
        
        /*chatDialog.addActionListener(new ActionListener(){
                
                @Override
                public void ActionPerformed(ActionEvent arg0){
                    String gtext = chatDialog.getText();
                    String res = holaBB(gtext);
                    chatArea.append("YOU ->" + gtext + "\n");
                    chatDialog.setText("");
                }
            });*/
    }

    public void crearCampoChat(){
        chatArea.setSize(500, 600);
        chatArea.setLocation(2,40);
        add(chatArea);
    }

    public void crearChatDialogo(){
        chatDialog.setSize(500, 40);
        chatDialog.setLocation(2, 625);
        add(chatDialog);
    }

    public void crearBotonEnviar(){
        botonEnviar.setSize(100, 40);
        botonEnviar.setLocation(400,670);
        add(botonEnviar);
    }

    public void crearNombre(){
        nombreChat.setSize(200, 30);
        nombreChat.setLocation(300, 5);
        add(nombreChat);
    }
    
    public void actionPerformed(ActionEvent e){
        ChatIA ia = new ChatIA();
        String chatR = chatDialog.getText();
        String res = ia.holaBB(chatR);
        chatArea.setText(res);
    }
}
