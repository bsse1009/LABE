package fileOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        FileManage obj =new FileManage();

        System.out.println("Wlcome");

        while(true)
        {
            System.out.println("What do you want to do ?\n1. Search\n2. add");

            Scanner input =new Scanner(System.in);
            int choice = input.nextInt();

            if(choice == 1)
            {
                System.out.print("enter a registration number you are looking for: ");
                String reg = input.nextLine();
                reg = input.nextLine();

                String result = obj.search(reg);

                if(result != null)
                {
                    String[] lines = result.split(";");
                    System.out.println("found!!!!!!!!!!");
                    obj.printPersonalInfo(lines[1]);
                    obj.printAcademicInfo(lines[0]);
                }

                else
                    System.out.println("not found");
            }

            if(choice == 2)
            {
                obj.add();
            }
        }

    }

}