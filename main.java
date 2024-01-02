class HelloWorld {
    public static void main(String[] args) {
      char ch='7';
      if(ch>=65&&ch<=90||ch>=97&&ch<=122)
      {
      if(ch>=65&&ch<=90)
      {
          System.out.println("it is an upper case");
          
      }
      else
      {
          System.out.println("it is an lower case");
      }
    }
    else
    {
        if(ch>=49&&ch<=57)
        {
              System.out.println("it is an number");
        }
        else
        {
             System.out.println("it is an symbol");
        }
    }
}
}
