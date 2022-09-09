class Hello {
    public static void main(String[] args) {
        System.out.println("Hey!");

        if (args.length == 0) {
            return;
        }

        for(int i = 0; i < args.length; i++) {
            String message = String.format("  - args %d = %s", i, args[i]);
            System.out.println(message);
        }
    }
}