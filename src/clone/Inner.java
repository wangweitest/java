package clone;

import java.io.Serializable;

public class Inner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override  
    public Object clone() {  
		Inner inner = null;  
        try{  
        	inner = (Inner)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return inner;  
    }  
	
	
}
