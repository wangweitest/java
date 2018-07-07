package clone;


/**
 * https://www.cnblogs.com/Qian123/p/5710533.html#_label0
 * @author Administrator
 *
 */
public class Test {  
	
	@org.junit.Test
    public void test01() {  
    	
        Student stu1 = new Student();  
        stu1.setNumber(12345);  
        Student stu2 = (Student)stu1.clone();  
          
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber());  
          
        stu2.setNumber(54321);  
      
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber());  
        
        
        System.out.println(stu1.getInner() == stu2.getInner());   //true
        
    }  
    
    @org.junit.Test
    public void test02(){
    	
    	Outer outer = new Outer();
    	Outer outer2 = outer.myclone();
    	
    	System.out.println(outer.getInner() == outer2.getInner());
    }
    
    
}  