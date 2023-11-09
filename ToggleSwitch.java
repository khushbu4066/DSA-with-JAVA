public class ToggleSwitch {
    
    public static void main(String args[], int n){

        boolean[] b;
        for(int i = 0; i<=n+1; i++){
            b[i] = true;
        }
        for(int i = 2; i<=n+1; i++){
            b[i] = false;
        }
        for(int i = 3; i<=n+1; i++){
            for(int j=0; j<=n+1; j++){
                if (b[i] =true);
                b[i] = false;
            }
        }
    }
    
}
