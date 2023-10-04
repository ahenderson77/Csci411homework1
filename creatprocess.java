import java.io.*;
import java.util.*;

public class creatprocess{
    public static void main(String args[]){
        try{
            int x;
            String[] com = {"dir","ls","cd","pwd","copy", "cp","del","rm","more","more","help","man","notepad","nano","find","grep","ver","uname","date","date","where","which","set","env","whoami","whoami","ipconfig","ifconfig","exit","exit" };
            //print
            System.out.print(">");
            //read command
            Scanner input = new Scanner(System.in);
            String command = input.nextLine();
            
            for(x=0;x<com.length;x++){
                if(command.equalsIgnoreCase(com[x])){
                    x=x/2;
                    break;
                }
            }

            //switch case
            switch (x) {
                case 0:
                    ProcessBuilder pb0 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process0 = pb0.start();
                    Scanner input0 = new Scanner(process0.getInputStream());
                    while(input0.hasNext()){
                        System.out.println(input0.nextLine());
                    }
                    process0.waitFor();
                    break;
                case 1:
                    ProcessBuilder pb1 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process1 = pb1.start();
                    Scanner input1 = new Scanner(process1.getInputStream());
                    while(input1.hasNext()){
                        System.out.println(input1.nextLine());
                    }
                    process1.waitFor();
                    break;
                case 2:
                    ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process2 = pb2.start();
                    Scanner input2 = new Scanner(process2.getInputStream());
                    while(input2.hasNext()){
                        System.out.println(input2.nextLine());
                    }
                    process2.waitFor();
                    break;
                case 3:
                    ProcessBuilder pb3 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process3 = pb3.start();
                    Scanner input3 = new Scanner(process3.getInputStream());
                    while(input3.hasNext()){
                        System.out.println(input3.nextLine());
                    }
                    process3.waitFor();
                    break;
                case 4:
                    ProcessBuilder pb4 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process4 = pb4.start();
                    Scanner input4 = new Scanner(process4.getInputStream());
                    while(input4.hasNext()){
                        System.out.println(input4.nextLine());
                    }
                    process4.waitFor();
                    break;
                case 5:
                    ProcessBuilder pb5 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process5 = pb5.start();
                    Scanner input5 = new Scanner(process5.getInputStream());
                    while(input5.hasNext()){
                        System.out.println(input5.nextLine());
                    }
                    process5.waitFor();
                    break;
                case 6:
                    ProcessBuilder pb6 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process6 = pb6.start();
                    Scanner input6 = new Scanner(process6.getInputStream());
                    while(input6.hasNext()){
                        System.out.println(input6.nextLine());
                    }
                    process6.waitFor();
                    break;
                case 7:
                    ProcessBuilder pb7 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process7 = pb7.start();
                    Scanner input7 = new Scanner(process7.getInputStream());
                    while(input7.hasNext()){
                        System.out.println(input7.nextLine());
                    }
                    process7.waitFor();
                    break;
                case 8: 
                    ProcessBuilder pb8 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process8 = pb8.start();
                    Scanner input8 = new Scanner(process8.getInputStream());
                    while(input8.hasNext()){
                        System.out.println(input8.nextLine());
                    }
                    process8.waitFor();
                    break;
                case 9:
                    ProcessBuilder pb9 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process9 = pb9.start();
                    Scanner input9 = new Scanner(process9.getInputStream());
                    while(input9.hasNext()){
                        System.out.println(input9.nextLine());
                    }
                    process9.waitFor();
                    break;
                case 10:
                    ProcessBuilder pb10 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process10 = pb10.start();
                    Scanner input10 = new Scanner(process10.getInputStream());
                    while(input10.hasNext()){
                        System.out.println(input10.nextLine());
                    }
                    process10.waitFor();
                    break;
                case 11:
                    ProcessBuilder pb11 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process11 = pb11.start();
                    Scanner input11 = new Scanner(process11.getInputStream());
                    while(input11.hasNext()){
                        System.out.println(input11.nextLine());
                    }
                    process11.waitFor();
                    break;
                case 12:
                    ProcessBuilder pb12 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process12 = pb12.start();
                    Scanner input12 = new Scanner(process12.getInputStream());
                    while(input12.hasNext()){
                        System.out.println(input12.nextLine());
                    }
                    process12.waitFor();
                    break;
                case 13:
                    ProcessBuilder pb13 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process13 = pb13.start();
                    Scanner input13 = new Scanner(process13.getInputStream());
                    while(input13.hasNext()){
                        System.out.println(input13.nextLine());
                    }
                    process13.waitFor();
                    break;
                case 14:
                    ProcessBuilder pb14 = new ProcessBuilder("cmd", "/c", com[x]);
                    Process process14 = pb14.start();
                    Scanner input14 = new Scanner(process14.getInputStream());
                    while(input14.hasNext()){
                        System.out.println(input14.nextLine());
                    }
                    process14.waitFor();
                    break;
            
                default:
                System.out.println("Command not found");
                    break;
            }

            ProcessBuilder pb = new ProcessBuilder(command);
            Process process = pb.start();
            
            //get input
            Scanner input2 = new Scanner(process.getInputStream());
            //display input
            while(input2.hasNext()){
                System.out.println(input2.nextLine());
            }
            //wait 
            process.waitFor();

        } catch(Exception err){
            err.printStackTrace();
        } 
        
    }
}