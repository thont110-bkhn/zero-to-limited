package nguyentientho.java_8.lambda_expression;

import java.util.*;

public class MyLambda {
    public static void main(String[] args) {
        sortBefore8();
    }

    public static void sortBefore8 () {
        List<String> languageList = Arrays.asList("Java", "C#", "C++", "PHP", "Js");

        System.out.println("chưa sort" + languageList);

        // viết theo lớp ẩn danh
/*        Collections.sort(languageList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        // viết theo lambda
        Collections.sort(languageList, (String o1, String o2) -> o1.compareTo(o2));

        for (String language : languageList) {
            System.out.println("sau khi sort = " + language);
        }
    }


}
