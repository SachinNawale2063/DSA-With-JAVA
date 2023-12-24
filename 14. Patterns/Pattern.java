public class Pattern {

    public static void main(String[] args) {

        System.out.println("First Pattern: ");
        pattern1(5);
        
        System.out.println("Second Pattern: ");
        pattern2(5);
        
        System.out.println("Third Pattern: ");
        pattern3(5);

        System.out.println("Fourth Pattern: ");
        pattern4(5);

        System.out.println("Fifth Pattern: ");
        pattern5(5);

        System.out.println("Sixth Pattern: ");
        pattern6(5);

        System.out.println("Seventh Pattern: ");
        pattern7(5);

        System.out.println("Eighth Pattern: ");
        pattern8(5);

        System.out.println("Ninth Pattern: ");
        pattern9(5);

        System.out.println("Tenth Pattern: ");
        pattern10(5);

        System.out.println("Eleventh Pattern: ");
        pattern11(5);

        System.out.println("Twelth Pattern: ");
        pattern12(5);
    }

    static void pattern12(int n){
        int originalN = n;
        n = 2 * n;
       for(int row = 0; row <= n; row++){
            for(int col = 0; col<= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
       }
    }
    static void pattern11(int n){
        n = 2 * n;
       for(int row = 0; row <= n; row++){
            for(int col = 0; col<= n; col++){
                int atEveryIndex = Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
       }
    }

    static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            int spaces = n - row;
            for(int s = 1; s<=spaces; s++){
                System.out.print("  ");
            }
            for(int col = row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = 0; i < 2 *n; i++){
            int totalcolumnsinrow = i > n ? 2*n-i : i;
            int numberofspaces = n - totalcolumnsinrow;

            for(int s = 0; s < numberofspaces; s++){
                System.out.print(" ");
            }

            for(int col = 1; col<=totalcolumnsinrow; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i = 0; i < 2 *n; i++){
            int totalcolumnsinrow = i > n ? 2*n-i : i;
            int numberofspaces = n - totalcolumnsinrow;

            for(int s = 0; s < numberofspaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col<totalcolumnsinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=0; i<2*n; i++){
            int totalcolumnsinrow = i > n ? 2*n-i : i;
            for(int col = 0; col<totalcolumnsinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
            ch = 'A';
        }
    }

    static void pattern5(int n){
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = n-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");               
            }
            System.out.println();
        }
    }
}