package session6.practice;

public class User {

    private String name;
    private String age;

    //alt+ insert
   public String setName(String name){
       this.name = name;
       return this.name;
   }

   public void getName(){
       System.out.println(name);
   }

}
