package fileOperation;

import java.util.Scanner;

public class FileManage {
    //	private String academicFile = "academic.txt";
//	private String personalFile = "person.txt.txt";
    Scanner cin =new Scanner(System.in);

    public String search(String reg)
    {

        SearchFile sf = new SearchFile("academic.txt");
        String result = sf.SearchInFile(reg);

        if(result != null)
        {
//			System.out.println("found!!!!!");
//			System.out.println(result);
            String temp ="";
            temp += result;

            sf = new SearchFile("person.txt.txt");
            result = sf.SearchInFile(reg);
            //System.out.println(result);
            temp += ";"+result;

            return temp;
        }

        else
        {
            //System.out.println("not found in the file");

            return null;
        }
    }

    public void replace(String file, String old, String newContent)
    {
        Replace rp = new Replace(file);
        rp.replace(old, newContent);
    }

    public void add()
    {
        System.out.println("enter academic informations in format- reg,session,semseter,year,cgpa,roll");
        String academic = cin.nextLine();
        String[] words = academic.split(",");

        String temp = search(words[0]);

        //System.out.println(st[0]);

        if(temp != null )
        {
            String[] st = temp.split(";");
            System.out.println("this registration number already exists");
            System.out.println("do you want to replace this ? (y/n)");

            char ans = cin.next().charAt(0);

            if(ans == 'y')
                replace("academic.txt",st[0], academic);
            else
            {
                System.out.println("ok");
            }
        }

        else
        {
            MyFileWriter mfw =new MyFileWriter("academic.txt");
            mfw.writeToFile(academic + "\n",true);

            System.out.println("enter personal informations in format- name,f-name,m-name,dob,nid,address,reg");
            String personal = cin.nextLine();

            mfw =new MyFileWriter("person.txt.txt");
            mfw.writeToFile(personal + "\n",true);

            System.out.println("append done!!!");
        }

    }

    public void printAcademicInfo(String content)
    {
        String [] words = content.split(",");
        System.out.println("registration number: "+ words[0]);
        System.out.println("session: "+ words[1]);
        System.out.println("semester: "+ words[2]);
        System.out.println("year: "+ words[3]);
        System.out.println("cgpa: "+ words[4]);
        System.out.println("class-roll: "+ words[5]);
        System.out.println("\n");

    }

    public void printPersonalInfo(String content)
    {
        String [] words = content.split(",");
        System.out.println("name: "+ words[0]);
        System.out.println("father's name: "+ words[1]);
        System.out.println("mother's name: "+ words[2]);
        System.out.println("date-of-birth: "+ words[3]);
        System.out.println("nid: "+ words[4]);
        System.out.println("address: "+ words[5]);
        System.out.println("\n");


    }



}
