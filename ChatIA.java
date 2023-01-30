import java.util.*;

public class ChatIA{
    //Vista obtenerDialogoChat = new Vista();
    public String chatear(String textoUsuario){
        String res = "";
        String [] ia = {"hola","culon","de","mierda","cojudo","alcahuete","puto"};
        for(int i = 0; i < ia.length; i++){
            if(textoUsuario.equals("hola")){
                res = ia[1];
            }
        }
        return res;
    }

    public String holaBB(String saludoUser){
        Random aleatorio = new Random();
        String res = "";
        String saludos [] = {"hola amor", "hola bb", "hola guapo", "hola vida", "hola mi hombre"};
        if(saludoUser.equals("hola")){
            int a = aleatorio.nextInt(4-0+1)+0;
            res = saludos[a];
        }
        return res;
    }
    
    /*public String chatear1(String h1){
        String res = "";
        h1 = obtenerDialogoChat.chatDialog.getText();
        return res = h1;
    }*/
}

