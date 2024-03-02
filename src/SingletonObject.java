
public class SingletonObject {
	
	private  SingletonObject singletonObject;
	
	
	SingletonObject( SingletonObject singletonObject){
		this.singletonObject=singletonObject;
	}
	
	SingletonObject getSingletonObject(){
		return singletonObject;
	}

}
//select * from emp  order by salary desc limit 1,1;