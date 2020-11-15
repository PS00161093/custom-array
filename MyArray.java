class MyArray {

    private length ;

    private int[]  array;

    public MyArray(int length, int[] array){

        this.length = length;
        this.array = array

    }

}

class TestClient{

    public static void main(String[] args) {

        MyArray myArray = new MyArray(3, {7,1,0});

    }
}