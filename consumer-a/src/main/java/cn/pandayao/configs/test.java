package cn.pandayao.configs;

public class test {
    public static void main(String[] args) {
        String s1 = "ddefgac";
        String s2 = "defgae";
        int a[][] = new int[s1.length()][s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        a[i][j] = 1;
                    } else {
                        a[i][j] = a[i - 1][j - 1] + 1;
                    }
                } else {
                    a[i][j] = 0;
                }

            }
        }
        int end=0;
        int length=a[0][0];
        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {
                if(length<a[i][j]){
                    length=a[i][j];
                    end=i+1;
                }

            }
        }
        System.out.println("公共最长子串:"+s1.substring(end-length,length));

    }


}



