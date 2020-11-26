package ServantDesignPattern;

//Client客户端场景
   public  class Client{
        public static void main(String[] args){
            Cleaner cleaner = new Cleaner();
            cleaner.clean(new Runway());
            cleaner.clean(new Lawn());
        }
    }

