public class FirstClass {
    // to create git repo -> git init
    // to track files by git -> git add "filename" or git add -u or git add .
    // to make commit -> git commit -m "your message"
    // to see commit history -> git log
    // to go to other commit -> git checkout "commit hash"
    // to create new branch -> git checkout -b "branch name"
    // to switch to exiting branch -> git checkout "branch name"
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SecondClass secondClass = new SecondClass();
        secondClass.sayHello("Andriy");
    }
}
