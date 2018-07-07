package clone;


class Student implements Cloneable{  
    private int number;  
  
    public int getNumber() {  
        return number;  
    }  
  
    public void setNumber(int number) {  
        this.number = number;  
    }  
      
    private Inner inner = new Inner();
    
    
    public Inner getInner() {
		return inner;
	}

	public void setInner(Inner inner) {
		this.inner = inner;
	}

	@Override  
    public Object clone() {  
        Student stu = null;  
        try{  
            stu = (Student)super.clone();  //
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        
       // stu.inner = (Inner)inner.clone();   //深度复制  
        return stu;  
    }  
}  