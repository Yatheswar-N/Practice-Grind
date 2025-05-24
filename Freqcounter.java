package Others;

import java.util.HashMap;

public class Freqcounter {
    public static void main(String[] args) {
        String s="zkjsbdfiuAkfbsydgfchvfadosuvguisdhcknbiuzdcfaoisdk[papkmfcklagefouhqwdkawpkdlwamnfciahjdclkanukbzcskjbcsjbsuqwertyuioasdfghjklzxcvbnmqwsxcrfgvbyhjmoklpoikjhguygfctrdsesqytfijhpokmoijhgvytfdrdswertyuioplkjhgfdsazxcvbnmnbvcxzsdfghjklpoiuytrewqasdfgh";

//        char[] arr=a.toCharArray();
//        for (int i=0;i<arr.length;i++){
//            int c=1;
//            if(arr[i]=='*'){
//                continue;
//            }
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j] && arr[j]!='*'){
//                    c++;
//                    arr[j]='*';
//                }
//
//            }
//            System.out.print(arr[i]);
//            System.out.print("-");
//            System.out.println(c);
//        }
        String a="Heams";
        HashMap<Character, Integer> map=new HashMap<>();
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
//            map.put(c,map.getOrDefault(c,0)+1);
            hm.put(c,i);
        }
//        10%3=1
//                123456789,10
//                100%3=1
//                        1->1->10->100
//        for(char c: map.keySet()){
//            System.out.print(c);
//            System.out.print("-");
//            System.out.println(map.get(c));
//        }
        for(char c: hm.keySet()){
            System.out.println(c +"-"+hm.get(c));

        }

    }
}
