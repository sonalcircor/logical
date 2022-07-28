
    public class logical {
        public static void main(String[] args) {
            long S=100053;
            float Y= 100.25f;
            System.out.println(S>Y && S<Y);
            System.out.println(S<Y || S>Y);
            System.out.println(!(!(S>Y || S<Y)));
            System.out.println(!(!(S>Y)));
        }
    }

