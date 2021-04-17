
import java.math.BigInteger;
import java.security.MessageDigest;
import static jdk.nashorn.internal.objects.Global.print;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Usuario {
	
    private String user;
    private String senha;
    String sha1="";
    String print="";
      

    public Usuario() {
    }

    public Usuario(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    
    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    
    public String senhasha1(){
    
         try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(senha.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
                print = sha1;
		} catch (Exception e){
			e.printStackTrace();
		}
        return print;
}
    
    
    @Override
    public String toString() {
        
     //   return "Usuario{" + "user=" + user + ", senha=" + senhasha1()  + '}';
    return "Usuario{" + "user=" + user + '}';
   
    }


    
}
