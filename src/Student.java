public class Student
{
    private String name;
    private String birthMonth;
    private String favoriteColor;

    public Student(String n, String bm, String fc)
    {
        this.name = n;
        this.birthMonth = bm;
        this.favoriteColor = fc;
    }


    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthMonth='" + birthMonth + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}