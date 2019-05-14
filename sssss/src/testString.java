







public class testString {

    public static void main(String[] args) {
        char array[] = {'a', 'b', '#', '1', '2', '#', '4', '5', '3'};
        char arr = '#';
        char ret[][];
        ret = split(array, arr);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] split(char s[], char run) {
        char ptr[][] = new char[10][10];
        int i;
        int j = 0;
        int k=0;
        for (i = 0; i < s.length; i++) {
            if(s[i]!=run) {
                for ( k = i; k < s.length; k++) {
                    if (s[k] != run) {
                        ptr[i][k] = s[k];
                    }
                    if (s[k] == run) {
                        break;
                    }
                }

                if (s[i] == run) {
                    ptr[i][0] = run;
                }
            }
        }

        return ptr;
    }
}


