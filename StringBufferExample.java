class StringBufferExample
{
  public static void main(String[]args)
  {
    StringBuffer sb = new StringBuffer("hello");
    sb.replace(1,4,"java");
    System.out.println(sb);
   }
}