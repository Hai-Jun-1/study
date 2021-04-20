package pet;

public class Studnet2 {

        int classNo;
        String name;
        int age;

        public Studnet2(int classNo, String name, int age) {
            this.classNo = classNo;
            this.name = name;
            this.age = age;
        }
        public void xiangdeng(Studnet1 studnet1){
            if (this.name.equals(studnet1.name)&&this.age==studnet1.age){
                System.out.println("是一样的两个对象");
            }else{
                System.out.println("不是一样的两个对象");
            }
        }


//        public static void main(String[] args) {
//            Student s1 =new Student(10606,"美女",28);
//            Student s2 =new Student(10606,"美女",24);
//
//            if((s1.id== s2.id)&&(s1.name.equals(s2.name))){
//                System.out.println("两名学员为统一对象");
//            }else{
//                System.out.println("两名学员不是同一对象");
//            }
//        }
    }

