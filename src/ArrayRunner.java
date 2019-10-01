public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);
        Student[] myClass = new Student[12];
        Student studentA = new Student("Isabelle","April","Pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia","October","Purple");
        myClass[0] = studentB;

        for (int i=0; i<4; i++)
        {
            System.out.println(myClass[i]);
        }

        String[] names = {"Michael","Bryan","Duncan","Bennett","Martin",
                "Jessica","Lexy","Zoe","Jimmy","Sanjit","Andrew","Will"};

        System.out.println("There are "+names.length+" names on the list.");
        names[11] = "Mr. Howe";

        String[] months = {"February","October","March","September","July","February","November","December","August","May","September","December"};
        String[] colors = {"Green","Fuchsia","Purple","Turquoise","Cyan","Purple","Pink","Indigo","green","blue","green","Space black"};

        for (int i=0; i<12; i++)
        {
            myClass[i] = new Student(names[i],months[i],colors[i]);
        }
        System.out.println("Print out the students!");

        for (Student s: myClass)
        {
            if (s.getName().equals("Martin"))
            {
                System.out.print("*****");
            }
            System.out.println(s);
        }
    }
}
