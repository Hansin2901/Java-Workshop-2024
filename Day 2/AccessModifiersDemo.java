class AccessModifiers {
    public String publicVariable = "Public";
    protected String protectedVariable = "Protected";
    String defaultVariable = "Default";
    private String privateVariable = "Private";
    
    public void showAccess() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicVariable);   // Accessible
        System.out.println(obj.protectedVariable); // Accessible
        System.out.println(obj.defaultVariable);   // Accessible
        // System.out.println(obj.privateVariable); // Not Accessible
        obj.showAccess();
    }
}
