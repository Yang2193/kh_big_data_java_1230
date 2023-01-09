package 참조타입확인;
// 참조 변수의 == (같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        String name1 = "로부테";
        String name2 = "로부테";
        String name3 = new String("로부테");
        
        if(name1 == name3) { //내부적으로 이름이 담겨있는 메모리 공간, 위치가 다르기 때문에 다르다고 나옴.
            // == 은 내용을 묻는 것이 아니라 주소를 물어보는 것.
            // 근데 name1 == name2 는 같다고 나옴.
            // 실제 메모리 주소가 같기 때문. 프로그램을 시작할 때 로부테라는 이름 자체가 프로그램에서 static 메모리의 어떤 주소값에 저장되어있다.
            System.out.println("두 개의 이름에 대한 참조가 같음. Declared, Indomitus Crusade");
        } else {
            System.out.println("두 개의 이름에 대한 참조가 다름.");
        }
        
        if (name1.equals(name3)){ // name1.equalsIgnoreCase(name3) 실제 값을 물어보려면 이거 두 개로 물어봐야함.
            System.out.println("두 개의 이름의 내용이 같음.");
    
        } else{
            System.out.println("두 개의 이름의 내용이 다름.");
        }
        
        
        
     /*   int x = 0;
        String str = null; // 참조하고 있는 값이 없다는 뜻에서 null; 을 넣어준다. // 참조타입의 변수가 객체를 참조하지 않는다는 의미.
        int[] intArray = null; // int지만 int로 구성된 여러가지 요소들이 한번에 있기 때문에 null;로 참조하고 있는 것이 없다는 것을 넣어준다.
        // int k = 0; 같은 초기화하는 것이랑 비슷.
        Integer val = null; // int형에 대한 참조타입이기 때문에 값을 가질 수가 없지만
        // Integer val = 0; 이런 식으로 값을 가질 수 있다. 박싱/언박싱이라는 개념이 있어서 알아서 참조값을 바꾼다.\
        int val2 = val; // NullPointerException이 발생 참조하려고 가리키는 곳에 아무것도 없기 때문에 이런 에러가 뜸.

        System.out.println(val2);*/
    }
}
