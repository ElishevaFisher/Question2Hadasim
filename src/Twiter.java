import java.util.Scanner;

public class Twiter {

    public static void main(String[] args)
    {
        Scanner scan=null;
        try {
             scan = new Scanner(System.in); 
        } catch (Exception e) {
            System.out.println("Error");
        } 
        System.out.println("הקש 1- בניית מגדל מלבן או 2- בניית מגדל משולש בשביל להמשיך בתוכנית, יציאה מהתוכנית הקש 3");
        int choice=scan.nextInt();
        if(choice==3){
            exit();
        }
        while(choice!=3){
            
            System.out.println("הקש גובה ורוחב של המגדל");
            double height=scan.nextDouble();
            double weight=scan.nextDouble();
            if(choice==1){
                if(Math.abs(height-weight)>5||height==weight){
                    System.out.println("שטח המלבן:"+(height*weight));
                }
                else{
                    System.out.println("היקף המלבן:"+((height*2)+(weight*2)));
                }
            }
            else{
                System.out.println("הקש 1 עבור הדפסת היקף המשולש ו2 עבור הדפסת המשולש");
                int triangleChoice=scan.nextInt();
                if(triangleChoice==1){
                    double side= Math.sqrt(Math.pow(height,2)+Math.pow(weight/2,2));
                    double perimeter=side*2+weight;
                    System.out.println("היקף המשולש הוא"+perimeter);
                }
                else{
                    if(weight%2==0||weight>height*2){
                        System.out.println("שגיאה, אין אפשרות להדפיס את המשולש");
                    }
                    else{
                    	int i;
                    	for(i=0;i<(weight-1)/2;i++) {
                    		System.out.print(" ");
                    	}
                        System.out.println("*");
                        int num=((int)Math.floor(weight/2))-1;//כמה שורות יהיה מכל רוחב
                        int row=(int)(height-2)/num;//כמה שורות יש
                        int firstRow=(int)(height-2)%num;
                        String c="***";
                        for(i=0;i<(firstRow+row);i++){
                        	for(int w=0;w<((weight-3)/2);w++) {
                        		System.out.print(" ");
                            }
                            System.out.println(c);
                        }
                        c="";
                        
                        for(i=5;i<weight;i+=2){
                            for(int j=0;j<i;j++){
                                c+="*";
                            }
                            for(int k=0;k<row;k++){
                            	for(int w=0;w<((weight-i)/2);w++) {
                            		System.out.print(" ");
                                }
                                System.out.println(c);
                            }
                            c="";
                        }
                        c="";
                        for(i=0;i<weight;i++){
                            c+="*";
                        }
                        System.out.println(c);
                    }
                }
            }
            System.out.println("הקש 1- בניית מגדל מלבן או 2- בניית מגדל משולש בשביל להמשיך בתוכנית, יציאה מהתוכנית הקש 3");
            choice=scan.nextInt();
        }
       exit();
        
    }
    public static void exit() {
        System.out.println("Exiting program...");
        System.exit(0);
    }
}
