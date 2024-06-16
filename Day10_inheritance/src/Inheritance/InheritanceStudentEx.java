/*package Inheritance;

public class InheritanceStudentEx {
      public static void main(String[] args) {
    	  Student sde1 = new Student();
    	  sde1.name = "강민준";
    	  sde1.ban = 1;
    	  sde1.num = 1;
    	  
    	  System.out.println("이름: " + sde1.name + "\n반: " + sde1.ban + "\n번호: " + sde1.name);
      }
}

class Student {
	
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	
	Student(){
		
	}//조상클래스에 기본생성자가 있어야 오류가 안난다.
	
	Student(String name, int ban, int num){
		this.name = name;
		this.ban = ban;
		this.num = num;
	}
	
	int getLocation() {
		return kor + eng + math;
	}
	
}

class StudentEx extends Student {
	
	int java;
	
	StudentEx(String name, int ban, int num, int kor, int eng, int math, int java){
		super(name,ban,num,kor,eng,math);
		this.java = java;
	}
	
    StudentEx(String name, int ban, int num){
    	this(name, ban, num, -1, -1, -1, -1);
    }
    
	void setJava(int java) {
		this.java = java;
	}
	
	int getJava() {
		return java;
	}
	
	@Override
	int getTotal(){
		return super.getTotal() + getJava();
	}
	
	@Override
	int getAverage(){
		
		float avg = getTotal()/0.4f;
		avg = ((int)((avg+0.05)*10)/10f;
		return avg;
	}
  

}*/

