public class wrapper_class_part2 {
    public static void main(String[] args) {
        String ii="12";
        String ff="12.7f";
        String ss="1";
        String bb="false";
        String bb1="33";
        //String ss1="sd";
        String ll="127";
        String dd="12.977d";

        int v1=Integer.parseInt(ii);
        System.out.println(v1);

        float v2=Float.parseFloat(ff);
        System.out.println(v2);

        short v3=Short.parseShort(ss);
        System.out.println(v3);

        boolean v4=Boolean.parseBoolean(bb);
        System.out.println(v4);

        byte v5=Byte.parseByte(bb1);
        System.out.println(v5);

      //  String v6=String.praseString

      long v6=Long.parseLong(ll);
      System.out.println(v6);

      double v7=Double.parseDouble(dd);
      System.out.println(v7);



    }
}
