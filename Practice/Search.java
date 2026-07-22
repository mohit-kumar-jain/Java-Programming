import java.util.Scanner;
class Search
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++ ){
            int num = sc.nextInt();
            if(search == num){
                found = true;
                break;
            }
        } 
        if(found){
            System.out.println("YES");
	    }else{
            System.out.println("NO");
	    }
        sc.close();
	}
}