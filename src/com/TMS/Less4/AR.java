package com.TMS.Less4;

import java.util.Arrays;

public class AR {
    private int[] AR;

    public AR(int[] AR) {
        this.AR = AR;
        System.out.println(SearchMin());
    }
    private int SearchMin () {
        int min = AR[0];
        for (int i = 0; i < AR.length; i++) {
            if (AR[i] < min)
                min = AR[i];
        }
        return min;
    }

        public int SearchMax (){
            int max = AR[0];
            for(int i = 0; i < AR.length; i++) {
                if(AR[i] > max)
                    max = AR[i];
            }
            return max;

    }
      public void sort (){
        int temp;
        boolean flag = true;
          while (flag) {
              flag=false;
              for(int i = 0; i < AR.length-1; i++) {
                  if (AR[i]>AR [i+1]){
                      temp = AR[i];
                      AR[i]=AR[i+1];
                      AR[i+1]=temp;
                      flag=true;
                  }
          }
          }

    }

    public void search (int a){
        int id = 0;
        for (int i = 0; i < AR.length; i++){
            if (AR[i] == a) {
               id = i;
            }

        }
        System.out.println(id);
    }


    @Override
    public String toString() {
        return "AR{" +
                "AR=" + Arrays.toString(AR) +
                '}';
    }


}
