class cat {
    String name;
    cat(String name){
        this.name=name;
    }


    static void catsounds(){
        System.out.println("Meeoooowww");
    }


}

public class staticMethod {
    public static void main(String[] args) {


        cat.catsounds();


    }

}