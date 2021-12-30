
package p9;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
    
    private String id;

    private String pass;
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String execute(){
        if ((id.equals("nick"))&&(pass.equals("nick"))){
            return "success";
                
        }
        else{
            return "failure";
        }
    }
}
