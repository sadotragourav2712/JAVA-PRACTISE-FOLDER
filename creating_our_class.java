class Student{
      int roll;
     String name;
    public void printdetails(){
        System.out.println("The roll is " + roll + " and name of Student is " + name);
    }

}
class creating_our_class{
    public static void main(String[] args){
        Student  s= new Student();
        s.roll=21053396;
        s.name="Gourav Sadotra";
        //System.out.println("The roll number of the student is " + s.roll +"and the name of the student is " +s.name);
        s.printdetails();
    }
}