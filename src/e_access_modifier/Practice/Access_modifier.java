package e_access_modifier.Practice;


   class A{
        public int data=40;
        void msg(){System.out.println("Hello java");}

    }
    public  class Access_modifier{
        public static void main(String[] args) {
            A obj=new A();
            System.out.println(obj.data);
            obj.msg();
        }
    }


