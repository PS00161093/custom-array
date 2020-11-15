class TestClient {

    public static void main(String[] args) {

        int[] array = {2, 6, 9};
        MyArray myArray = new MyArray(3, array);
        System.out.println(myArray.toString());
    }
}

class MyArray {

    private int length;

    private int[] array;

    MyArray(int length, int[] array) {

        this.length = length;
        this.array = array;
    }

    public String toString() {

        return "Array is of length: " + this.length;
    }


}