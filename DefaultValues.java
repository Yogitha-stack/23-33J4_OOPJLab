class DefaultValues {
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + obj.defaultByte);
        System.out.println("short: " + obj.defaultShort);
        System.out.println("int: " + obj.defaultInt);
        System.out.println("long: " + obj.defaultLong);
        System.out.println("float: " + obj.defaultFloat);
        System.out.println("double: " + obj.defaultDouble);
        System.out.println("char: [" + obj.defaultChar + "]");
        System.out.println("boolean: " + obj.defaultBoolean);
    }
}
