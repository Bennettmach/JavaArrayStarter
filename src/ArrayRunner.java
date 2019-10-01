public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);
        Student[] myClass = new Student[6];
        Student studentA = new Student("Isabelle","April","Pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia","October","Purple");
        myClass[0] = studentB;

        for (int i=0; i<4; i++)
        {
            System.out.println(myClass[i]);
        }
    }
}
