/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambioscrittura;

import java.io.File;
/**
 *
 * @author 72873486
 */
public class Cambio {
    
    private String nome = "";
    private String percorso = "";
    
    public Cambio (String nome, String percorso)
    {
        this. nome = nome;
        this.percorso = percorso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPercorso(String percorso) {
        this.percorso = percorso;
    }

    public String getNome() {
        return nome;
    }

    public String getPercorso() {
        return percorso;
    }
    
    public void toSnake()
    {
        File file = new File (this.percorso);
        String name = file.getName();
        String newName = "";
        for (int i =0; i<name.length()-4; i++)
        {
            String c = name.charAt(i)+ "";
            if (c == c.toUpperCase())
            {
                String lettera = ""+name.charAt(i);
                newName=name.replace(lettera, "_"+c);
            }
        }
         System.out.println(newName);
         File file2 = new File (newName);
         file.renameTo(file2);
        
    }
    
    
   public void toCamel()
   {
       File file = new File (this.percorso);
        String name = file.getName();
        String newName = "";
        for (int i =0; i<name.length()-4; i++)
        {
            char c = name.charAt(i);
            if (c == '_')
            {
                newName = name.replace(""+name.charAt(i), "");
                String lettera = ""+name.charAt(i+1);
                name=name.replace(Character.toString(c) , lettera.toUpperCase());
                newName=name.replace(Character.toString(name.charAt(i)), "");
                String b =  Character.toString(name.charAt(i)).toUpperCase();
                newName=newName.replace(Character.toString(newName.charAt(i)), b);
            }
        }
         System.out.println(newName);
         File file2 = new File (newName);
         file.renameTo(file2);
   }
    
}
