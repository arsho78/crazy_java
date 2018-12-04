package net.xiaoluo.crazyit.crazyjava.annotations;

@FkTag(age = 5)
@FkTag(name = "Xiao", age = 10)
public class FkTagTest {
    public static void main(String[] args) {
        FkTag[] tags = FkTagTest.class.getAnnotationsByType(FkTag.class);
        for (FkTag tag : tags) {
            System.out.println("name is " + tag.name() + ", " + "age is " + tag.age());
        }
    }
}
