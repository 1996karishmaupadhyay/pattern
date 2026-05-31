public class StarPattern {
    public static void main(String[] args) {
        int n = 5;

        // 1.square stars pattern
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // for(int i=0;i<n;i++){
        // for(int c=0;c<n;c++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // 2. hollow square star pattern
        // * * * * *
        // * *
        // * *
        // * *
        // * * * * *
        // for(int r=0;r<n;r++){
        // for(int c=0;c<n;c++){
        // if(r==0||r==n-1||c==0||c==n-1){
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 3. downward right angle triangle star pattern
        // * * * *
        // * * *
        // * *
        // *
        //
        // for(int r=n;r>0;r--){
        // for(int c=0;c<r;c++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // 4. upward right angle triangle star pattern
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // for(int r=0;r<=n;r++){
        // for(int c=0;c<r;c++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // 5. downward left right angle hollow triangle star pattern
        // * * * *
        // * *
        // * *
        // *
        // for(int r=0;r<n;r++){
        // for(int c=0;c<n;c++){
        // if(r==0||c==0||c==n-r-1){
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }


        // 6. upward left right angle hollow triangle star pattern
        // *
        // * *
        // *   *
        // * * * *
        // for (int r = 0; r < n; r++) {
        //     for (int c = 0; c < r; c++) {

        //         if (r == 0 || r == n - 1 || c == 0 || c == r - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 7. pyramid star pattern
         //     *
        //    * * *
       //   * * * * *
      //  * * * * * * *
     // * * * * * * * * *
        // for(int r=1;r<=n;r++){
        //     for(int c=0;c<n-r+1;c++){
        //         System.out.print("- ");
        //     }
        //     for(int c=0;c<2*r-1;c++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


// 8. diamond star pattern

                //     *
               //    * * *
              //   * * * * *
             //  * * * * * * *
            // * * * * * * * * *
             //  * * * * * * *
              //   * * * * *
               //    * * *
                //     *
         for(int r=1;r<=n;r++){
            for(int c=0;c<n-r;c++){
                System.out.print("- ");
            }
            for(int c=0;c<2*r-1;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int r=n-1;r>0;r--){
            for(int c=0;c<n-r;c++){
                System.out.print("- ");
            }
            for(int c=0;c<2*r-1;c++){
                System.out.print("* ");
            }
            System.out.println();
        }





        //   for(int r=1;r<=n;r++){
        //     for(int c=1;c<n-r+1;c++){
        //         System.out.print(c+" ");
        //     }
        //     for(int c=1;c<=2*r-1;c++){
        //         if(c==1||c==2*r-1){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print(c+" ");
        //         }

        //     }
        //     System.out.println();
        // }
        // for(int r=n-1;r>0;r--){
        //     for(int c=0;c<n-r;c++){
        //         System.out.print("- ");
        //     }
        //     for(int c=0;c<2*r-1;c++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




    }
}
