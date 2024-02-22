class Sapin{
    public static void main(String[] args){
        int n = 16;
        int taille_racine = 7;

        // affichage des feuilles
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < n - i ; j++ ){
                System.out.print(" ");
            }
            
            for(int k = 1 ; k <= 2*i-1 ; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // affichage du tronc
        for(int l = 1 ; l < n/2 ; l++){
            for (int m = 0 ; m < n-1 ; m ++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        if (taille_racine%2 == 0) {
            for(int h=1;h<=n-taille_racine/2;h++){
                System.out.print(' ');
            }
            for(int t=1; t<=taille_racine;t++){
                System.out.print("*");
            }
        }else{
            for(int h=1;h<=n-1-taille_racine/2;h++){
                System.out.print(' ');
            }
            for(int t=1; t<=taille_racine;t++){
                System.out.print("*");
            }
        }
        System.err.println();
    }
}