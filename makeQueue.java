

public class makeQueue {

        int queue[] = new int[9];
        int size;
        int front;
        int rear;

        public void enQueue ( int data){
            queue[rear] = data;
            rear = rear++;    //moves it to the next number second to last
            size = size++;
        }
        public void show () {
            System.out.print("Elements  : ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[i] + " ");
            }

        }
    }
