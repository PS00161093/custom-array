package src;

import java.util.Arrays;

class TestClient {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(3);

        System.out.println(myArray.toString());

        myArray.push(1); myArray.push(7); myArray.push(9);

        System.out.println(myArray.toString());

        myArray.pop();

        System.out.println(myArray.toString());

    }
}

class MyArray {

    private int length;

    private int[] array;

    MyArray(int length) {

        this.length = length;
        this.array = new int[length];
    }

    public String toString() {

        return Arrays.toString(this.array);
    }

    public void push(int element){

        for(int i = 0; i < this.length; i++){

            if(this.array[i] == 0 && element != 0){
                this.array[i] = element;
                break;
            }
        }
    }

    public void pop(){

        this.array[this.length - 1] = 0;
    }

}