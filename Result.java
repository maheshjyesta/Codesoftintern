import java.util.Scanner;
class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of subjects:");
        int No_of_subjects=sc.nextInt();
        int sum=0,average=0;
        int marks[]=new int[No_of_subjects];
        System.out.println("enter marks obtained in each subject(out of 100)");
        for(int i=0;i<No_of_subjects;i++){
            System.out.print("enter Subject"+(i+1)+" marks:");
           marks[i]=sc.nextInt();
           sum+=marks[i];
        }
        average=(int)(sum/No_of_subjects);
        System.out.println("Total marks="+sum);
        System.out.println("Average ="+average);
        if(average>=90)System.out.println("Garde =A+ ");
        else if(average>=80)System.out.println("Garde =A ");
        else if(average>=70)System.out.println("Garde =B+ ");
        else if(average>=60)System.out.println("Garde =B ");
        else if(average>=50)System.out.println("Garde =C ");
        else if(average>=40)System.out.println("Garde =D ");
        else System.out.println("Fail");
    }
}
