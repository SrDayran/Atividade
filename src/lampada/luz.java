/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author darai
 */
public class luz {
    private boolean estado;
    
    public luz(){
        estado=false;
    }
    public String getestado(){
        if(estado){
            return "ACESSA";
        }else{
                return "APAGADA";
                }
    }
    public void mudarestado(){
        this.estado=!this.estado;
    }
}



