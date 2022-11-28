import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B_AtillasFavoriteProblem {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader s = new FastReader();

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            int m = s.nextInt();

            String Text = s.nextLine();

            char[] Array = Text.toCharArray();

            System.out.println(MinimumSize(m, Array));
        }


    }

    public static int MinimumSize(int m, char[] Array){

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int Mini = 0;

        for(int i = 0; i < m; i++){

            for(int j = 0; j < alphabet.length; j++){

                if(Array[i] == alphabet[j]){

                    if(Mini < (j + 1)){
                        Mini = j + 1;
                    }
                }
            }



        }

        return Mini;
    }


}
