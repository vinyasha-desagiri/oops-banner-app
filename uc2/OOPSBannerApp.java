
public class OOPSBannerApp {
public static void printBanner(String message,int width){
for (int i=0;i < width; i++)
System.out.print("*");
System.out.print();
system.out.println(message);
for (int i=0; i<width; i++)
System.out.print("*");
System.out.println();
}
public static void main(String[] args) {
printBanner("Welcome to UC2 Banner App",30);
}
}


