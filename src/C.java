public class C extends B{
    //super cağırımı constructordan sonra ilk başta yazılır!!
    //B sınıfı C sınıfına göre ana sınıf olduğu için C sınıfın oluşması için öncelikle B Sınıfı oluşacak
    //daha sonra C sınıfı oluşacak.
    public  C(String text){
        super(text);
        System.out.println("constructor C");
    }
}
