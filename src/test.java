public class test {
    private static ClassNameExample classNameExample;
    private static final String validName = "C0318G";
    private static final String[] invalidName = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        boolean isvalid = classNameExample.validate(validName);
        System.out.println("Class Name: "+validName+" is valid: "+isvalid);
        for(String className : invalidName ){
            boolean invalid = classNameExample.validate(className);
            System.out.println("Class Name: "+ invalid+" is valid: "+invalid);
        }
    }
}
