class Student
{
    private int id;
    public void setid(int id)
    {
    this.id=id;
    }
    public int getid(){
        return id;
    }
    public static void main(String[] args){
    Student s1=new Student();
    s1.setid(20);
    System.out.println(s1.getid());
}
}
